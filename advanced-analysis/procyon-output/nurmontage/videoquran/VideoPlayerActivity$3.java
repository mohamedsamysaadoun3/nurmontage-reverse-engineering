// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View;
import android.view.View$OnClickListener;

class VideoPlayerActivity$3 implements View$OnClickListener
{
    final /* synthetic */ VideoPlayerActivity this$0;
    
    VideoPlayerActivity$3(final VideoPlayerActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (VideoPlayerActivity.-$$Nest$fgetplayer(this.this$0) != null) {
            if (VideoPlayerActivity.-$$Nest$fgetplayer(this.this$0).isPlaying()) {
                VideoPlayerActivity.-$$Nest$fgetplayer(this.this$0).pause();
                VideoPlayerActivity.-$$Nest$fgetbtnPlay(this.this$0).setImageResource(R$drawable.play_arrow_24px);
            }
            else {
                VideoPlayerActivity.-$$Nest$fgetplayer(this.this$0).play();
                VideoPlayerActivity.-$$Nest$fgetbtnPlay(this.this$0).setImageResource(R$drawable.pause_24px);
            }
        }
    }
}
