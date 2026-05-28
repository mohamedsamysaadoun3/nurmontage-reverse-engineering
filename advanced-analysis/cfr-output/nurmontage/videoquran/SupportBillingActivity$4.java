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
import hazem.nurmontage.videoquran.SupportBillingActivity;

class SupportBillingActivity$4
implements BillingClientStateListener {
    final /* synthetic */ SupportBillingActivity this$0;

    SupportBillingActivity$4(SupportBillingActivity supportBillingActivity) {
        this.this$0 = supportBillingActivity;
    }

    public void onBillingServiceDisconnected() {
        SupportBillingActivity.cfr_renamed_62(this.this$0);
    }

    public void onBillingSetupFinished(BillingResult object) {
        int n = object.getResponseCode();
        if (n == 0) {
            SupportBillingActivity.cfr_renamed_150(this.this$0);
            object = this.this$0;
            SupportBillingActivity.cfr_renamed_103((SupportBillingActivity)((Object)object));
        }
    }
}

