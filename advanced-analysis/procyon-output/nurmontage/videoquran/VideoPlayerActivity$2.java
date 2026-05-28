// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player$Listener;

class VideoPlayerActivity$2 implements Player$Listener
{
    final /* synthetic */ VideoPlayerActivity this$0;
    
    VideoPlayerActivity$2(final VideoPlayerActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onPlayerError(final PlaybackException ex) {
        VideoPlayerActivity.-$$Nest$mretryWithFallbackDecoder(this.this$0);
    }
}
