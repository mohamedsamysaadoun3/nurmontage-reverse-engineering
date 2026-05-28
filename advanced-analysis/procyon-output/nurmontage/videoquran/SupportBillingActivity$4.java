// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.BillingClientStateListener;

class SupportBillingActivity$4 implements BillingClientStateListener
{
    final /* synthetic */ SupportBillingActivity this$0;
    
    SupportBillingActivity$4(final SupportBillingActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onBillingServiceDisconnected() {
        SupportBillingActivity.-$$Nest$mstartBillingConnection(this.this$0);
    }
    
    public void onBillingSetupFinished(final BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            SupportBillingActivity.-$$Nest$mqueryProducts(this.this$0);
            SupportBillingActivity.-$$Nest$mqueryPurchases(this.this$0);
        }
    }
}
