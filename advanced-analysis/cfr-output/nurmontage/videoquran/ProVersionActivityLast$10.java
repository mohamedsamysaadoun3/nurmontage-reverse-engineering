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
import hazem.nurmontage.videoquran.ProVersionActivityLast;

class ProVersionActivityLast$10
implements BillingClientStateListener {
    final /* synthetic */ ProVersionActivityLast this$0;

    ProVersionActivityLast$10(ProVersionActivityLast proVersionActivityLast) {
        this.this$0 = proVersionActivityLast;
    }

    public void onBillingServiceDisconnected() {
        ProVersionActivityLast.cfr_renamed_62(this.this$0);
    }

    public void onBillingSetupFinished(BillingResult object) {
        int n = object.getResponseCode();
        if (n == 0) {
            ProVersionActivityLast.cfr_renamed_61(this.this$0);
            ProVersionActivityLast.cfr_renamed_150(this.this$0);
            ProVersionActivityLast.cfr_renamed_104(this.this$0);
            object = this.this$0;
            ProVersionActivityLast.cfr_renamed_103((ProVersionActivityLast)((Object)object));
        }
    }
}

