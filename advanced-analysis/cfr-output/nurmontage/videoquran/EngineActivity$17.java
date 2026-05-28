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

class EngineActivity$17
implements View.OnClickListener {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$17(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void onClick(View view) {
        view = EngineActivity.cfr_renamed_10(this.this$0);
        if (view == null) {
            return;
        }
        view = EngineActivity.cfr_renamed_10(this.this$0);
        int n = view.getVisibility();
        if (n != 0) {
            view = EngineActivity.cfr_renamed_10(this.this$0);
            boolean bl = false;
            view.setVisibility(0);
        } else {
            view = EngineActivity.cfr_renamed_10(this.this$0);
            int n2 = 8;
            view.setVisibility(n2);
        }
    }
}

