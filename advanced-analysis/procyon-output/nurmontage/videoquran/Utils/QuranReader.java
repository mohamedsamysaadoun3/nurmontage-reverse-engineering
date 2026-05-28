// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.io.InputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import android.content.Context;

public class QuranReader
{
    private final Context context;
    
    public QuranReader(final Context context) {
        this.context = context;
    }
    
    public String getAyahText(final int n, final int n2) {
        final String s = "quran/quran-simple.txt";
        try {
            final Context context = this.context;
            try {
                final InputStream open = context.getAssets().open(s);
                try {
                    final BufferedReader bufferedReader = new(java.io.BufferedReader.class)();
                    try {
                        try {
                            final InputStreamReader in = new InputStreamReader(open, StandardCharsets.UTF_8);
                            final BufferedReader bufferedReader2 = bufferedReader;
                            try {
                                new BufferedReader(in);
                                while (true) {
                                    final String line = bufferedReader.readLine();
                                    if (line == null) {
                                        return "Ayah not found";
                                    }
                                    final String[] split = line.split("\\|");
                                    try {
                                        if (split.length != 3) {
                                            continue;
                                        }
                                        final String[] array = split;
                                        int int1 = 0;
                                        String s3 = null;
                                        try {
                                            final String s2 = array[0];
                                            try {
                                                int1 = Integer.parseInt(s2);
                                                s3 = split[1];
                                                try {
                                                    final String s4 = s3;
                                                    final int n3 = Integer.parseInt(s4);
                                                    final int n4 = 2;
                                                    final String[] array2 = split;
                                                    final int n5 = n4;
                                                    final String s5 = array2[n5];
                                                    final int n6 = int1;
                                                    final int n7 = n;
                                                    if (n6 != n7) {
                                                        continue;
                                                    }
                                                    final int n8 = n3;
                                                    final int n9 = n2;
                                                    if (n8 == n9) {
                                                        return s5;
                                                    }
                                                    continue;
                                                }
                                                catch (final NumberFormatException ex) {
                                                    ex.printStackTrace();
                                                }
                                            }
                                            catch (final NumberFormatException ex2) {}
                                            catch (IOException ex3) {
                                                final IOException ex4;
                                                ex3 = ex4;
                                                ex3.printStackTrace();
                                                return "Error reading file: " + ex3.getMessage();
                                            }
                                        }
                                        catch (final NumberFormatException ex5) {}
                                        try {
                                            final String s4 = s3;
                                            final int n3 = Integer.parseInt(s4);
                                            final int n4 = 2;
                                            final String[] array2 = split;
                                            final int n5 = n4;
                                            final String s5 = array2[n5];
                                            final int n6 = int1;
                                            final int n7 = n;
                                            if (n6 != n7) {
                                                continue;
                                            }
                                            final int n8 = n3;
                                            final int n9 = n2;
                                            if (n8 == n9) {
                                                return s5;
                                            }
                                            continue;
                                        }
                                        catch (final IOException ex4) {}
                                    }
                                    catch (final IOException ex6) {}
                                }
                            }
                            catch (final IOException ex7) {}
                        }
                        catch (final IOException ex8) {}
                    }
                    catch (final IOException ex9) {}
                }
                catch (final IOException ex10) {}
            }
            catch (final IOException ex11) {}
        }
        catch (final IOException ex12) {}
    }
    
