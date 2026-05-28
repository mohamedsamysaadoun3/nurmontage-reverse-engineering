/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;

class EngineActivity$13
implements Runnable {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$13(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void run() {
        EngineActivity.cfr_renamed_18(this.this$0).invalidate();
        EngineActivity.cfr_renamed_74(this.this$0);
        Object object = EngineActivity.cfr_renamed_2(this.this$0).getQuranEntityList();
        boolean bl = object.isEmpty();
        if (bl) {
            object = EngineActivity.cfr_renamed_64(this.this$0);
            object.invalidate();
        }
        EngineActivity.cfr_renamed_13(this.this$0);
    }
}

