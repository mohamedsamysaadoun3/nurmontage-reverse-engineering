// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;

class PlayVideoActivity$1 extends OnBackPressedCallback
{
    final /* synthetic */ PlayVideoActivity this$0;
    
    PlayVideoActivity$1(final PlayVideoActivity this$0, final boolean b) {
        this.this$0 = this$0;
        super(b);
    }
    
    public void handleOnBackPressed() {
        PlayVideoActivity.-$$Nest$mpause(this.this$0);
        this.this$0.finish();
    }
}
