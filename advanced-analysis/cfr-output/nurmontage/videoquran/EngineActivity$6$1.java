/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$6;

class EngineActivity$6$1
implements Runnable {
    final /* synthetic */ EngineActivity$6 this$1;

    EngineActivity$6$1(EngineActivity$6 engineActivity$6) {
        this.this$1 = engineActivity$6;
    }

    public void run() {
        EngineActivity.cfr_renamed_18(this.this$1.this$0).invalidate();
        EngineActivity.cfr_renamed_74(this.this$1.this$0);
        Object object = EngineActivity.cfr_renamed_2(this.this$1.this$0).getQuranEntityList();
        boolean bl = object.isEmpty();
        if (bl) {
            object = EngineActivity.cfr_renamed_64(this.this$1.this$0);
            object.invalidate();
        }
        EngineActivity.cfr_renamed_392(this.this$1.this$0);
        EngineActivity.cfr_renamed_13(this.this$1.this$0);
    }
}

