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
import hazem.nurmontage.videoquran.SupportBillingActivity;
import java.util.List;

public final class SupportBillingActivity$$ExternalSyntheticLambda1
implements PurchasesResponseListener {
    public final /* synthetic */ SupportBillingActivity f$0;

    public /* synthetic */ SupportBillingActivity$$ExternalSyntheticLambda1(SupportBillingActivity supportBillingActivity) {
        this.f$0 = supportBillingActivity;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f$0.cfr_renamed_548(billingResult, list);
    }
}

