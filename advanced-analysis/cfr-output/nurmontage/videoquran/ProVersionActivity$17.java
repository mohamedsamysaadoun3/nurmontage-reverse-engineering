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
import hazem.nurmontage.videoquran.ProVersionActivity;
import java.util.List;

class ProVersionActivity$17
implements PurchasesResponseListener {
    final /* synthetic */ ProVersionActivity this$0;

    ProVersionActivity$17(ProVersionActivity proVersionActivity) {
        this.this$0 = proVersionActivity;
    }

    public void onQueryPurchasesResponse(BillingResult object, List list) {
        int n = object.getResponseCode();
        if (n == 0) {
            n = list.isEmpty() ? 1 : 0;
            if (n == 0) {
                ProVersionActivity.cfr_renamed_8(this.this$0, list);
                return;
            }
            object = this.this$0;
            ProVersionActivity.cfr_renamed_9((ProVersionActivity)((Object)object));
        } else {
            object = this.this$0;
            ProVersionActivity.cfr_renamed_9((ProVersionActivity)((Object)object));
        }
    }
}

