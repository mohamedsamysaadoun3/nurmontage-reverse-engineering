/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.Uri
 *  android.util.Log
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.File;

public class UtilsFile {
    /*
     * Exception decompiling
     */
    private static File copyContentUriToFile(Context var0, Uri var1_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[UNCONDITIONALDOLOOP]], but top level block is 5[TRYBLOCK]
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

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public static String getDataColumn(Context context, Uri object, String string2, String[] object2) {
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
                string3 = "UtilsFile";
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

    public static File getPath(Context object, Uri object2) {
        if (object2 == null) {
            return null;
        }
        String string2 = "file";
        String string3 = object2.getScheme();
        boolean bl = string2.equals(string3);
        if (bl) {
            object2 = object2.getPath();
            object = new File((String)object2);
            return object;
        }
        string2 = "content";
        string3 = object2.getScheme();
        bl = string2.equals(string3);
        if (bl) {
            return UtilsFile.copyContentUriToFile(object, object2);
        }
        return null;
    }
}

