/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.ContentUris
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.os.Environment
 *  android.provider.DocumentsContract
 *  android.provider.MediaStore$Audio$Media
 *  android.provider.MediaStore$Images$Media
 *  android.provider.MediaStore$Video$Media
 *  android.util.Log
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;

public class UtilsFileLast {
    private static final String TAG = "UtilsFileLast";

    private static String extractNumericId(String string2) {
        return string2;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    private static String getDataColumn(Context context, Uri object, String string2, String[] object2) {
        void var1_8;
        Context context2;
        block12: {
            block13: {
                String string3;
                block11: {
                    block10: {
                        String string4;
                        void var3_11;
                        String string5 = "_data";
                        String[] stringArray = new String[]{string5};
                        context2 = null;
                        ContentResolver contentResolver = context.getContentResolver();
                        context = contentResolver.query(object, stringArray, string3, (String[])var3_11, null);
                        if (context == null) break block10;
                        try {
                            int n = context.moveToFirst();
                            if (n == 0) break block10;
                            n = context.getColumnIndexOrThrow(string5);
                            string4 = context.getString(n);
                            if (context == null) return string4;
                        }
                        catch (Exception exception) {
                            break block11;
                        }
                        context.close();
                        return string4;
                    }
                    if (context == null) return null;
                    break block13;
                    catch (Throwable throwable) {
                        break block12;
                    }
                    catch (Exception exception) {
                        context = null;
                    }
                }
                string3 = TAG;
                String string6 = "Error getting data column";
                try {
                    void var1_6;
                    Log.e((String)string3, (String)string6, (Throwable)var1_6);
                    if (context == null) return null;
                }
                catch (Throwable throwable) {
                    context2 = context;
                }
            }
            context.close();
            return null;
        }
        if (context2 == null) throw var1_8;
        context2.close();
        throw var1_8;
    }

    public static String getPath(Context object, Uri object2) {
        String string2;
        block20: {
            Object object3;
            block21: {
                block22: {
                    block26: {
                        int n;
                        String[] stringArray;
                        block24: {
                            CharSequence charSequence;
                            boolean bl;
                            block25: {
                                block23: {
                                    object3 = "Downloads document path: ";
                                    stringArray = new StringBuilder("getPath called with URI: ");
                                    stringArray = stringArray.append(object2).toString();
                                    string2 = TAG;
                                    Log.d((String)string2, (String)stringArray);
                                    stringArray = null;
                                    if (object == null || object2 == null) break block20;
                                    bl = DocumentsContract.isDocumentUri((Context)object, (Uri)object2);
                                    if (!bl) break block21;
                                    charSequence = "URI is a document URI";
                                    Log.d((String)string2, (String)charSequence);
                                    bl = UtilsFileLast.isExternalStorageDocument((Uri)object2);
                                    String string3 = ":";
                                    n = 1;
                                    if (bl) {
                                        Log.d((String)string2, (String)"URI is an external storage document");
                                        object2 = DocumentsContract.getDocumentId((Uri)object2);
                                        object3 = ((String)object2).split(string3);
                                        charSequence = object3[0];
                                        string3 = "primary";
                                        bl = string3.equalsIgnoreCase((String)charSequence);
                                        if (bl) {
                                            object = new StringBuilder();
                                            object2 = Environment.getExternalStorageDirectory();
                                            object = ((StringBuilder)object).append(object2).append("/");
                                            object2 = object3[n];
                                            object = ((StringBuilder)object).append((String)object2).toString();
                                            object2 = new StringBuilder("External storage path (primary): ");
                                            object2 = ((StringBuilder)object2).append((String)object).toString();
                                            Log.d((String)string2, (String)object2);
                                            return object;
                                        }
                                        string3 = "External storage path (non-primary): ";
                                        charSequence = new StringBuilder(string3);
                                        charSequence = ((StringBuilder)charSequence).append((String)object2).toString();
                                        Log.d((String)string2, (String)charSequence);
                                        string2 = "com.android.externalstorage.documents";
                                        object2 = DocumentsContract.buildTreeDocumentUri((String)string2, (String)object2);
                                        object3 = object3[n];
                                        object = UtilsFileLast.getPathFromTreeUri((Context)object, (Uri)object2, (String)object3);
                                        if (object != null) {
                                            return object;
                                        }
                                        return null;
                                    }
                                    bl = UtilsFileLast.isDownloadsDocument((Uri)object2);
                                    if (bl) {
                                        Log.d((String)string2, (String)"URI is a downloads document");
                                        object2 = DocumentsContract.getDocumentId((Uri)object2);
                                        charSequence = UtilsFileLast.extractNumericId((String)object2);
                                        if (charSequence == null) {
                                            object = new StringBuilder("Could not extract numeric ID from downloads document ID: ");
                                            object = ((StringBuilder)object).append((String)object2).toString();
                                            Log.e((String)string2, (String)object);
                                            return null;
                                        }
                                        object2 = "content://downloads/public_downloads";
                                        try {
                                            object2 = Uri.parse((String)object2);
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            object2 = new StringBuilder("Error parsing numeric ID from downloads document ID: ");
                                            object2 = ((StringBuilder)object2).append((String)charSequence).toString();
                                            Log.e((String)string2, (String)object2, (Throwable)numberFormatException);
                                            return null;
                                        }
                                        long l = Long.parseLong((String)charSequence);
                                        object2 = ContentUris.withAppendedId((Uri)object2, (long)l);
                                        object = UtilsFileLast.getDataColumn((Context)object, (Uri)object2, null, null);
                                        object2 = new StringBuilder((String)object3);
                                        object2 = ((StringBuilder)object2).append((String)object);
                                        object2 = ((StringBuilder)object2).toString();
                                        Log.d((String)string2, (String)object2);
                                        return object;
                                    }
                                    boolean bl2 = UtilsFileLast.isMediaDocument((Uri)object2);
                                    if (!bl2) break block22;
                                    Log.d((String)string2, (String)"URI is a media document");
                                    object2 = DocumentsContract.getDocumentId((Uri)object2).split(string3);
                                    object3 = object2[0];
                                    charSequence = "image";
                                    bl = ((String)charSequence).equals(object3);
                                    if (!bl) break block23;
                                    object3 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                                    break block24;
                                }
                                charSequence = "video";
                                bl = ((String)charSequence).equals(object3);
                                if (!bl) break block25;
                                object3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                break block24;
                            }
                            charSequence = "audio";
                            bl = ((String)charSequence).equals(object3);
                            if (!bl) break block26;
                            object3 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        }
                        stringArray = new String[n];
                        stringArray[0] = object2 = object2[n];
                        object = UtilsFileLast.getDataColumn((Context)object, object3, "_id=?", stringArray);
                        object2 = new StringBuilder("Media document path: ");
                        object2 = ((StringBuilder)object2).append((String)object).toString();
                        Log.d((String)string2, (String)object2);
                        return object;
                    }
                    object = new StringBuilder("Unsupported media document type: ");
                    object = ((StringBuilder)object).append((String)object3).toString();
                    Log.w((String)string2, (String)object);
                    return null;
                }
                object = new StringBuilder("Unsupported document URI: ");
                object = ((StringBuilder)object).append(object2).toString();
                Log.w((String)string2, (String)object);
                return null;
            }
            object3 = "content";
            String string4 = object2.getScheme();
            boolean bl = object3.equalsIgnoreCase(string4);
            if (bl) {
                Log.d((String)string2, (String)"URI is a content URI");
                object = UtilsFileLast.getDataColumn((Context)object, (Uri)object2, null, null);
                object2 = new StringBuilder("Content URI path: ");
                object2 = ((StringBuilder)object2).append((String)object).toString();
                Log.d((String)string2, (String)object2);
                return object;
            }
            object = "file";
            object3 = object2.getScheme();
            boolean bl3 = ((String)object).equalsIgnoreCase((String)object3);
            if (bl3) {
                Log.d((String)string2, (String)"URI is a file URI");
                object = object2.getPath();
                object2 = new StringBuilder("File URI path: ");
                object2 = ((StringBuilder)object2).append((String)object).toString();
                Log.d((String)string2, (String)object2);
                return object;
            }
            object = new StringBuilder("Unsupported URI scheme: ");
            object2 = object2.getScheme();
            object = ((StringBuilder)object).append((String)object2).toString();
            Log.w((String)string2, (String)object);
            return null;
        }
        Log.e((String)string2, (String)"Context or URI is null");
        return null;
    }

    /*
     * Exception decompiling
     */
    private static String getPathFromTreeUri(Context var0, Uri var1_6, String var2_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [31[DOLOOP]], but top level block is 25[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static boolean isDownloadsDocument(Uri object) {
        object = object.getAuthority();
        return "com.android.providers.downloads.documents".equals(object);
    }

    private static boolean isExternalStorageDocument(Uri object) {
        object = object.getAuthority();
        return "com.android.externalstorage.documents".equals(object);
    }

    private static boolean isMediaDocument(Uri object) {
        object = object.getAuthority();
        return "com.android.providers.media.documents".equals(object);
    }

    public static Typeface loadFontFromAsset(Context context, String string2) {
        try {
            context = context.getAssets();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
        return Typeface.createFromAsset((AssetManager)context, (String)string2);
    }
}

