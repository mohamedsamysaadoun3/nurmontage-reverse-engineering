// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.util.List;
import android.media.MediaPlayer;
import android.net.Uri;
import hazem.nurmontage.videoquran.model.EntityMedia;
import android.media.MediaPlayer$OnPreparedListener;

class EngineActivity$40 implements MediaPlayer$OnPreparedListener
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ EntityMedia val$entityMedia;
    final /* synthetic */ int val$index;
    final /* synthetic */ String val$path;
    final /* synthetic */ String val$path_video;
    final /* synthetic */ Uri val$uri;
    
    EngineActivity$40(final EngineActivity this$0, final EntityMedia val$entityMedia, final Uri val$uri, final int val$index, final String val$path, final String val$path_video) {
        this.this$0 = this$0;
        this.val$entityMedia = val$entityMedia;
        this.val$uri = val$uri;
        this.val$index = val$index;
        this.val$path = val$path;
        this.val$path_video = val$path_video;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            return;
        }
        try {
            final EngineActivity this$0 = this.this$0;
            try {
                final EntityMedia val$entityMedia = this.val$entityMedia;
                try {
                    final int duration = mediaPlayer.getDuration();
                    try {
                        final Uri val$uri = this.val$uri;
                        try {
                            final EntityMedia val$entityMedia2 = this.val$entityMedia;
                            try {
                                final List paths_https = val$entityMedia2.getPaths_https();
                                try {
                                    final int val$index = this.val$index;
                                    try {
                                        final String val$path = this.val$path;
                                        try {
                                            EngineActivity.-$$Nest$maddEntitMediaHttp(this$0, val$entityMedia, duration, val$uri, mediaPlayer, paths_https, val$index, val$path, this.val$path_video);
                                        }
                                        catch (final Exception ex) {
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
}
