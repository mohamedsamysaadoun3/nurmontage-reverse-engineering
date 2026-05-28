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
import hazem.nurmontage.videoquran.EngineActivity$23$1;

class EngineActivity$23
implements View.OnClickListener {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$23(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void onClick(View object) {
        EngineActivity.cfr_renamed_68(this.this$0);
        EngineActivity.cfr_renamed_72(this.this$0);
        EngineActivity$23$1 engineActivity$23$1 = new EngineActivity$23$1(this);
        object = new Thread(engineActivity$23$1);
        ((Thread)object).start();
    }
}

