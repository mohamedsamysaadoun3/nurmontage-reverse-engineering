// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.database.Cursor;
import java.io.InputStream;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.File;
import android.net.Uri;
import android.content.Context;
import java.util.UUID;
import android.os.Looper;
import java.util.concurrent.Executors;
import android.os.Handler;
import java.util.concurrent.ExecutorService;

public class AudioUtils
{
    private static final String TAG = "AudioUtils";
    private static final ExecutorService executor;
    private static final Handler mainHandler;
    
    static {
        executor = Executors.newSingleThreadExecutor();
        mainHandler = new Handler(Looper.getMainLooper());
    }
    
    private static String addUniqueSuffix(String substring) {
        final int lastIndex = substring.lastIndexOf(".");
        String substring2;
        if (lastIndex > 0) {
            substring2 = substring.substring(0, lastIndex);
        }
        else {
            substring2 = substring;
        }
        if (lastIndex > 0) {
            substring = substring.substring(lastIndex);
        }
        else {
            substring = "";
        }
        return substring2 + "_" + UUID.randomUUID() + substring;
    }
    
    public static String copyFromUri(final Context context, final Uri uri, final String pathname) {
        final String str = "audio_";
        try {
            final InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return null;
            }
            final File parent = new File(pathname);
            if (!parent.exists()) {
                parent.mkdirs();
            }
            try {
                final String fileName = getFileName(context, uri);
                Label_0101: {
                    if (fileName != null) {
                        break Label_0101;
                    }
                    final StringBuilder append = new StringBuilder(str).append(System.currentTimeMillis()).append(".mp3");
                    try {
                        String child = append.toString();
                        try {
                            final File file = new File(parent, child);
                            final FileOutputStream fileOutputStream = new FileOutputStream(file);
                            final byte[] array = new byte[8192];
                            while (true) {
                                final int read = openInputStream.read(array);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(array, 0, read);
                            }
                            openInputStream.close();
                            fileOutputStream.close();
                            return file.getAbsolutePath();
                        }
                        catch (final Exception ex) {
                            Log.e("AudioUtils", "URI copy error", (Throwable)ex);
                            return null;
                        }
                        child = addUniqueSuffix(fileName);
                    }
                    catch (final Exception ex2) {}
                }
            }
            catch (final Exception ex3) {}
        }
        catch (final Exception ex4) {}
    }
    
    public static void copyToLocalAsync(final Context context, final String s, final String s2, final AudioUtils$Callback audioUtils$Callback) {
        AudioUtils.executor.execute(new AudioUtils$$ExternalSyntheticLambda2(s, context, s2, audioUtils$Callback));
    }
    
    public static String downloadFile(final Context p0, final String p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: astore_0       
        //     3: ldc             "audio_"
        //     5: astore_3       
        //     6: ldc             "HTTP error: "
        //     8: astore          4
        //    10: aconst_null    
        //    11: astore          5
        //    13: new             Ljava/net/URL;
        //    16: astore          6
        //    18: aload           6
        //    20: aload_1        
        //    21: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    24: aload           6
        //    26: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //    29: astore_1       
        //    30: aload_1        
        //    31: checkcast       Ljava/net/HttpURLConnection;
        //    34: astore_1       
        //    35: sipush          15000
        //    38: istore          7
        //    40: aload_1        
        //    41: iload           7
        //    43: invokevirtual   java/net/HttpURLConnection.setConnectTimeout:(I)V
        //    46: aload_1        
        //    47: iload           7
        //    49: invokevirtual   java/net/HttpURLConnection.setReadTimeout:(I)V
        //    52: aload_1        
        //    53: invokevirtual   java/net/HttpURLConnection.connect:()V
        //    56: aload_1        
        //    57: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //    60: istore          7
        //    62: sipush          200
        //    65: istore          8
        //    67: iload           7
        //    69: iload           8
        //    71: if_icmpeq       118
        //    74: new             Ljava/lang/StringBuilder;
        //    77: astore_2       
        //    78: aload_2        
        //    79: aload           4
        //    81: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    84: aload_1        
        //    85: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //    88: istore          9
        //    90: aload_2        
        //    91: iload           9
        //    93: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    96: astore_2       
        //    97: aload_2        
        //    98: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   101: astore_2       
        //   102: aload_0        
        //   103: aload_2        
        //   104: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   107: pop            
        //   108: aload_1        
        //   109: ifnull          116
        //   112: aload_1        
        //   113: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   116: aconst_null    
        //   117: areturn        
        //   118: aload_1        
        //   119: invokevirtual   java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
        //   122: astore          4
        //   124: new             Ljava/io/File;
        //   127: astore          6
        //   129: aload           6
        //   131: aload_2        
        //   132: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   135: aload           6
        //   137: invokevirtual   java/io/File.exists:()Z
        //   140: istore          10
        //   142: iload           10
        //   144: ifne            153
        //   147: aload           6
        //   149: invokevirtual   java/io/File.mkdirs:()Z
        //   152: pop            
        //   153: new             Ljava/io/File;
        //   156: astore_2       
        //   157: new             Ljava/lang/StringBuilder;
        //   160: astore          11
        //   162: aload           11
        //   164: aload_3        
        //   165: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   168: invokestatic    java/lang/System.currentTimeMillis:()J
        //   171: lstore          12
        //   173: aload           11
        //   175: lload           12
        //   177: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   180: astore_3       
        //   181: ldc             ".mp3"
        //   183: astore          11
        //   185: aload_3        
        //   186: aload           11
        //   188: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   191: astore_3       
        //   192: aload_3        
        //   193: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   196: astore_3       
        //   197: aload_2        
        //   198: aload           6
        //   200: aload_3        
        //   201: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   204: new             Ljava/io/FileOutputStream;
        //   207: astore_3       
        //   208: aload_3        
        //   209: aload_2        
        //   210: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   213: sipush          8192
        //   216: istore          7
        //   218: iload           7
        //   220: newarray        B
        //   222: astore          6
        //   224: aload           4
        //   226: aload           6
        //   228: invokevirtual   java/io/InputStream.read:([B)I
        //   231: istore          8
        //   233: iconst_m1      
        //   234: istore          14
        //   236: iload           8
        //   238: iload           14
        //   240: if_icmpeq       258
        //   243: iconst_0       
        //   244: istore          14
        //   246: aload_3        
        //   247: aload           6
        //   249: iconst_0       
        //   250: iload           8
        //   252: invokevirtual   java/io/FileOutputStream.write:([BII)V
        //   255: goto            224
        //   258: aload           4
        //   260: invokevirtual   java/io/InputStream.close:()V
        //   263: aload_3        
        //   264: invokevirtual   java/io/FileOutputStream.close:()V
        //   267: aload_2        
        //   268: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   271: astore_0       
        //   272: aload_1        
        //   273: ifnull          280
        //   276: aload_1        
        //   277: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   280: aload_0        
        //   281: areturn        
        //   282: astore_2       
        //   283: goto            293
        //   286: astore_0       
        //   287: goto            317
        //   290: astore_2       
        //   291: aconst_null    
        //   292: astore_1       
        //   293: ldc             "Download error"
        //   295: astore_3       
        //   296: aload_0        
        //   297: aload_3        
        //   298: aload_2        
        //   299: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   302: pop            
        //   303: aload_1        
        //   304: ifnull          311
        //   307: aload_1        
        //   308: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   311: aconst_null    
        //   312: areturn        
        //   313: astore_0       
        //   314: aload_1        
        //   315: astore          5
        //   317: aload           5
        //   319: ifnull          327
        //   322: aload           5
        //   324: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   327: aload_0        
        //   328: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  13     16     290    293    Ljava/lang/Exception;
        //  13     16     286    290    Any
        //  20     24     290    293    Ljava/lang/Exception;
        //  20     24     286    290    Any
        //  24     29     290    293    Ljava/lang/Exception;
        //  24     29     286    290    Any
        //  30     34     290    293    Ljava/lang/Exception;
        //  30     34     286    290    Any
        //  41     46     282    286    Ljava/lang/Exception;
        //  41     46     313    317    Any
        //  47     52     282    286    Ljava/lang/Exception;
        //  47     52     313    317    Any
        //  52     56     282    286    Ljava/lang/Exception;
        //  52     56     313    317    Any
        //  56     60     282    286    Ljava/lang/Exception;
        //  56     60     313    317    Any
        //  74     77     282    286    Ljava/lang/Exception;
        //  74     77     313    317    Any
        //  79     84     282    286    Ljava/lang/Exception;
        //  79     84     313    317    Any
        //  84     88     282    286    Ljava/lang/Exception;
        //  84     88     313    317    Any
        //  91     96     282    286    Ljava/lang/Exception;
        //  91     96     313    317    Any
        //  97     101    282    286    Ljava/lang/Exception;
        //  97     101    313    317    Any
        //  103    108    282    286    Ljava/lang/Exception;
        //  103    108    313    317    Any
        //  118    122    282    286    Ljava/lang/Exception;
        //  118    122    313    317    Any
        //  124    127    282    286    Ljava/lang/Exception;
        //  124    127    313    317    Any
        //  131    135    282    286    Ljava/lang/Exception;
        //  131    135    313    317    Any
        //  135    140    282    286    Ljava/lang/Exception;
        //  135    140    313    317    Any
        //  147    153    282    286    Ljava/lang/Exception;
        //  147    153    313    317    Any
        //  153    156    282    286    Ljava/lang/Exception;
        //  153    156    313    317    Any
        //  157    160    282    286    Ljava/lang/Exception;
        //  157    160    313    317    Any
        //  164    168    282    286    Ljava/lang/Exception;
        //  164    168    313    317    Any
        //  168    171    282    286    Ljava/lang/Exception;
        //  168    171    313    317    Any
        //  175    180    282    286    Ljava/lang/Exception;
        //  175    180    313    317    Any
        //  186    191    282    286    Ljava/lang/Exception;
        //  186    191    313    317    Any
        //  192    196    282    286    Ljava/lang/Exception;
        //  192    196    313    317    Any
        //  200    204    282    286    Ljava/lang/Exception;
        //  200    204    313    317    Any
        //  204    207    282    286    Ljava/lang/Exception;
        //  204    207    313    317    Any
        //  209    213    282    286    Ljava/lang/Exception;
        //  209    213    313    317    Any
        //  218    222    282    286    Ljava/lang/Exception;
        //  218    222    313    317    Any
        //  226    231    282    286    Ljava/lang/Exception;
        //  226    231    313    317    Any
        //  250    255    282    286    Ljava/lang/Exception;
        //  250    255    313    317    Any
        //  258    263    282    286    Ljava/lang/Exception;
        //  258    263    313    317    Any
        //  263    267    282    286    Ljava/lang/Exception;
        //  263    267    313    317    Any
        //  267    271    282    286    Ljava/lang/Exception;
        //  267    271    313    317    Any
        //  298    303    313    317    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0224:
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
    
    private static String getFileName(final Context context, final Uri uri) {
        if ("content".equals(uri.getScheme())) {
            Cursor query = null;
            try {
                query = context.getContentResolver().query(uri, (String[])null, (String)null, (String[])null, (String)null);
                if (query != null && query.moveToFirst()) {
                    final int columnIndex = query.getColumnIndex("_display_name");
                    if (columnIndex != -1) {
                        return query.getString(columnIndex);
                    }
                }
            }
            finally {
                if (query != null) {
                    query.close();
                }
            }
        }
        return uri.getLastPathSegment();
    }
}
