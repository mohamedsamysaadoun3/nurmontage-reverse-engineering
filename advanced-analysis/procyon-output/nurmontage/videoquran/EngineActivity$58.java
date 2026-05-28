// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.media.MediaPlayer$OnPreparedListener;
import android.content.Context;
import android.media.MediaPlayer;
import com.arthenica.ffmpegkit.ReturnCode;
import com.arthenica.ffmpegkit.FFmpegSession;
import android.net.Uri;
import java.io.File;
import hazem.nurmontage.videoquran.entity_timeline.EntityAudio;
import hazem.nurmontage.videoquran.model.EffectAudio;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;

class EngineActivity$58 implements FFmpegSessionCompleteCallback
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ EffectAudio val$effectAudioSelect;
    final /* synthetic */ EntityAudio val$entityAudio;
    final /* synthetic */ File val$file;
    final /* synthetic */ int val$finalIndex;
    final /* synthetic */ Uri val$uri;
    
    EngineActivity$58(final EngineActivity this$0, final Uri val$uri, final EntityAudio val$entityAudio, final int val$finalIndex, final EffectAudio val$effectAudioSelect, final File val$file) {
        this.this$0 = this$0;
        this.val$uri = val$uri;
        this.val$entityAudio = val$entityAudio;
        this.val$finalIndex = val$finalIndex;
        this.val$effectAudioSelect = val$effectAudioSelect;
        this.val$file = val$file;
    }
    
    public void apply(final FFmpegSession fFmpegSession) {
        if (ReturnCode.isSuccess(fFmpegSession.getReturnCode())) {
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
                                final Uri val$uri = this.val$uri;
                                try {
                                    Label_0116: {
                                        if (val$uri.getScheme() == null) {
                                            break Label_0116;
                                        }
                                        final Uri val$uri2 = this.val$uri;
                                        try {
                                            if (!val$uri2.getScheme().startsWith("http")) {
                                                break Label_0116;
                                            }
                                            final EngineActivity this$3 = this.this$0;
                                            try {
                                                final MediaPlayer -$$Nest$fgetmPlayer = EngineActivity.-$$Nest$fgetmPlayer(this$3);
                                                try {
                                                    final Uri val$uri3 = this.val$uri;
                                                    try {
                                                        -$$Nest$fgetmPlayer.setDataSource(val$uri3.toString());
                                                        Label_0144: {
                                                            break Label_0144;
                                                            final EngineActivity this$4 = this.this$0;
                                                            try {
                                                                final MediaPlayer -$$Nest$fgetmPlayer2 = EngineActivity.-$$Nest$fgetmPlayer(this$4);
                                                                try {
                                                                    final EngineActivity this$5 = this.this$0;
                                                                    try {
                                                                        -$$Nest$fgetmPlayer2.setDataSource((Context)this$5, this.val$uri);
                                                                        final EngineActivity this$6 = this.this$0;
                                                                        try {
                                                                            final MediaPlayer -$$Nest$fgetmPlayer3 = EngineActivity.-$$Nest$fgetmPlayer(this$6);
                                                                            try {
                                                                                -$$Nest$fgetmPlayer3.prepareAsync();
                                                                                final EngineActivity this$7 = this.this$0;
                                                                                try {
                                                                                    final MediaPlayer -$$Nest$fgetmPlayer4 = EngineActivity.-$$Nest$fgetmPlayer(this$7);
                                                                                    try {
                                                                                        final EngineActivity$58$1 onPreparedListener = new EngineActivity$58$1(this);
                                                                                        final MediaPlayer mediaPlayer2 = -$$Nest$fgetmPlayer4;
                                                                                        try {
                                                                                            mediaPlayer2.setOnPreparedListener((MediaPlayer$OnPreparedListener)onPreparedListener);
                                                                                            final EntityAudio val$entityAudio = this.val$entityAudio;
                                                                                            try {
                                                                                                final File val$file = this.val$file;
                                                                                                try {
                                                                                                    val$entityAudio.setPath_ffmpeg_effect(val$file.getAbsolutePath());
                                                                                                    this.val$entityAudio.setApplyEffectInPreview(true);
                                                                                                }
                                                                                                catch (final Exception ex) {
                                                                                                    ex.printStackTrace();
                                                                                                    this.this$0.runOnUiThread((Runnable)new EngineActivity$58$2(this));
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
                                                    }
                                                    catch (final Exception ex11) {}
                                                }
                                                catch (final Exception ex12) {}
                                            }
                                            catch (final Exception ex13) {}
                                        }
                                        catch (final Exception ex14) {}
                                    }
                                }
                                catch (final Exception ex15) {}
                            }
                            catch (final Exception ex16) {}
                        }
                        catch (final Exception ex17) {}
                    }
                    catch (final Exception ex18) {}
                }
                catch (final Exception ex19) {}
            }
            catch (final Exception ex20) {}
        }
    }
}
