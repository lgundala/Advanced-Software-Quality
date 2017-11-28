package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_16 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_16.test1");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    long var5 = var0.getQueueTotalSize();
    var0.add2basket("K");
    boolean var8 = var0.getPause();
    var0.paste("\\");

  }

}
