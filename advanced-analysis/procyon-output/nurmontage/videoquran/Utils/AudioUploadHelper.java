// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.io.File;
import android.net.Uri;
import android.content.Context;

public class AudioUploadHelper
{
    private static final String TAG = "AudioUploadHelper";
    
    public static File processAudioUriForUpload(final Context p0, final Uri p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: astore_3       
        //     3: ldc             "AudioUploadHelper"
        //     5: astore          4
        //     7: ldc             "Failed to open InputStream for URI: "
        //     9: astore          5
        //    11: aload_0        
        //    12: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    15: astore          6
        //    17: aconst_null    
        //    18: astore          7
        //    20: aload           6
        //    22: aload_1        
        //    23: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //    26: astore          6
        //    28: aload           6
        //    30: ifnonnull       85
        //    33: new             Ljava/lang/StringBuilder;
        //    36: astore_0       
        //    37: aload_0        
        //    38: aload           5
        //    40: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    43: aload_0        
        //    44: aload_1        
        //    45: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    48: astore_0       
        //    49: aload_0        
        //    50: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    53: astore_0       
        //    54: aload           4
        //    56: aload_0        
        //    57: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    60: pop            
        //    61: aload           6
        //    63: ifnull          83
        //    66: aload           6
        //    68: invokevirtual   java/io/InputStream.close:()V
        //    71: goto            83
        //    74: astore_0       
        //    75: aload           4
        //    77: aload_3        
        //    78: aload_0        
        //    79: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    82: pop            
        //    83: aconst_null    
        //    84: areturn        
        //    85: new             Ljava/io/File;
        //    88: astore          5
        //    90: aload_0        
        //    91: aconst_null    
        //    92: invokevirtual   android/content/Context.getExternalFilesDir:(Ljava/lang/String;)Ljava/io/File;
        //    95: astore_0       
        //    96: aload           5
        //    98: aload_0        
        //    99: aload_2        
        //   100: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   103: new             Ljava/io/FileOutputStream;
        //   106: astore_0       
        //   107: aload_0        
        //   108: aload           5
        //   110: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   113: sipush          4096
        //   116: istore          8
        //   118: iload           8
        //   120: newarray        B
        //   122: astore_2       
        //   123: aload           6
        //   125: aload_2        
        //   126: invokevirtual   java/io/InputStream.read:([B)I
        //   129: istore          9
        //   131: iconst_m1      
        //   132: istore          10
        //   134: iload           9
        //   136: iload           10
        //   138: if_icmpeq       155
        //   141: iconst_0       
        //   142: istore          10
        //   144: aload_0        
        //   145: aload_2        
        //   146: iconst_0       
        //   147: iload           9
        //   149: invokevirtual   java/io/OutputStream.write:([BII)V
        //   152: goto            123
        //   155: aload_0        
        //   156: invokevirtual   java/io/OutputStream.flush:()V
        //   159: aload_0        
        //   160: invokevirtual   java/io/OutputStream.close:()V
        //   163: new             Ljava/lang/StringBuilder;
        //   166: astore_0       
        //   167: aload_0        
        //   168: invokespecial   java/lang/StringBuilder.<init>:()V
        //   171: ldc             "Audio content copied to cache file: "
        //   173: astore_2       
        //   174: aload_0        
        //   175: aload_2        
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: astore_0       
        //   180: aload           5
        //   182: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   185: astore_2       
        //   186: aload_0        
        //   187: aload_2        
        //   188: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   191: astore_0       
        //   192: aload_0        
        //   193: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   196: astore_0       
        //   197: aload           4
        //   199: aload_0        
        //   200: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   203: pop            
        //   204: aload           6
        //   206: ifnull          226
        //   209: aload           6
        //   211: invokevirtual   java/io/InputStream.close:()V
        //   214: goto            226
        //   217: astore_0       
        //   218: aload           4
        //   220: aload_3        
        //   221: aload_0        
        //   222: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   225: pop            
        //   226: aload           5
        //   228: areturn        
        //   229: astore_2       
        //   230: aload_0        
        //   231: invokevirtual   java/io/OutputStream.close:()V
        //   234: goto            243
        //   237: astore_0       
        //   238: aload_2        
        //   239: aload_0        
        //   240: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   243: aload_2        
        //   244: athrow         
        //   245: astore_0       
        //   246: goto            279
        //   249: astore_0       
        //   250: aload           6
        //   252: astore          7
        //   254: goto            430
        //   257: astore_0       
        //   258: aconst_null    
        //   259: astore          5
        //   261: goto            279
        //   264: astore_0       
        //   265: goto            368
        //   268: astore_0       
        //   269: goto            430
        //   272: astore_0       
        //   273: aconst_null    
        //   274: astore          5
        //   276: aconst_null    
        //   277: astore          6
        //   279: new             Ljava/lang/StringBuilder;
        //   282: astore_2       
        //   283: aload_2        
        //   284: invokespecial   java/lang/StringBuilder.<init>:()V
        //   287: ldc             "IOException while processing URI: "
        //   289: astore          11
        //   291: aload_2        
        //   292: aload           11
        //   294: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   297: astore_2       
        //   298: aload_2        
        //   299: aload_1        
        //   300: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   303: astore_1       
        //   304: aload_1        
        //   305: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   308: astore_1       
        //   309: aload           4
        //   311: aload_1        
        //   312: aload_0        
        //   313: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   316: pop            
        //   317: aload           5
        //   319: ifnull          340
        //   322: aload           5
        //   324: invokevirtual   java/io/File.exists:()Z
        //   327: istore          12
        //   329: iload           12
        //   331: ifeq            340
        //   334: aload           5
        //   336: invokevirtual   java/io/File.delete:()Z
        //   339: pop            
        //   340: aload           6
        //   342: ifnull          362
        //   345: aload           6
        //   347: invokevirtual   java/io/InputStream.close:()V
        //   350: goto            362
        //   353: astore_0       
        //   354: aload           4
        //   356: aload_3        
        //   357: aload_0        
        //   358: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   361: pop            
        //   362: aconst_null    
        //   363: areturn        
        //   364: astore_0       
        //   365: aconst_null    
        //   366: astore          6
        //   368: new             Ljava/lang/StringBuilder;
        //   371: astore_2       
        //   372: aload_2        
        //   373: invokespecial   java/lang/StringBuilder.<init>:()V
        //   376: ldc             "File not found for URI (or permission issue): "
        //   378: astore          5
        //   380: aload_2        
        //   381: aload           5
        //   383: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   386: astore_2       
        //   387: aload_2        
        //   388: aload_1        
        //   389: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   392: astore_1       
        //   393: aload_1        
        //   394: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   397: astore_1       
        //   398: aload           4
        //   400: aload_1        
        //   401: aload_0        
        //   402: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   405: pop            
        //   406: aload           6
        //   408: ifnull          428
        //   411: aload           6
        //   413: invokevirtual   java/io/InputStream.close:()V
        //   416: goto            428
        //   419: astore_0       
        //   420: aload           4
        //   422: aload_3        
        //   423: aload_0        
        //   424: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   427: pop            
        //   428: aconst_null    
        //   429: areturn        
        //   430: aload           7
        //   432: ifnull          452
        //   435: aload           7
        //   437: invokevirtual   java/io/InputStream.close:()V
        //   440: goto            452
        //   443: astore_1       
        //   444: aload           4
        //   446: aload_3        
        //   447: aload_1        
        //   448: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   451: pop            
        //   452: aload_0        
        //   453: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  22     26     364    368    Ljava/io/FileNotFoundException;
        //  22     26     272    279    Ljava/io/IOException;
        //  22     26     268    272    Any
        //  33     36     264    268    Ljava/io/FileNotFoundException;
        //  33     36     257    264    Ljava/io/IOException;
        //  33     36     249    257    Any
        //  38     43     264    268    Ljava/io/FileNotFoundException;
        //  38     43     257    264    Ljava/io/IOException;
        //  38     43     249    257    Any
        //  44     48     264    268    Ljava/io/FileNotFoundException;
        //  44     48     257    264    Ljava/io/IOException;
        //  44     48     249    257    Any
        //  49     53     264    268    Ljava/io/FileNotFoundException;
        //  49     53     257    264    Ljava/io/IOException;
        //  49     53     249    257    Any
        //  56     61     264    268    Ljava/io/FileNotFoundException;
        //  56     61     257    264    Ljava/io/IOException;
        //  56     61     249    257    Any
        //  66     71     74     83     Ljava/io/IOException;
        //  85     88     264    268    Ljava/io/FileNotFoundException;
        //  85     88     257    264    Ljava/io/IOException;
        //  85     88     249    257    Any
        //  91     95     264    268    Ljava/io/FileNotFoundException;
        //  91     95     257    264    Ljava/io/IOException;
        //  91     95     249    257    Any
        //  99     103    264    268    Ljava/io/FileNotFoundException;
        //  99     103    257    264    Ljava/io/IOException;
        //  99     103    249    257    Any
        //  103    106    264    268    Ljava/io/FileNotFoundException;
        //  103    106    245    249    Ljava/io/IOException;
        //  103    106    249    257    Any
        //  108    113    264    268    Ljava/io/FileNotFoundException;
        //  108    113    245    249    Ljava/io/IOException;
        //  108    113    249    257    Any
        //  118    122    229    245    Any
        //  125    129    229    245    Any
        //  147    152    229    245    Any
        //  155    159    229    245    Any
        //  159    163    264    268    Ljava/io/FileNotFoundException;
        //  159    163    245    249    Ljava/io/IOException;
        //  159    163    249    257    Any
        //  163    166    264    268    Ljava/io/FileNotFoundException;
        //  163    166    245    249    Ljava/io/IOException;
        //  163    166    249    257    Any
        //  167    171    264    268    Ljava/io/FileNotFoundException;
        //  167    171    245    249    Ljava/io/IOException;
        //  167    171    249    257    Any
        //  175    179    264    268    Ljava/io/FileNotFoundException;
        //  175    179    245    249    Ljava/io/IOException;
        //  175    179    249    257    Any
        //  180    185    264    268    Ljava/io/FileNotFoundException;
        //  180    185    245    249    Ljava/io/IOException;
        //  180    185    249    257    Any
        //  187    191    264    268    Ljava/io/FileNotFoundException;
        //  187    191    245    249    Ljava/io/IOException;
        //  187    191    249    257    Any
        //  192    196    264    268    Ljava/io/FileNotFoundException;
        //  192    196    245    249    Ljava/io/IOException;
        //  192    196    249    257    Any
        //  199    204    264    268    Ljava/io/FileNotFoundException;
        //  199    204    245    249    Ljava/io/IOException;
        //  199    204    249    257    Any
        //  209    214    217    226    Ljava/io/IOException;
        //  230    234    237    243    Any
        //  239    243    264    268    Ljava/io/FileNotFoundException;
        //  239    243    245    249    Ljava/io/IOException;
        //  239    243    249    257    Any
        //  243    245    264    268    Ljava/io/FileNotFoundException;
        //  243    245    245    249    Ljava/io/IOException;
        //  243    245    249    257    Any
        //  279    282    249    257    Any
        //  283    287    249    257    Any
        //  292    297    249    257    Any
        //  299    303    249    257    Any
        //  304    308    249    257    Any
        //  312    317    249    257    Any
        //  322    327    249    257    Any
        //  334    340    249    257    Any
        //  345    350    353    362    Ljava/io/IOException;
        //  368    371    249    257    Any
        //  372    376    249    257    Any
        //  381    386    249    257    Any
        //  388    392    249    257    Any
        //  393    397    249    257    Any
        //  401    406    249    257    Any
        //  411    416    419    428    Ljava/io/IOException;
        //  435    440    443    452    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0226:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
