package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_12 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_12.test1");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    java.lang.String var4 = var0.stringURI2StringPath("hi!");
    var0.setFileCurrentSize((-100L));
    var0.setFileTotalSize(0L);

  }

}
