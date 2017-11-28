package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_13 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_13.test1");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = var6.getDestinationFilePath();
    minicopier.TransferTask var10 = new minicopier.TransferTask(var0, var6, false);
    boolean var11 = var10.getCompleted();
    var10.run();

  }

}
