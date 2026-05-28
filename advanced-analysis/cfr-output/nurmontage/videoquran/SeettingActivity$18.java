/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.PurchasesResponseListener
 */
package hazem.nurmontage.videoquran;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import hazem.nurmontage.videoquran.SeettingActivity;
import java.util.List;

class SeettingActivity$18
implements PurchasesResponseListener {
    final /* synthetic */ SeettingActivity this$0;

    SeettingActivity$18(SeettingActivity seettingActivity) {
        this.this$0 = seettingActivity;
    }

    public void onQueryPurchasesResponse(BillingResult object, List list) {
        int n = object.getResponseCode();
        if (n == 0) {
            n = list.isEmpty() ? 1 : 0;
            if (n == 0) {
                SeettingActivity.cfr_renamed_8(this.this$0, list);
                return;
            }
            object = this.this$0;
            SeettingActivity.cfr_renamed_9((SeettingActivity)((Object)object));
        } else {
            object = this.this$0;
            SeettingActivity.cfr_renamed_9((SeettingActivity)((Object)object));
        }
    }
}

