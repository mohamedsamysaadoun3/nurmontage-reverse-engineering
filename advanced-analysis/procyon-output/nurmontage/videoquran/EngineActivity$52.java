// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.Utils.PCMWaveformExtractor;
import com.arthenica.ffmpegkit.ReturnCode;
import com.arthenica.ffmpegkit.FFmpegSession;
import android.net.Uri;
import java.io.File;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;

class EngineActivity$52 implements FFmpegSessionCompleteCallback
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ EntityAudio val$entityAudio;
    final /* synthetic */ int val$h;
    final /* synthetic */ File val$outputFilePcm;
    final /* synthetic */ String val$path_video;
    final /* synthetic */ Uri val$uri_audio;
    final /* synthetic */ int val$w;
    
    EngineActivity$52(final EngineActivity this$0, final int val$h, final int val$w, final File val$outputFilePcm, final EntityAudio val$entityAudio, final Uri val$uri_audio, final String val$path_video) {
        this.this$0 = this$0;
        this.val$h = val$h;
        this.val$w = val$w;
        this.val$outputFilePcm = val$outputFilePcm;
        this.val$entityAudio = val$entityAudio;
        this.val$uri_audio = val$uri_audio;
        this.val$path_video = val$path_video;
    }
    
    public void apply(final FFmpegSession fFmpegSession) {
        if (ReturnCode.isSuccess(fFmpegSession.getReturnCode())) {
            try {
                final int val$h = this.val$h;
                final int n = this.val$w / ((int)(val$h * 0.1f) + (int)(val$h * 0.07f));
                try {
                    final File val$outputFilePcm = this.val$outputFilePcm;
                    try {
                        final float[] waveform = PCMWaveformExtractor.extractWaveform(val$outputFilePcm.getAbsolutePath(), n);
                        try {
                            final EntityAudio val$entityAudio = this.val$entityAudio;
                            try {
                                final int val$w = this.val$w;
                                try {
                                    val$entityAudio.setAmps(waveform, val$w, this.val$h);
                                    final EntityAudio val$entityAudio2 = this.val$entityAudio;
                                    try {
                                        final Uri val$uri_audio = this.val$uri_audio;
                                        try {
                                            val$entityAudio2.setPath_ffmpeg(val$uri_audio.getPath());
                                            final EntityAudio val$entityAudio3 = this.val$entityAudio;
                                            try {
                                                val$entityAudio3.setVideo_path(this.val$path_video);
                                                final EngineActivity this$0 = this.this$0;
                                                try {
                                                    final EngineActivity$52$1 engineActivity$52$1 = new EngineActivity$52$1(this);
                                                    final EngineActivity engineActivity = this$0;
                                                    try {
                                                        engineActivity.runOnUiThread((Runnable)engineActivity$52$1);
                                                    }
                                                    catch (final Exception ex) {
                                                        ex.printStackTrace();
                                                        this.this$0.runOnUiThread((Runnable)new EngineActivity$52$2(this));
                                                    }
                                                }
                                                catch (final Exception ex2) {}
                                            }
                                            catch (final Exception ex3) {}
                                        }
                                        catch (final Exception ex4) {}
                                    }
                                    catch (final Exception ex5) {}
                                }
                                catch (final Exception ex6) {}
                            }
                            catch (final Exception ex7) {}
                        }
                        catch (final Exception ex8) {}
                    }
                    catch (final Exception ex9) {}
                }
                catch (final Exception ex10) {}
            }
            catch (final Exception ex11) {}
        }
    }
}
