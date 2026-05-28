/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.arthenica.ffmpegkit.FFmpegSession
 *  com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
 *  com.arthenica.ffmpegkit.ReturnCode
 */
package hazem.nurmontage.videoquran;

import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.ReturnCode;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$55$1;
import hazem.nurmontage.videoquran.EngineActivity$55$2;
import hazem.nurmontage.videoquran.Utils.PCMWaveformExtractor;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import java.io.File;

class EngineActivity$55
implements FFmpegSessionCompleteCallback {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ EntityAudio val$entityAudio;
    final /* synthetic */ int val$h;
    final /* synthetic */ File val$outputFilePcm;
    final /* synthetic */ String val$path;
    final /* synthetic */ int val$w;

    EngineActivity$55(EngineActivity engineActivity, int n, int n2, File file, EntityAudio entityAudio, String string2) {
        this.this$0 = engineActivity;
        this.val$h = n;
        this.val$w = n2;
        this.val$outputFilePcm = file;
        this.val$entityAudio = entityAudio;
        this.val$path = string2;
    }

    public void apply(FFmpegSession object) {
        int n = ReturnCode.isSuccess((ReturnCode)(object = object.getReturnCode()));
        if (n != 0) {
            n = this.val$h;
            float f = (float)n * 0.1f;
            int n2 = (int)f;
            float f2 = n;
            int n3 = 1032805417;
            float f3 = 0.07f;
            n = (int)(f2 *= f3);
            n3 = this.val$w;
            n2 += n;
            n3 /= n2;
            object = this.val$outputFilePcm;
            object = object.getAbsolutePath();
            object = PCMWaveformExtractor.extractWaveform((String)object, n3);
            Object object2 = this.val$entityAudio;
            n3 = this.val$w;
            int n4 = this.val$h;
            ((EntityAudio)object2).setAmps((float[])object, n3, n4);
            object = this.val$entityAudio;
            object2 = this.val$path;
            object.setPath_ffmpeg((String)object2);
            object = this.this$0;
            object2 = new EngineActivity$55$1(this);
            try {
                object.runOnUiThread((Runnable)object2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                object = this.this$0;
                object2 = new EngineActivity$55$2(this);
                object.runOnUiThread((Runnable)object2);
            }
        }
    }
}

