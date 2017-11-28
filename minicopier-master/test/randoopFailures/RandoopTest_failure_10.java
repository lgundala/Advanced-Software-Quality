package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_10 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_10.test1");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    var0.paste("\\");
    var0.paste2URIString("\\");

  }

}
