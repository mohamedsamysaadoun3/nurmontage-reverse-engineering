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
import hazem.nurmontage.videoquran.ProVersionActivityDone;
import java.util.List;

class ProVersionActivityDone$12
implements PurchasesResponseListener {
    final /* synthetic */ ProVersionActivityDone this$0;

    ProVersionActivityDone$12(ProVersionActivityDone proVersionActivityDone) {
        this.this$0 = proVersionActivityDone;
    }

    public void onQueryPurchasesResponse(BillingResult object, List list) {
        int n = object.getResponseCode();
        if (n == 0) {
            n = list.isEmpty() ? 1 : 0;
            if (n == 0) {
                ProVersionActivityDone.cfr_renamed_8(this.this$0, list);
                return;
            }
            object = this.this$0;
            ProVersionActivityDone.cfr_renamed_9((ProVersionActivityDone)((Object)object));
        } else {
            object = this.this$0;
            ProVersionActivityDone.cfr_renamed_9((ProVersionActivityDone)((Object)object));
        }
    }
}

