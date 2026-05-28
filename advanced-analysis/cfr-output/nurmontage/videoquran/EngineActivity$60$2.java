/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$60;

class EngineActivity$60$2
implements Runnable {
    final /* synthetic */ EngineActivity$60 this$1;
    final /* synthetic */ boolean val$b;

    EngineActivity$60$2(EngineActivity$60 engineActivity$60, boolean bl) {
        this.this$1 = engineActivity$60;
        this.val$b = bl;
    }

    public void run() {
        boolean bl = this.val$b;
        if (bl) {
            EngineActivity engineActivity = this.this$1.this$0;
            EngineActivity.cfr_renamed_60(engineActivity);
        } else {
            EngineActivity engineActivity = this.this$1.this$0;
            EngineActivity.cfr_renamed_13(engineActivity);
        }
    }
}

