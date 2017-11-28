/*
  ThroughputLimitInputStream.java / MiniCopier
  Copyright (C) 2007-2009 Adrian Courrèges

  This program is free software; you can redistribute it and/or
  modify it under the terms of the GNU General Public License as
  published by the Free Software Foundation; either version 2 of
  the License, or (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
  General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software
  Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
*/

/*
 * This file is adapted from the one of muCommander, http://www.mucommander.com
 * Copyright (C) 2002-2008 Maxence Bernard
 */

package minicopier;

import java.io.IOException;
import java.io.InputStream;

/**
 * ThroughputLimitInputStream extends InputStream to provide control over the transfer speed and limit it to a specified
 * number of bytes per second. 
 * Whenever the bytes per second quota has been reached, the read and skip methods will lock and won't return
 * until either:
 * <ul>a new second commences, bringing the bytes read count back to zero for the new second
 * <li>{@link #setThroughputLimit(long)} is called with a more permissive bytes per second value (different from 0),
 * yielding to more bytes available for the current second.
 *
 * <p>Setting the throughput limit to 0 effectively blocks all read and skip calls indefinitely.
 * Any calls to the read or skip methods will lock, the only way to remove this lock being to call the
 * {@link #setThroughputLimit(long)} method with a value different from 0 from another thread.
 *
 * <p>Setting the throughput limit to -1 or any other negative values will disable any limit and make
 * this ThroughputLimitInputStream behave just like a normal InputStream.
 *
 * <p>Finally, the {@link #setUnderlyingInputStream(java.io.InputStream)} method allows to use the
 * same ThroughputLimitInputStream instance for multiple InputStream instances, keeping the bytes count for the
 * current second intact and thus the throughput limit stable. This does not hold true if a new ThroughputLimitInputStream
 * is created for each InputStream, the bytes count for the current second starting at 0.  
 *
 * @author Maxence Bernard
 */
public class ThroughputLimitInputStream extends InputStream {

    /** Underlying InputStream */
    private /*@ spec_public @*/ InputStream in;


    /** Holds the current second, allowing to detect when a new second commences */
    private /*@ spec_public @*/ long currentSecond;

    /** Number of bytes that have been read or skipped this second */
    private /*@ spec_public @*/ long nbBytesReadThisSecond;


    /**
     * Creates a new ThroughputLimitInputStream with no initial throughput limit (-1 value).
     *
     * @param input underlying stream that is used to read data from
     */
    /*@
	 @ requires input !=null;  
	 @ ensures this.in != null;
	 @*/
    public ThroughputLimitInputStream(InputStream input) {
        this.in = input;
    }

    /**
     * Creates a new ThroughputLimitInputStream with an initial throughput limit.
     *
     * @param in underlying stream that is used to read data from
     * @param bytesPerSecond initial throughput limit in bytes per second
     * @see #setThroughputLimit(long)
     */
    /*@
	 @ requires input !=null;  
	 @ ensures this.in != null;
	 @*/
    public ThroughputLimitInputStream(InputStream input, long bytesPerSecond) {
        this.in = input;
    }


    /**
     * Changes the underlying InputStream which data is read from, keeping the bytes count for the current second intact.
     *
     * <p>Note: the existing underlying InputStream will not be closed, the {@link #close()} method must be called prior
     * to calling this method.
     *
     * @param in the new InputStream to read data from
     */
    /*@
	 @ requires input !=null;  
	 @ ensures this.in != null;
	 @*/
    public void setUnderlyingInputStream(InputStream input) {
        this.in = input;
    }


