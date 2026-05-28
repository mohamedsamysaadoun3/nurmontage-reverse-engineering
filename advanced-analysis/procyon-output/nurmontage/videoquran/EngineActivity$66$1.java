// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.model.EffectAudio;
import android.net.Uri;
import com.arthenica.ffmpegkit.FFmpegKit;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Locale;
import java.util.ArrayList;
import hazem.nurmontage.videoquran.model.EntityMedia;
import com.arthenica.ffmpegkit.ReturnCode;
import com.arthenica.ffmpegkit.FFmpegSession;
import java.io.File;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;

class EngineActivity$66$1 implements FFmpegSessionCompleteCallback
{
    final /* synthetic */ EngineActivity$66 this$1;
    final /* synthetic */ File val$outputFile;
    final /* synthetic */ File val$outputFilePcm;
    
    EngineActivity$66$1(final EngineActivity$66 this$1, final File val$outputFile, final File val$outputFilePcm) {
        this.this$1 = this$1;
        this.val$outputFile = val$outputFile;
        this.val$outputFilePcm = val$outputFilePcm;
    }
    
    public void apply(final FFmpegSession fFmpegSession) {
        if (ReturnCode.isSuccess(fFmpegSession.getReturnCode())) {
            if (this.this$1.val$index >= 0 && this.this$1.val$index < EngineActivity.-$$Nest$fgetmTemplate(this.this$1.this$0).getEntityMediaList().size()) {
                final EntityMedia entityMedia = EngineActivity.-$$Nest$fgetmTemplate(this.this$1.this$0).getEntityMediaList().get(this.this$1.val$index);
                if (entityMedia.isApplyEffectInPreview()) {
                    final File file = new File(EngineActivity.-$$Nest$fgetmTemplate(this.this$1.this$0).getFolder_template(), System.currentTimeMillis() + "_audio_echo.mp3");
                    final EffectAudio effectAudio = entityMedia.getEffectAudio();
                    final float start = effectAudio.getStart();
                    final float n = 1000.0f;
                    final float f = start / n;
                    final float f2 = effectAudio.getEnd() / n;
                    final ArrayList list = new ArrayList();
                    list.add("atrim=start=" + f + ":end=" + f2);
                    list.add("asetpts=N/SR/TB");
                    if (effectAudio.isRemoveNoice()) {
                        list.add("afftdn=nf=-25");
                    }
                    list.add(String.format(Locale.US, "volume=%.2f", effectAudio.getVolume()));
                    if (effectAudio.getFade_in() > 0) {
                        list.add("afade=t=in:st=0:d=" + (float)effectAudio.getFade_in());
                    }
                    if (effectAudio.getFade_out() > 0) {
                        final float f3 = (float)effectAudio.getFade_out();
                        list.add("afade=t=out:st=" + (f2 - f - f3) + ":d=" + f3);
                    }
                    if (effectAudio.isEnhance()) {
                        list.add("equalizer=f=3000:t=h:width=200:g=2,compand=attacks=0.3:decays=0.8:points=-80/-80|-20/-10|0/-3");
                    }
                    if (effectAudio.getReverbPreset() != null) {
                        list.add(effectAudio.getReverbPreset());
                    }
                    final int decays = effectAudio.getDecays();
                    final float f4 = 1.0f;
                    if (decays > 0) {
                        list.add(String.format(Locale.US, "aecho=%.2f:%.2f:%s:%s", f4, effectAudio.getOutGain(), effectAudio.getDelays_cmd(), effectAudio.getDecays_cmd()));
                    }
                    if (effectAudio.getSpeed() != f4) {
                        list.addAll(EngineActivity.-$$Nest$mbuildSpeedFilters(this.this$1.this$0, effectAudio.getSpeed()));
                    }
                    EngineActivity.-$$Nest$fgetid_ffmpeg(this.this$1.this$0).add(FFmpegKit.executeWithArgumentsAsync(new String[] { "-i", this.val$outputFile.getAbsolutePath(), "-af", TextUtils.join((CharSequence)",", (Iterable)list), "-y", file.getAbsolutePath() }, (FFmpegSessionCompleteCallback)new EngineActivity$66$1$1(this, file)).getSessionId());
                    return;
                }
            }
            EngineActivity.-$$Nest$maddAudioTemplate(this.this$1.this$0, Uri.fromFile(this.val$outputFile), this.this$1.val$pathes, this.this$1.val$index, this.val$outputFile.getAbsolutePath(), this.val$outputFilePcm.getAbsolutePath(), this.this$1.val$path_video);
        }
    }
}
