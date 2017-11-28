package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_8 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_8.test1");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    long var3 = var0.getQueueTotalSize();
    var0.treatQueue();

  }

}
