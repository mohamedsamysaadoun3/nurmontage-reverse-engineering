// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.media.MediaPlayer;
import android.net.Uri;
import java.util.List;
import android.media.MediaPlayer$OnPreparedListener;

class EngineActivity$44 implements MediaPlayer$OnPreparedListener
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ int val$index;
    final /* synthetic */ List val$recitersModels;
    final /* synthetic */ Uri val$uri;
    
    EngineActivity$44(final EngineActivity this$0, final Uri val$uri, final List val$recitersModels, final int val$index) {
        this.this$0 = this$0;
        this.val$uri = val$uri;
        this.val$recitersModels = val$recitersModels;
        this.val$index = val$index;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            EngineActivity.-$$Nest$mhideProgressFragment(this.this$0);
            return;
        }
        EngineActivity.-$$Nest$mchangeEntityAudioReciters(this.this$0, mediaPlayer.getDuration(), this.val$uri, mediaPlayer, this.val$recitersModels, this.val$index);
    }
}
