package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_2.test1");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    minicopier.FileToTransfer var5 = new minicopier.FileToTransfer("", "");
    java.io.File var6 = var5.getDestinationFile();
    var0.addFolder2Queue(var6, "");

  }

}
