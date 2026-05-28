// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;

class ProVersionActivityLast$1 extends OnBackPressedCallback
{
    final /* synthetic */ ProVersionActivityLast this$0;
    
    ProVersionActivityLast$1(final ProVersionActivityLast this$0, final boolean b) {
        this.this$0 = this$0;
        super(b);
    }
    
    public void handleOnBackPressed() {
        if (ProVersionActivityLast.-$$Nest$fgetmTemplate(this.this$0) != null) {
            ProVersionActivityLast.-$$Nest$mtoTrackAct(this.this$0);
        }
        this.this$0.finish();
    }
}
