// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.media.MediaPlayer;
import android.net.Uri;
import java.util.List;
import android.media.MediaPlayer$OnPreparedListener;

class EngineActivity$50 implements MediaPlayer$OnPreparedListener
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ int val$index;
    final /* synthetic */ String val$pathPCM;
    final /* synthetic */ List val$pathes;
    final /* synthetic */ Uri val$uri;
    
    EngineActivity$50(final EngineActivity this$0, final Uri val$uri, final List val$pathes, final int val$index, final String val$pathPCM) {
        this.this$0 = this$0;
        this.val$uri = val$uri;
        this.val$pathes = val$pathes;
        this.val$index = val$index;
        this.val$pathPCM = val$pathPCM;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            return;
        }
        EngineActivity.-$$Nest$mchangeEntityAudio(this.this$0, mediaPlayer.getDuration(), this.val$uri, this.val$pathes, this.val$index, this.val$pathPCM);
    }
}
