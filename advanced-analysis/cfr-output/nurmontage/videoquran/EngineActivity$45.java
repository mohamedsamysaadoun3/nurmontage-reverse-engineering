/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  com.arthenica.ffmpegkit.FFmpegSession
 *  com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
 *  com.arthenica.ffmpegkit.ReturnCode
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.net.Uri;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.ReturnCode;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$45$1;
import hazem.nurmontage.videoquran.EngineActivity$45$2;
import hazem.nurmontage.videoquran.Utils.AudioUtils;
import hazem.nurmontage.videoquran.Utils.PCMWaveformExtractor;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.model.EntityMedia;
import java.io.File;
import java.util.List;

class EngineActivity$45
implements FFmpegSessionCompleteCallback {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ EntityMedia val$entityMedia;
    final /* synthetic */ EntityAudio val$finalEntityAudio;
    final /* synthetic */ int val$h;
    final /* synthetic */ int val$index;
    final /* synthetic */ File val$outputFilePcm;
    final /* synthetic */ String val$path;
    final /* synthetic */ int val$w;

    EngineActivity$45(EngineActivity engineActivity, int n, int n2, File file, EntityAudio entityAudio, String string2, int n3, EntityMedia entityMedia) {
        this.this$0 = engineActivity;
        this.val$h = n;
        this.val$w = n2;
        this.val$outputFilePcm = file;
        this.val$finalEntityAudio = entityAudio;
        this.val$path = string2;
        this.val$index = n3;
        this.val$entityMedia = entityMedia;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void apply(FFmpegSession var1_1) {
        block56: {
            var2_3 = ReturnCode.isSuccess((ReturnCode)(var1_1 /* !! */  = var1_1 /* !! */ .getReturnCode()));
            if (var2_3 == 0) break block56;
            var2_3 = this.val$h;
            var3_4 = (float)var2_3 * 0.1f;
            var4_5 = (int)var3_4;
            var5_6 = var2_3;
            var6_7 = 1032805417;
            var7_8 = 0.07f;
            var2_3 = (int)(var5_6 *= var7_8);
            var6_7 = this.val$w;
            var4_5 += var2_3;
            var6_7 /= var4_5;
            var1_1 /* !! */  = this.val$outputFilePcm;
            var1_1 /* !! */  = var1_1 /* !! */ .getAbsolutePath();
            var1_1 /* !! */  = (FFmpegSession)PCMWaveformExtractor.extractWaveform((String)var1_1 /* !! */ , var6_7);
            var8_9 /* !! */  = this.val$finalEntityAudio;
            var6_7 = this.val$w;
            var9_10 = this.val$h;
            var8_9 /* !! */ .setAmps((float[])var1_1 /* !! */ , var6_7, var9_10);
            var1_1 /* !! */  = this.val$finalEntityAudio;
            var8_9 /* !! */  = this.val$path;
            var1_1 /* !! */ .setPath_ffmpeg((String)var8_9 /* !! */ );
            var2_3 = this.val$index;
            var4_5 = 1;
            var3_4 = 1.4E-45f;
            var2_3 += var4_5;
            var10_11 /* !! */  = this.this$0;
            var10_11 /* !! */  = EngineActivity.cfr_renamed_2(var10_11 /* !! */ );
            var10_11 /* !! */  = var10_11 /* !! */ .getEntityMediaList();
            var6_7 = var10_11 /* !! */ .size();
            if (var2_3 < var6_7) ** GOTO lbl-1000
            var1_1 /* !! */  = this.this$0;
            var8_9 /* !! */  = new EngineActivity$45$1(this);
            try {
                var1_1 /* !! */ .runOnUiThread((Runnable)var8_9 /* !! */ );
            }
            catch (Exception var1_2) {
                var1_2.printStackTrace();
            }
            break block56;
lbl-1000:
            // 1 sources

            {
                var10_11 /* !! */  = this.this$0;
            }
            var10_11 /* !! */  = EngineActivity.cfr_renamed_2(var10_11 /* !! */ );
            var10_11 /* !! */  = var10_11 /* !! */ .getEntityMediaList();
            var10_11 /* !! */  = var10_11 /* !! */ .get(var2_3);
            var10_11 /* !! */  = (EntityMedia)var10_11 /* !! */ ;
            var11_12 = var10_11 /* !! */ .getVideo_path();
            if (var11_12 == null) ** GOTO lbl123
            var10_11 /* !! */  = this.this$0;
            var11_12 = EngineActivity.cfr_renamed_2(var10_11 /* !! */ );
            var11_12 = var11_12.getUri_upload_extract_audio_video();
            var11_12 = Uri.parse((String)var11_12);
            var12_13 = this.this$0;
            var12_13 = EngineActivity.cfr_renamed_2((EngineActivity)var12_13);
            var12_13 = var12_13.getFolder_template();
            var10_11 /* !! */  = AudioUtils.copyFromUri((Context)var10_11 /* !! */ , (Uri)var11_12, (String)var12_13);
            var11_12 = this.val$entityMedia;
            var11_12.setVideo_path((String)var10_11 /* !! */ );
            var10_11 /* !! */  = this.this$0;
            var10_11 /* !! */  = EngineActivity.cfr_renamed_2(var10_11 /* !! */ );
            var10_11 /* !! */  = var10_11 /* !! */ .getExtension();
            if (var10_11 /* !! */  == null) ** GOTO lbl110
            var8_9 /* !! */  = this.this$0;
            var10_11 /* !! */  = EngineActivity.cfr_renamed_2((EngineActivity)var8_9 /* !! */ );
            var10_11 /* !! */  = var10_11 /* !! */ .getExtension();
            var11_12 = this.val$entityMedia;
            var11_12 = var11_12.getVideo_path();
            EngineActivity.cfr_renamed_3((EngineActivity)var8_9 /* !! */ , (String)var10_11 /* !! */ , (String)var11_12, var2_3);
            break block56;
lbl110:
            // 1 sources

            var10_11 /* !! */  = this.this$0;
            var9_10 = 0;
            var11_12 = null;
            EngineActivity.cfr_renamed_4(var10_11 /* !! */ , 0);
            var10_11 /* !! */  = this.this$0;
            var12_13 = this.val$entityMedia;
            var12_13 = var12_13.getVideo_path();
            EngineActivity.cfr_renamed_5(var10_11 /* !! */ , (String)var12_13, 0, (boolean)var4_5, var2_3);
            break block56;
lbl123:
            // 1 sources

            var8_9 /* !! */  = var10_11 /* !! */ .getPaths_https();
            var9_10 = 0;
            var11_12 = null;
            if (var8_9 /* !! */  == null) ** GOTO lbl134
            var8_9 /* !! */  = this.this$0;
            var10_11 /* !! */  = var10_11 /* !! */ .getPaths_https();
            EngineActivity.cfr_renamed_6((EngineActivity)var8_9 /* !! */ , (List)var10_11 /* !! */ , var2_3, null);
            break block56;
lbl134:
            // 1 sources

            var8_9 /* !! */  = this.this$0;
            var10_11 /* !! */  = var10_11 /* !! */ .getUri();
            var10_11 /* !! */  = Uri.parse((String)var10_11 /* !! */ );
            EngineActivity.cfr_renamed_7((EngineActivity)var8_9 /* !! */ , (Uri)var10_11 /* !! */ , var2_3, null);
            {
                catch (Exception v0) {
                    v0.printStackTrace();
                    var1_1 /* !! */  = this.this$0;
                    var8_9 /* !! */  = new EngineActivity$45$2(this);
                    var1_1 /* !! */ .runOnUiThread((Runnable)var8_9 /* !! */ );
                }
            }
        }
    }
}

