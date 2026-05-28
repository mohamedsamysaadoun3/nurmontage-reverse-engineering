// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import com.arthenica.ffmpegkit.FFmpegSession;
import hazem.nurmontage.videoquran.model.Template;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.FFmpegKit;
import java.io.File;
import java.util.List;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.Utils.AudioUtils$Callback;

class EngineActivity$54 implements AudioUtils$Callback
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ EntityAudio val$entityAudio;
    final /* synthetic */ int val$h;
    final /* synthetic */ int val$index;
    final /* synthetic */ List val$recitersModels;
    final /* synthetic */ int val$w;
    
    EngineActivity$54(final EngineActivity this$0, final int val$w, final int val$h, final EntityAudio val$entityAudio, final int val$index, final List val$recitersModels) {
        this.this$0 = this$0;
        this.val$w = val$w;
        this.val$h = val$h;
        this.val$entityAudio = val$entityAudio;
        this.val$index = val$index;
        this.val$recitersModels = val$recitersModels;
    }
    
    public void onError(final Exception ex) {
        ex.printStackTrace();
        EngineActivity.-$$Nest$mhideProgressFragment(this.this$0);
    }
    
    public void onSuccess(final String s) {
        final String str = ":colors=#522123";
        final String str2 = "aformat=channel_layouts=mono,showwavespic=s=";
        try {
            try {
                final EngineActivity this$0 = this.this$0;
                try {
                    final Template -$$Nest$fgetmTemplate = EngineActivity.-$$Nest$fgetmTemplate(this$0);
                    try {
                        final String folder_template = -$$Nest$fgetmTemplate.getFolder_template();
                        try {
                            try {
                                final StringBuilder append = new StringBuilder().append(System.currentTimeMillis()).append("_audio_wave.png");
                                try {
                                    final File file = new File(folder_template, append.toString());
                                    final EngineActivity this$2 = this.this$0;
                                    try {
                                        final List -$$Nest$fgetid_ffmpeg = EngineActivity.-$$Nest$fgetid_ffmpeg(this$2);
                                        final String[] array = new String[8];
                                        array[0] = "-i";
                                        array[1] = s;
                                        array[2] = "-filter_complex";
                                        final StringBuilder append2 = new StringBuilder(str2).append(this.val$w).append("x");
                                        try {
                                            final StringBuilder append3 = append2.append(this.val$h).append(str);
                                            try {
                                                array[3] = append3.toString();
                                                array[4] = "-frames:v";
                                                array[5] = "1";
                                                array[6] = "-y";
                                                array[7] = file.getAbsolutePath();
                                                final EngineActivity$54$1 engineActivity$54$1 = new EngineActivity$54$1(this, file, s);
                                                final String[] array2 = array;
                                                try {
                                                    final FFmpegSession executeWithArgumentsAsync = FFmpegKit.executeWithArgumentsAsync(array2, (FFmpegSessionCompleteCallback)engineActivity$54$1);
                                                    try {
                                                        final long sessionId = executeWithArgumentsAsync.getSessionId();
                                                        try {
                                                            -$$Nest$fgetid_ffmpeg.add(sessionId);
                                                        }
                                                        catch (final Exception ex) {
                                                            ex.printStackTrace();
                                                            EngineActivity.-$$Nest$mhideProgressFragment(this.this$0);
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
            catch (final Exception ex12) {}
        }
        catch (final Exception ex13) {}
    }
}
