// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;

class ProVersionActivityDone$1 extends OnBackPressedCallback
{
    final /* synthetic */ ProVersionActivityDone this$0;
    
    ProVersionActivityDone$1(final ProVersionActivityDone this$0, final boolean b) {
        this.this$0 = this$0;
        super(b);
    }
    
    public void handleOnBackPressed() {
        if (ProVersionActivityDone.-$$Nest$fgetmTemplate(this.this$0) != null) {
            ProVersionActivityDone.-$$Nest$mtoTrackAct(this.this$0);
        }
        this.this$0.finish();
    }
}