    public String getTranslationAyahText(final String p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: astore          4
        //     4: aconst_null    
        //     5: astore          5
        //     7: aload_0        
        //     8: getfield        hazem/nurmontage/videoquran/Utils/QuranReader.context:Landroid/content/Context;
        //    11: astore          6
        //    13: aload           6
        //    15: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //    18: astore          6
        //    20: new             Ljava/lang/StringBuilder;
        //    23: astore          7
        //    25: aload           7
        //    27: aload           4
        //    29: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    32: aload           7
        //    34: aload_1        
        //    35: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    38: astore_1       
        //    39: aload_1        
        //    40: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    43: astore_1       
        //    44: aload           6
        //    46: aload_1        
        //    47: invokevirtual   android/content/res/AssetManager.open:(Ljava/lang/String;)Ljava/io/InputStream;
        //    50: astore_1       
        //    51: new             Ljava/io/BufferedReader;
        //    54: astore          4
        //    56: new             Ljava/io/InputStreamReader;
        //    59: astore          6
        //    61: getstatic       java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
        //    64: astore          7
        //    66: aload           6
        //    68: aload_1        
        //    69: aload           7
        //    71: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
        //    74: aload           4
        //    76: aload           6
        //    78: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    81: new             Ljava/lang/StringBuilder;
        //    84: astore_1       
        //    85: aload_1        
        //    86: invokespecial   java/lang/StringBuilder.<init>:()V
        //    89: aload_1        
        //    90: iload_2        
        //    91: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    94: astore_1       
        //    95: ldc             "|"
        //    97: astore          8
        //    99: aload_1        
        //   100: aload           8
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: astore_1       
        //   106: aload_1        
        //   107: iload_3        
        //   108: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   111: astore_1       
        //   112: aload_1        
        //   113: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   116: astore_1       
        //   117: aload           4
        //   119: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   122: astore          8
        //   124: aload           8
        //   126: ifnull          171
        //   129: aload           8
        //   131: aload_1        
        //   132: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   135: istore_3       
        //   136: iload_3        
        //   137: ifeq            117
        //   140: aload_1        
        //   141: invokevirtual   java/lang/String.length:()I
        //   144: istore          9
        //   146: aload           8
        //   148: iload           9
        //   150: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   153: astore_1       
        //   154: aload           4
        //   156: invokevirtual   java/io/BufferedReader.close:()V
        //   159: goto            169
        //   162: astore          8
        //   164: aload           8
        //   166: invokevirtual   java/io/IOException.printStackTrace:()V
        //   169: aload_1        
        //   170: areturn        
        //   171: aload           4
        //   173: invokevirtual   java/io/BufferedReader.close:()V
        //   176: goto            222
        //   179: astore_1       
        //   180: aload           4
        //   182: astore          5
        //   184: goto            225
        //   187: astore_1       
        //   188: aload           4
        //   190: astore          5
        //   192: goto            200
        //   195: astore_1       
        //   196: goto            225
        //   199: astore_1       
        //   200: aload_1        
        //   201: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   204: aload           5
        //   206: ifnull          222
        //   209: aload           5
        //   211: invokevirtual   java/io/BufferedReader.close:()V
        //   214: goto            222
        //   217: astore_1       
        //   218: aload_1        
        //   219: invokevirtual   java/io/IOException.printStackTrace:()V
        //   222: ldc             "Aya Not Found !"
        //   224: areturn        
        //   225: aload           5
        //   227: ifnull          245
        //   230: aload           5
        //   232: invokevirtual   java/io/BufferedReader.close:()V
        //   235: goto            245
        //   238: astore          8
        //   240: aload           8
        //   242: invokevirtual   java/io/IOException.printStackTrace:()V
        //   245: aload_1        
        //   246: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  7      11     199    200    Ljava/lang/Exception;
        //  7      11     195    199    Any
        //  13     18     199    200    Ljava/lang/Exception;
        //  13     18     195    199    Any
        //  20     23     199    200    Ljava/lang/Exception;
        //  20     23     195    199    Any
        //  27     32     199    200    Ljava/lang/Exception;
        //  27     32     195    199    Any
        //  34     38     199    200    Ljava/lang/Exception;
        //  34     38     195    199    Any
        //  39     43     199    200    Ljava/lang/Exception;
        //  39     43     195    199    Any
        //  46     50     199    200    Ljava/lang/Exception;
        //  46     50     195    199    Any
        //  51     54     199    200    Ljava/lang/Exception;
        //  51     54     195    199    Any
        //  56     59     199    200    Ljava/lang/Exception;
        //  56     59     195    199    Any
        //  61     64     199    200    Ljava/lang/Exception;
        //  61     64     195    199    Any
        //  69     74     199    200    Ljava/lang/Exception;
        //  69     74     195    199    Any
        //  76     81     199    200    Ljava/lang/Exception;
        //  76     81     195    199    Any
        //  81     84     187    195    Ljava/lang/Exception;
        //  81     84     179    187    Any
        //  85     89     187    195    Ljava/lang/Exception;
        //  85     89     179    187    Any
        //  90     94     187    195    Ljava/lang/Exception;
        //  90     94     179    187    Any
        //  100    105    187    195    Ljava/lang/Exception;
        //  100    105    179    187    Any
        //  107    111    187    195    Ljava/lang/Exception;
        //  107    111    179    187    Any
        //  112    116    187    195    Ljava/lang/Exception;
        //  112    116    179    187    Any
        //  117    122    187    195    Ljava/lang/Exception;
        //  117    122    179    187    Any
        //  131    135    187    195    Ljava/lang/Exception;
        //  131    135    179    187    Any
        //  140    144    187    195    Ljava/lang/Exception;
        //  140    144    179    187    Any
        //  148    153    187    195    Ljava/lang/Exception;
        //  148    153    179    187    Any
        //  154    159    162    169    Ljava/io/IOException;
        //  171    176    217    222    Ljava/io/IOException;
        //  200    204    195    199    Any
        //  209    214    217    222    Ljava/io/IOException;
        //  230    235    238    245    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 122 out of bounds for length 122
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:385)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:427)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
