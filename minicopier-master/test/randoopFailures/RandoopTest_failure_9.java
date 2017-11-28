package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_9 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_9.test1");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    java.lang.String var2 = var0.getCurrentFileSource();
    minicopier.FileToTransfer var5 = new minicopier.FileToTransfer("", "");
    var5.changeTargetName("");
    java.io.File var8 = var5.getDestinationFile();
    java.io.File var9 = var5.getSourceFile();
    java.lang.String var10 = var5.getDestinationFilePath();
    var0.addFile2Queue(var5);

  }

}
