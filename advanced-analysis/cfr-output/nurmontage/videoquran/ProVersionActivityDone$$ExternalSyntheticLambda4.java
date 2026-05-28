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

public final class ProVersionActivityDone$$ExternalSyntheticLambda4
implements PurchasesResponseListener {
    public final /* synthetic */ ProVersionActivityDone f$0;

    public /* synthetic */ ProVersionActivityDone$$ExternalSyntheticLambda4(ProVersionActivityDone proVersionActivityDone) {
        this.f$0 = proVersionActivityDone;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f$0.cfr_renamed_373(billingResult, list);
    }
}

