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

public final class ProVersionActivity$$ExternalSyntheticLambda5
implements PurchasesResponseListener {
    public final /* synthetic */ ProVersionActivity f$0;

    public /* synthetic */ ProVersionActivity$$ExternalSyntheticLambda5(ProVersionActivity proVersionActivity) {
        this.f$0 = proVersionActivity;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f$0.cfr_renamed_109(billingResult, list);
    }
}

