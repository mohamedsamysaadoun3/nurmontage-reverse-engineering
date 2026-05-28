// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View;
import android.view.View$OnClickListener;

class SupportBillingActivity$3 implements View$OnClickListener
{
    final /* synthetic */ SupportBillingActivity this$0;
    
    SupportBillingActivity$3(final SupportBillingActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        SupportBillingActivity.-$$Nest$mlaunchPurchaseFlow(this.this$0, SupportBillingActivity.-$$Nest$sfgetproduct_id_current());
    }
}