    /**
     * Returns the number of bytes that can be read (or skipped) without exceeding the current throughput limit.
     * This method blocks until at least 1 byte is available. In other words the method always returns
     * strictly positive values.
     *
     * <p>If the current throughput limit is negative (no limit), this method returns immediately Integer.MAX_VALUE.
     * <p>If the byte quota for the current second has been exceeded, this method locks and returns as soon as a new second
     * has started (i.e. bytes are available), or the {@link #setThroughputLimit(long)} with a more permissive value
     * has been called.
     * <p>If the current throughput limit is 0, it will lock undefinitely, until {@link #setThroughputLimit(long)} has
     * been called from another thread with a value different from 0.
     *
     * @return the number of bytes available for reading without exceeding the current throughput limit
     */
    private int getNbAllowedBytes() {

        // Update limit counter and retrieve number of milliseconds until next second
        long msUntilNextSecond = updateLimitCounter();

        long allowedBytes;
        
        long bpsLimit = Configuration.getSpeedValue();

        synchronized(this) {
            // Loop while throughput limit has been exceeded
            while((allowedBytes=bpsLimit- nbBytesReadThisSecond)<=0) {
                // Throughput limit was removed, return max int value
                if(bpsLimit<0)
                    return Integer.MAX_VALUE;

                try {
                    // If limit is 0, wait indefinitely for a call to notify() from setThroughputLimit()
                    if(bpsLimit==0)
                        wait();
                    // Wait until the current second is over for more bytes to be available,
                    // or until a call to notify() is made from setThroughputLimit()
                    else {
                        wait(msUntilNextSecond);
                    }
                }
                catch(InterruptedException e) {
                    // No problem in this unlikely event, loop one more time and wait some more
                }

                // Update limit counter and retrieve number of milliseconds until next second
                msUntilNextSecond = updateLimitCounter();
            }
        }

        return (int)allowedBytes;
    }


    /**
     * Checks if the current second has changed. If that's the case, updates the current second value and resets the
     * number of bytes read this second. Returns the number of milliseconds until a new second starts.
     */
    private long updateLimitCounter() {
        long now = System.currentTimeMillis();
        long nowSecond = now/1000;

        // Current second has changed
        if(this.currentSecond!=nowSecond) {
            this.currentSecond = nowSecond;
            this.nbBytesReadThisSecond = 0;
        }

        return 1000-(now%1000);
    }


    /**
     * Increases the number of bytes read this second to the given number.
     *
     * @param nbRead number of bytes that have been read or skipped from the underlying stream.
     */
    /*@
	 @ requires nbRead !=0;  
	 @ ensures this.nbBytesReadThisSecond >= nbRead;
	 @*/
    private void addToLimitCounter(long nbRead) {
        updateLimitCounter();

        this.nbBytesReadThisSecond += nbRead;
    }


    ////////////////////////////////
    // InputStream implementation //
    ////////////////////////////////

    public int read() throws IOException {
        
        long bpsLimit = Configuration.getSpeedValue();
        
        // Wait until at least 1 byte is available if a limit is set
        if(bpsLimit>=0)
            getNbAllowedBytes();

        // Read the byte from the underlying stream
        int i = in.read();

        // Increase read counter by 1
        if(i>0)
            addToLimitCounter(1);

        return i;
    }

    public int read(byte[] bytes) throws IOException {
        return this.read(bytes, 0, bytes.length);
    }

    public int read(byte[] bytes, int off, int len) throws IOException {
        int nbRead;
        
        long bpsLimit = Configuration.getSpeedValue();

        // Wait until at least 1 byte is available if a limit is set and try to read as many bytes are available
        // without exceeding the throughput limit or the number specified
        if(bpsLimit>=0 && Configuration.limitSpeed)
            nbRead = in.read(bytes, off, Math.min(getNbAllowedBytes(),len));
        else
            nbRead = in.read(bytes, off, len);

        // Increase read counter by the number of bytes that have actually been read by the underlying stream
        if(nbRead>0)
            addToLimitCounter(nbRead);

        return nbRead;
    }

    public long skip(long l) throws IOException {
        
        long bpsLimit = Configuration.getSpeedValue();
        
        long nbSkipped = in.skip(bpsLimit>=0?Math.min(getNbAllowedBytes(),l):l);

        // Increase read counter by the number of bytes that have actually been skipped by the underlying stream
        if(nbSkipped>0)
            addToLimitCounter(nbSkipped);

        return nbSkipped;
    }

    public int available() throws IOException {
        return in.available();
    }

    public void close() throws IOException {
        in.close();
    }

    public synchronized void mark(int i) {
        in.mark(i);
    }

    public synchronized void reset() throws IOException {
        in.reset();
    }            

    public boolean markSupported() {
        return in.markSupported();
    }
}