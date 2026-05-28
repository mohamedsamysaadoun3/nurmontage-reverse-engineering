/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.SupportBillingActivity;

class SupportBillingActivity$2
implements View.OnClickListener {
    final /* synthetic */ SupportBillingActivity this$0;

    SupportBillingActivity$2(SupportBillingActivity supportBillingActivity) {
        this.this$0 = supportBillingActivity;
    }

    public void onClick(View view) {
        SupportBillingActivity.cfr_renamed_91(this.this$0).handleOnBackPressed();
    }
}

