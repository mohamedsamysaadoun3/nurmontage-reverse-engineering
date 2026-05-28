/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;

class EngineActivity$27
implements Runnable {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$27(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void run() {
        Object object = EngineActivity.cfr_renamed_2(this.this$0);
        boolean bl = object.isVideoSquare();
        if (bl) {
            object = this.this$0;
            EngineActivity.cfr_renamed_124((EngineActivity)((Object)object));
        } else {
            object = this.this$0;
            EngineActivity.cfr_renamed_125((EngineActivity)((Object)object));
        }
    }
}

