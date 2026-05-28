// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.media.MediaPlayer;
import android.media.MediaPlayer$OnPreparedListener;

class PlayVideoActivity$3 implements MediaPlayer$OnPreparedListener
{
    final /* synthetic */ PlayVideoActivity this$0;
    
    PlayVideoActivity$3(final PlayVideoActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        PlayVideoActivity.-$$Nest$madjustVideoViewSize(this.this$0, mediaPlayer);
    }
}
