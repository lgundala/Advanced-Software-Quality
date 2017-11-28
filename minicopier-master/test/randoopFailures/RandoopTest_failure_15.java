package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_15 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_15.test1");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    var3.addFile(var6);
    minicopier.Copier var8 = new minicopier.Copier();
    var8.setFileCurrentSize(1L);
    java.lang.String var12 = var8.stringURI2StringPath("hi!");
    minicopier.FailedQueue var13 = new minicopier.FailedQueue(var8);
    javax.swing.table.DefaultTableModel var14 = var13.getTableModel();
    minicopier.Copier var15 = new minicopier.Copier();
    var15.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var18 = new minicopier.FailedQueue(var15);
    boolean var19 = var18.isEmpty();
    int[] var20 = new int[] { };
    int[] var21 = var18.remove(var20);
    minicopier.Copier var22 = new minicopier.Copier();
    var22.setFileCurrentSize(1L);
    var22.setFileCurrentSize(100L);
    java.lang.String var27 = var22.getCurrentFileSource();
    minicopier.MainQueue var28 = new minicopier.MainQueue(var22);
    minicopier.Copier var29 = new minicopier.Copier();
    var29.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var32 = new minicopier.FailedQueue(var29);
    boolean var33 = var32.isEmpty();
    int[] var34 = new int[] { };
    int[] var35 = var32.remove(var34);
    int[] var36 = var28.remove(var34);
    int[] var37 = var18.remove(var34);
    int[] var38 = var13.retry(var34);
    int[] var39 = var3.remove(var34);
    minicopier.Copier var40 = new minicopier.Copier();
    var40.setFileCurrentSize(1L);
    var40.setFileCurrentSize(100L);
    java.lang.String var45 = var40.getCurrentFileSource();
    minicopier.MainQueue var46 = new minicopier.MainQueue(var40);
    minicopier.Copier var47 = new minicopier.Copier();
    var47.clearBasket();
    long var49 = var47.readAndInitBytesCounter();
    long var50 = var47.readAndInitBytesCounter();
    var47.unpause();
    minicopier.MainQueue var52 = new minicopier.MainQueue(var47);
    minicopier.Copier var53 = new minicopier.Copier();
    var53.setFileCurrentSize(1L);
    var53.setFileCurrentSize(100L);
    int var58 = var53.getTotalPercent();
    java.lang.String var60 = var53.stringURI2StringPath("hi!");
    int var61 = var53.getTotalPercent();
    minicopier.MainQueue var62 = new minicopier.MainQueue(var53);
    javax.swing.table.DefaultTableModel var63 = var62.getTableModel();
    minicopier.Copier var64 = new minicopier.Copier();
    var64.setFileCurrentSize(1L);
    var64.setFileCurrentSize(100L);
    java.lang.Object[] var69 = new java.lang.Object[] { 100L};
    var63.addRow(var69);
    minicopier.MainQueue.TransfersModel var72 = var52.new TransfersModel(var69, 1);
    minicopier.Copier var73 = new minicopier.Copier();
    var73.setFileCurrentSize(1L);
    var73.setFileCurrentSize(100L);
    java.lang.String var78 = var73.getCurrentFileSource();
    minicopier.MainQueue var79 = new minicopier.MainQueue(var73);
    minicopier.Copier var80 = new minicopier.Copier();
    var80.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var83 = new minicopier.FailedQueue(var80);
    minicopier.Copier var84 = new minicopier.Copier();
    var84.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var87 = new minicopier.FailedQueue(var84);
    boolean var88 = var87.isEmpty();
    int[] var89 = new int[] { };
    int[] var90 = var87.remove(var89);
    int[] var91 = var83.retry(var89);
    int[] var92 = var79.putLast(var89);
    int[] var93 = var52.putFirst(var89);
    int[] var94 = var46.putFirst(var89);
    int[] var95 = var3.retry(var94);

  }

}
