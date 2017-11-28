package randoop;

import junit.framework.*;

public class RandoopTest14 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test1");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!");
    java.util.Iterator var10 = var0.getIterator();
    var0.add("hi!\\hi!\\");
    boolean var13 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\\\hi!");
    var0.add("\\hi!");
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!");
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test2");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!\\\\hi!\\hi!");
    var2.changeTargetName("\\hi!\\hi!\\\\hi!");
    java.io.File var5 = var2.getDestinationFile();
    boolean var6 = minicopier.Copier.isNotLink(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test3");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getSourcePath();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getSourceFile();
    java.io.File var8 = var2.getSourceFile();
    
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
    assertNotNull(var8);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test4");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getDestinationFile();
    var2.changeTargetName("\\hi!\\hi!");
    java.io.File var14 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test5");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.io.File var11 = var2.getDestinationFolder();
    long var12 = var2.getSize();
    java.lang.String var13 = var2.getName();
    java.io.File var14 = var2.getDestinationFolder();
    java.lang.String var15 = var2.getSourcePath();
    java.lang.String var16 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!\\hi!"+ "'", var16.equals("hi!\\hi!"));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test6");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    var0.add("hi!\\hi!\\hi!\\");
    var0.add("hi!\\hi!\\\\hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!\\\\");

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test7");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getName();
    var2.changeTargetName("\\hi!");
    java.lang.String var9 = var2.getName();
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getDestinationFolderPath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\");
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test8");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getSourcePath();
    java.io.File var6 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!");
    java.lang.String var9 = var2.getSourcePath();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getDestinationFolderPath();
    long var12 = var2.getSize();
    java.io.File var13 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test9");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    int var8 = var0.getLength();
    var0.add("hi!\\hi!\\\\hi!\\\\hi!\\hi!");
    
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
    assertTrue(var8 == 1);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test10");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getDestinationFilePath();
    long var7 = var2.getSize();
    java.lang.String var8 = var2.getName();
    java.lang.String var9 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\\hi!"+ "'", var6.equals("\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test11");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\");
    boolean var4 = var0.isEmpty();
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test12");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "");
    java.io.File var3 = var2.getDestinationFolder();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test13");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.lang.String var11 = var2.getSourcePath();
    java.io.File var12 = var2.getSourceFile();
    java.lang.String var13 = var2.getDestinationFolderPath();
    long var14 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test14");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!", "hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test15");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.lang.String var11 = var2.getSourcePath();
    java.io.File var12 = var2.getSourceFile();
    java.io.File var13 = var2.getDestinationFile();
    boolean var14 = minicopier.Copier.isNotLink(var13);
    
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
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test16");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\\\hi!", "hi!\\\\hi!\\hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getDestinationFolderPath();
    java.io.File var5 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test17");


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
    long var15 = var2.getSize();
    java.lang.String var16 = var2.getName();
    java.lang.String var17 = var2.getDestinationFilePath();
    java.lang.String var18 = var2.getSourcePath();
    
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
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!\\hi!\\hi!"+ "'", var17.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test18");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test19");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var10 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test20");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test21");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test22");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getDestinationFile();
    java.lang.String var11 = var2.getSourcePath();
    java.io.File var12 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\\\hi!\\hi!\\\\hi!");
    java.lang.String var15 = var2.getName();
    java.lang.String var16 = var2.getDestinationFolderPath();
    java.io.File var17 = var2.getDestinationFile();
    
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
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test23");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\\\hi!", "hi!\\");
    long var3 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test24");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.lang.String var5 = var2.getDestinationFolderPath();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test25");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\\\hi!", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test26");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    boolean var4 = var0.isEmpty();
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\hi!\\");
    int var8 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test27");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var9 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test28");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\");
    java.io.File var3 = var2.getDestinationFolder();
    java.lang.String var4 = var2.getSourcePath();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var6.equals("hi!\\hi!\\hi!\\hi!"));

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test29");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "\\hi!");
    long var3 = var2.getSize();
    var2.changeTargetName("hi!\\");
    var2.changeTargetName("hi!\\");
    java.io.File var8 = var2.getDestinationFile();
    long var9 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test30");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!", "hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test31");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test32");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!");
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getSourceFile();
    boolean var11 = minicopier.Copier.isNotLink(var10);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test33");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    int var5 = var0.getLength();
    var0.add("hi!\\hi!\\");
    int var8 = var0.getLength();
    int var9 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test34");


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
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!");
    long var16 = var2.getSize();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
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
    assertTrue(var16 == 0L);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test35");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.lang.String var4 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test36");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getName();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test37");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    java.util.Iterator var5 = var0.getIterator();
    int var6 = var0.getLength();
    boolean var7 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\\\hi!");
    boolean var10 = var0.isEmpty();
    int var11 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test38");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getName();
    java.lang.String var11 = var2.getDestinationFolderPath();
    
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
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test39");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    var0.add("");
    boolean var12 = var0.isEmpty();
    java.util.Iterator var13 = var0.getIterator();
    boolean var14 = var0.isEmpty();
    java.util.Iterator var15 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!");
    java.util.Iterator var18 = var0.getIterator();
    boolean var19 = var0.isEmpty();
    java.util.Iterator var20 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test40");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.lang.String var4 = var2.getSourcePath();
    java.io.File var5 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test41");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
    java.util.Iterator var9 = var0.getIterator();
    var0.add("\\\\hi!\\hi!\\\\hi!");
    var0.add("\\hi!\\hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test42");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var6 = var2.getDestinationFolder();
    var2.changeTargetName("");
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test43");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.lang.String var12 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test44");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    int var8 = var0.getLength();
    var0.add("");
    int var11 = var0.getLength();
    var0.add("\\hi!");
    boolean var14 = var0.isEmpty();
    int var15 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 4);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test45");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFolder();
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getSourcePath();
    java.lang.String var13 = var2.getSourcePath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test46");


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
    java.util.Iterator var14 = var0.getIterator();
    int var15 = var0.getLength();
    boolean var16 = var0.isEmpty();
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
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test47");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "\\hi!\\hi!\\");

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test48");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\", "hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test49");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\\\hi!\\hi!\\\\hi!");
    java.io.File var3 = var2.getSourceFile();
    boolean var4 = minicopier.Copier.isNotLink(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test50");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getDestinationFolder();
    var2.changeTargetName("hi!");
    java.lang.String var11 = var2.getName();
    java.lang.String var12 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test51");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\\\hi!", "hi!\\\\hi!\\hi!\\hi!");

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test52");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getSourcePath();
    long var5 = var2.getSize();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getSourcePath();
    java.lang.String var12 = var2.getSourcePath();
    java.lang.String var13 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!"+ "'", var13.equals("hi!\\hi!"));

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test53");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\", "hi!\\hi!\\");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.lang.String var5 = var2.getDestinationFilePath();
    var2.changeTargetName("\\\\hi!");
    long var8 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!\\hi!"+ "'", var5.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test54");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getName();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    long var11 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test55");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\hi!", "");
    java.io.File var3 = var2.getDestinationFile();
    boolean var4 = minicopier.Copier.isNotLink(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test56");


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
    boolean var11 = var0.wasFirstLaunch();
    boolean var12 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var14 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var16 = var0.wasFirstLaunch();
    boolean var17 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test57");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    var2.changeTargetName("\\hi!");
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.io.File var8 = var2.getDestinationFile();
    java.io.File var9 = var2.getDestinationFile();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test58");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getSourcePath();
    
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

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test59");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getDestinationFolder();
    java.lang.String var12 = var2.getName();
    
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
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test60");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getSourceFile();
    java.io.File var6 = var2.getDestinationFile();
    java.io.File var7 = var2.getDestinationFolder();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFile();
    java.io.File var11 = var2.getDestinationFolder();
    long var12 = var2.getSize();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test61");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.lang.String var11 = var2.getSourcePath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test62");


    minicopier.i18n.Language.init("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test63");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getName();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test64");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFile();
    java.io.File var9 = var2.getDestinationFolder();
    long var10 = var2.getSize();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test65");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!\\hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!\\\\hi!\\hi!");
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    int var12 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 4);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test66");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    var0.add("hi!");
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test67");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    var2.changeTargetName("");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test68");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    var0.add("\\hi!\\hi!\\\\hi!");
    java.util.Iterator var10 = var0.getIterator();
    java.util.Iterator var11 = var0.getIterator();
    int var12 = var0.getLength();
    boolean var13 = var0.isEmpty();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test69");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getSourcePath();
    long var4 = var2.getSize();
    java.lang.String var5 = var2.getSourcePath();
    java.io.File var6 = var2.getSourceFile();
    java.io.File var7 = var2.getDestinationFile();
    boolean var8 = minicopier.Copier.isNotLink(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test70");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getName();
    
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

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test71");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    int var5 = var0.getLength();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    int var9 = var0.getLength();
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test72");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\hi!");
    var0.add("\\hi!\\hi!");
    boolean var13 = var0.isEmpty();
    boolean var14 = var0.isEmpty();
    var0.add("hi!\\\\hi!\\hi!\\hi!");
    java.util.Iterator var17 = var0.getIterator();
    var0.add("\\hi!\\hi!\\hi!");
    java.util.Iterator var20 = var0.getIterator();
    int var21 = var0.getLength();
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 6);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test73");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!", "hi!\\hi!\\hi!\\");
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!");
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!\\hi!"+ "'", var5.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!\\hi!"+ "'", var7.equals("hi!\\hi!\\hi!"));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test74");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getSourceFile();
    java.io.File var7 = var2.getDestinationFolder();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getName();
    java.lang.String var11 = var2.getSourcePath();
    java.lang.String var12 = var2.getDestinationFilePath();
    var2.changeTargetName("\\hi!\\\\hi!");
    
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
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test75");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!");
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var5 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test76");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getSourceFile();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.io.File var10 = var2.getDestinationFolder();
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test77");


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
    java.io.File var15 = var2.getDestinationFolder();
    java.io.File var16 = var2.getDestinationFile();
    var2.changeTargetName("\\\\hi!\\hi!\\\\hi!");
    java.io.File var19 = var2.getDestinationFile();
    java.lang.String var20 = var2.getDestinationFilePath();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!\\\\\\hi!\\hi!\\\\hi!"+ "'", var20.equals("hi!\\\\\\hi!\\hi!\\\\hi!"));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test78");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!", "\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    java.lang.String var4 = var2.getSourcePath();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getName();
    java.lang.String var9 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\hi!\\hi!\\hi!"+ "'", var4.equals("\\hi!\\hi!\\hi!"));
    
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

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test79");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getSourceFile();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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
    assertNotNull(var11);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test80");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.lang.String var8 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test81");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test82");


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
    var0.createConfigFile();
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
    assertTrue(var14 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test83");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.lang.String var4 = var2.getName();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!"+ "'", var3.equals("\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\\hi!\\hi!"+ "'", var5.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test84");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    var0.add("\\hi!\\hi!\\\\hi!");
    int var10 = var0.getLength();
    java.util.Iterator var11 = var0.getIterator();
    java.util.Iterator var12 = var0.getIterator();
    boolean var13 = var0.isEmpty();
    
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
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test85");


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
    java.lang.String var15 = var2.getDestinationFilePath();
    java.io.File var16 = var2.getSourceFile();
    java.io.File var17 = var2.getSourceFile();
    long var18 = var2.getSize();
    java.io.File var19 = var2.getSourceFile();
    
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
    assertTrue("'" + var15 + "' != '" + "hi!\\"+ "'", var15.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test86");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test87");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getName();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getSourcePath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\");
    
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test88");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("hi!");
    java.lang.String var11 = var2.getSourcePath();
    java.io.File var12 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.lang.String var15 = var2.getSourcePath();
    java.io.File var16 = var2.getDestinationFolder();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test89");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!", "hi!\\\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!"+ "'", var6.equals("hi!\\hi!\\hi!"));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test90");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getDestinationFolder();
    java.io.File var12 = var2.getDestinationFolder();
    boolean var13 = minicopier.Copier.isNotLink(var12);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test91");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    java.lang.String var9 = var2.getName();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getSourcePath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test92");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "\\\\hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.io.File var4 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test93");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    java.util.Iterator var3 = var0.getIterator();
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    java.util.Iterator var7 = var0.getIterator();
    boolean var8 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test94");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var6 = var0.getIterator();
    int var7 = var0.getLength();
    int var8 = var0.getLength();
    int var9 = var0.getLength();
    boolean var10 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test95");


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
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    
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

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test96");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getDestinationFolderPath();
    var2.changeTargetName("\\hi!\\hi!\\hi!");
    java.lang.String var11 = var2.getDestinationFolderPath();
    java.lang.String var12 = var2.getDestinationFolderPath();
    java.io.File var13 = var2.getSourceFile();
    
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
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test97");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!");
    java.util.Iterator var10 = var0.getIterator();
    int var11 = var0.getLength();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test98");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    var2.changeTargetName("");
    var2.changeTargetName("hi!\\hi!");
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\");
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.io.File var15 = var2.getDestinationFolder();
    java.io.File var16 = var2.getSourceFile();
    java.lang.String var17 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test99");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.io.File var12 = var2.getSourceFile();
    java.io.File var13 = var2.getDestinationFolder();
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
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!\\hi!"+ "'", var11.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test100");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getDestinationFolderPath();
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test101");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    var0.add("hi!\\hi!");
    int var6 = var0.getLength();
    var0.add("");
    int var9 = var0.getLength();
    int var10 = var0.getLength();
    int var11 = var0.getLength();
    java.util.Iterator var12 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test102");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFilePath();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.io.File var12 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test103");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\\\hi!", "hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getDestinationFolderPath();
    long var5 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test104");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test105");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getName();
    java.lang.String var7 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\");
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getSourceFile();
    java.io.File var12 = var2.getDestinationFile();
    java.io.File var13 = var2.getDestinationFile();
    java.io.File var14 = var2.getSourceFile();
    java.lang.String var15 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test106");


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
    java.lang.String var15 = var2.getDestinationFolderPath();
    java.lang.String var16 = var2.getDestinationFolderPath();
    java.lang.String var17 = var2.getSourcePath();
    
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
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test107");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\");
    int var14 = var0.getLength();
    int var15 = var0.getLength();
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\");
    int var18 = var0.getLength();
    boolean var19 = var0.isEmpty();
    
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
    assertTrue(var14 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test108");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getSourcePath();
    long var6 = var2.getSize();
    long var7 = var2.getSize();
    java.lang.String var8 = var2.getName();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!\\hi!"+ "'", var11.equals("hi!\\hi!\\hi!"));

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test109");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getName();
    java.lang.String var5 = var2.getSourcePath();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!\\hi!"+ "'", var7.equals("hi!\\hi!\\hi!"));

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test110");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!");
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getSourcePath();
    java.lang.String var12 = var2.getSourcePath();
    java.io.File var13 = var2.getDestinationFolder();
    java.lang.String var14 = var2.getDestinationFilePath();
    java.io.File var15 = var2.getDestinationFolder();
    
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
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!"+ "'", var14.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test111");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "");
    var2.changeTargetName("hi!");
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getSourceFile();
    java.io.File var8 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\\hi!"+ "'", var6.equals("\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test112");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.lang.String var4 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test113");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    var2.changeTargetName("");
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getDestinationFolder();
    java.io.File var12 = var2.getDestinationFile();
    java.lang.String var13 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\"+ "'", var13.equals("hi!\\"));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test114");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFolder();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!\\hi!\\");
    java.lang.String var12 = var2.getSourcePath();
    java.lang.String var13 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.lang.String var16 = var2.getDestinationFolderPath();
    
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
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test115");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\\\hi!"+ "'", var3.equals("\\\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test116");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\\\hi!\\hi!");
    java.util.Iterator var12 = var0.getIterator();
    int var13 = var0.getLength();
    int var14 = var0.getLength();
    var0.add("\\hi!\\hi!\\");
    java.util.Iterator var17 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test117");


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
    java.util.Iterator var13 = var0.getIterator();
    int var14 = var0.getLength();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test118");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getDestinationFolder();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getName();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test119");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    java.io.File var4 = var2.getDestinationFolder();
    java.lang.String var5 = var2.getDestinationFolderPath();
    long var6 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!\\hi!"+ "'", var5.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test120");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getDestinationFile();
    boolean var6 = minicopier.Copier.isNotLink(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test121");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFolder();
    java.io.File var8 = var2.getDestinationFolder();
    boolean var9 = minicopier.Copier.isNotLink(var8);
    boolean var10 = minicopier.Copier.isNotLink(var8);
    
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
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test122");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\");
    var0.add("hi!\\\\\\hi!");
    java.util.Iterator var13 = var0.getIterator();
    
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

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test123");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!");
    java.lang.String var8 = var2.getDestinationFilePath();
    var2.changeTargetName("");
    java.lang.String var11 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\"+ "'", var11.equals("hi!\\"));

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test124");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    var2.changeTargetName("");
    var2.changeTargetName("hi!\\hi!");
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\");
    var2.changeTargetName("hi!\\hi!");
    java.io.File var15 = var2.getDestinationFolder();
    java.io.File var16 = var2.getDestinationFolder();
    java.lang.String var17 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test125");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!");
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getSourcePath();
    java.lang.String var12 = var2.getSourcePath();
    java.io.File var13 = var2.getDestinationFolder();
    java.io.File var14 = var2.getSourceFile();
    java.lang.String var15 = var2.getDestinationFolderPath();
    java.lang.String var16 = var2.getSourcePath();
    
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
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test126");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!"));

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test127");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test128");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\", "hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFolderPath();
    long var8 = var2.getSize();
    java.io.File var9 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test129");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.lang.String var4 = var2.getName();
    java.lang.String var5 = var2.getSourcePath();
    java.io.File var6 = var2.getSourceFile();
    java.io.File var7 = var2.getSourceFile();
    java.io.File var8 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test130");


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
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var16 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    var2.changeTargetName("hi!\\hi!\\hi!\\\\hi!");
    
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
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test131");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getSourcePath();
    long var8 = var2.getSize();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.io.File var11 = var2.getDestinationFolder();
    boolean var12 = minicopier.Copier.isNotLink(var11);
    
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
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test132");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\");
    int var12 = var0.getLength();
    int var13 = var0.getLength();
    boolean var14 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test133");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getSourcePath();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getDestinationFilePath();
    long var8 = var2.getSize();
    java.io.File var9 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test134");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "\\hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.lang.String var4 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\hi!\\hi!\\hi!"+ "'", var4.equals("\\hi!\\hi!\\hi!"));

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test135");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test136");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!");
    java.util.Iterator var10 = var0.getIterator();
    var0.add("hi!\\hi!\\");
    boolean var13 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\\\hi!");
    var0.add("\\hi!");
    boolean var18 = var0.isEmpty();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test137");


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
    java.lang.String var14 = var2.getDestinationFilePath();
    var2.changeTargetName("\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!"+ "'", var14.equals("hi!\\hi!"));

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test138");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getSourcePath();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getDestinationFile();
    java.io.File var10 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test139");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getName();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.io.File var10 = var2.getDestinationFile();
    
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
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test140");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getName();
    java.io.File var5 = var2.getSourceFile();
    var2.changeTargetName("hi!");
    java.io.File var8 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test141");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!");
    var2.changeTargetName("hi!\\hi!\\\\hi!\\hi!");
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!\\\\hi!\\hi!"+ "'", var6.equals("hi!\\hi!\\hi!\\\\hi!\\hi!"));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test142");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var12 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var14 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test143");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!\\");
    java.io.File var3 = var2.getDestinationFile();
    java.lang.String var4 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test144");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getName();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var15 = var2.getDestinationFolder();
    long var16 = var2.getSize();
    
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
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test145");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.lang.String var9 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test146");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!\\hi!\\\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test147");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    boolean var3 = var0.isEmpty();
    java.util.Iterator var4 = var0.getIterator();
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!\\");
    boolean var8 = var0.isEmpty();
    var0.add("\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test148");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\hi!", "hi!\\\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!"));

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test149");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("");
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getSourcePath();
    java.io.File var13 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
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
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test150");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getSourcePath();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFolder();
    long var11 = var2.getSize();
    long var12 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test151");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    java.io.File var6 = var2.getSourceFile();
    boolean var7 = minicopier.Copier.isNotLink(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test152");


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
    boolean var14 = var0.wasFirstLaunch();
    boolean var15 = var0.wasFirstLaunch();
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test153");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    var0.add("hi!");
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    var0.add("hi!\\hi!");
    int var10 = var0.getLength();
    var0.add("hi!\\\\hi!\\hi!\\\\hi!");
    int var13 = var0.getLength();
    boolean var14 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test154");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    var2.changeTargetName("");
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getSourcePath();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var12 = var2.getDestinationFolderPath();
    java.lang.String var13 = var2.getSourcePath();
    java.lang.String var14 = var2.getName();
    
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
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test155");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getSourceFile();
    java.io.File var7 = var2.getDestinationFolder();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.io.File var10 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\\\hi!");
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!");
    var2.changeTargetName("hi!\\\\hi!\\hi!\\hi!\\");
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
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test156");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getName();
    java.io.File var5 = var2.getDestinationFile();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test157");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\", "\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!"));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test158");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.io.File var11 = var2.getDestinationFolder();
    java.lang.String var12 = var2.getDestinationFilePath();
    java.lang.String var13 = var2.getName();
    
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
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test159");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    int var7 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var10 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var13 = var0.getLength();
    var0.add("hi!\\hi!\\");
    java.util.Iterator var16 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test160");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    var0.add("");
    boolean var12 = var0.isEmpty();
    java.util.Iterator var13 = var0.getIterator();
    boolean var14 = var0.isEmpty();
    java.util.Iterator var15 = var0.getIterator();
    java.util.Iterator var16 = var0.getIterator();
    int var17 = var0.getLength();
    var0.add("\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 4);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test161");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    var2.changeTargetName("");
    var2.changeTargetName("hi!\\hi!");
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\");
    java.io.File var13 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var16 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test162");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\\\hi!\\hi!");

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test163");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    long var10 = var2.getSize();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
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
    assertTrue(var10 == 0L);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test164");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\", "hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test165");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getDestinationFolder();
    boolean var12 = minicopier.Copier.isNotLink(var11);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test166");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test167");


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
    boolean var17 = var0.isEmpty();
    int var18 = var0.getLength();
    
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 4);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test168");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    long var7 = var2.getSize();
    java.io.File var8 = var2.getSourceFile();
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.lang.String var11 = var2.getName();
    java.lang.String var12 = var2.getSourcePath();
    java.lang.String var13 = var2.getSourcePath();
    java.lang.String var14 = var2.getDestinationFolderPath();
    java.io.File var15 = var2.getSourceFile();
    
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
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test169");


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
    java.lang.String var13 = var2.getDestinationFilePath();
    java.lang.String var14 = var2.getSourcePath();
    java.io.File var15 = var2.getSourceFile();
    long var16 = var2.getSize();
    
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
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!\\hi!"+ "'", var13.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test170");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getName();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.lang.String var10 = var2.getDestinationFilePath();
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getName();
    java.lang.String var13 = var2.getDestinationFolderPath();
    java.io.File var14 = var2.getSourceFile();
    
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
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test171");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getSourcePath();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFolder();
    long var11 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test172");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\\\hi!\\hi!\\\\hi!", "\\hi!\\hi!\\\\hi!");

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test173");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\", "\\\\hi!\\hi!\\\\hi!");
    java.lang.String var3 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test174");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    var0.add("\\hi!");
    int var11 = var0.getLength();
    java.util.Iterator var12 = var0.getIterator();
    boolean var13 = var0.isEmpty();
    int var14 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 4);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test175");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    java.util.Iterator var4 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
    int var7 = var0.getLength();
    var0.add("\\hi!\\hi!");
    boolean var10 = var0.isEmpty();
    boolean var11 = var0.isEmpty();
    
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
    assertTrue(var11 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test176");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!", "hi!\\\\hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.io.File var4 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test177");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\");
    var0.add("hi!\\");
    boolean var8 = var0.isEmpty();
    int var9 = var0.getLength();
    java.util.Iterator var10 = var0.getIterator();
    int var11 = var0.getLength();
    boolean var12 = var0.isEmpty();
    int var13 = var0.getLength();
    java.util.Iterator var14 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test178");


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
    java.lang.String var18 = var2.getDestinationFilePath();
    java.lang.String var19 = var2.getName();
    java.io.File var20 = var2.getDestinationFolder();
    long var21 = var2.getSize();
    
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
    assertTrue("'" + var18 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var18.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0L);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test179");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test180");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "\\hi!\\hi!\\\\hi!");
    java.io.File var3 = var2.getSourceFile();
    long var4 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test181");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    int var3 = var0.getLength();
    java.util.Iterator var4 = var0.getIterator();
    var0.add("\\hi!");
    int var7 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test182");


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
    var0.add("\\hi!");
    var0.add("hi!\\hi!\\hi!");
    int var19 = var0.getLength();
    boolean var20 = var0.isEmpty();
    java.util.Iterator var21 = var0.getIterator();
    
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
    assertTrue(var19 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test183");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    boolean var4 = var0.isEmpty();
    var0.add("hi!\\hi!\\");
    var0.add("\\");
    java.util.Iterator var9 = var0.getIterator();
    var0.add("hi!\\hi!");
    boolean var12 = var0.isEmpty();
    java.util.Iterator var13 = var0.getIterator();
    boolean var14 = var0.isEmpty();
    java.util.Iterator var15 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test184");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "");
    java.io.File var3 = var2.getSourceFile();
    java.lang.String var4 = var2.getDestinationFolderPath();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getDestinationFolder();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.lang.String var10 = var2.getSourcePath();
    
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
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test185");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "");
    java.io.File var3 = var2.getSourceFile();
    java.lang.String var4 = var2.getDestinationFolderPath();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getDestinationFolderPath();
    long var7 = var2.getSize();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test186");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    var2.changeTargetName("");
    java.lang.String var11 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\"+ "'", var11.equals("hi!\\"));

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test187");


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
    boolean var19 = minicopier.Copier.isNotLink(var18);
    boolean var20 = minicopier.Copier.isNotLink(var18);
    
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
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test188");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.io.File var11 = var2.getDestinationFile();
    java.io.File var12 = var2.getDestinationFile();
    java.io.File var13 = var2.getSourceFile();
    java.lang.String var14 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!");
    java.io.File var17 = var2.getDestinationFile();
    boolean var18 = minicopier.Copier.isNotLink(var17);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!"+ "'", var14.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test189");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    var0.add("");
    int var12 = var0.getLength();
    java.util.Iterator var13 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test190");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getName();
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getSourceFile();
    boolean var12 = minicopier.Copier.isNotLink(var11);
    boolean var13 = minicopier.Copier.isNotLink(var11);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test191");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    var2.changeTargetName("\\hi!");
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.lang.String var12 = var2.getName();
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\\\hi!"+ "'", var11.equals("hi!\\\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test192");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!");
    long var9 = var2.getSize();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getName();
    java.lang.String var12 = var2.getSourcePath();
    java.lang.String var13 = var2.getSourcePath();
    
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
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test193");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!");

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test194");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    var0.add("\\hi!\\hi!");
    int var10 = var0.getLength();
    boolean var11 = var0.isEmpty();
    int var12 = var0.getLength();
    boolean var13 = var0.isEmpty();
    var0.add("\\\\hi!\\hi!\\hi!\\hi!");
    var0.add("\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test195");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.io.File var12 = var2.getSourceFile();
    java.lang.String var13 = var2.getSourcePath();
    java.lang.String var14 = var2.getName();
    java.lang.String var15 = var2.getSourcePath();
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
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!\\hi!"+ "'", var11.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test196");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFolder();
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getSourcePath();
    long var13 = var2.getSize();
    long var14 = var2.getSize();
    java.io.File var15 = var2.getDestinationFile();
    
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
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test197");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getName();
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getDestinationFilePath();
    java.io.File var13 = var2.getSourceFile();
    
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
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test198");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!\\hi!\\\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test199");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.lang.String var5 = var2.getDestinationFolderPath();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.io.File var11 = var2.getSourceFile();
    java.io.File var12 = var2.getSourceFile();
    java.io.File var13 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test200");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!", "hi!\\\\hi!");
    var2.changeTargetName("\\hi!\\hi!");
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getName();
    java.lang.String var7 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!\\\\hi!\\hi!"+ "'", var7.equals("hi!\\hi!\\\\hi!\\hi!"));

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test201");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!");
    long var9 = var2.getSize();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getDestinationFolderPath();
    java.io.File var12 = var2.getSourceFile();
    long var13 = var2.getSize();
    
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
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test202");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test203");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    var0.add("\\hi!");
    int var11 = var0.getLength();
    java.util.Iterator var12 = var0.getIterator();
    int var13 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 4);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test204");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\", "hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!");
    java.lang.String var6 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test205");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getDestinationFolderPath();
    long var7 = var2.getSize();
    java.io.File var8 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test206");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.io.File var6 = var2.getSourceFile();
    long var7 = var2.getSize();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getDestinationFile();
    java.lang.String var11 = var2.getName();
    java.lang.String var12 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test207");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!\\\\");

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test208");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getSourcePath();
    long var5 = var2.getSize();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getName();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getName();
    java.lang.String var11 = var2.getName();
    java.lang.String var12 = var2.getName();
    
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
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test209");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!\\\\hi!");
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test210");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\\\hi!\\hi!\\hi!", "\\hi!\\hi!\\\\hi!");

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test211");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!\\\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test212");


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
    java.io.File var13 = var2.getDestinationFolder();
    java.io.File var14 = var2.getSourceFile();
    java.io.File var15 = var2.getDestinationFile();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test213");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var7 = var0.wasFirstLaunch();
    boolean var8 = var0.wasFirstLaunch();
    boolean var9 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test214");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getSourcePath();
    java.io.File var8 = var2.getDestinationFile();
    boolean var9 = minicopier.Copier.isNotLink(var8);
    boolean var10 = minicopier.Copier.isNotLink(var8);
    
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
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test215");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getName();
    long var12 = var2.getSize();
    java.lang.String var13 = var2.getSourcePath();
    java.lang.String var14 = var2.getName();
    java.io.File var15 = var2.getDestinationFolder();
    long var16 = var2.getSize();
    java.io.File var17 = var2.getSourceFile();
    
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test216");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test217");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getSourceFile();
    java.io.File var6 = var2.getDestinationFile();
    var2.changeTargetName("\\hi!\\hi!\\\\hi!");
    java.lang.String var9 = var2.getDestinationFolderPath();
    long var10 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test218");


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
    java.io.File var19 = var2.getSourceFile();
    long var20 = var2.getSize();
    long var21 = var2.getSize();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0L);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test219");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!", "");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test220");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getSourceFile();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFolderPath();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test221");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\\\hi!", "hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test222");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!");
    var2.changeTargetName("\\hi!\\hi!");

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test223");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    java.util.Iterator var7 = var0.getIterator();
    boolean var8 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!");
    var0.add("hi!\\\\\\hi!");
    
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
    assertTrue(var8 == false);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test224");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\\\hi!\\hi!\\\\hi!", "\\hi!\\hi!\\hi!");

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test225");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!\\");
    int var7 = var0.getLength();
    int var8 = var0.getLength();
    boolean var9 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test226");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!", "hi!\\\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    java.io.File var4 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test227");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    int var8 = var0.getLength();
    int var9 = var0.getLength();
    java.util.Iterator var10 = var0.getIterator();
    int var11 = var0.getLength();
    var0.add("\\\\hi!");
    
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
    assertTrue(var11 == 2);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test228");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!\\");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    long var7 = var2.getSize();
    
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

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test229");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "\\hi!"+ "'", var7.equals("\\hi!"));

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test230");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!\\hi!\\hi!\\hi!\\hi!\\");

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test231");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\");
    var0.add("hi!\\hi!\\hi!\\");
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!");
    var0.add("hi!\\\\hi!\\hi!");
    var0.add("\\hi!\\hi!\\\\hi!");
    boolean var15 = var0.isEmpty();
    java.util.Iterator var16 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test232");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!", "");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getSourceFile();
    java.io.File var6 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test233");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    var0.add("");
    int var12 = var0.getLength();
    var0.add("\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    boolean var15 = var0.isEmpty();
    boolean var16 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test234");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\");
    java.lang.String var13 = var2.getDestinationFilePath();
    long var14 = var2.getSize();
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!\\hi!"+ "'", var10.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!\\hi!\\"+ "'", var13.equals("hi!\\hi!\\hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!\\hi!\\hi!\\"+ "'", var15.equals("hi!\\hi!\\hi!\\"));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test235");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!");
    java.io.File var3 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!");
    java.io.File var6 = var2.getSourceFile();
    long var7 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test236");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    boolean var3 = var0.isEmpty();
    java.util.Iterator var4 = var0.getIterator();
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    var0.add("\\\\hi!\\hi!\\\\hi!");
    int var9 = var0.getLength();
    int var10 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test237");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    long var4 = var2.getSize();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test238");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getName();
    java.io.File var5 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test239");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "");
    java.lang.String var3 = var2.getName();
    long var4 = var2.getSize();
    java.io.File var5 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test240");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getName();
    java.io.File var8 = var2.getSourceFile();
    java.io.File var9 = var2.getDestinationFile();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\");
    java.io.File var12 = var2.getDestinationFile();
    
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
    assertNotNull(var12);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test241");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!\\");
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isEmpty();
    boolean var5 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!");
    int var8 = var0.getLength();
    java.util.Iterator var9 = var0.getIterator();
    java.util.Iterator var10 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test242");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!"+ "'", var6.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test243");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getSourcePath();
    java.lang.String var12 = var2.getDestinationFilePath();
    java.lang.String var13 = var2.getDestinationFolderPath();
    java.io.File var14 = var2.getDestinationFile();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test244");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
    java.util.Iterator var9 = var0.getIterator();
    java.util.Iterator var10 = var0.getIterator();
    var0.add("hi!\\\\hi!\\hi!");
    java.util.Iterator var13 = var0.getIterator();
    int var14 = var0.getLength();
    var0.add("hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test245");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getDestinationFile();
    long var9 = var2.getSize();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getName();
    long var12 = var2.getSize();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test246");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    java.util.Iterator var9 = var0.getIterator();
    java.util.Iterator var10 = var0.getIterator();
    java.util.Iterator var11 = var0.getIterator();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test247");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    int var9 = var0.getLength();
    int var10 = var0.getLength();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    int var13 = var0.getLength();
    
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
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test248");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getSourcePath();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFile();
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test249");


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
    var0.add("hi!\\hi!");
    boolean var17 = var0.isEmpty();
    java.util.Iterator var18 = var0.getIterator();
    boolean var19 = var0.isEmpty();
    
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test250");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getName();
    java.lang.String var10 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test251");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "");
    java.io.File var3 = var2.getSourceFile();
    java.lang.String var4 = var2.getDestinationFolderPath();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test252");


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
    int var16 = var0.getLength();
    
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
    assertTrue(var16 == 4);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test253");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\");
    java.io.File var3 = var2.getSourceFile();
    boolean var4 = minicopier.Copier.isNotLink(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test254");


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
    java.lang.String var17 = var2.getSourcePath();
    java.io.File var18 = var2.getDestinationFile();
    
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
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test255");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!");
    int var6 = var0.getLength();
    var0.add("\\hi!\\hi!\\\\hi!");
    int var9 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test256");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.io.File var11 = var2.getSourceFile();
    java.io.File var12 = var2.getDestinationFolder();
    java.io.File var13 = var2.getSourceFile();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test257");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    int var6 = var0.getLength();
    var0.add("hi!\\hi!\\");
    int var9 = var0.getLength();
    java.util.Iterator var10 = var0.getIterator();
    boolean var11 = var0.isEmpty();
    int var12 = var0.getLength();
    int var13 = var0.getLength();
    boolean var14 = var0.isEmpty();
    boolean var15 = var0.isEmpty();
    int var16 = var0.getLength();
    var0.add("hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test258");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    java.lang.String var3 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test259");


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
    java.io.File var14 = var2.getDestinationFolder();
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!\\hi!\\hi!"+ "'", var15.equals("hi!\\hi!\\hi!"));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test260");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getDestinationFolder();
    java.io.File var8 = var2.getDestinationFile();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.lang.String var12 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test261");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!", "\\hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test262");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    java.lang.String var9 = var2.getSourcePath();
    var2.changeTargetName("");
    java.io.File var12 = var2.getDestinationFolder();
    java.io.File var13 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test263");


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
    java.lang.String var15 = var2.getDestinationFilePath();
    java.lang.String var16 = var2.getName();
    java.lang.String var17 = var2.getName();
    var2.changeTargetName("hi!\\\\hi!\\\\hi!\\hi!");
    
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
    assertTrue("'" + var15 + "' != '" + "hi!\\hi!\\hi!"+ "'", var15.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test264");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    var2.changeTargetName("");
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getSourcePath();
    java.io.File var13 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\\\hi!\\hi!");
    java.io.File var16 = var2.getDestinationFolder();
    boolean var17 = minicopier.Copier.isNotLink(var16);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test265");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getDestinationFile();
    java.io.File var9 = var2.getDestinationFolder();
    
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
    assertNotNull(var9);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test266");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\\\hi!\\hi!\\hi!", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test267");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var12 = var0.wasFirstLaunch();
    boolean var13 = var0.wasFirstLaunch();
    boolean var14 = var0.wasFirstLaunch();
    boolean var15 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test268");


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
    var0.add("hi!\\\\hi!\\hi!\\hi!\\");
    int var15 = var0.getLength();
    var0.add("\\");
    int var18 = var0.getLength();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test269");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.lang.String var8 = var2.getName();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getSourceFile();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test270");


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
    long var16 = var2.getSize();
    long var17 = var2.getSize();
    java.lang.String var18 = var2.getSourcePath();
    
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
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test271");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getSourceFile();
    boolean var5 = minicopier.Copier.isNotLink(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test272");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\\\hi!\\hi!\\\\hi!", "\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test273");


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
    long var12 = var2.getSize();
    java.io.File var13 = var2.getSourceFile();
    
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
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test274");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getSourcePath();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getSourceFile();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!\\hi!"+ "'", var7.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test275");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    int var5 = var0.getLength();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    var0.add("\\hi!\\hi!\\\\hi!");
    int var12 = var0.getLength();
    
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
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test276");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("hi!");
    var2.changeTargetName("");
    java.io.File var13 = var2.getSourceFile();
    java.io.File var14 = var2.getDestinationFolder();
    long var15 = var2.getSize();
    java.lang.String var16 = var2.getDestinationFolderPath();
    java.io.File var17 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test277");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getSourcePath();
    java.lang.String var8 = var2.getName();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    long var15 = var2.getSize();
    
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
    assertTrue(var15 == 0L);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test278");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    int var10 = var0.getLength();
    java.util.Iterator var11 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\hi!\\");
    boolean var14 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test279");


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
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var15 = var0.wasFirstLaunch();
    
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
    assertTrue(var15 == false);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test280");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.lang.String var4 = var2.getDestinationFolderPath();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\"+ "'", var3.equals("hi!\\hi!\\hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test281");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!");
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.io.File var11 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test282");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!");
    java.io.File var8 = var2.getSourceFile();
    java.io.File var9 = var2.getDestinationFolder();
    boolean var10 = minicopier.Copier.isNotLink(var9);
    boolean var11 = minicopier.Copier.isNotLink(var9);
    boolean var12 = minicopier.Copier.isNotLink(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test283");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.io.File var6 = var2.getDestinationFile();
    java.io.File var7 = var2.getDestinationFolder();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.lang.String var9 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test284");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test285");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    java.util.Iterator var3 = var0.getIterator();
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test286");


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
    boolean var21 = var0.wasFirstLaunch();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test287");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!", "");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test288");


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
    int var17 = var0.getLength();
    java.util.Iterator var18 = var0.getIterator();
    java.util.Iterator var19 = var0.getIterator();
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
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test289");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getName();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getDestinationFile();
    long var11 = var2.getSize();
    
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
    assertTrue(var11 == 0L);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test290");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\hi!");
    long var9 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test291");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\hi!");
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test292");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!", "hi!\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!"));

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test293");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!");
    java.util.Iterator var12 = var0.getIterator();
    boolean var13 = var0.isEmpty();
    boolean var14 = var0.isEmpty();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test294");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\", "hi!\\hi!\\");
    java.io.File var3 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test295");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getName();
    java.lang.String var7 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test296");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\");
    java.io.File var3 = var2.getDestinationFile();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.io.File var9 = var2.getDestinationFile();
    boolean var10 = minicopier.Copier.isNotLink(var9);
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test297");


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
    boolean var13 = minicopier.Copier.isNotLink(var12);
    boolean var14 = minicopier.Copier.isNotLink(var12);
    
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
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test298");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFolder();
    long var8 = var2.getSize();
    java.io.File var9 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!\\\\hi!\\hi!\\hi!");
    
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

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test299");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\", "hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.lang.String var5 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test300");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.lang.String var5 = var2.getDestinationFolderPath();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.lang.String var8 = var2.getSourcePath();
    long var9 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test301");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    int var5 = var0.getLength();
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    int var8 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test302");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getDestinationFolderPath();
    long var10 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test303");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\");
    var0.add("hi!\\");
    boolean var8 = var0.isEmpty();
    int var9 = var0.getLength();
    java.util.Iterator var10 = var0.getIterator();
    int var11 = var0.getLength();
    boolean var12 = var0.isEmpty();
    boolean var13 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test304");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getSourcePath();
    var2.changeTargetName("\\hi!");
    java.lang.String var14 = var2.getName();
    java.lang.String var15 = var2.getName();
    
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
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test305");


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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test306");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test307");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    long var4 = var2.getSize();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getName();
    java.lang.String var7 = var2.getDestinationFilePath();
    long var8 = var2.getSize();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getName();
    java.io.File var11 = var2.getDestinationFile();
    boolean var12 = minicopier.Copier.isNotLink(var11);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test308");


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
    java.io.File var12 = var2.getDestinationFolder();
    
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
    assertNotNull(var12);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test309");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!\\hi!\\");
    var2.changeTargetName("hi!\\hi!\\");
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getName();
    java.io.File var7 = var2.getSourceFile();
    boolean var8 = minicopier.Copier.isNotLink(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test310");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getName();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getName();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!\\hi!"+ "'", var9.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test311");


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
    boolean var11 = var0.wasFirstLaunch();
    boolean var12 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var16 = var0.wasFirstLaunch();
    
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test312");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test313");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    java.util.Iterator var3 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    boolean var8 = var0.isEmpty();
    boolean var9 = var0.isEmpty();
    var0.add("hi!\\\\hi!\\hi!");
    int var12 = var0.getLength();
    var0.add("hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test314");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = minicopier.i18n.Language.get("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test315");


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
    var0.add("\\hi!\\hi!\\\\hi!\\hi!");
    
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

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test316");


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
    java.io.File var14 = var2.getSourceFile();
    boolean var15 = minicopier.Copier.isNotLink(var14);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test317");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.lang.String var10 = var2.getDestinationFolderPath();
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getSourcePath();
    java.lang.String var13 = var2.getDestinationFilePath();
    java.io.File var14 = var2.getDestinationFolder();
    var2.changeTargetName("\\\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!\\hi!"+ "'", var13.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test318");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!");
    int var10 = var0.getLength();
    int var11 = var0.getLength();
    java.util.Iterator var12 = var0.getIterator();
    java.util.Iterator var13 = var0.getIterator();
    
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
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test319");


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
    java.lang.String var17 = var2.getName();
    java.lang.String var18 = var2.getDestinationFolderPath();
    java.io.File var19 = var2.getDestinationFile();
    
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
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test320");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.lang.String var11 = var2.getName();
    java.io.File var12 = var2.getDestinationFolder();
    java.io.File var13 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test321");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test322");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!\\hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!\\hi!\\");
    int var8 = var0.getLength();
    var0.add("\\\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\");
    int var13 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 4);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test323");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!\\");
    java.io.File var3 = var2.getDestinationFolder();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getSourcePath();
    java.lang.String var6 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!\\hi!"+ "'", var5.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test324");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!\\");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test325");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!");
    var0.add("hi!\\");
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\");
    int var12 = var0.getLength();
    int var13 = var0.getLength();
    
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
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test326");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    var2.changeTargetName("hi!");
    java.lang.String var5 = var2.getSourcePath();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getSourceFile();
    long var8 = var2.getSize();
    var2.changeTargetName("hi!\\\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test327");


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
    java.util.Iterator var14 = var0.getIterator();
    java.util.Iterator var15 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    int var18 = var0.getLength();
    boolean var19 = var0.isEmpty();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test328");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    int var8 = var0.getLength();
    var0.add("");
    int var11 = var0.getLength();
    var0.add("hi!\\hi!\\hi!\\hi!");
    boolean var14 = var0.isEmpty();
    int var15 = var0.getLength();
    boolean var16 = var0.isEmpty();
    int var17 = var0.getLength();
    int var18 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 4);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test329");


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
    int var19 = var0.getLength();
    var0.add("hi!\\\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
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
    assertTrue(var19 == 5);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test330");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    java.util.Iterator var5 = var0.getIterator();
    int var6 = var0.getLength();
    int var7 = var0.getLength();
    var0.add("\\hi!\\hi!\\hi!\\hi!");
    java.util.Iterator var10 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test331");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    var2.changeTargetName("\\hi!");
    java.lang.String var7 = var2.getName();
    long var8 = var2.getSize();
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\\\hi!"+ "'", var10.equals("hi!\\\\hi!"));

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test332");


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
    java.lang.String var13 = var2.getDestinationFilePath();
    java.lang.String var14 = var2.getSourcePath();
    java.io.File var15 = var2.getDestinationFolder();
    java.io.File var16 = var2.getDestinationFolder();
    java.io.File var17 = var2.getSourceFile();
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
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!\\hi!"+ "'", var10.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!\\hi!"+ "'", var13.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!\\hi!\\hi!"+ "'", var18.equals("hi!\\hi!\\hi!"));

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test333");


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
    int var18 = var0.getLength();
    int var19 = var0.getLength();
    java.util.Iterator var20 = var0.getIterator();
    java.util.Iterator var21 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test334");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getSourceFile();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.lang.String var12 = var2.getSourcePath();
    var2.changeTargetName("\\hi!");
    
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
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!\\hi!"+ "'", var11.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test335");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\hi!", "\\");
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test336");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\", "hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\"+ "'", var4.equals("\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!\\"+ "'", var5.equals("hi!\\hi!\\"));

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test337");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getSourcePath();
    var2.changeTargetName("\\\\hi!\\hi!\\hi!\\hi!");
    java.lang.String var9 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\hi!\\hi!\\hi!"+ "'", var4.equals("\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\\hi!\\hi!"+ "'", var6.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "\\hi!\\hi!\\\\\\hi!\\hi!\\hi!\\hi!"+ "'", var9.equals("\\hi!\\hi!\\\\\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test338");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFolder();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test339");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\hi!");
    int var6 = var0.getLength();
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    int var10 = var0.getLength();
    int var11 = var0.getLength();
    boolean var12 = var0.isEmpty();
    boolean var13 = var0.isEmpty();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test340");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    long var4 = var2.getSize();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getSourcePath();
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!"+ "'", var6.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test341");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    java.util.Iterator var3 = var0.getIterator();
    java.util.Iterator var4 = var0.getIterator();
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test342");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.lang.String var4 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var7 = var2.getSourcePath();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!"+ "'", var3.equals("\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "\\hi!\\hi!\\hi!"+ "'", var8.equals("\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test343");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFolder();
    long var4 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test344");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.io.File var6 = var2.getSourceFile();
    long var7 = var2.getSize();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getDestinationFolder();
    long var11 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test345");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test346");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    int var9 = var0.getLength();
    int var10 = var0.getLength();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\");
    
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
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test347");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.io.File var6 = var2.getSourceFile();
    long var7 = var2.getSize();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getDestinationFile();
    java.io.File var11 = var2.getSourceFile();
    java.lang.String var12 = var2.getDestinationFolderPath();
    long var13 = var2.getSize();
    java.lang.String var14 = var2.getDestinationFolderPath();
    java.lang.String var15 = var2.getDestinationFilePath();
    java.lang.String var16 = var2.getSourcePath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!\\hi!"+ "'", var15.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test348");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    int var7 = var0.getLength();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!");
    int var10 = var0.getLength();
    java.util.Iterator var11 = var0.getIterator();
    java.util.Iterator var12 = var0.getIterator();
    int var13 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test349");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getDestinationFilePath();
    long var7 = var2.getSize();
    java.lang.String var8 = var2.getName();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.lang.String var10 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test350");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\");
    java.io.File var3 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!\\");
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test351");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\", "hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.io.File var4 = var2.getSourceFile();
    boolean var5 = minicopier.Copier.isNotLink(var4);
    boolean var6 = minicopier.Copier.isNotLink(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test352");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\");
    java.io.File var3 = var2.getDestinationFile();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\");
    java.lang.String var10 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var10 + "' != '" + "hi!\\\\hi!\\hi!\\hi!\\"+ "'", var10.equals("hi!\\\\hi!\\hi!\\hi!\\"));

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test353");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\\\hi!\\hi!", "\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test354");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    java.lang.String var3 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test355");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "");
    java.lang.String var3 = var2.getDestinationFolderPath();
    long var4 = var2.getSize();
    java.lang.String var5 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\\\hi!\\hi!");
    var2.changeTargetName("\\hi!\\\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\\"+ "'", var5.equals("\\"));

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test356");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getDestinationFolderPath();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test357");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\\\hi!\\hi!\\hi!", "hi!\\hi!");
    long var3 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test358");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getSourcePath();
    java.lang.String var12 = var2.getName();
    java.lang.String var13 = var2.getDestinationFilePath();
    java.io.File var14 = var2.getSourceFile();
    
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
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!"+ "'", var13.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test359");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getDestinationFolder();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test360");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test361");


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
    var0.add("hi!");
    int var20 = var0.getLength();
    boolean var21 = var0.isEmpty();
    var0.add("");
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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
    assertTrue(var20 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test362");


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
    java.io.File var12 = var2.getDestinationFile();
    long var13 = var2.getSize();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
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
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test363");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var11 = var0.wasFirstLaunch();
    boolean var12 = var0.wasFirstLaunch();
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test364");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!");
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.io.File var5 = var2.getSourceFile();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getSourceFile();
    long var8 = var2.getSize();
    long var9 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test365");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.io.File var12 = var2.getSourceFile();
    java.lang.String var13 = var2.getName();
    java.io.File var14 = var2.getDestinationFile();
    boolean var15 = minicopier.Copier.isNotLink(var14);
    
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
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test366");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
    long var10 = var2.getSize();
    var2.changeTargetName("\\hi!\\hi!\\hi!");
    java.io.File var13 = var2.getDestinationFile();
    long var14 = var2.getSize();
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
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test367");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.lang.String var8 = var2.getName();
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.io.File var11 = var2.getSourceFile();
    boolean var12 = minicopier.Copier.isNotLink(var11);
    boolean var13 = minicopier.Copier.isNotLink(var11);
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test368");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getSourceFile();
    long var11 = var2.getSize();
    java.io.File var12 = var2.getDestinationFolder();
    java.io.File var13 = var2.getDestinationFile();
    long var14 = var2.getSize();
    java.lang.String var15 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var18 = var2.getDestinationFolder();
    var2.changeTargetName("hi!");
    java.lang.String var21 = var2.getDestinationFolderPath();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test369");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test370");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\", "hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    boolean var4 = minicopier.Copier.isNotLink(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test371");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    var0.add("\\hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test372");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    java.util.Iterator var4 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
    boolean var7 = var0.isEmpty();
    java.util.Iterator var8 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test373");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("hi!\\hi!");
    int var5 = var0.getLength();
    java.util.Iterator var6 = var0.getIterator();
    int var7 = var0.getLength();
    var0.add("hi!\\\\hi!\\hi!");
    int var10 = var0.getLength();
    java.util.Iterator var11 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test374");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!");
    long var9 = var2.getSize();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getName();
    java.io.File var12 = var2.getDestinationFile();
    java.lang.String var13 = var2.getSourcePath();
    
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
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test375");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = minicopier.i18n.Language.get("hi!\\\\\\hi!\\hi!\\\\hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test376");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!");
    java.util.Iterator var10 = var0.getIterator();
    int var11 = var0.getLength();
    java.util.Iterator var12 = var0.getIterator();
    var0.add("\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    int var17 = var0.getLength();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 4);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test377");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!\\hi!");
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    java.util.Iterator var8 = var0.getIterator();
    
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
    assertNotNull(var8);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test378");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getSourcePath();
    java.io.File var7 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\");
    java.lang.String var10 = var2.getName();
    java.io.File var11 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test379");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!\\hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!\\hi!\\");
    int var8 = var0.getLength();
    var0.add("\\\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\");
    java.util.Iterator var13 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test380");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test381");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.io.File var4 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\hi!\\\\hi!");
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test382");


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
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.util.Iterator var15 = var0.getIterator();
    
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
    assertNotNull(var15);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test383");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "hi!\\hi!\\hi!\\");
    long var3 = var2.getSize();
    var2.changeTargetName("hi!\\\\hi!\\hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test384");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    int var8 = var0.getLength();
    var0.add("");
    int var11 = var0.getLength();
    var0.add("hi!\\hi!\\hi!\\hi!");
    var0.add("\\hi!\\hi!\\hi!");
    int var16 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 5);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test385");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.io.File var10 = var2.getDestinationFile();
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test386");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\hi!");
    int var6 = var0.getLength();
    int var7 = var0.getLength();
    boolean var8 = var0.isEmpty();
    int var9 = var0.getLength();
    boolean var10 = var0.isEmpty();
    boolean var11 = var0.isEmpty();
    boolean var12 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test387");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!\\hi!\\\\hi!");
    java.lang.String var3 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test388");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getName();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.lang.String var10 = var2.getDestinationFilePath();
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getSourcePath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!");
    java.io.File var15 = var2.getSourceFile();
    
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
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test389");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.lang.String var11 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\\hi!\\hi!"+ "'", var5.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\\hi!\\hi!"+ "'", var6.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "\\hi!\\hi!"+ "'", var8.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test390");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getSourcePath();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test391");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = minicopier.i18n.Language.get("hi!\\hi!\\hi!\\\\");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test392");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    java.io.File var4 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test393");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    long var4 = var2.getSize();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFolder();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test394");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var7 = var0.wasFirstLaunch();
    boolean var8 = var0.wasFirstLaunch();
    boolean var9 = var0.wasFirstLaunch();
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test395");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    long var8 = var2.getSize();
    java.io.File var9 = var2.getSourceFile();
    var2.changeTargetName("hi!\\\\hi!\\hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test396");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test397");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!");
    boolean var6 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!");
    java.util.Iterator var9 = var0.getIterator();
    java.util.Iterator var10 = var0.getIterator();
    java.util.Iterator var11 = var0.getIterator();
    int var12 = var0.getLength();
    int var13 = var0.getLength();
    java.util.Iterator var14 = var0.getIterator();
    var0.add("\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    int var17 = var0.getLength();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 3);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test398");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\", "\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    java.lang.String var4 = var2.getDestinationFolderPath();
    java.lang.String var5 = var2.getSourcePath();
    var2.changeTargetName("\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\hi!\\hi!"+ "'", var4.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test399");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("hi!\\hi!");
    int var5 = var0.getLength();
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    int var8 = var0.getLength();
    var0.add("hi!\\hi!\\hi!\\hi!");
    boolean var11 = var0.isEmpty();
    boolean var12 = var0.isEmpty();
    
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
    assertTrue(var12 == false);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test400");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\\\hi!\\hi!", "\\hi!\\");
    java.lang.String var3 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test401");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "");

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test402");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test403");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("hi!\\hi!");
    var0.add("hi!\\hi!\\hi!");
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\\\\\hi!");
    int var10 = var0.getLength();
    var0.add("\\hi!\\\\hi!\\hi!\\\\hi!");
    var0.add("hi!\\\\\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 4);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test404");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var12 = var0.wasFirstLaunch();
    boolean var13 = var0.wasFirstLaunch();
    boolean var14 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test405");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getDestinationFile();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getDestinationFolderPath();
    java.io.File var12 = var2.getDestinationFile();
    long var13 = var2.getSize();
    java.io.File var14 = var2.getDestinationFolder();
    java.lang.String var15 = var2.getName();
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
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test406");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test407");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    boolean var10 = var0.isEmpty();
    boolean var11 = var0.isEmpty();
    var0.add("\\hi!\\\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!");
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    boolean var18 = var0.isEmpty();
    
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test408");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!");
    var0.add("hi!\\");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("\\hi!\\hi!");
    var0.add("hi!\\\\hi!\\hi!");
    boolean var13 = var0.isEmpty();
    int var14 = var0.getLength();
    java.util.Iterator var15 = var0.getIterator();
    int var16 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 4);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test409");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("");
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getDestinationFilePath();
    long var13 = var2.getSize();
    java.lang.String var14 = var2.getSourcePath();
    
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
    assertTrue("'" + var12 + "' != '" + "hi!\\"+ "'", var12.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test410");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!");
    int var6 = var0.getLength();
    boolean var7 = var0.isEmpty();
    int var8 = var0.getLength();
    java.util.Iterator var9 = var0.getIterator();
    var0.add("hi!\\\\\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test411");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getName();
    long var8 = var2.getSize();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.lang.String var10 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\\\hi!");
    java.lang.String var13 = var2.getSourcePath();
    long var14 = var2.getSize();
    
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
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test412");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    var2.changeTargetName("\\hi!");
    java.io.File var9 = var2.getDestinationFile();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!"+ "'", var12.equals("hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!"));

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test413");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\", "hi!\\hi!\\\\hi!\\\\hi!\\hi!");

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test414");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    var0.add("hi!");
    var0.add("hi!\\");
    var0.add("hi!");
    int var12 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 4);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test415");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\\\hi!\\hi!\\hi!");
    long var7 = var2.getSize();
    java.io.File var8 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test416");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!");
    int var10 = var0.getLength();
    java.util.Iterator var11 = var0.getIterator();
    var0.add("hi!\\hi!\\\\hi!\\hi!");
    java.util.Iterator var14 = var0.getIterator();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test417");


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
    java.io.File var13 = var2.getDestinationFolder();
    java.lang.String var14 = var2.getName();
    long var15 = var2.getSize();
    long var16 = var2.getSize();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test418");


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
    java.io.File var15 = var2.getDestinationFolder();
    java.lang.String var16 = var2.getSourcePath();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test419");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!\\");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.lang.String var5 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!\\hi!"+ "'", var5.equals("hi!\\hi!\\hi!"));

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test420");


    minicopier.i18n.Language.init("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test421");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    var0.add("");
    var0.add("hi!\\hi!\\\\hi!\\hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test422");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var9 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test423");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\", "hi!\\hi!\\");
    java.io.File var3 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\\\hi!\\hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test424");


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
    var0.add("\\hi!\\hi!\\hi!");
    
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

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test425");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getSourcePath();
    long var5 = var2.getSize();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var10 = var2.getDestinationFilePath();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.lang.String var12 = var2.getName();
    var2.changeTargetName("\\hi!\\\\hi!");
    
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
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!\\hi!"+ "'", var10.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!\\hi!"+ "'", var11.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test426");


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
    java.io.File var17 = var2.getDestinationFolder();
    java.io.File var18 = var2.getDestinationFolder();
    java.lang.String var19 = var2.getSourcePath();
    java.lang.String var20 = var2.getName();
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test427");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.io.File var6 = var2.getSourceFile();
    long var7 = var2.getSize();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getName();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.lang.String var11 = var2.getDestinationFolderPath();
    java.lang.String var12 = var2.getDestinationFilePath();
    long var13 = var2.getSize();
    java.io.File var14 = var2.getSourceFile();
    boolean var15 = minicopier.Copier.isNotLink(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test428");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.lang.String var4 = var2.getDestinationFolderPath();
    java.lang.String var5 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var5.equals("hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test429");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getSourcePath();
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

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test430");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test431");


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
    boolean var14 = var0.isEmpty();
    
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
    assertTrue(var14 == false);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test432");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\\\hi!\\\\hi!\\hi!");
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test433");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    int var8 = var0.getLength();
    var0.add("");
    int var11 = var0.getLength();
    java.util.Iterator var12 = var0.getIterator();
    var0.add("hi!\\hi!\\\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test434");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!\\");
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isEmpty();
    int var5 = var0.getLength();
    boolean var6 = var0.isEmpty();
    var0.add("hi!\\\\hi!\\\\hi!\\hi!");
    java.util.Iterator var9 = var0.getIterator();
    java.util.Iterator var10 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test435");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("hi!");
    java.lang.String var11 = var2.getSourcePath();
    var2.changeTargetName("hi!");
    java.lang.String var14 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!"+ "'", var14.equals("hi!\\hi!"));

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test436");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFolder();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test437");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    var0.add("\\hi!");
    java.util.Iterator var11 = var0.getIterator();
    var0.add("hi!\\\\hi!\\hi!");
    int var14 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test438");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    java.io.File var9 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!");
    java.lang.String var12 = var2.getDestinationFolderPath();
    java.lang.String var13 = var2.getName();
    long var14 = var2.getSize();
    java.lang.String var15 = var2.getName();
    java.lang.String var16 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var16.equals("hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test439");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.io.File var4 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test440");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "\\hi!\\hi!\\hi!\\hi!");

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test441");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getSourceFile();
    java.io.File var7 = var2.getDestinationFolder();
    java.io.File var8 = var2.getDestinationFile();
    
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

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test442");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getName();
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getDestinationFilePath();
    var2.changeTargetName("\\\\hi!\\hi!\\hi!\\hi!");
    
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
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test443");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\hi!");
    boolean var11 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!");
    java.util.Iterator var14 = var0.getIterator();
    var0.add("hi!\\hi!");
    boolean var17 = var0.isEmpty();
    boolean var18 = var0.isEmpty();
    java.util.Iterator var19 = var0.getIterator();
    int var20 = var0.getLength();
    var0.add("hi!\\hi!\\hi!\\");
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 5);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test444");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\");
    java.io.File var3 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!\\");
    java.io.File var6 = var2.getSourceFile();
    long var7 = var2.getSize();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getDestinationFile();
    long var11 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!\\hi!\\"+ "'", var8.equals("hi!\\hi!\\hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test445");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!\\hi!\\hi!");
    long var3 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test446");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.lang.String var11 = var2.getName();
    java.lang.String var12 = var2.getName();
    java.io.File var13 = var2.getDestinationFolder();
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
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test447");


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
    boolean var16 = var0.isEmpty();
    int var17 = var0.getLength();
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 4);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test448");


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
    boolean var13 = minicopier.Copier.isNotLink(var12);
    
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
    assertTrue(var13 == true);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test449");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!");
    var0.add("hi!\\");
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\");
    int var12 = var0.getLength();
    java.util.Iterator var13 = var0.getIterator();
    
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
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test450");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getSourceFile();
    java.io.File var5 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!\\\\hi!\\hi!");
    long var8 = var2.getSize();
    java.io.File var9 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test451");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\");

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test452");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!");
    var0.add("hi!\\");
    var0.add("\\hi!\\hi!\\hi!");
    java.util.Iterator var10 = var0.getIterator();
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test453");


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
    long var12 = var2.getSize();
    java.lang.String var13 = var2.getDestinationFolderPath();
    java.io.File var14 = var2.getDestinationFile();
    long var15 = var2.getSize();
    java.io.File var16 = var2.getSourceFile();
    
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
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test454");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test455");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    java.util.Iterator var3 = var0.getIterator();
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    int var6 = var0.getLength();
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    boolean var10 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test456");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.io.File var6 = var2.getSourceFile();
    long var7 = var2.getSize();
    java.io.File var8 = var2.getSourceFile();
    long var9 = var2.getSize();
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
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test457");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getName();
    long var7 = var2.getSize();
    java.lang.String var8 = var2.getSourcePath();
    long var9 = var2.getSize();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getSourcePath();
    var2.changeTargetName("hi!\\\\hi!\\hi!");
    java.io.File var14 = var2.getDestinationFile();
    java.lang.String var15 = var2.getSourcePath();
    java.lang.String var16 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!\\hi!\\\\hi!\\hi!"+ "'", var16.equals("hi!\\hi!\\\\hi!\\hi!"));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test458");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    java.util.Iterator var5 = var0.getIterator();
    int var6 = var0.getLength();
    int var7 = var0.getLength();
    int var8 = var0.getLength();
    boolean var9 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test459");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "");
    java.io.File var3 = var2.getDestinationFolder();
    java.io.File var4 = var2.getDestinationFolder();
    boolean var5 = minicopier.Copier.isNotLink(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test460");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!", "hi!\\\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.lang.String var4 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!"));

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test461");


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
    java.util.Iterator var12 = var0.getIterator();
    var0.add("hi!\\\\\\hi!\\hi!\\\\hi!");
    
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
    assertNotNull(var12);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test462");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("hi!");
    var2.changeTargetName("");
    java.lang.String var13 = var2.getSourcePath();
    java.io.File var14 = var2.getDestinationFolder();
    java.lang.String var15 = var2.getName();
    java.lang.String var16 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!\\"+ "'", var16.equals("hi!\\"));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test463");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFile();
    var2.changeTargetName("\\hi!");
    java.lang.String var10 = var2.getName();
    java.io.File var11 = var2.getSourceFile();
    
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
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test464");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    boolean var3 = var0.isEmpty();
    var0.add("\\hi!\\hi!");
    java.util.Iterator var6 = var0.getIterator();
    var0.add("\\hi!\\\\hi!");
    int var9 = var0.getLength();
    java.util.Iterator var10 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test465");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!"+ "'", var6.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!\\hi!"+ "'", var7.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test466");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getSourcePath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!");
    java.lang.String var7 = var2.getDestinationFolderPath();
    long var8 = var2.getSize();
    java.lang.String var9 = var2.getName();
    java.lang.String var10 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var7.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test467");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("hi!");
    java.lang.String var11 = var2.getSourcePath();
    java.io.File var12 = var2.getSourceFile();
    long var13 = var2.getSize();
    java.lang.String var14 = var2.getDestinationFolderPath();
    java.io.File var15 = var2.getDestinationFile();
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test468");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    var2.changeTargetName("");
    java.lang.String var8 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.lang.String var11 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\"+ "'", var8.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test469");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.io.File var9 = var2.getDestinationFolder();
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
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test470");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    boolean var3 = var0.isEmpty();
    java.util.Iterator var4 = var0.getIterator();
    boolean var5 = var0.isEmpty();
    var0.add("hi!\\");
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    boolean var10 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test471");


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
    java.lang.String var16 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var16 + "' != '" + "hi!\\\\hi!\\hi!\\hi!"+ "'", var16.equals("hi!\\\\hi!\\hi!\\hi!"));

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test472");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    int var5 = var0.getLength();
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    boolean var8 = var0.isEmpty();
    int var9 = var0.getLength();
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test473");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("hi!\\hi!\\hi!\\\\");
    
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

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test474");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.lang.String var6 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!");
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.lang.String var11 = var2.getName();
    var2.changeTargetName("hi!\\\\hi!\\hi!");
    java.lang.String var14 = var2.getDestinationFilePath();
    long var15 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!\\\\hi!\\hi!"+ "'", var14.equals("hi!\\hi!\\\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test475");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getSourceFile();
    long var11 = var2.getSize();
    var2.changeTargetName("\\hi!");
    long var14 = var2.getSize();
    java.io.File var15 = var2.getSourceFile();
    
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
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test476");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\\\hi!", "hi!\\\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!"));

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test477");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getSourcePath();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.io.File var10 = var2.getSourceFile();
    java.io.File var11 = var2.getSourceFile();
    
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
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test478");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getName();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test479");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.lang.String var10 = var2.getDestinationFolderPath();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test480");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!");
    int var10 = var0.getLength();
    java.util.Iterator var11 = var0.getIterator();
    int var12 = var0.getLength();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    int var15 = var0.getLength();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 3);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test481");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.io.File var6 = var2.getDestinationFile();
    var2.changeTargetName("");
    java.io.File var9 = var2.getDestinationFile();
    java.io.File var10 = var2.getSourceFile();
    var2.changeTargetName("\\hi!");
    java.io.File var13 = var2.getDestinationFile();
    java.lang.String var14 = var2.getDestinationFolderPath();
    java.io.File var15 = var2.getSourceFile();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test482");


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
    java.lang.String var15 = var2.getDestinationFolderPath();
    java.io.File var16 = var2.getDestinationFolder();
    boolean var17 = minicopier.Copier.isNotLink(var16);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test483");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!\\hi!\\hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test484");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    var0.add("hi!\\hi!");
    int var6 = var0.getLength();
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    var0.add("\\");
    var0.add("hi!\\hi!");
    java.util.Iterator var13 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test485");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    var2.changeTargetName("");
    java.io.File var7 = var2.getDestinationFolder();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.lang.String var10 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\"+ "'", var9.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test486");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\", "hi!\\hi!\\");
    java.io.File var3 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test487");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.lang.String var10 = var2.getDestinationFolderPath();
    long var11 = var2.getSize();
    java.io.File var12 = var2.getSourceFile();
    var2.changeTargetName("hi!\\");
    java.io.File var15 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test488");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getSourceFile();
    long var11 = var2.getSize();
    java.io.File var12 = var2.getDestinationFolder();
    java.io.File var13 = var2.getDestinationFile();
    long var14 = var2.getSize();
    java.lang.String var15 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var18 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\hi!\\\\hi!");
    java.lang.String var21 = var2.getDestinationFolderPath();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test489");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    long var5 = var2.getSize();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.lang.String var9 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test490");


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
    java.io.File var17 = var2.getDestinationFolder();
    long var18 = var2.getSize();
    java.io.File var19 = var2.getSourceFile();
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test491");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("hi!\\hi!");
    var0.add("hi!\\hi!\\hi!");
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\\\\\hi!");
    int var10 = var0.getLength();
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 4);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test492");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    java.util.Iterator var3 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
    boolean var6 = var0.isEmpty();
    var0.add("\\hi!");
    int var9 = var0.getLength();
    var0.add("\\hi!\\\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test493");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!\\hi!\\\\hi!\\hi!\\\\hi!");

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test494");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!\\hi!");
    var0.add("hi!\\hi!\\");
    var0.add("hi!\\hi!\\hi!\\hi!");
    var0.add("hi!\\\\hi!\\hi!\\hi!");
    var0.add("\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    boolean var14 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test495");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getDestinationFolder();
    java.lang.String var12 = var2.getSourcePath();
    java.lang.String var13 = var2.getSourcePath();
    java.lang.String var14 = var2.getName();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test496");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\");
    var0.add("hi!\\");
    boolean var8 = var0.isEmpty();
    int var9 = var0.getLength();
    java.util.Iterator var10 = var0.getIterator();
    int var11 = var0.getLength();
    int var12 = var0.getLength();
    int var13 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test497");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!", "\\hi!\\\\hi!\\hi!");
    long var3 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test498");


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
    var0.add("\\hi!\\hi!\\");
    
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

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test499");


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
    java.io.File var14 = var2.getSourceFile();
    boolean var15 = minicopier.Copier.isNotLink(var14);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest14.test500");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\\\hi!\\hi!", "hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

}
