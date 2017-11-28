/*
  FileToTransfer.java / MiniCopier
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

package minicopier;
import java.io.*;

/** FileToTransfer represents a tranfer requested by the user. 
 * It contains all the informations about the source file, and where
 * it must be copied, according to the user.
 */

public class FileToTransfer {
	
	//Source file path
	private /*@ spec_public @*/ String sourcePath;

	//File's copy destination path (folder)
	private /*@ spec_public @*/ String destinationPath;
	
	//Destination File Path
	private /*@ spec_public @*/ String destinationFilePath;
	
	//Name of source file
	private /*@ spec_public @*/ String name;
	
	//Size of source file
	private /*@ spec_public @*/ long size;
	
	/** Creation of a FileToTransfer
	 * @param _path2source system path to the source file
	 * @param _path2destinationfolder system path to the destination folder
	 */
	
	/*@
	 @ requires _path2source !=null;  
	 @ requires _path2destinationfolder !=null;  
	 @ ensures this.sourcePath !=null;
	 @ ensures this.name !=null;
	 @ ensures this.destinationFilePath !=null;
	 @ ensures this.destinationFilePath !=null;
	 @
	 @*/
	public FileToTransfer(String _path2source, 
			String _path2destinationfolder) {
		
		createFileToTransfer(_path2source, _path2destinationfolder);
			
		
	}

	private void createFileToTransfer(String _path2source,
			String _path2destinationfolder) {
		//Using the argument Strings directly work, but the
		//display is not fine for Windows, so we create Files
		//and get the path (OS-dependent).

		//this.sourcePath = _path2source;
		
		File sourceFile = new File(_path2source);
		
		this.sourcePath = sourceFile.getPath();		
		this.name = sourceFile.getName();
		this.size = sourceFile.length();
		
		//this.destinationPath = _path2destinationfolder;
		
		
		File destFolder = new File(_path2destinationfolder);
		this.destinationPath = destFolder.getPath();
		
		this.destinationFilePath = this.destinationPath 
		+ File.separator + this.name;
	}
	
	/*@
	  @ requires this.sourcePath !=null; 
	  @ ensures \result !=null;
	  @*/
	public String getSourcePath() {
		return this.sourcePath;
	}
	
	/*@
	  @ requires this.sourcePath !=null; 
	  @ ensures \result !=null;
	  @*/
	public File getSourceFile() {
		return new File(this.sourcePath);
	}
	
	/*@
	  @ requires this.destinationPath !=null; 
	  @ ensures \result !=null;
	  @*/
	public String getDestinationFolderPath() {
		return this.destinationPath;
	}
	
	/*@
	  @ requires this.destinationPath !=null; 
	  @ ensures \result !=null;
	  @*/
	public File getDestinationFolder() {
		return new File(this.getDestinationFolderPath());
	}
	
	/*@
	  @ requires this.destinationFilePath !=null; 
	  @ ensures \result !=null;
	  @*/
	public String getDestinationFilePath() {
		return this.destinationFilePath;

	}
	
	/*@
	  @ requires this.destinationFilePath !=null; 
	  @ ensures \result !=null;
	  @*/
	public File getDestinationFile() {
		return new File(this.getDestinationFilePath());
	}
	
	/*@
	  @ requires this.name !=null; 
	  @ ensures \result !=null;
	  @*/
	public String getName() {
		return this.name;
	}
	
	public long getSize() {
		return this.size;
	}
	
	public void changeTargetName(String newName){
		this.destinationFilePath = this.destinationPath + File.separator +
			newName;
	}

}
