/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.SeettingActivity;

class SeettingActivity$2
implements View.OnClickListener {
    final /* synthetic */ SeettingActivity this$0;

    SeettingActivity$2(SeettingActivity seettingActivity) {
        this.this$0 = seettingActivity;
    }

    public void onClick(View object) {
        object = this.this$0;
        int n = R$id.progress;
        object.findViewById(n).setVisibility(0);
        SeettingActivity.cfr_renamed_406(this.this$0);
    }
}

