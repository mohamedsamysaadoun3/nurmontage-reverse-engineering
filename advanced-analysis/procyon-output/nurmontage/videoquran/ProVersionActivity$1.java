// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;

class ProVersionActivity$1 extends OnBackPressedCallback
{
    final /* synthetic */ ProVersionActivity this$0;
    
    ProVersionActivity$1(final ProVersionActivity this$0, final boolean b) {
        this.this$0 = this$0;
        super(b);
    }
    
    public void handleOnBackPressed() {
        if (ProVersionActivity.-$$Nest$fgetmTemplate(this.this$0) != null) {
            ProVersionActivity.-$$Nest$mtoTrackAct(this.this$0);
        }
        this.this$0.finish();
    }
}
