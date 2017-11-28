package randoop;

import junit.framework.*;

public class RandoopTest20 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test1");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getDestinationFilePath();
    long var4 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test2");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getSourcePath();
    long var8 = var2.getSize();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getSourceFile();
    var2.changeTargetName("\\hi!\\hi!\\");
    java.io.File var13 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test3");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    boolean var3 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!");
    int var8 = var0.getLength();
    var0.add("\\hi!\\\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test4");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    int var3 = var0.getLength();
    boolean var4 = var0.isEmpty();
    var0.add("\\");
    java.util.Iterator var7 = var0.getIterator();
    boolean var8 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test5");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getSourceFile();
    var2.changeTargetName("\\hi!\\hi!");
    java.lang.String var9 = var2.getDestinationFilePath();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.lang.String var11 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\\\hi!\\hi!\\\\hi!");
    java.lang.String var14 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\\\hi!\\hi!"+ "'", var9.equals("hi!\\\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\\\hi!\\hi!"+ "'", var10.equals("hi!\\\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test6");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var15 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test7");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getName();
    java.lang.String var7 = var2.getDestinationFolderPath();
    long var8 = var2.getSize();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test8");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    long var4 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test9");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\");
    long var3 = var2.getSize();
    long var4 = var2.getSize();
    java.io.File var5 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test10");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\", "hi!\\");

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test11");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getSourceFile();
    java.io.File var6 = var2.getDestinationFile();
    java.io.File var7 = var2.getDestinationFolder();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!");
    java.io.File var12 = var2.getSourceFile();
    long var13 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test12");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\\\hi!", "hi!\\\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test13");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\", "\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test14");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getSourcePath();
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.io.File var13 = var2.getSourceFile();
    java.io.File var14 = var2.getDestinationFile();
    java.io.File var15 = var2.getDestinationFolder();
    java.lang.String var16 = var2.getSourcePath();
    long var17 = var2.getSize();
    java.lang.String var18 = var2.getSourcePath();
    java.lang.String var19 = var2.getSourcePath();
    java.lang.String var20 = var2.getSourcePath();
    java.io.File var21 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test15");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getSourceFile();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.io.File var12 = var2.getSourceFile();
    java.io.File var13 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!\\\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test16");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getName();
    var2.changeTargetName("\\hi!");
    java.lang.String var9 = var2.getDestinationFolderPath();
    long var10 = var2.getSize();
    long var11 = var2.getSize();
    java.io.File var12 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test17");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getSourcePath();
    java.io.File var8 = var2.getDestinationFile();
    java.io.File var9 = var2.getDestinationFolder();
    boolean var10 = minicopier.Copier.isNotLink(var9);
    boolean var11 = minicopier.Copier.isNotLink(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test18");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.io.File var11 = var2.getSourceFile();
    java.lang.String var12 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.io.File var15 = var2.getDestinationFile();
    var2.changeTargetName("\\");
    long var18 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test19");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "\\\\hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test20");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    int var6 = var0.getLength();
    var0.add("hi!\\hi!");
    int var9 = var0.getLength();
    boolean var10 = var0.isEmpty();
    boolean var11 = var0.isEmpty();
    int var12 = var0.getLength();
    java.util.Iterator var13 = var0.getIterator();
    java.util.Iterator var14 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test21");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    java.util.Iterator var3 = var0.getIterator();
    int var4 = var0.getLength();
    int var5 = var0.getLength();
    var0.add("hi!\\hi!\\");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!");
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test22");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "");
    var2.changeTargetName("hi!\\\\hi!");
    java.lang.String var5 = var2.getSourcePath();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\\hi!\\hi!"+ "'", var5.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\\hi!\\hi!"+ "'", var6.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test23");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    java.util.Iterator var7 = var0.getIterator();
    int var8 = var0.getLength();
    boolean var9 = var0.isEmpty();
    var0.add("hi!");
    boolean var12 = var0.isEmpty();
    var0.add("\\hi!");
    boolean var15 = var0.isEmpty();
    java.util.Iterator var16 = var0.getIterator();
    boolean var17 = var0.isEmpty();
    var0.add("hi!\\\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test24");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test25");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\\\hi!\\hi!\\hi!\\", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test26");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    var2.changeTargetName("");
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getSourcePath();
    java.lang.String var13 = var2.getDestinationFolderPath();
    java.lang.String var14 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\"+ "'", var14.equals("hi!\\"));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test27");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    boolean var12 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test28");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getName();
    long var10 = var2.getSize();
    java.io.File var11 = var2.getDestinationFile();
    long var12 = var2.getSize();
    java.io.File var13 = var2.getDestinationFolder();
    java.io.File var14 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test29");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    long var7 = var2.getSize();
    java.io.File var8 = var2.getSourceFile();
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.lang.String var11 = var2.getDestinationFolderPath();
    long var12 = var2.getSize();
    java.lang.String var13 = var2.getSourcePath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test30");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!");
    int var10 = var0.getLength();
    java.util.Iterator var11 = var0.getIterator();
    boolean var12 = var0.isEmpty();
    boolean var13 = var0.isEmpty();
    var0.add("\\hi!\\\\hi!\\hi!");
    java.util.Iterator var16 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test31");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\\\hi!", "hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\\\hi!\\hi!\\hi!");
    java.lang.String var7 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test32");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var12 = var0.wasFirstLaunch();
    boolean var13 = var0.wasFirstLaunch();
    boolean var14 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var17 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test33");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!");
    var0.add("hi!\\");
    var0.add("\\hi!");
    var0.add("hi!\\hi!\\hi!\\");
    int var12 = var0.getLength();
    java.util.Iterator var13 = var0.getIterator();
    java.util.Iterator var14 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test34");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getDestinationFile();
    boolean var9 = minicopier.Copier.isNotLink(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test35");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test36");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    var0.add("hi!");
    var0.add("hi!\\");
    var0.add("hi!");
    var0.add("hi!\\\\\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test37");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.lang.String var6 = var2.getSourcePath();
    java.io.File var7 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test38");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\\\hi!\\hi!\\\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test39");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    var0.add("");
    var0.add("");
    int var14 = var0.getLength();
    var0.add("\\hi!");
    boolean var17 = var0.isEmpty();
    java.util.Iterator var18 = var0.getIterator();
    var0.add("\\\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test40");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    java.io.File var3 = var2.getDestinationFolder();
    long var4 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test41");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getDestinationFolderPath();
    long var9 = var2.getSize();
    long var10 = var2.getSize();
    java.io.File var11 = var2.getDestinationFolder();
    boolean var12 = minicopier.Copier.isNotLink(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test42");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFolder();
    java.lang.String var4 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test43");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("");
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getDestinationFilePath();
    java.io.File var13 = var2.getSourceFile();
    var2.changeTargetName("hi!\\\\hi!\\hi!");
    var2.changeTargetName("\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\"+ "'", var12.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test44");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test45");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    java.util.Iterator var3 = var0.getIterator();
    int var4 = var0.getLength();
    int var5 = var0.getLength();
    int var6 = var0.getLength();
    int var7 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test46");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\");
    var0.add("");
    int var8 = var0.getLength();
    java.util.Iterator var9 = var0.getIterator();
    int var10 = var0.getLength();
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test47");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    int var7 = var0.getLength();
    var0.add("hi!\\\\hi!\\hi!");
    int var10 = var0.getLength();
    var0.add("hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test48");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.io.File var6 = var2.getDestinationFile();
    var2.changeTargetName("");
    java.lang.String var9 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\\\hi!\\hi!");
    java.lang.String var12 = var2.getDestinationFilePath();
    java.lang.String var13 = var2.getSourcePath();
    java.lang.String var14 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\"+ "'", var9.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!\\\\hi!\\hi!"+ "'", var12.equals("hi!\\hi!\\\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!\\\\hi!\\hi!"+ "'", var14.equals("hi!\\hi!\\\\hi!\\hi!"));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test49");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    boolean var5 = minicopier.Copier.isNotLink(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test50");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getSourceFile();
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test51");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFolder();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var5.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test52");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    java.util.Iterator var7 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var10 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test53");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getName();
    var2.changeTargetName("hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test54");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    var2.changeTargetName("hi!");
    java.io.File var12 = var2.getSourceFile();
    java.lang.String var13 = var2.getDestinationFolderPath();
    java.io.File var14 = var2.getDestinationFolder();
    boolean var15 = minicopier.Copier.isNotLink(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test55");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    java.util.Iterator var4 = var0.getIterator();
    boolean var5 = var0.isEmpty();
    boolean var6 = var0.isEmpty();
    var0.add("hi!\\hi!\\\\hi!\\hi!");
    java.util.Iterator var9 = var0.getIterator();
    java.util.Iterator var10 = var0.getIterator();
    var0.add("\\\\hi!\\hi!\\hi!\\hi!");
    boolean var13 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test56");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!\\hi!\\");
    var2.changeTargetName("hi!\\hi!\\hi!\\");
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!"+ "'", var3.equals("\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test57");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test58");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test59");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getDestinationFolder();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test60");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\\\hi!\\hi!");
    long var9 = var2.getSize();
    long var10 = var2.getSize();
    java.io.File var11 = var2.getSourceFile();
    java.lang.String var12 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\\hi!\\hi!"+ "'", var5.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\\hi!\\hi!"+ "'", var6.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test61");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    var0.add("");
    var0.add("hi!\\hi!\\\\hi!\\hi!");
    java.util.Iterator var8 = var0.getIterator();
    boolean var9 = var0.isEmpty();
    var0.add("\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test62");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test63");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    var0.add("");
    var0.add("");
    int var14 = var0.getLength();
    int var15 = var0.getLength();
    java.util.Iterator var16 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test64");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.lang.String var6 = var2.getName();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getName();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getDestinationFolder();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.lang.String var13 = var2.getDestinationFolderPath();
    java.io.File var14 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test65");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    var2.changeTargetName("\\hi!");
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getDestinationFolder();
    boolean var12 = minicopier.Copier.isNotLink(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test66");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.io.File var9 = var2.getDestinationFile();
    java.io.File var10 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var13 = var2.getDestinationFile();
    java.lang.String var14 = var2.getDestinationFilePath();
    java.io.File var15 = var2.getDestinationFile();
    java.io.File var16 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var14.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test67");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "\\\\hi!\\hi!\\hi!\\hi!");

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test68");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getSourcePath();
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.io.File var13 = var2.getSourceFile();
    java.lang.String var14 = var2.getSourcePath();
    java.lang.String var15 = var2.getSourcePath();
    java.lang.String var16 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var19 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test69");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.io.File var11 = var2.getSourceFile();
    java.lang.String var12 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test70");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = minicopier.i18n.Language.get("\\\\hi!\\hi!\\hi!\\hi!\\hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test71");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    boolean var12 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var14 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test72");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFolder();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getDestinationFolderPath();
    var2.changeTargetName("\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test73");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    int var8 = var0.getLength();
    int var9 = var0.getLength();
    boolean var10 = var0.isEmpty();
    var0.add("hi!\\hi!\\");
    var0.add("\\hi!\\hi!");
    boolean var15 = var0.isEmpty();
    var0.add("hi!\\\\\\hi!");
    int var18 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 4);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test74");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    java.util.Iterator var7 = var0.getIterator();
    int var8 = var0.getLength();
    java.util.Iterator var9 = var0.getIterator();
    boolean var10 = var0.isEmpty();
    int var11 = var0.getLength();
    boolean var12 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test75");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!");
    var0.add("hi!\\");
    var0.add("\\hi!\\hi!\\hi!");
    int var10 = var0.getLength();
    int var11 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test76");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var10 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test77");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    var2.changeTargetName("\\hi!");
    var2.changeTargetName("\\hi!\\hi!");
    long var8 = var2.getSize();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.io.File var10 = var2.getSourceFile();
    long var11 = var2.getSize();
    long var12 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\\\hi!\\hi!"+ "'", var9.equals("hi!\\\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test78");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = minicopier.i18n.Language.get("\\hi!\\\\hi!\\hi!\\hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test79");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getSourcePath();
    long var7 = var2.getSize();
    java.io.File var8 = var2.getDestinationFile();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.lang.String var11 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test80");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getName();
    java.lang.String var12 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test81");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getName();
    java.io.File var5 = var2.getSourceFile();
    var2.changeTargetName("hi!\\\\hi!");
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.lang.String var10 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test82");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    boolean var9 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var12 = var0.wasFirstLaunch();
    boolean var13 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var15 = var0.wasFirstLaunch();
    boolean var16 = var0.wasFirstLaunch();
    boolean var17 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var20 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test83");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    int var7 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var10 = var0.getIterator();
    var0.add("hi!\\hi!");
    boolean var13 = var0.isEmpty();
    int var14 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 4);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test84");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.io.File var11 = var2.getDestinationFolder();
    java.io.File var12 = var2.getDestinationFolder();
    java.lang.String var13 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!"+ "'", var13.equals("hi!\\hi!"));

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test85");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test86");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    boolean var8 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var13 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test87");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    var2.changeTargetName("");
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getDestinationFile();
    java.lang.String var11 = var2.getSourcePath();
    java.lang.String var12 = var2.getName();
    java.lang.String var13 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!"+ "'", var13.equals("hi!\\hi!"));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test88");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.io.File var9 = var2.getDestinationFile();
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getDestinationFolder();
    boolean var12 = minicopier.Copier.isNotLink(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test89");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\hi!");
    boolean var11 = var0.isEmpty();
    java.util.Iterator var12 = var0.getIterator();
    int var13 = var0.getLength();
    boolean var14 = var0.isEmpty();
    var0.add("hi!\\hi!\\\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    boolean var19 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    int var22 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 6);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test90");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    java.util.Iterator var3 = var0.getIterator();
    int var4 = var0.getLength();
    int var5 = var0.getLength();
    boolean var6 = var0.isEmpty();
    var0.add("\\hi!\\hi!");
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    java.util.Iterator var11 = var0.getIterator();
    var0.add("\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test91");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.io.File var11 = var2.getDestinationFolder();
    java.io.File var12 = var2.getSourceFile();
    java.io.File var13 = var2.getDestinationFolder();
    java.lang.String var14 = var2.getDestinationFilePath();
    java.io.File var15 = var2.getDestinationFolder();
    java.io.File var16 = var2.getDestinationFolder();
    java.lang.String var17 = var2.getSourcePath();
    java.io.File var18 = var2.getDestinationFolder();
    java.io.File var19 = var2.getDestinationFile();
    java.lang.String var20 = var2.getSourcePath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!\\hi!"+ "'", var10.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!\\hi!"+ "'", var14.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test92");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.lang.String var4 = var2.getSourcePath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!"));

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test93");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!\\hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getName();
    java.lang.String var5 = var2.getName();
    long var6 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test94");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getDestinationFolderPath();
    java.io.File var5 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test95");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getName();
    java.lang.String var12 = var2.getName();
    java.io.File var13 = var2.getSourceFile();
    java.io.File var14 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test96");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\\\hi!\\hi!", "\\hi!\\");
    java.io.File var3 = var2.getDestinationFile();
    java.lang.String var4 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\hi!\\hi!"+ "'", var4.equals("\\hi!\\hi!"));

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test97");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\");

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test98");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\", "\\hi!\\");

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test99");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.lang.String var12 = var2.getDestinationFolderPath();
    var2.changeTargetName("");
    long var15 = var2.getSize();
    java.io.File var16 = var2.getDestinationFile();
    java.io.File var17 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!\\hi!"+ "'", var11.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test100");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    java.util.Iterator var7 = var0.getIterator();
    var0.add("\\hi!\\hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!");
    boolean var12 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test101");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    boolean var12 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var14 = var0.wasFirstLaunch();
    boolean var15 = var0.wasFirstLaunch();
    boolean var16 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test102");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var14 = var0.wasFirstLaunch();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test103");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    long var4 = var2.getSize();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.lang.String var9 = var2.getName();
    java.lang.String var10 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test104");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFolder();
    long var8 = var2.getSize();
    java.io.File var9 = var2.getDestinationFile();
    boolean var10 = minicopier.Copier.isNotLink(var9);
    boolean var11 = minicopier.Copier.isNotLink(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test105");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\\\", "\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test106");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\\\hi!", "hi!\\");

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test107");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    boolean var8 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    boolean var12 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test108");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var13 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var15 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var17 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test109");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\\\hi!\\hi!\\hi!\\");
    java.io.File var3 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test110");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getSourcePath();
    long var5 = var2.getSize();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.io.File var12 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test111");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.io.File var12 = var2.getSourceFile();
    java.io.File var13 = var2.getDestinationFile();
    java.io.File var14 = var2.getDestinationFile();
    java.lang.String var15 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var11.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test112");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!\\\\hi!\\hi!\\\\hi!");
    var2.changeTargetName("\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var6.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!"+ "'", var7.equals("hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!"));

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test113");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    boolean var9 = var0.isEmpty();
    int var10 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test114");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.io.File var12 = var2.getSourceFile();
    java.io.File var13 = var2.getDestinationFolder();
    long var14 = var2.getSize();
    java.lang.String var15 = var2.getSourcePath();
    java.io.File var16 = var2.getDestinationFolder();
    boolean var17 = minicopier.Copier.isNotLink(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test115");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!");
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getDestinationFolderPath();
    long var11 = var2.getSize();
    java.io.File var12 = var2.getDestinationFolder();
    long var13 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test116");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getSourceFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test117");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.io.File var6 = var2.getDestinationFile();
    var2.changeTargetName("");
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFile();
    java.io.File var11 = var2.getDestinationFolder();
    java.io.File var12 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test118");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFolder();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getName();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.io.File var12 = var2.getDestinationFolder();
    boolean var13 = minicopier.Copier.isNotLink(var12);
    boolean var14 = minicopier.Copier.isNotLink(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test119");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    int var6 = var0.getLength();
    var0.add("");
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    int var11 = var0.getLength();
    int var12 = var0.getLength();
    int var13 = var0.getLength();
    boolean var14 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test120");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    int var8 = var0.getLength();
    int var9 = var0.getLength();
    java.util.Iterator var10 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.util.Iterator var13 = var0.getIterator();
    int var14 = var0.getLength();
    int var15 = var0.getLength();
    var0.add("hi!\\\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 3);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test121");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    long var10 = var2.getSize();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test122");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\hi!");
    int var6 = var0.getLength();
    boolean var7 = var0.isEmpty();
    java.util.Iterator var8 = var0.getIterator();
    var0.add("\\\\hi!\\hi!\\hi!\\hi!");
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test123");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test124");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getSourcePath();
    long var5 = var2.getSize();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\hi!\\hi!");
    var2.changeTargetName("hi!");
    java.lang.String var13 = var2.getDestinationFolderPath();
    java.io.File var14 = var2.getSourceFile();
    boolean var15 = minicopier.Copier.isNotLink(var14);
    boolean var16 = minicopier.Copier.isNotLink(var14);
    boolean var17 = minicopier.Copier.isNotLink(var14);
    boolean var18 = minicopier.Copier.isNotLink(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test125");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getName();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.io.File var9 = var2.getDestinationFile();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test126");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFolderPath();
    long var12 = var2.getSize();
    java.lang.String var13 = var2.getDestinationFilePath();
    java.io.File var14 = var2.getSourceFile();
    java.lang.String var15 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\\\hi!");
    java.io.File var18 = var2.getDestinationFolder();
    java.lang.String var19 = var2.getDestinationFolderPath();
    java.io.File var20 = var2.getDestinationFile();
    java.lang.String var21 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!"+ "'", var13.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test127");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!");
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFile();
    long var11 = var2.getSize();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test128");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var7 = var0.wasFirstLaunch();
    boolean var8 = var0.wasFirstLaunch();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var13 = var0.wasFirstLaunch();
    boolean var14 = var0.wasFirstLaunch();
    boolean var15 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test129");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\", "hi!\\hi!\\hi!\\hi!\\");
    java.io.File var3 = var2.getDestinationFolder();
    long var4 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 32768L);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test130");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.io.File var10 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test131");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\");
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getName();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.io.File var10 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!\\"+ "'", var6.equals("hi!\\hi!\\hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test132");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    var2.changeTargetName("");
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getSourcePath();
    java.io.File var13 = var2.getSourceFile();
    java.lang.String var14 = var2.getDestinationFilePath();
    java.io.File var15 = var2.getDestinationFile();
    java.lang.String var16 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\"+ "'", var14.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test133");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\\\hi!\\hi!\\hi!", "\\hi!\\\\hi!");

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test134");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getDestinationFilePath();
    var2.changeTargetName("\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!\\hi!"+ "'", var10.equals("hi!\\hi!\\hi!"));

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test135");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test136");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getSourceFile();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getName();
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getSourcePath();
    java.io.File var13 = var2.getDestinationFile();
    boolean var14 = minicopier.Copier.isNotLink(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test137");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.io.File var11 = var2.getSourceFile();
    java.io.File var12 = var2.getDestinationFolder();
    var2.changeTargetName("\\hi!\\hi!");
    var2.changeTargetName("\\hi!\\hi!\\\\hi!");
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.lang.String var19 = var2.getDestinationFilePath();
    java.io.File var20 = var2.getSourceFile();
    java.io.File var21 = var2.getSourceFile();
    java.io.File var22 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!"+ "'", var19.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test138");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.lang.String var12 = var2.getDestinationFolderPath();
    var2.changeTargetName("");
    long var15 = var2.getSize();
    java.lang.String var16 = var2.getDestinationFilePath();
    long var17 = var2.getSize();
    java.lang.String var18 = var2.getSourcePath();
    java.lang.String var19 = var2.getSourcePath();
    java.lang.String var20 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!\\hi!"+ "'", var11.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!\\"+ "'", var16.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test139");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\hi!");
    java.util.Iterator var6 = var0.getIterator();
    var0.add("");
    var0.add("hi!\\hi!\\hi!");
    boolean var11 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.util.Iterator var14 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test140");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\\\hi!\\hi!\\hi!\\\\hi!\\hi!", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test141");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.lang.String var8 = var2.getSourcePath();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getSourcePath();
    long var11 = var2.getSize();
    java.io.File var12 = var2.getSourceFile();
    java.lang.String var13 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test142");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    java.util.Iterator var4 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    var0.add("hi!");
    java.util.Iterator var12 = var0.getIterator();
    int var13 = var0.getLength();
    var0.add("hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!\\\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test143");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getSourcePath();
    java.lang.String var8 = var2.getName();
    java.io.File var9 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test144");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    var0.add("hi!\\");
    boolean var9 = var0.isEmpty();
    java.util.Iterator var10 = var0.getIterator();
    int var11 = var0.getLength();
    java.util.Iterator var12 = var0.getIterator();
    java.util.Iterator var13 = var0.getIterator();
    boolean var14 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test145");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.io.File var10 = var2.getSourceFile();
    java.lang.String var11 = var2.getDestinationFolderPath();
    java.lang.String var12 = var2.getSourcePath();
    java.lang.String var13 = var2.getName();
    java.io.File var14 = var2.getSourceFile();
    java.io.File var15 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test146");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!", "hi!\\\\hi!");
    var2.changeTargetName("\\hi!\\hi!");
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    java.io.File var7 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test147");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getSourcePath();
    java.lang.String var8 = var2.getName();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.io.File var11 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test148");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getSourceFile();
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.io.File var11 = var2.getDestinationFolder();
    java.lang.String var12 = var2.getName();
    java.lang.String var13 = var2.getDestinationFolderPath();
    java.lang.String var14 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test149");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    java.util.Iterator var3 = var0.getIterator();
    int var4 = var0.getLength();
    int var5 = var0.getLength();
    boolean var6 = var0.isEmpty();
    var0.add("\\hi!\\hi!");
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    boolean var11 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test150");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\");
    java.io.File var3 = var2.getDestinationFile();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getDestinationFile();
    java.io.File var10 = var2.getDestinationFolder();
    boolean var11 = minicopier.Copier.isNotLink(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test151");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("hi!\\hi!");
    int var5 = var0.getLength();
    var0.add("hi!\\hi!");
    int var8 = var0.getLength();
    java.util.Iterator var9 = var0.getIterator();
    java.util.Iterator var10 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test152");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var13 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test153");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    var0.add("hi!\\hi!");
    int var6 = var0.getLength();
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    boolean var10 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    boolean var13 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test154");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    boolean var12 = var0.wasFirstLaunch();
    boolean var13 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var15 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test155");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.lang.String var5 = var2.getSourcePath();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getSourcePath();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test156");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    boolean var7 = var0.isEmpty();
    int var8 = var0.getLength();
    var0.add("hi!\\\\hi!\\hi!\\hi!");
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test157");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    int var5 = var0.getLength();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\hi!");
    var0.add("hi!\\\\\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test158");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getSourceFile();
    boolean var9 = minicopier.Copier.isNotLink(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test159");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    var0.add("hi!\\hi!");
    boolean var8 = var0.isEmpty();
    int var9 = var0.getLength();
    int var10 = var0.getLength();
    java.util.Iterator var11 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test160");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("hi!\\hi!");
    int var5 = var0.getLength();
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    int var8 = var0.getLength();
    java.util.Iterator var9 = var0.getIterator();
    var0.add("hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test161");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\", "\\hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getSourcePath();
    var2.changeTargetName("\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test162");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "");
    java.lang.String var3 = var2.getName();
    long var4 = var2.getSize();
    long var5 = var2.getSize();
    java.io.File var6 = var2.getSourceFile();
    boolean var7 = minicopier.Copier.isNotLink(var6);
    boolean var8 = minicopier.Copier.isNotLink(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test163");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!");
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFile();
    java.io.File var11 = var2.getDestinationFile();
    java.io.File var12 = var2.getDestinationFile();
    java.lang.String var13 = var2.getDestinationFolderPath();
    java.lang.String var14 = var2.getSourcePath();
    java.io.File var15 = var2.getDestinationFolder();
    java.io.File var16 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test164");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getSourcePath();
    long var7 = var2.getSize();
    java.io.File var8 = var2.getDestinationFile();
    java.io.File var9 = var2.getDestinationFile();
    java.io.File var10 = var2.getDestinationFile();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\");
    java.io.File var13 = var2.getSourceFile();
    java.lang.String var14 = var2.getDestinationFolderPath();
    long var15 = var2.getSize();
    java.lang.String var16 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test165");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getSourcePath();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getSourcePath();
    java.io.File var8 = var2.getDestinationFolder();
    long var9 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test166");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\\\hi!\\hi!\\\\hi!");
    long var3 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test167");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getSourceFile();
    var2.changeTargetName("hi!\\");
    java.io.File var7 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test168");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getSourcePath();
    var2.changeTargetName("\\\\hi!\\hi!\\hi!\\hi!");
    var2.changeTargetName("hi!\\\\hi!\\hi!\\hi!");
    long var11 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\hi!\\hi!\\hi!"+ "'", var4.equals("\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\\hi!\\hi!"+ "'", var6.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test169");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    java.util.Iterator var3 = var0.getIterator();
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test170");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getSourceFile();
    var2.changeTargetName("hi!\\\\hi!");
    java.io.File var12 = var2.getDestinationFile();
    java.lang.String var13 = var2.getName();
    java.lang.String var14 = var2.getDestinationFolderPath();
    java.lang.String var15 = var2.getDestinationFolderPath();
    java.io.File var16 = var2.getDestinationFolder();
    java.lang.String var17 = var2.getName();
    java.lang.String var18 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test171");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getSourcePath();
    java.lang.String var13 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!"+ "'", var13.equals("hi!\\hi!"));

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test172");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    long var4 = var2.getSize();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test173");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var13 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var16 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test174");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    java.util.Iterator var10 = var0.getIterator();
    boolean var11 = var0.isEmpty();
    boolean var12 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\");
    int var15 = var0.getLength();
    java.util.Iterator var16 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test175");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    java.util.Iterator var10 = var0.getIterator();
    boolean var11 = var0.isEmpty();
    int var12 = var0.getLength();
    int var13 = var0.getLength();
    var0.add("hi!\\");
    boolean var16 = var0.isEmpty();
    boolean var17 = var0.isEmpty();
    boolean var18 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    boolean var21 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test176");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getDestinationFolderPath();
    var2.changeTargetName("\\");
    java.io.File var13 = var2.getDestinationFolder();
    java.io.File var14 = var2.getSourceFile();
    java.lang.String var15 = var2.getName();
    java.lang.String var16 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test177");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getName();
    long var11 = var2.getSize();
    java.io.File var12 = var2.getDestinationFile();
    boolean var13 = minicopier.Copier.isNotLink(var12);
    boolean var14 = minicopier.Copier.isNotLink(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test178");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    boolean var3 = var0.isEmpty();
    java.util.Iterator var4 = var0.getIterator();
    boolean var5 = var0.isEmpty();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    var0.add("hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test179");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getName();
    var2.changeTargetName("\\hi!");
    java.lang.String var9 = var2.getDestinationFolderPath();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getSourcePath();
    java.io.File var12 = var2.getSourceFile();
    java.lang.String var13 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\\\hi!"+ "'", var13.equals("hi!\\\\hi!"));

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test180");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    java.util.Iterator var7 = var0.getIterator();
    var0.add("hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    boolean var12 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test181");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!\\hi!\\\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test182");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getName();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.io.File var10 = var2.getDestinationFile();
    java.lang.String var11 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test183");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    java.util.Iterator var10 = var0.getIterator();
    boolean var11 = var0.isEmpty();
    int var12 = var0.getLength();
    int var13 = var0.getLength();
    var0.add("hi!\\");
    var0.add("hi!\\");
    java.util.Iterator var18 = var0.getIterator();
    java.util.Iterator var19 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
    var0.add("hi!\\\\hi!\\hi!\\hi!\\");
    boolean var24 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test184");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\\\hi!\\hi!", "hi!\\hi!\\\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    java.io.File var4 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test185");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\");
    java.io.File var3 = var2.getDestinationFile();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    long var9 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test186");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    var0.add("hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test187");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!");
    long var9 = var2.getSize();
    java.io.File var10 = var2.getSourceFile();
    java.io.File var11 = var2.getDestinationFile();
    java.io.File var12 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test188");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    var0.add("hi!\\hi!");
    boolean var8 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!");
    boolean var11 = var0.isEmpty();
    boolean var12 = var0.isEmpty();
    var0.add("\\hi!");
    java.util.Iterator var15 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test189");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getName();
    var2.changeTargetName("\\hi!");
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.io.File var10 = var2.getDestinationFile();
    boolean var11 = minicopier.Copier.isNotLink(var10);
    boolean var12 = minicopier.Copier.isNotLink(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test190");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\\\hi!\\hi!", "");

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test191");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    long var4 = var2.getSize();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getName();
    java.io.File var8 = var2.getDestinationFile();
    boolean var9 = minicopier.Copier.isNotLink(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test192");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\hi!");
    boolean var11 = var0.isEmpty();
    boolean var12 = var0.isEmpty();
    int var13 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test193");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getName();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getDestinationFilePath();
    long var7 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test194");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!");
    int var10 = var0.getLength();
    int var11 = var0.getLength();
    var0.add("\\hi!\\\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test195");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFilePath();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test196");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    long var4 = var2.getSize();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getName();
    java.lang.String var7 = var2.getDestinationFilePath();
    long var8 = var2.getSize();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getName();
    java.lang.String var11 = var2.getName();
    java.io.File var12 = var2.getDestinationFile();
    java.lang.String var13 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!"+ "'", var13.equals("hi!\\hi!"));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test197");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\\\hi!\\hi!", "\\hi!\\hi!\\hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!"));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test198");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    java.util.Iterator var3 = var0.getIterator();
    boolean var4 = var0.isEmpty();
    java.util.Iterator var5 = var0.getIterator();
    var0.add("\\hi!\\hi!\\hi!\\");
    int var8 = var0.getLength();
    int var9 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test199");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    int var10 = var0.getLength();
    int var11 = var0.getLength();
    boolean var12 = var0.isEmpty();
    var0.add("hi!\\hi!\\\\hi!");
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\");
    boolean var17 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test200");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getName();
    java.lang.String var7 = var2.getDestinationFolderPath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    long var10 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test201");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    var2.changeTargetName("");
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getSourcePath();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var12 = var2.getDestinationFolder();
    long var13 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test202");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    java.util.Iterator var10 = var0.getIterator();
    boolean var11 = var0.isEmpty();
    int var12 = var0.getLength();
    int var13 = var0.getLength();
    var0.add("hi!\\");
    var0.add("hi!\\");
    int var18 = var0.getLength();
    var0.add("\\hi!\\hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test203");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.io.File var11 = var2.getDestinationFolder();
    java.lang.String var12 = var2.getDestinationFolderPath();
    java.lang.String var13 = var2.getSourcePath();
    java.lang.String var14 = var2.getName();
    java.io.File var15 = var2.getDestinationFolder();
    java.lang.String var16 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!\\hi!"+ "'", var10.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test204");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var10 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test205");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getSourcePath();
    long var5 = var2.getSize();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getSourceFile();
    java.lang.String var12 = var2.getDestinationFilePath();
    java.lang.String var13 = var2.getDestinationFilePath();
    java.io.File var14 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!"+ "'", var13.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test206");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getSourceFile();
    java.io.File var6 = var2.getDestinationFile();
    java.io.File var7 = var2.getDestinationFolder();
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("");
    java.lang.String var11 = var2.getName();
    java.lang.String var12 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\"+ "'", var12.equals("hi!\\"));

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test207");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!\\");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getSourcePath();
    java.lang.String var6 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test208");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.io.File var12 = var2.getSourceFile();
    java.io.File var13 = var2.getDestinationFolder();
    java.lang.String var14 = var2.getDestinationFolderPath();
    java.io.File var15 = var2.getDestinationFolder();
    java.lang.String var16 = var2.getSourcePath();
    long var17 = var2.getSize();
    java.lang.String var18 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test209");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    var0.add("hi!\\hi!");
    int var6 = var0.getLength();
    var0.add("");
    int var9 = var0.getLength();
    var0.add("hi!\\hi!\\\\hi!\\hi!");
    var0.add("hi!\\hi!\\\\hi!\\hi!\\\\hi!");
    int var14 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test210");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    boolean var3 = var0.isEmpty();
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test211");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getName();
    var2.changeTargetName("");
    long var10 = var2.getSize();
    java.io.File var11 = var2.getDestinationFolder();
    java.lang.String var12 = var2.getDestinationFolderPath();
    java.io.File var13 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test212");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    java.util.Iterator var10 = var0.getIterator();
    boolean var11 = var0.isEmpty();
    int var12 = var0.getLength();
    int var13 = var0.getLength();
    var0.add("hi!\\");
    var0.add("hi!\\hi!\\hi!");
    int var18 = var0.getLength();
    java.util.Iterator var19 = var0.getIterator();
    java.util.Iterator var20 = var0.getIterator();
    java.util.Iterator var21 = var0.getIterator();
    java.util.Iterator var22 = var0.getIterator();
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test213");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    java.util.Iterator var10 = var0.getIterator();
    boolean var11 = var0.isEmpty();
    int var12 = var0.getLength();
    boolean var13 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!");
    boolean var16 = var0.isEmpty();
    var0.add("\\hi!\\hi!");
    int var19 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 5);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test214");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var13 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var15 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var19 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var21 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test215");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getSourceFile();
    java.io.File var11 = var2.getSourceFile();
    java.lang.String var12 = var2.getSourcePath();
    java.lang.String var13 = var2.getName();
    java.lang.String var14 = var2.getDestinationFolderPath();
    java.lang.String var15 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!\\hi!\\hi!"+ "'", var15.equals("hi!\\hi!\\hi!"));

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test216");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var14 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test217");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\\\hi!\\hi!\\hi!");
    java.io.File var14 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test218");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("\\hi!");
    java.io.File var14 = var2.getSourceFile();
    java.io.File var15 = var2.getDestinationFile();
    java.lang.String var16 = var2.getName();
    java.lang.String var17 = var2.getDestinationFilePath();
    java.io.File var18 = var2.getSourceFile();
    java.lang.String var19 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!\\\\hi!"+ "'", var17.equals("hi!\\\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test219");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.lang.String var5 = var2.getSourcePath();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getSourcePath();
    java.io.File var8 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test220");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.io.File var11 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.lang.String var14 = var2.getDestinationFilePath();
    java.io.File var15 = var2.getDestinationFolder();
    java.io.File var16 = var2.getSourceFile();
    java.lang.String var17 = var2.getDestinationFolderPath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.lang.String var20 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!\\hi!"+ "'", var10.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var14.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test221");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.lang.String var3 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test222");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    java.util.Iterator var4 = var0.getIterator();
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    var0.add("\\");
    java.util.Iterator var9 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test223");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!", "\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFolder();
    java.lang.String var4 = var2.getSourcePath();
    long var5 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\hi!"+ "'", var4.equals("\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test224");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.lang.String var12 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\");
    java.io.File var15 = var2.getDestinationFile();
    java.lang.String var16 = var2.getDestinationFolderPath();
    java.lang.String var17 = var2.getSourcePath();
    java.lang.String var18 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test225");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getName();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getSourceFile();
    java.lang.String var11 = var2.getSourcePath();
    java.io.File var12 = var2.getSourceFile();
    long var13 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test226");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getName();
    java.io.File var13 = var2.getSourceFile();
    java.lang.String var14 = var2.getSourcePath();
    long var15 = var2.getSize();
    var2.changeTargetName("hi!\\");
    java.io.File var18 = var2.getDestinationFile();
    var2.changeTargetName("");
    java.lang.String var21 = var2.getName();
    java.lang.String var22 = var2.getDestinationFolderPath();
    long var23 = var2.getSize();
    java.io.File var24 = var2.getDestinationFile();
    java.lang.String var25 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test227");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getSourceFile();
    java.io.File var11 = var2.getDestinationFolder();
    java.lang.String var12 = var2.getSourcePath();
    java.lang.String var13 = var2.getDestinationFilePath();
    java.io.File var14 = var2.getSourceFile();
    var2.changeTargetName("hi!\\\\\\hi!");
    java.lang.String var17 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!"+ "'", var13.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test228");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    int var10 = var0.getLength();
    int var11 = var0.getLength();
    boolean var12 = var0.isEmpty();
    boolean var13 = var0.isEmpty();
    var0.add("hi!\\\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test229");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\\\hi!\\hi!", "hi!\\\\\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test230");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("hi!\\hi!");
    int var5 = var0.getLength();
    var0.add("hi!\\hi!\\hi!");
    int var8 = var0.getLength();
    int var9 = var0.getLength();
    java.util.Iterator var10 = var0.getIterator();
    java.util.Iterator var11 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    int var14 = var0.getLength();
    java.util.Iterator var15 = var0.getIterator();
    int var16 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 4);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test231");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\");
    java.io.File var3 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test232");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getSourcePath();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getDestinationFilePath();
    long var7 = var2.getSize();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!");
    java.lang.String var10 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var10.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test233");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    boolean var3 = var0.isEmpty();
    java.util.Iterator var4 = var0.getIterator();
    boolean var5 = var0.isEmpty();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\hi!");
    java.util.Iterator var10 = var0.getIterator();
    int var11 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test234");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\hi!", "hi!\\\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.io.File var4 = var2.getSourceFile();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var6.equals("hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test235");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.io.File var6 = var2.getDestinationFile();
    var2.changeTargetName("");
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test236");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test237");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!", "\\\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test238");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\", "\\hi!\\");
    java.lang.String var3 = var2.getSourcePath();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test239");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    int var6 = var0.getLength();
    var0.add("hi!\\hi!");
    int var9 = var0.getLength();
    boolean var10 = var0.isEmpty();
    boolean var11 = var0.isEmpty();
    int var12 = var0.getLength();
    java.util.Iterator var13 = var0.getIterator();
    int var14 = var0.getLength();
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    boolean var17 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test240");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    int var8 = var0.getLength();
    int var9 = var0.getLength();
    boolean var10 = var0.isEmpty();
    boolean var11 = var0.isEmpty();
    int var12 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test241");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getSourcePath();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getName();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.lang.String var10 = var2.getName();
    java.io.File var11 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test242");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("\\hi!");
    java.io.File var11 = var2.getSourceFile();
    java.io.File var12 = var2.getSourceFile();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var15 = var2.getDestinationFolder();
    boolean var16 = minicopier.Copier.isNotLink(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test243");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getSourcePath();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.io.File var10 = var2.getDestinationFile();
    java.lang.String var11 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test244");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var11 = var0.wasFirstLaunch();
    boolean var12 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test245");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getSourceFile();
    long var8 = var2.getSize();
    java.io.File var9 = var2.getSourceFile();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test246");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFile();
    java.lang.String var11 = var2.getDestinationFolderPath();
    long var12 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test247");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "\\hi!\\hi!\\hi!\\\\\\hi!\\hi!\\\\hi!");

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test248");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var7 = var0.wasFirstLaunch();
    boolean var8 = var0.wasFirstLaunch();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test249");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\", "hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    java.lang.String var4 = var2.getSourcePath();
    java.io.File var5 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\"+ "'", var4.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test250");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    long var8 = var2.getSize();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test251");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var4 = var0.wasFirstLaunch();
    boolean var5 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test252");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.io.File var11 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.lang.String var14 = var2.getDestinationFilePath();
    java.lang.String var15 = var2.getDestinationFilePath();
    java.io.File var16 = var2.getSourceFile();
    var2.changeTargetName("\\hi!\\hi!");
    var2.changeTargetName("hi!\\\\hi!\\hi!\\hi!\\");
    java.io.File var21 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!\\hi!"+ "'", var10.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var14.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var15.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test253");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    long var10 = var2.getSize();
    var2.changeTargetName("hi!\\\\hi!\\hi!");
    java.lang.String var13 = var2.getName();
    java.io.File var14 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test254");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.io.File var12 = var2.getSourceFile();
    java.io.File var13 = var2.getDestinationFolder();
    java.lang.String var14 = var2.getDestinationFolderPath();
    java.io.File var15 = var2.getSourceFile();
    java.io.File var16 = var2.getSourceFile();
    java.lang.String var17 = var2.getDestinationFolderPath();
    java.lang.String var18 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test255");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!\\hi!");
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test256");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\hi!\\", "hi!\\hi!\\\\hi!\\hi!\\hi!\\");

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test257");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test258");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\", "\\hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getSourcePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test259");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.lang.String var12 = var2.getDestinationFolderPath();
    var2.changeTargetName("");
    java.io.File var15 = var2.getDestinationFolder();
    java.io.File var16 = var2.getSourceFile();
    java.lang.String var17 = var2.getName();
    java.lang.String var18 = var2.getDestinationFolderPath();
    java.lang.String var19 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!\\hi!"+ "'", var11.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!\\"+ "'", var19.equals("hi!\\"));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test260");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFile();
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getDestinationFilePath();
    long var11 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test261");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\");
    java.util.Iterator var11 = var0.getIterator();
    boolean var12 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test262");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getName();
    java.io.File var13 = var2.getSourceFile();
    java.lang.String var14 = var2.getSourcePath();
    long var15 = var2.getSize();
    var2.changeTargetName("hi!\\");
    java.io.File var18 = var2.getDestinationFile();
    var2.changeTargetName("");
    java.lang.String var21 = var2.getDestinationFolderPath();
    java.lang.String var22 = var2.getDestinationFolderPath();
    long var23 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0L);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test263");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    var0.add("hi!\\");
    int var12 = var0.getLength();
    int var13 = var0.getLength();
    var0.add("hi!\\hi!\\");
    int var16 = var0.getLength();
    boolean var17 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test264");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getSourcePath();
    long var8 = var2.getSize();
    java.io.File var9 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test265");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    var0.add("hi!\\hi!");
    boolean var8 = var0.isEmpty();
    int var9 = var0.getLength();
    var0.add("hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!");
    java.util.Iterator var14 = var0.getIterator();
    java.util.Iterator var15 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test266");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test267");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    var0.add("hi!\\");
    boolean var12 = var0.isEmpty();
    var0.add("hi!\\");
    int var15 = var0.getLength();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 4);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test268");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    java.util.Iterator var10 = var0.getIterator();
    boolean var11 = var0.isEmpty();
    int var12 = var0.getLength();
    boolean var13 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test269");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getSourcePath();
    long var5 = var2.getSize();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getSourcePath();
    var2.changeTargetName("\\hi!\\hi!\\hi!");
    java.io.File var13 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test270");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\");
    java.lang.String var3 = var2.getName();
    long var4 = var2.getSize();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!"+ "'", var6.equals("hi!\\hi!\\hi!"));

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test271");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test272");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getName();
    var2.changeTargetName("\\hi!\\hi!");
    java.lang.String var12 = var2.getDestinationFolderPath();
    java.lang.String var13 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test273");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    java.util.Iterator var11 = var0.getIterator();
    boolean var12 = var0.isEmpty();
    boolean var13 = var0.isEmpty();
    boolean var14 = var0.isEmpty();
    int var15 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test274");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test275");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    var2.changeTargetName("\\hi!");
    var2.changeTargetName("\\hi!\\hi!");
    long var8 = var2.getSize();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.io.File var10 = var2.getSourceFile();
    java.lang.String var11 = var2.getDestinationFolderPath();
    java.lang.String var12 = var2.getName();
    long var13 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\\\hi!\\hi!"+ "'", var9.equals("hi!\\\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test276");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!\\hi!");
    java.lang.String var3 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test277");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getName();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test278");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getSourcePath();
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.io.File var13 = var2.getSourceFile();
    java.io.File var14 = var2.getDestinationFile();
    java.io.File var15 = var2.getDestinationFolder();
    java.lang.String var16 = var2.getDestinationFilePath();
    java.lang.String var17 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\");
    var2.changeTargetName("hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var16.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var17.equals("hi!\\hi!\\hi!\\hi!"));

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test279");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var7 = var0.wasFirstLaunch();
    boolean var8 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var11 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test280");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getSourcePath();
    java.io.File var6 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!");
    var2.changeTargetName("hi!\\hi!\\");
    java.io.File var11 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test281");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getName();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getName();
    java.lang.String var10 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test282");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.lang.String var11 = var2.getName();
    java.io.File var12 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test283");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\hi!");
    java.util.Iterator var11 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\");
    boolean var14 = var0.isEmpty();
    var0.add("hi!\\\\hi!\\hi!");
    java.util.Iterator var17 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test284");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test285");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    int var6 = var0.getLength();
    int var7 = var0.getLength();
    boolean var8 = var0.isEmpty();
    java.util.Iterator var9 = var0.getIterator();
    int var10 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test286");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\\\\\hi!", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test287");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getName();
    java.io.File var13 = var2.getSourceFile();
    java.lang.String var14 = var2.getSourcePath();
    long var15 = var2.getSize();
    var2.changeTargetName("hi!\\");
    java.lang.String var18 = var2.getSourcePath();
    java.lang.String var19 = var2.getSourcePath();
    java.lang.String var20 = var2.getDestinationFolderPath();
    java.lang.String var21 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!\\hi!\\"+ "'", var21.equals("hi!\\hi!\\"));

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test288");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("\\hi!\\hi!");
    var0.add("\\hi!\\hi!\\\\hi!");
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    boolean var9 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test289");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.lang.String var4 = var2.getSourcePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test290");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    java.util.Iterator var3 = var0.getIterator();
    int var4 = var0.getLength();
    int var5 = var0.getLength();
    var0.add("hi!\\hi!\\");
    boolean var8 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\");
    int var11 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test291");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getName();
    long var10 = var2.getSize();
    var2.changeTargetName("\\hi!\\hi!\\hi!");
    java.io.File var13 = var2.getDestinationFolder();
    java.lang.String var14 = var2.getDestinationFilePath();
    java.io.File var15 = var2.getDestinationFile();
    java.io.File var16 = var2.getDestinationFile();
    java.lang.String var17 = var2.getDestinationFolderPath();
    java.io.File var18 = var2.getDestinationFile();
    java.io.File var19 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\\\hi!\\hi!\\hi!"+ "'", var14.equals("hi!\\\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test292");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    var2.changeTargetName("");
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\"+ "'", var10.equals("hi!\\"));

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test293");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getDestinationFolderPath();
    java.lang.String var13 = var2.getSourcePath();
    java.lang.String var14 = var2.getName();
    java.io.File var15 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test294");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!\\hi!");
    var0.add("\\hi!\\hi!");
    int var8 = var0.getLength();
    boolean var9 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\");
    boolean var12 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test295");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getName();
    java.io.File var8 = var2.getSourceFile();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFile();
    java.lang.String var11 = var2.getName();
    var2.changeTargetName("hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test296");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getDestinationFolder();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test297");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "\\hi!\\hi!\\hi!");
    var2.changeTargetName("\\\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test298");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.lang.String var12 = var2.getDestinationFilePath();
    long var13 = var2.getSize();
    java.lang.String var14 = var2.getSourcePath();
    java.lang.String var15 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test299");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!");
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getSourcePath();
    java.io.File var12 = var2.getDestinationFolder();
    long var13 = var2.getSize();
    java.lang.String var14 = var2.getDestinationFilePath();
    long var15 = var2.getSize();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!"+ "'", var14.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test300");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\\\hi!", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test301");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "");
    java.io.File var3 = var2.getSourceFile();
    java.lang.String var4 = var2.getDestinationFolderPath();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getDestinationFolder();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test302");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.io.File var7 = var2.getSourceFile();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getName();
    java.io.File var11 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test303");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getSourceFile();
    java.lang.String var11 = var2.getName();
    java.io.File var12 = var2.getDestinationFile();
    java.io.File var13 = var2.getDestinationFile();
    java.lang.String var14 = var2.getDestinationFolderPath();
    long var15 = var2.getSize();
    java.lang.String var16 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test304");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    boolean var8 = var0.isEmpty();
    java.util.Iterator var9 = var0.getIterator();
    var0.add("hi!\\hi!\\\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test305");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!", "\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getSourcePath();
    java.io.File var6 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var5.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test306");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\");
    java.io.File var3 = var2.getDestinationFile();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test307");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.io.File var4 = var2.getDestinationFolder();
    boolean var5 = minicopier.Copier.isNotLink(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test308");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!\\hi!");

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test309");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\hi!");
    boolean var11 = var0.isEmpty();
    java.util.Iterator var12 = var0.getIterator();
    int var13 = var0.getLength();
    boolean var14 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test310");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getSourcePath();
    java.lang.String var8 = var2.getName();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.io.File var11 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test311");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getName();
    java.io.File var13 = var2.getSourceFile();
    java.lang.String var14 = var2.getSourcePath();
    long var15 = var2.getSize();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var18 = var2.getName();
    java.lang.String var19 = var2.getDestinationFilePath();
    java.lang.String var20 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!\\hi!\\hi!"+ "'", var19.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test312");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\", "\\hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getSourcePath();
    var2.changeTargetName("\\");
    java.lang.String var9 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\hi!\\hi!"+ "'", var4.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "\\hi!\\\\"+ "'", var9.equals("\\hi!\\\\"));

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test313");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    java.util.Iterator var3 = var0.getIterator();
    var0.add("hi!\\hi!\\");
    int var6 = var0.getLength();
    var0.add("hi!\\");
    boolean var9 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test314");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!\\");
    int var3 = var0.getLength();
    java.util.Iterator var4 = var0.getIterator();
    var0.add("\\hi!\\\\hi!\\hi!\\\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    boolean var9 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test315");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getName();
    java.lang.String var11 = var2.getName();
    java.io.File var12 = var2.getSourceFile();
    java.lang.String var13 = var2.getDestinationFilePath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.io.File var16 = var2.getSourceFile();
    java.lang.String var17 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.io.File var20 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!"+ "'", var13.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test316");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!");
    boolean var6 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!");
    java.util.Iterator var9 = var0.getIterator();
    java.util.Iterator var10 = var0.getIterator();
    int var11 = var0.getLength();
    java.util.Iterator var12 = var0.getIterator();
    java.util.Iterator var13 = var0.getIterator();
    boolean var14 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test317");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getName();
    java.io.File var13 = var2.getSourceFile();
    java.lang.String var14 = var2.getSourcePath();
    long var15 = var2.getSize();
    var2.changeTargetName("hi!\\");
    java.io.File var18 = var2.getDestinationFile();
    java.lang.String var19 = var2.getDestinationFolderPath();
    java.lang.String var20 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test318");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "\\hi!");
    long var3 = var2.getSize();
    long var4 = var2.getSize();
    java.lang.String var5 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\\hi!\\hi!"+ "'", var5.equals("\\hi!\\hi!"));

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test319");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    boolean var4 = var0.isEmpty();
    java.util.Iterator var5 = var0.getIterator();
    var0.add("\\hi!\\hi!\\hi!\\");
    var0.add("hi!\\\\hi!\\hi!\\hi!\\");
    java.util.Iterator var10 = var0.getIterator();
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test320");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test321");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\");

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test322");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getSourceFile();
    java.io.File var11 = var2.getDestinationFolder();
    long var12 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test323");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "\\hi!");
    var2.changeTargetName("hi!");
    java.io.File var5 = var2.getDestinationFile();
    boolean var6 = minicopier.Copier.isNotLink(var5);
    boolean var7 = minicopier.Copier.isNotLink(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test324");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getSourceFile();
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getDestinationFilePath();
    java.io.File var13 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!\\hi!"+ "'", var12.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test325");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\\\hi!\\hi!\\hi!\\", "hi!\\hi!\\\\hi!\\\\hi!\\hi!");

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test326");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!", "\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    java.io.File var4 = var2.getSourceFile();
    boolean var5 = minicopier.Copier.isNotLink(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test327");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!");
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getDestinationFolderPath();
    long var11 = var2.getSize();
    java.io.File var12 = var2.getDestinationFolder();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var15 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test328");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFolder();
    java.lang.String var5 = var2.getSourcePath();
    java.io.File var6 = var2.getSourceFile();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getDestinationFolder();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getName();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.lang.String var12 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test329");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var13 = var0.wasFirstLaunch();
    boolean var14 = var0.wasFirstLaunch();
    boolean var15 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var18 = var0.wasFirstLaunch();
    boolean var19 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test330");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!\\hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!\\hi!\\");
    int var8 = var0.getLength();
    var0.add("\\\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\");
    boolean var13 = var0.isEmpty();
    int var14 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 4);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test331");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = minicopier.i18n.Language.get("\\hi!\\hi!\\hi!\\\\\\hi!\\hi!\\\\hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test332");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test333");


    minicopier.i18n.Language.init("hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test334");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.io.File var11 = var2.getDestinationFolder();
    var2.changeTargetName("\\hi!\\hi!");
    java.io.File var14 = var2.getSourceFile();
    long var15 = var2.getSize();
    java.lang.String var16 = var2.getName();
    java.io.File var17 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test335");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!\\\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    long var4 = var2.getSize();
    java.io.File var5 = var2.getSourceFile();
    java.io.File var6 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test336");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getName();
    var2.changeTargetName("");
    long var10 = var2.getSize();
    java.io.File var11 = var2.getDestinationFolder();
    java.lang.String var12 = var2.getDestinationFilePath();
    java.io.File var13 = var2.getDestinationFolder();
    java.io.File var14 = var2.getSourceFile();
    boolean var15 = minicopier.Copier.isNotLink(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\"+ "'", var12.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test337");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!\\");
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isEmpty();
    int var5 = var0.getLength();
    var0.add("hi!\\hi!\\hi!\\\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test338");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getName();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.io.File var12 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test339");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    java.io.File var9 = var2.getDestinationFile();
    java.io.File var10 = var2.getDestinationFile();
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getSourcePath();
    java.lang.String var13 = var2.getDestinationFilePath();
    java.lang.String var14 = var2.getSourcePath();
    java.lang.String var15 = var2.getName();
    java.lang.String var16 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!"+ "'", var13.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!\\hi!"+ "'", var16.equals("hi!\\hi!"));

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test340");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getName();
    java.io.File var5 = var2.getSourceFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test341");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    int var15 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test342");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    var2.changeTargetName("\\hi!");
    java.lang.String var7 = var2.getName();
    long var8 = var2.getSize();
    long var9 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test343");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\\\hi!", "hi!\\hi!\\\\hi!\\hi!");
    java.lang.String var3 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test344");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    int var7 = var0.getLength();
    int var8 = var0.getLength();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    int var11 = var0.getLength();
    boolean var12 = var0.isEmpty();
    java.util.Iterator var13 = var0.getIterator();
    java.util.Iterator var14 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test345");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!", "\\\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test346");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("hi!");
    java.lang.String var11 = var2.getName();
    java.io.File var12 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test347");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getSourcePath();
    var2.changeTargetName("\\hi!");
    java.lang.String var9 = var2.getSourcePath();
    var2.changeTargetName("\\hi!\\hi!\\hi!");
    java.lang.String var12 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\\\hi!\\hi!\\hi!"+ "'", var12.equals("hi!\\\\hi!\\hi!\\hi!"));

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test348");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFolder();
    var2.changeTargetName("");
    java.io.File var12 = var2.getDestinationFile();
    java.io.File var13 = var2.getDestinationFolder();
    var2.changeTargetName("\\hi!\\\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test349");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\\\hi!\\hi!\\\\hi!", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test350");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "\\hi!");
    java.io.File var3 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test351");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getDestinationFolderPath();
    var2.changeTargetName("\\\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test352");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test353");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    int var6 = var0.getLength();
    var0.add("hi!\\hi!");
    int var9 = var0.getLength();
    boolean var10 = var0.isEmpty();
    boolean var11 = var0.isEmpty();
    int var12 = var0.getLength();
    int var13 = var0.getLength();
    java.util.Iterator var14 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test354");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\", "hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    java.lang.String var4 = var2.getSourcePath();
    java.io.File var5 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\"+ "'", var4.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test355");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    java.util.Iterator var4 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
    int var7 = var0.getLength();
    var0.add("\\hi!\\hi!");
    boolean var10 = var0.isEmpty();
    java.util.Iterator var11 = var0.getIterator();
    boolean var12 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test356");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test357");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\hi!");
    var0.add("\\hi!\\");
    var0.add("hi!\\hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test358");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.lang.String var10 = var2.getSourcePath();
    long var11 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test359");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    java.io.File var9 = var2.getDestinationFile();
    java.io.File var10 = var2.getDestinationFile();
    java.lang.String var11 = var2.getSourcePath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test360");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    java.io.File var9 = var2.getDestinationFile();
    java.io.File var10 = var2.getDestinationFile();
    java.lang.String var11 = var2.getSourcePath();
    java.io.File var12 = var2.getDestinationFolder();
    java.io.File var13 = var2.getDestinationFolder();
    java.io.File var14 = var2.getDestinationFile();
    java.io.File var15 = var2.getDestinationFile();
    java.io.File var16 = var2.getDestinationFile();
    java.lang.String var17 = var2.getDestinationFolderPath();
    long var18 = var2.getSize();
    java.lang.String var19 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
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
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test361");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\hi!");
    int var6 = var0.getLength();
    java.util.Iterator var7 = var0.getIterator();
    boolean var8 = var0.isEmpty();
    boolean var9 = var0.isEmpty();
    int var10 = var0.getLength();
    var0.add("hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\\\hi!");
    int var15 = var0.getLength();
    var0.add("hi!\\hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 3);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test362");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    boolean var3 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\hi!");
    int var6 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test363");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "\\hi!\\hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.io.File var5 = var2.getSourceFile();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test364");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!", "\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    var2.changeTargetName("\\\\hi!\\hi!");
    java.io.File var6 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test365");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    var0.add("");
    var0.add("hi!\\hi!");
    var0.add("");
    var0.add("\\hi!\\hi!");
    java.util.Iterator var18 = var0.getIterator();
    int var19 = var0.getLength();
    int var20 = var0.getLength();
    int var21 = var0.getLength();
    boolean var22 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test366");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!\\hi!\\");
    var2.changeTargetName("hi!\\hi!\\");
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getName();
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!\\hi!"+ "'", var8.equals("hi!\\hi!\\hi!"));

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test367");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    java.util.Iterator var10 = var0.getIterator();
    boolean var11 = var0.isEmpty();
    int var12 = var0.getLength();
    boolean var13 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!");
    var0.add("hi!\\\\hi!");
    var0.add("");
    boolean var20 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test368");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getName();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getSourcePath();
    java.io.File var12 = var2.getDestinationFile();
    long var13 = var2.getSize();
    java.io.File var14 = var2.getSourceFile();
    java.lang.String var15 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test369");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test370");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.lang.String var11 = var2.getDestinationFolderPath();
    java.io.File var12 = var2.getSourceFile();
    java.lang.String var13 = var2.getSourcePath();
    java.io.File var14 = var2.getDestinationFile();
    java.io.File var15 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test371");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getName();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getSourcePath();
    java.lang.String var12 = var2.getDestinationFolderPath();
    java.lang.String var13 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test372");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getName();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test373");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\hi!");
    var0.add("\\hi!\\hi!");
    java.util.Iterator var13 = var0.getIterator();
    var0.add("\\hi!\\hi!\\\\hi!");
    int var16 = var0.getLength();
    java.util.Iterator var17 = var0.getIterator();
    boolean var18 = var0.isEmpty();
    java.util.Iterator var19 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test374");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\hi!");
    boolean var11 = var0.isEmpty();
    boolean var12 = var0.isEmpty();
    var0.add("hi!\\\\\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test375");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.io.File var12 = var2.getSourceFile();
    java.io.File var13 = var2.getDestinationFolder();
    java.io.File var14 = var2.getDestinationFolder();
    java.lang.String var15 = var2.getDestinationFolderPath();
    java.io.File var16 = var2.getDestinationFile();
    java.lang.String var17 = var2.getName();
    long var18 = var2.getSize();
    java.io.File var19 = var2.getDestinationFile();
    boolean var20 = minicopier.Copier.isNotLink(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test376");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\", "hi!\\hi!\\");
    var2.changeTargetName("hi!\\hi!");

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test377");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    var0.add("hi!");
    var0.add("hi!\\");
    var0.add("hi!\\hi!");
    java.util.Iterator var12 = var0.getIterator();
    java.util.Iterator var13 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test378");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!"));

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test379");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getSourcePath();
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getSourcePath();
    long var13 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test380");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.lang.String var5 = var2.getSourcePath();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var7.equals("hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test381");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "");
    var2.changeTargetName("hi!");
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getSourceFile();
    var2.changeTargetName("\\hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\\hi!"+ "'", var6.equals("\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test382");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!");
    int var10 = var0.getLength();
    int var11 = var0.getLength();
    boolean var12 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\hi!");
    var0.add("\\hi!\\hi!\\hi!\\hi!");
    int var17 = var0.getLength();
    boolean var18 = var0.isEmpty();
    boolean var19 = var0.isEmpty();
    java.util.Iterator var20 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test383");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    var2.changeTargetName("");
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getSourcePath();
    java.io.File var12 = var2.getDestinationFile();
    java.lang.String var13 = var2.getName();
    var2.changeTargetName("\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test384");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getName();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.io.File var10 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test385");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!", "hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test386");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var13 = var0.wasFirstLaunch();
    boolean var14 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var18 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test387");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var9 = var0.getIterator();
    java.util.Iterator var10 = var0.getIterator();
    var0.add("hi!\\hi!");
    var0.add("\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test388");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var15 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var18 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var21 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var23 = var0.wasFirstLaunch();
    boolean var24 = var0.wasFirstLaunch();
    boolean var25 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test389");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getName();
    java.lang.String var11 = var2.getSourcePath();
    java.lang.String var12 = var2.getSourcePath();
    long var13 = var2.getSize();
    java.lang.String var14 = var2.getSourcePath();
    java.io.File var15 = var2.getSourceFile();
    java.lang.String var16 = var2.getDestinationFolderPath();
    long var17 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test390");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\\\", "\\hi!\\hi!\\hi!\\");

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test391");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test392");


    minicopier.i18n.Language.init("\\\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test393");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\hi!");
    var0.add("\\hi!\\hi!\\\\hi!");
    int var8 = var0.getLength();
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test394");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "\\hi!\\hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test395");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!\\hi!");
    var0.add("hi!\\\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    int var9 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test396");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    var0.add("hi!\\");
    java.util.Iterator var7 = var0.getIterator();
    int var8 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test397");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\", "hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\");
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.io.File var9 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test398");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    long var4 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test399");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    boolean var7 = var0.isEmpty();
    int var8 = var0.getLength();
    var0.add("hi!\\hi!\\hi!");
    java.util.Iterator var11 = var0.getIterator();
    boolean var12 = var0.isEmpty();
    var0.add("hi!");
    int var15 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 4);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test400");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("");
    long var11 = var2.getSize();
    long var12 = var2.getSize();
    java.lang.String var13 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\\\hi!");
    java.lang.String var16 = var2.getDestinationFilePath();
    java.lang.String var17 = var2.getSourcePath();
    java.lang.String var18 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\"+ "'", var13.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!\\hi!\\\\hi!"+ "'", var16.equals("hi!\\hi!\\\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!\\hi!\\\\hi!"+ "'", var18.equals("hi!\\hi!\\\\hi!"));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test401");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.lang.String var3 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test402");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getSourceFile();
    java.io.File var5 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test403");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.io.File var11 = var2.getDestinationFolder();
    java.lang.String var12 = var2.getDestinationFolderPath();
    java.lang.String var13 = var2.getSourcePath();
    java.lang.String var14 = var2.getDestinationFilePath();
    long var15 = var2.getSize();
    java.io.File var16 = var2.getDestinationFile();
    java.io.File var17 = var2.getSourceFile();
    java.lang.String var18 = var2.getDestinationFolderPath();
    java.io.File var19 = var2.getDestinationFile();
    var2.changeTargetName("\\");
    java.io.File var22 = var2.getDestinationFolder();
    long var23 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!\\hi!"+ "'", var10.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!\\hi!"+ "'", var14.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0L);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test404");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!\\hi!\\\\hi!\\\\hi!\\hi!");
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.lang.String var5 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test405");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\\\hi!\\hi!\\hi!\\\\hi!\\hi!", "\\hi!\\hi!\\hi!");

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test406");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    int var10 = var0.getLength();
    int var11 = var0.getLength();
    boolean var12 = var0.isEmpty();
    int var13 = var0.getLength();
    int var14 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test407");


    minicopier.i18n.Language.init("hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test408");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "");

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test409");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var6.equals("hi!\\hi!\\hi!\\hi!"));

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test410");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var7 = var0.wasFirstLaunch();
    boolean var8 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test411");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.lang.String var6 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test412");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    var0.add("");
    var0.add("hi!\\hi!");
    var0.add("");
    java.util.Iterator var16 = var0.getIterator();
    int var17 = var0.getLength();
    int var18 = var0.getLength();
    java.util.Iterator var19 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test413");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var13 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var15 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test414");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    var2.changeTargetName("");
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var9 = var2.getDestinationFilePath();
    java.io.File var10 = var2.getSourceFile();
    java.lang.String var11 = var2.getSourcePath();
    java.io.File var12 = var2.getSourceFile();
    long var13 = var2.getSize();
    java.io.File var14 = var2.getDestinationFile();
    java.io.File var15 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!\\hi!"+ "'", var9.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test415");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test416");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\", "\\hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getName();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\hi!\\hi!"+ "'", var4.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\\hi!"+ "'", var6.equals("\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "\\hi!"+ "'", var9.equals("\\hi!"));

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test417");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    boolean var8 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    boolean var12 = var0.wasFirstLaunch();
    boolean var13 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test418");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.lang.String var4 = var2.getSourcePath();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test419");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test420");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFolder();
    var2.changeTargetName("");
    java.io.File var12 = var2.getSourceFile();
    long var13 = var2.getSize();
    java.lang.String var14 = var2.getName();
    java.io.File var15 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test421");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getSourceFile();
    java.lang.String var11 = var2.getName();
    java.io.File var12 = var2.getDestinationFile();
    java.io.File var13 = var2.getDestinationFile();
    java.lang.String var14 = var2.getDestinationFolderPath();
    java.lang.String var15 = var2.getName();
    java.lang.String var16 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test422");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getName();
    long var7 = var2.getSize();
    java.lang.String var8 = var2.getSourcePath();
    long var9 = var2.getSize();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.io.File var12 = var2.getSourceFile();
    java.lang.String var13 = var2.getDestinationFilePath();
    java.io.File var14 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!"+ "'", var13.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test423");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    boolean var5 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!");
    int var8 = var0.getLength();
    java.util.Iterator var9 = var0.getIterator();
    java.util.Iterator var10 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test424");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    int var5 = var0.getLength();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\");
    var0.add("\\hi!\\");
    int var13 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test425");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test426");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var13 = var0.wasFirstLaunch();
    boolean var14 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var16 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test427");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    boolean var5 = var0.isEmpty();
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test428");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getName();
    java.io.File var11 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test429");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "\\hi!\\");
    java.lang.String var3 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test430");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    var0.add("hi!\\hi!");
    boolean var8 = var0.isEmpty();
    java.util.Iterator var9 = var0.getIterator();
    int var10 = var0.getLength();
    boolean var11 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\");
    var0.add("hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test431");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    boolean var3 = var0.isEmpty();
    java.util.Iterator var4 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\hi!");
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test432");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test433");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    java.util.Iterator var10 = var0.getIterator();
    var0.add("hi!\\hi!\\\\hi!\\hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test434");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.io.File var4 = var2.getSourceFile();
    long var5 = var2.getSize();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test435");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    boolean var10 = var0.isEmpty();
    int var11 = var0.getLength();
    boolean var12 = var0.isEmpty();
    var0.add("hi!\\\\hi!\\hi!\\\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    java.util.Iterator var17 = var0.getIterator();
    java.util.Iterator var18 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test436");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    var0.add("hi!\\");
    boolean var12 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!");
    boolean var15 = var0.isEmpty();
    int var16 = var0.getLength();
    int var17 = var0.getLength();
    int var18 = var0.getLength();
    var0.add("hi!\\\\hi!\\hi!\\hi!");
    int var21 = var0.getLength();
    int var22 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 5);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test437");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "\\hi!");
    var2.changeTargetName("");
    java.lang.String var5 = var2.getName();
    long var6 = var2.getSize();
    long var7 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test438");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.lang.String var12 = var2.getDestinationFilePath();
    long var13 = var2.getSize();
    java.lang.String var14 = var2.getSourcePath();
    java.lang.String var15 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test439");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\");
    java.lang.String var6 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    java.lang.String var9 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!\\"+ "'", var6.equals("hi!\\hi!\\hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test440");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!", "hi!\\\\hi!\\hi!\\\\hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!"));

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test441");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test442");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getSourcePath();
    java.io.File var5 = var2.getDestinationFile();
    boolean var6 = minicopier.Copier.isNotLink(var5);
    boolean var7 = minicopier.Copier.isNotLink(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test443");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "\\hi!\\hi!");
    var2.changeTargetName("\\hi!");
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.lang.String var9 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\\hi!\\hi!\\\\hi!"+ "'", var6.equals("\\hi!\\hi!\\\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "\\hi!\\hi!\\\\hi!"+ "'", var8.equals("\\hi!\\hi!\\\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "\\hi!\\hi!\\\\hi!"+ "'", var9.equals("\\hi!\\hi!\\\\hi!"));

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test444");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var10 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var12 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var16 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test445");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\\\\\hi!");

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test446");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "\\");
    java.lang.String var3 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test447");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getSourcePath();
    java.io.File var4 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test448");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!\\hi!\\");
    var2.changeTargetName("hi!\\hi!\\hi!\\");
    java.lang.String var9 = var2.getSourcePath();
    long var10 = var2.getSize();
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getDestinationFilePath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!"+ "'", var3.equals("\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "\\hi!\\hi!\\hi!\\"+ "'", var12.equals("\\hi!\\hi!\\hi!\\"));

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test449");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    java.util.Iterator var10 = var0.getIterator();
    java.util.Iterator var11 = var0.getIterator();
    int var12 = var0.getLength();
    var0.add("hi!\\hi!\\");
    java.util.Iterator var15 = var0.getIterator();
    java.util.Iterator var16 = var0.getIterator();
    boolean var17 = var0.isEmpty();
    boolean var18 = var0.isEmpty();
    boolean var19 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test450");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.io.File var12 = var2.getSourceFile();
    java.io.File var13 = var2.getDestinationFile();
    java.io.File var14 = var2.getDestinationFile();
    java.io.File var15 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var11.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test451");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    var0.add("hi!\\");
    boolean var12 = var0.isEmpty();
    var0.add("hi!\\");
    int var15 = var0.getLength();
    int var16 = var0.getLength();
    boolean var17 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test452");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!", "\\");
    java.io.File var3 = var2.getDestinationFile();
    boolean var4 = minicopier.Copier.isNotLink(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test453");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFolder();
    long var8 = var2.getSize();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.lang.String var11 = var2.getName();
    java.lang.String var12 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test454");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getSourcePath();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test455");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    boolean var4 = var0.isEmpty();
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    java.util.Iterator var7 = var0.getIterator();
    boolean var8 = var0.isEmpty();
    var0.add("hi!\\\\hi!\\hi!\\\\hi!");
    int var11 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test456");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\\\\\hi!\\hi!\\\\hi!", "hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test457");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test458");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    java.util.Iterator var10 = var0.getIterator();
    java.util.Iterator var11 = var0.getIterator();
    int var12 = var0.getLength();
    java.util.Iterator var13 = var0.getIterator();
    boolean var14 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test459");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\\\hi!", "\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test460");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\");
    java.util.Iterator var11 = var0.getIterator();
    var0.add("hi!\\hi!");
    var0.add("\\hi!\\hi!");
    var0.add("\\hi!\\hi!\\hi!\\");
    java.util.Iterator var18 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test461");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.lang.String var5 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test462");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\");
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    int var8 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test463");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "hi!\\");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getDestinationFolderPath();
    java.io.File var5 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test464");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\\\hi!\\hi!\\hi!", "hi!\\\\\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test465");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!");
    var2.changeTargetName("hi!\\");
    java.io.File var16 = var2.getDestinationFolder();
    java.lang.String var17 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\");
    java.lang.String var20 = var2.getSourcePath();
    java.io.File var21 = var2.getDestinationFolder();
    java.io.File var22 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!\\hi!\\"+ "'", var17.equals("hi!\\hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test466");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\", "hi!\\hi!\\\\\\hi!");

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test467");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test468");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getSourcePath();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.io.File var10 = var2.getDestinationFolder();
    boolean var11 = minicopier.Copier.isNotLink(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test469");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getName();
    var2.changeTargetName("\\hi!");
    java.lang.String var9 = var2.getName();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test470");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getSourceFile();
    java.io.File var6 = var2.getDestinationFile();
    java.io.File var7 = var2.getDestinationFolder();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getName();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test471");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getName();
    long var7 = var2.getSize();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.io.File var9 = var2.getDestinationFile();
    java.io.File var10 = var2.getSourceFile();
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getDestinationFolderPath();
    java.lang.String var13 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test472");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("hi!\\hi!");
    int var5 = var0.getLength();
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    int var8 = var0.getLength();
    var0.add("hi!\\hi!\\hi!\\hi!");
    boolean var11 = var0.isEmpty();
    int var12 = var0.getLength();
    int var13 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test473");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getDestinationFilePath();
    long var10 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test474");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test475");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFolder();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!\\hi!\\");
    long var12 = var2.getSize();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test476");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test477");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "\\hi!\\hi!");
    java.lang.String var3 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.io.File var6 = var2.getSourceFile();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test478");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.io.File var9 = var2.getDestinationFile();
    java.io.File var10 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var13 = var2.getDestinationFile();
    java.lang.String var14 = var2.getDestinationFilePath();
    long var15 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var14.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test479");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFolderPath();
    java.lang.String var12 = var2.getSourcePath();
    java.lang.String var13 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test480");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    var0.add("\\hi!");
    boolean var11 = var0.isEmpty();
    java.util.Iterator var12 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    boolean var15 = var0.isEmpty();
    java.util.Iterator var16 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test481");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    int var6 = var0.getLength();
    var0.add("");
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    int var11 = var0.getLength();
    int var12 = var0.getLength();
    boolean var13 = var0.isEmpty();
    var0.add("\\hi!\\hi!");
    java.util.Iterator var16 = var0.getIterator();
    int var17 = var0.getLength();
    int var18 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 3);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test482");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.io.File var12 = var2.getSourceFile();
    java.io.File var13 = var2.getSourceFile();
    java.lang.String var14 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test483");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!\\hi!\\hi!");

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test484");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test485");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    int var8 = var0.getLength();
    int var9 = var0.getLength();
    java.util.Iterator var10 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.util.Iterator var13 = var0.getIterator();
    int var14 = var0.getLength();
    var0.add("\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test486");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var4 = var0.wasFirstLaunch();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var10 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var12 = var0.wasFirstLaunch();
    boolean var13 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test487");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    java.util.Iterator var10 = var0.getIterator();
    boolean var11 = var0.isEmpty();
    int var12 = var0.getLength();
    int var13 = var0.getLength();
    java.util.Iterator var14 = var0.getIterator();
    java.util.Iterator var15 = var0.getIterator();
    boolean var16 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test488");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\", "hi!\\hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.lang.String var4 = var2.getDestinationFilePath();
    long var5 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!\\"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 32768L);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test489");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!");
    var2.changeTargetName("\\hi!");
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!"+ "'", var6.equals("hi!\\hi!\\hi!"));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test490");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\\\hi!\\hi!\\hi!\\");

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test491");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\\\hi!\\hi!\\\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.lang.String var4 = var2.getName();
    java.io.File var5 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test492");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.lang.String var12 = var2.getSourcePath();
    java.io.File var13 = var2.getDestinationFile();
    long var14 = var2.getSize();
    java.io.File var15 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!\\hi!"+ "'", var11.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test493");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!"));

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test494");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test495");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\hi!", "\\\\hi!\\hi!\\\\hi!");

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test496");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.lang.String var11 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test497");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    var0.add("hi!");
    var0.add("hi!\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.util.Iterator var12 = var0.getIterator();
    boolean var13 = var0.isEmpty();
    java.util.Iterator var14 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test498");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    int var6 = var0.getLength();
    var0.add("");
    boolean var9 = var0.isEmpty();
    var0.add("");
    int var12 = var0.getLength();
    var0.add("hi!\\hi!\\hi!");
    java.util.Iterator var15 = var0.getIterator();
    boolean var16 = var0.isEmpty();
    var0.add("hi!");
    int var19 = var0.getLength();
    int var20 = var0.getLength();
    boolean var21 = var0.isEmpty();
    var0.add("hi!\\hi!\\\\hi!\\hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test499");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var11 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest20.test500");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!");
    var0.add("hi!\\");
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    java.util.Iterator var10 = var0.getIterator();
    var0.add("\\hi!\\hi!\\\\hi!");
    boolean var13 = var0.isEmpty();
    int var14 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);

  }

}
