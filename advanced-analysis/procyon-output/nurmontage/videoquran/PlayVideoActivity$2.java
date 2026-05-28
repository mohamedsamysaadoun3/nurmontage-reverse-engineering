// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.media.MediaPlayer;
import android.media.MediaPlayer$OnCompletionListener;

class PlayVideoActivity$2 implements MediaPlayer$OnCompletionListener
{
    final /* synthetic */ PlayVideoActivity this$0;
    
    PlayVideoActivity$2(final PlayVideoActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onCompletion(final MediaPlayer mediaPlayer) {
        if (PlayVideoActivity.-$$Nest$fgetmediaController(this.this$0) != null && !PlayVideoActivity.-$$Nest$fgetmediaController(this.this$0).isShowing()) {
            PlayVideoActivity.-$$Nest$fgetmediaController(this.this$0).show();
        }
    }
}
