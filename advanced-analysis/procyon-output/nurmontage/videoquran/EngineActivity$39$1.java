// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.util.List;
import android.net.Uri;
import hazem.nurmontage.videoquran.model.EffectAudio;
import hazem.nurmontage.videoquran.model.EntityMedia;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnPreparedListener;

class EngineActivity$39$1 implements MediaPlayer$OnPreparedListener
{
    final /* synthetic */ EngineActivity$39 this$1;
    
    EngineActivity$39$1(final EngineActivity$39 this$1) {
        this.this$1 = this$1;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            return;
        }
        try {
            final EngineActivity$39 this$1 = this.this$1;
            try {
                final EngineActivity this$2 = this$1.this$0;
                try {
                    final EngineActivity$39 this$3 = this.this$1;
                    try {
                        final EntityMedia val$entityMedia = this$3.val$entityMedia;
                        try {
                            final EngineActivity$39 this$4 = this.this$1;
                            try {
                                final EffectAudio val$effectAudio = this$4.val$effectAudio;
                                try {
                                    final int duration = val$effectAudio.getDuration();
                                    try {
                                        final EngineActivity$39 this$5 = this.this$1;
                                        try {
                                            final Uri val$uri = this$5.val$uri;
                                            try {
                                                final EngineActivity$39 this$6 = this.this$1;
                                                try {
                                                    final EntityMedia val$entityMedia2 = this$6.val$entityMedia;
                                                    try {
                                                        final List paths_https = val$entityMedia2.getPaths_https();
                                                        try {
                                                            final EngineActivity$39 this$7 = this.this$1;
                                                            try {
                                                                final int val$index = this$7.val$index;
                                                                try {
                                                                    final EngineActivity$39 this$8 = this.this$1;
                                                                    try {
                                                                        final String val$path = this$8.val$path;
                                                                        try {
                                                                            final EngineActivity$39 this$9 = this.this$1;
                                                                            try {
                                                                                EngineActivity.-$$Nest$maddEntitMediaHttp(this$2, val$entityMedia, duration, val$uri, mediaPlayer, paths_https, val$index, val$path, this$9.val$path_video);
                                                                            }
                                                                            catch (final Exception ex) {
                                                                                EngineActivity.-$$Nest$mhideProgressFragment(this.this$1.this$0);
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
                        catch (final Exception ex14) {}
                    }
                    catch (final Exception ex15) {}
                }
                catch (final Exception ex16) {}
            }
            catch (final Exception ex17) {}
        }
        catch (final Exception ex18) {}
    }
}
