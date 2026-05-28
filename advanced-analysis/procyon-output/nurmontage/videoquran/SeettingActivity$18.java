// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import java.util.List;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;

class SeettingActivity$18 implements PurchasesResponseListener
{
    final /* synthetic */ SeettingActivity this$0;
    
    SeettingActivity$18(final SeettingActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onQueryPurchasesResponse(final BillingResult billingResult, final List list) {
        if (billingResult.getResponseCode() == 0) {
            if (!list.isEmpty()) {
                SeettingActivity.-$$Nest$mhandleSubscriptionPurchases(this.this$0, list);
                return;
            }
            SeettingActivity.-$$Nest$mcheckInAppPurchases(this.this$0);
        }
        else {
            SeettingActivity.-$$Nest$mcheckInAppPurchases(this.this$0);
        }
    }
}
