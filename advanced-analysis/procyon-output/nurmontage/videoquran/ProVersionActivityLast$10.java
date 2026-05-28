// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.BillingClientStateListener;

class ProVersionActivityLast$10 implements BillingClientStateListener
{
    final /* synthetic */ ProVersionActivityLast this$0;
    
    ProVersionActivityLast$10(final ProVersionActivityLast this$0) {
        this.this$0 = this$0;
    }
    
    public void onBillingServiceDisconnected() {
        ProVersionActivityLast.-$$Nest$mstartBillingConnection(this.this$0);
    }
    
    public void onBillingSetupFinished(final BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            ProVersionActivityLast.-$$Nest$mcheckUserSubscriptionStatus(this.this$0);
            ProVersionActivityLast.-$$Nest$mqueryProducts(this.this$0);
            ProVersionActivityLast.-$$Nest$mquerySubscribe(this.this$0);
            ProVersionActivityLast.-$$Nest$mqueryPurchases(this.this$0);
        }
    }
}
