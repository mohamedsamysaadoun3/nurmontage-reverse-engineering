// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.BillingClientStateListener;

class SeettingActivity$17 implements BillingClientStateListener
{
    final /* synthetic */ SeettingActivity this$0;
    
    SeettingActivity$17(final SeettingActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onBillingServiceDisconnected() {
        SeettingActivity.-$$Nest$mstartBillingConnection(this.this$0);
    }
    
    public void onBillingSetupFinished(final BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            SeettingActivity.-$$Nest$mcheckUserSubscriptionStatus(this.this$0);
        }
    }
}
