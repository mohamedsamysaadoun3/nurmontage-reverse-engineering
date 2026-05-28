// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.media.MediaPlayer;
import android.net.Uri;
import android.media.MediaPlayer$OnPreparedListener;

class EngineActivity$49 implements MediaPlayer$OnPreparedListener
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ Uri val$uri;
    
    EngineActivity$49(final EngineActivity this$0, final Uri val$uri) {
        this.this$0 = this$0;
        this.val$uri = val$uri;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            return;
        }
        EngineActivity.-$$Nest$mchangeEntityAudio(this.this$0, mediaPlayer.getDuration(), this.val$uri);
    }
}
