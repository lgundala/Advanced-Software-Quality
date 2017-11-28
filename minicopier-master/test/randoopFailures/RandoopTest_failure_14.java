package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_14 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_14.test1");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.clearBasket();
    java.lang.String var7 = var0.getCurrentFileSource();
    int var8 = var0.getCurrentPercent();
    var0.paste2URIString("K");
    var0.addURIString2basket("\\");

  }

}
