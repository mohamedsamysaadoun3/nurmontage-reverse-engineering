/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import hazem.nurmontage.videoquran.Utils.AudioUtils$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.Utils.AudioUtils$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.Utils.AudioUtils$$ExternalSyntheticLambda2;
import hazem.nurmontage.videoquran.Utils.AudioUtils$Callback;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AudioUtils {
    private static final String TAG = "AudioUtils";
    private static final ExecutorService executor;
    private static final Handler mainHandler;

    static {
        Handler handler;
        executor = Executors.newSingleThreadExecutor();
        Looper looper = Looper.getMainLooper();
        mainHandler = handler = new Handler(looper);
    }

    private static String addUniqueSuffix(String string2) {
        CharSequence charSequence = ".";
        int n = string2.lastIndexOf((String)charSequence);
        Object object = n > 0 ? string2.substring(0, n) : string2;
        string2 = n > 0 ? string2.substring(n) : "";
        charSequence = new StringBuilder();
        charSequence = ((StringBuilder)charSequence).append((String)object).append("_");
        object = UUID.randomUUID();
        return ((StringBuilder)charSequence).append(object).append(string2).toString();
    }

    /*
     * Exception decompiling
     */
    public static String copyFromUri(Context var0, Uri var1_2, String var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [19[UNCONDITIONALDOLOOP]], but top level block is 17[TRYBLOCK]
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

    public static void copyToLocalAsync(Context context, String string2, String string3, AudioUtils$Callback audioUtils$Callback) {
        ExecutorService executorService = executor;
        AudioUtils$$ExternalSyntheticLambda2 audioUtils$$ExternalSyntheticLambda2 = new AudioUtils$$ExternalSyntheticLambda2(string2, context, string3, audioUtils$Callback);
        executorService.execute(audioUtils$$ExternalSyntheticLambda2);
    }

    /*
     * Exception decompiling
     */
    public static String downloadFile(Context var0, String var1_4, String var2_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [29[UNCONDITIONALDOLOOP]], but top level block is 23[TRYBLOCK]
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

    private static String getFileName(Context object, Uri uri) {
        block11: {
            String string2 = "content";
            String string3 = uri.getScheme();
            boolean bl = string2.equals(string3);
            if (bl) {
                block10: {
                    bl = false;
                    string2 = null;
                    string3 = object.getContentResolver();
                    string2 = string3.query(uri, null, null, null, null);
                    if (string2 == null) break block10;
                    int n = string2.moveToFirst();
                    if (n == 0) break block10;
                    object = "_display_name";
                    n = string2.getColumnIndex((String)object);
                    int n2 = -1;
                    if (n == n2) break block10;
                    object = string2.getString(n);
                    return object;
                }
                if (string2 != null) {
                    string2.close();
                }
                break block11;
                finally {
                    if (string2 != null) {
                        string2.close();
                    }
                }
            }
        }
        return uri.getLastPathSegment();
    }

    static /* synthetic */ void lambda$copyToLocalAsync$0(String object, AudioUtils$Callback audioUtils$Callback) {
        if (object != null) {
            audioUtils$Callback.onSuccess((String)object);
        } else {
            String string2 = "Failed to process file";
            object = new Exception(string2);
            audioUtils$Callback.onError((Exception)object);
        }
    }

    static /* synthetic */ void lambda$copyToLocalAsync$1(AudioUtils$Callback audioUtils$Callback, Exception exception) {
        audioUtils$Callback.onError(exception);
    }

    static /* synthetic */ void lambda$copyToLocalAsync$2(String string2, Context context, String object, AudioUtils$Callback audioUtils$Callback) {
        block10: {
            block9: {
                String string3 = "http";
                boolean bl = string2.startsWith(string3);
                if (!bl) break block9;
                string2 = AudioUtils.downloadFile(context, string2, (String)object);
                break block10;
            }
            string2 = Uri.parse((String)string2);
            string2 = AudioUtils.copyFromUri(context, (Uri)string2, (String)object);
        }
        context = mainHandler;
        object = new AudioUtils$$ExternalSyntheticLambda0(string2, audioUtils$Callback);
        try {
            context.post((Runnable)object);
        }
        catch (Exception exception) {
            context = mainHandler;
            object = new AudioUtils$$ExternalSyntheticLambda1(audioUtils$Callback, exception);
            context.post((Runnable)object);
        }
    }
}

