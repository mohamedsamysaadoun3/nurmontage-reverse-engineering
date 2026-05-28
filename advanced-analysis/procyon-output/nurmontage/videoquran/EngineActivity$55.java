// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.Utils.PCMWaveformExtractor;
import com.arthenica.ffmpegkit.ReturnCode;
import com.arthenica.ffmpegkit.FFmpegSession;
import java.io.File;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;

class EngineActivity$55 implements FFmpegSessionCompleteCallback
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ EntityAudio val$entityAudio;
    final /* synthetic */ int val$h;
    final /* synthetic */ File val$outputFilePcm;
    final /* synthetic */ String val$path;
    final /* synthetic */ int val$w;
    
    EngineActivity$55(final EngineActivity this$0, final int val$h, final int val$w, final File val$outputFilePcm, final EntityAudio val$entityAudio, final String val$path) {
        this.this$0 = this$0;
        this.val$h = val$h;
        this.val$w = val$w;
        this.val$outputFilePcm = val$outputFilePcm;
        this.val$entityAudio = val$entityAudio;
        this.val$path = val$path;
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
                                        val$entityAudio2.setPath_ffmpeg(this.val$path);
                                        final EngineActivity this$0 = this.this$0;
                                        try {
                                            final EngineActivity$55$1 engineActivity$55$1 = new EngineActivity$55$1(this);
                                            final EngineActivity engineActivity = this$0;
                                            try {
                                                engineActivity.runOnUiThread((Runnable)engineActivity$55$1);
                                            }
                                            catch (final Exception ex) {
                                                ex.printStackTrace();
                                                this.this$0.runOnUiThread((Runnable)new EngineActivity$55$2(this));
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
    }
}
