/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;

class EngineActivity$47
implements Runnable {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$47(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void run() {
        EngineActivity.cfr_renamed_18(this.this$0).calculMaxTime();
        EngineActivity engineActivity = this.this$0;
        int n = EngineActivity.cfr_renamed_18(engineActivity).getMaxTime();
        int n2 = EngineActivity.cfr_renamed_18(this.this$0).getCurrent_cursur_position();
        engineActivity.updateViewTime(n, n2);
        EngineActivity.cfr_renamed_18(this.this$0).translateToEnd();
        EngineActivity.cfr_renamed_1(this.this$0);
        EngineActivity.cfr_renamed_53(this.this$0);
        EngineActivity.cfr_renamed_54(this.this$0);
        EngineActivity.cfr_renamed_18(this.this$0).invalidate();
        EngineActivity.cfr_renamed_13(this.this$0);
        EngineActivity.cfr_renamed_75(this.this$0);
    }
}

