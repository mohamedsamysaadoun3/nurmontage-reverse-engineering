/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.R$drawable;

class EngineActivity$33
implements View.OnClickListener {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$33(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void onClick(View object) {
        EngineActivity.cfr_renamed_68(this.this$0);
        object = this.this$0;
        int n = R$drawable.iv_layout_ipod;
        ((EngineActivity)((Object)object)).dialogPremium(n);
    }
}

