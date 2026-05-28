// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.util.List;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;

class ProVersionActivityDone$12 implements PurchasesResponseListener
{
    final /* synthetic */ ProVersionActivityDone this$0;
    
    ProVersionActivityDone$12(final ProVersionActivityDone this$0) {
        this.this$0 = this$0;
    }
    
    public void onQueryPurchasesResponse(final BillingResult billingResult, final List list) {
        if (billingResult.getResponseCode() == 0) {
            if (!list.isEmpty()) {
                ProVersionActivityDone.-$$Nest$mhandleSubscriptionPurchases(this.this$0, list);
                return;
            }
            ProVersionActivityDone.-$$Nest$mcheckInAppPurchases(this.this$0);
        }
        else {
            ProVersionActivityDone.-$$Nest$mcheckInAppPurchases(this.this$0);
        }
    }
}
