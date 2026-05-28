// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.graphics.Typeface;
import android.provider.MediaStore$Audio$Media;
import android.provider.MediaStore$Video$Media;
import android.provider.MediaStore$Images$Media;
import android.content.ContentUris;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.util.Log;
import android.net.Uri;
import android.content.Context;

public class UtilsFileLast
{
    private static final String TAG = "UtilsFileLast";
    
    private static String extractNumericId(final String s) {
        return s;
    }
    
    private static String getDataColumn(final Context p0, final Uri p1, final String p2, final String[] p3) {
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
        //   109: ldc             "UtilsFileLast"
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
    
    public static String getPath(final Context context, Uri uri) {
        final String str = "Downloads document path: ";
        final String string = "getPath called with URI: " + uri;
        final String s = "UtilsFileLast";
        Log.d(s, string);
        if (context == null || uri == null) {
            Log.e(s, "Context or URI is null");
            return null;
        }
        if (DocumentsContract.isDocumentUri(context, uri)) {
            Log.d(s, "URI is a document URI");
            final boolean externalStorageDocument = isExternalStorageDocument(uri);
            final String s2 = ":";
            final int n = 1;
            if (externalStorageDocument) {
                Log.d(s, "URI is an external storage document");
                final String documentId = DocumentsContract.getDocumentId(uri);
                final String[] split = documentId.split(s2);
                if ("primary".equalsIgnoreCase(split[0])) {
                    final String string2 = Environment.getExternalStorageDirectory() + "/" + split[n];
                    Log.d(s, "External storage path (primary): " + string2);
                    return string2;
                }
                Log.d(s, "External storage path (non-primary): " + documentId);
                uri = DocumentsContract.buildTreeDocumentUri("com.android.externalstorage.documents", documentId);
                final String pathFromTreeUri = getPathFromTreeUri(context, uri, split[n]);
                if (pathFromTreeUri != null) {
                    return pathFromTreeUri;
                }
                return null;
            }
            else {
                if (isDownloadsDocument(uri)) {
                    Log.d(s, "URI is a downloads document");
                    final String documentId2 = DocumentsContract.getDocumentId(uri);
                    final String numericId = extractNumericId(documentId2);
                    if (numericId == null) {
                        Log.e(s, "Could not extract numeric ID from downloads document ID: " + documentId2);
                        return null;
                    }
                    final String s3 = "content://downloads/public_downloads";
                    try {
                        uri = Uri.parse(s3);
                        try {
                            uri = ContentUris.withAppendedId(uri, Long.parseLong(numericId));
                            final String dataColumn = getDataColumn(context, uri, null, null);
                            try {
                                final StringBuilder sb = new StringBuilder(str);
                                try {
                                    final StringBuilder append = sb.append(dataColumn);
                                    try {
                                        Log.d(s, append.toString());
                                        return dataColumn;
                                    }
                                    catch (final NumberFormatException ex) {
                                        Log.e(s, "Error parsing numeric ID from downloads document ID: " + numericId, (Throwable)ex);
                                        return null;
                                    }
                                }
                                catch (final NumberFormatException ex2) {}
                            }
                            catch (final NumberFormatException ex3) {}
                        }
                        catch (final NumberFormatException ex4) {}
                    }
                    catch (final NumberFormatException ex5) {}
                }
                if (isMediaDocument(uri)) {
                    Log.d(s, "URI is a media document");
                    final String[] split2 = DocumentsContract.getDocumentId(uri).split(s2);
                    final String s4 = split2[0];
                    Uri uri2;
                    if ("image".equals(s4)) {
                        uri2 = MediaStore$Images$Media.EXTERNAL_CONTENT_URI;
                    }
                    else if ("video".equals(s4)) {
                        uri2 = MediaStore$Video$Media.EXTERNAL_CONTENT_URI;
                    }
                    else {
                        if (!"audio".equals(s4)) {
                            Log.w(s, "Unsupported media document type: " + s4);
                            return null;
                        }
                        uri2 = MediaStore$Audio$Media.EXTERNAL_CONTENT_URI;
                    }
                    final String[] array = new String[n];
                    array[0] = split2[n];
                    final String dataColumn2 = getDataColumn(context, uri2, "_id=?", array);
                    Log.d(s, "Media document path: " + dataColumn2);
                    return dataColumn2;
                }
                Log.w(s, "Unsupported document URI: " + uri);
                return null;
            }
        }
        else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                Log.d(s, "URI is a content URI");
                final String dataColumn3 = getDataColumn(context, uri, null, null);
                Log.d(s, "Content URI path: " + dataColumn3);
                return dataColumn3;
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                Log.d(s, "URI is a file URI");
                final String path = uri.getPath();
                Log.d(s, "File URI path: " + path);
                return path;
            }
            Log.w(s, "Unsupported URI scheme: " + uri.getScheme());
            return null;
        }
    }
    
    private static String getPathFromTreeUri(final Context p0, final Uri p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: astore_3       
        //     3: ldc             "_display_name"
        //     5: astore          4
        //     7: ldc             "document_id"
        //     9: astore          5
        //    11: aconst_null    
        //    12: astore          6
        //    14: aload_1        
        //    15: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //    18: astore          7
        //    20: aload_1        
        //    21: invokestatic    android/provider/DocumentsContract.getTreeDocumentId:(Landroid/net/Uri;)Ljava/lang/String;
        //    24: astore          8
        //    26: aload           7
        //    28: aload           8
        //    30: invokestatic    android/provider/DocumentsContract.buildChildDocumentsUri:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
        //    33: astore          9
        //    35: aload_0        
        //    36: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    39: astore          10
        //    41: iconst_3       
        //    42: istore          11
        //    44: iload           11
        //    46: anewarray       Ljava/lang/String;
        //    49: astore          12
        //    51: iconst_0       
        //    52: istore          11
        //    54: aconst_null    
        //    55: astore          7
        //    57: aload           12
        //    59: iconst_0       
        //    60: aload           5
        //    62: aastore        
        //    63: iconst_1       
        //    64: istore          11
        //    66: aload           12
        //    68: iload           11
        //    70: aload           4
        //    72: aastore        
        //    73: iconst_2       
        //    74: istore          11
        //    76: aload           12
        //    78: iload           11
        //    80: aload_3        
        //    81: aastore        
        //    82: aload           10
        //    84: aload           9
        //    86: aload           12
        //    88: aconst_null    
        //    89: aconst_null    
        //    90: aconst_null    
        //    91: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    94: astore          7
        //    96: aload           7
        //    98: ifnull          358
        //   101: aload           7
        //   103: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   108: istore          13
        //   110: iload           13
        //   112: ifeq            358
        //   115: aload           7
        //   117: aload           5
        //   119: invokeinterface android/database/Cursor.getColumnIndexOrThrow:(Ljava/lang/String;)I
        //   124: istore          13
        //   126: aload           7
        //   128: iload           13
        //   130: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   135: astore          8
        //   137: aload           7
        //   139: aload           4
        //   141: invokeinterface android/database/Cursor.getColumnIndexOrThrow:(Ljava/lang/String;)I
        //   146: istore          14
        //   148: aload           7
        //   150: iload           14
        //   152: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   157: astore          10
        //   159: aload           7
        //   161: aload_3        
        //   162: invokeinterface android/database/Cursor.getColumnIndexOrThrow:(Ljava/lang/String;)I
        //   167: istore          15
        //   169: aload           7
        //   171: iload           15
        //   173: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   178: astore          9
        //   180: aload           10
        //   182: aload_2        
        //   183: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   186: istore          14
        //   188: ldc             "vnd.android.document/directory"
        //   190: astore          12
        //   192: iload           14
        //   194: ifeq            286
        //   197: aload           12
        //   199: aload           9
        //   201: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   204: istore          14
        //   206: iload           14
        //   208: ifeq            248
        //   211: aload_1        
        //   212: aload           8
        //   214: invokestatic    android/provider/DocumentsContract.buildDocumentUriUsingTree:(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
        //   217: astore          8
        //   219: aload_0        
        //   220: aload           8
        //   222: aload_2        
        //   223: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsFileLast.getPathFromTreeUri:(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;
        //   226: astore          8
        //   228: aload           8
        //   230: ifnull          337
        //   233: aload           7
        //   235: ifnull          245
        //   238: aload           7
        //   240: invokeinterface android/database/Cursor.close:()V
        //   245: aload           8
        //   247: areturn        
        //   248: aload_1        
        //   249: aload           8
        //   251: invokestatic    android/provider/DocumentsContract.buildDocumentUriUsingTree:(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
        //   254: astore          8
        //   256: aload_0        
        //   257: aload           8
        //   259: aconst_null    
        //   260: aconst_null    
        //   261: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsFileLast.getDataColumn:(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
        //   264: astore          8
        //   266: aload           8
        //   268: ifnull          337
        //   271: aload           7
        //   273: ifnull          283
        //   276: aload           7
        //   278: invokeinterface android/database/Cursor.close:()V
        //   283: aload           8
        //   285: areturn        
        //   286: aload           9
        //   288: aload           12
        //   290: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   293: istore          14
        //   295: iload           14
        //   297: ifeq            337
        //   300: aload_1        
        //   301: aload           8
        //   303: invokestatic    android/provider/DocumentsContract.buildDocumentUriUsingTree:(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
        //   306: astore          8
        //   308: aload_0        
        //   309: aload           8
        //   311: aload_2        
        //   312: invokestatic    hazem/nurmontage/videoquran/Utils/UtilsFileLast.getPathFromTreeUri:(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;
        //   315: astore          8
        //   317: aload           8
        //   319: ifnull          337
        //   322: aload           7
        //   324: ifnull          334
        //   327: aload           7
        //   329: invokeinterface android/database/Cursor.close:()V
        //   334: aload           8
        //   336: areturn        
        //   337: aload           7
        //   339: invokeinterface android/database/Cursor.moveToNext:()Z
        //   344: istore          13
        //   346: iload           13
        //   348: ifne            115
        //   351: goto            358
        //   354: astore_0       
        //   355: goto            377
        //   358: aload           7
        //   360: ifnull          403
        //   363: goto            396
        //   366: astore_0       
        //   367: goto            410
        //   370: astore_0       
        //   371: iconst_0       
        //   372: istore          11
        //   374: aconst_null    
        //   375: astore          7
        //   377: ldc             "UtilsFileLast"
        //   379: astore_1       
        //   380: ldc_w           "Error in getPathFromTreeUri"
        //   383: astore_2       
        //   384: aload_1        
        //   385: aload_2        
        //   386: aload_0        
        //   387: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   390: pop            
        //   391: aload           7
        //   393: ifnull          403
        //   396: aload           7
        //   398: invokeinterface android/database/Cursor.close:()V
        //   403: aconst_null    
        //   404: areturn        
        //   405: astore_0       
        //   406: aload           7
        //   408: astore          6
        //   410: aload           6
        //   412: ifnull          422
        //   415: aload           6
        //   417: invokeinterface android/database/Cursor.close:()V
        //   422: aload_0        
        //   423: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  14     18     370    377    Ljava/lang/Exception;
        //  14     18     366    370    Any
        //  20     24     370    377    Ljava/lang/Exception;
        //  20     24     366    370    Any
        //  28     33     370    377    Ljava/lang/Exception;
        //  28     33     366    370    Any
        //  35     39     370    377    Ljava/lang/Exception;
        //  35     39     366    370    Any
        //  44     49     370    377    Ljava/lang/Exception;
        //  44     49     366    370    Any
        //  60     63     370    377    Ljava/lang/Exception;
        //  60     63     366    370    Any
        //  70     73     370    377    Ljava/lang/Exception;
        //  70     73     366    370    Any
        //  80     82     370    377    Ljava/lang/Exception;
        //  80     82     366    370    Any
        //  90     94     370    377    Ljava/lang/Exception;
        //  90     94     366    370    Any
        //  101    108    354    358    Ljava/lang/Exception;
        //  101    108    405    410    Any
        //  117    124    354    358    Ljava/lang/Exception;
        //  117    124    405    410    Any
        //  128    135    354    358    Ljava/lang/Exception;
        //  128    135    405    410    Any
        //  139    146    354    358    Ljava/lang/Exception;
        //  139    146    405    410    Any
        //  150    157    354    358    Ljava/lang/Exception;
        //  150    157    405    410    Any
        //  161    167    354    358    Ljava/lang/Exception;
        //  161    167    405    410    Any
        //  171    178    354    358    Ljava/lang/Exception;
        //  171    178    405    410    Any
        //  182    186    354    358    Ljava/lang/Exception;
        //  182    186    405    410    Any
        //  199    204    354    358    Ljava/lang/Exception;
        //  199    204    405    410    Any
        //  212    217    354    358    Ljava/lang/Exception;
        //  212    217    405    410    Any
        //  222    226    354    358    Ljava/lang/Exception;
        //  222    226    405    410    Any
        //  249    254    354    358    Ljava/lang/Exception;
        //  249    254    405    410    Any
        //  260    264    354    358    Ljava/lang/Exception;
        //  260    264    405    410    Any
        //  288    293    354    358    Ljava/lang/Exception;
        //  288    293    405    410    Any
        //  301    306    354    358    Ljava/lang/Exception;
        //  301    306    405    410    Any
        //  311    315    354    358    Ljava/lang/Exception;
        //  311    315    405    410    Any
        //  337    344    354    358    Ljava/lang/Exception;
        //  337    344    405    410    Any
        //  386    391    405    410    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0115:
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
    
    private static boolean isDownloadsDocument(final Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }
    
    private static boolean isExternalStorageDocument(final Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }
    
    private static boolean isMediaDocument(final Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
    
    public static Typeface loadFontFromAsset(final Context context, final String s) {
        try {
            return Typeface.createFromAsset(context.getAssets(), s);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
