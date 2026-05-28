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
import hazem.nurmontage.videoquran.ProVersionActivityLast;
import java.util.List;

class ProVersionActivityLast$16
implements PurchasesResponseListener {
    final /* synthetic */ ProVersionActivityLast this$0;

    ProVersionActivityLast$16(ProVersionActivityLast proVersionActivityLast) {
        this.this$0 = proVersionActivityLast;
    }

    public void onQueryPurchasesResponse(BillingResult object, List list) {
        int n = object.getResponseCode();
        if (n == 0) {
            n = list.isEmpty() ? 1 : 0;
            if (n == 0) {
                ProVersionActivityLast.cfr_renamed_8(this.this$0, list);
                return;
            }
            object = this.this$0;
            ProVersionActivityLast.cfr_renamed_9((ProVersionActivityLast)((Object)object));
        } else {
            object = this.this$0;
            ProVersionActivityLast.cfr_renamed_9((ProVersionActivityLast)((Object)object));
        }
    }
}

