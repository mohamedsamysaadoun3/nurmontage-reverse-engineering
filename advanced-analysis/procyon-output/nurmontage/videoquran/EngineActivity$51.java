// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.model.EntityMedia;
import android.media.MediaPlayer;
import android.net.Uri;
import java.util.List;
import android.media.MediaPlayer$OnPreparedListener;

class EngineActivity$51 implements MediaPlayer$OnPreparedListener
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ int val$index;
    final /* synthetic */ String val$path;
    final /* synthetic */ String val$pathPcm;
    final /* synthetic */ String val$path_video;
    final /* synthetic */ List val$pathes;
    final /* synthetic */ Uri val$uri;
    
    EngineActivity$51(final EngineActivity this$0, final int val$index, final Uri val$uri, final List val$pathes, final String val$path, final String val$pathPcm, final String val$path_video) {
        this.this$0 = this$0;
        this.val$index = val$index;
        this.val$uri = val$uri;
        this.val$pathes = val$pathes;
        this.val$path = val$path;
        this.val$pathPcm = val$pathPcm;
        this.val$path_video = val$path_video;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            return;
        }
        if (this.val$index >= EngineActivity.-$$Nest$fgetmTemplate(this.this$0).getEntityMediaList().size()) {
            return;
        }
        EngineActivity.-$$Nest$maddEntitMediaHttp(this.this$0, (EntityMedia)EngineActivity.-$$Nest$fgetmTemplate(this.this$0).getEntityMediaList().get(this.val$index), mediaPlayer.getDuration(), this.val$uri, EngineActivity.-$$Nest$fgetmPlayer(this.this$0), this.val$pathes, this.val$index, this.val$path, this.val$pathPcm, this.val$path_video);
    }
}
