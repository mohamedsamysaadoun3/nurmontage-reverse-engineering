/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.net.Uri
 *  com.arthenica.ffmpegkit.FFmpegSession
 *  com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
 *  com.arthenica.ffmpegkit.ReturnCode
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.ReturnCode;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$59$1;
import hazem.nurmontage.videoquran.EngineActivity$59$2;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import java.io.File;

class EngineActivity$59
implements FFmpegSessionCompleteCallback {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ EntityAudio val$entityAudio;
    final /* synthetic */ File val$file;
    final /* synthetic */ Uri val$uri;

    EngineActivity$59(EngineActivity engineActivity, Uri uri, EntityAudio entityAudio, File file) {
        this.this$0 = engineActivity;
        this.val$uri = uri;
        this.val$entityAudio = entityAudio;
        this.val$file = file;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void apply(FFmpegSession var1_1) {
        block30: {
            var2_2 = ReturnCode.isSuccess((ReturnCode)(var1_1 = var1_1.getReturnCode()));
            if (!var2_2) break block30;
            var1_1 = this.this$0;
            var3_3 = new MediaPlayer();
            EngineActivity.cfr_renamed_143((EngineActivity)var1_1, (MediaPlayer)var3_3);
            var1_1 = this.this$0;
            var1_1 = EngineActivity.cfr_renamed_144((EngineActivity)var1_1);
            var4_4 = 3 != 0;
            var1_1.setAudioStreamType((int)var4_4);
            var1_1 = this.val$uri;
            var1_1 = var1_1.getScheme();
            if (var1_1 == null) ** GOTO lbl38
            var1_1 = this.val$uri;
            var1_1 = var1_1.getScheme();
            var3_3 = "http";
            var2_2 = var1_1.startsWith((String)var3_3);
            if (!var2_2) ** GOTO lbl38
            var1_1 = this.this$0;
            var1_1 = EngineActivity.cfr_renamed_144((EngineActivity)var1_1);
            var3_3 = this.val$uri;
            var3_3 = var3_3.toString();
            var1_1.setDataSource((String)var3_3);
            ** GOTO lbl47
lbl38:
            // 2 sources

            var1_1 = this.this$0;
            var1_1 = EngineActivity.cfr_renamed_144((EngineActivity)var1_1);
            var3_3 = this.this$0;
            var5_5 = this.val$uri;
            var1_1.setDataSource((Context)var3_3, var5_5);
lbl47:
            // 2 sources

            var1_1 = this.this$0;
            var1_1 = EngineActivity.cfr_renamed_144((EngineActivity)var1_1);
            var1_1.prepareAsync();
            var1_1 = this.this$0;
            var1_1 = EngineActivity.cfr_renamed_144((EngineActivity)var1_1);
            var3_3 = new EngineActivity$59$1(this);
            var1_1.setOnPreparedListener((MediaPlayer.OnPreparedListener)var3_3);
            var1_1 = this.val$entityAudio;
            var3_3 = this.val$file;
            var3_3 = var3_3.getAbsolutePath();
            var1_1.setPath_ffmpeg_effect((String)var3_3);
            var1_1 = this.val$entityAudio;
            var4_4 = true;
            try {
                var1_1.setApplyEffectInPreview(var4_4);
            }
            catch (Exception v0) {
                v0.printStackTrace();
                var1_1 = this.this$0;
                var3_3 = new EngineActivity$59$2(this);
                var1_1.runOnUiThread((Runnable)var3_3);
            }
        }
    }
}

