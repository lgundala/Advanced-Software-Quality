package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_6 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_6.test1");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    long var2 = var0.readAndInitBytesCounter();
    var0.decreaseQueueTotalSize(0L);

  }

}
