package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_7 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_7.test1");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.setFileCurrentSize(10L);
    var0.unpause();
    java.lang.String var9 = var0.stringURI2StringPath("hi!\\");

  }

}
