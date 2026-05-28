// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.BillingClientStateListener;

class ProVersionActivity$9 implements BillingClientStateListener
{
    final /* synthetic */ ProVersionActivity this$0;
    
    ProVersionActivity$9(final ProVersionActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onBillingServiceDisconnected() {
        ProVersionActivity.-$$Nest$mstartBillingConnection(this.this$0);
    }
    
    public void onBillingSetupFinished(final BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            ProVersionActivity.-$$Nest$mcheckUserSubscriptionStatus(this.this$0);
            ProVersionActivity.-$$Nest$mquerySubscribe(this.this$0);
            ProVersionActivity.-$$Nest$mqueryPurchases(this.this$0);
        }
    }
}
