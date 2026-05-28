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

public final class ProVersionActivityLast$$ExternalSyntheticLambda1
implements PurchasesResponseListener {
    public final /* synthetic */ ProVersionActivityLast f$0;

    public /* synthetic */ ProVersionActivityLast$$ExternalSyntheticLambda1(ProVersionActivityLast proVersionActivityLast) {
        this.f$0 = proVersionActivityLast;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f$0.cfr_renamed_395(billingResult, list);
    }
}

