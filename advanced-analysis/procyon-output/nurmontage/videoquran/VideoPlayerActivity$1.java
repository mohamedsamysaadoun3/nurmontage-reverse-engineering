// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;

class VideoPlayerActivity$1 extends OnBackPressedCallback
{
    final /* synthetic */ VideoPlayerActivity this$0;
    
    VideoPlayerActivity$1(final VideoPlayerActivity this$0, final boolean b) {
        this.this$0 = this$0;
        super(b);
    }
    
    public void handleOnBackPressed() {
        VideoPlayerActivity.-$$Nest$mreleasePlayer(this.this$0);
        VideoPlayerActivity.-$$Nest$mreturnAct(this.this$0);
    }
}
