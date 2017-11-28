package randoop;

import junit.framework.*;

public class RandoopTest10 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test1");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.setFileCurrentSize(10L);
    minicopier.FileToTransfer var9 = new minicopier.FileToTransfer("", "");
    var9.changeTargetName("");
    java.io.File var12 = var9.getDestinationFile();
    java.io.File var13 = var9.getSourceFile();
    boolean var14 = minicopier.Copier.isNotLink(var13);
    var0.addFolder2Queue(var13, "hi!\\");
    var0.increaseFileCurrentSize(10L);
    boolean var21 = var0.nameIsAcceptable("CW", "hi!");
    minicopier.FileToTransfer var24 = new minicopier.FileToTransfer("A", "K");
    minicopier.TransferTask var26 = new minicopier.TransferTask(var0, var24, false);
    var0.paste("\\hi!");
    var0.add2basket("D");
    var0.unpause();
    minicopier.MainQueue var32 = new minicopier.MainQueue(var0);
    minicopier.Copier var33 = new minicopier.Copier();
    var33.setFileCurrentSize(1L);
    var33.setFileCurrentSize(100L);
    int var38 = var33.getTotalPercent();
    java.lang.String var40 = var33.stringURI2StringPath("hi!");
    int var41 = var33.getTotalPercent();
    minicopier.MainQueue var42 = new minicopier.MainQueue(var33);
    javax.swing.table.DefaultTableModel var43 = var42.getTableModel();
    minicopier.Copier var44 = new minicopier.Copier();
    var44.setFileCurrentSize(1L);
    var44.setFileCurrentSize(100L);
    int var49 = var44.getTotalPercent();
    java.lang.String var51 = var44.stringURI2StringPath("hi!");
    int var52 = var44.getTotalPercent();
    minicopier.MainQueue var53 = new minicopier.MainQueue(var44);
    javax.swing.table.DefaultTableModel var54 = var53.getTableModel();
    javax.swing.table.DefaultTableModel var55 = var53.getTableModel();
    minicopier.Copier var56 = new minicopier.Copier();
    var56.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var59 = new minicopier.FailedQueue(var56);
    minicopier.Copier var60 = new minicopier.Copier();
    var60.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var63 = new minicopier.FailedQueue(var60);
    boolean var64 = var63.isEmpty();
    int[] var65 = new int[] { };
    int[] var66 = var63.remove(var65);
    int[] var67 = var59.retry(var65);
    int[] var68 = var53.remove(var65);
    int[] var69 = var42.putFirst(var65);
    minicopier.Copier var70 = new minicopier.Copier();
    var70.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var73 = new minicopier.FailedQueue(var70);
    boolean var74 = var73.isEmpty();
    int[] var75 = new int[] { };
    int[] var76 = var73.remove(var75);
    int[] var77 = var42.remove(var75);
    int[] var78 = var32.putFirst(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test2");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    long var2 = var0.readAndInitBytesCounter();
    long var3 = var0.readAndInitBytesCounter();
    int var4 = var0.basketLength();
    long var5 = var0.getCurrentBytesRemaining();
    int var6 = var0.getCurrentPercent();
    long var7 = var0.getQueueTotalSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test3");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    java.lang.String var4 = var0.stringURI2StringPath("hi!");
    minicopier.FailedQueue var5 = new minicopier.FailedQueue(var0);
    minicopier.Copier var6 = new minicopier.Copier();
    var6.increaseFileCurrentSize((-1L));
    var6.increaseQueueCurrentSize((-1L));
    minicopier.FileToTransfer var13 = new minicopier.FileToTransfer("", "");
    java.io.File var14 = var13.getDestinationFolder();
    java.lang.String var15 = var13.getDestinationFolderPath();
    java.io.File var16 = var13.getDestinationFolder();
    minicopier.TransferTask var18 = new minicopier.TransferTask(var6, var13, true);
    var5.addFile(var13);
    javax.swing.table.DefaultTableModel var20 = var5.getTableModel();
    int var21 = var20.getRowCount();
    var20.fireTableRowsUpdated(4, 1);
    minicopier.Copier var26 = new minicopier.Copier();
    var26.setFileCurrentSize(1L);
    var26.setFileCurrentSize(100L);
    int var31 = var26.getTotalPercent();
    java.lang.String var33 = var26.stringURI2StringPath("hi!");
    int var34 = var26.getTotalPercent();
    minicopier.MainQueue var35 = new minicopier.MainQueue(var26);
    javax.swing.table.DefaultTableModel var36 = var35.getTableModel();
    javax.swing.table.DefaultTableModel var37 = var35.getTableModel();
    minicopier.Copier var38 = new minicopier.Copier();
    var38.setFileCurrentSize(1L);
    var38.setFileCurrentSize(100L);
    java.lang.String var43 = var38.getCurrentFileSource();
    minicopier.MainQueue var44 = new minicopier.MainQueue(var38);
    minicopier.Copier var45 = new minicopier.Copier();
    var45.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var48 = new minicopier.FailedQueue(var45);
    boolean var49 = var48.isEmpty();
    int[] var50 = new int[] { };
    int[] var51 = var48.remove(var50);
    int[] var52 = var44.remove(var50);
    int[] var53 = var35.remove(var50);
    minicopier.Copier var54 = new minicopier.Copier();
    var54.setFileCurrentSize(1L);
    var54.setFileCurrentSize(100L);
    int var59 = var54.getTotalPercent();
    java.lang.String var61 = var54.stringURI2StringPath("hi!");
    int var62 = var54.getTotalPercent();
    minicopier.MainQueue var63 = new minicopier.MainQueue(var54);
    javax.swing.table.DefaultTableModel var64 = var63.getTableModel();
    minicopier.Copier var66 = new minicopier.Copier();
    var66.setFileCurrentSize(1L);
    var66.setFileCurrentSize(100L);
    int var71 = var66.getTotalPercent();
    java.lang.String var73 = var66.stringURI2StringPath("hi!");
    int var74 = var66.getTotalPercent();
    minicopier.MainQueue var75 = new minicopier.MainQueue(var66);
    javax.swing.table.DefaultTableModel var76 = var75.getTableModel();
    java.lang.Object[] var77 = new java.lang.Object[] { var76};
    var64.addColumn((java.lang.Object)0.0d, var77);
    minicopier.MainQueue.TransfersModel var80 = var35.new TransfersModel(var77, 100);
    boolean var83 = var80.isCellEditable(10, 4);
    boolean var86 = var80.isCellEditable(4, 11);
    var80.fireTableRowsInserted(9, 10);
    javax.swing.event.TableModelListener[] var90 = var80.getTableModelListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var20.insertRow(99, (java.lang.Object[])var90);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!"+ "'", var73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test4");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    boolean var4 = var3.isEmpty();
    int[] var5 = new int[] { };
    int[] var6 = var3.remove(var5);
    minicopier.Copier var7 = new minicopier.Copier();
    var7.setFileCurrentSize(1L);
    var7.setFileCurrentSize(100L);
    java.lang.String var12 = var7.getCurrentFileSource();
    minicopier.MainQueue var13 = new minicopier.MainQueue(var7);
    minicopier.Copier var14 = new minicopier.Copier();
    var14.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var17 = new minicopier.FailedQueue(var14);
    boolean var18 = var17.isEmpty();
    int[] var19 = new int[] { };
    int[] var20 = var17.remove(var19);
    int[] var21 = var13.remove(var19);
    int[] var22 = var3.remove(var19);
    minicopier.FileToTransfer var25 = new minicopier.FileToTransfer("", "");
    java.lang.String var26 = var25.getSourcePath();
    java.lang.String var27 = var25.getName();
    var3.addFile(var25);
    java.lang.String var29 = var25.getSourcePath();
    java.io.File var30 = var25.getDestinationFile();
    java.io.File var31 = var25.getSourceFile();
    java.lang.String var32 = var25.getName();
    java.lang.String var33 = var25.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test5");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.setColumnCount(0);
    int var14 = var10.findColumn("hi!\\");
    int var15 = var10.getRowCount();
    int var17 = var10.findColumn("hi!");
    minicopier.Copier var18 = new minicopier.Copier();
    var18.setFileCurrentSize(1L);
    var18.setFileCurrentSize(100L);
    java.lang.String var23 = var18.getCurrentFileSource();
    minicopier.MainQueue var24 = new minicopier.MainQueue(var18);
    minicopier.Copier var25 = new minicopier.Copier();
    var25.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var28 = new minicopier.FailedQueue(var25);
    minicopier.FileToTransfer var31 = new minicopier.FileToTransfer("", "hi!");
    var28.addFile(var31);
    javax.swing.table.DefaultTableModel var33 = var28.getTableModel();
    minicopier.Copier var34 = new minicopier.Copier();
    var34.setFileCurrentSize(1L);
    var34.setFileCurrentSize(100L);
    int var39 = var34.getTotalPercent();
    java.lang.String var41 = var34.stringURI2StringPath("hi!");
    int var42 = var34.getTotalPercent();
    minicopier.MainQueue var43 = new minicopier.MainQueue(var34);
    javax.swing.table.DefaultTableModel var44 = var43.getTableModel();
    minicopier.Copier var46 = new minicopier.Copier();
    var46.setFileCurrentSize(1L);
    var46.setFileCurrentSize(100L);
    int var51 = var46.getTotalPercent();
    java.lang.String var53 = var46.stringURI2StringPath("hi!");
    int var54 = var46.getTotalPercent();
    minicopier.MainQueue var55 = new minicopier.MainQueue(var46);
    javax.swing.table.DefaultTableModel var56 = var55.getTableModel();
    java.lang.Object[] var57 = new java.lang.Object[] { var56};
    var44.addColumn((java.lang.Object)0.0d, var57);
    var44.fireTableRowsInserted(100, 10);
    java.util.Vector var62 = var44.getDataVector();
    var33.setColumnIdentifiers(var62);
    var10.addColumn((java.lang.Object)var18, var62);
    var18.decreaseQueueCurrentSize((-9L));
    minicopier.MainQueue var67 = new minicopier.MainQueue(var18);
    var18.forceStart();
    var18.add2basket("K\\A");
    long var71 = var18.getFileTotalSize();
    long var72 = var18.getFileTotalSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0L);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test6");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    var0.increaseQueueCurrentSize(11L);
    minicopier.FileToTransfer var12 = new minicopier.FileToTransfer("", "");
    java.lang.String var13 = var12.getSourcePath();
    java.io.File var14 = var12.getDestinationFolder();
    var0.addFolder2Queue(var14, "\\");
    long var17 = var0.getQueueTotalSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test7");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    long var6 = var0.getQueueTotalSize();
    long var7 = var0.getTotalBytesRemaining();
    var0.increaseFileCurrentSize(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test8");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.decreaseQueueCurrentSize(10L);
    java.lang.String var8 = var0.stringURI2StringPath("");
    var0.increaseFileCurrentSize(11L);
    var0.forceStart();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test9");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.setColumnCount(0);
    int var14 = var10.findColumn("hi!\\");
    int var15 = var10.getRowCount();
    minicopier.Copier var16 = new minicopier.Copier();
    var16.setFileCurrentSize(1L);
    var16.setFileCurrentSize(100L);
    int var21 = var16.getTotalPercent();
    java.lang.String var23 = var16.stringURI2StringPath("hi!");
    int var24 = var16.getTotalPercent();
    minicopier.MainQueue var25 = new minicopier.MainQueue(var16);
    javax.swing.table.DefaultTableModel var26 = var25.getTableModel();
    minicopier.Copier var27 = new minicopier.Copier();
    var27.setFileCurrentSize(1L);
    var27.setFileCurrentSize(100L);
    java.lang.Object[] var32 = new java.lang.Object[] { 100L};
    var26.addRow(var32);
    var10.addRow(var32);
    var10.fireTableStructureChanged();
    int var36 = var10.getRowCount();
    var10.fireTableStructureChanged();
    javax.swing.event.TableModelListener[] var38 = var10.getTableModelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test10");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    java.lang.Object[] var23 = new java.lang.Object[] { var22};
    var10.addColumn((java.lang.Object)0.0d, var23);
    java.util.Vector var25 = var10.getDataVector();
    minicopier.Copier var26 = new minicopier.Copier();
    var26.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var29 = new minicopier.FailedQueue(var26);
    long var30 = var26.getCurrentBytesRemaining();
    java.lang.String var32 = var26.stringURI2StringPath("hi!");
    var26.increaseQueueCurrentSize(100L);
    int var35 = var26.basketLength();
    java.lang.String var36 = var26.getCurrentFileDestination();
    minicopier.FailedQueue var37 = new minicopier.FailedQueue(var26);
    minicopier.MainQueue var38 = new minicopier.MainQueue(var26);
    boolean var39 = var38.isEmpty();
    minicopier.Copier var40 = new minicopier.Copier();
    var40.setFileCurrentSize(1L);
    java.lang.String var44 = var40.stringURI2StringPath("hi!");
    minicopier.FailedQueue var45 = new minicopier.FailedQueue(var40);
    javax.swing.table.DefaultTableModel var46 = var45.getTableModel();
    javax.swing.table.DefaultTableModel var47 = var45.getTableModel();
    int var48 = var47.getColumnCount();
    var47.fireTableCellUpdated(1, 4);
    minicopier.Copier var52 = new minicopier.Copier();
    var52.setFileCurrentSize(1L);
    var52.setFileCurrentSize(100L);
    int var57 = var52.getTotalPercent();
    java.lang.String var59 = var52.stringURI2StringPath("hi!");
    int var60 = var52.getTotalPercent();
    minicopier.MainQueue var61 = new minicopier.MainQueue(var52);
    javax.swing.table.DefaultTableModel var62 = var61.getTableModel();
    var62.setColumnCount(0);
    int var66 = var62.findColumn("hi!\\");
    javax.swing.event.TableModelListener[] var67 = var62.getTableModelListeners();
    var47.addRow((java.lang.Object[])var67);
    minicopier.MainQueue.TransfersModel var70 = var38.new TransfersModel((java.lang.Object[])var67, 11);
    var10.addRow((java.lang.Object[])var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test11");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    java.lang.String var2 = var0.getCurrentFileSource();
    var0.setFileCurrentSize((-100L));
    long var5 = var0.getTotalBytesRemaining();
    boolean var6 = var0.pause();
    minicopier.MainQueue var7 = new minicopier.MainQueue(var0);
    minicopier.Copier var8 = new minicopier.Copier();
    var8.setFileCurrentSize(1L);
    var8.setFileCurrentSize(100L);
    java.lang.String var13 = var8.getCurrentFileSource();
    minicopier.FailedQueue var14 = new minicopier.FailedQueue(var8);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    minicopier.Copier var17 = new minicopier.Copier();
    var17.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var20 = new minicopier.FailedQueue(var17);
    minicopier.Copier var21 = new minicopier.Copier();
    var21.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var24 = new minicopier.FailedQueue(var21);
    boolean var25 = var24.isEmpty();
    int[] var26 = new int[] { };
    int[] var27 = var24.remove(var26);
    int[] var28 = var20.retry(var26);
    int[] var29 = var14.retry(var26);
    int[] var30 = var7.putLast(var26);
    minicopier.Copier var31 = new minicopier.Copier();
    var31.setFileCurrentSize(1L);
    var31.setFileCurrentSize(100L);
    int var36 = var31.getTotalPercent();
    java.lang.String var38 = var31.stringURI2StringPath("hi!");
    int var39 = var31.getTotalPercent();
    minicopier.MainQueue var40 = new minicopier.MainQueue(var31);
    javax.swing.table.DefaultTableModel var41 = var40.getTableModel();
    minicopier.Copier var42 = new minicopier.Copier();
    var42.setFileCurrentSize(1L);
    var42.setFileCurrentSize(100L);
    int var47 = var42.getTotalPercent();
    java.lang.String var49 = var42.stringURI2StringPath("hi!");
    int var50 = var42.getTotalPercent();
    minicopier.MainQueue var51 = new minicopier.MainQueue(var42);
    javax.swing.table.DefaultTableModel var52 = var51.getTableModel();
    javax.swing.table.DefaultTableModel var53 = var51.getTableModel();
    minicopier.Copier var54 = new minicopier.Copier();
    var54.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var57 = new minicopier.FailedQueue(var54);
    minicopier.Copier var58 = new minicopier.Copier();
    var58.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var61 = new minicopier.FailedQueue(var58);
    boolean var62 = var61.isEmpty();
    int[] var63 = new int[] { };
    int[] var64 = var61.remove(var63);
    int[] var65 = var57.retry(var63);
    int[] var66 = var51.remove(var63);
    int[] var67 = var40.putFirst(var63);
    minicopier.Copier var68 = new minicopier.Copier();
    var68.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var71 = new minicopier.FailedQueue(var68);
    boolean var72 = var71.isEmpty();
    int[] var73 = new int[] { };
    int[] var74 = var71.remove(var73);
    int[] var75 = var40.remove(var73);
    int[] var76 = var7.putLast(var73);
    javax.swing.table.DefaultTableModel var77 = var7.getTableModel();
    var77.setColumnCount(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test12");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.fireTableRowsInserted(1, 0);
    var10.fireTableStructureChanged();
    java.lang.Class var16 = var10.getColumnClass(3);
    var10.setColumnCount(10);
    java.lang.Class var20 = var10.getColumnClass(1);
    var10.fireTableRowsDeleted(10, 1);
    minicopier.Copier var24 = new minicopier.Copier();
    var24.setFileCurrentSize(1L);
    var24.setFileCurrentSize(100L);
    int var29 = var24.getTotalPercent();
    java.lang.String var31 = var24.stringURI2StringPath("hi!");
    int var32 = var24.getTotalPercent();
    minicopier.MainQueue var33 = new minicopier.MainQueue(var24);
    javax.swing.table.DefaultTableModel var34 = var33.getTableModel();
    var34.setColumnCount(0);
    int var38 = var34.findColumn("hi!\\");
    minicopier.FileToTransfer var41 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var42 = var41.getName();
    java.lang.String var43 = var41.getDestinationFilePath();
    java.lang.String var44 = var41.getSourcePath();
    long var45 = var41.getSize();
    minicopier.Copier var46 = new minicopier.Copier();
    var46.setFileCurrentSize(1L);
    var46.setFileCurrentSize(100L);
    int var51 = var46.getTotalPercent();
    java.lang.String var53 = var46.stringURI2StringPath("hi!");
    int var54 = var46.getTotalPercent();
    minicopier.MainQueue var55 = new minicopier.MainQueue(var46);
    javax.swing.table.DefaultTableModel var56 = var55.getTableModel();
    minicopier.Copier var58 = new minicopier.Copier();
    var58.setFileCurrentSize(1L);
    var58.setFileCurrentSize(100L);
    int var63 = var58.getTotalPercent();
    java.lang.String var65 = var58.stringURI2StringPath("hi!");
    int var66 = var58.getTotalPercent();
    minicopier.MainQueue var67 = new minicopier.MainQueue(var58);
    javax.swing.table.DefaultTableModel var68 = var67.getTableModel();
    java.lang.Object[] var69 = new java.lang.Object[] { var68};
    var56.addColumn((java.lang.Object)0.0d, var69);
    var56.setColumnCount(0);
    java.lang.String var74 = var56.getColumnName(100);
    java.util.Vector var75 = var56.getDataVector();
    var34.addColumn((java.lang.Object)var45, var75);
    minicopier.Copier var77 = new minicopier.Copier();
    var77.setFileCurrentSize(1L);
    var77.setFileCurrentSize(100L);
    int var82 = var77.getTotalPercent();
    java.lang.String var84 = var77.stringURI2StringPath("hi!");
    int var85 = var77.getTotalPercent();
    minicopier.MainQueue var86 = new minicopier.MainQueue(var77);
    boolean var87 = var86.isEmpty();
    boolean var88 = var86.isEmpty();
    javax.swing.table.DefaultTableModel var89 = var86.getTableModel();
    var89.setRowCount(0);
    java.util.Vector var92 = var89.getDataVector();
    int var94 = var89.findColumn("\\hi!");
    java.util.Vector var95 = var89.getDataVector();
    var10.setDataVector(var75, var95);
    java.lang.Class var98 = var10.getColumnClass((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!\\"+ "'", var43.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "CW"+ "'", var74.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "hi!"+ "'", var84.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test13");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    long var2 = var0.readAndInitBytesCounter();
    long var3 = var0.readAndInitBytesCounter();
    var0.unpause();
    var0.decreaseQueueCurrentSize(0L);
    var0.add2basket("K");
    int var9 = var0.getTotalPercent();
    var0.clearBasket();
    var0.paste("A\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test14");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("Source\\D", "hi!\\Destination");

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test15");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(0L);
    long var8 = var0.readAndInitBytesCounter();
    var0.paste("D");
    minicopier.FileToTransfer var13 = new minicopier.FileToTransfer("", "");
    java.lang.String var14 = var13.getName();
    var13.changeTargetName("\\CW");
    minicopier.TransferTask var18 = new minicopier.TransferTask(var0, var13, true);
    var0.setFileCurrentSize(11L);
    boolean var21 = var0.getPause();
    long var22 = var0.getCurrentBytesRemaining();
    minicopier.FailedQueue var23 = new minicopier.FailedQueue(var0);
    boolean var24 = var0.pause();
    boolean var25 = var0.pause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-11L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test16");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.clearBasket();
    var0.increaseFileCurrentSize(100L);
    java.lang.String var8 = var0.getCurrentFileDestination();
    boolean var11 = var0.nameIsAcceptable("E", "\\hi!");
    boolean var12 = var0.pause();
    boolean var13 = var0.getPause();
    long var14 = var0.getFileTotalSize();
    var0.increaseQueueCurrentSize((-11L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test17");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    java.lang.String var4 = var0.stringURI2StringPath("hi!");
    boolean var5 = var0.getPause();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    minicopier.FailedQueue var8 = new minicopier.FailedQueue(var0);
    var0.setFileCurrentSize(11L);
    minicopier.MainQueue var11 = new minicopier.MainQueue(var0);
    minicopier.Copier var12 = new minicopier.Copier();
    var12.clearBasket();
    long var14 = var12.readAndInitBytesCounter();
    minicopier.MainQueue var15 = new minicopier.MainQueue(var12);
    boolean var16 = var15.isEmpty();
    minicopier.Copier var17 = new minicopier.Copier();
    var17.setFileCurrentSize(1L);
    var17.setFileCurrentSize(100L);
    java.lang.String var22 = var17.getCurrentFileSource();
    minicopier.MainQueue var23 = new minicopier.MainQueue(var17);
    minicopier.Copier var24 = new minicopier.Copier();
    var24.setFileCurrentSize(1L);
    var24.setFileCurrentSize(100L);
    java.lang.String var29 = var24.getCurrentFileSource();
    minicopier.FailedQueue var30 = new minicopier.FailedQueue(var24);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    minicopier.Copier var33 = new minicopier.Copier();
    var33.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var36 = new minicopier.FailedQueue(var33);
    minicopier.Copier var37 = new minicopier.Copier();
    var37.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var40 = new minicopier.FailedQueue(var37);
    boolean var41 = var40.isEmpty();
    int[] var42 = new int[] { };
    int[] var43 = var40.remove(var42);
    int[] var44 = var36.retry(var42);
    int[] var45 = var30.retry(var42);
    minicopier.Copier var46 = new minicopier.Copier();
    var46.setFileCurrentSize(1L);
    var46.setFileCurrentSize(100L);
    java.lang.String var51 = var46.getCurrentFileSource();
    minicopier.MainQueue var52 = new minicopier.MainQueue(var46);
    minicopier.Copier var53 = new minicopier.Copier();
    var53.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var56 = new minicopier.FailedQueue(var53);
    boolean var57 = var56.isEmpty();
    int[] var58 = new int[] { };
    int[] var59 = var56.remove(var58);
    int[] var60 = var52.remove(var58);
    minicopier.Copier var61 = new minicopier.Copier();
    var61.setFileCurrentSize(1L);
    var61.setFileCurrentSize(100L);
    int var66 = var61.getTotalPercent();
    java.lang.String var68 = var61.stringURI2StringPath("hi!");
    int var69 = var61.getTotalPercent();
    minicopier.MainQueue var70 = new minicopier.MainQueue(var61);
    boolean var71 = var70.isEmpty();
    boolean var72 = var70.isEmpty();
    minicopier.Copier var73 = new minicopier.Copier();
    var73.setFileCurrentSize(1L);
    var73.setFileCurrentSize(100L);
    java.lang.String var78 = var73.getCurrentFileSource();
    minicopier.MainQueue var79 = new minicopier.MainQueue(var73);
    minicopier.Copier var80 = new minicopier.Copier();
    var80.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var83 = new minicopier.FailedQueue(var80);
    boolean var84 = var83.isEmpty();
    int[] var85 = new int[] { };
    int[] var86 = var83.remove(var85);
    int[] var87 = var79.remove(var85);
    int[] var88 = var70.putLast(var85);
    int[] var89 = var52.remove(var85);
    int[] var90 = var30.retry(var85);
    int[] var91 = var23.putLast(var85);
    int[] var92 = var15.remove(var85);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var93 = var11.putUp(var85);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "hi!"+ "'", var68.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + ""+ "'", var78.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test18");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    java.lang.Object[] var23 = new java.lang.Object[] { var22};
    var10.addColumn((java.lang.Object)0.0d, var23);
    var10.fireTableRowsInserted(100, 10);
    java.util.Vector var28 = var10.getDataVector();
    java.util.Vector var29 = var10.getDataVector();
    minicopier.Copier var30 = new minicopier.Copier();
    var30.setFileCurrentSize(1L);
    var30.setFileCurrentSize(100L);
    int var35 = var30.getTotalPercent();
    java.lang.String var37 = var30.stringURI2StringPath("hi!");
    int var38 = var30.getTotalPercent();
    minicopier.MainQueue var39 = new minicopier.MainQueue(var30);
    javax.swing.table.DefaultTableModel var40 = var39.getTableModel();
    minicopier.Copier var42 = new minicopier.Copier();
    var42.setFileCurrentSize(1L);
    var42.setFileCurrentSize(100L);
    int var47 = var42.getTotalPercent();
    java.lang.String var49 = var42.stringURI2StringPath("hi!");
    int var50 = var42.getTotalPercent();
    minicopier.MainQueue var51 = new minicopier.MainQueue(var42);
    javax.swing.table.DefaultTableModel var52 = var51.getTableModel();
    java.lang.Object[] var53 = new java.lang.Object[] { var52};
    var40.addColumn((java.lang.Object)0.0d, var53);
    var40.setColumnCount(0);
    java.lang.String var58 = var40.getColumnName(100);
    java.util.Vector var59 = var40.getDataVector();
    var10.addColumn((java.lang.Object)var40);
    int var61 = var40.getColumnCount();
    java.lang.Class var63 = var40.getColumnClass(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "CW"+ "'", var58.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test19");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.FailedQueue var6 = new minicopier.FailedQueue(var0);
    var0.decreaseQueueCurrentSize(11L);
    var0.clearBasket();
    minicopier.MainQueue var10 = new minicopier.MainQueue(var0);
    var0.increaseFileCurrentSize((-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test20");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.FailedQueue var6 = new minicopier.FailedQueue(var0);
    boolean var7 = var6.isEmpty();
    javax.swing.table.DefaultTableModel var8 = var6.getTableModel();
    java.lang.String var10 = var8.getColumnName((-1));
    var8.moveRow(100, (-1), 4);
    java.lang.Class var16 = var8.getColumnClass(2);
    var8.setColumnCount(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test21");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    boolean var4 = var3.isEmpty();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFile();
    java.lang.String var9 = var7.getSourcePath();
    java.lang.String var10 = var7.getDestinationFilePath();
    var3.addFile(var7);
    javax.swing.table.DefaultTableModel var12 = var3.getTableModel();
    javax.swing.table.DefaultTableModel var13 = var3.getTableModel();
    minicopier.Copier var14 = new minicopier.Copier();
    var14.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var17 = new minicopier.FailedQueue(var14);
    boolean var18 = var17.isEmpty();
    minicopier.FileToTransfer var21 = new minicopier.FileToTransfer("", "");
    java.io.File var22 = var21.getDestinationFile();
    java.lang.String var23 = var21.getSourcePath();
    java.lang.String var24 = var21.getDestinationFilePath();
    var17.addFile(var21);
    javax.swing.table.DefaultTableModel var26 = var17.getTableModel();
    javax.swing.table.DefaultTableModel var27 = var17.getTableModel();
    boolean var28 = var17.isEmpty();
    minicopier.FileToTransfer var31 = new minicopier.FileToTransfer("", "");
    var17.addFile(var31);
    minicopier.Copier var33 = new minicopier.Copier();
    var33.setFileCurrentSize(1L);
    var33.setFileCurrentSize(100L);
    int var38 = var33.getTotalPercent();
    java.lang.String var40 = var33.stringURI2StringPath("hi!");
    int var41 = var33.getTotalPercent();
    minicopier.MainQueue var42 = new minicopier.MainQueue(var33);
    javax.swing.table.DefaultTableModel var43 = var42.getTableModel();
    var43.setColumnCount(0);
    int var47 = var43.findColumn("hi!\\");
    int var48 = var43.getRowCount();
    int var50 = var43.findColumn("hi!");
    minicopier.Copier var51 = new minicopier.Copier();
    var51.setFileCurrentSize(1L);
    var51.setFileCurrentSize(100L);
    java.lang.String var56 = var51.getCurrentFileSource();
    minicopier.MainQueue var57 = new minicopier.MainQueue(var51);
    minicopier.Copier var58 = new minicopier.Copier();
    var58.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var61 = new minicopier.FailedQueue(var58);
    minicopier.FileToTransfer var64 = new minicopier.FileToTransfer("", "hi!");
    var61.addFile(var64);
    javax.swing.table.DefaultTableModel var66 = var61.getTableModel();
    minicopier.Copier var67 = new minicopier.Copier();
    var67.setFileCurrentSize(1L);
    var67.setFileCurrentSize(100L);
    int var72 = var67.getTotalPercent();
    java.lang.String var74 = var67.stringURI2StringPath("hi!");
    int var75 = var67.getTotalPercent();
    minicopier.MainQueue var76 = new minicopier.MainQueue(var67);
    javax.swing.table.DefaultTableModel var77 = var76.getTableModel();
    minicopier.Copier var79 = new minicopier.Copier();
    var79.setFileCurrentSize(1L);
    var79.setFileCurrentSize(100L);
    int var84 = var79.getTotalPercent();
    java.lang.String var86 = var79.stringURI2StringPath("hi!");
    int var87 = var79.getTotalPercent();
    minicopier.MainQueue var88 = new minicopier.MainQueue(var79);
    javax.swing.table.DefaultTableModel var89 = var88.getTableModel();
    java.lang.Object[] var90 = new java.lang.Object[] { var89};
    var77.addColumn((java.lang.Object)0.0d, var90);
    var77.fireTableRowsInserted(100, 10);
    java.util.Vector var95 = var77.getDataVector();
    var66.setColumnIdentifiers(var95);
    var43.addColumn((java.lang.Object)var51, var95);
    var13.addColumn((java.lang.Object)var31, var95);
    javax.swing.event.TableModelListener[] var99 = var13.getTableModelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "\\"+ "'", var10.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "\\"+ "'", var24.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "hi!"+ "'", var74.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "hi!"+ "'", var86.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test22");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "");
    var2.changeTargetName("");
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getSourceFile();
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getDestinationFolderPath();
    long var9 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test23");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    var0.add("\\CW");
    boolean var5 = var0.isEmpty();
    int var6 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test24");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    minicopier.Copier var11 = new minicopier.Copier();
    var11.increaseFileCurrentSize((-1L));
    int var14 = var11.basketLength();
    long var15 = var11.getFileTotalSize();
    minicopier.FileToTransfer var18 = new minicopier.FileToTransfer("", "");
    java.io.File var19 = var18.getDestinationFolder();
    var11.addFolder2Queue(var19, "hi!");
    var0.addFolder2Queue(var19, "");
    var0.increaseFileCurrentSize((-9L));
    minicopier.FailedQueue var26 = new minicopier.FailedQueue(var0);
    boolean var27 = var26.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test25");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    minicopier.Copier var11 = new minicopier.Copier();
    var11.increaseFileCurrentSize((-1L));
    int var14 = var11.basketLength();
    long var15 = var11.getFileTotalSize();
    minicopier.FileToTransfer var18 = new minicopier.FileToTransfer("", "");
    java.io.File var19 = var18.getDestinationFolder();
    var11.addFolder2Queue(var19, "hi!");
    var0.addFolder2Queue(var19, "");
    minicopier.FileToTransfer var26 = new minicopier.FileToTransfer("", "");
    java.io.File var27 = var26.getDestinationFolder();
    java.lang.String var28 = var26.getDestinationFolderPath();
    java.io.File var29 = var26.getDestinationFolder();
    var0.addFolder2Queue(var29, "hi!");
    java.lang.String var32 = var0.getCurrentFileSource();
    var0.forceStart();
    var0.paste("hi!\\E");
    var0.paste("B");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test26");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    var7.changeTargetName("");
    long var10 = var7.getSize();
    java.io.File var11 = var7.getDestinationFolder();
    var0.addFolder2Queue(var11, "\\hi!");
    boolean var14 = var0.pause();
    minicopier.MainQueue var15 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var16 = var15.getTableModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test27");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.clearBasket();
    var0.increaseFileCurrentSize(100L);
    java.lang.String var8 = var0.getCurrentFileDestination();
    boolean var11 = var0.nameIsAcceptable("E", "\\hi!");
    boolean var12 = var0.pause();
    minicopier.FileToTransfer var15 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var16 = var15.getName();
    java.lang.String var17 = var15.getDestinationFilePath();
    var15.changeTargetName("hi!\\");
    java.io.File var20 = var15.getSourceFile();
    var15.changeTargetName("Source");
    minicopier.TransferTask var24 = new minicopier.TransferTask(var0, var15, true);
    java.io.File var25 = var15.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!\\"+ "'", var17.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test28");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    var0.paste("\\");
    var0.add2basket("");
    int var15 = var0.basketLength();
    minicopier.FileToTransfer var18 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var19 = var18.getName();
    java.lang.String var20 = var18.getDestinationFilePath();
    var18.changeTargetName("hi!\\");
    java.io.File var23 = var18.getSourceFile();
    java.io.File var24 = var18.getSourceFile();
    java.lang.String var25 = var18.getDestinationFolderPath();
    java.io.File var26 = var18.getSourceFile();
    var0.addFolder2Queue(var26, "K\\A");
    var0.unpause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!\\"+ "'", var20.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test29");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    int var5 = var0.getCurrentPercent();
    var0.decreaseQueueCurrentSize(9L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test30");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.setColumnCount(0);
    int var14 = var10.findColumn("hi!\\");
    var10.setColumnCount(10);
    var10.fireTableStructureChanged();
    int var18 = var10.getRowCount();
    minicopier.Copier var19 = new minicopier.Copier();
    var19.setFileCurrentSize(1L);
    var19.setFileCurrentSize(100L);
    int var24 = var19.getTotalPercent();
    java.lang.String var26 = var19.stringURI2StringPath("hi!");
    int var27 = var19.getTotalPercent();
    minicopier.MainQueue var28 = new minicopier.MainQueue(var19);
    javax.swing.table.DefaultTableModel var29 = var28.getTableModel();
    var29.setColumnCount(0);
    int var33 = var29.findColumn("hi!\\");
    int var34 = var29.getRowCount();
    minicopier.Copier var35 = new minicopier.Copier();
    var35.setFileCurrentSize(1L);
    var35.setFileCurrentSize(100L);
    int var40 = var35.getTotalPercent();
    java.lang.String var42 = var35.stringURI2StringPath("hi!");
    int var43 = var35.getTotalPercent();
    minicopier.MainQueue var44 = new minicopier.MainQueue(var35);
    javax.swing.table.DefaultTableModel var45 = var44.getTableModel();
    minicopier.Copier var46 = new minicopier.Copier();
    var46.setFileCurrentSize(1L);
    var46.setFileCurrentSize(100L);
    java.lang.Object[] var51 = new java.lang.Object[] { 100L};
    var45.addRow(var51);
    var29.addRow(var51);
    var10.setColumnIdentifiers(var51);
    int var55 = var10.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test31");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    long var5 = var0.getCurrentBytesRemaining();
    var0.forceStart();
    var0.paste("D\\D");
    var0.increaseFileCurrentSize((-99L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-100L));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test32");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.decreaseQueueCurrentSize(10L);
    java.lang.String var7 = var0.getCurrentFileDestination();
    minicopier.Copier var8 = new minicopier.Copier();
    var8.setFileCurrentSize(1L);
    var8.setFileCurrentSize(100L);
    int var13 = var8.getTotalPercent();
    java.lang.String var15 = var8.stringURI2StringPath("hi!");
    int var16 = var8.getTotalPercent();
    minicopier.MainQueue var17 = new minicopier.MainQueue(var8);
    javax.swing.table.DefaultTableModel var18 = var17.getTableModel();
    minicopier.Copier var20 = new minicopier.Copier();
    var20.setFileCurrentSize(1L);
    var20.setFileCurrentSize(100L);
    int var25 = var20.getTotalPercent();
    java.lang.String var27 = var20.stringURI2StringPath("hi!");
    int var28 = var20.getTotalPercent();
    minicopier.MainQueue var29 = new minicopier.MainQueue(var20);
    javax.swing.table.DefaultTableModel var30 = var29.getTableModel();
    java.lang.Object[] var31 = new java.lang.Object[] { var30};
    var18.addColumn((java.lang.Object)0.0d, var31);
    var18.setColumnCount(0);
    java.lang.String var36 = var18.getColumnName(0);
    minicopier.FileToTransfer var39 = new minicopier.FileToTransfer("", "");
    java.lang.String var40 = var39.getSourcePath();
    java.lang.String var41 = var39.getName();
    java.io.File var42 = var39.getSourceFile();
    var18.addColumn((java.lang.Object)var42);
    var0.addFolder2Queue(var42, "\\hi!");
    long var46 = var0.getTotalBytesRemaining();
    long var47 = var0.getFileTotalSize();
    java.lang.String var48 = var0.getCurrentFileSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "A"+ "'", var36.equals("A"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 11L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ""+ "'", var48.equals(""));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test33");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.clearBasket();
    java.lang.String var7 = var0.getCurrentFileSource();
    var0.decreaseQueueCurrentSize(11L);
    var0.clearBasket();
    long var11 = var0.readAndInitBytesCounter();
    var0.increaseFileCurrentSize((-99L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test34");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.FailedQueue var6 = new minicopier.FailedQueue(var0);
    boolean var7 = var6.isEmpty();
    javax.swing.table.DefaultTableModel var8 = var6.getTableModel();
    var8.fireTableDataChanged();
    var8.fireTableRowsUpdated(5, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test35");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.decreaseQueueCurrentSize(10L);
    java.lang.String var8 = var0.stringURI2StringPath("");
    boolean var9 = var0.pause();
    long var10 = var0.getQueueTotalSize();
    java.lang.String var12 = var0.stringURI2StringPath("");
    var0.add2basket("Source");
    var0.forceStart();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test36");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var11 = new minicopier.Copier();
    var11.setFileCurrentSize(1L);
    var11.setFileCurrentSize(100L);
    java.lang.Object[] var16 = new java.lang.Object[] { 100L};
    var10.addRow(var16);
    var10.setNumRows(0);
    var10.fireTableDataChanged();
    var10.fireTableStructureChanged();
    int var22 = var10.getRowCount();
    int var23 = var10.getColumnCount();
    minicopier.Copier var24 = new minicopier.Copier();
    var24.setFileCurrentSize(1L);
    var24.setFileCurrentSize(100L);
    int var29 = var24.getTotalPercent();
    java.lang.String var31 = var24.stringURI2StringPath("hi!");
    int var32 = var24.getTotalPercent();
    minicopier.MainQueue var33 = new minicopier.MainQueue(var24);
    javax.swing.table.DefaultTableModel var34 = var33.getTableModel();
    var34.setColumnCount(0);
    int var38 = var34.findColumn("hi!\\");
    var34.setColumnCount(10);
    var34.fireTableStructureChanged();
    int var42 = var34.getRowCount();
    java.util.Vector var43 = var34.getDataVector();
    java.lang.Class var45 = var34.getColumnClass(5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var46 = var10.<java.util.EventListener>getListeners(var45);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test37");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    int var3 = var0.getLength();
    boolean var4 = var0.isEmpty();
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test38");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    long var2 = var0.readAndInitBytesCounter();
    long var3 = var0.readAndInitBytesCounter();
    int var4 = var0.basketLength();
    long var5 = var0.getCurrentBytesRemaining();
    var0.paste("A");
    minicopier.MainQueue var8 = new minicopier.MainQueue(var0);
    minicopier.FailedQueue var9 = new minicopier.FailedQueue(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test39");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    java.lang.String var4 = var0.stringURI2StringPath("hi!");
    var0.setFileCurrentSize((-100L));
    long var7 = var0.getFileTotalSize();
    var0.addURIString2basket("hi!");
    long var10 = var0.getCurrentBytesRemaining();
    int var11 = var0.getTotalPercent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test40");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(0L);
    long var8 = var0.readAndInitBytesCounter();
    boolean var9 = var0.getPause();
    var0.unpause();
    boolean var11 = var0.getBusy();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test41");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var11 = new minicopier.Copier();
    var11.setFileCurrentSize(1L);
    var11.setFileCurrentSize(100L);
    java.lang.Object[] var16 = new java.lang.Object[] { 100L};
    var10.addRow(var16);
    var10.setNumRows(0);
    var10.fireTableDataChanged();
    var10.fireTableStructureChanged();
    java.lang.Class var23 = var10.getColumnClass((-1));
    javax.swing.event.TableModelListener[] var24 = var10.getTableModelListeners();
    var10.fireTableRowsInserted(4, 2);
    java.lang.String var29 = var10.getColumnName(5);
    minicopier.Copier var30 = new minicopier.Copier();
    var30.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var33 = new minicopier.FailedQueue(var30);
    long var34 = var30.getCurrentBytesRemaining();
    java.lang.String var36 = var30.stringURI2StringPath("hi!");
    boolean var37 = var30.getPause();
    var30.clearBasket();
    long var39 = var30.getCurrentBytesRemaining();
    var30.forceStart();
    long var41 = var30.readAndInitBytesCounter();
    boolean var42 = var30.pause();
    var10.addColumn((java.lang.Object)var30);
    var10.setRowCount(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "F"+ "'", var29.equals("F"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test42");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    boolean var5 = var0.getPause();
    long var6 = var0.getQueueTotalSize();
    minicopier.MainQueue var7 = new minicopier.MainQueue(var0);
    int var8 = var0.getTotalPercent();
    var0.setFileCurrentSize(11L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test43");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.increaseQueueCurrentSize((-1L));
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    java.lang.String var9 = var7.getDestinationFolderPath();
    java.io.File var10 = var7.getDestinationFolder();
    minicopier.TransferTask var12 = new minicopier.TransferTask(var0, var7, true);
    var12.setCancelAndQueue(false);
    boolean var15 = var12.getCancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test44");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.FailedQueue var6 = new minicopier.FailedQueue(var0);
    var0.decreaseQueueCurrentSize(11L);
    var0.clearBasket();
    boolean var10 = var0.pause();
    java.lang.String var11 = var0.getCurrentFileSource();
    java.lang.String var12 = var0.getCurrentFileSource();
    var0.addURIString2basket("G");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test45");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.setColumnCount(0);
    int var14 = var10.findColumn("hi!\\");
    int var15 = var10.getRowCount();
    minicopier.Copier var16 = new minicopier.Copier();
    var16.setFileCurrentSize(1L);
    var16.setFileCurrentSize(100L);
    int var21 = var16.getTotalPercent();
    java.lang.String var23 = var16.stringURI2StringPath("hi!");
    int var24 = var16.getTotalPercent();
    minicopier.MainQueue var25 = new minicopier.MainQueue(var16);
    javax.swing.table.DefaultTableModel var26 = var25.getTableModel();
    minicopier.Copier var27 = new minicopier.Copier();
    var27.setFileCurrentSize(1L);
    var27.setFileCurrentSize(100L);
    java.lang.Object[] var32 = new java.lang.Object[] { 100L};
    var26.addRow(var32);
    var10.addRow(var32);
    var10.fireTableStructureChanged();
    int var37 = var10.findColumn("A\\hi!");
    var10.fireTableRowsDeleted(100, 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test46");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    var0.paste("hi!");
    java.lang.String var6 = var0.getCurrentFileSource();
    var0.decreaseQueueCurrentSize((-20L));
    long var9 = var0.getQueueTotalSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test47");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    boolean var10 = var0.nameIsAcceptable("", "\\");
    long var11 = var0.getCurrentBytesRemaining();
    java.lang.String var12 = var0.getCurrentFileSource();
    var0.unpause();
    var0.paste("Destination");
    var0.clearBasket();
    boolean var17 = var0.getPause();
    minicopier.FileToTransfer var20 = new minicopier.FileToTransfer("", "");
    var20.changeTargetName("");
    long var23 = var20.getSize();
    java.lang.String var24 = var20.getDestinationFolderPath();
    java.io.File var25 = var20.getDestinationFolder();
    java.io.File var26 = var20.getDestinationFile();
    java.lang.String var27 = var20.getName();
    java.lang.String var28 = var20.getName();
    minicopier.TransferTask var30 = new minicopier.TransferTask(var0, var20, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test48");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!", "A\\hi!");

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test49");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.clearBasket();
    java.lang.String var7 = var0.getCurrentFileSource();
    long var8 = var0.getCurrentBytesRemaining();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    minicopier.Copier var10 = new minicopier.Copier();
    var10.setFileCurrentSize(1L);
    var10.setFileCurrentSize(100L);
    int var15 = var10.getTotalPercent();
    java.lang.String var17 = var10.stringURI2StringPath("hi!");
    int var18 = var10.getTotalPercent();
    minicopier.MainQueue var19 = new minicopier.MainQueue(var10);
    javax.swing.table.DefaultTableModel var20 = var19.getTableModel();
    var20.setColumnCount(0);
    int var24 = var20.findColumn("hi!\\");
    javax.swing.event.TableModelListener[] var25 = var20.getTableModelListeners();
    minicopier.MainQueue.TransfersModel var27 = var9.new TransfersModel((java.lang.Object[])var25, 10);
    var27.fireTableRowsDeleted(2, 9);
    var27.fireTableRowsDeleted(100, (-1));
    boolean var36 = var27.isCellEditable(11, 4);
    int var38 = var27.findColumn("G");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test50");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    java.lang.Object[] var23 = new java.lang.Object[] { var22};
    var10.addColumn((java.lang.Object)0.0d, var23);
    var10.setColumnCount(0);
    java.lang.String var28 = var10.getColumnName(100);
    java.lang.Class var30 = var10.getColumnClass(1);
    int var31 = var10.getRowCount();
    minicopier.Copier var32 = new minicopier.Copier();
    var32.setFileCurrentSize(1L);
    var32.setFileCurrentSize(100L);
    int var37 = var32.getTotalPercent();
    java.lang.String var39 = var32.stringURI2StringPath("hi!");
    int var40 = var32.getTotalPercent();
    minicopier.MainQueue var41 = new minicopier.MainQueue(var32);
    javax.swing.table.DefaultTableModel var42 = var41.getTableModel();
    var42.setColumnCount(0);
    int var46 = var42.findColumn("hi!\\");
    int var47 = var42.getRowCount();
    minicopier.Copier var48 = new minicopier.Copier();
    var48.setFileCurrentSize(1L);
    var48.setFileCurrentSize(100L);
    int var53 = var48.getTotalPercent();
    java.lang.String var55 = var48.stringURI2StringPath("hi!");
    int var56 = var48.getTotalPercent();
    minicopier.MainQueue var57 = new minicopier.MainQueue(var48);
    javax.swing.table.DefaultTableModel var58 = var57.getTableModel();
    var58.setColumnCount(0);
    int var62 = var58.findColumn("hi!\\");
    var58.setColumnCount(10);
    var58.fireTableStructureChanged();
    int var66 = var58.getRowCount();
    java.util.Vector var67 = var58.getDataVector();
    var42.setColumnIdentifiers(var67);
    var10.addRow(var67);
    int var70 = var10.getRowCount();
    var10.fireTableRowsInserted(0, 11);
    var10.fireTableRowsUpdated(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "CW"+ "'", var28.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 2);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test51");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(0L);
    long var8 = var0.readAndInitBytesCounter();
    var0.paste("D");
    minicopier.FileToTransfer var13 = new minicopier.FileToTransfer("", "");
    java.lang.String var14 = var13.getName();
    var13.changeTargetName("\\CW");
    minicopier.TransferTask var18 = new minicopier.TransferTask(var0, var13, true);
    var0.setFileCurrentSize(11L);
    boolean var21 = var0.getPause();
    long var22 = var0.getCurrentBytesRemaining();
    java.lang.String var24 = var0.stringURI2StringPath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-11L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test52");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("Source", "K");
    java.lang.String var3 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "K\\Source"+ "'", var3.equals("K\\Source"));

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test53");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.setColumnCount(0);
    int var14 = var10.findColumn("hi!\\");
    minicopier.FileToTransfer var17 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var18 = var17.getName();
    java.lang.String var19 = var17.getDestinationFilePath();
    java.lang.String var20 = var17.getSourcePath();
    long var21 = var17.getSize();
    minicopier.Copier var22 = new minicopier.Copier();
    var22.setFileCurrentSize(1L);
    var22.setFileCurrentSize(100L);
    int var27 = var22.getTotalPercent();
    java.lang.String var29 = var22.stringURI2StringPath("hi!");
    int var30 = var22.getTotalPercent();
    minicopier.MainQueue var31 = new minicopier.MainQueue(var22);
    javax.swing.table.DefaultTableModel var32 = var31.getTableModel();
    minicopier.Copier var34 = new minicopier.Copier();
    var34.setFileCurrentSize(1L);
    var34.setFileCurrentSize(100L);
    int var39 = var34.getTotalPercent();
    java.lang.String var41 = var34.stringURI2StringPath("hi!");
    int var42 = var34.getTotalPercent();
    minicopier.MainQueue var43 = new minicopier.MainQueue(var34);
    javax.swing.table.DefaultTableModel var44 = var43.getTableModel();
    java.lang.Object[] var45 = new java.lang.Object[] { var44};
    var32.addColumn((java.lang.Object)0.0d, var45);
    var32.setColumnCount(0);
    java.lang.String var50 = var32.getColumnName(100);
    java.util.Vector var51 = var32.getDataVector();
    var10.addColumn((java.lang.Object)var21, var51);
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
    var63.setNumRows(0);
    minicopier.Copier var73 = new minicopier.Copier();
    var73.setFileCurrentSize(1L);
    var73.setFileCurrentSize(100L);
    int var78 = var73.getTotalPercent();
    java.lang.String var80 = var73.stringURI2StringPath("hi!");
    int var81 = var73.getTotalPercent();
    minicopier.MainQueue var82 = new minicopier.MainQueue(var73);
    javax.swing.table.DefaultTableModel var83 = var82.getTableModel();
    minicopier.Copier var84 = new minicopier.Copier();
    var84.setFileCurrentSize(1L);
    var84.setFileCurrentSize(100L);
    java.lang.Object[] var89 = new java.lang.Object[] { 100L};
    var83.addRow(var89);
    var63.addRow(var89);
    java.util.Vector var92 = var63.getDataVector();
    var10.addRow(var92);
    int var94 = var10.getRowCount();
    java.lang.Class var96 = var10.getColumnClass(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!\\"+ "'", var19.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "CW"+ "'", var50.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "hi!"+ "'", var80.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test54");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    boolean var10 = var0.nameIsAcceptable("", "\\");
    long var11 = var0.getCurrentBytesRemaining();
    java.lang.String var12 = var0.getCurrentFileSource();
    var0.increaseFileCurrentSize(2L);
    int var15 = var0.getTotalPercent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test55");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = var6.getDestinationFilePath();
    minicopier.TransferTask var10 = new minicopier.TransferTask(var0, var6, false);
    boolean var11 = var10.getCompleted();
    boolean var12 = var10.getCompleted();
    boolean var13 = var10.getCompleted();
    var10.setPause();
    var10.setCancelAndQueue(true);
    var10.setCancelAndQueue(true);
    boolean var19 = var10.getCancel();
    boolean var20 = var10.getCompleted();
    boolean var21 = var10.getCompleted();
    boolean var22 = var10.getPutInQueue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\"+ "'", var8.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test56");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.decreaseQueueCurrentSize(10L);
    var0.paste("hi!\\");
    var0.setFileCurrentSize(1L);
    minicopier.MainQueue var11 = new minicopier.MainQueue(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      minicopier.FileToTransfer var12 = var11.extractFirst();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test57");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    var0.forceStart();
    long var3 = var0.getFileTotalSize();
    int var4 = var0.getCurrentPercent();
    var0.paste2URIString("K");
    var0.increaseQueueCurrentSize((-20L));
    var0.unpause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test58");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    boolean var5 = var0.getPause();
    minicopier.FailedQueue var6 = new minicopier.FailedQueue(var0);
    long var7 = var0.getCurrentBytesRemaining();
    long var8 = var0.getFileTotalSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test59");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var11 = new minicopier.Copier();
    var11.setFileCurrentSize(1L);
    var11.setFileCurrentSize(100L);
    java.lang.Object[] var16 = new java.lang.Object[] { 100L};
    var10.addRow(var16);
    var10.setNumRows(0);
    var10.fireTableDataChanged();
    var10.fireTableStructureChanged();
    var10.fireTableStructureChanged();
    int var24 = var10.findColumn("");
    java.lang.String var26 = var10.getColumnName(3);
    minicopier.Copier var27 = new minicopier.Copier();
    var27.setFileCurrentSize(1L);
    var27.setFileCurrentSize(100L);
    int var32 = var27.getTotalPercent();
    java.lang.String var34 = var27.stringURI2StringPath("hi!");
    int var35 = var27.getTotalPercent();
    minicopier.MainQueue var36 = new minicopier.MainQueue(var27);
    javax.swing.table.DefaultTableModel var37 = var36.getTableModel();
    var37.fireTableRowsInserted(1, 0);
    int var42 = var37.findColumn("CW");
    var37.setRowCount(0);
    minicopier.FileToTransfer var47 = new minicopier.FileToTransfer("", "");
    java.lang.String var48 = var47.getName();
    var47.changeTargetName("\\CW");
    var47.changeTargetName("A");
    minicopier.Copier var53 = new minicopier.Copier();
    var53.setFileCurrentSize(1L);
    var53.setFileCurrentSize(100L);
    int var58 = var53.getTotalPercent();
    java.lang.String var60 = var53.stringURI2StringPath("hi!");
    int var61 = var53.getTotalPercent();
    minicopier.MainQueue var62 = new minicopier.MainQueue(var53);
    javax.swing.table.DefaultTableModel var63 = var62.getTableModel();
    var63.fireTableRowsInserted(1, 0);
    var63.fireTableStructureChanged();
    minicopier.Copier var68 = new minicopier.Copier();
    var68.setFileCurrentSize(1L);
    var68.setFileCurrentSize(100L);
    int var73 = var68.getTotalPercent();
    var68.clearBasket();
    java.lang.Object[] var75 = new java.lang.Object[] { var68};
    var63.addRow(var75);
    var63.fireTableRowsUpdated(3, 10);
    java.util.Vector var80 = var63.getDataVector();
    var37.addColumn((java.lang.Object)var47, var80);
    var10.addRow(var80);
    var10.fireTableRowsInserted(99, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "D"+ "'", var26.equals("D"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ""+ "'", var48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test60");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    var7.changeTargetName("");
    long var10 = var7.getSize();
    java.io.File var11 = var7.getDestinationFolder();
    var0.addFolder2Queue(var11, "\\hi!");
    long var14 = var0.getQueueTotalSize();
    var0.paste("Source");
    java.lang.String var17 = var0.getCurrentFileSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test61");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    javax.swing.table.DefaultTableModel var12 = var9.getTableModel();
    var12.setRowCount(0);
    java.util.Vector var15 = var12.getDataVector();
    int var17 = var12.findColumn("\\hi!");
    minicopier.Copier var18 = new minicopier.Copier();
    var18.setFileCurrentSize(1L);
    var18.setFileCurrentSize(100L);
    int var23 = var18.getTotalPercent();
    java.lang.String var25 = var18.stringURI2StringPath("hi!");
    int var26 = var18.getTotalPercent();
    minicopier.MainQueue var27 = new minicopier.MainQueue(var18);
    javax.swing.table.DefaultTableModel var28 = var27.getTableModel();
    minicopier.Copier var30 = new minicopier.Copier();
    var30.setFileCurrentSize(1L);
    var30.setFileCurrentSize(100L);
    int var35 = var30.getTotalPercent();
    java.lang.String var37 = var30.stringURI2StringPath("hi!");
    int var38 = var30.getTotalPercent();
    minicopier.MainQueue var39 = new minicopier.MainQueue(var30);
    javax.swing.table.DefaultTableModel var40 = var39.getTableModel();
    java.lang.Object[] var41 = new java.lang.Object[] { var40};
    var28.addColumn((java.lang.Object)0.0d, var41);
    var28.fireTableRowsInserted(100, 10);
    java.lang.String var47 = var28.getColumnName(100);
    java.lang.String var49 = var28.getColumnName(100);
    minicopier.Copier var50 = new minicopier.Copier();
    var50.setFileCurrentSize(1L);
    var50.setFileCurrentSize(100L);
    int var55 = var50.getTotalPercent();
    java.lang.String var57 = var50.stringURI2StringPath("hi!");
    int var58 = var50.getTotalPercent();
    minicopier.MainQueue var59 = new minicopier.MainQueue(var50);
    javax.swing.table.DefaultTableModel var60 = var59.getTableModel();
    var60.setColumnCount(0);
    int var64 = var60.findColumn("hi!\\");
    minicopier.Copier var65 = new minicopier.Copier();
    var65.setFileCurrentSize(1L);
    var65.setFileCurrentSize(100L);
    int var70 = var65.getTotalPercent();
    java.lang.String var72 = var65.stringURI2StringPath("hi!");
    int var73 = var65.getTotalPercent();
    minicopier.MainQueue var74 = new minicopier.MainQueue(var65);
    javax.swing.table.DefaultTableModel var75 = var74.getTableModel();
    minicopier.Copier var76 = new minicopier.Copier();
    var76.setFileCurrentSize(1L);
    var76.setFileCurrentSize(100L);
    java.lang.Object[] var81 = new java.lang.Object[] { 100L};
    var75.addRow(var81);
    var60.setColumnIdentifiers(var81);
    java.util.Vector var84 = var60.getDataVector();
    var28.setColumnIdentifiers(var84);
    var12.setColumnIdentifiers(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "CW"+ "'", var47.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "CW"+ "'", var49.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!"+ "'", var57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test62");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    long var2 = var0.readAndInitBytesCounter();
    long var3 = var0.readAndInitBytesCounter();
    var0.increaseFileCurrentSize(100L);
    boolean var8 = var0.nameIsAcceptable("", "CW");
    minicopier.FileToTransfer var11 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var12 = var11.getName();
    java.lang.String var13 = var11.getDestinationFilePath();
    minicopier.TransferTask var15 = new minicopier.TransferTask(var0, var11, false);
    var15.setCancelAndQueue(false);
    var15.setPause();
    var15.setPause();
    var15.unpause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\"+ "'", var13.equals("hi!\\"));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test63");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.increaseFileCurrentSize(9L);
    minicopier.FailedQueue var5 = new minicopier.FailedQueue(var0);
    minicopier.FailedQueue var6 = new minicopier.FailedQueue(var0);
    boolean var7 = var6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test64");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var7 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test65");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var11 = new minicopier.Copier();
    var11.setFileCurrentSize(1L);
    var11.setFileCurrentSize(100L);
    int var16 = var11.getTotalPercent();
    java.lang.String var18 = var11.stringURI2StringPath("hi!");
    int var19 = var11.getTotalPercent();
    minicopier.MainQueue var20 = new minicopier.MainQueue(var11);
    javax.swing.table.DefaultTableModel var21 = var20.getTableModel();
    minicopier.Copier var22 = new minicopier.Copier();
    var22.setFileCurrentSize(1L);
    var22.setFileCurrentSize(100L);
    java.lang.Object[] var27 = new java.lang.Object[] { 100L};
    var21.addRow(var27);
    java.lang.Object[][] var29 = new java.lang.Object[][] { var27};
    minicopier.FileToTransfer var32 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var33 = var32.getName();
    java.lang.Object[] var34 = new java.lang.Object[] { var33};
    var10.setDataVector(var29, var34);
    int var36 = var10.getColumnCount();
    java.lang.String var38 = var10.getColumnName(2);
    javax.swing.event.TableModelListener[] var39 = var10.getTableModelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "C"+ "'", var38.equals("C"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test66");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    long var4 = var0.getCurrentBytesRemaining();
    java.lang.String var6 = var0.stringURI2StringPath("hi!");
    var0.increaseQueueCurrentSize(100L);
    var0.unpause();
    boolean var10 = var0.getBusy();
    var0.increaseQueueCurrentSize(10L);
    boolean var13 = var0.getBusy();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test67");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    long var2 = var0.readAndInitBytesCounter();
    long var3 = var0.readAndInitBytesCounter();
    var0.unpause();
    minicopier.MainQueue var5 = new minicopier.MainQueue(var0);
    minicopier.Copier var6 = new minicopier.Copier();
    var6.setFileCurrentSize(1L);
    var6.setFileCurrentSize(100L);
    int var11 = var6.getTotalPercent();
    var6.increaseFileCurrentSize(0L);
    long var14 = var6.readAndInitBytesCounter();
    var6.unpause();
    long var16 = var6.getTotalBytesRemaining();
    minicopier.MainQueue var17 = new minicopier.MainQueue(var6);
    minicopier.Copier var18 = new minicopier.Copier();
    var18.increaseFileCurrentSize((-1L));
    int var21 = var18.basketLength();
    var18.paste("hi!");
    boolean var24 = var18.pause();
    boolean var25 = var18.pause();
    minicopier.MainQueue var26 = new minicopier.MainQueue(var18);
    minicopier.Copier var27 = new minicopier.Copier();
    var27.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var30 = new minicopier.FailedQueue(var27);
    minicopier.Copier var31 = new minicopier.Copier();
    var31.setFileCurrentSize(1L);
    var31.setFileCurrentSize(100L);
    int var36 = var31.getTotalPercent();
    java.lang.String var38 = var31.stringURI2StringPath("hi!");
    int var39 = var31.getTotalPercent();
    minicopier.MainQueue var40 = new minicopier.MainQueue(var31);
    boolean var41 = var40.isEmpty();
    boolean var42 = var40.isEmpty();
    minicopier.Copier var43 = new minicopier.Copier();
    var43.setFileCurrentSize(1L);
    var43.setFileCurrentSize(100L);
    java.lang.String var48 = var43.getCurrentFileSource();
    minicopier.MainQueue var49 = new minicopier.MainQueue(var43);
    minicopier.Copier var50 = new minicopier.Copier();
    var50.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var53 = new minicopier.FailedQueue(var50);
    boolean var54 = var53.isEmpty();
    int[] var55 = new int[] { };
    int[] var56 = var53.remove(var55);
    int[] var57 = var49.remove(var55);
    int[] var58 = var40.putLast(var55);
    int[] var59 = var30.retry(var55);
    int[] var60 = var26.putFirst(var55);
    int[] var61 = var17.putLast(var55);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var62 = var5.remove(var61);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ""+ "'", var48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test68");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.MainQueue var6 = new minicopier.MainQueue(var0);
    minicopier.Copier var7 = new minicopier.Copier();
    var7.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var10 = new minicopier.FailedQueue(var7);
    boolean var11 = var10.isEmpty();
    int[] var12 = new int[] { };
    int[] var13 = var10.remove(var12);
    int[] var14 = var6.remove(var12);
    minicopier.Copier var15 = new minicopier.Copier();
    var15.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var18 = new minicopier.FailedQueue(var15);
    boolean var19 = var18.isEmpty();
    int[] var20 = new int[] { };
    int[] var21 = var18.remove(var20);
    int[] var22 = var6.putFirst(var20);
    boolean var23 = var6.isEmpty();
    minicopier.Copier var24 = new minicopier.Copier();
    var24.setFileCurrentSize(1L);
    var24.setFileCurrentSize(100L);
    int var29 = var24.getTotalPercent();
    java.lang.String var31 = var24.stringURI2StringPath("hi!");
    int var32 = var24.getTotalPercent();
    minicopier.MainQueue var33 = new minicopier.MainQueue(var24);
    javax.swing.table.DefaultTableModel var34 = var33.getTableModel();
    minicopier.Copier var36 = new minicopier.Copier();
    var36.setFileCurrentSize(1L);
    var36.setFileCurrentSize(100L);
    int var41 = var36.getTotalPercent();
    java.lang.String var43 = var36.stringURI2StringPath("hi!");
    int var44 = var36.getTotalPercent();
    minicopier.MainQueue var45 = new minicopier.MainQueue(var36);
    javax.swing.table.DefaultTableModel var46 = var45.getTableModel();
    java.lang.Object[] var47 = new java.lang.Object[] { var46};
    var34.addColumn((java.lang.Object)0.0d, var47);
    var34.setColumnCount(0);
    java.lang.String var52 = var34.getColumnName(100);
    java.lang.Class var54 = var34.getColumnClass(1);
    int var55 = var34.getColumnCount();
    javax.swing.event.TableModelListener[] var56 = var34.getTableModelListeners();
    minicopier.MainQueue.TransfersModel var58 = var6.new TransfersModel((java.lang.Object[])var56, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var58.setColumnCount((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "CW"+ "'", var52.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test69");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var6 = var0.getCurrentFileSource();
    java.lang.String var7 = var0.getCurrentFileSource();
    boolean var8 = var0.getBusy();
    minicopier.FailedQueue var9 = new minicopier.FailedQueue(var0);
    long var10 = var0.getQueueTotalSize();
    long var11 = var0.getTotalBytesRemaining();
    boolean var12 = var0.pause();
    var0.clearBasket();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test70");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    long var2 = var0.readAndInitBytesCounter();
    long var3 = var0.getCurrentBytesRemaining();
    minicopier.FailedQueue var4 = new minicopier.FailedQueue(var0);
    boolean var5 = var4.isEmpty();
    minicopier.Copier var6 = new minicopier.Copier();
    var6.increaseFileCurrentSize((-1L));
    var6.add2basket("");
    var6.increaseFileCurrentSize(10L);
    var6.clearBasket();
    minicopier.FileToTransfer var16 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var17 = var16.getName();
    java.lang.String var18 = var16.getDestinationFilePath();
    var16.changeTargetName("hi!\\");
    java.io.File var21 = var16.getSourceFile();
    java.lang.String var22 = var16.getName();
    minicopier.TransferTask var24 = new minicopier.TransferTask(var6, var16, true);
    java.lang.String var25 = var16.getDestinationFolderPath();
    var4.addFile(var16);
    boolean var27 = var4.isEmpty();
    javax.swing.table.DefaultTableModel var28 = var4.getTableModel();
    var28.fireTableRowsInserted(4, 9);
    int var33 = var28.findColumn("\\");
    minicopier.Copier var34 = new minicopier.Copier();
    var34.setFileCurrentSize(1L);
    var34.setFileCurrentSize(100L);
    int var39 = var34.getTotalPercent();
    java.lang.String var41 = var34.stringURI2StringPath("hi!");
    int var42 = var34.getTotalPercent();
    minicopier.MainQueue var43 = new minicopier.MainQueue(var34);
    javax.swing.table.DefaultTableModel var44 = var43.getTableModel();
    var44.fireTableRowsInserted(1, 0);
    int var49 = var44.findColumn("CW");
    var44.setRowCount(0);
    var44.setColumnCount(1);
    minicopier.Copier var54 = new minicopier.Copier();
    var54.setFileCurrentSize(1L);
    java.lang.String var58 = var54.stringURI2StringPath("hi!");
    minicopier.FailedQueue var59 = new minicopier.FailedQueue(var54);
    javax.swing.table.DefaultTableModel var60 = var59.getTableModel();
    minicopier.Copier var61 = new minicopier.Copier();
    var61.setFileCurrentSize(1L);
    var61.setFileCurrentSize(100L);
    int var66 = var61.getTotalPercent();
    java.lang.String var68 = var61.stringURI2StringPath("hi!");
    int var69 = var61.getTotalPercent();
    minicopier.MainQueue var70 = new minicopier.MainQueue(var61);
    javax.swing.table.DefaultTableModel var71 = var70.getTableModel();
    minicopier.Copier var72 = new minicopier.Copier();
    var72.setFileCurrentSize(1L);
    var72.setFileCurrentSize(100L);
    java.lang.Object[] var77 = new java.lang.Object[] { 100L};
    var71.addRow(var77);
    var71.setNumRows(0);
    var71.fireTableDataChanged();
    var71.fireTableStructureChanged();
    var71.fireTableStructureChanged();
    java.lang.Class var85 = var71.getColumnClass(0);
    javax.swing.event.TableModelListener[] var86 = var71.getTableModelListeners();
    var60.setColumnIdentifiers((java.lang.Object[])var86);
    var44.setColumnIdentifiers((java.lang.Object[])var86);
    var28.setColumnIdentifiers((java.lang.Object[])var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!\\"+ "'", var18.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "hi!"+ "'", var68.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test71");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(0L);
    long var8 = var0.readAndInitBytesCounter();
    boolean var9 = var0.getPause();
    var0.paste("CW");
    var0.addURIString2basket("K");
    minicopier.MainQueue var14 = new minicopier.MainQueue(var0);
    minicopier.Copier var15 = new minicopier.Copier();
    var15.setFileCurrentSize(1L);
    var15.setFileCurrentSize(100L);
    int var20 = var15.getTotalPercent();
    java.lang.String var22 = var15.stringURI2StringPath("hi!");
    int var23 = var15.getTotalPercent();
    minicopier.MainQueue var24 = new minicopier.MainQueue(var15);
    javax.swing.table.DefaultTableModel var25 = var24.getTableModel();
    var25.setColumnCount(0);
    int var29 = var25.findColumn("hi!\\");
    int var30 = var25.getRowCount();
    minicopier.Copier var31 = new minicopier.Copier();
    var31.setFileCurrentSize(1L);
    var31.setFileCurrentSize(100L);
    int var36 = var31.getTotalPercent();
    java.lang.String var38 = var31.stringURI2StringPath("hi!");
    int var39 = var31.getTotalPercent();
    minicopier.MainQueue var40 = new minicopier.MainQueue(var31);
    javax.swing.table.DefaultTableModel var41 = var40.getTableModel();
    minicopier.Copier var42 = new minicopier.Copier();
    var42.setFileCurrentSize(1L);
    var42.setFileCurrentSize(100L);
    java.lang.Object[] var47 = new java.lang.Object[] { 100L};
    var41.addRow(var47);
    var25.addRow(var47);
    java.lang.Class var51 = var25.getColumnClass(4);
    int var52 = var25.getColumnCount();
    javax.swing.event.TableModelListener[] var53 = var25.getTableModelListeners();
    minicopier.MainQueue.TransfersModel var55 = var14.new TransfersModel((java.lang.Object[])var53, 0);
    var55.fireTableRowsUpdated(9, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test72");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    var0.paste("hi!");
    var0.paste("hi!\\hi!\\");
    var0.forceStart();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    long var10 = var0.getFileTotalSize();
    var0.setFileCurrentSize(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test73");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    var3.addFile(var6);
    javax.swing.table.DefaultTableModel var8 = var3.getTableModel();
    javax.swing.table.DefaultTableModel var9 = var3.getTableModel();
    var9.moveRow(11, 0, 10);
    minicopier.Copier var15 = new minicopier.Copier();
    var15.setFileCurrentSize(1L);
    var15.setFileCurrentSize(100L);
    int var20 = var15.getTotalPercent();
    java.lang.String var22 = var15.stringURI2StringPath("hi!");
    int var23 = var15.getTotalPercent();
    minicopier.MainQueue var24 = new minicopier.MainQueue(var15);
    javax.swing.table.DefaultTableModel var25 = var24.getTableModel();
    var25.fireTableRowsInserted(1, 0);
    var25.fireTableStructureChanged();
    minicopier.Copier var30 = new minicopier.Copier();
    var30.setFileCurrentSize(1L);
    var30.setFileCurrentSize(100L);
    int var35 = var30.getTotalPercent();
    var30.clearBasket();
    java.lang.Object[] var37 = new java.lang.Object[] { var30};
    var25.addRow(var37);
    var9.insertRow(1, var37);
    java.lang.Class var41 = var9.getColumnClass((-1));
    var9.setRowCount(99);
    var9.fireTableRowsDeleted(2, 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test74");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var11 = new minicopier.Copier();
    var11.setFileCurrentSize(1L);
    var11.setFileCurrentSize(100L);
    java.lang.Object[] var16 = new java.lang.Object[] { 100L};
    var10.addRow(var16);
    var10.setNumRows(0);
    var10.fireTableDataChanged();
    var10.fireTableStructureChanged();
    java.lang.Class var23 = var10.getColumnClass((-1));
    var10.setNumRows(0);
    int var26 = var10.getRowCount();
    int var28 = var10.findColumn("hi!\\D");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var31 = var10.getValueAt(10, 5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test75");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var11 = new minicopier.Copier();
    var11.setFileCurrentSize(1L);
    var11.setFileCurrentSize(100L);
    java.lang.Object[] var16 = new java.lang.Object[] { 100L};
    var10.addRow(var16);
    var10.setNumRows(0);
    var10.fireTableDataChanged();
    var10.fireTableStructureChanged();
    var10.fireTableStructureChanged();
    minicopier.Copier var23 = new minicopier.Copier();
    var23.setFileCurrentSize(1L);
    var23.setFileCurrentSize(100L);
    int var28 = var23.getTotalPercent();
    java.lang.String var30 = var23.stringURI2StringPath("hi!");
    int var31 = var23.getTotalPercent();
    minicopier.MainQueue var32 = new minicopier.MainQueue(var23);
    javax.swing.table.DefaultTableModel var33 = var32.getTableModel();
    minicopier.Copier var34 = new minicopier.Copier();
    var34.setFileCurrentSize(1L);
    var34.setFileCurrentSize(100L);
    java.lang.Object[] var39 = new java.lang.Object[] { 100L};
    var33.addRow(var39);
    var33.moveRow(100, (-1), 100);
    minicopier.Copier var45 = new minicopier.Copier();
    var45.setFileCurrentSize(1L);
    var45.setFileCurrentSize(100L);
    int var50 = var45.getTotalPercent();
    java.lang.String var52 = var45.stringURI2StringPath("hi!");
    int var53 = var45.getTotalPercent();
    minicopier.MainQueue var54 = new minicopier.MainQueue(var45);
    javax.swing.table.DefaultTableModel var55 = var54.getTableModel();
    var55.fireTableRowsInserted(1, 0);
    var55.fireTableDataChanged();
    var55.setNumRows(1);
    java.util.Vector var62 = var55.getDataVector();
    var10.addColumn((java.lang.Object)100, var62);
    var10.fireTableRowsUpdated((-1), 2);
    var10.fireTableRowsInserted(10, 100);
    java.lang.String var71 = var10.getColumnName(100);
    javax.swing.event.TableModelListener[] var72 = var10.getTableModelListeners();
    minicopier.Copier var73 = new minicopier.Copier();
    var73.setFileCurrentSize(1L);
    var73.setFileCurrentSize(100L);
    int var78 = var73.getTotalPercent();
    java.lang.String var80 = var73.stringURI2StringPath("hi!");
    int var81 = var73.getTotalPercent();
    minicopier.MainQueue var82 = new minicopier.MainQueue(var73);
    javax.swing.table.DefaultTableModel var83 = var82.getTableModel();
    var83.setColumnCount(0);
    int var87 = var83.findColumn("hi!\\");
    int var89 = var83.findColumn("hi!\\");
    javax.swing.event.TableModelListener[] var90 = var83.getTableModelListeners();
    var10.addRow((java.lang.Object[])var90);
    var10.setNumRows(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "CW"+ "'", var71.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "hi!"+ "'", var80.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test76");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var11 = new minicopier.Copier();
    var11.setFileCurrentSize(1L);
    var11.setFileCurrentSize(100L);
    java.lang.Object[] var16 = new java.lang.Object[] { 100L};
    var10.addRow(var16);
    var10.setNumRows(0);
    var10.fireTableDataChanged();
    var10.fireTableStructureChanged();
    java.lang.Class var23 = var10.getColumnClass((-1));
    var10.setNumRows(0);
    minicopier.Copier var26 = new minicopier.Copier();
    var26.setFileCurrentSize(1L);
    var26.setFileCurrentSize(100L);
    int var31 = var26.getTotalPercent();
    java.lang.String var33 = var26.stringURI2StringPath("hi!");
    int var34 = var26.getTotalPercent();
    minicopier.MainQueue var35 = new minicopier.MainQueue(var26);
    javax.swing.table.DefaultTableModel var36 = var35.getTableModel();
    var36.setColumnCount(0);
    int var40 = var36.findColumn("hi!\\");
    int var41 = var36.getRowCount();
    int var43 = var36.findColumn("hi!");
    minicopier.Copier var44 = new minicopier.Copier();
    var44.setFileCurrentSize(1L);
    var44.setFileCurrentSize(100L);
    java.lang.String var49 = var44.getCurrentFileSource();
    minicopier.MainQueue var50 = new minicopier.MainQueue(var44);
    minicopier.Copier var51 = new minicopier.Copier();
    var51.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var54 = new minicopier.FailedQueue(var51);
    minicopier.FileToTransfer var57 = new minicopier.FileToTransfer("", "hi!");
    var54.addFile(var57);
    javax.swing.table.DefaultTableModel var59 = var54.getTableModel();
    minicopier.Copier var60 = new minicopier.Copier();
    var60.setFileCurrentSize(1L);
    var60.setFileCurrentSize(100L);
    int var65 = var60.getTotalPercent();
    java.lang.String var67 = var60.stringURI2StringPath("hi!");
    int var68 = var60.getTotalPercent();
    minicopier.MainQueue var69 = new minicopier.MainQueue(var60);
    javax.swing.table.DefaultTableModel var70 = var69.getTableModel();
    minicopier.Copier var72 = new minicopier.Copier();
    var72.setFileCurrentSize(1L);
    var72.setFileCurrentSize(100L);
    int var77 = var72.getTotalPercent();
    java.lang.String var79 = var72.stringURI2StringPath("hi!");
    int var80 = var72.getTotalPercent();
    minicopier.MainQueue var81 = new minicopier.MainQueue(var72);
    javax.swing.table.DefaultTableModel var82 = var81.getTableModel();
    java.lang.Object[] var83 = new java.lang.Object[] { var82};
    var70.addColumn((java.lang.Object)0.0d, var83);
    var70.fireTableRowsInserted(100, 10);
    java.util.Vector var88 = var70.getDataVector();
    var59.setColumnIdentifiers(var88);
    var36.addColumn((java.lang.Object)var44, var88);
    var10.addRow(var88);
    var10.fireTableDataChanged();
    int var94 = var10.findColumn("\\hi!");
    var10.setNumRows(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!"+ "'", var67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "hi!"+ "'", var79.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == (-1));

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test77");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.increaseFileCurrentSize(10L);
    var0.clearBasket();
    var0.increaseFileCurrentSize(0L);
    long var10 = var0.getTotalBytesRemaining();
    minicopier.FileToTransfer var13 = new minicopier.FileToTransfer("", "");
    var13.changeTargetName("");
    long var16 = var13.getSize();
    java.io.File var17 = var13.getDestinationFolder();
    java.io.File var18 = var13.getSourceFile();
    var0.addFolder2Queue(var18, "E");
    var0.paste2URIString("C");
    java.lang.String var24 = var0.stringURI2StringPath("E");
    boolean var25 = var0.getPause();
    minicopier.MainQueue var26 = new minicopier.MainQueue(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-9L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "E"+ "'", var24.equals("E"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test78");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    long var11 = var0.getCurrentBytesRemaining();
    minicopier.MainQueue var12 = new minicopier.MainQueue(var0);
    boolean var13 = var0.getBusy();
    var0.add2basket("E");
    minicopier.MainQueue var16 = new minicopier.MainQueue(var0);
    boolean var17 = var16.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test79");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.fireTableRowsInserted(1, 0);
    var10.fireTableStructureChanged();
    minicopier.Copier var15 = new minicopier.Copier();
    var15.setFileCurrentSize(1L);
    var15.setFileCurrentSize(100L);
    int var20 = var15.getTotalPercent();
    var15.clearBasket();
    java.lang.Object[] var22 = new java.lang.Object[] { var15};
    var10.addRow(var22);
    var10.fireTableRowsUpdated(3, 10);
    java.util.Vector var27 = var10.getDataVector();
    var10.fireTableRowsUpdated(1, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test80");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("A\\\\D", "A\\Destination");

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test81");


    minicopier.Basket var0 = new minicopier.Basket();
    int var1 = var0.getLength();
    var0.add("\\");
    var0.add("");
    var0.add("A");
    int var8 = var0.getLength();
    var0.add("hi!\\");
    boolean var11 = var0.isEmpty();
    boolean var12 = var0.isEmpty();
    int var13 = var0.getLength();
    boolean var14 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test82");


    minicopier.i18n.Language.init("hi!\\hi!");

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test83");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.increaseFileCurrentSize(10L);
    var0.clearBasket();
    minicopier.FileToTransfer var10 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var11 = var10.getName();
    java.lang.String var12 = var10.getDestinationFilePath();
    var10.changeTargetName("hi!\\");
    java.io.File var15 = var10.getSourceFile();
    java.lang.String var16 = var10.getName();
    minicopier.TransferTask var18 = new minicopier.TransferTask(var0, var10, true);
    boolean var19 = var0.pause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\"+ "'", var12.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test84");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\CW", "A");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\CW"+ "'", var3.equals("\\CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "CW"+ "'", var4.equals("CW"));

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test85");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.setFileCurrentSize(10L);
    minicopier.FileToTransfer var9 = new minicopier.FileToTransfer("", "");
    var9.changeTargetName("");
    java.io.File var12 = var9.getDestinationFile();
    java.io.File var13 = var9.getSourceFile();
    boolean var14 = minicopier.Copier.isNotLink(var13);
    var0.addFolder2Queue(var13, "hi!\\");
    var0.increaseFileCurrentSize(10L);
    boolean var21 = var0.nameIsAcceptable("CW", "hi!");
    minicopier.FileToTransfer var24 = new minicopier.FileToTransfer("A", "K");
    minicopier.TransferTask var26 = new minicopier.TransferTask(var0, var24, false);
    long var27 = var24.getSize();
    java.lang.String var28 = var24.getDestinationFolderPath();
    java.lang.String var29 = var24.getDestinationFilePath();
    java.io.File var30 = var24.getSourceFile();
    java.lang.String var31 = var24.getDestinationFolderPath();
    java.lang.String var32 = var24.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "K"+ "'", var28.equals("K"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "K\\A"+ "'", var29.equals("K\\A"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "K"+ "'", var31.equals("K"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "A"+ "'", var32.equals("A"));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test86");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    boolean var4 = var3.isEmpty();
    int[] var5 = new int[] { };
    int[] var6 = var3.remove(var5);
    minicopier.Copier var7 = new minicopier.Copier();
    var7.setFileCurrentSize(1L);
    var7.setFileCurrentSize(100L);
    java.lang.String var12 = var7.getCurrentFileSource();
    minicopier.MainQueue var13 = new minicopier.MainQueue(var7);
    minicopier.Copier var14 = new minicopier.Copier();
    var14.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var17 = new minicopier.FailedQueue(var14);
    boolean var18 = var17.isEmpty();
    int[] var19 = new int[] { };
    int[] var20 = var17.remove(var19);
    int[] var21 = var13.remove(var19);
    int[] var22 = var3.remove(var19);
    minicopier.FileToTransfer var25 = new minicopier.FileToTransfer("", "");
    java.lang.String var26 = var25.getSourcePath();
    java.lang.String var27 = var25.getName();
    var3.addFile(var25);
    minicopier.Copier var29 = new minicopier.Copier();
    var29.increaseFileCurrentSize((-1L));
    var29.add2basket("");
    var29.increaseFileCurrentSize(10L);
    minicopier.FileToTransfer var38 = new minicopier.FileToTransfer("", "");
    var38.changeTargetName("");
    java.io.File var41 = var38.getDestinationFile();
    java.io.File var42 = var38.getSourceFile();
    java.lang.String var43 = var38.getDestinationFilePath();
    minicopier.TransferTask var45 = new minicopier.TransferTask(var29, var38, true);
    java.lang.String var46 = var38.getDestinationFilePath();
    java.lang.String var47 = var38.getDestinationFilePath();
    var3.addFile(var38);
    java.io.File var49 = var38.getDestinationFile();
    java.io.File var50 = var38.getDestinationFile();
    boolean var51 = minicopier.Copier.isNotLink(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "\\"+ "'", var43.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "\\"+ "'", var46.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "\\"+ "'", var47.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test87");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    long var6 = var0.getFileTotalSize();
    var0.increaseQueueCurrentSize(1L);
    minicopier.FailedQueue var9 = new minicopier.FailedQueue(var0);
    minicopier.Copier var10 = new minicopier.Copier();
    var10.setFileCurrentSize(1L);
    var10.setFileCurrentSize(100L);
    int var15 = var10.getTotalPercent();
    java.lang.String var17 = var10.stringURI2StringPath("hi!");
    int var18 = var10.getTotalPercent();
    minicopier.MainQueue var19 = new minicopier.MainQueue(var10);
    javax.swing.table.DefaultTableModel var20 = var19.getTableModel();
    javax.swing.table.DefaultTableModel var21 = var19.getTableModel();
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
    int[] var37 = var19.remove(var34);
    int[] var38 = var9.remove(var34);
    minicopier.FileToTransfer var41 = new minicopier.FileToTransfer("", "");
    java.lang.String var42 = var41.getSourcePath();
    java.io.File var43 = var41.getDestinationFolder();
    java.io.File var44 = var41.getSourceFile();
    var9.addFile(var41);
    java.io.File var46 = var41.getSourceFile();
    var41.changeTargetName("K");
    java.lang.String var49 = var41.getDestinationFolderPath();
    java.lang.String var50 = var41.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test88");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = var6.getDestinationFilePath();
    minicopier.TransferTask var10 = new minicopier.TransferTask(var0, var6, false);
    var10.setPause();
    boolean var12 = var10.getCompleted();
    var10.setPause();
    var10.setPause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\"+ "'", var8.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test89");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    java.lang.String var17 = var12.getCurrentFileSource();
    minicopier.MainQueue var18 = new minicopier.MainQueue(var12);
    minicopier.Copier var19 = new minicopier.Copier();
    var19.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var22 = new minicopier.FailedQueue(var19);
    boolean var23 = var22.isEmpty();
    int[] var24 = new int[] { };
    int[] var25 = var22.remove(var24);
    int[] var26 = var18.remove(var24);
    int[] var27 = var9.putLast(var24);
    minicopier.Copier var28 = new minicopier.Copier();
    var28.setFileCurrentSize(1L);
    var28.setFileCurrentSize(100L);
    int var33 = var28.getTotalPercent();
    java.lang.String var35 = var28.stringURI2StringPath("hi!");
    int var36 = var28.getTotalPercent();
    minicopier.MainQueue var37 = new minicopier.MainQueue(var28);
    javax.swing.table.DefaultTableModel var38 = var37.getTableModel();
    javax.swing.table.DefaultTableModel var39 = var37.getTableModel();
    minicopier.Copier var40 = new minicopier.Copier();
    var40.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var43 = new minicopier.FailedQueue(var40);
    minicopier.Copier var44 = new minicopier.Copier();
    var44.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var47 = new minicopier.FailedQueue(var44);
    boolean var48 = var47.isEmpty();
    int[] var49 = new int[] { };
    int[] var50 = var47.remove(var49);
    int[] var51 = var43.retry(var49);
    int[] var52 = var37.remove(var49);
    int[] var53 = var9.putLast(var49);
    javax.swing.table.DefaultTableModel var54 = var9.getTableModel();
    javax.swing.table.DefaultTableModel var55 = var9.getTableModel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      minicopier.FileToTransfer var56 = var9.extractFirst();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test90");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    long var5 = var0.getFileTotalSize();
    minicopier.FailedQueue var6 = new minicopier.FailedQueue(var0);
    java.lang.String var8 = var0.stringURI2StringPath("B");
    java.lang.String var9 = var0.getCurrentFileSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "B"+ "'", var8.equals("B"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test91");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.increaseQueueCurrentSize((-1L));
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    java.lang.String var9 = var7.getDestinationFolderPath();
    java.io.File var10 = var7.getDestinationFolder();
    minicopier.TransferTask var12 = new minicopier.TransferTask(var0, var7, true);
    boolean var13 = var12.getCompleted();
    var12.setPause();
    boolean var15 = var12.getCancel();
    boolean var16 = var12.getCancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test92");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = minicopier.i18n.Language.get("D\\Destination");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test93");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    long var6 = var0.getFileTotalSize();
    var0.decreaseQueueCurrentSize((-9L));
    boolean var9 = var0.getPause();
    int var10 = var0.getCurrentPercent();
    minicopier.MainQueue var11 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var12 = var11.getTableModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test94");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    java.lang.String var4 = var0.stringURI2StringPath("hi!");
    boolean var5 = var0.getPause();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    minicopier.FailedQueue var8 = new minicopier.FailedQueue(var0);
    minicopier.Copier var9 = new minicopier.Copier();
    var9.setFileCurrentSize(1L);
    var9.setFileCurrentSize(100L);
    boolean var14 = var9.getPause();
    minicopier.FailedQueue var15 = new minicopier.FailedQueue(var9);
    java.lang.String var16 = var9.getCurrentFileDestination();
    minicopier.Copier var17 = new minicopier.Copier();
    var17.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var20 = new minicopier.FailedQueue(var17);
    minicopier.FileToTransfer var23 = new minicopier.FileToTransfer("", "hi!");
    var20.addFile(var23);
    java.lang.String var25 = var23.getDestinationFilePath();
    java.io.File var26 = var23.getDestinationFolder();
    java.lang.String var27 = var23.getSourcePath();
    minicopier.TransferTask var29 = new minicopier.TransferTask(var9, var23, false);
    var23.changeTargetName("A");
    minicopier.TransferTask var33 = new minicopier.TransferTask(var0, var23, false);
    java.io.File var34 = var23.getDestinationFolder();
    boolean var35 = minicopier.Copier.isNotLink(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!\\"+ "'", var25.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test95");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    boolean var4 = var3.isEmpty();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFile();
    java.lang.String var9 = var7.getSourcePath();
    java.lang.String var10 = var7.getDestinationFilePath();
    var3.addFile(var7);
    javax.swing.table.DefaultTableModel var12 = var3.getTableModel();
    minicopier.FileToTransfer var15 = new minicopier.FileToTransfer("", "");
    java.io.File var16 = var15.getDestinationFolder();
    java.lang.String var17 = var15.getDestinationFolderPath();
    java.io.File var18 = var15.getDestinationFolder();
    java.lang.String var19 = var15.getDestinationFolderPath();
    var3.addFile(var15);
    java.lang.String var21 = var15.getDestinationFolderPath();
    java.io.File var22 = var15.getSourceFile();
    java.lang.String var23 = var15.getSourcePath();
    java.io.File var24 = var15.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "\\"+ "'", var10.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test96");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.FailedQueue var6 = new minicopier.FailedQueue(var0);
    boolean var7 = var6.isEmpty();
    minicopier.FileToTransfer var10 = new minicopier.FileToTransfer("", "");
    var10.changeTargetName("");
    long var13 = var10.getSize();
    java.lang.String var14 = var10.getSourcePath();
    java.lang.String var15 = var10.getDestinationFilePath();
    var6.addFile(var10);
    minicopier.Copier var17 = new minicopier.Copier();
    var17.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var20 = new minicopier.FailedQueue(var17);
    boolean var21 = var20.isEmpty();
    int[] var22 = new int[] { };
    int[] var23 = var20.remove(var22);
    minicopier.Copier var24 = new minicopier.Copier();
    var24.setFileCurrentSize(1L);
    var24.setFileCurrentSize(100L);
    java.lang.String var29 = var24.getCurrentFileSource();
    minicopier.MainQueue var30 = new minicopier.MainQueue(var24);
    minicopier.Copier var31 = new minicopier.Copier();
    var31.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var34 = new minicopier.FailedQueue(var31);
    boolean var35 = var34.isEmpty();
    int[] var36 = new int[] { };
    int[] var37 = var34.remove(var36);
    int[] var38 = var30.remove(var36);
    int[] var39 = var20.remove(var36);
    int[] var40 = var6.remove(var36);
    minicopier.FileToTransfer var43 = new minicopier.FileToTransfer("A", "K");
    var6.addFile(var43);
    var43.changeTargetName("C");
    java.io.File var47 = var43.getSourceFile();
    boolean var48 = minicopier.Copier.isNotLink(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "\\"+ "'", var15.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test97");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var11 = new minicopier.Copier();
    var11.setFileCurrentSize(1L);
    var11.setFileCurrentSize(100L);
    java.lang.Object[] var16 = new java.lang.Object[] { 100L};
    var10.addRow(var16);
    var10.setNumRows(0);
    var10.fireTableDataChanged();
    var10.fireTableStructureChanged();
    var10.fireTableStructureChanged();
    java.lang.Class var24 = var10.getColumnClass(0);
    javax.swing.event.TableModelListener[] var25 = var10.getTableModelListeners();
    minicopier.Copier var26 = new minicopier.Copier();
    var26.setFileCurrentSize(1L);
    var26.setFileCurrentSize(100L);
    java.lang.String var31 = var26.getCurrentFileSource();
    long var32 = var26.getFileTotalSize();
    var26.increaseQueueCurrentSize(1L);
    minicopier.FailedQueue var35 = new minicopier.FailedQueue(var26);
    var10.addColumn((java.lang.Object)var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.moveRow(5, 11, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0L);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test98");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    java.lang.String var4 = var0.stringURI2StringPath("hi!");
    minicopier.FailedQueue var5 = new minicopier.FailedQueue(var0);
    javax.swing.table.DefaultTableModel var6 = var5.getTableModel();
    javax.swing.table.DefaultTableModel var7 = var5.getTableModel();
    var7.fireTableRowsDeleted((-1), 10);
    var7.fireTableDataChanged();
    int var13 = var7.findColumn("A\\hi!");
    minicopier.Copier var15 = new minicopier.Copier();
    var15.setFileCurrentSize(1L);
    java.lang.String var19 = var15.stringURI2StringPath("hi!");
    minicopier.FailedQueue var20 = new minicopier.FailedQueue(var15);
    javax.swing.table.DefaultTableModel var21 = var20.getTableModel();
    minicopier.Copier var22 = new minicopier.Copier();
    var22.setFileCurrentSize(1L);
    var22.setFileCurrentSize(100L);
    int var27 = var22.getTotalPercent();
    java.lang.String var29 = var22.stringURI2StringPath("hi!");
    int var30 = var22.getTotalPercent();
    minicopier.MainQueue var31 = new minicopier.MainQueue(var22);
    javax.swing.table.DefaultTableModel var32 = var31.getTableModel();
    minicopier.Copier var33 = new minicopier.Copier();
    var33.setFileCurrentSize(1L);
    var33.setFileCurrentSize(100L);
    java.lang.Object[] var38 = new java.lang.Object[] { 100L};
    var32.addRow(var38);
    var32.setNumRows(0);
    var32.fireTableDataChanged();
    var32.fireTableStructureChanged();
    var32.fireTableStructureChanged();
    java.lang.Class var46 = var32.getColumnClass(0);
    javax.swing.event.TableModelListener[] var47 = var32.getTableModelListeners();
    var21.setColumnIdentifiers((java.lang.Object[])var47);
    var21.fireTableStructureChanged();
    minicopier.Copier var50 = new minicopier.Copier();
    var50.setFileCurrentSize(1L);
    var50.setFileCurrentSize(100L);
    int var55 = var50.getTotalPercent();
    java.lang.String var57 = var50.stringURI2StringPath("hi!");
    int var58 = var50.getTotalPercent();
    minicopier.MainQueue var59 = new minicopier.MainQueue(var50);
    javax.swing.table.DefaultTableModel var60 = var59.getTableModel();
    minicopier.Copier var61 = new minicopier.Copier();
    var61.setFileCurrentSize(1L);
    var61.setFileCurrentSize(100L);
    java.lang.Object[] var66 = new java.lang.Object[] { 100L};
    var60.addRow(var66);
    var21.addRow(var66);
    minicopier.Copier var69 = new minicopier.Copier();
    var69.setFileCurrentSize(1L);
    java.lang.String var73 = var69.stringURI2StringPath("hi!");
    minicopier.FailedQueue var74 = new minicopier.FailedQueue(var69);
    javax.swing.table.DefaultTableModel var75 = var74.getTableModel();
    javax.swing.table.DefaultTableModel var76 = var74.getTableModel();
    var76.fireTableDataChanged();
    var76.setNumRows(10);
    var76.fireTableStructureChanged();
    minicopier.Copier var81 = new minicopier.Copier();
    var81.setFileCurrentSize(1L);
    var81.setFileCurrentSize(100L);
    int var86 = var81.getTotalPercent();
    java.lang.String var88 = var81.stringURI2StringPath("hi!");
    int var89 = var81.getTotalPercent();
    minicopier.MainQueue var90 = new minicopier.MainQueue(var81);
    boolean var91 = var90.isEmpty();
    boolean var92 = var90.isEmpty();
    javax.swing.table.DefaultTableModel var93 = var90.getTableModel();
    var93.setRowCount(0);
    java.util.Vector var96 = var93.getDataVector();
    var76.addRow(var96);
    var21.setColumnIdentifiers(var96);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.insertRow(9, var96);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!"+ "'", var57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!"+ "'", var73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "hi!"+ "'", var88.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test99");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    java.lang.String var2 = var0.getCurrentFileSource();
    var0.setFileCurrentSize((-100L));
    var0.add2basket("hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test100");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    minicopier.Copier var10 = new minicopier.Copier();
    var10.setFileCurrentSize(1L);
    java.lang.String var14 = var10.stringURI2StringPath("hi!");
    minicopier.FailedQueue var15 = new minicopier.FailedQueue(var10);
    boolean var16 = var15.isEmpty();
    javax.swing.table.DefaultTableModel var17 = var15.getTableModel();
    javax.swing.event.TableModelListener[] var18 = var17.getTableModelListeners();
    minicopier.MainQueue.TransfersModel var20 = var9.new TransfersModel((java.lang.Object[])var18, 5);
    javax.swing.event.TableModelListener[] var21 = var20.getTableModelListeners();
    boolean var24 = var20.isCellEditable(2, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test101");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    long var11 = var0.getCurrentBytesRemaining();
    minicopier.MainQueue var12 = new minicopier.MainQueue(var0);
    minicopier.FileToTransfer var15 = new minicopier.FileToTransfer("CW", "");
    java.lang.String var16 = var15.getDestinationFolderPath();
    minicopier.TransferTask var18 = new minicopier.TransferTask(var0, var15, true);
    long var19 = var0.getCurrentBytesRemaining();
    var0.addURIString2basket("");
    boolean var22 = var0.pause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test102");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.decreaseQueueCurrentSize(10L);
    java.lang.String var8 = var0.stringURI2StringPath("");
    boolean var9 = var0.pause();
    int var10 = var0.basketLength();
    var0.increaseFileCurrentSize(1L);
    int var13 = var0.getTotalPercent();
    long var14 = var0.readAndInitBytesCounter();
    minicopier.MainQueue var15 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var16 = var15.getTableModel();
    javax.swing.table.DefaultTableModel var17 = var15.getTableModel();
    boolean var18 = var15.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test103");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    boolean var5 = var0.getPause();
    long var6 = var0.getQueueTotalSize();
    minicopier.MainQueue var7 = new minicopier.MainQueue(var0);
    minicopier.MainQueue var8 = new minicopier.MainQueue(var0);
    minicopier.Copier var9 = new minicopier.Copier();
    var9.setFileCurrentSize(1L);
    var9.setFileCurrentSize(100L);
    int var14 = var9.getTotalPercent();
    java.lang.String var16 = var9.stringURI2StringPath("hi!");
    int var17 = var9.getTotalPercent();
    minicopier.MainQueue var18 = new minicopier.MainQueue(var9);
    javax.swing.table.DefaultTableModel var19 = var18.getTableModel();
    minicopier.Copier var20 = new minicopier.Copier();
    var20.setFileCurrentSize(1L);
    var20.setFileCurrentSize(100L);
    int var25 = var20.getTotalPercent();
    java.lang.String var27 = var20.stringURI2StringPath("hi!");
    int var28 = var20.getTotalPercent();
    minicopier.MainQueue var29 = new minicopier.MainQueue(var20);
    javax.swing.table.DefaultTableModel var30 = var29.getTableModel();
    minicopier.Copier var31 = new minicopier.Copier();
    var31.setFileCurrentSize(1L);
    var31.setFileCurrentSize(100L);
    java.lang.Object[] var36 = new java.lang.Object[] { 100L};
    var30.addRow(var36);
    java.lang.Object[][] var38 = new java.lang.Object[][] { var36};
    minicopier.FileToTransfer var41 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var42 = var41.getName();
    java.lang.Object[] var43 = new java.lang.Object[] { var42};
    var19.setDataVector(var38, var43);
    minicopier.MainQueue.TransfersModel var46 = var8.new TransfersModel(var43, 11);
    int var47 = var46.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 11);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test104");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    var0.forceStart();
    long var3 = var0.getFileTotalSize();
    var0.increaseQueueCurrentSize(11L);
    var0.increaseQueueCurrentSize((-8L));
    var0.decreaseQueueCurrentSize(1L);
    java.lang.String var10 = var0.getCurrentFileDestination();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test105");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    long var11 = var0.getCurrentBytesRemaining();
    var0.setFileCurrentSize(0L);
    var0.paste("\\");
    int var16 = var0.basketLength();
    var0.paste("CW\\E");
    minicopier.Copier var19 = new minicopier.Copier();
    var19.increaseFileCurrentSize((-1L));
    var19.increaseQueueCurrentSize((-1L));
    minicopier.FileToTransfer var26 = new minicopier.FileToTransfer("", "");
    var26.changeTargetName("");
    java.io.File var29 = var26.getDestinationFile();
    minicopier.TransferTask var31 = new minicopier.TransferTask(var19, var26, true);
    java.io.File var32 = var26.getSourceFile();
    var0.addFolder2Queue(var32, "hi!");
    int var35 = var0.getTotalPercent();
    long var36 = var0.getCurrentBytesRemaining();
    long var37 = var0.getFileTotalSize();
    long var38 = var0.getQueueTotalSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0L);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test106");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.clearBasket();
    java.lang.String var7 = var0.getCurrentFileSource();
    var0.addURIString2basket("CW");
    var0.addURIString2basket("D");
    java.lang.String var12 = var0.getCurrentFileSource();
    var0.increaseFileCurrentSize(9L);
    var0.increaseFileCurrentSize(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test107");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    boolean var5 = var0.getPause();
    minicopier.FailedQueue var6 = new minicopier.FailedQueue(var0);
    boolean var7 = var0.getBusy();
    var0.increaseFileCurrentSize((-20L));
    long var10 = var0.getQueueTotalSize();
    minicopier.FailedQueue var11 = new minicopier.FailedQueue(var0);
    javax.swing.table.DefaultTableModel var12 = var11.getTableModel();
    var12.fireTableDataChanged();
    minicopier.Copier var14 = new minicopier.Copier();
    var14.setFileCurrentSize(1L);
    java.lang.String var18 = var14.stringURI2StringPath("hi!");
    int var19 = var14.getCurrentPercent();
    minicopier.Copier var20 = new minicopier.Copier();
    var20.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var23 = new minicopier.FailedQueue(var20);
    long var24 = var20.getFileTotalSize();
    minicopier.FileToTransfer var27 = new minicopier.FileToTransfer("", "");
    var27.changeTargetName("");
    long var30 = var27.getSize();
    java.io.File var31 = var27.getDestinationFolder();
    var20.addFolder2Queue(var31, "\\hi!");
    var14.addFolder2Queue(var31, "\\hi!");
    boolean var36 = var14.pause();
    var14.decreaseQueueCurrentSize((-9L));
    var14.unpause();
    minicopier.Copier var40 = new minicopier.Copier();
    var40.setFileCurrentSize(1L);
    var40.setFileCurrentSize(100L);
    int var45 = var40.getTotalPercent();
    java.lang.String var47 = var40.stringURI2StringPath("hi!");
    int var48 = var40.getTotalPercent();
    minicopier.MainQueue var49 = new minicopier.MainQueue(var40);
    javax.swing.table.DefaultTableModel var50 = var49.getTableModel();
    var50.fireTableRowsInserted(1, 0);
    var50.fireTableStructureChanged();
    minicopier.Copier var55 = new minicopier.Copier();
    var55.setFileCurrentSize(1L);
    var55.setFileCurrentSize(100L);
    int var60 = var55.getTotalPercent();
    var55.clearBasket();
    java.lang.Object[] var62 = new java.lang.Object[] { var55};
    var50.addRow(var62);
    var12.addColumn((java.lang.Object)var14, var62);
    minicopier.FileToTransfer var67 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var68 = var67.getName();
    var67.changeTargetName("hi!");
    java.lang.String var71 = var67.getSourcePath();
    java.lang.String var72 = var67.getName();
    java.io.File var73 = var67.getSourceFile();
    minicopier.TransferTask var75 = new minicopier.TransferTask(var14, var67, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + ""+ "'", var71.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + ""+ "'", var72.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test108");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.setColumnCount(0);
    int var14 = var10.findColumn("hi!\\");
    int var15 = var10.getRowCount();
    minicopier.Copier var16 = new minicopier.Copier();
    var16.setFileCurrentSize(1L);
    var16.setFileCurrentSize(100L);
    int var21 = var16.getTotalPercent();
    java.lang.String var23 = var16.stringURI2StringPath("hi!");
    int var24 = var16.getTotalPercent();
    minicopier.MainQueue var25 = new minicopier.MainQueue(var16);
    javax.swing.table.DefaultTableModel var26 = var25.getTableModel();
    minicopier.Copier var27 = new minicopier.Copier();
    var27.setFileCurrentSize(1L);
    var27.setFileCurrentSize(100L);
    java.lang.Object[] var32 = new java.lang.Object[] { 100L};
    var26.addRow(var32);
    var10.addRow(var32);
    minicopier.Copier var35 = new minicopier.Copier();
    var35.increaseFileCurrentSize((-1L));
    int var38 = var35.basketLength();
    long var39 = var35.getFileTotalSize();
    minicopier.FileToTransfer var42 = new minicopier.FileToTransfer("", "");
    java.io.File var43 = var42.getDestinationFolder();
    var35.addFolder2Queue(var43, "hi!");
    long var46 = var35.getCurrentBytesRemaining();
    minicopier.Copier var47 = new minicopier.Copier();
    var47.setFileCurrentSize(1L);
    var47.setFileCurrentSize(100L);
    int var52 = var47.getTotalPercent();
    java.lang.String var54 = var47.stringURI2StringPath("hi!");
    int var55 = var47.getTotalPercent();
    minicopier.MainQueue var56 = new minicopier.MainQueue(var47);
    javax.swing.table.DefaultTableModel var57 = var56.getTableModel();
    var57.setColumnCount(0);
    int var61 = var57.findColumn("hi!\\");
    var57.setColumnCount(10);
    minicopier.Copier var64 = new minicopier.Copier();
    var64.increaseFileCurrentSize((-1L));
    var64.add2basket("");
    var64.clearBasket();
    var64.increaseFileCurrentSize(100L);
    java.lang.Object[] var72 = new java.lang.Object[] { 100L};
    var57.setColumnIdentifiers(var72);
    var10.addColumn((java.lang.Object)var46, var72);
    int var76 = var10.findColumn("hi!");
    java.lang.Class var78 = var10.getColumnClass(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.removeRow(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test109");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("\\");
    java.util.Iterator var4 = var0.getIterator();
    int var5 = var0.getLength();
    boolean var6 = var0.isEmpty();
    var0.add("E");
    var0.add("A\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test110");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    var0.paste("hi!");
    boolean var6 = var0.pause();
    boolean var7 = var0.pause();
    java.lang.String var8 = var0.getCurrentFileDestination();
    boolean var9 = var0.getPause();
    boolean var10 = var0.pause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test111");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    long var2 = var0.readAndInitBytesCounter();
    long var3 = var0.readAndInitBytesCounter();
    var0.increaseFileCurrentSize(100L);
    boolean var6 = var0.pause();
    boolean var7 = var0.pause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test112");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    var3.addFile(var6);
    javax.swing.table.DefaultTableModel var8 = var3.getTableModel();
    javax.swing.table.DefaultTableModel var9 = var3.getTableModel();
    minicopier.FileToTransfer var12 = new minicopier.FileToTransfer("", "");
    java.io.File var13 = var12.getDestinationFile();
    java.lang.String var14 = var12.getSourcePath();
    java.lang.String var15 = var12.getDestinationFilePath();
    java.io.File var16 = var12.getDestinationFile();
    java.lang.String var17 = var12.getSourcePath();
    var3.addFile(var12);
    boolean var19 = var3.isEmpty();
    minicopier.Copier var20 = new minicopier.Copier();
    var20.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var23 = new minicopier.FailedQueue(var20);
    minicopier.FileToTransfer var26 = new minicopier.FileToTransfer("", "hi!");
    var23.addFile(var26);
    java.lang.String var28 = var26.getDestinationFilePath();
    java.io.File var29 = var26.getDestinationFolder();
    java.lang.String var30 = var26.getSourcePath();
    java.lang.String var31 = var26.getSourcePath();
    java.io.File var32 = var26.getDestinationFile();
    var3.addFile(var26);
    java.io.File var34 = var26.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "\\"+ "'", var15.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!\\"+ "'", var28.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test113");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.clearBasket();
    var0.clearBasket();
    long var8 = var0.getCurrentBytesRemaining();
    var0.add2basket("B");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-100L));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test114");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    long var3 = var0.getQueueTotalSize();
    var0.unpause();
    int var5 = var0.getCurrentPercent();
    java.lang.String var7 = var0.stringURI2StringPath("C");
    var0.unpause();
    var0.clearBasket();
    var0.unpause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "C"+ "'", var7.equals("C"));

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test115");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getTotalBytesRemaining();
    var0.paste2URIString("B");
    boolean var9 = var0.nameIsAcceptable("L", "hi!\\hi!\\");
    minicopier.FileToTransfer var12 = new minicopier.FileToTransfer("", "");
    var12.changeTargetName("");
    long var15 = var12.getSize();
    java.io.File var16 = var12.getDestinationFolder();
    java.io.File var17 = var12.getDestinationFile();
    java.io.File var18 = var12.getSourceFile();
    java.lang.String var19 = var12.getName();
    java.lang.String var20 = var12.getDestinationFolderPath();
    java.lang.String var21 = var12.getName();
    minicopier.TransferTask var23 = new minicopier.TransferTask(var0, var12, false);
    var12.changeTargetName("D\\D");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test116");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    boolean var10 = var0.nameIsAcceptable("", "\\");
    long var11 = var0.getQueueTotalSize();
    boolean var14 = var0.nameIsAcceptable("Source", "Source");
    var0.add2basket("\\hi!");
    var0.clearBasket();
    minicopier.FailedQueue var18 = new minicopier.FailedQueue(var0);
    int var19 = var0.getCurrentPercent();
    var0.unpause();
    java.lang.String var21 = var0.getCurrentFileSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test117");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var7 = var6.getName();
    var3.addFile(var6);
    java.lang.String var9 = var6.getDestinationFolderPath();
    java.io.File var10 = var6.getDestinationFile();
    var6.changeTargetName("L");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test118");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    minicopier.Copier var11 = new minicopier.Copier();
    var11.increaseFileCurrentSize((-1L));
    int var14 = var11.basketLength();
    long var15 = var11.getFileTotalSize();
    minicopier.FileToTransfer var18 = new minicopier.FileToTransfer("", "");
    java.io.File var19 = var18.getDestinationFolder();
    var11.addFolder2Queue(var19, "hi!");
    var0.addFolder2Queue(var19, "");
    minicopier.FileToTransfer var26 = new minicopier.FileToTransfer("", "");
    java.io.File var27 = var26.getDestinationFolder();
    java.lang.String var28 = var26.getDestinationFolderPath();
    java.io.File var29 = var26.getDestinationFolder();
    var0.addFolder2Queue(var29, "hi!");
    java.lang.String var32 = var0.getCurrentFileSource();
    int var33 = var0.getTotalPercent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test119");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.MainQueue var6 = new minicopier.MainQueue(var0);
    minicopier.Copier var7 = new minicopier.Copier();
    var7.clearBasket();
    long var9 = var7.readAndInitBytesCounter();
    long var10 = var7.readAndInitBytesCounter();
    int var11 = var7.basketLength();
    long var12 = var7.getCurrentBytesRemaining();
    var7.paste("A");
    minicopier.FileToTransfer var17 = new minicopier.FileToTransfer("", "");
    java.lang.String var18 = var17.getSourcePath();
    java.lang.String var19 = var17.getName();
    java.io.File var20 = var17.getSourceFile();
    var7.addFolder2Queue(var20, "E");
    var0.addFolder2Queue(var20, "\\");
    var0.forceStart();
    int var26 = var0.basketLength();
    minicopier.FailedQueue var27 = new minicopier.FailedQueue(var0);
    minicopier.Copier var28 = new minicopier.Copier();
    var28.increaseFileCurrentSize((-1L));
    var28.add2basket("");
    var28.unpause();
    var28.addURIString2basket("A");
    minicopier.Copier var36 = new minicopier.Copier();
    var36.increaseFileCurrentSize((-1L));
    var36.add2basket("");
    var36.increaseFileCurrentSize(10L);
    minicopier.FileToTransfer var45 = new minicopier.FileToTransfer("", "");
    var45.changeTargetName("");
    java.io.File var48 = var45.getDestinationFile();
    java.io.File var49 = var45.getSourceFile();
    java.lang.String var50 = var45.getDestinationFilePath();
    minicopier.TransferTask var52 = new minicopier.TransferTask(var36, var45, true);
    minicopier.TransferTask var54 = new minicopier.TransferTask(var28, var45, true);
    var27.addFile(var45);
    minicopier.FileToTransfer var58 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var59 = var58.getName();
    java.lang.String var60 = var58.getDestinationFilePath();
    java.lang.String var61 = var58.getSourcePath();
    long var62 = var58.getSize();
    java.io.File var63 = var58.getDestinationFolder();
    java.lang.String var64 = var58.getName();
    var27.addFile(var58);
    java.lang.String var66 = var58.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "\\"+ "'", var50.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!\\"+ "'", var60.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + ""+ "'", var61.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + ""+ "'", var64.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi!"+ "'", var66.equals("hi!"));

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test120");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.setFileCurrentSize(10L);
    long var7 = var0.getFileTotalSize();
    var0.forceStart();
    minicopier.FileToTransfer var11 = new minicopier.FileToTransfer("\\hi!", "\\hi!\\Destination");
    minicopier.TransferTask var13 = new minicopier.TransferTask(var0, var11, false);
    java.io.File var14 = var11.getSourceFile();
    java.lang.String var15 = var11.getDestinationFilePath();
    java.lang.String var16 = var11.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "\\hi!\\Destination\\hi!"+ "'", var15.equals("\\hi!\\Destination\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "\\hi!\\Destination\\hi!"+ "'", var16.equals("\\hi!\\Destination\\hi!"));

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test121");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    long var4 = var0.getFileTotalSize();
    long var5 = var0.getQueueTotalSize();
    var0.increaseQueueCurrentSize(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test122");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    long var11 = var0.getCurrentBytesRemaining();
    var0.clearBasket();
    int var13 = var0.getCurrentPercent();
    minicopier.FileToTransfer var16 = new minicopier.FileToTransfer("", "");
    java.io.File var17 = var16.getDestinationFolder();
    java.lang.String var18 = var16.getDestinationFolderPath();
    java.io.File var19 = var16.getDestinationFolder();
    java.io.File var20 = var16.getDestinationFolder();
    long var21 = var16.getSize();
    long var22 = var16.getSize();
    minicopier.TransferTask var24 = new minicopier.TransferTask(var0, var16, true);
    var24.setCancelAndQueue(true);
    var24.setPause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test123");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.decreaseQueueCurrentSize(10L);
    java.lang.String var8 = var0.stringURI2StringPath("");
    boolean var9 = var0.pause();
    long var10 = var0.getQueueTotalSize();
    minicopier.FailedQueue var11 = new minicopier.FailedQueue(var0);
    javax.swing.table.DefaultTableModel var12 = var11.getTableModel();
    var12.fireTableRowsUpdated(2, 1);
    minicopier.Copier var16 = new minicopier.Copier();
    var16.setFileCurrentSize(1L);
    var16.setFileCurrentSize(100L);
    java.lang.String var21 = var16.getCurrentFileSource();
    minicopier.MainQueue var22 = new minicopier.MainQueue(var16);
    minicopier.Copier var23 = new minicopier.Copier();
    var23.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var26 = new minicopier.FailedQueue(var23);
    boolean var27 = var26.isEmpty();
    int[] var28 = new int[] { };
    int[] var29 = var26.remove(var28);
    int[] var30 = var22.remove(var28);
    javax.swing.table.DefaultTableModel var31 = var22.getTableModel();
    boolean var32 = var22.isEmpty();
    javax.swing.table.DefaultTableModel var33 = var22.getTableModel();
    java.lang.String var35 = var33.getColumnName(100);
    javax.swing.event.TableModelListener[] var36 = var33.getTableModelListeners();
    var12.setColumnIdentifiers((java.lang.Object[])var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "CW"+ "'", var35.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test124");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var11 = new minicopier.Copier();
    var11.setFileCurrentSize(1L);
    var11.setFileCurrentSize(100L);
    java.lang.Object[] var16 = new java.lang.Object[] { 100L};
    var10.addRow(var16);
    var10.setNumRows(0);
    var10.fireTableDataChanged();
    int var21 = var10.getRowCount();
    var10.fireTableRowsUpdated(99, 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test125");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.fireTableRowsInserted(1, 0);
    var10.fireTableDataChanged();
    var10.moveRow(100, (-1), 100);
    var10.setRowCount(10);
    int var21 = var10.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 10);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test126");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(0L);
    var0.setFileCurrentSize(100L);
    var0.decreaseQueueCurrentSize(10L);
    var0.increaseFileCurrentSize((-9L));
    var0.paste("CW\\E");
    var0.setFileCurrentSize((-11L));
    minicopier.MainQueue var18 = new minicopier.MainQueue(var0);
    minicopier.FailedQueue var19 = new minicopier.FailedQueue(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test127");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    long var2 = var0.readAndInitBytesCounter();
    long var3 = var0.getCurrentBytesRemaining();
    minicopier.FailedQueue var4 = new minicopier.FailedQueue(var0);
    javax.swing.table.DefaultTableModel var5 = var4.getTableModel();
    boolean var6 = var4.isEmpty();
    minicopier.Copier var7 = new minicopier.Copier();
    var7.increaseFileCurrentSize((-1L));
    var7.add2basket("");
    var7.increaseFileCurrentSize(10L);
    minicopier.FileToTransfer var16 = new minicopier.FileToTransfer("", "");
    var16.changeTargetName("");
    java.io.File var19 = var16.getDestinationFile();
    java.io.File var20 = var16.getSourceFile();
    java.lang.String var21 = var16.getDestinationFilePath();
    minicopier.TransferTask var23 = new minicopier.TransferTask(var7, var16, true);
    minicopier.FailedQueue var24 = new minicopier.FailedQueue(var7);
    javax.swing.table.DefaultTableModel var25 = var24.getTableModel();
    minicopier.Copier var26 = new minicopier.Copier();
    var26.increaseFileCurrentSize((-1L));
    var26.add2basket("");
    var26.increaseFileCurrentSize(10L);
    var26.clearBasket();
    minicopier.FileToTransfer var36 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var37 = var36.getName();
    java.lang.String var38 = var36.getDestinationFilePath();
    var36.changeTargetName("hi!\\");
    java.io.File var41 = var36.getSourceFile();
    java.lang.String var42 = var36.getName();
    minicopier.TransferTask var44 = new minicopier.TransferTask(var26, var36, true);
    java.lang.String var45 = var36.getName();
    var24.addFile(var36);
    var4.addFile(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "\\"+ "'", var21.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!\\"+ "'", var38.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test128");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.MainQueue var6 = new minicopier.MainQueue(var0);
    minicopier.Copier var7 = new minicopier.Copier();
    var7.clearBasket();
    long var9 = var7.readAndInitBytesCounter();
    long var10 = var7.readAndInitBytesCounter();
    int var11 = var7.basketLength();
    long var12 = var7.getCurrentBytesRemaining();
    var7.paste("A");
    minicopier.FileToTransfer var17 = new minicopier.FileToTransfer("", "");
    java.lang.String var18 = var17.getSourcePath();
    java.lang.String var19 = var17.getName();
    java.io.File var20 = var17.getSourceFile();
    var7.addFolder2Queue(var20, "E");
    var0.addFolder2Queue(var20, "\\");
    var0.forceStart();
    long var26 = var0.getTotalBytesRemaining();
    minicopier.FailedQueue var27 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var30 = new minicopier.FileToTransfer("", "");
    var30.changeTargetName("");
    long var33 = var30.getSize();
    java.io.File var34 = var30.getDestinationFolder();
    java.io.File var35 = var30.getDestinationFile();
    java.io.File var36 = var30.getDestinationFile();
    java.io.File var37 = var30.getSourceFile();
    var27.addFile(var30);
    java.io.File var39 = var30.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test129");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.MainQueue var6 = new minicopier.MainQueue(var0);
    minicopier.Copier var7 = new minicopier.Copier();
    var7.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var10 = new minicopier.FailedQueue(var7);
    boolean var11 = var10.isEmpty();
    int[] var12 = new int[] { };
    int[] var13 = var10.remove(var12);
    int[] var14 = var6.remove(var12);
    javax.swing.table.DefaultTableModel var15 = var6.getTableModel();
    javax.swing.table.DefaultTableModel var16 = var6.getTableModel();
    minicopier.Copier var17 = new minicopier.Copier();
    var17.setFileCurrentSize(1L);
    var17.setFileCurrentSize(100L);
    int var22 = var17.getTotalPercent();
    java.lang.String var24 = var17.stringURI2StringPath("hi!");
    int var25 = var17.getTotalPercent();
    minicopier.MainQueue var26 = new minicopier.MainQueue(var17);
    javax.swing.table.DefaultTableModel var27 = var26.getTableModel();
    minicopier.Copier var29 = new minicopier.Copier();
    var29.setFileCurrentSize(1L);
    var29.setFileCurrentSize(100L);
    int var34 = var29.getTotalPercent();
    java.lang.String var36 = var29.stringURI2StringPath("hi!");
    int var37 = var29.getTotalPercent();
    minicopier.MainQueue var38 = new minicopier.MainQueue(var29);
    javax.swing.table.DefaultTableModel var39 = var38.getTableModel();
    java.lang.Object[] var40 = new java.lang.Object[] { var39};
    var27.addColumn((java.lang.Object)0.0d, var40);
    var27.setColumnCount(0);
    var27.fireTableRowsUpdated(100, (-1));
    javax.swing.event.TableModelListener[] var47 = var27.getTableModelListeners();
    minicopier.MainQueue.TransfersModel var49 = var6.new TransfersModel((java.lang.Object[])var47, 1);
    minicopier.Copier var50 = new minicopier.Copier();
    var50.clearBasket();
    long var52 = var50.readAndInitBytesCounter();
    long var53 = var50.readAndInitBytesCounter();
    var50.unpause();
    minicopier.MainQueue var55 = new minicopier.MainQueue(var50);
    minicopier.Copier var56 = new minicopier.Copier();
    var56.setFileCurrentSize(1L);
    var56.setFileCurrentSize(100L);
    int var61 = var56.getTotalPercent();
    java.lang.String var63 = var56.stringURI2StringPath("hi!");
    int var64 = var56.getTotalPercent();
    minicopier.MainQueue var65 = new minicopier.MainQueue(var56);
    javax.swing.table.DefaultTableModel var66 = var65.getTableModel();
    minicopier.Copier var67 = new minicopier.Copier();
    var67.setFileCurrentSize(1L);
    var67.setFileCurrentSize(100L);
    java.lang.Object[] var72 = new java.lang.Object[] { 100L};
    var66.addRow(var72);
    minicopier.MainQueue.TransfersModel var75 = var55.new TransfersModel(var72, 1);
    javax.swing.table.DefaultTableModel var76 = var55.getTableModel();
    javax.swing.event.TableModelListener[] var77 = var76.getTableModelListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      minicopier.MainQueue.TransfersModel var79 = var6.new TransfersModel((java.lang.Object[])var77, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi!"+ "'", var63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test130");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.setFileCurrentSize(10L);
    var0.unpause();
    minicopier.Copier var8 = new minicopier.Copier();
    var8.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var11 = new minicopier.FailedQueue(var8);
    minicopier.FileToTransfer var14 = new minicopier.FileToTransfer("", "hi!");
    var11.addFile(var14);
    java.lang.String var16 = var14.getDestinationFilePath();
    java.io.File var17 = var14.getDestinationFolder();
    boolean var18 = minicopier.Copier.isNotLink(var17);
    var0.addFolder2Queue(var17, "\\D");
    var0.setFileCurrentSize((-2L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!\\"+ "'", var16.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test131");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\");
    java.io.File var7 = var2.getSourceFile();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.lang.String var10 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\"+ "'", var4.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test132");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    var0.forceStart();
    boolean var6 = var0.pause();
    int var7 = var0.getTotalPercent();
    var0.forceStart();
    int var9 = var0.getTotalPercent();
    boolean var12 = var0.nameIsAcceptable("C", "hi!\\");
    int var13 = var0.basketLength();
    var0.setFileCurrentSize((-20L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test133");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    var0.forceStart();
    long var3 = var0.getFileTotalSize();
    boolean var4 = var0.getBusy();
    var0.decreaseQueueCurrentSize((-1L));
    int var7 = var0.basketLength();
    var0.add2basket("G");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test134");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.setColumnCount(0);
    int var14 = var10.findColumn("hi!\\");
    minicopier.FileToTransfer var17 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var18 = var17.getName();
    java.lang.String var19 = var17.getDestinationFilePath();
    java.lang.String var20 = var17.getSourcePath();
    long var21 = var17.getSize();
    minicopier.Copier var22 = new minicopier.Copier();
    var22.setFileCurrentSize(1L);
    var22.setFileCurrentSize(100L);
    int var27 = var22.getTotalPercent();
    java.lang.String var29 = var22.stringURI2StringPath("hi!");
    int var30 = var22.getTotalPercent();
    minicopier.MainQueue var31 = new minicopier.MainQueue(var22);
    javax.swing.table.DefaultTableModel var32 = var31.getTableModel();
    minicopier.Copier var34 = new minicopier.Copier();
    var34.setFileCurrentSize(1L);
    var34.setFileCurrentSize(100L);
    int var39 = var34.getTotalPercent();
    java.lang.String var41 = var34.stringURI2StringPath("hi!");
    int var42 = var34.getTotalPercent();
    minicopier.MainQueue var43 = new minicopier.MainQueue(var34);
    javax.swing.table.DefaultTableModel var44 = var43.getTableModel();
    java.lang.Object[] var45 = new java.lang.Object[] { var44};
    var32.addColumn((java.lang.Object)0.0d, var45);
    var32.setColumnCount(0);
    java.lang.String var50 = var32.getColumnName(100);
    java.util.Vector var51 = var32.getDataVector();
    var10.addColumn((java.lang.Object)var21, var51);
    int var53 = var10.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!\\"+ "'", var19.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "CW"+ "'", var50.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test135");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    boolean var4 = var3.isEmpty();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFile();
    java.lang.String var9 = var7.getSourcePath();
    java.lang.String var10 = var7.getDestinationFilePath();
    var3.addFile(var7);
    javax.swing.table.DefaultTableModel var12 = var3.getTableModel();
    int var13 = var12.getRowCount();
    int var15 = var12.findColumn("");
    minicopier.Copier var16 = new minicopier.Copier();
    var16.setFileCurrentSize(1L);
    var16.setFileCurrentSize(100L);
    int var21 = var16.getTotalPercent();
    java.lang.String var23 = var16.stringURI2StringPath("hi!");
    int var24 = var16.getTotalPercent();
    minicopier.MainQueue var25 = new minicopier.MainQueue(var16);
    javax.swing.table.DefaultTableModel var26 = var25.getTableModel();
    var26.fireTableRowsInserted(1, 0);
    int var31 = var26.findColumn("CW");
    var26.setRowCount(0);
    var26.setColumnCount(1);
    minicopier.Copier var36 = new minicopier.Copier();
    var36.setFileCurrentSize(1L);
    java.lang.String var40 = var36.stringURI2StringPath("hi!");
    minicopier.FailedQueue var41 = new minicopier.FailedQueue(var36);
    javax.swing.table.DefaultTableModel var42 = var41.getTableModel();
    minicopier.Copier var43 = new minicopier.Copier();
    var43.setFileCurrentSize(1L);
    var43.setFileCurrentSize(100L);
    int var48 = var43.getTotalPercent();
    java.lang.String var50 = var43.stringURI2StringPath("hi!");
    int var51 = var43.getTotalPercent();
    minicopier.MainQueue var52 = new minicopier.MainQueue(var43);
    javax.swing.table.DefaultTableModel var53 = var52.getTableModel();
    minicopier.Copier var54 = new minicopier.Copier();
    var54.setFileCurrentSize(1L);
    var54.setFileCurrentSize(100L);
    java.lang.Object[] var59 = new java.lang.Object[] { 100L};
    var53.addRow(var59);
    var53.setNumRows(0);
    var53.fireTableDataChanged();
    var53.fireTableStructureChanged();
    var53.fireTableStructureChanged();
    java.lang.Class var67 = var53.getColumnClass(0);
    javax.swing.event.TableModelListener[] var68 = var53.getTableModelListeners();
    var42.setColumnIdentifiers((java.lang.Object[])var68);
    var26.setColumnIdentifiers((java.lang.Object[])var68);
    var12.addRow((java.lang.Object[])var68);
    var12.fireTableDataChanged();
    int var73 = var12.getColumnCount();
    int var74 = var12.getRowCount();
    var12.fireTableStructureChanged();
    var12.fireTableCellUpdated(3, 5);
    minicopier.Copier var79 = new minicopier.Copier();
    var79.clearBasket();
    var79.forceStart();
    long var82 = var79.getFileTotalSize();
    int var83 = var79.getCurrentPercent();
    minicopier.FailedQueue var84 = new minicopier.FailedQueue(var79);
    var79.forceStart();
    int var86 = var79.getTotalPercent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.setValueAt((java.lang.Object)var79, 4, 2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "\\"+ "'", var10.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test136");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    minicopier.Copier var11 = new minicopier.Copier();
    var11.increaseFileCurrentSize((-1L));
    int var14 = var11.basketLength();
    long var15 = var11.getFileTotalSize();
    minicopier.FileToTransfer var18 = new minicopier.FileToTransfer("", "");
    java.io.File var19 = var18.getDestinationFolder();
    var11.addFolder2Queue(var19, "hi!");
    var0.addFolder2Queue(var19, "");
    var0.increaseFileCurrentSize((-9L));
    minicopier.FailedQueue var26 = new minicopier.FailedQueue(var0);
    java.lang.String var27 = var0.getCurrentFileDestination();
    minicopier.FileToTransfer var30 = new minicopier.FileToTransfer("hi!\\", "\\hi!");
    minicopier.TransferTask var32 = new minicopier.TransferTask(var0, var30, false);
    boolean var33 = var0.getPause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test137");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var7 = var6.getName();
    var3.addFile(var6);
    javax.swing.table.DefaultTableModel var9 = var3.getTableModel();
    int var10 = var9.getRowCount();
    minicopier.Copier var11 = new minicopier.Copier();
    var11.setFileCurrentSize(1L);
    var11.setFileCurrentSize(100L);
    int var16 = var11.getTotalPercent();
    java.lang.String var18 = var11.stringURI2StringPath("hi!");
    int var19 = var11.getTotalPercent();
    minicopier.MainQueue var20 = new minicopier.MainQueue(var11);
    javax.swing.table.DefaultTableModel var21 = var20.getTableModel();
    var21.setColumnCount(0);
    int var25 = var21.findColumn("hi!\\");
    var21.setColumnCount(10);
    var21.fireTableStructureChanged();
    int var29 = var21.getRowCount();
    java.util.Vector var30 = var21.getDataVector();
    minicopier.Copier var31 = new minicopier.Copier();
    var31.setFileCurrentSize(1L);
    var31.setFileCurrentSize(100L);
    int var36 = var31.getTotalPercent();
    java.lang.String var38 = var31.stringURI2StringPath("hi!");
    int var39 = var31.getTotalPercent();
    minicopier.MainQueue var40 = new minicopier.MainQueue(var31);
    javax.swing.table.DefaultTableModel var41 = var40.getTableModel();
    minicopier.Copier var42 = new minicopier.Copier();
    var42.setFileCurrentSize(1L);
    var42.setFileCurrentSize(100L);
    java.lang.Object[] var47 = new java.lang.Object[] { 100L};
    var41.addRow(var47);
    var41.moveRow(100, (-1), 100);
    minicopier.Copier var53 = new minicopier.Copier();
    var53.setFileCurrentSize(1L);
    var53.setFileCurrentSize(100L);
    int var58 = var53.getTotalPercent();
    java.lang.String var60 = var53.stringURI2StringPath("hi!");
    int var61 = var53.getTotalPercent();
    minicopier.MainQueue var62 = new minicopier.MainQueue(var53);
    javax.swing.table.DefaultTableModel var63 = var62.getTableModel();
    minicopier.Copier var65 = new minicopier.Copier();
    var65.setFileCurrentSize(1L);
    var65.setFileCurrentSize(100L);
    int var70 = var65.getTotalPercent();
    java.lang.String var72 = var65.stringURI2StringPath("hi!");
    int var73 = var65.getTotalPercent();
    minicopier.MainQueue var74 = new minicopier.MainQueue(var65);
    javax.swing.table.DefaultTableModel var75 = var74.getTableModel();
    java.lang.Object[] var76 = new java.lang.Object[] { var75};
    var63.addColumn((java.lang.Object)0.0d, var76);
    var63.setColumnCount(0);
    java.lang.String var81 = var63.getColumnName(100);
    java.util.Vector var82 = var63.getDataVector();
    var21.addColumn((java.lang.Object)var41, var82);
    javax.swing.event.TableModelListener[] var84 = var41.getTableModelListeners();
    var9.addRow((java.lang.Object[])var84);
    javax.swing.event.TableModelListener[] var86 = var9.getTableModelListeners();
    int var87 = var9.getColumnCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.moveRow(2, 6, 9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "CW"+ "'", var81.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 3);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test138");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = var6.getDestinationFilePath();
    minicopier.TransferTask var10 = new minicopier.TransferTask(var0, var6, false);
    long var11 = var0.getCurrentBytesRemaining();
    var0.paste("K");
    int var14 = var0.getCurrentPercent();
    var0.unpause();
    minicopier.MainQueue var16 = new minicopier.MainQueue(var0);
    minicopier.Copier var17 = new minicopier.Copier();
    var17.setFileCurrentSize(1L);
    var17.setFileCurrentSize(100L);
    int var22 = var17.getTotalPercent();
    java.lang.String var24 = var17.stringURI2StringPath("hi!");
    int var25 = var17.getTotalPercent();
    minicopier.MainQueue var26 = new minicopier.MainQueue(var17);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    minicopier.Copier var29 = new minicopier.Copier();
    var29.setFileCurrentSize(1L);
    var29.setFileCurrentSize(100L);
    java.lang.String var34 = var29.getCurrentFileSource();
    minicopier.MainQueue var35 = new minicopier.MainQueue(var29);
    minicopier.Copier var36 = new minicopier.Copier();
    var36.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var39 = new minicopier.FailedQueue(var36);
    boolean var40 = var39.isEmpty();
    int[] var41 = new int[] { };
    int[] var42 = var39.remove(var41);
    int[] var43 = var35.remove(var41);
    int[] var44 = var26.putLast(var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var45 = var16.putDown(var44);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\"+ "'", var8.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test139");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    javax.swing.table.DefaultTableModel var11 = var9.getTableModel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.moveRow(5, 11, 6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test140");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(0L);
    long var8 = var0.readAndInitBytesCounter();
    int var9 = var0.getTotalPercent();
    int var10 = var0.getCurrentPercent();
    boolean var11 = var0.getPause();
    boolean var12 = var0.pause();
    var0.forceStart();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test141");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    javax.swing.table.DefaultTableModel var12 = var9.getTableModel();
    java.lang.Class var14 = var12.getColumnClass(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test142");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    var0.add2basket("CW");
    minicopier.FailedQueue var7 = new minicopier.FailedQueue(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test143");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    minicopier.Copier var11 = new minicopier.Copier();
    var11.increaseFileCurrentSize((-1L));
    int var14 = var11.basketLength();
    long var15 = var11.getFileTotalSize();
    minicopier.FileToTransfer var18 = new minicopier.FileToTransfer("", "");
    java.io.File var19 = var18.getDestinationFolder();
    var11.addFolder2Queue(var19, "hi!");
    var0.addFolder2Queue(var19, "");
    minicopier.FileToTransfer var26 = new minicopier.FileToTransfer("", "");
    java.io.File var27 = var26.getDestinationFolder();
    java.lang.String var28 = var26.getDestinationFolderPath();
    java.io.File var29 = var26.getDestinationFolder();
    var0.addFolder2Queue(var29, "hi!");
    minicopier.FileToTransfer var34 = new minicopier.FileToTransfer("CW", "");
    minicopier.TransferTask var36 = new minicopier.TransferTask(var0, var34, true);
    boolean var37 = var0.pause();
    var0.clearBasket();
    long var39 = var0.getQueueTotalSize();
    long var40 = var0.getTotalBytesRemaining();
    long var41 = var0.getFileTotalSize();
    boolean var42 = var0.pause();
    var0.unpause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test144");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    java.lang.String var5 = var0.getCurrentFileSource();
    var0.forceStart();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test145");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    var0.forceStart();
    java.lang.String var7 = var0.stringURI2StringPath("Size");
    var0.clearBasket();
    minicopier.FileToTransfer var11 = new minicopier.FileToTransfer("", "");
    java.lang.String var12 = var11.getDestinationFolderPath();
    java.lang.String var13 = var11.getSourcePath();
    java.lang.String var14 = var11.getDestinationFolderPath();
    java.lang.String var15 = var11.getSourcePath();
    minicopier.TransferTask var17 = new minicopier.TransferTask(var0, var11, true);
    var17.setPause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Size"+ "'", var7.equals("Size"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test146");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(0L);
    long var8 = var0.readAndInitBytesCounter();
    var0.unpause();
    minicopier.Copier var10 = new minicopier.Copier();
    var10.increaseFileCurrentSize((-1L));
    var10.add2basket("");
    int var15 = var10.basketLength();
    minicopier.FileToTransfer var18 = new minicopier.FileToTransfer("", "");
    java.io.File var19 = var18.getDestinationFolder();
    java.lang.String var20 = var18.getDestinationFolderPath();
    java.io.File var21 = var18.getDestinationFolder();
    var10.addFolder2Queue(var21, "");
    var0.addFolder2Queue(var21, "");
    var0.increaseFileCurrentSize(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test147");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    long var3 = var0.getQueueTotalSize();
    minicopier.MainQueue var4 = new minicopier.MainQueue(var0);
    var0.forceStart();
    minicopier.MainQueue var6 = new minicopier.MainQueue(var0);
    var0.paste2URIString("K");
    long var9 = var0.getQueueTotalSize();
    var0.clearBasket();
    var0.increaseQueueCurrentSize(9L);
    var0.decreaseQueueCurrentSize((-20L));
    int var15 = var0.getTotalPercent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test148");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "A");
    var2.changeTargetName("hi!\\CW");

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test149");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    long var6 = var0.getCurrentBytesRemaining();
    int var7 = var0.getTotalPercent();
    java.lang.String var8 = var0.getCurrentFileSource();
    var0.decreaseQueueCurrentSize((-99L));
    long var11 = var0.getFileTotalSize();
    boolean var12 = var0.getBusy();
    minicopier.Copier var13 = new minicopier.Copier();
    var13.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var16 = new minicopier.FailedQueue(var13);
    minicopier.FileToTransfer var19 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var20 = var19.getName();
    var16.addFile(var19);
    java.lang.String var22 = var19.getDestinationFolderPath();
    var19.changeTargetName("E");
    minicopier.TransferTask var26 = new minicopier.TransferTask(var0, var19, false);
    boolean var27 = var26.getCancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test150");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.setColumnCount(0);
    int var14 = var10.findColumn("hi!\\");
    int var15 = var10.getRowCount();
    minicopier.Copier var16 = new minicopier.Copier();
    var16.setFileCurrentSize(1L);
    var16.setFileCurrentSize(100L);
    int var21 = var16.getTotalPercent();
    java.lang.String var23 = var16.stringURI2StringPath("hi!");
    int var24 = var16.getTotalPercent();
    minicopier.MainQueue var25 = new minicopier.MainQueue(var16);
    javax.swing.table.DefaultTableModel var26 = var25.getTableModel();
    minicopier.Copier var27 = new minicopier.Copier();
    var27.setFileCurrentSize(1L);
    var27.setFileCurrentSize(100L);
    int var32 = var27.getTotalPercent();
    java.lang.String var34 = var27.stringURI2StringPath("hi!");
    int var35 = var27.getTotalPercent();
    minicopier.MainQueue var36 = new minicopier.MainQueue(var27);
    javax.swing.table.DefaultTableModel var37 = var36.getTableModel();
    minicopier.Copier var38 = new minicopier.Copier();
    var38.setFileCurrentSize(1L);
    var38.setFileCurrentSize(100L);
    java.lang.Object[] var43 = new java.lang.Object[] { 100L};
    var37.addRow(var43);
    java.lang.Object[][] var45 = new java.lang.Object[][] { var43};
    minicopier.FileToTransfer var48 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var49 = var48.getName();
    java.lang.Object[] var50 = new java.lang.Object[] { var49};
    var26.setDataVector(var45, var50);
    minicopier.Copier var52 = new minicopier.Copier();
    var52.setFileCurrentSize(1L);
    var52.setFileCurrentSize(100L);
    int var57 = var52.getTotalPercent();
    java.lang.String var59 = var52.stringURI2StringPath("hi!");
    int var60 = var52.getTotalPercent();
    minicopier.MainQueue var61 = new minicopier.MainQueue(var52);
    javax.swing.table.DefaultTableModel var62 = var61.getTableModel();
    minicopier.Copier var63 = new minicopier.Copier();
    var63.setFileCurrentSize(1L);
    var63.setFileCurrentSize(100L);
    int var68 = var63.getTotalPercent();
    java.lang.String var70 = var63.stringURI2StringPath("hi!");
    int var71 = var63.getTotalPercent();
    minicopier.MainQueue var72 = new minicopier.MainQueue(var63);
    javax.swing.table.DefaultTableModel var73 = var72.getTableModel();
    minicopier.Copier var74 = new minicopier.Copier();
    var74.setFileCurrentSize(1L);
    var74.setFileCurrentSize(100L);
    java.lang.Object[] var79 = new java.lang.Object[] { 100L};
    var73.addRow(var79);
    java.lang.Object[][] var81 = new java.lang.Object[][] { var79};
    minicopier.FileToTransfer var84 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var85 = var84.getName();
    java.lang.Object[] var86 = new java.lang.Object[] { var85};
    var62.setDataVector(var81, var86);
    var10.setDataVector(var45, (java.lang.Object[])var81);
    java.util.Vector var89 = var10.getDataVector();
    var10.setColumnCount(0);
    var10.fireTableCellUpdated(4, 1);
    var10.fireTableStructureChanged();
    var10.fireTableRowsDeleted(4, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "hi!"+ "'", var70.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + ""+ "'", var85.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test151");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "");
    java.io.File var3 = var2.getDestinationFile();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\\"+ "'", var5.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test152");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    java.lang.String var4 = var0.stringURI2StringPath("hi!");
    boolean var5 = var0.getPause();
    boolean var8 = var0.nameIsAcceptable("Destination", "Source");
    var0.clearBasket();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test153");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.unpause();
    boolean var4 = var0.getPause();
    minicopier.Copier var5 = new minicopier.Copier();
    var5.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var8 = new minicopier.FailedQueue(var5);
    boolean var9 = var8.isEmpty();
    minicopier.FileToTransfer var12 = new minicopier.FileToTransfer("", "");
    java.io.File var13 = var12.getDestinationFile();
    java.lang.String var14 = var12.getSourcePath();
    java.lang.String var15 = var12.getDestinationFilePath();
    var8.addFile(var12);
    javax.swing.table.DefaultTableModel var17 = var8.getTableModel();
    minicopier.FileToTransfer var20 = new minicopier.FileToTransfer("", "");
    java.io.File var21 = var20.getDestinationFolder();
    java.lang.String var22 = var20.getDestinationFolderPath();
    java.io.File var23 = var20.getDestinationFolder();
    java.lang.String var24 = var20.getDestinationFolderPath();
    var8.addFile(var20);
    java.io.File var26 = var20.getSourceFile();
    java.io.File var27 = var20.getSourceFile();
    java.lang.String var28 = var20.getSourcePath();
    minicopier.TransferTask var30 = new minicopier.TransferTask(var0, var20, false);
    java.io.File var31 = var20.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "\\"+ "'", var15.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test154");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.MainQueue var6 = new minicopier.MainQueue(var0);
    minicopier.Copier var7 = new minicopier.Copier();
    var7.setFileCurrentSize(1L);
    var7.setFileCurrentSize(100L);
    int var12 = var7.getTotalPercent();
    java.lang.String var14 = var7.stringURI2StringPath("hi!");
    int var15 = var7.getTotalPercent();
    minicopier.MainQueue var16 = new minicopier.MainQueue(var7);
    javax.swing.table.DefaultTableModel var17 = var16.getTableModel();
    var17.setColumnCount(0);
    int var21 = var17.findColumn("hi!\\");
    var17.setColumnCount(10);
    var17.fireTableStructureChanged();
    int var25 = var17.getRowCount();
    minicopier.Copier var26 = new minicopier.Copier();
    var26.setFileCurrentSize(1L);
    var26.setFileCurrentSize(100L);
    int var31 = var26.getTotalPercent();
    java.lang.String var33 = var26.stringURI2StringPath("hi!");
    int var34 = var26.getTotalPercent();
    minicopier.MainQueue var35 = new minicopier.MainQueue(var26);
    javax.swing.table.DefaultTableModel var36 = var35.getTableModel();
    var36.setColumnCount(0);
    int var40 = var36.findColumn("hi!\\");
    int var41 = var36.getRowCount();
    minicopier.Copier var42 = new minicopier.Copier();
    var42.setFileCurrentSize(1L);
    var42.setFileCurrentSize(100L);
    int var47 = var42.getTotalPercent();
    java.lang.String var49 = var42.stringURI2StringPath("hi!");
    int var50 = var42.getTotalPercent();
    minicopier.MainQueue var51 = new minicopier.MainQueue(var42);
    javax.swing.table.DefaultTableModel var52 = var51.getTableModel();
    minicopier.Copier var53 = new minicopier.Copier();
    var53.setFileCurrentSize(1L);
    var53.setFileCurrentSize(100L);
    java.lang.Object[] var58 = new java.lang.Object[] { 100L};
    var52.addRow(var58);
    var36.addRow(var58);
    var17.setColumnIdentifiers(var58);
    minicopier.MainQueue.TransfersModel var63 = var6.new TransfersModel(var58, 3);
    boolean var66 = var63.isCellEditable(3, 1);
    boolean var69 = var63.isCellEditable(0, (-1));
    boolean var72 = var63.isCellEditable(5, 100);
    var63.fireTableRowsInserted(4, 2);
    var63.fireTableRowsUpdated(1, 1);
    var63.setRowCount(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test155");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    long var2 = var0.readAndInitBytesCounter();
    long var3 = var0.getCurrentBytesRemaining();
    minicopier.FailedQueue var4 = new minicopier.FailedQueue(var0);
    var0.paste2URIString("CW");
    boolean var9 = var0.nameIsAcceptable("K\\A", "D");
    minicopier.FailedQueue var10 = new minicopier.FailedQueue(var0);
    var0.paste("hi!\\hi!\\D");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test156");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    long var3 = var0.getQueueTotalSize();
    minicopier.MainQueue var4 = new minicopier.MainQueue(var0);
    minicopier.Copier var5 = new minicopier.Copier();
    var5.setFileCurrentSize(1L);
    var5.setFileCurrentSize(100L);
    java.lang.String var10 = var5.getCurrentFileSource();
    long var11 = var5.getFileTotalSize();
    java.lang.String var13 = var5.stringURI2StringPath("A");
    boolean var14 = var5.getPause();
    minicopier.FailedQueue var15 = new minicopier.FailedQueue(var5);
    javax.swing.table.DefaultTableModel var16 = var15.getTableModel();
    javax.swing.table.DefaultTableModel var17 = var15.getTableModel();
    minicopier.Copier var18 = new minicopier.Copier();
    var18.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var21 = new minicopier.FailedQueue(var18);
    minicopier.FileToTransfer var24 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var25 = var24.getName();
    var21.addFile(var24);
    minicopier.Copier var27 = new minicopier.Copier();
    var27.setFileCurrentSize(1L);
    var27.setFileCurrentSize(100L);
    java.lang.String var32 = var27.getCurrentFileSource();
    minicopier.MainQueue var33 = new minicopier.MainQueue(var27);
    minicopier.Copier var34 = new minicopier.Copier();
    var34.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var37 = new minicopier.FailedQueue(var34);
    boolean var38 = var37.isEmpty();
    int[] var39 = new int[] { };
    int[] var40 = var37.remove(var39);
    int[] var41 = var33.remove(var39);
    minicopier.Copier var42 = new minicopier.Copier();
    var42.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var45 = new minicopier.FailedQueue(var42);
    boolean var46 = var45.isEmpty();
    int[] var47 = new int[] { };
    int[] var48 = var45.remove(var47);
    int[] var49 = var33.putFirst(var47);
    int[] var50 = var21.remove(var47);
    int[] var51 = var15.retry(var47);
    int[] var52 = var4.putLast(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "A"+ "'", var13.equals("A"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test157");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    var0.paste("\\");
    var0.add2basket("");
    var0.forceStart();
    minicopier.FailedQueue var16 = new minicopier.FailedQueue(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test158");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    java.lang.String var4 = var0.stringURI2StringPath("hi!");
    minicopier.FailedQueue var5 = new minicopier.FailedQueue(var0);
    minicopier.MainQueue var6 = new minicopier.MainQueue(var0);
    minicopier.Copier var7 = new minicopier.Copier();
    var7.setFileCurrentSize(1L);
    var7.setFileCurrentSize(100L);
    int var12 = var7.getTotalPercent();
    java.lang.String var14 = var7.stringURI2StringPath("hi!");
    int var15 = var7.getTotalPercent();
    minicopier.MainQueue var16 = new minicopier.MainQueue(var7);
    javax.swing.table.DefaultTableModel var17 = var16.getTableModel();
    var17.setColumnCount(0);
    int var21 = var17.findColumn("hi!\\");
    var17.setColumnCount(10);
    var17.fireTableStructureChanged();
    int var25 = var17.getRowCount();
    minicopier.Copier var26 = new minicopier.Copier();
    var26.setFileCurrentSize(1L);
    var26.setFileCurrentSize(100L);
    int var31 = var26.getTotalPercent();
    java.lang.String var33 = var26.stringURI2StringPath("hi!");
    int var34 = var26.getTotalPercent();
    minicopier.MainQueue var35 = new minicopier.MainQueue(var26);
    javax.swing.table.DefaultTableModel var36 = var35.getTableModel();
    var36.setColumnCount(0);
    int var40 = var36.findColumn("hi!\\");
    int var41 = var36.getRowCount();
    minicopier.Copier var42 = new minicopier.Copier();
    var42.setFileCurrentSize(1L);
    var42.setFileCurrentSize(100L);
    int var47 = var42.getTotalPercent();
    java.lang.String var49 = var42.stringURI2StringPath("hi!");
    int var50 = var42.getTotalPercent();
    minicopier.MainQueue var51 = new minicopier.MainQueue(var42);
    javax.swing.table.DefaultTableModel var52 = var51.getTableModel();
    minicopier.Copier var53 = new minicopier.Copier();
    var53.setFileCurrentSize(1L);
    var53.setFileCurrentSize(100L);
    java.lang.Object[] var58 = new java.lang.Object[] { 100L};
    var52.addRow(var58);
    var36.addRow(var58);
    var17.setColumnIdentifiers(var58);
    minicopier.MainQueue.TransfersModel var63 = var6.new TransfersModel(var58, 10);
    java.lang.String var65 = var63.getColumnName(100);
    java.lang.String var67 = var63.getColumnName(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "CW"+ "'", var65.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "K"+ "'", var67.equals("K"));

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test159");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    long var2 = var0.readAndInitBytesCounter();
    long var3 = var0.readAndInitBytesCounter();
    var0.unpause();
    minicopier.MainQueue var5 = new minicopier.MainQueue(var0);
    minicopier.Copier var6 = new minicopier.Copier();
    var6.setFileCurrentSize(1L);
    var6.setFileCurrentSize(100L);
    int var11 = var6.getTotalPercent();
    java.lang.String var13 = var6.stringURI2StringPath("hi!");
    int var14 = var6.getTotalPercent();
    minicopier.MainQueue var15 = new minicopier.MainQueue(var6);
    javax.swing.table.DefaultTableModel var16 = var15.getTableModel();
    minicopier.Copier var17 = new minicopier.Copier();
    var17.setFileCurrentSize(1L);
    var17.setFileCurrentSize(100L);
    java.lang.Object[] var22 = new java.lang.Object[] { 100L};
    var16.addRow(var22);
    minicopier.MainQueue.TransfersModel var25 = var5.new TransfersModel(var22, 1);
    var25.fireTableRowsInserted(2, 1);
    boolean var31 = var25.isCellEditable((-1), 4);
    var25.setRowCount(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test160");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    var0.increaseQueueCurrentSize(11L);
    minicopier.FileToTransfer var12 = new minicopier.FileToTransfer("", "");
    java.lang.String var13 = var12.getSourcePath();
    java.io.File var14 = var12.getDestinationFolder();
    var0.addFolder2Queue(var14, "\\");
    minicopier.FailedQueue var17 = new minicopier.FailedQueue(var0);
    minicopier.Copier var18 = new minicopier.Copier();
    var18.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var21 = new minicopier.FailedQueue(var18);
    minicopier.FileToTransfer var24 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var25 = var24.getName();
    var21.addFile(var24);
    minicopier.Copier var27 = new minicopier.Copier();
    var27.clearBasket();
    long var29 = var27.readAndInitBytesCounter();
    long var30 = var27.getCurrentBytesRemaining();
    minicopier.FailedQueue var31 = new minicopier.FailedQueue(var27);
    minicopier.Copier var32 = new minicopier.Copier();
    var32.setFileCurrentSize(1L);
    var32.setFileCurrentSize(100L);
    java.lang.String var37 = var32.getCurrentFileSource();
    minicopier.MainQueue var38 = new minicopier.MainQueue(var32);
    minicopier.Copier var39 = new minicopier.Copier();
    var39.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var42 = new minicopier.FailedQueue(var39);
    boolean var43 = var42.isEmpty();
    int[] var44 = new int[] { };
    int[] var45 = var42.remove(var44);
    int[] var46 = var38.remove(var44);
    minicopier.Copier var47 = new minicopier.Copier();
    var47.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var50 = new minicopier.FailedQueue(var47);
    boolean var51 = var50.isEmpty();
    int[] var52 = new int[] { };
    int[] var53 = var50.remove(var52);
    int[] var54 = var38.putFirst(var52);
    int[] var55 = var31.retry(var52);
    int[] var56 = var21.remove(var52);
    int[] var57 = var17.retry(var52);
    minicopier.FileToTransfer var60 = new minicopier.FileToTransfer("", "");
    java.io.File var61 = var60.getDestinationFile();
    java.lang.String var62 = var60.getSourcePath();
    java.lang.String var63 = var60.getSourcePath();
    java.io.File var64 = var60.getDestinationFile();
    var17.addFile(var60);
    java.io.File var66 = var60.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + ""+ "'", var62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + ""+ "'", var63.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test161");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    boolean var9 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var11 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test162");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = var6.getDestinationFilePath();
    minicopier.TransferTask var10 = new minicopier.TransferTask(var0, var6, false);
    var10.setPause();
    boolean var12 = var10.getCompleted();
    boolean var13 = var10.getCompleted();
    var10.unpause();
    var10.unpause();
    boolean var16 = var10.getCompleted();
    boolean var17 = var10.getPutInQueue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\"+ "'", var8.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test163");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.clearBasket();
    var0.increaseFileCurrentSize(100L);
    java.lang.String var8 = var0.getCurrentFileDestination();
    int var9 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(1L);
    int var12 = var0.getCurrentPercent();
    var0.add2basket("K\\A\\Destination");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test164");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    var7.changeTargetName("");
    long var10 = var7.getSize();
    java.io.File var11 = var7.getDestinationFolder();
    var0.addFolder2Queue(var11, "\\hi!");
    long var14 = var0.getTotalBytesRemaining();
    var0.decreaseQueueCurrentSize(100L);
    int var17 = var0.basketLength();
    var0.add2basket("A\\F");
    java.lang.String var21 = var0.stringURI2StringPath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test165");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test166");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    java.lang.String var4 = var0.stringURI2StringPath("hi!");
    minicopier.FailedQueue var5 = new minicopier.FailedQueue(var0);
    boolean var6 = var5.isEmpty();
    javax.swing.table.DefaultTableModel var7 = var5.getTableModel();
    minicopier.Copier var8 = new minicopier.Copier();
    var8.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var11 = new minicopier.FailedQueue(var8);
    long var12 = var8.getFileTotalSize();
    minicopier.FileToTransfer var15 = new minicopier.FileToTransfer("", "");
    var15.changeTargetName("");
    long var18 = var15.getSize();
    java.io.File var19 = var15.getDestinationFolder();
    var8.addFolder2Queue(var19, "\\hi!");
    long var22 = var8.getTotalBytesRemaining();
    var8.decreaseQueueCurrentSize(100L);
    int var25 = var8.basketLength();
    var8.add2basket("A\\F");
    minicopier.Copier var28 = new minicopier.Copier();
    var28.setFileCurrentSize(1L);
    var28.setFileCurrentSize(100L);
    int var33 = var28.getTotalPercent();
    java.lang.String var35 = var28.stringURI2StringPath("hi!");
    int var36 = var28.getTotalPercent();
    minicopier.MainQueue var37 = new minicopier.MainQueue(var28);
    javax.swing.table.DefaultTableModel var38 = var37.getTableModel();
    minicopier.Copier var39 = new minicopier.Copier();
    var39.setFileCurrentSize(1L);
    var39.setFileCurrentSize(100L);
    java.lang.Object[] var44 = new java.lang.Object[] { 100L};
    var38.addRow(var44);
    var38.setNumRows(0);
    var38.fireTableDataChanged();
    var38.fireTableStructureChanged();
    java.lang.Class var51 = var38.getColumnClass((-1));
    var38.setNumRows(0);
    minicopier.Copier var54 = new minicopier.Copier();
    var54.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var57 = new minicopier.FailedQueue(var54);
    minicopier.FileToTransfer var60 = new minicopier.FileToTransfer("", "hi!");
    var57.addFile(var60);
    javax.swing.table.DefaultTableModel var62 = var57.getTableModel();
    minicopier.Copier var63 = new minicopier.Copier();
    var63.setFileCurrentSize(1L);
    var63.setFileCurrentSize(100L);
    int var68 = var63.getTotalPercent();
    java.lang.String var70 = var63.stringURI2StringPath("hi!");
    int var71 = var63.getTotalPercent();
    minicopier.MainQueue var72 = new minicopier.MainQueue(var63);
    javax.swing.table.DefaultTableModel var73 = var72.getTableModel();
    minicopier.Copier var75 = new minicopier.Copier();
    var75.setFileCurrentSize(1L);
    var75.setFileCurrentSize(100L);
    int var80 = var75.getTotalPercent();
    java.lang.String var82 = var75.stringURI2StringPath("hi!");
    int var83 = var75.getTotalPercent();
    minicopier.MainQueue var84 = new minicopier.MainQueue(var75);
    javax.swing.table.DefaultTableModel var85 = var84.getTableModel();
    java.lang.Object[] var86 = new java.lang.Object[] { var85};
    var73.addColumn((java.lang.Object)0.0d, var86);
    var73.fireTableRowsInserted(100, 10);
    java.util.Vector var91 = var73.getDataVector();
    var62.setColumnIdentifiers(var91);
    var38.addRow(var91);
    var7.addColumn((java.lang.Object)var8, var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "hi!"+ "'", var70.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "hi!"+ "'", var82.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test167");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    long var2 = var0.readAndInitBytesCounter();
    long var3 = var0.readAndInitBytesCounter();
    var0.unpause();
    minicopier.MainQueue var5 = new minicopier.MainQueue(var0);
    minicopier.Copier var6 = new minicopier.Copier();
    var6.setFileCurrentSize(1L);
    var6.setFileCurrentSize(100L);
    int var11 = var6.getTotalPercent();
    java.lang.String var13 = var6.stringURI2StringPath("hi!");
    int var14 = var6.getTotalPercent();
    minicopier.MainQueue var15 = new minicopier.MainQueue(var6);
    javax.swing.table.DefaultTableModel var16 = var15.getTableModel();
    minicopier.Copier var17 = new minicopier.Copier();
    var17.setFileCurrentSize(1L);
    var17.setFileCurrentSize(100L);
    java.lang.Object[] var22 = new java.lang.Object[] { 100L};
    var16.addRow(var22);
    minicopier.MainQueue.TransfersModel var25 = var5.new TransfersModel(var22, 1);
    minicopier.Copier var26 = new minicopier.Copier();
    var26.setFileCurrentSize(1L);
    var26.setFileCurrentSize(100L);
    java.lang.String var31 = var26.getCurrentFileSource();
    minicopier.MainQueue var32 = new minicopier.MainQueue(var26);
    minicopier.Copier var33 = new minicopier.Copier();
    var33.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var36 = new minicopier.FailedQueue(var33);
    minicopier.Copier var37 = new minicopier.Copier();
    var37.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var40 = new minicopier.FailedQueue(var37);
    boolean var41 = var40.isEmpty();
    int[] var42 = new int[] { };
    int[] var43 = var40.remove(var42);
    int[] var44 = var36.retry(var42);
    int[] var45 = var32.putLast(var42);
    int[] var46 = var5.putFirst(var42);
    javax.swing.table.DefaultTableModel var47 = var5.getTableModel();
    var47.fireTableDataChanged();
    javax.swing.event.TableModelListener[] var49 = var47.getTableModelListeners();
    var47.fireTableRowsInserted(100, 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test168");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.unpause();
    boolean var6 = var0.getBusy();
    var0.paste2URIString("Size");
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    javax.swing.table.DefaultTableModel var11 = var9.getTableModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test169");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    java.lang.Object[] var23 = new java.lang.Object[] { var22};
    var10.addColumn((java.lang.Object)0.0d, var23);
    var10.setColumnCount(0);
    java.lang.String var28 = var10.getColumnName(100);
    java.lang.Class var30 = var10.getColumnClass(1);
    int var31 = var10.getRowCount();
    int var32 = var10.getColumnCount();
    var10.setNumRows(10);
    var10.setNumRows(10);
    var10.setNumRows(9);
    minicopier.Copier var39 = new minicopier.Copier();
    var39.setFileCurrentSize(1L);
    java.lang.String var43 = var39.stringURI2StringPath("hi!");
    minicopier.Copier var44 = new minicopier.Copier();
    var44.clearBasket();
    long var46 = var44.readAndInitBytesCounter();
    long var47 = var44.readAndInitBytesCounter();
    int var48 = var44.basketLength();
    long var49 = var44.getCurrentBytesRemaining();
    var44.paste("A");
    minicopier.FileToTransfer var54 = new minicopier.FileToTransfer("", "");
    java.lang.String var55 = var54.getSourcePath();
    java.lang.String var56 = var54.getName();
    java.io.File var57 = var54.getSourceFile();
    var44.addFolder2Queue(var57, "E");
    var39.addFolder2Queue(var57, "\\");
    minicopier.FileToTransfer var64 = new minicopier.FileToTransfer("", "");
    java.lang.String var65 = var64.getSourcePath();
    java.lang.String var66 = var64.getName();
    java.io.File var67 = var64.getSourceFile();
    java.lang.String var68 = var64.getSourcePath();
    java.io.File var69 = var64.getDestinationFile();
    minicopier.TransferTask var71 = new minicopier.TransferTask(var39, var64, true);
    var71.unpause();
    boolean var73 = var71.getCancel();
    var10.addColumn((java.lang.Object)var71);
    var71.setCancelAndQueue(true);
    boolean var77 = var71.getCancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "CW"+ "'", var28.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + ""+ "'", var65.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + ""+ "'", var66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test170");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.unpause();
    var0.addURIString2basket("A");
    int var8 = var0.basketLength();
    var0.add2basket("A");
    int var11 = var0.getTotalPercent();
    long var12 = var0.getQueueTotalSize();
    var0.decreaseQueueCurrentSize((-111L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test171");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.setColumnCount(0);
    int var14 = var10.findColumn("hi!\\");
    int var16 = var10.findColumn("hi!\\");
    javax.swing.event.TableModelListener[] var17 = var10.getTableModelListeners();
    int var19 = var10.findColumn("K");
    minicopier.FileToTransfer var22 = new minicopier.FileToTransfer("", "");
    var22.changeTargetName("");
    var22.changeTargetName("B");
    minicopier.Copier var27 = new minicopier.Copier();
    var27.setFileCurrentSize(1L);
    var27.setFileCurrentSize(100L);
    int var32 = var27.getTotalPercent();
    java.lang.String var34 = var27.stringURI2StringPath("hi!");
    int var35 = var27.getTotalPercent();
    minicopier.MainQueue var36 = new minicopier.MainQueue(var27);
    javax.swing.table.DefaultTableModel var37 = var36.getTableModel();
    var37.setColumnCount(0);
    int var41 = var37.findColumn("hi!\\");
    int var42 = var37.getRowCount();
    var37.fireTableStructureChanged();
    javax.swing.event.TableModelListener[] var44 = var37.getTableModelListeners();
    var10.addColumn((java.lang.Object)var22, (java.lang.Object[])var44);
    java.lang.String var46 = var22.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test172");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    boolean var2 = var0.isEmpty();
    var0.add("hi!\\");
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    java.util.Iterator var8 = var0.getIterator();
    var0.add("\\hi!");
    java.util.Iterator var11 = var0.getIterator();
    boolean var12 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test173");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.FailedQueue var6 = new minicopier.FailedQueue(var0);
    var0.decreaseQueueCurrentSize(11L);
    var0.clearBasket();
    boolean var10 = var0.pause();
    java.lang.String var11 = var0.getCurrentFileSource();
    var0.increaseFileCurrentSize((-9L));
    long var14 = var0.getQueueTotalSize();
    var0.forceStart();
    int var16 = var0.basketLength();
    boolean var17 = var0.getBusy();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test174");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    long var2 = var0.readAndInitBytesCounter();
    long var3 = var0.readAndInitBytesCounter();
    int var4 = var0.basketLength();
    long var5 = var0.getCurrentBytesRemaining();
    var0.paste("A");
    var0.forceStart();
    long var9 = var0.getFileTotalSize();
    minicopier.FileToTransfer var12 = new minicopier.FileToTransfer("hi!\\A", "hi!\\A");
    minicopier.TransferTask var14 = new minicopier.TransferTask(var0, var12, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test175");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.FailedQueue var6 = new minicopier.FailedQueue(var0);
    var0.decreaseQueueCurrentSize(11L);
    var0.clearBasket();
    boolean var10 = var0.pause();
    java.lang.String var11 = var0.getCurrentFileSource();
    var0.increaseFileCurrentSize((-9L));
    boolean var16 = var0.nameIsAcceptable("K", "\\hi!");
    boolean var17 = var0.getPause();
    long var18 = var0.readAndInitBytesCounter();
    boolean var19 = var0.pause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-9L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test176");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var11 = new minicopier.Copier();
    var11.setFileCurrentSize(1L);
    var11.setFileCurrentSize(100L);
    java.lang.Object[] var16 = new java.lang.Object[] { 100L};
    var10.addRow(var16);
    var10.setNumRows(0);
    var10.fireTableDataChanged();
    var10.fireTableStructureChanged();
    var10.fireTableStructureChanged();
    java.lang.Class var24 = var10.getColumnClass(0);
    javax.swing.event.TableModelListener[] var25 = var10.getTableModelListeners();
    minicopier.Copier var27 = new minicopier.Copier();
    var27.setFileCurrentSize(1L);
    var27.setFileCurrentSize(100L);
    java.lang.String var32 = var27.getCurrentFileSource();
    minicopier.MainQueue var33 = new minicopier.MainQueue(var27);
    minicopier.Copier var34 = new minicopier.Copier();
    var34.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var37 = new minicopier.FailedQueue(var34);
    boolean var38 = var37.isEmpty();
    int[] var39 = new int[] { };
    int[] var40 = var37.remove(var39);
    int[] var41 = var33.remove(var39);
    javax.swing.table.DefaultTableModel var42 = var33.getTableModel();
    javax.swing.table.DefaultTableModel var43 = var33.getTableModel();
    var43.fireTableCellUpdated(9, 3);
    minicopier.Copier var47 = new minicopier.Copier();
    var47.setFileCurrentSize(1L);
    var47.setFileCurrentSize(100L);
    java.lang.String var52 = var47.getCurrentFileSource();
    minicopier.MainQueue var53 = new minicopier.MainQueue(var47);
    minicopier.Copier var54 = new minicopier.Copier();
    var54.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var57 = new minicopier.FailedQueue(var54);
    boolean var58 = var57.isEmpty();
    int[] var59 = new int[] { };
    int[] var60 = var57.remove(var59);
    int[] var61 = var53.remove(var59);
    minicopier.Copier var62 = new minicopier.Copier();
    var62.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var65 = new minicopier.FailedQueue(var62);
    boolean var66 = var65.isEmpty();
    int[] var67 = new int[] { };
    int[] var68 = var65.remove(var67);
    int[] var69 = var53.putFirst(var67);
    var43.addColumn((java.lang.Object)var53);
    minicopier.Copier var71 = new minicopier.Copier();
    var71.clearBasket();
    long var73 = var71.readAndInitBytesCounter();
    long var74 = var71.readAndInitBytesCounter();
    var71.unpause();
    minicopier.MainQueue var76 = new minicopier.MainQueue(var71);
    minicopier.Copier var77 = new minicopier.Copier();
    var77.setFileCurrentSize(1L);
    var77.setFileCurrentSize(100L);
    int var82 = var77.getTotalPercent();
    java.lang.String var84 = var77.stringURI2StringPath("hi!");
    int var85 = var77.getTotalPercent();
    minicopier.MainQueue var86 = new minicopier.MainQueue(var77);
    javax.swing.table.DefaultTableModel var87 = var86.getTableModel();
    minicopier.Copier var88 = new minicopier.Copier();
    var88.setFileCurrentSize(1L);
    var88.setFileCurrentSize(100L);
    java.lang.Object[] var93 = new java.lang.Object[] { 100L};
    var87.addRow(var93);
    minicopier.MainQueue.TransfersModel var96 = var76.new TransfersModel(var93, 1);
    minicopier.MainQueue.TransfersModel var98 = var53.new TransfersModel(var93, 11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.insertRow(100, var93);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "hi!"+ "'", var84.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test177");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.FailedQueue var6 = new minicopier.FailedQueue(var0);
    var0.decreaseQueueCurrentSize(11L);
    var0.clearBasket();
    boolean var10 = var0.pause();
    java.lang.String var11 = var0.getCurrentFileSource();
    var0.increaseFileCurrentSize((-9L));
    boolean var16 = var0.nameIsAcceptable("K", "\\hi!");
    boolean var17 = var0.getPause();
    var0.increaseQueueCurrentSize((-1L));
    int var20 = var0.getTotalPercent();
    int var21 = var0.basketLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test178");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    int var9 = var0.getTotalPercent();
    var0.setFileCurrentSize(0L);
    long var12 = var0.getFileTotalSize();
    var0.increaseQueueCurrentSize(10L);
    var0.decreaseQueueCurrentSize((-8L));
    var0.forceStart();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test179");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    var0.forceStart();
    var0.add2basket("hi!");
    var0.forceStart();
    boolean var6 = var0.pause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test180");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    javax.swing.table.DefaultTableModel var11 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    minicopier.Copier var23 = new minicopier.Copier();
    var23.setFileCurrentSize(1L);
    var23.setFileCurrentSize(100L);
    int var28 = var23.getTotalPercent();
    java.lang.String var30 = var23.stringURI2StringPath("hi!");
    int var31 = var23.getTotalPercent();
    minicopier.MainQueue var32 = new minicopier.MainQueue(var23);
    javax.swing.table.DefaultTableModel var33 = var32.getTableModel();
    minicopier.Copier var34 = new minicopier.Copier();
    var34.setFileCurrentSize(1L);
    var34.setFileCurrentSize(100L);
    java.lang.Object[] var39 = new java.lang.Object[] { 100L};
    var33.addRow(var39);
    java.lang.Object[][] var41 = new java.lang.Object[][] { var39};
    minicopier.FileToTransfer var44 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var45 = var44.getName();
    java.lang.Object[] var46 = new java.lang.Object[] { var45};
    var22.setDataVector(var41, var46);
    minicopier.MainQueue.TransfersModel var49 = var9.new TransfersModel((java.lang.Object[])var41, 1);
    var49.fireTableRowsUpdated(10, 100);
    var49.fireTableRowsUpdated(2, (-1));
    var49.setColumnCount(0);
    boolean var60 = var49.isCellEditable(100, 9);
    var49.setColumnCount(9);
    boolean var65 = var49.isCellEditable(4, 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test181");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!", "hi!");
    java.io.File var3 = var2.getSourceFile();
    var2.changeTargetName("Destination");
    java.lang.String var6 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\\hi!"+ "'", var6.equals("\\hi!"));

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test182");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!");
    var2.changeTargetName("CW");
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\CW"+ "'", var5.equals("hi!\\CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test183");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.setFileCurrentSize(10L);
    minicopier.FileToTransfer var9 = new minicopier.FileToTransfer("", "");
    var9.changeTargetName("");
    java.io.File var12 = var9.getDestinationFile();
    java.io.File var13 = var9.getSourceFile();
    boolean var14 = minicopier.Copier.isNotLink(var13);
    var0.addFolder2Queue(var13, "hi!\\");
    var0.increaseFileCurrentSize(10L);
    boolean var21 = var0.nameIsAcceptable("CW", "hi!");
    minicopier.FileToTransfer var24 = new minicopier.FileToTransfer("A", "K");
    minicopier.TransferTask var26 = new minicopier.TransferTask(var0, var24, false);
    var26.setPause();
    boolean var28 = var26.getCompleted();
    var26.setPause();
    var26.setPause();
    var26.setCancelAndQueue(true);
    var26.setPause();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test184");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    java.lang.Object[] var23 = new java.lang.Object[] { var22};
    var10.addColumn((java.lang.Object)0.0d, var23);
    var10.setColumnCount(0);
    java.lang.String var28 = var10.getColumnName(100);
    java.lang.Class var30 = var10.getColumnClass(1);
    int var31 = var10.getRowCount();
    minicopier.Copier var32 = new minicopier.Copier();
    var32.setFileCurrentSize(1L);
    var32.setFileCurrentSize(100L);
    int var37 = var32.getTotalPercent();
    java.lang.String var39 = var32.stringURI2StringPath("hi!");
    int var40 = var32.getTotalPercent();
    minicopier.MainQueue var41 = new minicopier.MainQueue(var32);
    javax.swing.table.DefaultTableModel var42 = var41.getTableModel();
    var42.setColumnCount(0);
    int var46 = var42.findColumn("hi!\\");
    int var47 = var42.getRowCount();
    minicopier.Copier var48 = new minicopier.Copier();
    var48.setFileCurrentSize(1L);
    var48.setFileCurrentSize(100L);
    int var53 = var48.getTotalPercent();
    java.lang.String var55 = var48.stringURI2StringPath("hi!");
    int var56 = var48.getTotalPercent();
    minicopier.MainQueue var57 = new minicopier.MainQueue(var48);
    javax.swing.table.DefaultTableModel var58 = var57.getTableModel();
    var58.setColumnCount(0);
    int var62 = var58.findColumn("hi!\\");
    var58.setColumnCount(10);
    var58.fireTableStructureChanged();
    int var66 = var58.getRowCount();
    java.util.Vector var67 = var58.getDataVector();
    var42.setColumnIdentifiers(var67);
    var10.addRow(var67);
    var10.fireTableStructureChanged();
    var10.removeRow(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "CW"+ "'", var28.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test185");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(0L);
    long var8 = var0.readAndInitBytesCounter();
    int var9 = var0.getTotalPercent();
    int var10 = var0.basketLength();
    var0.unpause();
    var0.setFileCurrentSize(19L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test186");


    minicopier.Copier var0 = new minicopier.Copier();
    minicopier.MainQueue var1 = new minicopier.MainQueue(var0);
    var0.add2basket("\\A");
    minicopier.Copier var4 = new minicopier.Copier();
    var4.clearBasket();
    long var6 = var4.readAndInitBytesCounter();
    long var7 = var4.getCurrentBytesRemaining();
    minicopier.FailedQueue var8 = new minicopier.FailedQueue(var4);
    boolean var9 = var8.isEmpty();
    minicopier.Copier var10 = new minicopier.Copier();
    var10.increaseFileCurrentSize((-1L));
    var10.add2basket("");
    var10.increaseFileCurrentSize(10L);
    var10.clearBasket();
    minicopier.FileToTransfer var20 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var21 = var20.getName();
    java.lang.String var22 = var20.getDestinationFilePath();
    var20.changeTargetName("hi!\\");
    java.io.File var25 = var20.getSourceFile();
    java.lang.String var26 = var20.getName();
    minicopier.TransferTask var28 = new minicopier.TransferTask(var10, var20, true);
    java.lang.String var29 = var20.getDestinationFolderPath();
    var8.addFile(var20);
    boolean var31 = var8.isEmpty();
    minicopier.FileToTransfer var34 = new minicopier.FileToTransfer("", "");
    java.lang.String var35 = var34.getName();
    var8.addFile(var34);
    java.lang.String var37 = var34.getName();
    java.lang.String var38 = var34.getDestinationFilePath();
    java.lang.String var39 = var34.getDestinationFilePath();
    minicopier.TransferTask var41 = new minicopier.TransferTask(var0, var34, false);
    java.lang.String var42 = var34.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!\\"+ "'", var22.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "\\"+ "'", var38.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "\\"+ "'", var39.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test187");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    var0.paste("hi!");
    boolean var6 = var0.pause();
    boolean var7 = var0.pause();
    java.lang.String var8 = var0.getCurrentFileDestination();
    boolean var9 = var0.getPause();
    long var10 = var0.getCurrentBytesRemaining();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1L);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test188");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var11 = new minicopier.Copier();
    var11.setFileCurrentSize(1L);
    var11.setFileCurrentSize(100L);
    java.lang.Object[] var16 = new java.lang.Object[] { 100L};
    var10.addRow(var16);
    var10.setNumRows(0);
    var10.fireTableDataChanged();
    var10.fireTableStructureChanged();
    java.lang.Class var23 = var10.getColumnClass((-1));
    javax.swing.event.TableModelListener[] var24 = var10.getTableModelListeners();
    var10.fireTableRowsInserted(4, 2);
    int var29 = var10.findColumn("D");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test189");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    long var11 = var0.getCurrentBytesRemaining();
    minicopier.MainQueue var12 = new minicopier.MainQueue(var0);
    minicopier.FileToTransfer var15 = new minicopier.FileToTransfer("CW", "");
    java.lang.String var16 = var15.getDestinationFolderPath();
    minicopier.TransferTask var18 = new minicopier.TransferTask(var0, var15, true);
    var18.unpause();
    boolean var20 = var18.getPutInQueue();
    boolean var21 = var18.getPutInQueue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test190");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.setColumnCount(0);
    int var14 = var10.findColumn("hi!\\");
    int var15 = var10.getRowCount();
    int var17 = var10.findColumn("hi!");
    minicopier.Copier var18 = new minicopier.Copier();
    var18.setFileCurrentSize(1L);
    var18.setFileCurrentSize(100L);
    java.lang.String var23 = var18.getCurrentFileSource();
    minicopier.MainQueue var24 = new minicopier.MainQueue(var18);
    minicopier.Copier var25 = new minicopier.Copier();
    var25.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var28 = new minicopier.FailedQueue(var25);
    minicopier.FileToTransfer var31 = new minicopier.FileToTransfer("", "hi!");
    var28.addFile(var31);
    javax.swing.table.DefaultTableModel var33 = var28.getTableModel();
    minicopier.Copier var34 = new minicopier.Copier();
    var34.setFileCurrentSize(1L);
    var34.setFileCurrentSize(100L);
    int var39 = var34.getTotalPercent();
    java.lang.String var41 = var34.stringURI2StringPath("hi!");
    int var42 = var34.getTotalPercent();
    minicopier.MainQueue var43 = new minicopier.MainQueue(var34);
    javax.swing.table.DefaultTableModel var44 = var43.getTableModel();
    minicopier.Copier var46 = new minicopier.Copier();
    var46.setFileCurrentSize(1L);
    var46.setFileCurrentSize(100L);
    int var51 = var46.getTotalPercent();
    java.lang.String var53 = var46.stringURI2StringPath("hi!");
    int var54 = var46.getTotalPercent();
    minicopier.MainQueue var55 = new minicopier.MainQueue(var46);
    javax.swing.table.DefaultTableModel var56 = var55.getTableModel();
    java.lang.Object[] var57 = new java.lang.Object[] { var56};
    var44.addColumn((java.lang.Object)0.0d, var57);
    var44.fireTableRowsInserted(100, 10);
    java.util.Vector var62 = var44.getDataVector();
    var33.setColumnIdentifiers(var62);
    var10.addColumn((java.lang.Object)var18, var62);
    long var65 = var18.getCurrentBytesRemaining();
    minicopier.FileToTransfer var68 = new minicopier.FileToTransfer("", "");
    var68.changeTargetName("");
    long var71 = var68.getSize();
    java.io.File var72 = var68.getDestinationFolder();
    java.io.File var73 = var68.getDestinationFile();
    java.io.File var74 = var68.getSourceFile();
    minicopier.TransferTask var76 = new minicopier.TransferTask(var18, var68, true);
    java.io.File var77 = var68.getDestinationFolder();
    java.lang.String var78 = var68.getName();
    java.io.File var79 = var68.getDestinationFile();
    java.lang.String var80 = var68.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + ""+ "'", var78.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + ""+ "'", var80.equals(""));

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test191");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = var6.getDestinationFilePath();
    minicopier.TransferTask var10 = new minicopier.TransferTask(var0, var6, false);
    var10.setPause();
    boolean var12 = var10.getCompleted();
    var10.setCancelAndQueue(true);
    boolean var15 = var10.getPutInQueue();
    var10.setPause();
    boolean var17 = var10.getCancel();
    var10.setPause();
    var10.setPause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\"+ "'", var8.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test192");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("Destination\\CW", "hi!\\");

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test193");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    long var3 = var0.getQueueTotalSize();
    var0.unpause();
    int var5 = var0.getCurrentPercent();
    java.lang.String var7 = var0.stringURI2StringPath("Destination");
    long var8 = var0.getQueueTotalSize();
    long var9 = var0.getCurrentBytesRemaining();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Destination"+ "'", var7.equals("Destination"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1L);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test194");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    java.lang.Object[] var23 = new java.lang.Object[] { var22};
    var10.addColumn((java.lang.Object)0.0d, var23);
    minicopier.Copier var25 = new minicopier.Copier();
    var25.increaseFileCurrentSize((-1L));
    long var28 = var25.getQueueTotalSize();
    minicopier.MainQueue var29 = new minicopier.MainQueue(var25);
    var25.forceStart();
    minicopier.MainQueue var31 = new minicopier.MainQueue(var25);
    var10.addColumn((java.lang.Object)var31);
    minicopier.Copier var33 = new minicopier.Copier();
    var33.setFileCurrentSize(1L);
    var33.setFileCurrentSize(100L);
    boolean var38 = var33.getPause();
    long var39 = var33.getQueueTotalSize();
    minicopier.MainQueue var40 = new minicopier.MainQueue(var33);
    minicopier.Copier var41 = new minicopier.Copier();
    var41.setFileCurrentSize(1L);
    var41.setFileCurrentSize(100L);
    int var46 = var41.getTotalPercent();
    var41.increaseFileCurrentSize(0L);
    long var49 = var41.readAndInitBytesCounter();
    boolean var50 = var41.getPause();
    var41.paste("CW");
    var41.addURIString2basket("K");
    minicopier.MainQueue var55 = new minicopier.MainQueue(var41);
    minicopier.Copier var56 = new minicopier.Copier();
    var56.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var59 = new minicopier.FailedQueue(var56);
    boolean var60 = var59.isEmpty();
    int[] var61 = new int[] { };
    int[] var62 = var59.remove(var61);
    int[] var63 = var55.putLast(var61);
    int[] var64 = var40.putLast(var61);
    minicopier.Copier var65 = new minicopier.Copier();
    var65.setFileCurrentSize(1L);
    var65.setFileCurrentSize(100L);
    int var70 = var65.getTotalPercent();
    java.lang.String var72 = var65.stringURI2StringPath("hi!");
    int var73 = var65.getTotalPercent();
    minicopier.MainQueue var74 = new minicopier.MainQueue(var65);
    javax.swing.table.DefaultTableModel var75 = var74.getTableModel();
    javax.swing.table.DefaultTableModel var76 = var74.getTableModel();
    minicopier.Copier var77 = new minicopier.Copier();
    var77.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var80 = new minicopier.FailedQueue(var77);
    minicopier.Copier var81 = new minicopier.Copier();
    var81.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var84 = new minicopier.FailedQueue(var81);
    boolean var85 = var84.isEmpty();
    int[] var86 = new int[] { };
    int[] var87 = var84.remove(var86);
    int[] var88 = var80.retry(var86);
    int[] var89 = var74.remove(var86);
    int[] var90 = var40.remove(var86);
    int[] var91 = var31.putFirst(var86);
    boolean var92 = var31.isEmpty();
    boolean var93 = var31.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      minicopier.FileToTransfer var94 = var31.extractFirst();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == true);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test195");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    long var2 = var0.readAndInitBytesCounter();
    long var3 = var0.readAndInitBytesCounter();
    var0.increaseFileCurrentSize(100L);
    boolean var8 = var0.nameIsAcceptable("", "CW");
    minicopier.FileToTransfer var11 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var12 = var11.getName();
    java.lang.String var13 = var11.getDestinationFilePath();
    minicopier.TransferTask var15 = new minicopier.TransferTask(var0, var11, false);
    long var16 = var11.getSize();
    java.lang.String var17 = var11.getDestinationFilePath();
    var11.changeTargetName("hi!\\");
    java.lang.String var20 = var11.getName();
    long var21 = var11.getSize();
    java.io.File var22 = var11.getDestinationFile();
    java.lang.String var23 = var11.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\"+ "'", var13.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!\\"+ "'", var17.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test196");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    java.lang.Object[] var23 = new java.lang.Object[] { var22};
    var10.addColumn((java.lang.Object)0.0d, var23);
    var10.fireTableRowsInserted(100, 10);
    int var28 = var10.getColumnCount();
    var10.fireTableStructureChanged();
    var10.fireTableRowsDeleted(0, 3);
    int var33 = var10.getRowCount();
    java.lang.String var35 = var10.getColumnName(9);
    java.util.Vector var36 = var10.getDataVector();
    minicopier.Copier var38 = new minicopier.Copier();
    var38.setFileCurrentSize(1L);
    var38.setFileCurrentSize(100L);
    int var43 = var38.getTotalPercent();
    java.lang.String var45 = var38.stringURI2StringPath("hi!");
    int var46 = var38.getTotalPercent();
    minicopier.MainQueue var47 = new minicopier.MainQueue(var38);
    javax.swing.table.DefaultTableModel var48 = var47.getTableModel();
    var48.fireTableRowsInserted(1, 0);
    var48.fireTableStructureChanged();
    minicopier.Copier var53 = new minicopier.Copier();
    var53.setFileCurrentSize(1L);
    var53.setFileCurrentSize(100L);
    int var58 = var53.getTotalPercent();
    var53.clearBasket();
    java.lang.Object[] var60 = new java.lang.Object[] { var53};
    var48.addRow(var60);
    var48.fireTableRowsUpdated(3, 10);
    java.util.Vector var65 = var48.getDataVector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.insertRow(10, var65);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "J"+ "'", var35.equals("J"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test197");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.fireTableRowsInserted(1, 0);
    var10.fireTableDataChanged();
    var10.setNumRows(1);
    minicopier.Copier var17 = new minicopier.Copier();
    var17.setFileCurrentSize(1L);
    var17.setFileCurrentSize(100L);
    int var22 = var17.getTotalPercent();
    java.lang.String var24 = var17.stringURI2StringPath("hi!");
    int var25 = var17.getTotalPercent();
    minicopier.MainQueue var26 = new minicopier.MainQueue(var17);
    javax.swing.table.DefaultTableModel var27 = var26.getTableModel();
    javax.swing.table.DefaultTableModel var28 = var26.getTableModel();
    minicopier.Copier var29 = new minicopier.Copier();
    var29.setFileCurrentSize(1L);
    var29.setFileCurrentSize(100L);
    int var34 = var29.getTotalPercent();
    java.lang.String var36 = var29.stringURI2StringPath("hi!");
    int var37 = var29.getTotalPercent();
    minicopier.MainQueue var38 = new minicopier.MainQueue(var29);
    javax.swing.table.DefaultTableModel var39 = var38.getTableModel();
    var39.setColumnCount(0);
    int var43 = var39.findColumn("hi!\\");
    int var45 = var39.findColumn("hi!\\");
    javax.swing.event.TableModelListener[] var46 = var39.getTableModelListeners();
    var28.addRow((java.lang.Object[])var46);
    var10.setColumnIdentifiers((java.lang.Object[])var46);
    int var49 = var10.getRowCount();
    var10.setRowCount(100);
    java.lang.String var53 = var10.getColumnName(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "CW"+ "'", var53.equals("CW"));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test198");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var11 = new minicopier.Copier();
    var11.setFileCurrentSize(1L);
    var11.setFileCurrentSize(100L);
    java.lang.Object[] var16 = new java.lang.Object[] { 100L};
    var10.addRow(var16);
    var10.setNumRows(0);
    var10.setColumnCount(10);
    java.lang.String var23 = var10.getColumnName(4);
    minicopier.Copier var24 = new minicopier.Copier();
    var24.increaseFileCurrentSize((-1L));
    int var27 = var24.basketLength();
    long var28 = var24.getFileTotalSize();
    minicopier.FileToTransfer var31 = new minicopier.FileToTransfer("", "");
    java.io.File var32 = var31.getDestinationFolder();
    var24.addFolder2Queue(var32, "hi!");
    minicopier.Copier var35 = new minicopier.Copier();
    var35.increaseFileCurrentSize((-1L));
    int var38 = var35.basketLength();
    long var39 = var35.getFileTotalSize();
    minicopier.FileToTransfer var42 = new minicopier.FileToTransfer("", "");
    java.io.File var43 = var42.getDestinationFolder();
    var35.addFolder2Queue(var43, "hi!");
    var24.addFolder2Queue(var43, "");
    minicopier.FileToTransfer var50 = new minicopier.FileToTransfer("", "");
    java.io.File var51 = var50.getDestinationFolder();
    java.lang.String var52 = var50.getDestinationFolderPath();
    java.io.File var53 = var50.getDestinationFolder();
    var24.addFolder2Queue(var53, "hi!");
    minicopier.FileToTransfer var58 = new minicopier.FileToTransfer("CW", "");
    minicopier.TransferTask var60 = new minicopier.TransferTask(var24, var58, true);
    long var61 = var58.getSize();
    var10.addColumn((java.lang.Object)var58);
    javax.swing.event.TableModelListener[] var63 = var10.getTableModelListeners();
    java.lang.Class var65 = var10.getColumnClass(9);
    java.lang.Class var67 = var10.getColumnClass(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "E"+ "'", var23.equals("E"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test199");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    java.lang.Object[] var23 = new java.lang.Object[] { var22};
    var10.addColumn((java.lang.Object)0.0d, var23);
    var10.setColumnCount(0);
    java.lang.String var28 = var10.getColumnName(100);
    java.util.Vector var29 = var10.getDataVector();
    int var31 = var10.findColumn("\\hi!");
    javax.swing.event.TableModelListener[] var32 = var10.getTableModelListeners();
    java.lang.Class var34 = var10.getColumnClass((-1));
    int var35 = var10.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "CW"+ "'", var28.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test200");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(0L);
    long var8 = var0.readAndInitBytesCounter();
    boolean var9 = var0.getPause();
    var0.paste("CW");
    var0.addURIString2basket("K");
    minicopier.MainQueue var14 = new minicopier.MainQueue(var0);
    minicopier.Copier var15 = new minicopier.Copier();
    var15.setFileCurrentSize(1L);
    var15.setFileCurrentSize(100L);
    int var20 = var15.getTotalPercent();
    java.lang.String var22 = var15.stringURI2StringPath("hi!");
    int var23 = var15.getTotalPercent();
    minicopier.MainQueue var24 = new minicopier.MainQueue(var15);
    javax.swing.table.DefaultTableModel var25 = var24.getTableModel();
    var25.setColumnCount(0);
    int var29 = var25.findColumn("hi!\\");
    int var30 = var25.getRowCount();
    minicopier.Copier var31 = new minicopier.Copier();
    var31.setFileCurrentSize(1L);
    var31.setFileCurrentSize(100L);
    int var36 = var31.getTotalPercent();
    java.lang.String var38 = var31.stringURI2StringPath("hi!");
    int var39 = var31.getTotalPercent();
    minicopier.MainQueue var40 = new minicopier.MainQueue(var31);
    javax.swing.table.DefaultTableModel var41 = var40.getTableModel();
    minicopier.Copier var42 = new minicopier.Copier();
    var42.setFileCurrentSize(1L);
    var42.setFileCurrentSize(100L);
    java.lang.Object[] var47 = new java.lang.Object[] { 100L};
    var41.addRow(var47);
    var25.addRow(var47);
    java.lang.Class var51 = var25.getColumnClass(4);
    int var52 = var25.getColumnCount();
    javax.swing.event.TableModelListener[] var53 = var25.getTableModelListeners();
    minicopier.MainQueue.TransfersModel var55 = var14.new TransfersModel((java.lang.Object[])var53, 0);
    javax.swing.table.DefaultTableModel var56 = var14.getTableModel();
    minicopier.Copier var57 = new minicopier.Copier();
    var57.setFileCurrentSize(1L);
    var57.setFileCurrentSize(100L);
    int var62 = var57.getTotalPercent();
    java.lang.String var64 = var57.stringURI2StringPath("hi!");
    int var65 = var57.getTotalPercent();
    minicopier.MainQueue var66 = new minicopier.MainQueue(var57);
    javax.swing.table.DefaultTableModel var67 = var66.getTableModel();
    minicopier.Copier var69 = new minicopier.Copier();
    var69.setFileCurrentSize(1L);
    var69.setFileCurrentSize(100L);
    int var74 = var69.getTotalPercent();
    java.lang.String var76 = var69.stringURI2StringPath("hi!");
    int var77 = var69.getTotalPercent();
    minicopier.MainQueue var78 = new minicopier.MainQueue(var69);
    javax.swing.table.DefaultTableModel var79 = var78.getTableModel();
    java.lang.Object[] var80 = new java.lang.Object[] { var79};
    var67.addColumn((java.lang.Object)0.0d, var80);
    minicopier.Copier var82 = new minicopier.Copier();
    var82.increaseFileCurrentSize((-1L));
    long var85 = var82.getQueueTotalSize();
    minicopier.MainQueue var86 = new minicopier.MainQueue(var82);
    var82.forceStart();
    minicopier.MainQueue var88 = new minicopier.MainQueue(var82);
    var67.addColumn((java.lang.Object)var88);
    java.lang.String var91 = var67.getColumnName(0);
    var67.fireTableStructureChanged();
    javax.swing.event.TableModelListener[] var93 = var67.getTableModelListeners();
    minicopier.MainQueue.TransfersModel var95 = var14.new TransfersModel((java.lang.Object[])var93, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!"+ "'", var64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "hi!"+ "'", var76.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + "Source"+ "'", var91.equals("Source"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test201");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    var0.paste("hi!");
    boolean var6 = var0.pause();
    boolean var7 = var0.pause();
    boolean var8 = var0.getBusy();
    var0.unpause();
    var0.forceStart();
    long var11 = var0.getTotalBytesRemaining();
    long var12 = var0.getQueueTotalSize();
    var0.forceStart();
    var0.forceStart();
    var0.setFileCurrentSize(99L);
    var0.decreaseQueueCurrentSize((-10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test202");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(0L);
    long var8 = var0.readAndInitBytesCounter();
    boolean var9 = var0.getPause();
    var0.paste("CW");
    var0.addURIString2basket("K");
    minicopier.FileToTransfer var16 = new minicopier.FileToTransfer("", "A");
    java.io.File var17 = var16.getDestinationFolder();
    var0.addFolder2Queue(var17, "CW");
    var0.forceStart();
    var0.unpause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test203");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    int var5 = var0.basketLength();
    var0.increaseFileCurrentSize(100L);
    var0.forceStart();
    var0.increaseFileCurrentSize((-20L));
    long var11 = var0.readAndInitBytesCounter();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 79L);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test204");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    boolean var10 = var0.nameIsAcceptable("", "\\");
    long var11 = var0.getQueueTotalSize();
    boolean var14 = var0.nameIsAcceptable("Source", "Source");
    var0.add2basket("\\hi!");
    var0.clearBasket();
    java.lang.String var18 = var0.getCurrentFileSource();
    int var19 = var0.basketLength();
    var0.paste2URIString("Source");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test205");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.clearBasket();
    var0.increaseQueueCurrentSize(1L);
    boolean var6 = var0.getBusy();
    int var7 = var0.getTotalPercent();
    long var8 = var0.getQueueTotalSize();
    java.lang.String var9 = var0.getCurrentFileDestination();
    var0.unpause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test206");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    java.lang.String var4 = var0.stringURI2StringPath("hi!");
    var0.setFileCurrentSize((-100L));
    long var7 = var0.getFileTotalSize();
    var0.addURIString2basket("hi!");
    long var10 = var0.getFileTotalSize();
    int var11 = var0.getTotalPercent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test207");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    long var11 = var0.getCurrentBytesRemaining();
    var0.setFileCurrentSize(0L);
    var0.paste("\\");
    int var16 = var0.basketLength();
    var0.paste("CW\\E");
    minicopier.Copier var19 = new minicopier.Copier();
    var19.increaseFileCurrentSize((-1L));
    var19.increaseQueueCurrentSize((-1L));
    minicopier.FileToTransfer var26 = new minicopier.FileToTransfer("", "");
    var26.changeTargetName("");
    java.io.File var29 = var26.getDestinationFile();
    minicopier.TransferTask var31 = new minicopier.TransferTask(var19, var26, true);
    java.io.File var32 = var26.getSourceFile();
    var0.addFolder2Queue(var32, "hi!");
    long var35 = var0.getTotalBytesRemaining();
    boolean var38 = var0.nameIsAcceptable("D\\D", "CW\\E");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test208");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    var0.forceStart();
    long var3 = var0.getFileTotalSize();
    int var4 = var0.basketLength();
    long var5 = var0.getTotalBytesRemaining();
    long var6 = var0.getTotalBytesRemaining();
    var0.increaseFileCurrentSize((-90L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test209");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = var6.getDestinationFilePath();
    minicopier.TransferTask var10 = new minicopier.TransferTask(var0, var6, false);
    boolean var11 = var10.getCompleted();
    boolean var12 = var10.getCompleted();
    boolean var13 = var10.getCompleted();
    var10.setPause();
    var10.setCancelAndQueue(true);
    var10.unpause();
    var10.setPause();
    var10.setPause();
    boolean var20 = var10.getPutInQueue();
    boolean var21 = var10.getCompleted();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\"+ "'", var8.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test210");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    java.lang.String var4 = var0.stringURI2StringPath("hi!");
    minicopier.FailedQueue var5 = new minicopier.FailedQueue(var0);
    javax.swing.table.DefaultTableModel var6 = var5.getTableModel();
    minicopier.Copier var7 = new minicopier.Copier();
    var7.setFileCurrentSize(1L);
    var7.setFileCurrentSize(100L);
    int var12 = var7.getTotalPercent();
    java.lang.String var14 = var7.stringURI2StringPath("hi!");
    int var15 = var7.getTotalPercent();
    minicopier.MainQueue var16 = new minicopier.MainQueue(var7);
    javax.swing.table.DefaultTableModel var17 = var16.getTableModel();
    minicopier.Copier var18 = new minicopier.Copier();
    var18.setFileCurrentSize(1L);
    var18.setFileCurrentSize(100L);
    java.lang.Object[] var23 = new java.lang.Object[] { 100L};
    var17.addRow(var23);
    var17.setNumRows(0);
    var17.fireTableDataChanged();
    var17.fireTableStructureChanged();
    var17.fireTableStructureChanged();
    java.lang.Class var31 = var17.getColumnClass(0);
    javax.swing.event.TableModelListener[] var32 = var17.getTableModelListeners();
    var6.setColumnIdentifiers((java.lang.Object[])var32);
    var6.fireTableDataChanged();
    var6.fireTableCellUpdated(1, 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test211");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    java.lang.String var4 = var0.stringURI2StringPath("hi!");
    boolean var5 = var0.getPause();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    minicopier.FailedQueue var8 = new minicopier.FailedQueue(var0);
    var0.increaseQueueCurrentSize((-9L));
    minicopier.Copier var11 = new minicopier.Copier();
    var11.setFileCurrentSize(1L);
    var11.setFileCurrentSize(100L);
    int var16 = var11.getTotalPercent();
    var11.increaseFileCurrentSize(0L);
    var11.setFileCurrentSize(100L);
    minicopier.Copier var21 = new minicopier.Copier();
    var21.increaseFileCurrentSize((-1L));
    int var24 = var21.basketLength();
    long var25 = var21.getFileTotalSize();
    minicopier.FileToTransfer var28 = new minicopier.FileToTransfer("", "");
    java.io.File var29 = var28.getDestinationFolder();
    var21.addFolder2Queue(var29, "hi!");
    long var32 = var21.getCurrentBytesRemaining();
    minicopier.MainQueue var33 = new minicopier.MainQueue(var21);
    int var34 = var21.getTotalPercent();
    int var35 = var21.getTotalPercent();
    minicopier.Copier var36 = new minicopier.Copier();
    var36.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var39 = new minicopier.FailedQueue(var36);
    boolean var40 = var39.isEmpty();
    minicopier.FileToTransfer var43 = new minicopier.FileToTransfer("", "");
    java.io.File var44 = var43.getDestinationFile();
    java.lang.String var45 = var43.getSourcePath();
    java.lang.String var46 = var43.getDestinationFilePath();
    var39.addFile(var43);
    javax.swing.table.DefaultTableModel var48 = var39.getTableModel();
    minicopier.FileToTransfer var51 = new minicopier.FileToTransfer("", "");
    var51.changeTargetName("");
    java.io.File var54 = var51.getDestinationFile();
    java.io.File var55 = var51.getSourceFile();
    java.lang.String var56 = var51.getDestinationFolderPath();
    var39.addFile(var51);
    minicopier.TransferTask var59 = new minicopier.TransferTask(var21, var51, true);
    minicopier.TransferTask var61 = new minicopier.TransferTask(var11, var51, false);
    minicopier.TransferTask var63 = new minicopier.TransferTask(var0, var51, false);
    java.io.File var64 = var51.getDestinationFolder();
    java.lang.String var65 = var51.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "\\"+ "'", var46.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + ""+ "'", var65.equals(""));

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test212");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    var3.addFile(var6);
    javax.swing.table.DefaultTableModel var8 = var3.getTableModel();
    int var10 = var8.findColumn("hi!\\");
    javax.swing.event.TableModelListener[] var11 = var8.getTableModelListeners();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.increaseFileCurrentSize((-1L));
    long var15 = var12.getTotalBytesRemaining();
    boolean var16 = var12.getPause();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.setValueAt((java.lang.Object)var16, 3, 9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test213");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    javax.swing.table.DefaultTableModel var13 = var9.getTableModel();
    minicopier.Copier var14 = new minicopier.Copier();
    var14.setFileCurrentSize(1L);
    var14.setFileCurrentSize(100L);
    boolean var19 = var14.getPause();
    long var20 = var14.getQueueTotalSize();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var14);
    minicopier.Copier var22 = new minicopier.Copier();
    var22.setFileCurrentSize(1L);
    var22.setFileCurrentSize(100L);
    int var27 = var22.getTotalPercent();
    var22.increaseFileCurrentSize(0L);
    long var30 = var22.readAndInitBytesCounter();
    boolean var31 = var22.getPause();
    var22.paste("CW");
    var22.addURIString2basket("K");
    minicopier.MainQueue var36 = new minicopier.MainQueue(var22);
    minicopier.Copier var37 = new minicopier.Copier();
    var37.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var40 = new minicopier.FailedQueue(var37);
    boolean var41 = var40.isEmpty();
    int[] var42 = new int[] { };
    int[] var43 = var40.remove(var42);
    int[] var44 = var36.putLast(var42);
    int[] var45 = var21.putLast(var42);
    minicopier.Copier var46 = new minicopier.Copier();
    var46.setFileCurrentSize(1L);
    var46.setFileCurrentSize(100L);
    int var51 = var46.getTotalPercent();
    java.lang.String var53 = var46.stringURI2StringPath("hi!");
    int var54 = var46.getTotalPercent();
    minicopier.MainQueue var55 = new minicopier.MainQueue(var46);
    javax.swing.table.DefaultTableModel var56 = var55.getTableModel();
    javax.swing.table.DefaultTableModel var57 = var55.getTableModel();
    minicopier.Copier var58 = new minicopier.Copier();
    var58.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var61 = new minicopier.FailedQueue(var58);
    minicopier.Copier var62 = new minicopier.Copier();
    var62.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var65 = new minicopier.FailedQueue(var62);
    boolean var66 = var65.isEmpty();
    int[] var67 = new int[] { };
    int[] var68 = var65.remove(var67);
    int[] var69 = var61.retry(var67);
    int[] var70 = var55.remove(var67);
    int[] var71 = var21.remove(var67);
    int[] var72 = var9.putFirst(var67);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      minicopier.FileToTransfer var73 = var9.extractFirst();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test214");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    java.lang.Object[] var23 = new java.lang.Object[] { var22};
    var10.addColumn((java.lang.Object)0.0d, var23);
    var10.fireTableRowsInserted(100, 10);
    int var28 = var10.getColumnCount();
    var10.fireTableStructureChanged();
    minicopier.Copier var30 = new minicopier.Copier();
    var30.setFileCurrentSize(1L);
    var30.setFileCurrentSize(100L);
    int var35 = var30.getTotalPercent();
    java.lang.String var37 = var30.stringURI2StringPath("hi!");
    int var38 = var30.getTotalPercent();
    minicopier.MainQueue var39 = new minicopier.MainQueue(var30);
    javax.swing.table.DefaultTableModel var40 = var39.getTableModel();
    var40.fireTableRowsInserted(1, 0);
    var40.fireTableStructureChanged();
    minicopier.Copier var45 = new minicopier.Copier();
    var45.setFileCurrentSize(1L);
    var45.setFileCurrentSize(100L);
    int var50 = var45.getTotalPercent();
    var45.clearBasket();
    java.lang.Object[] var52 = new java.lang.Object[] { var45};
    var40.addRow(var52);
    var40.fireTableRowsUpdated(3, 10);
    var40.setNumRows(1);
    int var59 = var40.getColumnCount();
    java.util.Vector var60 = var40.getDataVector();
    var10.setColumnIdentifiers(var60);
    var10.setColumnCount(100);
    minicopier.Copier var64 = new minicopier.Copier();
    var64.setFileCurrentSize(1L);
    var64.setFileCurrentSize(100L);
    int var69 = var64.getTotalPercent();
    java.lang.String var71 = var64.stringURI2StringPath("hi!");
    int var72 = var64.getTotalPercent();
    minicopier.MainQueue var73 = new minicopier.MainQueue(var64);
    javax.swing.table.DefaultTableModel var74 = var73.getTableModel();
    minicopier.Copier var75 = new minicopier.Copier();
    var75.setFileCurrentSize(1L);
    var75.setFileCurrentSize(100L);
    java.lang.Object[] var80 = new java.lang.Object[] { 100L};
    var74.addRow(var80);
    var74.setNumRows(0);
    var74.fireTableRowsInserted(9, 3);
    java.lang.Class var88 = var74.getColumnClass(2);
    java.lang.Class var90 = var74.getColumnClass(9);
    java.lang.Class var92 = var74.getColumnClass(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var93 = var10.<java.util.EventListener>getListeners(var92);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!"+ "'", var71.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test215");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.increaseFileCurrentSize(10L);
    var0.clearBasket();
    var0.unpause();

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test216");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    long var11 = var0.getCurrentBytesRemaining();
    minicopier.MainQueue var12 = new minicopier.MainQueue(var0);
    int var13 = var0.getTotalPercent();
    int var14 = var0.getTotalPercent();
    minicopier.Copier var15 = new minicopier.Copier();
    var15.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var18 = new minicopier.FailedQueue(var15);
    boolean var19 = var18.isEmpty();
    minicopier.FileToTransfer var22 = new minicopier.FileToTransfer("", "");
    java.io.File var23 = var22.getDestinationFile();
    java.lang.String var24 = var22.getSourcePath();
    java.lang.String var25 = var22.getDestinationFilePath();
    var18.addFile(var22);
    javax.swing.table.DefaultTableModel var27 = var18.getTableModel();
    minicopier.FileToTransfer var30 = new minicopier.FileToTransfer("", "");
    var30.changeTargetName("");
    java.io.File var33 = var30.getDestinationFile();
    java.io.File var34 = var30.getSourceFile();
    java.lang.String var35 = var30.getDestinationFolderPath();
    var18.addFile(var30);
    minicopier.TransferTask var38 = new minicopier.TransferTask(var0, var30, true);
    java.lang.String var39 = var30.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "\\"+ "'", var25.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "\\"+ "'", var39.equals("\\"));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test217");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    var0.forceStart();
    int var3 = var0.getCurrentPercent();
    var0.addURIString2basket("C");
    minicopier.Copier var6 = new minicopier.Copier();
    var6.setFileCurrentSize(1L);
    java.lang.String var10 = var6.stringURI2StringPath("hi!");
    var6.setFileCurrentSize((-100L));
    long var13 = var6.getFileTotalSize();
    var6.forceStart();
    var6.add2basket("K");
    minicopier.FileToTransfer var19 = new minicopier.FileToTransfer("", "");
    var19.changeTargetName("");
    long var22 = var19.getSize();
    java.lang.String var23 = var19.getSourcePath();
    minicopier.TransferTask var25 = new minicopier.TransferTask(var6, var19, true);
    java.io.File var26 = var19.getDestinationFile();
    minicopier.TransferTask var28 = new minicopier.TransferTask(var0, var19, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test218");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    int var9 = var0.basketLength();
    java.lang.String var11 = var0.stringURI2StringPath("A");
    boolean var14 = var0.nameIsAcceptable("A", "hi!\\");
    var0.clearBasket();
    long var16 = var0.readAndInitBytesCounter();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "A"+ "'", var11.equals("A"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test219");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    javax.swing.table.DefaultTableModel var11 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    java.lang.String var17 = var12.getCurrentFileSource();
    minicopier.MainQueue var18 = new minicopier.MainQueue(var12);
    minicopier.Copier var19 = new minicopier.Copier();
    var19.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var22 = new minicopier.FailedQueue(var19);
    boolean var23 = var22.isEmpty();
    int[] var24 = new int[] { };
    int[] var25 = var22.remove(var24);
    int[] var26 = var18.remove(var24);
    int[] var27 = var9.remove(var24);
    minicopier.Copier var28 = new minicopier.Copier();
    var28.setFileCurrentSize(1L);
    var28.setFileCurrentSize(100L);
    int var33 = var28.getTotalPercent();
    java.lang.String var35 = var28.stringURI2StringPath("hi!");
    int var36 = var28.getTotalPercent();
    minicopier.MainQueue var37 = new minicopier.MainQueue(var28);
    javax.swing.table.DefaultTableModel var38 = var37.getTableModel();
    minicopier.Copier var40 = new minicopier.Copier();
    var40.setFileCurrentSize(1L);
    var40.setFileCurrentSize(100L);
    int var45 = var40.getTotalPercent();
    java.lang.String var47 = var40.stringURI2StringPath("hi!");
    int var48 = var40.getTotalPercent();
    minicopier.MainQueue var49 = new minicopier.MainQueue(var40);
    javax.swing.table.DefaultTableModel var50 = var49.getTableModel();
    java.lang.Object[] var51 = new java.lang.Object[] { var50};
    var38.addColumn((java.lang.Object)0.0d, var51);
    minicopier.MainQueue.TransfersModel var54 = var9.new TransfersModel(var51, 100);
    boolean var57 = var54.isCellEditable(10, 4);
    boolean var60 = var54.isCellEditable(4, 11);
    var54.fireTableRowsInserted(9, 10);
    javax.swing.event.TableModelListener[] var64 = var54.getTableModelListeners();
    boolean var67 = var54.isCellEditable(10, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test220");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.increaseFileCurrentSize(10L);
    var0.clearBasket();
    var0.increaseFileCurrentSize(0L);
    long var10 = var0.getTotalBytesRemaining();
    minicopier.FileToTransfer var13 = new minicopier.FileToTransfer("", "");
    var13.changeTargetName("");
    long var16 = var13.getSize();
    java.io.File var17 = var13.getDestinationFolder();
    java.io.File var18 = var13.getSourceFile();
    var0.addFolder2Queue(var18, "E");
    var0.add2basket("Source");
    java.lang.String var24 = var0.stringURI2StringPath("CW");
    boolean var25 = var0.getPause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-9L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "CW"+ "'", var24.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test221");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    minicopier.Copier var13 = new minicopier.Copier();
    var13.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var16 = new minicopier.FailedQueue(var13);
    minicopier.FileToTransfer var19 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var20 = var19.getName();
    var16.addFile(var19);
    minicopier.Copier var22 = new minicopier.Copier();
    var22.setFileCurrentSize(1L);
    var22.setFileCurrentSize(100L);
    int var27 = var22.getTotalPercent();
    java.lang.String var29 = var22.stringURI2StringPath("hi!");
    int var30 = var22.getTotalPercent();
    minicopier.MainQueue var31 = new minicopier.MainQueue(var22);
    javax.swing.table.DefaultTableModel var32 = var31.getTableModel();
    javax.swing.table.DefaultTableModel var33 = var31.getTableModel();
    minicopier.Copier var34 = new minicopier.Copier();
    var34.setFileCurrentSize(1L);
    var34.setFileCurrentSize(100L);
    java.lang.String var39 = var34.getCurrentFileSource();
    minicopier.MainQueue var40 = new minicopier.MainQueue(var34);
    minicopier.Copier var41 = new minicopier.Copier();
    var41.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var44 = new minicopier.FailedQueue(var41);
    boolean var45 = var44.isEmpty();
    int[] var46 = new int[] { };
    int[] var47 = var44.remove(var46);
    int[] var48 = var40.remove(var46);
    int[] var49 = var31.remove(var46);
    int[] var50 = var16.remove(var46);
    int[] var51 = var9.remove(var46);
    boolean var52 = var9.isEmpty();
    boolean var53 = var9.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test222");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.clearBasket();
    java.lang.String var7 = var0.getCurrentFileSource();
    long var8 = var0.getCurrentBytesRemaining();
    int var9 = var0.basketLength();
    long var10 = var0.getQueueTotalSize();
    minicopier.FailedQueue var11 = new minicopier.FailedQueue(var0);
    var0.increaseQueueCurrentSize((-90L));
    minicopier.Copier var14 = new minicopier.Copier();
    var14.increaseFileCurrentSize((-1L));
    int var17 = var14.basketLength();
    long var18 = var14.getFileTotalSize();
    minicopier.FileToTransfer var21 = new minicopier.FileToTransfer("", "");
    java.io.File var22 = var21.getDestinationFolder();
    var14.addFolder2Queue(var22, "hi!");
    long var25 = var14.getCurrentBytesRemaining();
    var14.setFileCurrentSize(0L);
    var14.paste("\\");
    int var30 = var14.basketLength();
    var14.paste("CW\\E");
    minicopier.Copier var33 = new minicopier.Copier();
    var33.increaseFileCurrentSize((-1L));
    var33.increaseQueueCurrentSize((-1L));
    minicopier.FileToTransfer var40 = new minicopier.FileToTransfer("", "");
    var40.changeTargetName("");
    java.io.File var43 = var40.getDestinationFile();
    minicopier.TransferTask var45 = new minicopier.TransferTask(var33, var40, true);
    java.io.File var46 = var40.getSourceFile();
    var14.addFolder2Queue(var46, "hi!");
    var0.addFolder2Queue(var46, "A\\Destination");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test223");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    long var4 = var0.getFileTotalSize();
    minicopier.Copier var5 = new minicopier.Copier();
    var5.clearBasket();
    long var7 = var5.readAndInitBytesCounter();
    long var8 = var5.readAndInitBytesCounter();
    var5.increaseFileCurrentSize(100L);
    boolean var13 = var5.nameIsAcceptable("", "CW");
    minicopier.FileToTransfer var16 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var17 = var16.getName();
    java.lang.String var18 = var16.getDestinationFilePath();
    minicopier.TransferTask var20 = new minicopier.TransferTask(var5, var16, false);
    long var21 = var16.getSize();
    java.lang.String var22 = var16.getDestinationFilePath();
    var16.changeTargetName("hi!\\");
    java.lang.String var25 = var16.getName();
    java.lang.String var26 = var16.getName();
    minicopier.TransferTask var28 = new minicopier.TransferTask(var0, var16, true);
    java.lang.String var29 = var16.getSourcePath();
    java.lang.String var30 = var16.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!\\"+ "'", var18.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!\\"+ "'", var22.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test224");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.setColumnCount(0);
    int var14 = var10.findColumn("hi!\\");
    minicopier.Copier var15 = new minicopier.Copier();
    var15.setFileCurrentSize(1L);
    var15.setFileCurrentSize(100L);
    int var20 = var15.getTotalPercent();
    java.lang.String var22 = var15.stringURI2StringPath("hi!");
    int var23 = var15.getTotalPercent();
    minicopier.MainQueue var24 = new minicopier.MainQueue(var15);
    javax.swing.table.DefaultTableModel var25 = var24.getTableModel();
    var25.fireTableRowsInserted(1, 0);
    var25.fireTableDataChanged();
    var25.setNumRows(1);
    java.util.Vector var32 = var25.getDataVector();
    var10.addRow(var32);
    var10.fireTableDataChanged();
    minicopier.Copier var35 = new minicopier.Copier();
    var35.setFileCurrentSize(1L);
    java.lang.String var39 = var35.stringURI2StringPath("hi!");
    minicopier.FailedQueue var40 = new minicopier.FailedQueue(var35);
    javax.swing.table.DefaultTableModel var41 = var40.getTableModel();
    minicopier.Copier var42 = new minicopier.Copier();
    var42.setFileCurrentSize(1L);
    var42.setFileCurrentSize(100L);
    int var47 = var42.getTotalPercent();
    java.lang.String var49 = var42.stringURI2StringPath("hi!");
    int var50 = var42.getTotalPercent();
    minicopier.MainQueue var51 = new minicopier.MainQueue(var42);
    javax.swing.table.DefaultTableModel var52 = var51.getTableModel();
    minicopier.Copier var53 = new minicopier.Copier();
    var53.setFileCurrentSize(1L);
    var53.setFileCurrentSize(100L);
    java.lang.Object[] var58 = new java.lang.Object[] { 100L};
    var52.addRow(var58);
    var52.setNumRows(0);
    var52.fireTableDataChanged();
    var52.fireTableStructureChanged();
    var52.fireTableStructureChanged();
    java.lang.Class var66 = var52.getColumnClass(0);
    javax.swing.event.TableModelListener[] var67 = var52.getTableModelListeners();
    var41.setColumnIdentifiers((java.lang.Object[])var67);
    var10.addRow((java.lang.Object[])var67);
    int var70 = var10.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test225");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    long var11 = var0.getCurrentBytesRemaining();
    minicopier.MainQueue var12 = new minicopier.MainQueue(var0);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    javax.swing.table.DefaultTableModel var15 = var12.getTableModel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      minicopier.FileToTransfer var16 = var12.extractFirst();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test226");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    var0.paste("hi!");
    minicopier.Copier var6 = new minicopier.Copier();
    var6.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var9 = new minicopier.FailedQueue(var6);
    minicopier.FileToTransfer var12 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var13 = var12.getName();
    java.lang.String var14 = var12.getDestinationFilePath();
    minicopier.TransferTask var16 = new minicopier.TransferTask(var6, var12, false);
    minicopier.TransferTask var18 = new minicopier.TransferTask(var0, var12, false);
    boolean var19 = var18.getCompleted();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\"+ "'", var14.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test227");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(0L);
    long var8 = var0.readAndInitBytesCounter();
    var0.paste2URIString("K");
    boolean var13 = var0.nameIsAcceptable("hi!\\", "Source");
    java.lang.String var14 = var0.getCurrentFileDestination();
    boolean var15 = var0.getPause();
    var0.clearBasket();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test228");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    java.lang.Object[] var23 = new java.lang.Object[] { var22};
    var10.addColumn((java.lang.Object)0.0d, var23);
    var10.setColumnCount(0);
    java.lang.String var28 = var10.getColumnName(100);
    java.lang.Class var30 = var10.getColumnClass(1);
    int var31 = var10.getRowCount();
    int var32 = var10.getColumnCount();
    var10.setNumRows(10);
    var10.setNumRows(10);
    var10.setNumRows(9);
    minicopier.Copier var39 = new minicopier.Copier();
    var39.setFileCurrentSize(1L);
    java.lang.String var43 = var39.stringURI2StringPath("hi!");
    minicopier.Copier var44 = new minicopier.Copier();
    var44.clearBasket();
    long var46 = var44.readAndInitBytesCounter();
    long var47 = var44.readAndInitBytesCounter();
    int var48 = var44.basketLength();
    long var49 = var44.getCurrentBytesRemaining();
    var44.paste("A");
    minicopier.FileToTransfer var54 = new minicopier.FileToTransfer("", "");
    java.lang.String var55 = var54.getSourcePath();
    java.lang.String var56 = var54.getName();
    java.io.File var57 = var54.getSourceFile();
    var44.addFolder2Queue(var57, "E");
    var39.addFolder2Queue(var57, "\\");
    minicopier.FileToTransfer var64 = new minicopier.FileToTransfer("", "");
    java.lang.String var65 = var64.getSourcePath();
    java.lang.String var66 = var64.getName();
    java.io.File var67 = var64.getSourceFile();
    java.lang.String var68 = var64.getSourcePath();
    java.io.File var69 = var64.getDestinationFile();
    minicopier.TransferTask var71 = new minicopier.TransferTask(var39, var64, true);
    var71.unpause();
    boolean var73 = var71.getCancel();
    var10.addColumn((java.lang.Object)var71);
    var71.setCancelAndQueue(true);
    var71.setPause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "CW"+ "'", var28.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + ""+ "'", var65.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + ""+ "'", var66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test229");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    var0.clearBasket();
    boolean var6 = var0.pause();
    int var7 = var0.getCurrentPercent();
    java.lang.String var8 = var0.getCurrentFileSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test230");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.MainQueue var6 = new minicopier.MainQueue(var0);
    minicopier.Copier var7 = new minicopier.Copier();
    var7.setFileCurrentSize(1L);
    var7.setFileCurrentSize(100L);
    int var12 = var7.getTotalPercent();
    java.lang.String var14 = var7.stringURI2StringPath("hi!");
    int var15 = var7.getTotalPercent();
    minicopier.MainQueue var16 = new minicopier.MainQueue(var7);
    javax.swing.table.DefaultTableModel var17 = var16.getTableModel();
    var17.setColumnCount(0);
    int var21 = var17.findColumn("hi!\\");
    var17.setColumnCount(10);
    var17.fireTableStructureChanged();
    int var25 = var17.getRowCount();
    minicopier.Copier var26 = new minicopier.Copier();
    var26.setFileCurrentSize(1L);
    var26.setFileCurrentSize(100L);
    int var31 = var26.getTotalPercent();
    java.lang.String var33 = var26.stringURI2StringPath("hi!");
    int var34 = var26.getTotalPercent();
    minicopier.MainQueue var35 = new minicopier.MainQueue(var26);
    javax.swing.table.DefaultTableModel var36 = var35.getTableModel();
    var36.setColumnCount(0);
    int var40 = var36.findColumn("hi!\\");
    int var41 = var36.getRowCount();
    minicopier.Copier var42 = new minicopier.Copier();
    var42.setFileCurrentSize(1L);
    var42.setFileCurrentSize(100L);
    int var47 = var42.getTotalPercent();
    java.lang.String var49 = var42.stringURI2StringPath("hi!");
    int var50 = var42.getTotalPercent();
    minicopier.MainQueue var51 = new minicopier.MainQueue(var42);
    javax.swing.table.DefaultTableModel var52 = var51.getTableModel();
    minicopier.Copier var53 = new minicopier.Copier();
    var53.setFileCurrentSize(1L);
    var53.setFileCurrentSize(100L);
    java.lang.Object[] var58 = new java.lang.Object[] { 100L};
    var52.addRow(var58);
    var36.addRow(var58);
    var17.setColumnIdentifiers(var58);
    minicopier.MainQueue.TransfersModel var63 = var6.new TransfersModel(var58, 3);
    boolean var66 = var63.isCellEditable(3, 1);
    var63.fireTableRowsInserted((-1), 10);
    boolean var72 = var63.isCellEditable((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test231");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    boolean var4 = var3.isEmpty();
    int[] var5 = new int[] { };
    int[] var6 = var3.remove(var5);
    minicopier.FileToTransfer var9 = new minicopier.FileToTransfer("", "");
    var9.changeTargetName("");
    var3.addFile(var9);
    boolean var13 = var3.isEmpty();
    minicopier.Copier var14 = new minicopier.Copier();
    var14.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var17 = new minicopier.FailedQueue(var14);
    minicopier.FileToTransfer var20 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var21 = var20.getName();
    java.lang.String var22 = var20.getDestinationFilePath();
    minicopier.TransferTask var24 = new minicopier.TransferTask(var14, var20, false);
    var20.changeTargetName("");
    java.lang.String var27 = var20.getName();
    var3.addFile(var20);
    javax.swing.table.DefaultTableModel var29 = var3.getTableModel();
    int var31 = var29.findColumn("hi!\\Destination");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!\\"+ "'", var22.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test232");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(0L);
    long var8 = var0.readAndInitBytesCounter();
    var0.paste("D");
    minicopier.FileToTransfer var13 = new minicopier.FileToTransfer("", "");
    java.lang.String var14 = var13.getName();
    var13.changeTargetName("\\CW");
    minicopier.TransferTask var18 = new minicopier.TransferTask(var0, var13, true);
    var0.setFileCurrentSize(11L);
    boolean var21 = var0.getPause();
    long var22 = var0.getCurrentBytesRemaining();
    minicopier.FailedQueue var23 = new minicopier.FailedQueue(var0);
    var0.decreaseQueueCurrentSize((-89L));
    var0.setFileCurrentSize(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-11L));

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test233");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = var6.getDestinationFilePath();
    minicopier.TransferTask var10 = new minicopier.TransferTask(var0, var6, false);
    long var11 = var0.getCurrentBytesRemaining();
    var0.paste("K");
    int var14 = var0.getCurrentPercent();
    var0.forceStart();
    boolean var18 = var0.nameIsAcceptable("K\\A", "J");
    long var19 = var0.readAndInitBytesCounter();
    var0.setFileCurrentSize((-20L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\"+ "'", var8.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1L));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test234");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.clearBasket();
    java.lang.String var7 = var0.getCurrentFileSource();
    long var8 = var0.getCurrentBytesRemaining();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    minicopier.Copier var10 = new minicopier.Copier();
    var10.increaseFileCurrentSize((-1L));
    var10.add2basket("");
    var10.setFileCurrentSize(10L);
    minicopier.FileToTransfer var19 = new minicopier.FileToTransfer("", "");
    var19.changeTargetName("");
    java.io.File var22 = var19.getDestinationFile();
    java.io.File var23 = var19.getSourceFile();
    boolean var24 = minicopier.Copier.isNotLink(var23);
    var10.addFolder2Queue(var23, "hi!\\");
    var10.increaseFileCurrentSize(10L);
    boolean var31 = var10.nameIsAcceptable("CW", "hi!");
    minicopier.FileToTransfer var34 = new minicopier.FileToTransfer("A", "K");
    minicopier.TransferTask var36 = new minicopier.TransferTask(var10, var34, false);
    var10.paste("\\hi!");
    var10.add2basket("D");
    var10.unpause();
    minicopier.MainQueue var42 = new minicopier.MainQueue(var10);
    javax.swing.table.DefaultTableModel var43 = var42.getTableModel();
    minicopier.Copier var44 = new minicopier.Copier();
    var44.setFileCurrentSize(1L);
    var44.setFileCurrentSize(100L);
    int var49 = var44.getTotalPercent();
    java.lang.String var51 = var44.stringURI2StringPath("hi!");
    int var52 = var44.getTotalPercent();
    minicopier.MainQueue var53 = new minicopier.MainQueue(var44);
    boolean var54 = var53.isEmpty();
    boolean var55 = var53.isEmpty();
    boolean var56 = var53.isEmpty();
    minicopier.Copier var57 = new minicopier.Copier();
    var57.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var60 = new minicopier.FailedQueue(var57);
    minicopier.FileToTransfer var63 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var64 = var63.getName();
    var60.addFile(var63);
    minicopier.Copier var66 = new minicopier.Copier();
    var66.setFileCurrentSize(1L);
    var66.setFileCurrentSize(100L);
    int var71 = var66.getTotalPercent();
    java.lang.String var73 = var66.stringURI2StringPath("hi!");
    int var74 = var66.getTotalPercent();
    minicopier.MainQueue var75 = new minicopier.MainQueue(var66);
    javax.swing.table.DefaultTableModel var76 = var75.getTableModel();
    javax.swing.table.DefaultTableModel var77 = var75.getTableModel();
    minicopier.Copier var78 = new minicopier.Copier();
    var78.setFileCurrentSize(1L);
    var78.setFileCurrentSize(100L);
    java.lang.String var83 = var78.getCurrentFileSource();
    minicopier.MainQueue var84 = new minicopier.MainQueue(var78);
    minicopier.Copier var85 = new minicopier.Copier();
    var85.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var88 = new minicopier.FailedQueue(var85);
    boolean var89 = var88.isEmpty();
    int[] var90 = new int[] { };
    int[] var91 = var88.remove(var90);
    int[] var92 = var84.remove(var90);
    int[] var93 = var75.remove(var90);
    int[] var94 = var60.remove(var90);
    int[] var95 = var53.remove(var90);
    int[] var96 = var42.putLast(var90);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var97 = var9.putFirst(var96);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + ""+ "'", var64.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!"+ "'", var73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + ""+ "'", var83.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test235");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    long var11 = var0.getCurrentBytesRemaining();
    minicopier.MainQueue var12 = new minicopier.MainQueue(var0);
    minicopier.FileToTransfer var15 = new minicopier.FileToTransfer("CW", "");
    java.lang.String var16 = var15.getDestinationFolderPath();
    minicopier.TransferTask var18 = new minicopier.TransferTask(var0, var15, true);
    long var19 = var0.getCurrentBytesRemaining();
    var0.paste2URIString("A");
    boolean var22 = var0.pause();
    java.lang.String var24 = var0.stringURI2StringPath("L");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "L"+ "'", var24.equals("L"));

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test236");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.clearBasket();
    java.lang.String var7 = var0.getCurrentFileSource();
    int var8 = var0.getCurrentPercent();
    long var9 = var0.getQueueTotalSize();
    var0.increaseFileCurrentSize((-100L));
    minicopier.FailedQueue var12 = new minicopier.FailedQueue(var0);
    java.lang.String var13 = var0.getCurrentFileSource();
    minicopier.MainQueue var14 = new minicopier.MainQueue(var0);
    long var15 = var0.getCurrentBytesRemaining();
    boolean var16 = var0.getPause();
    int var17 = var0.getTotalPercent();
    minicopier.Copier var18 = new minicopier.Copier();
    var18.setFileCurrentSize(1L);
    var18.setFileCurrentSize(100L);
    java.lang.String var23 = var18.getCurrentFileSource();
    minicopier.FailedQueue var24 = new minicopier.FailedQueue(var18);
    boolean var25 = var24.isEmpty();
    minicopier.FileToTransfer var28 = new minicopier.FileToTransfer("", "");
    var28.changeTargetName("");
    long var31 = var28.getSize();
    java.lang.String var32 = var28.getSourcePath();
    java.lang.String var33 = var28.getDestinationFilePath();
    var24.addFile(var28);
    minicopier.FileToTransfer var37 = new minicopier.FileToTransfer("", "");
    java.lang.String var38 = var37.getName();
    var37.changeTargetName("\\CW");
    var37.changeTargetName("A");
    long var43 = var37.getSize();
    var24.addFile(var37);
    java.lang.String var45 = var37.getDestinationFilePath();
    minicopier.TransferTask var47 = new minicopier.TransferTask(var0, var37, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "\\"+ "'", var33.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "\\A"+ "'", var45.equals("\\A"));

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test237");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var11 = new minicopier.Copier();
    var11.setFileCurrentSize(1L);
    var11.setFileCurrentSize(100L);
    java.lang.Object[] var16 = new java.lang.Object[] { 100L};
    var10.addRow(var16);
    var10.setNumRows(0);
    var10.moveRow(0, (-1), 0);
    var10.moveRow(100, 4, 100);
    var10.fireTableCellUpdated(0, 2);
    int var31 = var10.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test238");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    boolean var5 = var0.getPause();
    minicopier.FailedQueue var6 = new minicopier.FailedQueue(var0);
    long var7 = var0.getCurrentBytesRemaining();
    java.lang.String var8 = var0.getCurrentFileSource();
    int var9 = var0.basketLength();
    boolean var10 = var0.getBusy();
    boolean var11 = var0.getBusy();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test239");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = var6.getDestinationFilePath();
    minicopier.TransferTask var10 = new minicopier.TransferTask(var0, var6, false);
    boolean var13 = var0.nameIsAcceptable("hi!\\", "CW");
    long var14 = var0.getQueueTotalSize();
    var0.increaseFileCurrentSize(10L);
    var0.increaseFileCurrentSize(101L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\"+ "'", var8.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test240");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(0L);
    long var8 = var0.readAndInitBytesCounter();
    boolean var9 = var0.getPause();
    var0.paste("CW");
    var0.addURIString2basket("K");
    minicopier.MainQueue var14 = new minicopier.MainQueue(var0);
    minicopier.Copier var15 = new minicopier.Copier();
    var15.setFileCurrentSize(1L);
    var15.setFileCurrentSize(100L);
    int var20 = var15.getTotalPercent();
    java.lang.String var22 = var15.stringURI2StringPath("hi!");
    int var23 = var15.getTotalPercent();
    minicopier.MainQueue var24 = new minicopier.MainQueue(var15);
    javax.swing.table.DefaultTableModel var25 = var24.getTableModel();
    minicopier.Copier var26 = new minicopier.Copier();
    var26.setFileCurrentSize(1L);
    var26.setFileCurrentSize(100L);
    java.lang.Object[] var31 = new java.lang.Object[] { 100L};
    var25.addRow(var31);
    var25.setNumRows(0);
    minicopier.Copier var35 = new minicopier.Copier();
    var35.increaseFileCurrentSize((-1L));
    int var38 = var35.basketLength();
    long var39 = var35.getFileTotalSize();
    minicopier.FileToTransfer var42 = new minicopier.FileToTransfer("", "");
    java.io.File var43 = var42.getDestinationFolder();
    var35.addFolder2Queue(var43, "hi!");
    minicopier.Copier var46 = new minicopier.Copier();
    var46.increaseFileCurrentSize((-1L));
    int var49 = var46.basketLength();
    long var50 = var46.getFileTotalSize();
    minicopier.FileToTransfer var53 = new minicopier.FileToTransfer("", "");
    java.io.File var54 = var53.getDestinationFolder();
    var46.addFolder2Queue(var54, "hi!");
    var35.addFolder2Queue(var54, "");
    minicopier.FileToTransfer var61 = new minicopier.FileToTransfer("", "");
    java.io.File var62 = var61.getDestinationFolder();
    java.lang.String var63 = var61.getDestinationFolderPath();
    java.io.File var64 = var61.getDestinationFolder();
    var35.addFolder2Queue(var64, "hi!");
    minicopier.Copier var67 = new minicopier.Copier();
    var67.setFileCurrentSize(1L);
    var67.setFileCurrentSize(100L);
    int var72 = var67.getTotalPercent();
    java.lang.String var74 = var67.stringURI2StringPath("hi!");
    int var75 = var67.getTotalPercent();
    minicopier.MainQueue var76 = new minicopier.MainQueue(var67);
    javax.swing.table.DefaultTableModel var77 = var76.getTableModel();
    var77.fireTableRowsInserted(1, 0);
    var77.fireTableStructureChanged();
    minicopier.Copier var82 = new minicopier.Copier();
    var82.setFileCurrentSize(1L);
    var82.setFileCurrentSize(100L);
    int var87 = var82.getTotalPercent();
    var82.clearBasket();
    java.lang.Object[] var89 = new java.lang.Object[] { var82};
    var77.addRow(var89);
    var25.addColumn((java.lang.Object)var35, var89);
    int var92 = var25.getColumnCount();
    javax.swing.event.TableModelListener[] var93 = var25.getTableModelListeners();
    minicopier.MainQueue.TransfersModel var95 = var14.new TransfersModel((java.lang.Object[])var93, 5);
    boolean var96 = var14.isEmpty();
    boolean var97 = var14.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + ""+ "'", var63.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "hi!"+ "'", var74.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == true);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test241");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("D", "hi!\\hi!\\");
    java.lang.String var3 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test242");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    java.lang.Object[] var23 = new java.lang.Object[] { var22};
    var10.addColumn((java.lang.Object)0.0d, var23);
    var10.fireTableRowsInserted(100, 10);
    int var28 = var10.getColumnCount();
    var10.fireTableStructureChanged();
    minicopier.Copier var30 = new minicopier.Copier();
    var30.setFileCurrentSize(1L);
    var30.setFileCurrentSize(100L);
    int var35 = var30.getTotalPercent();
    java.lang.String var37 = var30.stringURI2StringPath("hi!");
    int var38 = var30.getTotalPercent();
    minicopier.MainQueue var39 = new minicopier.MainQueue(var30);
    javax.swing.table.DefaultTableModel var40 = var39.getTableModel();
    var40.fireTableRowsInserted(1, 0);
    var40.fireTableStructureChanged();
    minicopier.Copier var45 = new minicopier.Copier();
    var45.setFileCurrentSize(1L);
    var45.setFileCurrentSize(100L);
    int var50 = var45.getTotalPercent();
    var45.clearBasket();
    java.lang.Object[] var52 = new java.lang.Object[] { var45};
    var40.addRow(var52);
    var40.fireTableRowsUpdated(3, 10);
    var40.setNumRows(1);
    int var59 = var40.getColumnCount();
    java.util.Vector var60 = var40.getDataVector();
    var10.setColumnIdentifiers(var60);
    minicopier.Copier var62 = new minicopier.Copier();
    var62.setFileCurrentSize(1L);
    var62.setFileCurrentSize(100L);
    int var67 = var62.getTotalPercent();
    java.lang.String var69 = var62.stringURI2StringPath("hi!");
    int var70 = var62.getTotalPercent();
    minicopier.MainQueue var71 = new minicopier.MainQueue(var62);
    javax.swing.table.DefaultTableModel var72 = var71.getTableModel();
    minicopier.Copier var73 = new minicopier.Copier();
    var73.setFileCurrentSize(1L);
    var73.setFileCurrentSize(100L);
    java.lang.Object[] var78 = new java.lang.Object[] { 100L};
    var72.addRow(var78);
    var72.setNumRows(0);
    var72.moveRow(0, (-1), 0);
    var72.moveRow(100, 4, 100);
    var72.fireTableCellUpdated(0, 2);
    java.lang.Class var94 = var72.getColumnClass(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var95 = var10.<java.util.EventListener>getListeners(var94);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "hi!"+ "'", var69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test243");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.setColumnCount(0);
    int var14 = var10.findColumn("hi!\\");
    int var15 = var10.getRowCount();
    int var17 = var10.findColumn("hi!");
    minicopier.Copier var18 = new minicopier.Copier();
    var18.setFileCurrentSize(1L);
    var18.setFileCurrentSize(100L);
    java.lang.String var23 = var18.getCurrentFileSource();
    minicopier.MainQueue var24 = new minicopier.MainQueue(var18);
    minicopier.Copier var25 = new minicopier.Copier();
    var25.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var28 = new minicopier.FailedQueue(var25);
    minicopier.FileToTransfer var31 = new minicopier.FileToTransfer("", "hi!");
    var28.addFile(var31);
    javax.swing.table.DefaultTableModel var33 = var28.getTableModel();
    minicopier.Copier var34 = new minicopier.Copier();
    var34.setFileCurrentSize(1L);
    var34.setFileCurrentSize(100L);
    int var39 = var34.getTotalPercent();
    java.lang.String var41 = var34.stringURI2StringPath("hi!");
    int var42 = var34.getTotalPercent();
    minicopier.MainQueue var43 = new minicopier.MainQueue(var34);
    javax.swing.table.DefaultTableModel var44 = var43.getTableModel();
    minicopier.Copier var46 = new minicopier.Copier();
    var46.setFileCurrentSize(1L);
    var46.setFileCurrentSize(100L);
    int var51 = var46.getTotalPercent();
    java.lang.String var53 = var46.stringURI2StringPath("hi!");
    int var54 = var46.getTotalPercent();
    minicopier.MainQueue var55 = new minicopier.MainQueue(var46);
    javax.swing.table.DefaultTableModel var56 = var55.getTableModel();
    java.lang.Object[] var57 = new java.lang.Object[] { var56};
    var44.addColumn((java.lang.Object)0.0d, var57);
    var44.fireTableRowsInserted(100, 10);
    java.util.Vector var62 = var44.getDataVector();
    var33.setColumnIdentifiers(var62);
    var10.addColumn((java.lang.Object)var18, var62);
    minicopier.Copier var65 = new minicopier.Copier();
    var65.clearBasket();
    long var67 = var65.readAndInitBytesCounter();
    long var68 = var65.readAndInitBytesCounter();
    var65.increaseFileCurrentSize(100L);
    boolean var73 = var65.nameIsAcceptable("", "CW");
    long var74 = var65.getQueueTotalSize();
    java.lang.String var76 = var65.stringURI2StringPath("K");
    minicopier.Copier var77 = new minicopier.Copier();
    var77.clearBasket();
    long var79 = var77.readAndInitBytesCounter();
    long var80 = var77.readAndInitBytesCounter();
    var77.increaseFileCurrentSize(100L);
    boolean var85 = var77.nameIsAcceptable("", "CW");
    minicopier.FileToTransfer var88 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var89 = var88.getName();
    java.lang.String var90 = var88.getDestinationFilePath();
    minicopier.TransferTask var92 = new minicopier.TransferTask(var77, var88, false);
    var88.changeTargetName("E");
    minicopier.TransferTask var96 = new minicopier.TransferTask(var65, var88, true);
    java.io.File var97 = var88.getSourceFile();
    var18.addFolder2Queue(var97, "hi!\\hi!\\D");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "K"+ "'", var76.equals("K"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + ""+ "'", var89.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + "hi!\\"+ "'", var90.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test244");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    javax.swing.table.DefaultTableModel var13 = var9.getTableModel();
    minicopier.Copier var14 = new minicopier.Copier();
    var14.setFileCurrentSize(1L);
    var14.setFileCurrentSize(100L);
    int var19 = var14.getTotalPercent();
    java.lang.String var21 = var14.stringURI2StringPath("hi!");
    int var22 = var14.getTotalPercent();
    minicopier.MainQueue var23 = new minicopier.MainQueue(var14);
    javax.swing.table.DefaultTableModel var24 = var23.getTableModel();
    minicopier.Copier var25 = new minicopier.Copier();
    var25.setFileCurrentSize(1L);
    var25.setFileCurrentSize(100L);
    java.lang.Object[] var30 = new java.lang.Object[] { 100L};
    var24.addRow(var30);
    var24.setNumRows(0);
    var24.fireTableDataChanged();
    var24.fireTableStructureChanged();
    var24.fireTableStructureChanged();
    java.lang.Class var38 = var24.getColumnClass(0);
    javax.swing.event.TableModelListener[] var39 = var24.getTableModelListeners();
    var13.addRow((java.lang.Object[])var39);
    var13.fireTableRowsInserted(3, 100);
    var13.setRowCount(99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test245");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    var0.forceStart();
    int var3 = var0.getCurrentPercent();
    boolean var6 = var0.nameIsAcceptable("hi!\\", "\\");
    boolean var7 = var0.getBusy();
    var0.paste("hi!");
    minicopier.Copier var10 = new minicopier.Copier();
    var10.setFileCurrentSize(1L);
    var10.setFileCurrentSize(100L);
    java.lang.String var15 = var10.getCurrentFileSource();
    long var16 = var10.getCurrentBytesRemaining();
    long var17 = var10.getFileTotalSize();
    minicopier.Copier var18 = new minicopier.Copier();
    var18.increaseFileCurrentSize((-1L));
    var18.add2basket("");
    var18.decreaseQueueCurrentSize(10L);
    java.lang.String var26 = var18.stringURI2StringPath("");
    boolean var27 = var18.pause();
    long var28 = var18.getQueueTotalSize();
    minicopier.FailedQueue var29 = new minicopier.FailedQueue(var18);
    minicopier.FileToTransfer var32 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var33 = var32.getDestinationFolderPath();
    java.io.File var34 = var32.getDestinationFolder();
    var18.addFolder2Queue(var34, "Size");
    var10.addFolder2Queue(var34, "C");
    var0.addFolder2Queue(var34, "hi!\\Destination");
    boolean var41 = var0.getPause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test246");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.setFileCurrentSize(10L);
    minicopier.FileToTransfer var9 = new minicopier.FileToTransfer("", "");
    var9.changeTargetName("");
    java.io.File var12 = var9.getDestinationFile();
    java.io.File var13 = var9.getSourceFile();
    boolean var14 = minicopier.Copier.isNotLink(var13);
    var0.addFolder2Queue(var13, "hi!\\");
    var0.increaseFileCurrentSize(10L);
    boolean var21 = var0.nameIsAcceptable("CW", "hi!");
    long var22 = var0.getCurrentBytesRemaining();
    var0.decreaseQueueCurrentSize(1L);
    int var25 = var0.basketLength();
    var0.clearBasket();
    boolean var27 = var0.getBusy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-20L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test247");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    var0.setFileCurrentSize(10L);
    long var7 = var0.getTotalBytesRemaining();
    long var8 = var0.getQueueTotalSize();
    java.lang.String var10 = var0.stringURI2StringPath("L");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "L"+ "'", var10.equals("L"));

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test248");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.MainQueue var6 = new minicopier.MainQueue(var0);
    minicopier.Copier var7 = new minicopier.Copier();
    var7.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var10 = new minicopier.FailedQueue(var7);
    boolean var11 = var10.isEmpty();
    int[] var12 = new int[] { };
    int[] var13 = var10.remove(var12);
    int[] var14 = var6.remove(var12);
    minicopier.Copier var15 = new minicopier.Copier();
    var15.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var18 = new minicopier.FailedQueue(var15);
    boolean var19 = var18.isEmpty();
    int[] var20 = new int[] { };
    int[] var21 = var18.remove(var20);
    int[] var22 = var6.putFirst(var20);
    boolean var23 = var6.isEmpty();
    minicopier.Copier var24 = new minicopier.Copier();
    var24.setFileCurrentSize(1L);
    var24.setFileCurrentSize(100L);
    int var29 = var24.getTotalPercent();
    java.lang.String var31 = var24.stringURI2StringPath("hi!");
    int var32 = var24.getTotalPercent();
    minicopier.MainQueue var33 = new minicopier.MainQueue(var24);
    javax.swing.table.DefaultTableModel var34 = var33.getTableModel();
    var34.setColumnCount(0);
    int var38 = var34.findColumn("hi!\\");
    minicopier.Copier var39 = new minicopier.Copier();
    var39.setFileCurrentSize(1L);
    var39.setFileCurrentSize(100L);
    int var44 = var39.getTotalPercent();
    java.lang.String var46 = var39.stringURI2StringPath("hi!");
    int var47 = var39.getTotalPercent();
    minicopier.MainQueue var48 = new minicopier.MainQueue(var39);
    javax.swing.table.DefaultTableModel var49 = var48.getTableModel();
    minicopier.Copier var50 = new minicopier.Copier();
    var50.setFileCurrentSize(1L);
    var50.setFileCurrentSize(100L);
    java.lang.Object[] var55 = new java.lang.Object[] { 100L};
    var49.addRow(var55);
    var34.setColumnIdentifiers(var55);
    minicopier.MainQueue.TransfersModel var59 = var6.new TransfersModel(var55, 1);
    javax.swing.table.DefaultTableModel var60 = var6.getTableModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test249");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    long var3 = var0.getQueueTotalSize();
    var0.unpause();
    int var5 = var0.getCurrentPercent();
    int var6 = var0.getTotalPercent();
    int var7 = var0.getCurrentPercent();
    int var8 = var0.basketLength();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    int var10 = var0.basketLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test250");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    java.lang.String var2 = var0.getCurrentFileSource();
    var0.setFileCurrentSize((-100L));
    long var5 = var0.getTotalBytesRemaining();
    long var6 = var0.getQueueTotalSize();
    minicopier.FileToTransfer var9 = new minicopier.FileToTransfer("", "");
    java.io.File var10 = var9.getDestinationFolder();
    java.lang.String var11 = var9.getDestinationFolderPath();
    java.io.File var12 = var9.getDestinationFolder();
    long var13 = var9.getSize();
    minicopier.TransferTask var15 = new minicopier.TransferTask(var0, var9, false);
    java.io.File var16 = var9.getDestinationFile();
    long var17 = var9.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test251");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    boolean var5 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test252");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.MainQueue var6 = new minicopier.MainQueue(var0);
    minicopier.Copier var7 = new minicopier.Copier();
    var7.setFileCurrentSize(1L);
    var7.setFileCurrentSize(100L);
    int var12 = var7.getTotalPercent();
    java.lang.String var14 = var7.stringURI2StringPath("hi!");
    int var15 = var7.getTotalPercent();
    minicopier.MainQueue var16 = new minicopier.MainQueue(var7);
    javax.swing.table.DefaultTableModel var17 = var16.getTableModel();
    var17.setColumnCount(0);
    int var21 = var17.findColumn("hi!\\");
    var17.setColumnCount(10);
    var17.fireTableStructureChanged();
    int var25 = var17.getRowCount();
    minicopier.Copier var26 = new minicopier.Copier();
    var26.setFileCurrentSize(1L);
    var26.setFileCurrentSize(100L);
    int var31 = var26.getTotalPercent();
    java.lang.String var33 = var26.stringURI2StringPath("hi!");
    int var34 = var26.getTotalPercent();
    minicopier.MainQueue var35 = new minicopier.MainQueue(var26);
    javax.swing.table.DefaultTableModel var36 = var35.getTableModel();
    var36.setColumnCount(0);
    int var40 = var36.findColumn("hi!\\");
    int var41 = var36.getRowCount();
    minicopier.Copier var42 = new minicopier.Copier();
    var42.setFileCurrentSize(1L);
    var42.setFileCurrentSize(100L);
    int var47 = var42.getTotalPercent();
    java.lang.String var49 = var42.stringURI2StringPath("hi!");
    int var50 = var42.getTotalPercent();
    minicopier.MainQueue var51 = new minicopier.MainQueue(var42);
    javax.swing.table.DefaultTableModel var52 = var51.getTableModel();
    minicopier.Copier var53 = new minicopier.Copier();
    var53.setFileCurrentSize(1L);
    var53.setFileCurrentSize(100L);
    java.lang.Object[] var58 = new java.lang.Object[] { 100L};
    var52.addRow(var58);
    var36.addRow(var58);
    var17.setColumnIdentifiers(var58);
    minicopier.MainQueue.TransfersModel var63 = var6.new TransfersModel(var58, 3);
    boolean var66 = var63.isCellEditable(3, 1);
    boolean var69 = var63.isCellEditable(0, (-1));
    boolean var72 = var63.isCellEditable(5, 100);
    javax.swing.event.TableModelListener[] var73 = var63.getTableModelListeners();
    var63.setNumRows(99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test253");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    long var2 = var0.readAndInitBytesCounter();
    long var3 = var0.getCurrentBytesRemaining();
    minicopier.FailedQueue var4 = new minicopier.FailedQueue(var0);
    javax.swing.table.DefaultTableModel var5 = var4.getTableModel();
    var5.fireTableStructureChanged();
    minicopier.Copier var7 = new minicopier.Copier();
    var7.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var10 = new minicopier.FailedQueue(var7);
    minicopier.FileToTransfer var13 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var14 = var13.getName();
    java.lang.String var15 = var13.getDestinationFilePath();
    minicopier.TransferTask var17 = new minicopier.TransferTask(var7, var13, false);
    var13.changeTargetName("");
    java.lang.String var20 = var13.getName();
    java.lang.String var21 = var13.getDestinationFilePath();
    long var22 = var13.getSize();
    minicopier.Copier var23 = new minicopier.Copier();
    var23.setFileCurrentSize(1L);
    var23.setFileCurrentSize(100L);
    java.lang.String var28 = var23.getCurrentFileSource();
    minicopier.MainQueue var29 = new minicopier.MainQueue(var23);
    boolean var30 = var29.isEmpty();
    boolean var31 = var29.isEmpty();
    minicopier.Copier var32 = new minicopier.Copier();
    var32.setFileCurrentSize(1L);
    var32.setFileCurrentSize(100L);
    int var37 = var32.getTotalPercent();
    java.lang.String var39 = var32.stringURI2StringPath("hi!");
    int var40 = var32.getTotalPercent();
    minicopier.MainQueue var41 = new minicopier.MainQueue(var32);
    boolean var42 = var41.isEmpty();
    boolean var43 = var41.isEmpty();
    minicopier.Copier var44 = new minicopier.Copier();
    var44.setFileCurrentSize(1L);
    var44.setFileCurrentSize(100L);
    java.lang.String var49 = var44.getCurrentFileSource();
    minicopier.MainQueue var50 = new minicopier.MainQueue(var44);
    minicopier.Copier var51 = new minicopier.Copier();
    var51.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var54 = new minicopier.FailedQueue(var51);
    boolean var55 = var54.isEmpty();
    int[] var56 = new int[] { };
    int[] var57 = var54.remove(var56);
    int[] var58 = var50.remove(var56);
    int[] var59 = var41.putLast(var56);
    int[] var60 = var29.remove(var56);
    minicopier.Copier var61 = new minicopier.Copier();
    var61.setFileCurrentSize(1L);
    java.lang.String var65 = var61.stringURI2StringPath("hi!");
    minicopier.FailedQueue var66 = new minicopier.FailedQueue(var61);
    javax.swing.table.DefaultTableModel var67 = var66.getTableModel();
    int var68 = var67.getColumnCount();
    var67.fireTableDataChanged();
    java.lang.String var71 = var67.getColumnName((-1));
    var67.fireTableCellUpdated(4, (-1));
    javax.swing.event.TableModelListener[] var75 = var67.getTableModelListeners();
    minicopier.MainQueue.TransfersModel var77 = var29.new TransfersModel((java.lang.Object[])var75, 1);
    var5.addColumn((java.lang.Object)var22, (java.lang.Object[])var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!\\"+ "'", var15.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!\\"+ "'", var21.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + ""+ "'", var71.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test254");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    var0.forceStart();
    java.lang.String var7 = var0.stringURI2StringPath("Size");
    var0.decreaseQueueCurrentSize(100L);
    boolean var10 = var0.pause();
    boolean var13 = var0.nameIsAcceptable("Size", "CW\\E");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Size"+ "'", var7.equals("Size"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test255");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.decreaseQueueCurrentSize(10L);
    minicopier.Copier var7 = new minicopier.Copier();
    var7.increaseFileCurrentSize((-1L));
    var7.add2basket("");
    var7.decreaseQueueCurrentSize(10L);
    java.lang.String var15 = var7.stringURI2StringPath("");
    minicopier.FailedQueue var16 = new minicopier.FailedQueue(var7);
    long var17 = var7.getQueueTotalSize();
    minicopier.Copier var18 = new minicopier.Copier();
    var18.setFileCurrentSize(1L);
    var18.setFileCurrentSize(100L);
    int var23 = var18.getTotalPercent();
    java.lang.String var25 = var18.stringURI2StringPath("hi!");
    int var26 = var18.getTotalPercent();
    minicopier.MainQueue var27 = new minicopier.MainQueue(var18);
    javax.swing.table.DefaultTableModel var28 = var27.getTableModel();
    minicopier.Copier var30 = new minicopier.Copier();
    var30.setFileCurrentSize(1L);
    var30.setFileCurrentSize(100L);
    int var35 = var30.getTotalPercent();
    java.lang.String var37 = var30.stringURI2StringPath("hi!");
    int var38 = var30.getTotalPercent();
    minicopier.MainQueue var39 = new minicopier.MainQueue(var30);
    javax.swing.table.DefaultTableModel var40 = var39.getTableModel();
    java.lang.Object[] var41 = new java.lang.Object[] { var40};
    var28.addColumn((java.lang.Object)0.0d, var41);
    var28.setColumnCount(0);
    java.lang.String var46 = var28.getColumnName(0);
    minicopier.FileToTransfer var49 = new minicopier.FileToTransfer("", "");
    java.lang.String var50 = var49.getSourcePath();
    java.lang.String var51 = var49.getName();
    java.io.File var52 = var49.getSourceFile();
    var28.addColumn((java.lang.Object)var52);
    var7.addFolder2Queue(var52, "\\CW");
    var0.addFolder2Queue(var52, "Destination");
    var0.forceStart();
    var0.forceStart();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "A"+ "'", var46.equals("A"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test256");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!");

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test257");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(0L);
    var0.setFileCurrentSize(100L);
    var0.decreaseQueueCurrentSize(10L);
    var0.increaseFileCurrentSize((-9L));
    var0.paste("CW\\E");
    int var16 = var0.getCurrentPercent();
    minicopier.FailedQueue var17 = new minicopier.FailedQueue(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test258");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    minicopier.Copier var11 = new minicopier.Copier();
    var11.increaseFileCurrentSize((-1L));
    int var14 = var11.basketLength();
    long var15 = var11.getFileTotalSize();
    minicopier.FileToTransfer var18 = new minicopier.FileToTransfer("", "");
    java.io.File var19 = var18.getDestinationFolder();
    var11.addFolder2Queue(var19, "hi!");
    var0.addFolder2Queue(var19, "");
    minicopier.FileToTransfer var26 = new minicopier.FileToTransfer("", "");
    java.io.File var27 = var26.getDestinationFolder();
    java.lang.String var28 = var26.getDestinationFolderPath();
    java.io.File var29 = var26.getDestinationFolder();
    long var30 = var26.getSize();
    java.io.File var31 = var26.getDestinationFile();
    minicopier.TransferTask var33 = new minicopier.TransferTask(var0, var26, false);
    long var34 = var0.getFileTotalSize();
    boolean var35 = var0.getPause();
    minicopier.FileToTransfer var38 = new minicopier.FileToTransfer("", "");
    java.io.File var39 = var38.getDestinationFile();
    java.lang.String var40 = var38.getSourcePath();
    java.lang.String var41 = var38.getSourcePath();
    minicopier.TransferTask var43 = new minicopier.TransferTask(var0, var38, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test259");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    java.lang.Object[] var23 = new java.lang.Object[] { var22};
    var10.addColumn((java.lang.Object)0.0d, var23);
    var10.setColumnCount(0);
    java.lang.String var28 = var10.getColumnName(100);
    java.lang.Class var30 = var10.getColumnClass(1);
    int var31 = var10.getRowCount();
    minicopier.FileToTransfer var34 = new minicopier.FileToTransfer("", "");
    var34.changeTargetName("");
    var34.changeTargetName("D");
    java.io.File var39 = var34.getDestinationFile();
    java.io.File var40 = var34.getDestinationFile();
    java.io.File var41 = var34.getDestinationFile();
    minicopier.Copier var42 = new minicopier.Copier();
    var42.setFileCurrentSize(1L);
    var42.setFileCurrentSize(100L);
    int var47 = var42.getTotalPercent();
    var42.clearBasket();
    java.lang.String var49 = var42.getCurrentFileSource();
    long var50 = var42.getCurrentBytesRemaining();
    minicopier.MainQueue var51 = new minicopier.MainQueue(var42);
    minicopier.Copier var52 = new minicopier.Copier();
    var52.setFileCurrentSize(1L);
    var52.setFileCurrentSize(100L);
    int var57 = var52.getTotalPercent();
    java.lang.String var59 = var52.stringURI2StringPath("hi!");
    int var60 = var52.getTotalPercent();
    minicopier.MainQueue var61 = new minicopier.MainQueue(var52);
    javax.swing.table.DefaultTableModel var62 = var61.getTableModel();
    var62.setColumnCount(0);
    int var66 = var62.findColumn("hi!\\");
    javax.swing.event.TableModelListener[] var67 = var62.getTableModelListeners();
    minicopier.MainQueue.TransfersModel var69 = var51.new TransfersModel((java.lang.Object[])var67, 10);
    var10.addColumn((java.lang.Object)var34, (java.lang.Object[])var67);
    java.lang.Class var72 = var10.getColumnClass(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "CW"+ "'", var28.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test260");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.setColumnCount(0);
    int var14 = var10.findColumn("hi!\\");
    int var15 = var10.getRowCount();
    int var17 = var10.findColumn("hi!");
    minicopier.Copier var18 = new minicopier.Copier();
    var18.setFileCurrentSize(1L);
    var18.setFileCurrentSize(100L);
    java.lang.String var23 = var18.getCurrentFileSource();
    minicopier.MainQueue var24 = new minicopier.MainQueue(var18);
    minicopier.Copier var25 = new minicopier.Copier();
    var25.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var28 = new minicopier.FailedQueue(var25);
    minicopier.FileToTransfer var31 = new minicopier.FileToTransfer("", "hi!");
    var28.addFile(var31);
    javax.swing.table.DefaultTableModel var33 = var28.getTableModel();
    minicopier.Copier var34 = new minicopier.Copier();
    var34.setFileCurrentSize(1L);
    var34.setFileCurrentSize(100L);
    int var39 = var34.getTotalPercent();
    java.lang.String var41 = var34.stringURI2StringPath("hi!");
    int var42 = var34.getTotalPercent();
    minicopier.MainQueue var43 = new minicopier.MainQueue(var34);
    javax.swing.table.DefaultTableModel var44 = var43.getTableModel();
    minicopier.Copier var46 = new minicopier.Copier();
    var46.setFileCurrentSize(1L);
    var46.setFileCurrentSize(100L);
    int var51 = var46.getTotalPercent();
    java.lang.String var53 = var46.stringURI2StringPath("hi!");
    int var54 = var46.getTotalPercent();
    minicopier.MainQueue var55 = new minicopier.MainQueue(var46);
    javax.swing.table.DefaultTableModel var56 = var55.getTableModel();
    java.lang.Object[] var57 = new java.lang.Object[] { var56};
    var44.addColumn((java.lang.Object)0.0d, var57);
    var44.fireTableRowsInserted(100, 10);
    java.util.Vector var62 = var44.getDataVector();
    var33.setColumnIdentifiers(var62);
    var10.addColumn((java.lang.Object)var18, var62);
    var10.fireTableCellUpdated(9, 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test261");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = var6.getDestinationFilePath();
    minicopier.TransferTask var10 = new minicopier.TransferTask(var0, var6, false);
    var10.setPause();
    var10.setPause();
    var10.setPause();
    boolean var14 = var10.getCancel();
    boolean var15 = var10.getPutInQueue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\"+ "'", var8.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test262");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.setColumnCount(0);
    int var14 = var10.findColumn("hi!\\");
    int var16 = var10.findColumn("hi!\\");
    minicopier.Copier var17 = new minicopier.Copier();
    var17.setFileCurrentSize(1L);
    var17.setFileCurrentSize(100L);
    int var22 = var17.getTotalPercent();
    java.lang.String var24 = var17.stringURI2StringPath("hi!");
    int var25 = var17.getTotalPercent();
    minicopier.MainQueue var26 = new minicopier.MainQueue(var17);
    javax.swing.table.DefaultTableModel var27 = var26.getTableModel();
    minicopier.Copier var29 = new minicopier.Copier();
    var29.setFileCurrentSize(1L);
    var29.setFileCurrentSize(100L);
    int var34 = var29.getTotalPercent();
    java.lang.String var36 = var29.stringURI2StringPath("hi!");
    int var37 = var29.getTotalPercent();
    minicopier.MainQueue var38 = new minicopier.MainQueue(var29);
    javax.swing.table.DefaultTableModel var39 = var38.getTableModel();
    java.lang.Object[] var40 = new java.lang.Object[] { var39};
    var27.addColumn((java.lang.Object)0.0d, var40);
    var27.fireTableRowsInserted(100, 10);
    java.util.Vector var45 = var27.getDataVector();
    var10.setColumnIdentifiers(var45);
    var10.setRowCount(100);
    java.lang.Object var51 = var10.getValueAt(4, 0);
    int var53 = var10.findColumn("K");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.removeRow((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test263");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    java.lang.String var2 = var0.getCurrentFileSource();
    var0.setFileCurrentSize((-100L));
    long var5 = var0.getTotalBytesRemaining();
    long var6 = var0.getQueueTotalSize();
    boolean var7 = var0.pause();
    minicopier.FailedQueue var8 = new minicopier.FailedQueue(var0);
    javax.swing.table.DefaultTableModel var9 = var8.getTableModel();
    var9.fireTableDataChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test264");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    boolean var2 = var0.isEmpty();
    var0.add("hi!\\");
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    var0.add("hi!");
    java.util.Iterator var9 = var0.getIterator();
    boolean var10 = var0.isEmpty();
    int var11 = var0.getLength();
    var0.add("\\\\CW");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test265");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    minicopier.Copier var11 = new minicopier.Copier();
    var11.increaseFileCurrentSize((-1L));
    int var14 = var11.basketLength();
    long var15 = var11.getFileTotalSize();
    minicopier.FileToTransfer var18 = new minicopier.FileToTransfer("", "");
    java.io.File var19 = var18.getDestinationFolder();
    var11.addFolder2Queue(var19, "hi!");
    var0.addFolder2Queue(var19, "");
    minicopier.FileToTransfer var26 = new minicopier.FileToTransfer("", "");
    java.io.File var27 = var26.getDestinationFolder();
    java.lang.String var28 = var26.getDestinationFolderPath();
    java.io.File var29 = var26.getDestinationFolder();
    var0.addFolder2Queue(var29, "hi!");
    boolean var32 = var0.pause();
    minicopier.MainQueue var33 = new minicopier.MainQueue(var0);
    boolean var34 = var33.isEmpty();
    minicopier.Copier var35 = new minicopier.Copier();
    var35.setFileCurrentSize(1L);
    var35.setFileCurrentSize(100L);
    int var40 = var35.getTotalPercent();
    java.lang.String var42 = var35.stringURI2StringPath("hi!");
    int var43 = var35.getTotalPercent();
    minicopier.MainQueue var44 = new minicopier.MainQueue(var35);
    javax.swing.table.DefaultTableModel var45 = var44.getTableModel();
    minicopier.Copier var47 = new minicopier.Copier();
    var47.setFileCurrentSize(1L);
    var47.setFileCurrentSize(100L);
    int var52 = var47.getTotalPercent();
    java.lang.String var54 = var47.stringURI2StringPath("hi!");
    int var55 = var47.getTotalPercent();
    minicopier.MainQueue var56 = new minicopier.MainQueue(var47);
    javax.swing.table.DefaultTableModel var57 = var56.getTableModel();
    java.lang.Object[] var58 = new java.lang.Object[] { var57};
    var45.addColumn((java.lang.Object)0.0d, var58);
    var45.fireTableRowsInserted(100, 10);
    java.util.Vector var63 = var45.getDataVector();
    var45.fireTableCellUpdated(2, 1);
    javax.swing.event.TableModelListener[] var67 = var45.getTableModelListeners();
    minicopier.MainQueue.TransfersModel var69 = var33.new TransfersModel((java.lang.Object[])var67, 10);
    boolean var70 = var33.isEmpty();
    boolean var71 = var33.isEmpty();
    javax.swing.table.DefaultTableModel var72 = var33.getTableModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test266");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.FailedQueue var6 = new minicopier.FailedQueue(var0);
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    minicopier.Copier var9 = new minicopier.Copier();
    var9.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var12 = new minicopier.FailedQueue(var9);
    minicopier.Copier var13 = new minicopier.Copier();
    var13.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var16 = new minicopier.FailedQueue(var13);
    boolean var17 = var16.isEmpty();
    int[] var18 = new int[] { };
    int[] var19 = var16.remove(var18);
    int[] var20 = var12.retry(var18);
    int[] var21 = var6.retry(var18);
    boolean var22 = var6.isEmpty();
    boolean var23 = var6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test267");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\Destination", "D");
    java.io.File var3 = var2.getDestinationFolder();
    java.lang.String var4 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "D"+ "'", var4.equals("D"));

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test268");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    int var4 = var0.getCurrentPercent();
    boolean var7 = var0.nameIsAcceptable("CW", "\\");
    var0.unpause();
    boolean var9 = var0.getBusy();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test269");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.FailedQueue var6 = new minicopier.FailedQueue(var0);
    var0.decreaseQueueCurrentSize(11L);
    var0.clearBasket();
    var0.add2basket("CW");
    minicopier.Copier var12 = new minicopier.Copier();
    var12.increaseFileCurrentSize((-1L));
    var12.add2basket("");
    var12.clearBasket();
    var12.increaseFileCurrentSize(100L);
    java.lang.String var20 = var12.getCurrentFileDestination();
    java.lang.String var21 = var12.getCurrentFileSource();
    minicopier.FileToTransfer var24 = new minicopier.FileToTransfer("", "");
    java.io.File var25 = var24.getDestinationFolder();
    java.lang.String var26 = var24.getDestinationFolderPath();
    java.io.File var27 = var24.getDestinationFolder();
    java.io.File var28 = var24.getDestinationFolder();
    var12.addFolder2Queue(var28, "\\hi!");
    var0.addFolder2Queue(var28, "B");
    java.lang.String var33 = var0.getCurrentFileDestination();
    minicopier.MainQueue var34 = new minicopier.MainQueue(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test270");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.unpause();
    minicopier.MainQueue var4 = new minicopier.MainQueue(var0);
    minicopier.Copier var5 = new minicopier.Copier();
    var5.setFileCurrentSize(1L);
    var5.setFileCurrentSize(100L);
    int var10 = var5.getTotalPercent();
    java.lang.String var12 = var5.stringURI2StringPath("hi!");
    int var13 = var5.getTotalPercent();
    minicopier.MainQueue var14 = new minicopier.MainQueue(var5);
    minicopier.FailedQueue var15 = new minicopier.FailedQueue(var5);
    javax.swing.table.DefaultTableModel var16 = var15.getTableModel();
    javax.swing.table.DefaultTableModel var17 = var15.getTableModel();
    java.util.Vector var18 = var17.getDataVector();
    javax.swing.event.TableModelListener[] var19 = var17.getTableModelListeners();
    minicopier.MainQueue.TransfersModel var21 = var4.new TransfersModel((java.lang.Object[])var19, 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test271");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.setFileCurrentSize(10L);
    minicopier.FileToTransfer var9 = new minicopier.FileToTransfer("", "");
    var9.changeTargetName("");
    java.io.File var12 = var9.getDestinationFile();
    java.io.File var13 = var9.getSourceFile();
    boolean var14 = minicopier.Copier.isNotLink(var13);
    var0.addFolder2Queue(var13, "hi!\\");
    var0.increaseFileCurrentSize(10L);
    boolean var21 = var0.nameIsAcceptable("CW", "hi!");
    minicopier.FileToTransfer var24 = new minicopier.FileToTransfer("A", "K");
    minicopier.TransferTask var26 = new minicopier.TransferTask(var0, var24, false);
    var0.paste("\\hi!");
    boolean var29 = var0.getPause();
    boolean var32 = var0.nameIsAcceptable("\\hi!", "\\CW");
    var0.unpause();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test272");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.increaseQueueCurrentSize((-1L));
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    var7.changeTargetName("");
    java.io.File var10 = var7.getDestinationFile();
    minicopier.TransferTask var12 = new minicopier.TransferTask(var0, var7, true);
    boolean var13 = var0.pause();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test273");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test274");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    java.lang.String var4 = var0.stringURI2StringPath("hi!");
    var0.setFileCurrentSize((-100L));
    long var7 = var0.getFileTotalSize();
    var0.forceStart();
    java.lang.String var10 = var0.stringURI2StringPath("E");
    java.lang.String var12 = var0.stringURI2StringPath("K");
    java.lang.String var13 = var0.getCurrentFileDestination();
    minicopier.FailedQueue var14 = new minicopier.FailedQueue(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "E"+ "'", var10.equals("E"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "K"+ "'", var12.equals("K"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test275");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.increaseFileCurrentSize(10L);
    minicopier.FileToTransfer var9 = new minicopier.FileToTransfer("", "");
    var9.changeTargetName("");
    java.io.File var12 = var9.getDestinationFile();
    java.io.File var13 = var9.getSourceFile();
    java.lang.String var14 = var9.getDestinationFilePath();
    minicopier.TransferTask var16 = new minicopier.TransferTask(var0, var9, true);
    long var17 = var0.getTotalBytesRemaining();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "\\"+ "'", var14.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-9L));

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test276");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    java.lang.Object[] var23 = new java.lang.Object[] { var22};
    var10.addColumn((java.lang.Object)0.0d, var23);
    var10.setColumnCount(0);
    java.lang.String var28 = var10.getColumnName(100);
    java.util.Vector var29 = var10.getDataVector();
    minicopier.Basket var30 = new minicopier.Basket();
    java.util.Iterator var31 = var30.getIterator();
    int var32 = var30.getLength();
    minicopier.Copier var33 = new minicopier.Copier();
    var33.setFileCurrentSize(1L);
    var33.setFileCurrentSize(100L);
    int var38 = var33.getTotalPercent();
    java.lang.String var40 = var33.stringURI2StringPath("hi!");
    int var41 = var33.getTotalPercent();
    minicopier.MainQueue var42 = new minicopier.MainQueue(var33);
    javax.swing.table.DefaultTableModel var43 = var42.getTableModel();
    minicopier.Copier var44 = new minicopier.Copier();
    var44.setFileCurrentSize(1L);
    var44.setFileCurrentSize(100L);
    java.lang.Object[] var49 = new java.lang.Object[] { 100L};
    var43.addRow(var49);
    var43.setNumRows(0);
    var43.fireTableDataChanged();
    var43.fireTableStructureChanged();
    var43.fireTableStructureChanged();
    java.lang.Class var57 = var43.getColumnClass(0);
    javax.swing.event.TableModelListener[] var58 = var43.getTableModelListeners();
    var10.addColumn((java.lang.Object)var30, (java.lang.Object[])var58);
    var30.add("\\");
    var30.add("D");
    var30.add("C");
    var30.add("A\\hi!\\");
    java.util.Iterator var68 = var30.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "CW"+ "'", var28.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test277");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    java.lang.Object[] var23 = new java.lang.Object[] { var22};
    var10.addColumn((java.lang.Object)0.0d, var23);
    var10.fireTableRowsInserted(100, 10);
    java.util.Vector var28 = var10.getDataVector();
    java.util.Vector var29 = var10.getDataVector();
    var10.fireTableRowsUpdated(10, (-1));
    var10.setRowCount(0);
    var10.fireTableRowsInserted(6, 4);
    minicopier.Copier var38 = new minicopier.Copier();
    var38.setFileCurrentSize(1L);
    var38.setFileCurrentSize(100L);
    int var43 = var38.getTotalPercent();
    java.lang.String var45 = var38.stringURI2StringPath("hi!");
    int var46 = var38.getTotalPercent();
    minicopier.MainQueue var47 = new minicopier.MainQueue(var38);
    javax.swing.table.DefaultTableModel var48 = var47.getTableModel();
    minicopier.Copier var49 = new minicopier.Copier();
    var49.setFileCurrentSize(1L);
    var49.setFileCurrentSize(100L);
    java.lang.Object[] var54 = new java.lang.Object[] { 100L};
    var48.addRow(var54);
    var48.setNumRows(0);
    var48.fireTableDataChanged();
    var48.fireTableStructureChanged();
    var48.fireTableStructureChanged();
    var48.setColumnCount(10);
    var48.setNumRows(10);
    minicopier.Copier var65 = new minicopier.Copier();
    var65.setFileCurrentSize(1L);
    var65.setFileCurrentSize(100L);
    int var70 = var65.getTotalPercent();
    java.lang.String var72 = var65.stringURI2StringPath("hi!");
    int var73 = var65.getTotalPercent();
    minicopier.MainQueue var74 = new minicopier.MainQueue(var65);
    minicopier.Copier var75 = new minicopier.Copier();
    var75.setFileCurrentSize(1L);
    java.lang.String var79 = var75.stringURI2StringPath("hi!");
    minicopier.FailedQueue var80 = new minicopier.FailedQueue(var75);
    boolean var81 = var80.isEmpty();
    javax.swing.table.DefaultTableModel var82 = var80.getTableModel();
    javax.swing.event.TableModelListener[] var83 = var82.getTableModelListeners();
    minicopier.MainQueue.TransfersModel var85 = var74.new TransfersModel((java.lang.Object[])var83, 5);
    var48.setColumnIdentifiers((java.lang.Object[])var83);
    var48.moveRow(11, 9, 4);
    var48.fireTableRowsUpdated((-1), 10);
    var10.addColumn((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "hi!"+ "'", var79.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test278");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.clearBasket();
    java.lang.String var7 = var0.getCurrentFileSource();
    long var8 = var0.getCurrentBytesRemaining();
    int var9 = var0.basketLength();
    long var10 = var0.getQueueTotalSize();
    minicopier.FailedQueue var11 = new minicopier.FailedQueue(var0);
    java.lang.String var12 = var0.getCurrentFileDestination();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test279");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    var0.forceStart();
    minicopier.MainQueue var6 = new minicopier.MainQueue(var0);
    minicopier.MainQueue var7 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var8 = var7.getTableModel();
    int var10 = var8.findColumn("L");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test280");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    var0.forceStart();
    boolean var3 = var0.pause();
    boolean var4 = var0.pause();
    long var5 = var0.getTotalBytesRemaining();
    var0.add2basket("K\\A\\Destination");
    boolean var10 = var0.nameIsAcceptable("A\\hi!\\", "A\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test281");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.setColumnCount(0);
    int var14 = var10.findColumn("hi!\\");
    var10.setColumnCount(10);
    var10.fireTableStructureChanged();
    int var18 = var10.getRowCount();
    java.util.Vector var19 = var10.getDataVector();
    minicopier.Copier var20 = new minicopier.Copier();
    var20.setFileCurrentSize(1L);
    var20.setFileCurrentSize(100L);
    int var25 = var20.getTotalPercent();
    java.lang.String var27 = var20.stringURI2StringPath("hi!");
    int var28 = var20.getTotalPercent();
    minicopier.MainQueue var29 = new minicopier.MainQueue(var20);
    javax.swing.table.DefaultTableModel var30 = var29.getTableModel();
    minicopier.Copier var31 = new minicopier.Copier();
    var31.setFileCurrentSize(1L);
    var31.setFileCurrentSize(100L);
    java.lang.Object[] var36 = new java.lang.Object[] { 100L};
    var30.addRow(var36);
    var30.moveRow(100, (-1), 100);
    minicopier.Copier var42 = new minicopier.Copier();
    var42.setFileCurrentSize(1L);
    var42.setFileCurrentSize(100L);
    int var47 = var42.getTotalPercent();
    java.lang.String var49 = var42.stringURI2StringPath("hi!");
    int var50 = var42.getTotalPercent();
    minicopier.MainQueue var51 = new minicopier.MainQueue(var42);
    javax.swing.table.DefaultTableModel var52 = var51.getTableModel();
    minicopier.Copier var54 = new minicopier.Copier();
    var54.setFileCurrentSize(1L);
    var54.setFileCurrentSize(100L);
    int var59 = var54.getTotalPercent();
    java.lang.String var61 = var54.stringURI2StringPath("hi!");
    int var62 = var54.getTotalPercent();
    minicopier.MainQueue var63 = new minicopier.MainQueue(var54);
    javax.swing.table.DefaultTableModel var64 = var63.getTableModel();
    java.lang.Object[] var65 = new java.lang.Object[] { var64};
    var52.addColumn((java.lang.Object)0.0d, var65);
    var52.setColumnCount(0);
    java.lang.String var70 = var52.getColumnName(100);
    java.util.Vector var71 = var52.getDataVector();
    var10.addColumn((java.lang.Object)var30, var71);
    javax.swing.event.TableModelListener[] var73 = var30.getTableModelListeners();
    var30.fireTableRowsUpdated(11, (-1));
    var30.setColumnCount(1);
    java.util.Vector var79 = var30.getDataVector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var82 = var30.getValueAt(1, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "CW"+ "'", var70.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test282");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = var6.getDestinationFilePath();
    minicopier.TransferTask var10 = new minicopier.TransferTask(var0, var6, false);
    var10.setPause();
    boolean var12 = var10.getCompleted();
    var10.setCancelAndQueue(true);
    var10.setCancelAndQueue(true);
    var10.unpause();
    boolean var18 = var10.getCompleted();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\"+ "'", var8.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test283");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.fireTableRowsInserted(1, 0);
    int var15 = var10.findColumn("CW");
    java.lang.String var17 = var10.getColumnName(10);
    java.lang.String var19 = var10.getColumnName(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "K"+ "'", var17.equals("K"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Destination"+ "'", var19.equals("Destination"));

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test284");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(0L);
    long var8 = var0.readAndInitBytesCounter();
    var0.paste2URIString("K");
    boolean var11 = var0.getPause();
    minicopier.FailedQueue var12 = new minicopier.FailedQueue(var0);
    minicopier.Copier var13 = new minicopier.Copier();
    var13.increaseFileCurrentSize((-1L));
    int var16 = var13.basketLength();
    long var17 = var13.getFileTotalSize();
    minicopier.FileToTransfer var20 = new minicopier.FileToTransfer("", "");
    java.io.File var21 = var20.getDestinationFolder();
    var13.addFolder2Queue(var21, "hi!");
    minicopier.Copier var24 = new minicopier.Copier();
    var24.increaseFileCurrentSize((-1L));
    int var27 = var24.basketLength();
    long var28 = var24.getFileTotalSize();
    minicopier.FileToTransfer var31 = new minicopier.FileToTransfer("", "");
    java.io.File var32 = var31.getDestinationFolder();
    var24.addFolder2Queue(var32, "hi!");
    var13.addFolder2Queue(var32, "");
    minicopier.FileToTransfer var39 = new minicopier.FileToTransfer("", "");
    java.io.File var40 = var39.getDestinationFolder();
    java.lang.String var41 = var39.getDestinationFolderPath();
    java.io.File var42 = var39.getDestinationFolder();
    var13.addFolder2Queue(var42, "hi!");
    minicopier.FileToTransfer var47 = new minicopier.FileToTransfer("CW", "");
    minicopier.TransferTask var49 = new minicopier.TransferTask(var13, var47, true);
    long var50 = var47.getSize();
    var12.addFile(var47);
    java.io.File var52 = var47.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test285");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getDestinationFolderPath();
    java.io.File var5 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test286");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = minicopier.i18n.Language.get("\\Source");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test287");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    var0.paste("\\");
    var0.add2basket("");
    int var15 = var0.basketLength();
    minicopier.FailedQueue var16 = new minicopier.FailedQueue(var0);
    javax.swing.table.DefaultTableModel var17 = var16.getTableModel();
    var17.fireTableDataChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test288");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    var0.paste("\\");
    var0.add2basket("");
    var0.forceStart();
    boolean var16 = var0.getPause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test289");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    long var2 = var0.readAndInitBytesCounter();
    long var3 = var0.readAndInitBytesCounter();
    var0.increaseFileCurrentSize(100L);
    boolean var8 = var0.nameIsAcceptable("", "CW");
    minicopier.FileToTransfer var11 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var12 = var11.getName();
    java.lang.String var13 = var11.getDestinationFilePath();
    minicopier.TransferTask var15 = new minicopier.TransferTask(var0, var11, false);
    var11.changeTargetName("E");
    java.lang.String var18 = var11.getName();
    java.lang.String var19 = var11.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\"+ "'", var13.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test290");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    java.lang.String var4 = var0.stringURI2StringPath("hi!");
    minicopier.FailedQueue var5 = new minicopier.FailedQueue(var0);
    javax.swing.table.DefaultTableModel var6 = var5.getTableModel();
    int var7 = var6.getColumnCount();
    var6.fireTableDataChanged();
    java.lang.String var10 = var6.getColumnName((-1));
    var6.fireTableCellUpdated(4, (-1));
    javax.swing.event.TableModelListener[] var14 = var6.getTableModelListeners();
    int var15 = var6.getColumnCount();
    var6.fireTableRowsInserted(0, 100);
    javax.swing.event.TableModelListener[] var19 = var6.getTableModelListeners();
    java.lang.String var21 = var6.getColumnName(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "J"+ "'", var21.equals("J"));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test291");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.setFileCurrentSize(10L);
    minicopier.FileToTransfer var9 = new minicopier.FileToTransfer("", "");
    var9.changeTargetName("");
    java.io.File var12 = var9.getDestinationFile();
    java.io.File var13 = var9.getSourceFile();
    boolean var14 = minicopier.Copier.isNotLink(var13);
    var0.addFolder2Queue(var13, "hi!\\");
    var0.increaseFileCurrentSize(10L);
    boolean var21 = var0.nameIsAcceptable("CW", "hi!");
    long var22 = var0.getCurrentBytesRemaining();
    var0.decreaseQueueCurrentSize(1L);
    int var25 = var0.basketLength();
    var0.increaseFileCurrentSize((-89L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-20L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test292");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    minicopier.FileToTransfer var6 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = var6.getDestinationFilePath();
    minicopier.TransferTask var10 = new minicopier.TransferTask(var0, var6, false);
    long var11 = var0.getCurrentBytesRemaining();
    boolean var12 = var0.getPause();
    var0.forceStart();
    long var14 = var0.getFileTotalSize();
    var0.clearBasket();
    minicopier.Copier var16 = new minicopier.Copier();
    var16.setFileCurrentSize(1L);
    var16.setFileCurrentSize(100L);
    int var21 = var16.getTotalPercent();
    java.lang.String var23 = var16.stringURI2StringPath("hi!");
    int var24 = var16.getTotalPercent();
    minicopier.MainQueue var25 = new minicopier.MainQueue(var16);
    javax.swing.table.DefaultTableModel var26 = var25.getTableModel();
    minicopier.Copier var27 = new minicopier.Copier();
    var27.setFileCurrentSize(1L);
    var27.setFileCurrentSize(100L);
    int var32 = var27.getTotalPercent();
    java.lang.String var34 = var27.stringURI2StringPath("hi!");
    int var35 = var27.getTotalPercent();
    minicopier.MainQueue var36 = new minicopier.MainQueue(var27);
    javax.swing.table.DefaultTableModel var37 = var36.getTableModel();
    minicopier.Copier var38 = new minicopier.Copier();
    var38.setFileCurrentSize(1L);
    var38.setFileCurrentSize(100L);
    java.lang.Object[] var43 = new java.lang.Object[] { 100L};
    var37.addRow(var43);
    java.lang.Object[][] var45 = new java.lang.Object[][] { var43};
    minicopier.FileToTransfer var48 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var49 = var48.getName();
    java.lang.Object[] var50 = new java.lang.Object[] { var49};
    var26.setDataVector(var45, var50);
    var26.fireTableCellUpdated(1, 3);
    minicopier.FileToTransfer var57 = new minicopier.FileToTransfer("", "");
    var57.changeTargetName("");
    long var60 = var57.getSize();
    java.io.File var61 = var57.getDestinationFolder();
    boolean var62 = minicopier.Copier.isNotLink(var61);
    var26.addColumn((java.lang.Object)var61);
    var0.addFolder2Queue(var61, "hi!\\");
    java.lang.String var67 = var0.stringURI2StringPath("");
    var0.forceStart();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\"+ "'", var8.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + ""+ "'", var67.equals(""));

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test293");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("Destination", "hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.io.File var4 = var2.getSourceFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getDestinationFolderPath();
    var2.changeTargetName("K\\A");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\Destination"+ "'", var3.equals("hi!\\Destination"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test294");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    minicopier.Copier var11 = new minicopier.Copier();
    var11.increaseFileCurrentSize((-1L));
    int var14 = var11.basketLength();
    long var15 = var11.getFileTotalSize();
    minicopier.FileToTransfer var18 = new minicopier.FileToTransfer("", "");
    java.io.File var19 = var18.getDestinationFolder();
    var11.addFolder2Queue(var19, "hi!");
    var0.addFolder2Queue(var19, "");
    minicopier.FileToTransfer var26 = new minicopier.FileToTransfer("", "");
    java.io.File var27 = var26.getDestinationFolder();
    java.lang.String var28 = var26.getDestinationFolderPath();
    java.io.File var29 = var26.getDestinationFolder();
    var0.addFolder2Queue(var29, "hi!");
    boolean var32 = var0.getPause();
    minicopier.Copier var33 = new minicopier.Copier();
    var33.clearBasket();
    long var35 = var33.readAndInitBytesCounter();
    long var36 = var33.getCurrentBytesRemaining();
    minicopier.FailedQueue var37 = new minicopier.FailedQueue(var33);
    boolean var38 = var37.isEmpty();
    minicopier.Copier var39 = new minicopier.Copier();
    var39.increaseFileCurrentSize((-1L));
    var39.add2basket("");
    var39.increaseFileCurrentSize(10L);
    var39.clearBasket();
    minicopier.FileToTransfer var49 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var50 = var49.getName();
    java.lang.String var51 = var49.getDestinationFilePath();
    var49.changeTargetName("hi!\\");
    java.io.File var54 = var49.getSourceFile();
    java.lang.String var55 = var49.getName();
    minicopier.TransferTask var57 = new minicopier.TransferTask(var39, var49, true);
    java.lang.String var58 = var49.getDestinationFolderPath();
    var37.addFile(var49);
    java.lang.String var60 = var49.getSourcePath();
    java.io.File var61 = var49.getSourceFile();
    minicopier.TransferTask var63 = new minicopier.TransferTask(var0, var49, false);
    minicopier.FileToTransfer var66 = new minicopier.FileToTransfer("", "");
    java.lang.String var67 = var66.getDestinationFolderPath();
    java.lang.String var68 = var66.getSourcePath();
    java.io.File var69 = var66.getDestinationFile();
    java.lang.String var70 = var66.getDestinationFolderPath();
    java.lang.String var71 = var66.getDestinationFilePath();
    java.io.File var72 = var66.getDestinationFolder();
    java.io.File var73 = var66.getDestinationFolder();
    var0.addFolder2Queue(var73, "\\A");
    var0.setFileCurrentSize(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!\\"+ "'", var51.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + ""+ "'", var67.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + ""+ "'", var70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "\\"+ "'", var71.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test295");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.setColumnCount(0);
    int var14 = var10.findColumn("hi!\\");
    int var15 = var10.getRowCount();
    minicopier.Copier var16 = new minicopier.Copier();
    var16.setFileCurrentSize(1L);
    var16.setFileCurrentSize(100L);
    int var21 = var16.getTotalPercent();
    java.lang.String var23 = var16.stringURI2StringPath("hi!");
    int var24 = var16.getTotalPercent();
    minicopier.MainQueue var25 = new minicopier.MainQueue(var16);
    javax.swing.table.DefaultTableModel var26 = var25.getTableModel();
    minicopier.Copier var27 = new minicopier.Copier();
    var27.setFileCurrentSize(1L);
    var27.setFileCurrentSize(100L);
    int var32 = var27.getTotalPercent();
    java.lang.String var34 = var27.stringURI2StringPath("hi!");
    int var35 = var27.getTotalPercent();
    minicopier.MainQueue var36 = new minicopier.MainQueue(var27);
    javax.swing.table.DefaultTableModel var37 = var36.getTableModel();
    minicopier.Copier var38 = new minicopier.Copier();
    var38.setFileCurrentSize(1L);
    var38.setFileCurrentSize(100L);
    java.lang.Object[] var43 = new java.lang.Object[] { 100L};
    var37.addRow(var43);
    java.lang.Object[][] var45 = new java.lang.Object[][] { var43};
    minicopier.FileToTransfer var48 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var49 = var48.getName();
    java.lang.Object[] var50 = new java.lang.Object[] { var49};
    var26.setDataVector(var45, var50);
    minicopier.Copier var52 = new minicopier.Copier();
    var52.setFileCurrentSize(1L);
    var52.setFileCurrentSize(100L);
    int var57 = var52.getTotalPercent();
    java.lang.String var59 = var52.stringURI2StringPath("hi!");
    int var60 = var52.getTotalPercent();
    minicopier.MainQueue var61 = new minicopier.MainQueue(var52);
    javax.swing.table.DefaultTableModel var62 = var61.getTableModel();
    minicopier.Copier var63 = new minicopier.Copier();
    var63.setFileCurrentSize(1L);
    var63.setFileCurrentSize(100L);
    int var68 = var63.getTotalPercent();
    java.lang.String var70 = var63.stringURI2StringPath("hi!");
    int var71 = var63.getTotalPercent();
    minicopier.MainQueue var72 = new minicopier.MainQueue(var63);
    javax.swing.table.DefaultTableModel var73 = var72.getTableModel();
    minicopier.Copier var74 = new minicopier.Copier();
    var74.setFileCurrentSize(1L);
    var74.setFileCurrentSize(100L);
    java.lang.Object[] var79 = new java.lang.Object[] { 100L};
    var73.addRow(var79);
    java.lang.Object[][] var81 = new java.lang.Object[][] { var79};
    minicopier.FileToTransfer var84 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var85 = var84.getName();
    java.lang.Object[] var86 = new java.lang.Object[] { var85};
    var62.setDataVector(var81, var86);
    var10.setDataVector(var45, (java.lang.Object[])var81);
    var10.fireTableRowsUpdated((-1), 1);
    java.util.Vector var92 = var10.getDataVector();
    var10.fireTableStructureChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "hi!"+ "'", var70.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + ""+ "'", var85.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test296");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    java.lang.Object[] var23 = new java.lang.Object[] { var22};
    var10.addColumn((java.lang.Object)0.0d, var23);
    var10.setColumnCount(0);
    java.lang.String var28 = var10.getColumnName(100);
    java.lang.Class var30 = var10.getColumnClass(1);
    int var31 = var10.getRowCount();
    int var32 = var10.getColumnCount();
    var10.setNumRows(10);
    var10.setNumRows(10);
    java.lang.String var38 = var10.getColumnName(4);
    minicopier.Copier var39 = new minicopier.Copier();
    var39.setFileCurrentSize(1L);
    var39.setFileCurrentSize(100L);
    java.lang.String var44 = var39.getCurrentFileSource();
    minicopier.FailedQueue var45 = new minicopier.FailedQueue(var39);
    var39.decreaseQueueCurrentSize(11L);
    var39.clearBasket();
    minicopier.MainQueue var49 = new minicopier.MainQueue(var39);
    var10.addColumn((java.lang.Object)var49);
    java.util.Vector var51 = var10.getDataVector();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "CW"+ "'", var28.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "E"+ "'", var38.equals("E"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test297");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    long var5 = var0.getQueueTotalSize();
    var0.add2basket("K");
    long var8 = var0.readAndInitBytesCounter();
    boolean var9 = var0.getBusy();
    boolean var10 = var0.pause();
    int var11 = var0.getTotalPercent();
    var0.increaseQueueCurrentSize((-100L));
    minicopier.FileToTransfer var16 = new minicopier.FileToTransfer("hi!\\Destination", "D");
    var16.changeTargetName("D");
    java.lang.String var19 = var16.getDestinationFilePath();
    minicopier.TransferTask var21 = new minicopier.TransferTask(var0, var16, true);
    boolean var22 = var21.getCancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "D\\D"+ "'", var19.equals("D\\D"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test298");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.setFileCurrentSize(10L);
    minicopier.FileToTransfer var9 = new minicopier.FileToTransfer("", "");
    var9.changeTargetName("");
    java.io.File var12 = var9.getDestinationFile();
    java.io.File var13 = var9.getSourceFile();
    boolean var14 = minicopier.Copier.isNotLink(var13);
    var0.addFolder2Queue(var13, "hi!\\");
    int var17 = var0.basketLength();
    java.lang.String var18 = var0.getCurrentFileDestination();
    long var19 = var0.getFileTotalSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test299");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "");
    var2.changeTargetName("");
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\Destination");
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getDestinationFolderPath();
    java.io.File var13 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "\\"+ "'", var7.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test300");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getFileTotalSize();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFolder();
    var0.addFolder2Queue(var8, "hi!");
    minicopier.Copier var11 = new minicopier.Copier();
    var11.increaseFileCurrentSize((-1L));
    int var14 = var11.basketLength();
    long var15 = var11.getFileTotalSize();
    minicopier.FileToTransfer var18 = new minicopier.FileToTransfer("", "");
    java.io.File var19 = var18.getDestinationFolder();
    var11.addFolder2Queue(var19, "hi!");
    var0.addFolder2Queue(var19, "");
    minicopier.FileToTransfer var26 = new minicopier.FileToTransfer("", "");
    java.io.File var27 = var26.getDestinationFolder();
    java.lang.String var28 = var26.getDestinationFolderPath();
    java.io.File var29 = var26.getDestinationFolder();
    var0.addFolder2Queue(var29, "hi!");
    minicopier.FileToTransfer var34 = new minicopier.FileToTransfer("CW", "");
    minicopier.TransferTask var36 = new minicopier.TransferTask(var0, var34, true);
    boolean var37 = var36.getCancel();
    var36.setPause();
    var36.setCancelAndQueue(true);
    var36.unpause();
    var36.unpause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test301");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.FailedQueue var6 = new minicopier.FailedQueue(var0);
    var0.decreaseQueueCurrentSize(11L);
    var0.clearBasket();
    int var10 = var0.getCurrentPercent();
    int var11 = var0.getCurrentPercent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test302");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    boolean var4 = var3.isEmpty();
    minicopier.FileToTransfer var7 = new minicopier.FileToTransfer("", "");
    java.io.File var8 = var7.getDestinationFile();
    java.lang.String var9 = var7.getSourcePath();
    java.lang.String var10 = var7.getDestinationFilePath();
    var3.addFile(var7);
    javax.swing.table.DefaultTableModel var12 = var3.getTableModel();
    int var13 = var12.getRowCount();
    int var15 = var12.findColumn("");
    minicopier.Copier var16 = new minicopier.Copier();
    var16.setFileCurrentSize(1L);
    var16.setFileCurrentSize(100L);
    int var21 = var16.getTotalPercent();
    java.lang.String var23 = var16.stringURI2StringPath("hi!");
    int var24 = var16.getTotalPercent();
    minicopier.MainQueue var25 = new minicopier.MainQueue(var16);
    javax.swing.table.DefaultTableModel var26 = var25.getTableModel();
    var26.fireTableRowsInserted(1, 0);
    int var31 = var26.findColumn("CW");
    var26.setRowCount(0);
    var26.setColumnCount(1);
    minicopier.Copier var36 = new minicopier.Copier();
    var36.setFileCurrentSize(1L);
    java.lang.String var40 = var36.stringURI2StringPath("hi!");
    minicopier.FailedQueue var41 = new minicopier.FailedQueue(var36);
    javax.swing.table.DefaultTableModel var42 = var41.getTableModel();
    minicopier.Copier var43 = new minicopier.Copier();
    var43.setFileCurrentSize(1L);
    var43.setFileCurrentSize(100L);
    int var48 = var43.getTotalPercent();
    java.lang.String var50 = var43.stringURI2StringPath("hi!");
    int var51 = var43.getTotalPercent();
    minicopier.MainQueue var52 = new minicopier.MainQueue(var43);
    javax.swing.table.DefaultTableModel var53 = var52.getTableModel();
    minicopier.Copier var54 = new minicopier.Copier();
    var54.setFileCurrentSize(1L);
    var54.setFileCurrentSize(100L);
    java.lang.Object[] var59 = new java.lang.Object[] { 100L};
    var53.addRow(var59);
    var53.setNumRows(0);
    var53.fireTableDataChanged();
    var53.fireTableStructureChanged();
    var53.fireTableStructureChanged();
    java.lang.Class var67 = var53.getColumnClass(0);
    javax.swing.event.TableModelListener[] var68 = var53.getTableModelListeners();
    var42.setColumnIdentifiers((java.lang.Object[])var68);
    var26.setColumnIdentifiers((java.lang.Object[])var68);
    var12.addRow((java.lang.Object[])var68);
    var12.fireTableDataChanged();
    int var73 = var12.getColumnCount();
    int var74 = var12.getRowCount();
    var12.fireTableStructureChanged();
    var12.fireTableCellUpdated(3, 5);
    var12.fireTableRowsInserted(2, 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "\\"+ "'", var10.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 2);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test303");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    long var4 = var0.getTotalBytesRemaining();
    long var5 = var0.getTotalBytesRemaining();
    var0.clearBasket();
    java.lang.String var7 = var0.getCurrentFileSource();
    boolean var8 = var0.getBusy();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test304");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    javax.swing.table.DefaultTableModel var11 = var9.getTableModel();
    var11.fireTableDataChanged();
    minicopier.Copier var13 = new minicopier.Copier();
    var13.setFileCurrentSize(1L);
    var13.setFileCurrentSize(100L);
    int var18 = var13.getTotalPercent();
    java.lang.String var20 = var13.stringURI2StringPath("hi!");
    int var21 = var13.getTotalPercent();
    minicopier.MainQueue var22 = new minicopier.MainQueue(var13);
    javax.swing.table.DefaultTableModel var23 = var22.getTableModel();
    javax.swing.table.DefaultTableModel var24 = var22.getTableModel();
    minicopier.Copier var25 = new minicopier.Copier();
    var25.setFileCurrentSize(1L);
    var25.setFileCurrentSize(100L);
    java.lang.String var30 = var25.getCurrentFileSource();
    minicopier.MainQueue var31 = new minicopier.MainQueue(var25);
    minicopier.Copier var32 = new minicopier.Copier();
    var32.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var35 = new minicopier.FailedQueue(var32);
    boolean var36 = var35.isEmpty();
    int[] var37 = new int[] { };
    int[] var38 = var35.remove(var37);
    int[] var39 = var31.remove(var37);
    int[] var40 = var22.remove(var37);
    minicopier.Copier var41 = new minicopier.Copier();
    var41.setFileCurrentSize(1L);
    var41.setFileCurrentSize(100L);
    int var46 = var41.getTotalPercent();
    java.lang.String var48 = var41.stringURI2StringPath("hi!");
    int var49 = var41.getTotalPercent();
    minicopier.MainQueue var50 = new minicopier.MainQueue(var41);
    javax.swing.table.DefaultTableModel var51 = var50.getTableModel();
    minicopier.Copier var53 = new minicopier.Copier();
    var53.setFileCurrentSize(1L);
    var53.setFileCurrentSize(100L);
    int var58 = var53.getTotalPercent();
    java.lang.String var60 = var53.stringURI2StringPath("hi!");
    int var61 = var53.getTotalPercent();
    minicopier.MainQueue var62 = new minicopier.MainQueue(var53);
    javax.swing.table.DefaultTableModel var63 = var62.getTableModel();
    java.lang.Object[] var64 = new java.lang.Object[] { var63};
    var51.addColumn((java.lang.Object)0.0d, var64);
    minicopier.MainQueue.TransfersModel var67 = var22.new TransfersModel(var64, 100);
    boolean var70 = var67.isCellEditable(10, 4);
    boolean var73 = var67.isCellEditable(4, 11);
    var67.fireTableRowsInserted(9, 10);
    var67.fireTableStructureChanged();
    java.lang.Class var79 = var67.getColumnClass(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var80 = var11.<java.util.EventListener>getListeners(var79);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test305");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    var0.paste("hi!");
    boolean var6 = var0.pause();
    boolean var7 = var0.pause();
    minicopier.MainQueue var8 = new minicopier.MainQueue(var0);
    minicopier.Copier var9 = new minicopier.Copier();
    var9.setFileCurrentSize(1L);
    var9.setFileCurrentSize(100L);
    java.lang.String var14 = var9.getCurrentFileSource();
    minicopier.FailedQueue var15 = new minicopier.FailedQueue(var9);
    var9.decreaseQueueCurrentSize(11L);
    var9.clearBasket();
    minicopier.FailedQueue var19 = new minicopier.FailedQueue(var9);
    boolean var20 = var19.isEmpty();
    minicopier.Copier var21 = new minicopier.Copier();
    var21.clearBasket();
    long var23 = var21.readAndInitBytesCounter();
    long var24 = var21.getCurrentBytesRemaining();
    minicopier.FailedQueue var25 = new minicopier.FailedQueue(var21);
    boolean var26 = var25.isEmpty();
    minicopier.Copier var27 = new minicopier.Copier();
    var27.setFileCurrentSize(1L);
    var27.setFileCurrentSize(100L);
    var27.forceStart();
    minicopier.MainQueue var33 = new minicopier.MainQueue(var27);
    minicopier.Copier var34 = new minicopier.Copier();
    var34.setFileCurrentSize(1L);
    var34.setFileCurrentSize(100L);
    int var39 = var34.getTotalPercent();
    java.lang.String var41 = var34.stringURI2StringPath("hi!");
    var34.increaseQueueCurrentSize(11L);
    minicopier.FileToTransfer var46 = new minicopier.FileToTransfer("", "");
    java.lang.String var47 = var46.getSourcePath();
    java.io.File var48 = var46.getDestinationFolder();
    var34.addFolder2Queue(var48, "\\");
    minicopier.FailedQueue var51 = new minicopier.FailedQueue(var34);
    minicopier.Copier var52 = new minicopier.Copier();
    var52.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var55 = new minicopier.FailedQueue(var52);
    minicopier.FileToTransfer var58 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var59 = var58.getName();
    var55.addFile(var58);
    minicopier.Copier var61 = new minicopier.Copier();
    var61.clearBasket();
    long var63 = var61.readAndInitBytesCounter();
    long var64 = var61.getCurrentBytesRemaining();
    minicopier.FailedQueue var65 = new minicopier.FailedQueue(var61);
    minicopier.Copier var66 = new minicopier.Copier();
    var66.setFileCurrentSize(1L);
    var66.setFileCurrentSize(100L);
    java.lang.String var71 = var66.getCurrentFileSource();
    minicopier.MainQueue var72 = new minicopier.MainQueue(var66);
    minicopier.Copier var73 = new minicopier.Copier();
    var73.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var76 = new minicopier.FailedQueue(var73);
    boolean var77 = var76.isEmpty();
    int[] var78 = new int[] { };
    int[] var79 = var76.remove(var78);
    int[] var80 = var72.remove(var78);
    minicopier.Copier var81 = new minicopier.Copier();
    var81.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var84 = new minicopier.FailedQueue(var81);
    boolean var85 = var84.isEmpty();
    int[] var86 = new int[] { };
    int[] var87 = var84.remove(var86);
    int[] var88 = var72.putFirst(var86);
    int[] var89 = var65.retry(var86);
    int[] var90 = var55.remove(var86);
    int[] var91 = var51.retry(var86);
    int[] var92 = var33.putFirst(var86);
    int[] var93 = var25.remove(var86);
    int[] var94 = var19.remove(var86);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var95 = var8.remove(var94);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + ""+ "'", var71.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test306");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    var0.setFileCurrentSize(11L);
    boolean var12 = var0.getPause();
    var0.increaseQueueCurrentSize((-9L));
    boolean var15 = var0.getBusy();
    var0.increaseFileCurrentSize(79L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test307");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    minicopier.MainQueue var6 = new minicopier.MainQueue(var0);
    var0.decreaseQueueCurrentSize(1L);
    boolean var9 = var0.getBusy();
    var0.setFileCurrentSize(100L);
    var0.decreaseQueueCurrentSize(9L);
    minicopier.FileToTransfer var16 = new minicopier.FileToTransfer("", "");
    var16.changeTargetName("");
    var16.changeTargetName("D");
    java.io.File var21 = var16.getDestinationFile();
    java.io.File var22 = var16.getDestinationFile();
    minicopier.TransferTask var24 = new minicopier.TransferTask(var0, var16, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test308");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    java.lang.String var4 = var0.stringURI2StringPath("hi!");
    minicopier.FailedQueue var5 = new minicopier.FailedQueue(var0);
    javax.swing.table.DefaultTableModel var6 = var5.getTableModel();
    javax.swing.table.DefaultTableModel var7 = var5.getTableModel();
    var7.fireTableDataChanged();
    var7.setNumRows(10);
    int var11 = var7.getColumnCount();
    var7.fireTableDataChanged();
    java.lang.String var14 = var7.getColumnName((-1));
    var7.setColumnCount(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test309");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    var0.increaseQueueCurrentSize(11L);
    minicopier.FileToTransfer var12 = new minicopier.FileToTransfer("", "");
    java.lang.String var13 = var12.getSourcePath();
    java.io.File var14 = var12.getDestinationFolder();
    var0.addFolder2Queue(var14, "\\");
    minicopier.FailedQueue var17 = new minicopier.FailedQueue(var0);
    minicopier.Copier var18 = new minicopier.Copier();
    var18.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var21 = new minicopier.FailedQueue(var18);
    minicopier.FileToTransfer var24 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var25 = var24.getName();
    var21.addFile(var24);
    minicopier.Copier var27 = new minicopier.Copier();
    var27.clearBasket();
    long var29 = var27.readAndInitBytesCounter();
    long var30 = var27.getCurrentBytesRemaining();
    minicopier.FailedQueue var31 = new minicopier.FailedQueue(var27);
    minicopier.Copier var32 = new minicopier.Copier();
    var32.setFileCurrentSize(1L);
    var32.setFileCurrentSize(100L);
    java.lang.String var37 = var32.getCurrentFileSource();
    minicopier.MainQueue var38 = new minicopier.MainQueue(var32);
    minicopier.Copier var39 = new minicopier.Copier();
    var39.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var42 = new minicopier.FailedQueue(var39);
    boolean var43 = var42.isEmpty();
    int[] var44 = new int[] { };
    int[] var45 = var42.remove(var44);
    int[] var46 = var38.remove(var44);
    minicopier.Copier var47 = new minicopier.Copier();
    var47.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var50 = new minicopier.FailedQueue(var47);
    boolean var51 = var50.isEmpty();
    int[] var52 = new int[] { };
    int[] var53 = var50.remove(var52);
    int[] var54 = var38.putFirst(var52);
    int[] var55 = var31.retry(var52);
    int[] var56 = var21.remove(var52);
    int[] var57 = var17.retry(var52);
    minicopier.FileToTransfer var60 = new minicopier.FileToTransfer("", "");
    var17.addFile(var60);
    long var62 = var60.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0L);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test310");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.setFileCurrentSize(10L);
    minicopier.FileToTransfer var9 = new minicopier.FileToTransfer("", "");
    var9.changeTargetName("");
    java.io.File var12 = var9.getDestinationFile();
    java.io.File var13 = var9.getSourceFile();
    boolean var14 = minicopier.Copier.isNotLink(var13);
    var0.addFolder2Queue(var13, "hi!\\");
    var0.increaseFileCurrentSize(10L);
    boolean var21 = var0.nameIsAcceptable("CW", "hi!");
    minicopier.FileToTransfer var24 = new minicopier.FileToTransfer("A", "K");
    minicopier.TransferTask var26 = new minicopier.TransferTask(var0, var24, false);
    var0.paste("\\hi!");
    var0.add2basket("D");
    var0.unpause();
    minicopier.MainQueue var32 = new minicopier.MainQueue(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      minicopier.FileToTransfer var33 = var32.extractFirst();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test311");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.unpause();
    java.lang.String var6 = var0.getCurrentFileSource();
    minicopier.FileToTransfer var9 = new minicopier.FileToTransfer("", "");
    var9.changeTargetName("");
    java.io.File var12 = var9.getDestinationFolder();
    minicopier.TransferTask var14 = new minicopier.TransferTask(var0, var9, true);
    var14.setCancelAndQueue(false);
    boolean var17 = var14.getCancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test312");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    int var3 = var0.basketLength();
    var0.add2basket("\\hi!");
    long var6 = var0.getFileTotalSize();
    int var7 = var0.getTotalPercent();
    boolean var8 = var0.pause();
    minicopier.Copier var9 = new minicopier.Copier();
    var9.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var12 = new minicopier.FailedQueue(var9);
    long var13 = var9.getFileTotalSize();
    var9.forceStart();
    minicopier.FileToTransfer var17 = new minicopier.FileToTransfer("", "");
    var17.changeTargetName("");
    var17.changeTargetName("D");
    java.io.File var22 = var17.getDestinationFile();
    minicopier.TransferTask var24 = new minicopier.TransferTask(var9, var17, false);
    minicopier.TransferTask var26 = new minicopier.TransferTask(var0, var17, false);
    var0.increaseFileCurrentSize((-89L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test313");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.clearBasket();
    var0.forceStart();
    boolean var3 = var0.pause();
    boolean var6 = var0.nameIsAcceptable("CW", "A");
    var0.increaseQueueCurrentSize(1L);
    java.lang.String var9 = var0.getCurrentFileSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test314");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    java.lang.Object[] var23 = new java.lang.Object[] { var22};
    var10.addColumn((java.lang.Object)0.0d, var23);
    var10.setColumnCount(0);
    java.lang.String var28 = var10.getColumnName(100);
    java.lang.Class var30 = var10.getColumnClass(1);
    int var31 = var10.getColumnCount();
    var10.moveRow(3, 0, 3);
    var10.fireTableRowsInserted(2, 0);
    int var40 = var10.findColumn("");
    java.lang.Class var42 = var10.getColumnClass(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "CW"+ "'", var28.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test315");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    long var3 = var0.getQueueTotalSize();
    minicopier.MainQueue var4 = new minicopier.MainQueue(var0);
    var0.forceStart();
    var0.addURIString2basket("A");
    boolean var10 = var0.nameIsAcceptable("Source", "F");
    long var11 = var0.getTotalBytesRemaining();
    long var12 = var0.getTotalBytesRemaining();
    var0.decreaseQueueCurrentSize(0L);
    int var15 = var0.getCurrentPercent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test316");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var12 = new minicopier.Copier();
    var12.setFileCurrentSize(1L);
    var12.setFileCurrentSize(100L);
    int var17 = var12.getTotalPercent();
    java.lang.String var19 = var12.stringURI2StringPath("hi!");
    int var20 = var12.getTotalPercent();
    minicopier.MainQueue var21 = new minicopier.MainQueue(var12);
    javax.swing.table.DefaultTableModel var22 = var21.getTableModel();
    java.lang.Object[] var23 = new java.lang.Object[] { var22};
    var10.addColumn((java.lang.Object)0.0d, var23);
    var10.setColumnCount(0);
    java.lang.String var28 = var10.getColumnName(100);
    java.util.Vector var29 = var10.getDataVector();
    minicopier.Basket var30 = new minicopier.Basket();
    java.util.Iterator var31 = var30.getIterator();
    int var32 = var30.getLength();
    minicopier.Copier var33 = new minicopier.Copier();
    var33.setFileCurrentSize(1L);
    var33.setFileCurrentSize(100L);
    int var38 = var33.getTotalPercent();
    java.lang.String var40 = var33.stringURI2StringPath("hi!");
    int var41 = var33.getTotalPercent();
    minicopier.MainQueue var42 = new minicopier.MainQueue(var33);
    javax.swing.table.DefaultTableModel var43 = var42.getTableModel();
    minicopier.Copier var44 = new minicopier.Copier();
    var44.setFileCurrentSize(1L);
    var44.setFileCurrentSize(100L);
    java.lang.Object[] var49 = new java.lang.Object[] { 100L};
    var43.addRow(var49);
    var43.setNumRows(0);
    var43.fireTableDataChanged();
    var43.fireTableStructureChanged();
    var43.fireTableStructureChanged();
    java.lang.Class var57 = var43.getColumnClass(0);
    javax.swing.event.TableModelListener[] var58 = var43.getTableModelListeners();
    var10.addColumn((java.lang.Object)var30, (java.lang.Object[])var58);
    var30.add("\\");
    java.util.Iterator var62 = var30.getIterator();
    var30.add("hi!\\A");
    java.util.Iterator var65 = var30.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "CW"+ "'", var28.equals("CW"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test317");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(0L);
    long var8 = var0.readAndInitBytesCounter();
    boolean var9 = var0.getPause();
    var0.paste("CW");
    var0.addURIString2basket("K");
    minicopier.MainQueue var14 = new minicopier.MainQueue(var0);
    minicopier.Copier var15 = new minicopier.Copier();
    var15.setFileCurrentSize(1L);
    var15.setFileCurrentSize(100L);
    int var20 = var15.getTotalPercent();
    java.lang.String var22 = var15.stringURI2StringPath("hi!");
    int var23 = var15.getTotalPercent();
    minicopier.MainQueue var24 = new minicopier.MainQueue(var15);
    javax.swing.table.DefaultTableModel var25 = var24.getTableModel();
    var25.setColumnCount(0);
    int var29 = var25.findColumn("hi!\\");
    int var30 = var25.getRowCount();
    minicopier.Copier var31 = new minicopier.Copier();
    var31.setFileCurrentSize(1L);
    var31.setFileCurrentSize(100L);
    int var36 = var31.getTotalPercent();
    java.lang.String var38 = var31.stringURI2StringPath("hi!");
    int var39 = var31.getTotalPercent();
    minicopier.MainQueue var40 = new minicopier.MainQueue(var31);
    javax.swing.table.DefaultTableModel var41 = var40.getTableModel();
    minicopier.Copier var42 = new minicopier.Copier();
    var42.setFileCurrentSize(1L);
    var42.setFileCurrentSize(100L);
    java.lang.Object[] var47 = new java.lang.Object[] { 100L};
    var41.addRow(var47);
    var25.addRow(var47);
    java.lang.Class var51 = var25.getColumnClass(4);
    int var52 = var25.getColumnCount();
    javax.swing.event.TableModelListener[] var53 = var25.getTableModelListeners();
    minicopier.MainQueue.TransfersModel var55 = var14.new TransfersModel((java.lang.Object[])var53, 0);
    boolean var58 = var55.isCellEditable(11, 4);
    var55.fireTableRowsInserted(11, 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test318");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    java.lang.String var5 = var0.getCurrentFileSource();
    var0.decreaseQueueCurrentSize(10L);
    var0.unpause();
    boolean var11 = var0.nameIsAcceptable("CW", "hi!\\D");
    long var12 = var0.getFileTotalSize();
    var0.increaseFileCurrentSize(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test319");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    java.lang.String var4 = var0.stringURI2StringPath("hi!");
    minicopier.FailedQueue var5 = new minicopier.FailedQueue(var0);
    javax.swing.table.DefaultTableModel var6 = var5.getTableModel();
    javax.swing.table.DefaultTableModel var7 = var5.getTableModel();
    javax.swing.event.TableModelListener[] var8 = var7.getTableModelListeners();
    minicopier.Copier var9 = new minicopier.Copier();
    var9.setFileCurrentSize(1L);
    var9.setFileCurrentSize(100L);
    int var14 = var9.getTotalPercent();
    java.lang.String var16 = var9.stringURI2StringPath("hi!");
    int var17 = var9.getTotalPercent();
    minicopier.MainQueue var18 = new minicopier.MainQueue(var9);
    javax.swing.table.DefaultTableModel var19 = var18.getTableModel();
    var19.fireTableRowsInserted(1, 0);
    var19.setNumRows(10);
    java.lang.String var26 = var19.getColumnName(10);
    javax.swing.event.TableModelListener[] var27 = var19.getTableModelListeners();
    var7.addRow((java.lang.Object[])var27);
    java.lang.Class var30 = var7.getColumnClass(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "K"+ "'", var26.equals("K"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test320");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    java.lang.String var4 = var0.stringURI2StringPath("hi!");
    minicopier.FailedQueue var5 = new minicopier.FailedQueue(var0);
    javax.swing.table.DefaultTableModel var6 = var5.getTableModel();
    javax.swing.table.DefaultTableModel var7 = var5.getTableModel();
    java.lang.String var9 = var7.getColumnName((-1));
    int var11 = var7.findColumn("\\D");
    minicopier.Copier var12 = new minicopier.Copier();
    var12.increaseFileCurrentSize((-1L));
    var12.add2basket("");
    var12.setFileCurrentSize(10L);
    minicopier.FileToTransfer var21 = new minicopier.FileToTransfer("", "");
    var21.changeTargetName("");
    java.io.File var24 = var21.getDestinationFile();
    java.io.File var25 = var21.getSourceFile();
    boolean var26 = minicopier.Copier.isNotLink(var25);
    var12.addFolder2Queue(var25, "hi!\\");
    var12.increaseFileCurrentSize(10L);
    boolean var33 = var12.nameIsAcceptable("CW", "hi!");
    var12.unpause();
    boolean var37 = var12.nameIsAcceptable("CW\\A", "C");
    var12.unpause();
    boolean var41 = var12.nameIsAcceptable("C", "hi!\\hi!\\");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setValueAt((java.lang.Object)var41, 9, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test321");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    long var4 = var0.getFileTotalSize();
    minicopier.Copier var5 = new minicopier.Copier();
    var5.clearBasket();
    long var7 = var5.readAndInitBytesCounter();
    long var8 = var5.readAndInitBytesCounter();
    var5.increaseFileCurrentSize(100L);
    boolean var13 = var5.nameIsAcceptable("", "CW");
    minicopier.FileToTransfer var16 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var17 = var16.getName();
    java.lang.String var18 = var16.getDestinationFilePath();
    minicopier.TransferTask var20 = new minicopier.TransferTask(var5, var16, false);
    long var21 = var16.getSize();
    java.lang.String var22 = var16.getDestinationFilePath();
    var16.changeTargetName("hi!\\");
    java.lang.String var25 = var16.getName();
    java.lang.String var26 = var16.getName();
    minicopier.TransferTask var28 = new minicopier.TransferTask(var0, var16, true);
    java.io.File var29 = var16.getSourceFile();
    long var30 = var16.getSize();
    var16.changeTargetName("F");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!\\"+ "'", var18.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!\\"+ "'", var22.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0L);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test322");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    var0.increaseFileCurrentSize(0L);
    long var8 = var0.readAndInitBytesCounter();
    boolean var9 = var0.getPause();
    var0.paste("CW");
    var0.addURIString2basket("K");
    minicopier.MainQueue var14 = new minicopier.MainQueue(var0);
    var0.setFileCurrentSize(100L);
    var0.setFileCurrentSize((-9L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test323");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "");
    java.io.File var3 = var2.getDestinationFolder();
    java.lang.String var4 = var2.getDestinationFolderPath();
    java.io.File var5 = var2.getDestinationFolder();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFolder();
    java.io.File var8 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test324");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var3 = new minicopier.FailedQueue(var0);
    boolean var4 = var3.isEmpty();
    int[] var5 = new int[] { };
    int[] var6 = var3.remove(var5);
    minicopier.Copier var7 = new minicopier.Copier();
    var7.setFileCurrentSize(1L);
    var7.setFileCurrentSize(100L);
    java.lang.String var12 = var7.getCurrentFileSource();
    minicopier.MainQueue var13 = new minicopier.MainQueue(var7);
    minicopier.Copier var14 = new minicopier.Copier();
    var14.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var17 = new minicopier.FailedQueue(var14);
    boolean var18 = var17.isEmpty();
    int[] var19 = new int[] { };
    int[] var20 = var17.remove(var19);
    int[] var21 = var13.remove(var19);
    int[] var22 = var3.remove(var19);
    javax.swing.table.DefaultTableModel var23 = var3.getTableModel();
    minicopier.Copier var24 = new minicopier.Copier();
    var24.clearBasket();
    long var26 = var24.readAndInitBytesCounter();
    long var27 = var24.readAndInitBytesCounter();
    var24.unpause();
    minicopier.MainQueue var29 = new minicopier.MainQueue(var24);
    minicopier.Copier var30 = new minicopier.Copier();
    var30.setFileCurrentSize(1L);
    var30.setFileCurrentSize(100L);
    int var35 = var30.getTotalPercent();
    java.lang.String var37 = var30.stringURI2StringPath("hi!");
    int var38 = var30.getTotalPercent();
    minicopier.MainQueue var39 = new minicopier.MainQueue(var30);
    javax.swing.table.DefaultTableModel var40 = var39.getTableModel();
    minicopier.Copier var41 = new minicopier.Copier();
    var41.setFileCurrentSize(1L);
    var41.setFileCurrentSize(100L);
    java.lang.Object[] var46 = new java.lang.Object[] { 100L};
    var40.addRow(var46);
    minicopier.MainQueue.TransfersModel var49 = var29.new TransfersModel(var46, 1);
    var23.addRow(var46);
    var23.fireTableRowsDeleted((-1), (-1));
    int var54 = var23.getColumnCount();
    var23.fireTableRowsDeleted(4, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 3);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test325");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var11 = new minicopier.Copier();
    var11.setFileCurrentSize(1L);
    var11.setFileCurrentSize(100L);
    java.lang.Object[] var16 = new java.lang.Object[] { 100L};
    var10.addRow(var16);
    var10.setNumRows(0);
    var10.fireTableDataChanged();
    var10.fireTableStructureChanged();
    java.lang.Class var23 = var10.getColumnClass(0);
    var10.setColumnCount(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var28 = var10.getValueAt(100, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test326");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    var10.setColumnCount(0);
    int var14 = var10.findColumn("hi!\\");
    minicopier.Copier var15 = new minicopier.Copier();
    var15.setFileCurrentSize(1L);
    var15.setFileCurrentSize(100L);
    int var20 = var15.getTotalPercent();
    java.lang.String var22 = var15.stringURI2StringPath("hi!");
    int var23 = var15.getTotalPercent();
    minicopier.MainQueue var24 = new minicopier.MainQueue(var15);
    javax.swing.table.DefaultTableModel var25 = var24.getTableModel();
    var25.fireTableRowsInserted(1, 0);
    var25.fireTableDataChanged();
    var25.setNumRows(1);
    java.util.Vector var32 = var25.getDataVector();
    var10.addRow(var32);
    var10.fireTableDataChanged();
    var10.fireTableCellUpdated(1, 2);
    var10.setRowCount(99);
    var10.fireTableStructureChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test327");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.increaseFileCurrentSize((-1L));
    var0.add2basket("");
    var0.decreaseQueueCurrentSize(10L);
    java.lang.String var8 = var0.stringURI2StringPath("");
    boolean var9 = var0.pause();
    int var10 = var0.basketLength();
    var0.increaseFileCurrentSize(1L);
    int var13 = var0.getTotalPercent();
    long var14 = var0.readAndInitBytesCounter();
    minicopier.MainQueue var15 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var16 = var15.getTableModel();
    javax.swing.table.DefaultTableModel var17 = var15.getTableModel();
    minicopier.Copier var18 = new minicopier.Copier();
    var18.setFileCurrentSize(1L);
    java.lang.String var22 = var18.stringURI2StringPath("hi!");
    boolean var23 = var18.getPause();
    java.lang.String var25 = var18.stringURI2StringPath("hi!");
    minicopier.FailedQueue var26 = new minicopier.FailedQueue(var18);
    minicopier.Copier var27 = new minicopier.Copier();
    var27.setFileCurrentSize(1L);
    var27.setFileCurrentSize(100L);
    boolean var32 = var27.getPause();
    minicopier.FailedQueue var33 = new minicopier.FailedQueue(var27);
    java.lang.String var34 = var27.getCurrentFileDestination();
    minicopier.Copier var35 = new minicopier.Copier();
    var35.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var38 = new minicopier.FailedQueue(var35);
    minicopier.FileToTransfer var41 = new minicopier.FileToTransfer("", "hi!");
    var38.addFile(var41);
    java.lang.String var43 = var41.getDestinationFilePath();
    java.io.File var44 = var41.getDestinationFolder();
    java.lang.String var45 = var41.getSourcePath();
    minicopier.TransferTask var47 = new minicopier.TransferTask(var27, var41, false);
    var41.changeTargetName("A");
    minicopier.TransferTask var51 = new minicopier.TransferTask(var18, var41, false);
    minicopier.MainQueue var52 = new minicopier.MainQueue(var18);
    boolean var53 = var52.isEmpty();
    minicopier.Copier var54 = new minicopier.Copier();
    var54.setFileCurrentSize(1L);
    var54.setFileCurrentSize(100L);
    java.lang.String var59 = var54.getCurrentFileSource();
    minicopier.MainQueue var60 = new minicopier.MainQueue(var54);
    minicopier.Copier var61 = new minicopier.Copier();
    var61.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var64 = new minicopier.FailedQueue(var61);
    boolean var65 = var64.isEmpty();
    int[] var66 = new int[] { };
    int[] var67 = var64.remove(var66);
    int[] var68 = var60.remove(var66);
    minicopier.Copier var69 = new minicopier.Copier();
    var69.setFileCurrentSize(1L);
    var69.setFileCurrentSize(100L);
    int var74 = var69.getTotalPercent();
    java.lang.String var76 = var69.stringURI2StringPath("hi!");
    int var77 = var69.getTotalPercent();
    minicopier.MainQueue var78 = new minicopier.MainQueue(var69);
    boolean var79 = var78.isEmpty();
    boolean var80 = var78.isEmpty();
    minicopier.Copier var81 = new minicopier.Copier();
    var81.setFileCurrentSize(1L);
    var81.setFileCurrentSize(100L);
    java.lang.String var86 = var81.getCurrentFileSource();
    minicopier.MainQueue var87 = new minicopier.MainQueue(var81);
    minicopier.Copier var88 = new minicopier.Copier();
    var88.increaseFileCurrentSize((-1L));
    minicopier.FailedQueue var91 = new minicopier.FailedQueue(var88);
    boolean var92 = var91.isEmpty();
    int[] var93 = new int[] { };
    int[] var94 = var91.remove(var93);
    int[] var95 = var87.remove(var93);
    int[] var96 = var78.putLast(var93);
    int[] var97 = var60.remove(var93);
    int[] var98 = var52.putLast(var93);
    int[] var99 = var15.putLast(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!\\"+ "'", var43.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "hi!"+ "'", var76.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + ""+ "'", var86.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test328");


    minicopier.Copier var0 = new minicopier.Copier();
    var0.setFileCurrentSize(1L);
    var0.setFileCurrentSize(100L);
    int var5 = var0.getTotalPercent();
    java.lang.String var7 = var0.stringURI2StringPath("hi!");
    int var8 = var0.getTotalPercent();
    minicopier.MainQueue var9 = new minicopier.MainQueue(var0);
    javax.swing.table.DefaultTableModel var10 = var9.getTableModel();
    minicopier.Copier var11 = new minicopier.Copier();
    var11.setFileCurrentSize(1L);
    var11.setFileCurrentSize(100L);
    java.lang.Object[] var16 = new java.lang.Object[] { 100L};
    var10.addRow(var16);
    var10.setNumRows(0);
    var10.setColumnCount(10);
    java.lang.String var23 = var10.getColumnName(4);
    minicopier.Copier var24 = new minicopier.Copier();
    var24.increaseFileCurrentSize((-1L));
    int var27 = var24.basketLength();
    long var28 = var24.getFileTotalSize();
    minicopier.FileToTransfer var31 = new minicopier.FileToTransfer("", "");
    java.io.File var32 = var31.getDestinationFolder();
    var24.addFolder2Queue(var32, "hi!");
    minicopier.Copier var35 = new minicopier.Copier();
    var35.increaseFileCurrentSize((-1L));
    int var38 = var35.basketLength();
    long var39 = var35.getFileTotalSize();
    minicopier.FileToTransfer var42 = new minicopier.FileToTransfer("", "");
    java.io.File var43 = var42.getDestinationFolder();
    var35.addFolder2Queue(var43, "hi!");
    var24.addFolder2Queue(var43, "");
    minicopier.FileToTransfer var50 = new minicopier.FileToTransfer("", "");
    java.io.File var51 = var50.getDestinationFolder();
    java.lang.String var52 = var50.getDestinationFolderPath();
    java.io.File var53 = var50.getDestinationFolder();
    var24.addFolder2Queue(var53, "hi!");
    minicopier.FileToTransfer var58 = new minicopier.FileToTransfer("CW", "");
    minicopier.TransferTask var60 = new minicopier.TransferTask(var24, var58, true);
    long var61 = var58.getSize();
    var10.addColumn((java.lang.Object)var58);
    var10.fireTableStructureChanged();
    var10.fireTableRowsInserted(3, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "E"+ "'", var23.equals("E"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0L);

  }

}
