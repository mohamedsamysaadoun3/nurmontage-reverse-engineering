/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.View
 *  android.view.Window
 *  androidx.core.view.WindowCompat
 *  com.arthenica.ffmpegkit.FFmpegKit
 *  com.arthenica.ffmpegkit.FFmpegSession
 *  com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
 *  com.arthenica.ffmpegkit.ReturnCode
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import androidx.core.view.WindowCompat;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.ReturnCode;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.ShareWithMeActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.ShareWithMeActivity$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.ShareWithMeActivity$$ExternalSyntheticLambda2;
import hazem.nurmontage.videoquran.ShareWithMeActivity$$ExternalSyntheticLambda3;
import hazem.nurmontage.videoquran.ShareWithMeActivity$1;
import hazem.nurmontage.videoquran.Utils.AudioUploadHelper;
import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import hazem.nurmontage.videoquran.WorkUserActivity;
import java.io.File;

public class ShareWithMeActivity
extends Base {
    /*
     * Exception decompiling
     */
    private File copyVideoToCache(Uri var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[UNCONDITIONALDOLOOP]], but top level block is 6[TRYBLOCK]
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

    private Parcelable getParcelable(Intent intent, String string2, Class clazz) {
        int n = Build.VERSION.SDK_INT;
        int n2 = 33;
        if (n >= n2) {
            return (Parcelable)intent.getParcelableExtra(string2, clazz);
        }
        return intent.getParcelableExtra(string2);
    }

    private void handleAudio(Intent object) {
        String string2 = "android.intent.extra.STREAM";
        Class<Uri> clazz = Uri.class;
        if ((object = (Uri)this.getParcelable((Intent)object, string2, clazz)) != null) {
            string2 = new Intent((Context)this, EngineActivity.class);
            clazz = AudioUploadHelper.processAudioUriForUpload((Context)this, (Uri)object, "share_with_me.mp3");
            string2.setData((Uri)object);
            object = "muri";
            clazz = ((File)((Object)clazz)).getAbsolutePath();
            string2.putExtra((String)object, (String)((Object)clazz));
            this.startActivity((Intent)string2);
            this.finish();
        }
    }

    private void handleImg(Intent object) {
        String string2 = "android.intent.extra.STREAM";
        Class<Uri> clazz = Uri.class;
        if ((object = (Uri)this.getParcelable((Intent)object, string2, clazz)) != null) {
            string2 = new Intent((Context)this, EngineActivity.class);
            clazz = "img_bg";
            object = this.savePermanent((Uri)object);
            string2.putExtra((String)((Object)clazz), (String)object);
            this.startActivity((Intent)string2);
            this.finish();
        }
    }

    private void handleIntent(Intent intent) {
        String string2 = intent.getType();
        if (string2 == null) {
            intent = new Intent((Context)this, WorkUserActivity.class);
            this.startActivity(intent);
            this.finish();
            return;
        }
        LocalPersistence.deleteTemplate((Context)this, "template_tmp");
        String string3 = "image/";
        boolean bl = string2.startsWith(string3);
        if (bl) {
            this.handleImg(intent);
        } else {
            string3 = "audio/";
            bl = string2.startsWith(string3);
            if (bl) {
                this.handleAudio(intent);
            } else {
                string3 = "video/";
                boolean bl2 = string2.startsWith(string3);
                if (bl2) {
                    this.handleVideo(intent);
                }
            }
        }
    }

    private void handleVideo(Intent intent) {
        String string2 = "android.intent.extra.STREAM";
        Class<Uri> clazz = Uri.class;
        if ((intent = (Uri)this.getParcelable(intent, string2, clazz)) != null) {
            this.processVideo((Uri)intent);
        }
    }

    private void processVideo(Uri object) {
        object = this.copyVideoToCache((Uri)object).getAbsolutePath();
        CharSequence charSequence = new StringBuilder();
        Object object2 = this.getExternalFilesDir(null);
        charSequence = charSequence.append(object2).append("/share_with_me.m4a").toString();
        object2 = new StringBuilder("-y -i \"");
        object2 = ((StringBuilder)object2).append((String)object).append("\" -vn -map 0:a? -c:a copy \"").append((String)charSequence).append("\"").toString();
        ShareWithMeActivity$$ExternalSyntheticLambda0 shareWithMeActivity$$ExternalSyntheticLambda0 = new ShareWithMeActivity$$ExternalSyntheticLambda0(this, (String)charSequence, (String)object);
        FFmpegKit.executeAsync((String)object2, (FFmpegSessionCompleteCallback)shareWithMeActivity$$ExternalSyntheticLambda0);
    }

    /*
     * Exception decompiling
     */
    private String savePermanent(Uri var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[UNCONDITIONALDOLOOP]], but top level block is 13[TRYBLOCK]
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

    private void toEngine(Uri uri, String string2) {
        Intent intent = new Intent((Context)this, EngineActivity.class);
        intent.setData(uri);
        intent.putExtra("muri", string2);
        this.startActivity(intent);
        this.finish();
    }

    /* synthetic */ void cfr_renamed_364(String string2) {
        Uri uri = Uri.parse((String)string2);
        this.toEngine(uri, string2);
    }

    /* synthetic */ void cfr_renamed_365(String string2) {
        Uri uri = Uri.parse((String)string2);
        this.toEngine(uri, string2);
    }

    /* synthetic */ void cfr_renamed_366(String object, FFmpegSession object2) {
        boolean bl = ReturnCode.isSuccess((ReturnCode)(object2 = object2.getReturnCode()));
        if (bl) {
            object2 = new ShareWithMeActivity$$ExternalSyntheticLambda3(this, (String)object);
            this.runOnUiThread((Runnable)object2);
        } else {
            object = new ShareWithMeActivity$1(this);
            this.runOnUiThread((Runnable)object);
        }
    }

    /* synthetic */ void cfr_renamed_367(String string2, String object, FFmpegSession object2) {
        boolean bl = ReturnCode.isSuccess((ReturnCode)(object2 = object2.getReturnCode()));
        if (bl) {
            object = new ShareWithMeActivity$$ExternalSyntheticLambda1(this, string2);
            this.runOnUiThread((Runnable)object);
        } else {
            String string3 = "-y -i \"";
            object2 = new StringBuilder(string3);
            object = ((StringBuilder)object2).append((String)object).append("\" -vn -map 0:a? -c:a aac -b:a 192k \"").append(string2).append("\"").toString();
            object2 = new ShareWithMeActivity$$ExternalSyntheticLambda2(this, string2);
            FFmpegKit.executeAsync((String)object, (FFmpegSessionCompleteCallback)object2);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n = R$layout.activity_share_with_me;
        this.setContentView(n);
        n = -1;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        bundle = this.getWindow();
        View view = this.getWindow().getDecorView();
        bundle = WindowCompat.getInsetsController((Window)bundle, (View)view);
        boolean bl = true;
        bundle.setAppearanceLightStatusBars(bl);
        bundle.setAppearanceLightNavigationBars(bl);
        bundle = this.getIntent();
        this.handleIntent((Intent)bundle);
    }
}

