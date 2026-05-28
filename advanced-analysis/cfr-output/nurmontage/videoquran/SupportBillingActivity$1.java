/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.activity.OnBackPressedCallback
 */
package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;
import hazem.nurmontage.videoquran.SupportBillingActivity;

class SupportBillingActivity$1
extends OnBackPressedCallback {
    final /* synthetic */ SupportBillingActivity this$0;

    SupportBillingActivity$1(SupportBillingActivity supportBillingActivity, boolean bl) {
        this.this$0 = supportBillingActivity;
        super(bl);
    }

    public void handleOnBackPressed() {
        this.this$0.finish();
    }
}

