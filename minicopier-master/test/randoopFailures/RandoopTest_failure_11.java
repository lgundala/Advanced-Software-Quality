package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_11 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_11.test1");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    boolean var11 = var9.isEmpty();
    minicopier.FileToTransfer var14 = new minicopier.FileToTransfer("", "");
    var14.changeTargetName("");
    long var17 = var14.getSize();
    java.lang.String var18 = var14.getSourcePath();
    var9.addFile(var14);

  }

}
