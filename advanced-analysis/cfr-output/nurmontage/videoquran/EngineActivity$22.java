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

class EngineActivity$22
implements View.OnClickListener {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$22(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void onClick(View object) {
        object = EngineActivity.cfr_renamed_18(this.this$0);
        int n = object.getCurrent_cursur_position();
        if (n == 0) {
            return;
        }
        EngineActivity.cfr_renamed_64(this.this$0).setProgress(0.0f);
        EngineActivity.cfr_renamed_68(this.this$0);
        EngineActivity.cfr_renamed_79(this.this$0, 0);
        EngineActivity.cfr_renamed_18(this.this$0).translateToStart();
        object = this.this$0;
        int n2 = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object)).getMaxTime();
        int n3 = EngineActivity.cfr_renamed_18(this.this$0).getCurrent_cursur_position();
        object.updateViewTime(n2, n3);
        EngineActivity.cfr_renamed_54(this.this$0);
        EngineActivity.cfr_renamed_53(this.this$0);
    }
}

