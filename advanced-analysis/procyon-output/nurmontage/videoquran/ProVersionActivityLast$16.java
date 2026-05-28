// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.util.List;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;

class ProVersionActivityLast$16 implements PurchasesResponseListener
{
    final /* synthetic */ ProVersionActivityLast this$0;
    
    ProVersionActivityLast$16(final ProVersionActivityLast this$0) {
        this.this$0 = this$0;
    }
    
    public void onQueryPurchasesResponse(final BillingResult billingResult, final List list) {
        if (billingResult.getResponseCode() == 0) {
            if (!list.isEmpty()) {
                ProVersionActivityLast.-$$Nest$mhandleSubscriptionPurchases(this.this$0, list);
                return;
            }
            ProVersionActivityLast.-$$Nest$mcheckInAppPurchases(this.this$0);
        }
        else {
            ProVersionActivityLast.-$$Nest$mcheckInAppPurchases(this.this$0);
        }
    }
}
