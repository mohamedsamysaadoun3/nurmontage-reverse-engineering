// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.media.MediaPlayer$OnPreparedListener;
import android.content.Context;
import android.media.MediaPlayer;
import com.arthenica.ffmpegkit.FFmpegSession;
import android.net.Uri;
import java.io.File;
import hazem.nurmontage.videoquran.model.EntityMedia;
import hazem.nurmontage.videoquran.model.EffectAudio;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;

class EngineActivity$39 implements FFmpegSessionCompleteCallback
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ EffectAudio val$effectAudio;
    final /* synthetic */ EntityMedia val$entityMedia;
    final /* synthetic */ File val$file;
    final /* synthetic */ int val$index;
    final /* synthetic */ String val$path;
    final /* synthetic */ String val$path_video;
    final /* synthetic */ Uri val$uri;
    
    EngineActivity$39(final EngineActivity this$0, final File val$file, final EntityMedia val$entityMedia, final EffectAudio val$effectAudio, final Uri val$uri, final int val$index, final String val$path, final String val$path_video) {
        this.this$0 = this$0;
        this.val$file = val$file;
        this.val$entityMedia = val$entityMedia;
        this.val$effectAudio = val$effectAudio;
        this.val$uri = val$uri;
        this.val$index = val$index;
        this.val$path = val$path;
        this.val$path_video = val$path_video;
    }
    
    public void apply(final FFmpegSession fFmpegSession) {
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                try {
                    final MediaPlayer mediaPlayer = new MediaPlayer();
                    final EngineActivity engineActivity = this$0;
                    try {
                        EngineActivity.-$$Nest$fputmPlayer(engineActivity, mediaPlayer);
                        final EngineActivity this$2 = this.this$0;
                        try {
                            EngineActivity.-$$Nest$fgetmPlayer(this$2).setAudioStreamType(3);
                            final File val$file = this.val$file;
                            try {
                                final Uri fromFile = Uri.fromFile(val$file);
                                try {
                                    Label_0097: {
                                        if (fromFile.getScheme() == null || !fromFile.getScheme().startsWith("http")) {
                                            break Label_0097;
                                        }
                                        final EngineActivity this$3 = this.this$0;
                                        try {
                                            final MediaPlayer -$$Nest$fgetmPlayer = EngineActivity.-$$Nest$fgetmPlayer(this$3);
                                            try {
                                                -$$Nest$fgetmPlayer.setDataSource(fromFile.toString());
                                                Label_0120: {
                                                    break Label_0120;
                                                    final EngineActivity this$4 = this.this$0;
                                                    try {
                                                        final MediaPlayer -$$Nest$fgetmPlayer2 = EngineActivity.-$$Nest$fgetmPlayer(this$4);
                                                        try {
                                                            -$$Nest$fgetmPlayer2.setDataSource((Context)this.this$0, fromFile);
                                                            final EngineActivity this$5 = this.this$0;
                                                            try {
                                                                final MediaPlayer -$$Nest$fgetmPlayer3 = EngineActivity.-$$Nest$fgetmPlayer(this$5);
                                                                try {
                                                                    -$$Nest$fgetmPlayer3.prepareAsync();
                                                                    final EngineActivity this$6 = this.this$0;
                                                                    try {
                                                                        final MediaPlayer -$$Nest$fgetmPlayer4 = EngineActivity.-$$Nest$fgetmPlayer(this$6);
                                                                        try {
                                                                            final EngineActivity$39$1 onPreparedListener = new EngineActivity$39$1(this);
                                                                            final MediaPlayer mediaPlayer2 = -$$Nest$fgetmPlayer4;
                                                                            try {
                                                                                mediaPlayer2.setOnPreparedListener((MediaPlayer$OnPreparedListener)onPreparedListener);
                                                                            }
                                                                            catch (final Exception ex) {
                                                                                ex.printStackTrace();
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
                                            }
                                            catch (final Exception ex8) {}
                                        }
                                        catch (final Exception ex9) {}
                                    }
                                }
                                catch (final Exception ex10) {}
                            }
                            catch (final Exception ex11) {}
                        }
                        catch (final Exception ex12) {}
                    }
                    catch (final Exception ex13) {}
                }
                catch (final Exception ex14) {}
            }
            catch (final Exception ex15) {}
        }
        catch (final Exception ex16) {}
    }
}
