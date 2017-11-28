package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_3 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_3.test1");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    var0.increaseQueueTotalSize(100L);

  }

}
