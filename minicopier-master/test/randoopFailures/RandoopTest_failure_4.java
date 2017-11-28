package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_4 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_4.test1");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    long var4 = var0.getCurrentBytesRemaining();
    var0.skip(true);

  }

}
