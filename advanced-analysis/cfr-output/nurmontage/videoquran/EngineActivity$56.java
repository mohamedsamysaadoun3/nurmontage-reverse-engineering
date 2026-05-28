/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment$IEditMediaCallback;

class EngineActivity$56
implements Runnable {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$56(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void run() {
        EngineActivity.cfr_renamed_18(this.this$0).invalidate();
        EngineActivity.cfr_renamed_13(this.this$0);
        EditMediaFragment$IEditMediaCallback editMediaFragment$IEditMediaCallback = EngineActivity.cfr_renamed_69(this.this$0);
        if (editMediaFragment$IEditMediaCallback != null) {
            editMediaFragment$IEditMediaCallback = EngineActivity.cfr_renamed_69(this.this$0);
            editMediaFragment$IEditMediaCallback.onDone();
        }
    }
}

