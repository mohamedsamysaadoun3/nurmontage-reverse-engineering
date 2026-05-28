/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$69;
import hazem.nurmontage.videoquran.R$string;

class EngineActivity$69$1
implements Runnable {
    final /* synthetic */ EngineActivity$69 this$1;

    EngineActivity$69$1(EngineActivity$69 engineActivity$69) {
        this.this$1 = engineActivity$69;
    }

    public void run() {
        EngineActivity engineActivity = this.this$1.this$0;
        Object object = EngineActivity.cfr_renamed_90(this.this$1.this$0);
        int n = R$string.quran;
        object = object.getString(n);
        EngineActivity.cfr_renamed_274(engineActivity, (String)object);
    }
}

