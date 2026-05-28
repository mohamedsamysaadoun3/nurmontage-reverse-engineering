// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.io.InputStream;
import android.content.ContentResolver;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.File;
import android.net.Uri;
import android.content.Context;

public class UtilsFile
{
    private static File copyContentUriToFile(final Context context, final Uri uri) {
        final ContentResolver contentResolver = context.getContentResolver();
        final File file = new File(context.getCacheDir(), "temp_file");
        final ContentResolver contentResolver2 = contentResolver;
        try {
            final InputStream openInputStream = contentResolver2.openInputStream(uri);
            if (openInputStream != null) {
                final FileOutputStream fileOutputStream = new FileOutputStream(file);
                final byte[] array = new byte[4096];
                while (true) {
                    final int read = openInputStream.read(array);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(array, 0, read);
                }
                fileOutputStream.close();
                openInputStream.close();
                return file;
            }
        }
        catch (final Exception ex) {
            Log.e("UtilsFile", "Error copying content URI to file", (Throwable)ex);
        }
        return null;
    }
    
    public static String getDataColumn(final Context p0, final Uri p1, final String p2, final String[] p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: anewarray       Ljava/lang/String;
        //     4: astore          4
        //     6: ldc             "_data"
        //     8: astore          5
        //    10: aload           4
        //    12: iconst_0       
        //    13: aload           5
        //    15: aastore        
        //    16: aconst_null    
        //    17: astore          6
        //    19: aload_0        
        //    20: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    23: astore          7
        //    25: aload           7
        //    27: aload_1        
        //    28: aload           4
        //    30: aload_2        
        //    31: aload_3        
        //    32: aconst_null    
        //    33: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    36: astore_0       
        //    37: aload_0        
        //    38: ifnull          89
        //    41: aload_0        
        //    42: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    47: istore          8
        //    49: iload           8
        //    51: ifeq            89
        //    54: aload_0        
        //    55: aload           5
        //    57: invokeinterface android/database/Cursor.getColumnIndexOrThrow:(Ljava/lang/String;)I
        //    62: istore          8
        //    64: aload_0        
        //    65: iload           8
        //    67: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    72: astore_1       
        //    73: aload_0        
        //    74: ifnull          83
        //    77: aload_0        
        //    78: invokeinterface android/database/Cursor.close:()V
        //    83: aload_1        
        //    84: areturn        
        //    85: astore_1       
        //    86: goto            109
        //    89: aload_0        
        //    90: ifnull          129
        //    93: aload_0        
        //    94: invokeinterface android/database/Cursor.close:()V
        //    99: goto            129
        //   102: astore_1       
        //   103: goto            135
        //   106: astore_1       
        //   107: aconst_null    
        //   108: astore_0       
        //   109: ldc             "UtilsFile"
        //   111: astore_2       
        //   112: ldc             "Error getting data column"
        //   114: astore_3       
        //   115: aload_2        
        //   116: aload_3        
        //   117: aload_1        
        //   118: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   121: pop            
        //   122: aload_0        
        //   123: ifnull          129
        //   126: goto            93
        //   129: aconst_null    
        //   130: areturn        
        //   131: astore_1       
        //   132: aload_0        
        //   133: astore          6
        //   135: aload           6
        //   137: ifnull          147
        //   140: aload           6
        //   142: invokeinterface android/database/Cursor.close:()V
        //   147: aload_1        
        //   148: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  19     23     106    109    Ljava/lang/Exception;
        //  19     23     102    106    Any
        //  32     36     106    109    Ljava/lang/Exception;
        //  32     36     102    106    Any
        //  41     47     85     89     Ljava/lang/Exception;
        //  41     47     131    135    Any
        //  55     62     85     89     Ljava/lang/Exception;
        //  55     62     131    135    Any
        //  65     72     85     89     Ljava/lang/Exception;
        //  65     72     131    135    Any
        //  117    122    131    135    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0083:
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
    
    public static File getPath(final Context context, final Uri uri) {
        if (uri == null) {
            return null;
        }
        if ("file".equals(uri.getScheme())) {
            return new File(uri.getPath());
        }
        if ("content".equals(uri.getScheme())) {
            return copyContentUriToFile(context, uri);
        }
        return null;
    }
}
