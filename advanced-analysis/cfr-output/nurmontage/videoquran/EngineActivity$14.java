/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.R$string;

class EngineActivity$14
implements Runnable {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$14(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void run() {
        EngineActivity engineActivity = this.this$0;
        Object object = EngineActivity.cfr_renamed_90(engineActivity);
        int n = R$string.quran;
        object = object.getString(n);
        EngineActivity.cfr_renamed_274(engineActivity, (String)object);
    }
}

