/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingClientStateListener
 *  com.android.billingclient.api.BillingResult
 */
package hazem.nurmontage.videoquran;

import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import hazem.nurmontage.videoquran.SeettingActivity;

class SeettingActivity$17
implements BillingClientStateListener {
    final /* synthetic */ SeettingActivity this$0;

    SeettingActivity$17(SeettingActivity seettingActivity) {
        this.this$0 = seettingActivity;
    }

    public void onBillingServiceDisconnected() {
        SeettingActivity.cfr_renamed_62(this.this$0);
    }

    public void onBillingSetupFinished(BillingResult object) {
        int n = object.getResponseCode();
        if (n == 0) {
            object = this.this$0;
            SeettingActivity.cfr_renamed_61((SeettingActivity)((Object)object));
        }
    }
}

