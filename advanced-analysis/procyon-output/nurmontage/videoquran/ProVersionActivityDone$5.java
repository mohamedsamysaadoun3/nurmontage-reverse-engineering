// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.BillingClientStateListener;

class ProVersionActivityDone$5 implements BillingClientStateListener
{
    final /* synthetic */ ProVersionActivityDone this$0;
    
    ProVersionActivityDone$5(final ProVersionActivityDone this$0) {
        this.this$0 = this$0;
    }
    
    public void onBillingServiceDisconnected() {
        ProVersionActivityDone.-$$Nest$mstartBillingConnection(this.this$0);
    }
    
    public void onBillingSetupFinished(final BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            ProVersionActivityDone.-$$Nest$mcheckUserSubscriptionStatus(this.this$0);
            ProVersionActivityDone.-$$Nest$mquerySubscribe(this.this$0);
            ProVersionActivityDone.-$$Nest$mqueryPurchases(this.this$0);
        }
    }
}
