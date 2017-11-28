package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_5 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_5.test1");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    var0.setPause(false);

  }

}
