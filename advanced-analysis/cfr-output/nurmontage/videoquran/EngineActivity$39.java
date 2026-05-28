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
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$39$1;
import hazem.nurmontage.videoquran.model.EffectAudio;
import hazem.nurmontage.videoquran.model.EntityMedia;
import java.io.File;

class EngineActivity$39
implements FFmpegSessionCompleteCallback {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ EffectAudio val$effectAudio;
    final /* synthetic */ EntityMedia val$entityMedia;
    final /* synthetic */ File val$file;
    final /* synthetic */ int val$index;
    final /* synthetic */ String val$path;
    final /* synthetic */ String val$path_video;
    final /* synthetic */ Uri val$uri;

    EngineActivity$39(EngineActivity engineActivity, File file, EntityMedia entityMedia, EffectAudio effectAudio, Uri uri, int n, String string2, String string3) {
        this.this$0 = engineActivity;
        this.val$file = file;
        this.val$entityMedia = entityMedia;
        this.val$effectAudio = effectAudio;
        this.val$uri = uri;
        this.val$index = n;
        this.val$path = string2;
        this.val$path_video = string3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void apply(FFmpegSession var1_1) {
        var1_1 /* !! */  = this.this$0;
        var2_3 /* !! */  = new MediaPlayer();
        EngineActivity.cfr_renamed_143((EngineActivity)var1_1 /* !! */ , var2_3 /* !! */ );
        var1_1 /* !! */  = this.this$0;
        var1_1 /* !! */  = EngineActivity.cfr_renamed_144((EngineActivity)var1_1 /* !! */ );
        var3_4 = 3;
        var1_1 /* !! */ .setAudioStreamType(var3_4);
        var1_1 /* !! */  = this.val$file;
        var1_1 /* !! */  = Uri.fromFile((File)var1_1 /* !! */ );
        var2_3 /* !! */  = var1_1 /* !! */ .getScheme();
        if (var2_3 /* !! */  == null) ** GOTO lbl34
        var2_3 /* !! */  = var1_1 /* !! */ .getScheme();
        var4_5 /* !! */  = "http";
        var3_4 = (int)var2_3 /* !! */ .startsWith(var4_5 /* !! */ );
        if (var3_4 == 0) ** GOTO lbl34
        var2_3 /* !! */  = this.this$0;
        var2_3 /* !! */  = EngineActivity.cfr_renamed_144((EngineActivity)var2_3 /* !! */ );
        var1_1 /* !! */  = var1_1 /* !! */ .toString();
        var2_3 /* !! */ .setDataSource((String)var1_1 /* !! */ );
        ** GOTO lbl41
lbl34:
        // 2 sources

        var2_3 /* !! */  = this.this$0;
        var2_3 /* !! */  = EngineActivity.cfr_renamed_144((EngineActivity)var2_3 /* !! */ );
        var4_5 /* !! */  = this.this$0;
        var2_3 /* !! */ .setDataSource((Context)var4_5 /* !! */ , (Uri)var1_1 /* !! */ );
lbl41:
        // 2 sources

        var1_1 /* !! */  = this.this$0;
        var1_1 /* !! */  = EngineActivity.cfr_renamed_144((EngineActivity)var1_1 /* !! */ );
        var1_1 /* !! */ .prepareAsync();
        var1_1 /* !! */  = this.this$0;
        var1_1 /* !! */  = EngineActivity.cfr_renamed_144((EngineActivity)var1_1 /* !! */ );
        var2_3 /* !! */  = new EngineActivity$39$1(this);
        try {
            var1_1 /* !! */ .setOnPreparedListener((MediaPlayer.OnPreparedListener)var2_3 /* !! */ );
        }
        catch (Exception var1_2) {
            var1_2.printStackTrace();
        }
    }
}

