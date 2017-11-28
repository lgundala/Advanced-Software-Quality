package randoop;

import junit.framework.*;

public class RandoopTest17 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test1");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test2");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\\\hi!\\hi!");
    java.lang.String var10 = var2.getName();
    java.lang.String var11 = var2.getSourcePath();
    
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test3");


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
    boolean var12 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var16 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var18 = var0.wasFirstLaunch();
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test4");


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
    boolean var12 = var0.wasFirstLaunch();
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
    assertTrue(var15 == false);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test5");


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
    java.io.File var13 = var2.getDestinationFile();
    
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
    assertNotNull(var13);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test6");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getSourcePath();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.lang.String var9 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test7");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    boolean var8 = var0.wasFirstLaunch();
    boolean var9 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test8");


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
    java.lang.String var19 = var2.getSourcePath();
    
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
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test9");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getSourcePath();
    
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

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test10");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    java.util.Iterator var7 = var0.getIterator();
    int var8 = var0.getLength();
    var0.add("\\hi!");
    java.util.Iterator var11 = var0.getIterator();
    int var12 = var0.getLength();
    int var13 = var0.getLength();
    boolean var14 = var0.isEmpty();
    boolean var15 = var0.isEmpty();
    
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
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test11");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = minicopier.i18n.Language.get("hi!\\hi!\\\\\\hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test12");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getSourcePath();
    var2.changeTargetName("hi!\\");
    java.io.File var9 = var2.getDestinationFile();
    java.io.File var10 = var2.getDestinationFile();
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test13");


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
    boolean var12 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var15 = var0.wasFirstLaunch();
    boolean var16 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test14");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getSourceFile();
    java.io.File var7 = var2.getDestinationFolder();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getDestinationFolderPath();
    long var10 = var2.getSize();
    long var11 = var2.getSize();
    long var12 = var2.getSize();
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
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test15");


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
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test16");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFolder();
    long var8 = var2.getSize();
    long var9 = var2.getSize();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getSourcePath();
    java.io.File var12 = var2.getDestinationFile();
    java.lang.String var13 = var2.getSourcePath();
    long var14 = var2.getSize();
    java.io.File var15 = var2.getDestinationFile();
    
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
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test17");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    var0.add("\\hi!");
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test18");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    boolean var6 = minicopier.Copier.isNotLink(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test19");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("hi!\\hi!");
    var0.add("hi!\\hi!\\\\hi!\\hi!");
    boolean var7 = var0.isEmpty();
    int var8 = var0.getLength();
    int var9 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test20");


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
    java.io.File var12 = var2.getDestinationFolder();
    java.lang.String var13 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!"+ "'", var13.equals("hi!\\hi!"));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test21");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var10 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var13 = var0.wasFirstLaunch();
    
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test22");


    minicopier.Basket var0 = new minicopier.Basket();
    boolean var1 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\hi!");
    var0.add("\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test23");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\\\hi!\\hi!", "hi!\\hi!\\");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var5.equals("hi!\\hi!\\hi!\\hi!"));

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test24");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    long var4 = var2.getSize();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getSourceFile();
    
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
    assertNotNull(var9);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test25");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!");
    var0.add("hi!\\\\hi!");
    boolean var14 = var0.isEmpty();
    boolean var15 = var0.isEmpty();
    int var16 = var0.getLength();
    var0.add("hi!\\hi!\\hi!");
    java.util.Iterator var19 = var0.getIterator();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test26");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getDestinationFolderPath();
    
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
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test27");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!\\");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getName();
    java.io.File var7 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test28");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!\\\\hi!\\hi!\\\\hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test29");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    java.lang.String var9 = var2.getName();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getSourcePath();
    var2.changeTargetName("hi!\\\\hi!\\hi!");
    var2.changeTargetName("\\hi!");
    long var16 = var2.getSize();
    var2.changeTargetName("hi!\\hi!\\");
    java.lang.String var19 = var2.getDestinationFolderPath();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test30");


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
    java.lang.String var15 = var2.getName();
    var2.changeTargetName("\\hi!\\hi!\\\\hi!");
    java.lang.String var18 = var2.getDestinationFolderPath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test31");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    boolean var3 = var0.isEmpty();
    java.util.Iterator var4 = var0.getIterator();
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!\\hi!");
    boolean var8 = var0.isEmpty();
    
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

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test32");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("hi!");
    java.lang.String var11 = var2.getName();
    java.lang.String var12 = var2.getDestinationFilePath();
    long var13 = var2.getSize();
    long var14 = var2.getSize();
    java.io.File var15 = var2.getDestinationFolder();
    boolean var16 = minicopier.Copier.isNotLink(var15);
    
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
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test33");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\hi!", "hi!\\\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test34");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\");
    var0.add("hi!\\\\\\hi!");
    boolean var13 = var0.isEmpty();
    
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

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test35");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\\\hi!", "hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    long var4 = var2.getSize();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var6.equals("hi!\\hi!\\hi!\\hi!"));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test36");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("\\hi!");
    boolean var9 = var0.isEmpty();
    int var10 = var0.getLength();
    java.util.Iterator var11 = var0.getIterator();
    boolean var12 = var0.isEmpty();
    int var13 = var0.getLength();
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test37");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test38");


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
    int var13 = var0.getLength();
    boolean var14 = var0.isEmpty();
    int var15 = var0.getLength();
    java.util.Iterator var16 = var0.getIterator();
    
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
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test39");


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
    java.io.File var13 = var2.getDestinationFile();
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
    assertNotNull(var14);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test40");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    var0.add("hi!\\hi!");
    boolean var8 = var0.isEmpty();
    java.util.Iterator var9 = var0.getIterator();
    var0.add("hi!\\hi!");
    java.util.Iterator var12 = var0.getIterator();
    var0.add("");
    boolean var15 = var0.isEmpty();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test41");


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
    long var14 = var2.getSize();
    java.io.File var15 = var2.getDestinationFolder();
    boolean var16 = minicopier.Copier.isNotLink(var15);
    
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
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test42");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "\\hi!\\hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getDestinationFolderPath();
    java.io.File var5 = var2.getSourceFile();
    var2.changeTargetName("\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\hi!\\hi!"+ "'", var4.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test43");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!");
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    var0.add("hi!\\hi!\\\\hi!");
    var0.add("hi!\\hi!\\");
    int var12 = var0.getLength();
    int var13 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test44");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getSourcePath();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\\hi!"+ "'", var6.equals("\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test45");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!");
    long var3 = var2.getSize();
    var2.changeTargetName("hi!\\\\hi!");
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!"+ "'", var6.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var7.equals("hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test46");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getSourceFile();
    long var11 = var2.getSize();
    java.io.File var12 = var2.getDestinationFile();
    java.lang.String var13 = var2.getDestinationFolderPath();
    java.io.File var14 = var2.getSourceFile();
    var2.changeTargetName("\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test47");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    boolean var2 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    boolean var5 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test48");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    java.util.Iterator var4 = var0.getIterator();
    boolean var5 = var0.isEmpty();
    boolean var6 = var0.isEmpty();
    var0.add("hi!\\hi!\\\\hi!\\hi!");
    int var9 = var0.getLength();
    
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
    assertTrue(var9 == 1);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test49");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\");
    java.io.File var3 = var2.getDestinationFile();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    boolean var7 = minicopier.Copier.isNotLink(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test50");


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
    java.io.File var15 = var2.getDestinationFolder();
    java.io.File var16 = var2.getSourceFile();
    java.io.File var17 = var2.getDestinationFile();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test51");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!");
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getDestinationFolder();
    var2.changeTargetName("hi!");
    java.io.File var13 = var2.getSourceFile();
    java.lang.String var14 = var2.getDestinationFolderPath();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test52");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.lang.String var9 = var2.getSourcePath();
    var2.changeTargetName("hi!\\hi!\\hi!");
    long var12 = var2.getSize();
    java.io.File var13 = var2.getDestinationFolder();
    java.io.File var14 = var2.getDestinationFolder();
    java.lang.String var15 = var2.getName();
    
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
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test53");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getName();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getSourcePath();
    java.io.File var12 = var2.getDestinationFolder();
    
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test54");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("\\hi!");
    java.io.File var11 = var2.getSourceFile();
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
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test55");


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
    boolean var15 = var0.isEmpty();
    int var16 = var0.getLength();
    int var17 = var0.getLength();
    java.util.Iterator var18 = var0.getIterator();
    int var19 = var0.getLength();
    java.util.Iterator var20 = var0.getIterator();
    int var21 = var0.getLength();
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 4);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test56");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\", "hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test57");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("\\hi!");
    boolean var9 = var0.isEmpty();
    int var10 = var0.getLength();
    int var11 = var0.getLength();
    java.util.Iterator var12 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test58");


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
    java.lang.String var15 = var2.getDestinationFilePath();
    long var16 = var2.getSize();
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
    assertTrue("'" + var15 + "' != '" + "hi!\\hi!\\hi!"+ "'", var15.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test59");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getDestinationFolder();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!");
    long var12 = var2.getSize();
    java.lang.String var13 = var2.getDestinationFolderPath();
    java.lang.String var14 = var2.getDestinationFolderPath();
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test60");


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
    int var11 = var0.getLength();
    int var12 = var0.getLength();
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test61");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getName();
    java.io.File var8 = var2.getSourceFile();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\");
    java.io.File var11 = var2.getDestinationFolder();
    long var12 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test62");


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
    java.lang.String var16 = var2.getDestinationFolderPath();
    long var17 = var2.getSize();
    java.io.File var18 = var2.getDestinationFolder();
    java.io.File var19 = var2.getDestinationFile();
    java.io.File var20 = var2.getSourceFile();
    
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
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test63");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getSourceFile();
    java.lang.String var11 = var2.getName();
    java.lang.String var12 = var2.getDestinationFilePath();
    java.lang.String var13 = var2.getName();
    java.lang.String var14 = var2.getSourcePath();
    java.lang.String var15 = var2.getSourcePath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.lang.String var18 = var2.getDestinationFilePath();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var18.equals("hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test64");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    java.util.Iterator var10 = var0.getIterator();
    var0.add("hi!\\hi!\\");
    int var13 = var0.getLength();
    boolean var14 = var0.isEmpty();
    java.util.Iterator var15 = var0.getIterator();
    
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
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test65");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getSourceFile();
    java.io.File var6 = var2.getDestinationFile();
    long var7 = var2.getSize();
    long var8 = var2.getSize();
    java.lang.String var9 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test66");


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
    java.io.File var14 = var2.getDestinationFolder();
    java.lang.String var15 = var2.getName();
    java.lang.String var16 = var2.getSourcePath();
    long var17 = var2.getSize();
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!\\hi!\\hi!"+ "'", var19.equals("hi!\\hi!\\hi!"));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test67");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test68");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getName();
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test69");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getSourcePath();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getName();
    java.io.File var9 = var2.getDestinationFile();
    java.io.File var10 = var2.getDestinationFile();
    boolean var11 = minicopier.Copier.isNotLink(var10);
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test70");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    long var4 = var2.getSize();
    java.lang.String var5 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!"+ "'", var3.equals("\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\\hi!"+ "'", var5.equals("\\hi!"));

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test71");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = minicopier.i18n.Language.get("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test72");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!", "hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test73");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getSourcePath();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.lang.String var8 = var2.getName();
    var2.changeTargetName("hi!\\\\hi!\\hi!\\hi!");
    
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
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test74");


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
    boolean var15 = var0.isEmpty();
    int var16 = var0.getLength();
    int var17 = var0.getLength();
    boolean var18 = var0.isEmpty();
    var0.add("hi!\\\\hi!\\hi!\\hi!");
    var0.add("hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test75");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getSourcePath();
    long var5 = var2.getSize();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getDestinationFolderPath();
    java.lang.String var12 = var2.getDestinationFilePath();
    java.io.File var13 = var2.getDestinationFile();
    long var14 = var2.getSize();
    
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test76");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!");
    var2.changeTargetName("\\\\hi!\\hi!\\hi!\\hi!");
    java.lang.String var5 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test77");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\hi!");
    var0.add("\\hi!\\hi!");
    var0.add("");
    var0.add("hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test78");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    boolean var4 = var0.isEmpty();
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    int var7 = var0.getLength();
    java.util.Iterator var8 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test79");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    int var3 = var0.getLength();
    java.util.Iterator var4 = var0.getIterator();
    int var5 = var0.getLength();
    var0.add("\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test80");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    boolean var10 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!");
    boolean var13 = var0.isEmpty();
    boolean var14 = var0.isEmpty();
    java.util.Iterator var15 = var0.getIterator();
    var0.add("\\");
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test81");


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
    java.util.Iterator var13 = var0.getIterator();
    boolean var14 = var0.isEmpty();
    int var15 = var0.getLength();
    boolean var16 = var0.isEmpty();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test82");


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
    long var13 = var2.getSize();
    var2.changeTargetName("hi!\\\\hi!\\hi!\\\\hi!");
    
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
    assertTrue(var13 == 0L);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test83");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    var0.add("hi!");
    boolean var8 = var0.isEmpty();
    java.util.Iterator var9 = var0.getIterator();
    
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

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test84");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\", "hi!\\\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    java.lang.String var4 = var2.getDestinationFolderPath();
    java.io.File var5 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test85");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!\\\\hi!\\\\hi!\\hi!");

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test86");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!\\hi!");
    var0.add("\\hi!\\hi!");
    int var8 = var0.getLength();
    java.util.Iterator var9 = var0.getIterator();
    int var10 = var0.getLength();
    boolean var11 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test87");


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
    boolean var14 = minicopier.Copier.isNotLink(var13);
    boolean var15 = minicopier.Copier.isNotLink(var13);
    
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
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test88");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    int var8 = var0.getLength();
    int var9 = var0.getLength();
    boolean var10 = var0.isEmpty();
    var0.add("\\hi!\\\\hi!\\hi!");
    var0.add("hi!\\\\hi!\\hi!\\hi!");
    boolean var15 = var0.isEmpty();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test89");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!");
    long var9 = var2.getSize();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getSourcePath();
    java.io.File var12 = var2.getDestinationFolder();
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
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test90");


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
    var0.add("\\hi!\\");
    
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

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test91");


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
    java.io.File var14 = var2.getDestinationFolder();
    java.lang.String var15 = var2.getName();
    java.lang.String var16 = var2.getSourcePath();
    long var17 = var2.getSize();
    long var18 = var2.getSize();
    java.io.File var19 = var2.getSourceFile();
    java.lang.String var20 = var2.getSourcePath();
    java.io.File var21 = var2.getDestinationFile();
    boolean var22 = minicopier.Copier.isNotLink(var21);
    boolean var23 = minicopier.Copier.isNotLink(var21);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test92");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    boolean var4 = var0.isEmpty();
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\hi!\\");
    boolean var8 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test93");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getSourceFile();
    boolean var10 = minicopier.Copier.isNotLink(var9);
    
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
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test94");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getDestinationFolderPath();
    long var5 = var2.getSize();
    java.io.File var6 = var2.getDestinationFile();
    var2.changeTargetName("\\hi!\\");
    var2.changeTargetName("\\hi!\\hi!\\hi!");
    java.lang.String var11 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test95");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\\\hi!\\hi!", "hi!\\");
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    java.lang.String var5 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var5.equals("hi!\\hi!\\hi!\\hi!"));

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test96");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = minicopier.i18n.Language.get("hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test97");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getSourceFile();
    java.io.File var8 = var2.getSourceFile();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getSourcePath();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test98");


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
    java.lang.String var14 = var2.getName();
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test99");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("");
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    boolean var11 = var0.isEmpty();
    var0.add("\\hi!");
    boolean var14 = var0.isEmpty();
    boolean var15 = var0.isEmpty();
    boolean var16 = var0.isEmpty();
    boolean var17 = var0.isEmpty();
    int var18 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 4);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test100");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    int var6 = var0.getLength();
    var0.add("hi!\\hi!\\\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test101");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\\\hi!", "hi!\\hi!\\\\hi!\\hi!\\hi!");

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test102");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "\\hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\hi!\\hi!"+ "'", var4.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test103");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\hi!\\", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test104");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.lang.String var10 = var2.getSourcePath();
    
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

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test105");


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
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!");
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test106");


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
    java.lang.String var16 = var2.getDestinationFolderPath();
    long var17 = var2.getSize();
    java.io.File var18 = var2.getDestinationFolder();
    java.io.File var19 = var2.getDestinationFile();
    boolean var20 = minicopier.Copier.isNotLink(var19);
    
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
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test107");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!", "hi!\\\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.io.File var6 = var2.getSourceFile();
    java.io.File var7 = var2.getSourceFile();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var5.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test108");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    boolean var5 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!");
    int var8 = var0.getLength();
    var0.add("hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 3);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test109");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\");
    var0.add("");
    int var8 = var0.getLength();
    java.util.Iterator var9 = var0.getIterator();
    java.util.Iterator var10 = var0.getIterator();
    boolean var11 = var0.isEmpty();
    int var12 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test110");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getDestinationFolder();
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test111");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    java.util.Iterator var10 = var0.getIterator();
    java.util.Iterator var11 = var0.getIterator();
    boolean var12 = var0.isEmpty();
    int var13 = var0.getLength();
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test112");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("hi!\\hi!\\");
    int var5 = var0.getLength();
    int var6 = var0.getLength();
    boolean var7 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test113");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!");
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFile();
    java.lang.String var11 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.lang.String var14 = var2.getDestinationFilePath();
    java.lang.String var15 = var2.getSourcePath();
    java.io.File var16 = var2.getSourceFile();
    
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var14.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test114");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    long var8 = var2.getSize();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    long var11 = var2.getSize();
    java.io.File var12 = var2.getSourceFile();
    java.lang.String var13 = var2.getSourcePath();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test115");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = minicopier.i18n.Language.get("\\\\hi!\\hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test116");


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
    var0.add("\\hi!\\hi!");
    java.util.Iterator var15 = var0.getIterator();
    boolean var16 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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
    assertTrue(var16 == false);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test117");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getDestinationFolder();
    var2.changeTargetName("\\hi!\\hi!\\\\hi!");
    var2.changeTargetName("hi!\\hi!\\\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test118");


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
    java.lang.String var16 = var2.getName();
    
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
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test119");


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
    java.lang.String var22 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var22 + "' != '" + "hi!\\"+ "'", var22.equals("hi!\\"));

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test120");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    int var8 = var0.getLength();
    var0.add("\\hi!");
    int var11 = var0.getLength();
    var0.add("hi!\\hi!\\");
    int var14 = var0.getLength();
    
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
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test121");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.io.File var9 = var2.getDestinationFile();
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
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test122");


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
    var0.add("hi!\\\\hi!");
    int var16 = var0.getLength();
    
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
    assertTrue(var16 == 5);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test123");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.io.File var4 = var2.getSourceFile();
    boolean var5 = minicopier.Copier.isNotLink(var4);
    boolean var6 = minicopier.Copier.isNotLink(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test124");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFile();
    long var8 = var2.getSize();
    long var9 = var2.getSize();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var12 = var2.getSourceFile();
    java.lang.String var13 = var2.getDestinationFolderPath();
    
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
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test125");


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
    var2.changeTargetName("hi!");
    var2.changeTargetName("\\hi!\\hi!\\\\hi!");
    java.io.File var17 = var2.getDestinationFile();
    boolean var18 = minicopier.Copier.isNotLink(var17);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test126");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\");
    java.io.File var3 = var2.getDestinationFile();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    java.io.File var7 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test127");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\\\hi!\\hi!\\\\hi!");
    java.io.File var3 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test128");


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
    java.lang.String var15 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var15 + "' != '" + "hi!\\hi!\\\\hi!"+ "'", var15.equals("hi!\\hi!\\\\hi!"));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test129");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    int var8 = var0.getLength();
    var0.add("\\hi!");
    boolean var11 = var0.isEmpty();
    java.util.Iterator var12 = var0.getIterator();
    var0.add("hi!\\hi!\\\\\\hi!");
    
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
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test130");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getSourcePath();
    long var6 = var2.getSize();
    long var7 = var2.getSize();
    java.lang.String var8 = var2.getName();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getDestinationFilePath();
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
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!\\hi!"+ "'", var10.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!\\hi!"+ "'", var11.equals("hi!\\hi!\\hi!"));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test131");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test132");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    var2.changeTargetName("");
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var9 = var2.getDestinationFilePath();
    java.lang.String var10 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!\\hi!"+ "'", var9.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test133");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test134");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    var2.changeTargetName("");
    java.lang.String var8 = var2.getDestinationFilePath();
    java.lang.String var9 = var2.getName();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getName();
    java.lang.String var12 = var2.getDestinationFilePath();
    java.lang.String var13 = var2.getDestinationFilePath();
    java.lang.String var14 = var2.getDestinationFilePath();
    java.lang.String var15 = var2.getSourcePath();
    java.lang.String var16 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\"+ "'", var8.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\"+ "'", var12.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\"+ "'", var13.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\"+ "'", var14.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test135");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!", "\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test136");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    long var7 = var2.getSize();
    java.io.File var8 = var2.getSourceFile();
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.io.File var11 = var2.getDestinationFile();
    boolean var12 = minicopier.Copier.isNotLink(var11);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test137");


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
    var0.add("hi!\\hi!\\hi!\\\\hi!\\hi!\\hi!");
    
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

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test138");


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
    java.util.Iterator var18 = var0.getIterator();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test139");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    int var7 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var10 = var0.getIterator();
    var0.add("hi!\\hi!");
    var0.add("hi!\\\\hi!\\hi!\\hi!");
    int var15 = var0.getLength();
    int var16 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 5);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test140");


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
    int var13 = var0.getLength();
    boolean var14 = var0.isEmpty();
    boolean var15 = var0.isEmpty();
    boolean var16 = var0.isEmpty();
    
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
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test141");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\\\hi!", "\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test142");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\");
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\hi!\\");
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getSourceFile();
    long var12 = var2.getSize();
    java.lang.String var13 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!\\"+ "'", var6.equals("hi!\\hi!\\hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!\\hi!"+ "'", var10.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!\\hi!"+ "'", var13.equals("hi!\\hi!\\hi!"));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test143");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    boolean var8 = var0.isEmpty();
    java.util.Iterator var9 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test144");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test145");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    var2.changeTargetName("hi!");
    java.lang.String var5 = var2.getSourcePath();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.lang.String var10 = var2.getDestinationFilePath();
    java.lang.String var11 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!"+ "'", var10.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test146");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFolder();
    boolean var5 = minicopier.Copier.isNotLink(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test147");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!\\\\hi!\\hi!\\\\hi!");
    var2.changeTargetName("\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    long var5 = var2.getSize();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getName();
    long var8 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test148");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "");

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test149");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    var2.changeTargetName("");
    java.lang.String var8 = var2.getDestinationFilePath();
    java.lang.String var9 = var2.getName();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getName();
    java.lang.String var12 = var2.getDestinationFilePath();
    long var13 = var2.getSize();
    java.lang.String var14 = var2.getSourcePath();
    java.lang.String var15 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\"+ "'", var8.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\"+ "'", var12.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!\\"+ "'", var15.equals("hi!\\"));

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test150");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    var2.changeTargetName("\\hi!");
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFolderPath();
    java.lang.String var12 = var2.getName();
    java.lang.String var13 = var2.getDestinationFilePath();
    java.lang.String var14 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\\\hi!"+ "'", var13.equals("hi!\\\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\\\hi!"+ "'", var14.equals("hi!\\\\hi!"));

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test151");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getName();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getName();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.lang.String var12 = var2.getDestinationFolderPath();
    
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
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test152");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test153");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getName();
    long var7 = var2.getSize();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getName();
    java.lang.String var10 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test154");


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
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!");
    
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

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test155");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getDestinationFolderPath();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test156");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "");
    var2.changeTargetName("hi!");
    long var5 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test157");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\\\hi!\\hi!", "\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!"+ "'", var3.equals("\\hi!"));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test158");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\");
    
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

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test159");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\", "hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test160");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getName();
    long var7 = var2.getSize();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test161");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    var2.changeTargetName("");
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFile();
    java.io.File var10 = var2.getDestinationFile();
    boolean var11 = minicopier.Copier.isNotLink(var10);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test162");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\");
    java.io.File var3 = var2.getSourceFile();
    long var4 = var2.getSize();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test163");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test164");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getSourceFile();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.io.File var10 = var2.getDestinationFile();
    
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
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test165");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    java.util.Iterator var4 = var0.getIterator();
    int var5 = var0.getLength();
    java.util.Iterator var6 = var0.getIterator();
    int var7 = var0.getLength();
    boolean var8 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test166");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    long var3 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test167");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    long var7 = var2.getSize();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test168");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\", "\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFolder();
    boolean var4 = minicopier.Copier.isNotLink(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test169");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    int var6 = var0.getLength();
    var0.add("");
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!");
    boolean var11 = var0.isEmpty();
    boolean var12 = var0.isEmpty();
    java.util.Iterator var13 = var0.getIterator();
    int var14 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test170");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!", "hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.lang.String var4 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test171");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    boolean var9 = var0.isEmpty();
    java.util.Iterator var10 = var0.getIterator();
    int var11 = var0.getLength();
    boolean var12 = var0.isEmpty();
    var0.add("");
    var0.add("\\hi!\\hi!");
    
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test172");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getSourceFile();
    var2.changeTargetName("hi!\\\\\\hi!");
    java.io.File var12 = var2.getSourceFile();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test173");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    long var4 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test174");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    var0.add("\\hi!");
    java.util.Iterator var11 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
    java.util.Iterator var14 = var0.getIterator();
    java.util.Iterator var15 = var0.getIterator();
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test175");


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
    long var14 = var2.getSize();
    long var15 = var2.getSize();
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
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\"+ "'", var13.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!\\"+ "'", var16.equals("hi!\\"));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test176");


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
    boolean var15 = var0.isEmpty();
    boolean var16 = var0.isEmpty();
    java.util.Iterator var17 = var0.getIterator();
    boolean var18 = var0.isEmpty();
    boolean var19 = var0.isEmpty();
    boolean var20 = var0.isEmpty();
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test177");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("hi!\\hi!");
    int var5 = var0.getLength();
    boolean var6 = var0.isEmpty();
    java.util.Iterator var7 = var0.getIterator();
    var0.add("\\hi!\\hi!\\hi!");
    boolean var10 = var0.isEmpty();
    java.util.Iterator var11 = var0.getIterator();
    int var12 = var0.getLength();
    java.util.Iterator var13 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test178");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFolder();
    var2.changeTargetName("\\hi!\\");
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test179");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFile();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test180");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getName();
    long var7 = var2.getSize();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getName();
    var2.changeTargetName("\\\\hi!\\hi!\\hi!\\hi!");
    java.lang.String var12 = var2.getDestinationFolderPath();
    
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
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test181");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\hi!");
    var0.add("\\hi!\\hi!\\\\hi!");
    boolean var8 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test182");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getSourcePath();
    
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
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test183");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!", "hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.lang.String var4 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!"));

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test184");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\", "\\hi!\\\\hi!\\hi!\\\\hi!");

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test185");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\");
    java.lang.String var13 = var2.getName();
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!\\hi!"+ "'", var10.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!\\hi!\\"+ "'", var14.equals("hi!\\hi!\\hi!\\"));

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test186");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.io.File var7 = var2.getSourceFile();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getName();
    long var10 = var2.getSize();
    java.io.File var11 = var2.getDestinationFolder();
    boolean var12 = minicopier.Copier.isNotLink(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test187");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!", "hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test188");


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
    var2.changeTargetName("\\hi!");
    java.io.File var20 = var2.getSourceFile();
    java.io.File var21 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!");
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test189");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getName();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getDestinationFolderPath();
    long var10 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test190");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test191");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    int var8 = var0.getLength();
    boolean var9 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test192");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\");
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.lang.String var14 = var2.getDestinationFilePath();
    java.io.File var15 = var2.getDestinationFolder();
    java.io.File var16 = var2.getSourceFile();
    
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
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!"+ "'", var14.equals("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test193");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\\\hi!", "\\hi!");
    long var3 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test194");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!");
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

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test195");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!\\");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.lang.String var4 = var2.getDestinationFolderPath();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test196");


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
    java.io.File var19 = var2.getDestinationFolder();
    java.lang.String var20 = var2.getDestinationFilePath();
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!"+ "'", var20.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!"));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test197");


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
    java.lang.String var15 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!"+ "'", var18.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!"));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test198");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getSourceFile();
    long var7 = var2.getSize();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test199");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getSourcePath();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getDestinationFolder();
    boolean var11 = minicopier.Copier.isNotLink(var10);
    
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
    assertTrue(var11 == true);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test200");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test201");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!\\hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!\\hi!\\");
    int var8 = var0.getLength();
    int var9 = var0.getLength();
    boolean var10 = var0.isEmpty();
    int var11 = var0.getLength();
    java.util.Iterator var12 = var0.getIterator();
    int var13 = var0.getLength();
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
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test202");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.lang.String var10 = var2.getDestinationFolderPath();
    
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

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test203");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.lang.String var11 = var2.getName();
    java.lang.String var12 = var2.getDestinationFolderPath();
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test204");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.io.File var6 = var2.getSourceFile();
    long var7 = var2.getSize();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getSourcePath();
    var2.changeTargetName("hi!\\\\\\hi!");
    
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
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test205");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getSourceFile();
    var2.changeTargetName("");
    java.io.File var11 = var2.getDestinationFile();
    java.io.File var12 = var2.getDestinationFolder();
    long var13 = var2.getSize();
    java.io.File var14 = var2.getDestinationFile();
    java.lang.String var15 = var2.getDestinationFolderPath();
    java.io.File var16 = var2.getSourceFile();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test206");


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
    boolean var12 = var0.wasFirstLaunch();
    var0.createConfigFile();
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
    assertTrue(var12 == false);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test207");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\");
    java.util.Iterator var4 = var0.getIterator();
    boolean var5 = var0.isEmpty();
    int var6 = var0.getLength();
    int var7 = var0.getLength();
    var0.add("hi!\\\\hi!\\hi!\\hi!\\");
    boolean var10 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test208");


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
    java.lang.String var16 = var2.getDestinationFolderPath();
    
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
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test209");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getSourceFile();
    var2.changeTargetName("hi!\\");
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\\\hi!\\hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!\\hi!\\"+ "'", var8.equals("hi!\\hi!\\hi!\\"));

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test210");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    int var7 = var0.getLength();
    var0.add("hi!\\\\hi!\\hi!");
    int var10 = var0.getLength();
    int var11 = var0.getLength();
    int var12 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test211");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    java.lang.String var9 = var2.getName();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getDestinationFolderPath();
    java.io.File var12 = var2.getDestinationFile();
    java.io.File var13 = var2.getDestinationFolder();
    java.io.File var14 = var2.getSourceFile();
    boolean var15 = minicopier.Copier.isNotLink(var14);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test212");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!", "hi!");
    java.io.File var3 = var2.getDestinationFolder();
    java.lang.String var4 = var2.getDestinationFolderPath();
    java.io.File var5 = var2.getDestinationFolder();
    boolean var6 = minicopier.Copier.isNotLink(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test213");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.io.File var4 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test214");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    long var4 = var2.getSize();
    java.io.File var5 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test215");


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
    java.io.File var13 = var2.getDestinationFile();
    java.lang.String var14 = var2.getDestinationFolderPath();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test216");


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
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var14 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var17 = var0.wasFirstLaunch();
    boolean var18 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var20 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var22 = var0.wasFirstLaunch();
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test217");


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
    java.io.File var18 = var2.getDestinationFile();
    java.io.File var19 = var2.getDestinationFile();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test218");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\\\hi!\\\\hi!\\hi!", "hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test219");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!", "\\");
    java.lang.String var3 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test220");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getSourceFile();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getDestinationFolderPath();
    long var10 = var2.getSize();
    java.io.File var11 = var2.getDestinationFolder();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test221");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!", "hi!\\hi!\\");

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test222");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getName();
    java.io.File var5 = var2.getDestinationFile();
    var2.changeTargetName("\\hi!\\hi!\\hi!");
    java.io.File var8 = var2.getDestinationFolder();
    boolean var9 = minicopier.Copier.isNotLink(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test223");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test224");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.io.File var11 = var2.getDestinationFolder();
    java.lang.String var12 = var2.getSourcePath();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test225");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test226");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFolder();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test227");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\\\hi!\\hi!\\hi!");
    java.lang.String var7 = var2.getName();
    long var8 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test228");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!");
    int var10 = var0.getLength();
    boolean var11 = var0.isEmpty();
    java.util.Iterator var12 = var0.getIterator();
    var0.add("hi!\\\\hi!\\hi!\\hi!");
    var0.add("\\hi!\\");
    boolean var17 = var0.isEmpty();
    java.util.Iterator var18 = var0.getIterator();
    
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test229");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    var2.changeTargetName("");
    java.io.File var8 = var2.getDestinationFile();
    java.io.File var9 = var2.getDestinationFile();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test230");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\\\hi!", "hi!\\hi!\\\\hi!\\hi!\\\\hi!");

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test231");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    var2.changeTargetName("");
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var9 = var2.getDestinationFilePath();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getDestinationFolderPath();
    java.lang.String var12 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!\\hi!"+ "'", var9.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test232");


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
    long var15 = var2.getSize();
    java.io.File var16 = var2.getDestinationFile();
    java.io.File var17 = var2.getDestinationFile();
    boolean var18 = minicopier.Copier.isNotLink(var17);
    
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
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test233");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getName();
    long var5 = var2.getSize();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test234");


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
    var2.changeTargetName("hi!\\hi!\\");
    java.lang.String var15 = var2.getName();
    
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
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test235");


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
    int var12 = var0.getLength();
    
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
    assertTrue(var12 == 2);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test236");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    var2.changeTargetName("");
    java.lang.String var8 = var2.getDestinationFilePath();
    java.lang.String var9 = var2.getName();
    java.lang.String var10 = var2.getSourcePath();
    java.lang.String var11 = var2.getName();
    java.lang.String var12 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\"+ "'", var8.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test237");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.io.File var7 = var2.getDestinationFolder();
    java.io.File var8 = var2.getDestinationFile();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getName();
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getName();
    
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
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test238");


    minicopier.i18n.Language.init("\\hi!\\hi!\\\\\\hi!\\hi!\\hi!\\hi!");

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test239");


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
    long var20 = var2.getSize();
    java.io.File var21 = var2.getDestinationFile();
    java.io.File var22 = var2.getDestinationFile();
    
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
    assertTrue(var20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test240");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!", "\\hi!\\hi!\\hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test241");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getSourcePath();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getDestinationFile();
    
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

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test242");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    var0.add("\\hi!");
    java.util.Iterator var11 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
    java.util.Iterator var14 = var0.getIterator();
    java.util.Iterator var15 = var0.getIterator();
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test243");


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
    java.io.File var14 = var2.getDestinationFolder();
    java.lang.String var15 = var2.getName();
    java.lang.String var16 = var2.getSourcePath();
    long var17 = var2.getSize();
    java.io.File var18 = var2.getSourceFile();
    boolean var19 = minicopier.Copier.isNotLink(var18);
    boolean var20 = minicopier.Copier.isNotLink(var18);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test244");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.lang.String var10 = var2.getName();
    java.lang.String var11 = var2.getDestinationFilePath();
    long var12 = var2.getSize();
    java.lang.String var13 = var2.getName();
    
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
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test245");


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
    long var14 = var2.getSize();
    java.io.File var15 = var2.getDestinationFile();
    var2.changeTargetName("\\hi!\\hi!");
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
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!"+ "'", var13.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test246");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    var0.add("hi!\\");
    var0.add("hi!\\\\hi!\\hi!\\\\hi!");
    var0.add("\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test247");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!\\hi!\\\\hi!");

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test248");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    java.util.Iterator var7 = var0.getIterator();
    boolean var8 = var0.isEmpty();
    boolean var9 = var0.isEmpty();
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test249");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!");
    int var10 = var0.getLength();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\");
    
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

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test250");


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
    long var13 = var2.getSize();
    java.lang.String var14 = var2.getName();
    
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
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test251");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\\\hi!", "hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test252");


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
    java.io.File var14 = var2.getSourceFile();
    boolean var15 = minicopier.Copier.isNotLink(var14);
    boolean var16 = minicopier.Copier.isNotLink(var14);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test253");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    int var8 = var0.getLength();
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    var0.add("hi!\\\\hi!\\hi!\\hi!");
    int var13 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test254");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!");

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test255");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.lang.String var11 = var2.getSourcePath();
    java.lang.String var12 = var2.getName();
    java.io.File var13 = var2.getDestinationFolder();
    java.io.File var14 = var2.getDestinationFolder();
    
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test256");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getName();
    java.lang.String var7 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\");
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getSourceFile();
    boolean var12 = minicopier.Copier.isNotLink(var11);
    
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
    assertTrue(var12 == true);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test257");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\hi!\\", "\\");

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test258");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getName();
    long var7 = var2.getSize();
    java.lang.String var8 = var2.getSourcePath();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!\\\\hi!");
    java.io.File var13 = var2.getSourceFile();
    java.io.File var14 = var2.getSourceFile();
    var2.changeTargetName("\\hi!\\");
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test259");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getSourcePath();
    long var5 = var2.getSize();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.io.File var11 = var2.getDestinationFile();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test260");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\", "\\hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getSourcePath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!");
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.lang.String var10 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\hi!\\hi!"+ "'", var4.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\\hi!\\hi!"+ "'", var5.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "\\hi!"+ "'", var9.equals("\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test261");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    int var7 = var0.getLength();
    var0.add("hi!\\\\hi!\\hi!");
    java.util.Iterator var10 = var0.getIterator();
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test262");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!");
    var0.add("hi!\\");
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    var0.add("hi!");
    boolean var12 = var0.isEmpty();
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
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test263");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "");
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test264");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.lang.String var4 = var2.getName();
    java.io.File var5 = var2.getDestinationFile();
    boolean var6 = minicopier.Copier.isNotLink(var5);
    boolean var7 = minicopier.Copier.isNotLink(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test265");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\hi!");
    int var6 = var0.getLength();
    var0.add("hi!\\hi!\\hi!");
    var0.add("\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test266");


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
    java.lang.String var14 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!"+ "'", var14.equals("hi!\\hi!"));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test267");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    boolean var10 = var0.isEmpty();
    var0.add("hi!");
    int var13 = var0.getLength();
    int var14 = var0.getLength();
    java.util.Iterator var15 = var0.getIterator();
    
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
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test268");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test269");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\", "hi!\\hi!\\\\hi!");

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test270");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getDestinationFilePath();
    long var7 = var2.getSize();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getDestinationFilePath();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test271");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getName();
    var2.changeTargetName("");
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getDestinationFile();
    java.io.File var12 = var2.getDestinationFolder();
    java.lang.String var13 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test272");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getDestinationFolder();
    long var10 = var2.getSize();
    java.io.File var11 = var2.getDestinationFile();
    
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
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test273");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.lang.String var12 = var2.getSourcePath();
    java.lang.String var13 = var2.getName();
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
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!\\hi!"+ "'", var11.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!\\hi!\\hi!"+ "'", var14.equals("hi!\\hi!\\hi!"));

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test274");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "\\hi!\\hi!\\\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    java.lang.String var4 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\hi!\\hi!\\hi!\\"+ "'", var4.equals("\\hi!\\hi!\\hi!\\"));

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test275");


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
    java.lang.String var15 = var2.getName();
    java.io.File var16 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!");
    
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
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test276");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getDestinationFile();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFile();
    java.io.File var11 = var2.getDestinationFolder();
    java.lang.String var12 = var2.getDestinationFilePath();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test277");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getSourcePath();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getSourcePath();
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
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test278");


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
    java.io.File var14 = var2.getDestinationFolder();
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

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test279");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.lang.String var5 = var2.getDestinationFolderPath();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getName();
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getDestinationFilePath();
    long var13 = var2.getSize();
    
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
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test280");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getDestinationFile();
    
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
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test281");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    boolean var3 = var0.isEmpty();
    java.util.Iterator var4 = var0.getIterator();
    boolean var5 = var0.isEmpty();
    int var6 = var0.getLength();
    boolean var7 = var0.isEmpty();
    var0.add("\\hi!");
    
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
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test282");


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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test283");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    var0.add("\\hi!\\hi!");
    boolean var10 = var0.isEmpty();
    var0.add("\\\\hi!\\hi!\\\\hi!");
    
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
    assertTrue(var10 == false);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test284");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.lang.String var4 = var2.getName();
    java.lang.String var5 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\\hi!"+ "'", var5.equals("\\hi!"));

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test285");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    var2.changeTargetName("\\hi!");
    java.io.File var9 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test286");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\\\hi!\\hi!\\\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test287");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFolder();
    boolean var8 = minicopier.Copier.isNotLink(var7);
    boolean var9 = minicopier.Copier.isNotLink(var7);
    
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
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test288");


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
    int var24 = var0.getLength();
    int var25 = var0.getLength();
    
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
    assertTrue(var24 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 7);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test289");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getSourceFile();
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getName();
    long var13 = var2.getSize();
    java.lang.String var14 = var2.getName();
    
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
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test290");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getName();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFilePath();
    long var8 = var2.getSize();
    java.io.File var9 = var2.getDestinationFolder();
    java.lang.String var10 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test291");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFile();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getDestinationFolder();
    boolean var11 = minicopier.Copier.isNotLink(var10);
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test292");


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
    var0.add("\\hi!\\hi!");
    var0.add("hi!\\\\\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.util.Iterator var26 = var0.getIterator();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test293");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getName();
    java.lang.String var7 = var2.getSourcePath();
    java.io.File var8 = var2.getDestinationFolder();
    long var9 = var2.getSize();
    java.lang.String var10 = var2.getDestinationFilePath();
    java.io.File var11 = var2.getDestinationFile();
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
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test294");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\");

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test295");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!");
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test296");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.io.File var4 = var2.getDestinationFolder();
    boolean var5 = minicopier.Copier.isNotLink(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test297");


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
    java.io.File var14 = var2.getDestinationFolder();
    java.lang.String var15 = var2.getName();
    java.lang.String var16 = var2.getSourcePath();
    long var17 = var2.getSize();
    long var18 = var2.getSize();
    java.lang.String var19 = var2.getSourcePath();
    java.io.File var20 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test298");


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
    boolean var15 = var0.isEmpty();
    int var16 = var0.getLength();
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 4);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test299");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\");
    java.io.File var3 = var2.getDestinationFolder();
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

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test300");


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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test301");


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
    long var14 = var2.getSize();
    java.lang.String var15 = var2.getDestinationFolderPath();
    java.io.File var16 = var2.getSourceFile();
    var2.changeTargetName("\\hi!\\hi!\\\\hi!\\hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test302");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "\\hi!\\hi!");
    java.lang.String var3 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.io.File var6 = var2.getSourceFile();
    java.io.File var7 = var2.getDestinationFile();
    boolean var8 = minicopier.Copier.isNotLink(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test303");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!");
    int var10 = var0.getLength();
    boolean var11 = var0.isEmpty();
    int var12 = var0.getLength();
    int var13 = var0.getLength();
    var0.add("hi!\\hi!\\hi!\\hi!\\");
    boolean var16 = var0.isEmpty();
    
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test304");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\");
    java.io.File var3 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!\\");
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFilePath();
    long var8 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!\\hi!\\"+ "'", var7.equals("hi!\\hi!\\hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test305");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFolder();
    long var8 = var2.getSize();
    java.lang.String var9 = var2.getSourcePath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!");
    java.lang.String var12 = var2.getSourcePath();
    java.lang.String var13 = var2.getDestinationFolderPath();
    
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
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test306");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "\\hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getSourceFile();
    long var5 = var2.getSize();
    java.io.File var6 = var2.getDestinationFile();
    java.io.File var7 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test307");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getDestinationFolder();
    boolean var6 = minicopier.Copier.isNotLink(var5);
    boolean var7 = minicopier.Copier.isNotLink(var5);
    boolean var8 = minicopier.Copier.isNotLink(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test308");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    var0.add("\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\");
    java.util.Iterator var12 = var0.getIterator();
    
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
    assertNotNull(var12);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test309");


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
    long var15 = var2.getSize();
    
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
    assertTrue(var15 == 0L);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test310");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var12 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test311");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!");
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.io.File var5 = var2.getSourceFile();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getSourceFile();
    boolean var8 = minicopier.Copier.isNotLink(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test312");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    long var4 = var2.getSize();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getDestinationFolder();
    boolean var8 = minicopier.Copier.isNotLink(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var5.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var6.equals("hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test313");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("hi!");
    java.lang.String var11 = var2.getSourcePath();
    java.lang.String var12 = var2.getDestinationFolderPath();
    long var13 = var2.getSize();
    java.io.File var14 = var2.getDestinationFile();
    java.io.File var15 = var2.getSourceFile();
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test314");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!", "hi!\\\\hi!\\hi!");
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!");
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.lang.String var6 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!\\hi!"+ "'", var5.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!"+ "'", var6.equals("hi!\\hi!\\hi!"));

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test315");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getSourceFile();
    java.io.File var6 = var2.getDestinationFile();
    java.io.File var7 = var2.getDestinationFolder();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFile();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.io.File var12 = var2.getDestinationFile();
    boolean var13 = minicopier.Copier.isNotLink(var12);
    
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
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test316");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    var0.add("hi!\\hi!\\hi!");
    int var6 = var0.getLength();
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\hi!\\\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test317");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    int var7 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var10 = var0.getIterator();
    var0.add("hi!\\hi!");
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test318");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getSourceFile();
    java.lang.String var11 = var2.getDestinationFolderPath();
    java.lang.String var12 = var2.getDestinationFolderPath();
    java.io.File var13 = var2.getSourceFile();
    long var14 = var2.getSize();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test319");


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
    var2.changeTargetName("\\\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test320");


    minicopier.Basket var0 = new minicopier.Basket();
    boolean var1 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test321");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getSourceFile();
    java.io.File var5 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test322");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getDestinationFolderPath();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test323");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getName();
    java.lang.String var7 = var2.getSourcePath();
    java.io.File var8 = var2.getDestinationFolder();
    long var9 = var2.getSize();
    java.io.File var10 = var2.getDestinationFile();
    
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
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test324");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\hi!");
    var0.add("\\hi!\\hi!\\\\hi!");
    int var8 = var0.getLength();
    var0.add("\\hi!\\hi!\\hi!\\hi!");
    int var11 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test325");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test326");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.io.File var10 = var2.getDestinationFile();
    java.lang.String var11 = var2.getDestinationFilePath();
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
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test327");


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
    boolean var15 = var0.isEmpty();
    int var16 = var0.getLength();
    int var17 = var0.getLength();
    java.util.Iterator var18 = var0.getIterator();
    int var19 = var0.getLength();
    java.util.Iterator var20 = var0.getIterator();
    boolean var21 = var0.isEmpty();
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test328");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var4 = var0.wasFirstLaunch();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var10 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var12 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test329");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!\\");
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isEmpty();
    boolean var5 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!");
    int var8 = var0.getLength();
    java.util.Iterator var9 = var0.getIterator();
    boolean var10 = var0.isEmpty();
    java.util.Iterator var11 = var0.getIterator();
    
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test330");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.lang.String var4 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!");
    java.lang.String var7 = var2.getSourcePath();
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!"+ "'", var10.equals("hi!\\hi!"));

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test331");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "");
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!\\hi!\\hi!\\");
    java.io.File var7 = var2.getSourceFile();
    boolean var8 = minicopier.Copier.isNotLink(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test332");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!\\hi!\\\\hi!\\hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test333");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    var0.add("\\hi!");
    var0.add("hi!\\");
    boolean var11 = var0.isEmpty();
    boolean var12 = var0.isEmpty();
    java.util.Iterator var13 = var0.getIterator();
    java.util.Iterator var14 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test334");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!");
    long var10 = var2.getSize();
    long var11 = var2.getSize();
    
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
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test335");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test336");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    int var7 = var0.getLength();
    var0.add("\\hi!\\hi!\\\\hi!");
    java.util.Iterator var10 = var0.getIterator();
    int var11 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test337");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    boolean var12 = var0.wasFirstLaunch();
    
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test338");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    java.io.File var7 = var2.getSourceFile();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getSourceFile();
    
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

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test339");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    long var10 = var2.getSize();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var13 = var2.getDestinationFolder();
    java.lang.String var14 = var2.getDestinationFolderPath();
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
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test340");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getDestinationFolderPath();
    long var10 = var2.getSize();
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getDestinationFilePath();
    java.lang.String var13 = var2.getName();
    java.io.File var14 = var2.getSourceFile();
    
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
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test341");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    boolean var6 = var0.isEmpty();
    int var7 = var0.getLength();
    int var8 = var0.getLength();
    int var9 = var0.getLength();
    int var10 = var0.getLength();
    
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
    assertTrue(var10 == 1);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test342");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    boolean var5 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var7 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test343");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getSourceFile();
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getSourcePath();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!");
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
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test344");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
    java.util.Iterator var9 = var0.getIterator();
    var0.add("\\\\hi!\\hi!\\\\hi!");
    boolean var12 = var0.isEmpty();
    var0.add("hi!\\\\hi!\\hi!\\hi!\\");
    int var15 = var0.getLength();
    int var16 = var0.getLength();
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 4);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test345");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.lang.String var6 = var2.getName();
    var2.changeTargetName("\\hi!");
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.io.File var10 = var2.getDestinationFile();
    java.lang.String var11 = var2.getSourcePath();
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test346");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFolder();
    java.lang.String var5 = var2.getSourcePath();
    java.io.File var6 = var2.getSourceFile();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getDestinationFolder();
    long var9 = var2.getSize();
    var2.changeTargetName("hi!\\hi!\\\\hi!");
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
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test347");


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
    java.lang.String var12 = var2.getName();
    java.lang.String var13 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!"+ "'", var13.equals("hi!\\hi!"));

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test348");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    boolean var5 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test349");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.lang.String var11 = var2.getName();
    
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test350");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    int var9 = var0.getLength();
    var0.add("hi!\\hi!\\\\hi!\\hi!");
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test351");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getDestinationFilePath();
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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
    assertNotNull(var11);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test352");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "hi!\\\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!\\\\hi!");
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getDestinationFolder();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!"+ "'", var6.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!"+ "'", var8.equals("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test353");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.lang.String var4 = var2.getName();
    long var5 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test354");


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
    java.util.Iterator var16 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!\\");
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\");
    
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
    assertNotNull(var16);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test355");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    boolean var6 = minicopier.Copier.isNotLink(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test356");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\");
    var0.add("hi!\\hi!\\hi!\\");
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!");
    var0.add("hi!\\\\hi!\\hi!");
    var0.add("\\hi!\\hi!\\\\hi!");
    var0.add("hi!");
    java.util.Iterator var17 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test357");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    long var5 = var2.getSize();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getSourcePath();
    java.lang.String var8 = var2.getName();
    
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
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test358");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    var0.createConfigFile();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test359");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    var0.add("");
    java.util.Iterator var12 = var0.getIterator();
    int var13 = var0.getLength();
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
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test360");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    var0.add("\\hi!\\hi!");
    boolean var9 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test361");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.io.File var7 = var2.getDestinationFolder();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    boolean var11 = minicopier.Copier.isNotLink(var10);
    
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
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!"+ "'", var8.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test362");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getSourcePath();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getName();
    java.lang.String var12 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!\\hi!"+ "'", var8.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test363");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.lang.String var6 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getDestinationFolderPath();
    java.io.File var11 = var2.getDestinationFile();
    java.io.File var12 = var2.getDestinationFolder();
    java.io.File var13 = var2.getDestinationFolder();
    boolean var14 = minicopier.Copier.isNotLink(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test364");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    boolean var2 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var4 = var0.wasFirstLaunch();
    boolean var5 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test365");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!\\hi!");

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test366");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\");
    java.io.File var3 = var2.getDestinationFolder();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!\\hi!"+ "'", var5.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var7.equals("hi!\\hi!\\hi!\\hi!"));

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test367");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!", "hi!\\");
    java.io.File var3 = var2.getDestinationFolder();
    long var4 = var2.getSize();
    java.lang.String var5 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test368");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getSourcePath();
    
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
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test369");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\\\hi!", "hi!\\\\hi!\\\\hi!\\hi!");

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test370");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    java.util.Iterator var3 = var0.getIterator();
    var0.add("hi!\\\\hi!");
    int var6 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test371");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getName();
    java.io.File var7 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test372");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = minicopier.i18n.Language.get("\\hi!\\hi!\\hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test373");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    var2.changeTargetName("hi!");
    var2.changeTargetName("");
    java.io.File var13 = var2.getSourceFile();
    java.lang.String var14 = var2.getDestinationFilePath();
    java.lang.String var15 = var2.getDestinationFilePath();
    java.lang.String var16 = var2.getName();
    java.lang.String var17 = var2.getDestinationFilePath();
    
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
    assertTrue("'" + var14 + "' != '" + "hi!\\"+ "'", var14.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!\\"+ "'", var15.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!\\"+ "'", var17.equals("hi!\\"));

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test374");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getSourceFile();
    java.io.File var7 = var2.getDestinationFile();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\\\hi!\\hi!");
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "\\hi!"+ "'", var9.equals("\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "\\hi!\\\\hi!\\hi!"+ "'", var12.equals("\\hi!\\\\hi!\\hi!"));

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test375");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    boolean var9 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test376");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getSourcePath();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFilePath();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.io.File var10 = var2.getDestinationFolder();
    boolean var11 = minicopier.Copier.isNotLink(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!\\hi!"+ "'", var8.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!"+ "'", var9.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test377");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\", "hi!\\");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.lang.String var4 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test378");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\hi!\\hi!\\\\hi!");

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test379");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    var2.changeTargetName("");
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var9 = var2.getDestinationFilePath();
    long var10 = var2.getSize();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var13 = var2.getSourceFile();
    java.lang.String var14 = var2.getSourcePath();
    java.io.File var15 = var2.getDestinationFolder();
    java.io.File var16 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!\\hi!"+ "'", var9.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test380");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getSourcePath();
    var2.changeTargetName("\\hi!\\hi!\\\\hi!");
    java.io.File var7 = var2.getSourceFile();
    java.io.File var8 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test381");


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
    var2.changeTargetName("\\hi!");
    java.io.File var16 = var2.getDestinationFile();
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
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test382");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "\\hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.io.File var6 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    long var11 = var2.getSize();
    java.io.File var12 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\hi!\\hi!"+ "'", var4.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test383");


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
    var0.createConfigFile();
    boolean var11 = var0.wasFirstLaunch();
    var0.createConfigFile();
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test384");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\hi!");
    java.util.Iterator var11 = var0.getIterator();
    int var12 = var0.getLength();
    var0.add("\\hi!\\");
    int var15 = var0.getLength();
    int var16 = var0.getLength();
    
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
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 4);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test385");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getName();
    java.io.File var8 = var2.getSourceFile();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFile();
    boolean var11 = minicopier.Copier.isNotLink(var10);
    
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
    assertTrue(var11 == true);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test386");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!", "hi!\\");
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test387");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getName();
    var2.changeTargetName("");
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getSourceFile();
    java.lang.String var12 = var2.getSourcePath();
    java.lang.String var13 = var2.getDestinationFolderPath();
    java.io.File var14 = var2.getDestinationFile();
    java.io.File var15 = var2.getDestinationFolder();
    boolean var16 = minicopier.Copier.isNotLink(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test388");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getName();
    java.lang.String var11 = var2.getDestinationFolderPath();
    java.io.File var12 = var2.getDestinationFile();
    var2.changeTargetName("\\hi!\\hi!\\hi!");
    java.io.File var15 = var2.getSourceFile();
    java.io.File var16 = var2.getDestinationFile();
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test389");


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
    java.lang.String var14 = var2.getSourcePath();
    java.io.File var15 = var2.getDestinationFolder();
    java.io.File var16 = var2.getDestinationFolder();
    boolean var17 = minicopier.Copier.isNotLink(var16);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test390");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getSourcePath();
    java.io.File var6 = var2.getDestinationFile();
    java.io.File var7 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test391");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getName();
    java.lang.String var7 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\");
    java.io.File var10 = var2.getDestinationFolder();
    java.io.File var11 = var2.getSourceFile();
    java.lang.String var12 = var2.getSourcePath();
    java.io.File var13 = var2.getDestinationFile();
    java.lang.String var14 = var2.getName();
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
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test392");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!\\hi!");
    boolean var5 = var0.isEmpty();
    java.util.Iterator var6 = var0.getIterator();
    int var7 = var0.getLength();
    boolean var8 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test393");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "hi!\\hi!\\\\hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.io.File var4 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test394");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getSourceFile();
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

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test395");


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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test396");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    var0.add("");
    java.util.Iterator var5 = var0.getIterator();
    java.util.Iterator var6 = var0.getIterator();
    boolean var7 = var0.isEmpty();
    int var8 = var0.getLength();
    int var9 = var0.getLength();
    java.util.Iterator var10 = var0.getIterator();
    java.util.Iterator var11 = var0.getIterator();
    java.util.Iterator var12 = var0.getIterator();
    int var13 = var0.getLength();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test397");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!\\");
    int var7 = var0.getLength();
    boolean var8 = var0.isEmpty();
    boolean var9 = var0.isEmpty();
    var0.add("hi!\\\\hi!");
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    java.util.Iterator var14 = var0.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test398");


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
    java.util.Iterator var17 = var0.getIterator();
    var0.add("\\hi!\\hi!\\");
    boolean var20 = var0.isEmpty();
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test399");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.io.File var8 = var2.getDestinationFile();
    java.lang.String var9 = var2.getSourcePath();
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getSourceFile();
    java.lang.String var12 = var2.getName();
    
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
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test400");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getSourcePath();
    long var4 = var2.getSize();
    var2.changeTargetName("hi!\\hi!\\hi!\\\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test401");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\", "hi!\\hi!\\hi!\\");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.lang.String var4 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!"));

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test402");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!", "hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getSourcePath();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\\\hi!");
    java.lang.String var11 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!"+ "'", var7.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!\\hi!"+ "'", var8.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test403");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getDestinationFolderPath();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFolderPath();
    long var12 = var2.getSize();
    java.io.File var13 = var2.getDestinationFile();
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test404");


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
    java.lang.String var24 = var2.getSourcePath();
    
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
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test405");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    var2.changeTargetName("");
    var2.changeTargetName("hi!\\hi!");
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getDestinationFolderPath();
    long var11 = var2.getSize();
    java.lang.String var12 = var2.getName();
    java.lang.String var13 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test406");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFile();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getName();
    java.io.File var11 = var2.getDestinationFolder();
    long var12 = var2.getSize();
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
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!"+ "'", var13.equals("hi!\\hi!"));

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test407");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!\\\\hi!");
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getSourcePath();
    java.io.File var12 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.io.File var15 = var2.getSourceFile();
    java.io.File var16 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test408");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    var2.changeTargetName("");
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var9 = var2.getDestinationFilePath();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\\\hi!\\\\hi!\\hi!");
    long var14 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\\hi!\\hi!"+ "'", var9.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!\\hi!"+ "'", var11.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test409");


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
    java.io.File var12 = var2.getDestinationFile();
    boolean var13 = minicopier.Copier.isNotLink(var12);
    
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
    assertTrue(var13 == true);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test410");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "\\hi!\\hi!");
    var2.changeTargetName("\\hi!");
    java.io.File var5 = var2.getSourceFile();
    long var6 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test411");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\");
    java.lang.String var6 = var2.getDestinationFilePath();
    java.lang.String var7 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\hi!\\");
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getSourceFile();
    long var12 = var2.getSize();
    long var13 = var2.getSize();
    java.io.File var14 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!"+ "'", var3.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!\\hi!\\"+ "'", var6.equals("hi!\\hi!\\hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\\hi!\\hi!"+ "'", var10.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test412");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!", "hi!\\hi!\\\\hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!"));

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test413");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\\\hi!\\hi!\\\\hi!", "hi!\\hi!");

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test414");


    minicopier.Basket var0 = new minicopier.Basket();
    var0.add("hi!");
    boolean var3 = var0.isEmpty();
    var0.add("hi!\\");
    var0.add("");
    boolean var8 = var0.isEmpty();
    boolean var9 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test415");


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
    boolean var15 = var0.isEmpty();
    int var16 = var0.getLength();
    boolean var17 = var0.isEmpty();
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test416");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    java.util.Iterator var2 = var0.getIterator();
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isEmpty();
    var0.add("hi!\\");
    var0.add("\\hi!\\hi!\\hi!\\");
    java.util.Iterator var9 = var0.getIterator();
    int var10 = var0.getLength();
    int var11 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test417");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!");
    java.lang.String var8 = var2.getDestinationFilePath();
    java.io.File var9 = var2.getDestinationFolder();
    java.io.File var10 = var2.getSourceFile();
    long var11 = var2.getSize();
    long var12 = var2.getSize();
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test418");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    var2.changeTargetName("hi!");
    java.lang.String var7 = var2.getName();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test419");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.lang.String var6 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!");
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.lang.String var11 = var2.getName();
    java.io.File var12 = var2.getDestinationFile();
    java.lang.String var13 = var2.getSourcePath();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test420");


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
    java.lang.String var12 = var2.getDestinationFolderPath();
    java.io.File var13 = var2.getSourceFile();
    
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
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test421");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!", "\\\\hi!\\hi!\\\\hi!");

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test422");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var8 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var10 = var0.wasFirstLaunch();
    var0.createConfigFile();
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test423");


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
    java.io.File var16 = var2.getSourceFile();
    
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
    assertNotNull(var16);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test424");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!\\\\\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test425");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getSourceFile();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFile();
    java.lang.String var11 = var2.getDestinationFilePath();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test426");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "");
    var2.changeTargetName("hi!");
    java.lang.String var5 = var2.getDestinationFolderPath();
    var2.changeTargetName("\\hi!\\hi!");
    java.io.File var8 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\\\hi!\\hi!\\hi!");
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "\\hi!\\\\hi!\\hi!\\hi!"+ "'", var12.equals("\\hi!\\\\hi!\\hi!\\hi!"));

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test427");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getName();
    java.lang.String var7 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\hi!\\");
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getDestinationFile();
    
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
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test428");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!\\\\hi!");
    
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

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test429");


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
    var0.add("\\\\hi!");
    
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

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test430");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!", "hi!\\\\hi!\\hi!");

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test431");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!\\");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getSourceFile();
    java.lang.String var5 = var2.getDestinationFolderPath();
    java.lang.String var6 = var2.getSourcePath();
    long var7 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test432");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\hi!", "\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    var2.changeTargetName("hi!\\hi!\\\\hi!\\hi!");

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test433");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFile();
    long var5 = var2.getSize();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getSourceFile();
    java.io.File var9 = var2.getSourceFile();
    java.lang.String var10 = var2.getName();
    java.io.File var11 = var2.getSourceFile();
    java.lang.String var12 = var2.getDestinationFilePath();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\\hi!"+ "'", var12.equals("hi!\\hi!"));

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test434");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.lang.String var5 = var2.getDestinationFilePath();
    long var6 = var2.getSize();
    java.lang.String var7 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!"+ "'", var5.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test435");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\\\hi!\\hi!");
    java.io.File var8 = var2.getDestinationFolder();
    boolean var9 = minicopier.Copier.isNotLink(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test436");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getName();
    java.lang.String var7 = var2.getDestinationFolderPath();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var10 = var2.getDestinationFolder();
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var11.equals("hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test437");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getSourceFile();
    java.io.File var5 = var2.getDestinationFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test438");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!");

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test439");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getSourceFile();
    java.lang.String var9 = var2.getName();
    var2.changeTargetName("hi!\\\\hi!\\hi!\\hi!");
    java.io.File var12 = var2.getDestinationFile();
    
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
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test440");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    java.io.File var9 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!");
    java.lang.String var12 = var2.getDestinationFolderPath();
    java.lang.String var13 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\");
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!");
    long var18 = var2.getSize();
    java.lang.String var19 = var2.getDestinationFilePath();
    java.io.File var20 = var2.getDestinationFile();
    
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
    assertTrue(var18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var19.equals("hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test441");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "");
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = var2.getSourcePath();
    java.lang.String var5 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test442");


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
    java.io.File var18 = var2.getDestinationFile();
    java.io.File var19 = var2.getDestinationFile();
    java.lang.String var20 = var2.getSourcePath();
    java.io.File var21 = var2.getDestinationFolder();
    boolean var22 = minicopier.Copier.isNotLink(var21);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test443");


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
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var13 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var15 = var0.wasFirstLaunch();
    boolean var16 = var0.wasFirstLaunch();
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test444");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\");
    java.util.Iterator var4 = var0.getIterator();
    boolean var5 = var0.isEmpty();
    var0.add("");
    java.util.Iterator var8 = var0.getIterator();
    int var9 = var0.getLength();
    java.util.Iterator var10 = var0.getIterator();
    var0.add("\\hi!\\\\hi!\\hi!\\\\hi!");
    var0.add("hi!\\hi!\\hi!\\hi!\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test445");


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
    var0.add("hi!\\hi!\\\\hi!\\hi!");
    var0.add("hi!\\\\hi!\\hi!\\hi!\\hi!\\hi!");
    
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

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test446");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    var2.changeTargetName("hi!\\hi!");
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getSourcePath();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getDestinationFilePath();
    var2.changeTargetName("hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test447");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getSourcePath();
    long var5 = var2.getSize();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getSourcePath();
    java.io.File var9 = var2.getDestinationFile();
    java.lang.String var10 = var2.getName();
    
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

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test448");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    var2.changeTargetName("hi!");
    var2.changeTargetName("hi!");
    java.lang.String var9 = var2.getName();
    java.lang.String var10 = var2.getSourcePath();
    java.io.File var11 = var2.getDestinationFile();
    java.lang.String var12 = var2.getDestinationFolderPath();
    java.io.File var13 = var2.getDestinationFile();
    java.io.File var14 = var2.getDestinationFile();
    java.lang.String var15 = var2.getDestinationFilePath();
    java.lang.String var16 = var2.getDestinationFolderPath();
    java.lang.String var17 = var2.getSourcePath();
    java.io.File var18 = var2.getDestinationFolder();
    var2.changeTargetName("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!\\hi!"+ "'", var15.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test449");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    var2.changeTargetName("\\hi!");
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getDestinationFolder();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var13 = var2.getDestinationFolder();
    boolean var14 = minicopier.Copier.isNotLink(var13);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test450");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    long var8 = var2.getSize();
    java.io.File var9 = var2.getDestinationFile();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    java.io.File var12 = var2.getDestinationFile();
    java.io.File var13 = var2.getDestinationFolder();
    
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
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test451");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!");
    java.util.Iterator var8 = var0.getIterator();
    var0.add("hi!\\hi!");
    java.util.Iterator var11 = var0.getIterator();
    java.util.Iterator var12 = var0.getIterator();
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test452");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\\\hi!", "hi!\\\\hi!\\\\hi!\\hi!");

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test453");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "");
    java.lang.String var3 = var2.getDestinationFolderPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test454");


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
    var0.add("hi!\\\\hi!");
    var0.add("hi!\\hi!\\\\hi!");
    boolean var17 = var0.isEmpty();
    int var18 = var0.getLength();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 4);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test455");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\\\hi!", "\\hi!\\hi!\\");

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test456");


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
    long var13 = var2.getSize();
    java.lang.String var14 = var2.getName();
    java.io.File var15 = var2.getDestinationFolder();
    java.io.File var16 = var2.getSourceFile();
    boolean var17 = minicopier.Copier.isNotLink(var16);
    
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
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test457");


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
    var2.changeTargetName("\\hi!");
    java.io.File var16 = var2.getDestinationFile();
    boolean var17 = minicopier.Copier.isNotLink(var16);
    boolean var18 = minicopier.Copier.isNotLink(var16);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test458");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test459");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFile();
    java.io.File var6 = var2.getDestinationFolder();
    java.io.File var7 = var2.getDestinationFile();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getName();
    java.io.File var10 = var2.getDestinationFolder();
    java.lang.String var11 = var2.getSourcePath();
    var2.changeTargetName("\\hi!\\hi!\\");
    
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test460");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "");
    java.lang.String var3 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\\\hi!\\hi!");
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.io.File var8 = var2.getDestinationFolder();
    java.lang.String var9 = var2.getDestinationFolderPath();
    long var10 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test461");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    boolean var4 = minicopier.Copier.isNotLink(var3);
    boolean var5 = minicopier.Copier.isNotLink(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test462");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    boolean var3 = var0.isEmpty();
    java.util.Iterator var4 = var0.getIterator();
    java.util.Iterator var5 = var0.getIterator();
    var0.add("hi!\\");
    java.util.Iterator var8 = var0.getIterator();
    boolean var9 = var0.isEmpty();
    var0.add("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test463");


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
    java.io.File var15 = var2.getDestinationFile();
    java.lang.String var16 = var2.getName();
    java.io.File var17 = var2.getSourceFile();
    java.lang.String var18 = var2.getDestinationFolderPath();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test464");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\");
    java.util.Iterator var4 = var0.getIterator();
    boolean var5 = var0.isEmpty();
    boolean var6 = var0.isEmpty();
    var0.add("hi!\\\\hi!\\hi!");
    int var9 = var0.getLength();
    boolean var10 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test465");


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
    java.io.File var24 = var2.getSourceFile();
    java.lang.String var25 = var2.getName();
    java.lang.String var26 = var2.getDestinationFilePath();
    long var27 = var2.getSize();
    java.lang.String var28 = var2.getName();
    var2.changeTargetName("hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!\\"+ "'", var26.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test466");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!", "");
    java.lang.String var3 = var2.getSourcePath();
    java.lang.String var4 = var2.getSourcePath();
    java.io.File var5 = var2.getSourceFile();
    java.io.File var6 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\hi!\\hi!"+ "'", var3.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test467");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\", "hi!\\hi!\\hi!");
    java.io.File var3 = var2.getDestinationFile();
    long var4 = var2.getSize();
    long var5 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test468");


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
    java.io.File var17 = var2.getDestinationFolder();
    java.lang.String var18 = var2.getDestinationFilePath();
    java.lang.String var19 = var2.getName();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!\\\\hi!\\hi!"+ "'", var18.equals("hi!\\\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test469");


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
    java.lang.String var13 = var2.getSourcePath();
    java.lang.String var14 = var2.getSourcePath();
    java.lang.String var15 = var2.getDestinationFilePath();
    java.io.File var16 = var2.getDestinationFolder();
    java.lang.String var17 = var2.getDestinationFolderPath();
    
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
    assertTrue("'" + var15 + "' != '" + "hi!\\hi!\\\\hi!"+ "'", var15.equals("hi!\\hi!\\\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test470");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    var0.add("hi!");
    java.util.Iterator var7 = var0.getIterator();
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    var0.add("hi!\\hi!\\hi!");
    java.util.Iterator var12 = var0.getIterator();
    var0.add("\\hi!\\");
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 4);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test471");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    boolean var8 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var11 = var0.wasFirstLaunch();
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test472");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\", "hi!\\hi!\\");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.lang.String var5 = var2.getDestinationFilePath();
    java.lang.String var6 = var2.getSourcePath();
    java.lang.String var7 = var2.getDestinationFilePath();
    java.io.File var8 = var2.getDestinationFolder();
    java.io.File var9 = var2.getSourceFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!\\hi!"+ "'", var5.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\\hi!"+ "'", var6.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\\hi!\\hi!"+ "'", var7.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test473");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getSourceFile();
    java.lang.String var6 = var2.getDestinationFolderPath();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getSourcePath();
    java.lang.String var9 = var2.getName();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getDestinationFolderPath();
    java.io.File var12 = var2.getDestinationFolder();
    java.lang.String var13 = var2.getSourcePath();
    java.io.File var14 = var2.getDestinationFolder();
    
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test474");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!\\\\hi!\\hi!\\\\hi!");

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test475");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.io.File var4 = var2.getDestinationFile();
    java.io.File var5 = var2.getDestinationFolder();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getDestinationFolderPath();
    java.lang.String var8 = var2.getDestinationFolderPath();
    var2.changeTargetName("hi!\\\\");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!\\"+ "'", var3.equals("hi!\\"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test476");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!\\");
    java.io.File var3 = var2.getDestinationFolder();
    java.io.File var4 = var2.getDestinationFolder();
    java.lang.String var5 = var2.getSourcePath();
    long var6 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!\\hi!\\hi!\\hi!"+ "'", var5.equals("hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test477");


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
    java.lang.String var13 = var2.getDestinationFolderPath();
    java.lang.String var14 = var2.getDestinationFolderPath();
    java.lang.String var15 = var2.getDestinationFolderPath();
    java.io.File var16 = var2.getSourceFile();
    long var17 = var2.getSize();
    java.io.File var18 = var2.getDestinationFolder();
    java.lang.String var19 = var2.getSourcePath();
    long var20 = var2.getSize();
    
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
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0L);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test478");


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
    boolean var12 = var0.wasFirstLaunch();
    boolean var13 = var0.wasFirstLaunch();
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test479");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("", "hi!\\\\hi!\\hi!\\\\hi!");
    var2.changeTargetName("\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    long var5 = var2.getSize();
    java.io.File var6 = var2.getSourceFile();
    java.lang.String var7 = var2.getName();
    java.lang.String var8 = var2.getDestinationFilePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!"+ "'", var8.equals("hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!\\hi!\\\\hi!\\hi!"));

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test480");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\\\hi!\\hi!", "hi!\\hi!\\hi!\\\\");

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test481");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!\\hi!");
    long var3 = var2.getSize();
    java.lang.String var4 = var2.getSourcePath();
    java.io.File var5 = var2.getDestinationFile();
    long var6 = var2.getSize();
    java.io.File var7 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("hi!\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test482");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\\\hi!", "hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test483");


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
    boolean var12 = var0.isEmpty();
    var0.add("\\hi!\\hi!\\hi!\\hi!");
    var0.add("\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!");
    
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
    assertTrue(var12 == false);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test484");


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
    boolean var13 = minicopier.Copier.isNotLink(var12);
    boolean var14 = minicopier.Copier.isNotLink(var12);
    
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
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test485");


    minicopier.Configuration var0 = new minicopier.Configuration();
    var0.createConfigFile();
    boolean var2 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var5 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    boolean var10 = var0.wasFirstLaunch();
    boolean var11 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test486");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var6 = var0.wasFirstLaunch();
    boolean var7 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var9 = var0.wasFirstLaunch();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test487");


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
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test488");


    minicopier.Configuration var0 = new minicopier.Configuration();
    boolean var1 = var0.wasFirstLaunch();
    var0.createConfigFile();
    boolean var3 = var0.wasFirstLaunch();
    boolean var4 = var0.wasFirstLaunch();
    boolean var5 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test489");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!", "hi!\\hi!\\hi!\\hi!");
    java.io.File var3 = var2.getSourceFile();
    java.io.File var4 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test490");


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
    var0.createConfigFile();
    boolean var11 = var0.wasFirstLaunch();
    boolean var12 = var0.wasFirstLaunch();
    var0.createConfigFile();
    var0.createConfigFile();
    boolean var15 = var0.wasFirstLaunch();
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test491");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("\\hi!\\hi!\\hi!\\hi!", "hi!\\hi!\\hi!");
    var2.changeTargetName("hi!\\hi!\\");
    java.io.File var5 = var2.getDestinationFolder();
    java.lang.String var6 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\\hi!\\hi!\\hi!\\hi!"+ "'", var6.equals("\\hi!\\hi!\\hi!\\hi!"));

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test492");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getDestinationFolder();
    java.lang.String var7 = var2.getSourcePath();
    long var8 = var2.getSize();
    java.io.File var9 = var2.getSourceFile();
    java.io.File var10 = var2.getSourceFile();
    java.lang.String var11 = var2.getDestinationFilePath();
    java.lang.String var12 = var2.getDestinationFolderPath();
    
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
    assertTrue("'" + var11 + "' != '" + "hi!\\hi!"+ "'", var11.equals("hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test493");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\", "\\hi!\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFolderPath();
    java.lang.String var4 = var2.getSourcePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\\hi!"+ "'", var4.equals("hi!\\hi!"));

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test494");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    java.io.File var4 = var2.getDestinationFolder();
    java.io.File var5 = var2.getSourceFile();
    boolean var6 = minicopier.Copier.isNotLink(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test495");


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
    java.lang.String var16 = var2.getSourcePath();
    var2.changeTargetName("hi!\\hi!\\hi!");
    java.lang.String var19 = var2.getSourcePath();
    java.lang.String var20 = var2.getName();
    java.io.File var21 = var2.getDestinationFile();
    
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
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test496");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\hi!\\\\hi!\\hi!", "hi!");

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test497");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    var0.add("hi!\\hi!");
    int var4 = var0.getLength();
    java.util.Iterator var5 = var0.getIterator();
    int var6 = var0.getLength();
    var0.add("");
    boolean var9 = var0.isEmpty();
    var0.add("");
    java.util.Iterator var12 = var0.getIterator();
    var0.add("\\\\hi!\\hi!\\\\hi!");
    
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
    assertNotNull(var12);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test498");


    minicopier.Basket var0 = new minicopier.Basket();
    java.util.Iterator var1 = var0.getIterator();
    int var2 = var0.getLength();
    int var3 = var0.getLength();
    var0.add("hi!");
    var0.add("hi!\\");
    java.util.Iterator var8 = var0.getIterator();
    java.util.Iterator var9 = var0.getIterator();
    java.util.Iterator var10 = var0.getIterator();
    int var11 = var0.getLength();
    int var12 = var0.getLength();
    java.util.Iterator var13 = var0.getIterator();
    int var14 = var0.getLength();
    boolean var15 = var0.isEmpty();
    
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
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test499");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!\\hi!\\hi!\\hi!\\hi!\\hi!", "\\hi!\\hi!\\hi!");
    java.lang.String var3 = var2.getDestinationFilePath();
    java.lang.String var4 = var2.getDestinationFilePath();
    java.io.File var5 = var2.getDestinationFolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\\hi!\\hi!\\hi!\\hi!"+ "'", var3.equals("\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\\hi!\\hi!\\hi!\\hi!"+ "'", var4.equals("\\hi!\\hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest17.test500");


    minicopier.FileToTransfer var2 = new minicopier.FileToTransfer("hi!", "hi!");
    long var3 = var2.getSize();
    java.io.File var4 = var2.getDestinationFile();
    java.lang.String var5 = var2.getName();
    java.io.File var6 = var2.getSourceFile();
    var2.changeTargetName("hi!\\hi!");
    long var9 = var2.getSize();
    long var10 = var2.getSize();
    java.lang.String var11 = var2.getSourcePath();
    java.io.File var12 = var2.getDestinationFolder();
    java.lang.String var13 = var2.getDestinationFilePath();
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
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!\\hi!\\hi!"+ "'", var13.equals("hi!\\hi!\\hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

}
