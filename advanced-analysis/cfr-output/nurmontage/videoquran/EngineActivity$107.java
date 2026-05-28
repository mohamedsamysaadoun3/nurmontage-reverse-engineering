/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;

class EngineActivity$107
implements Runnable {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$107(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public void run() {
        while (true) {
            Object object;
            Object object2 = EngineActivity.cfr_renamed_559(this.this$0);
            synchronized (object2) {
                EngineActivity engineActivity;
                object = this.this$0;
                object = EngineActivity.cfr_renamed_566(object);
                if (object == null) {
                    object = this.this$0;
                    engineActivity = null;
                    EngineActivity.cfr_renamed_562(object, false);
                    return;
                }
                object = this.this$0;
                object = EngineActivity.cfr_renamed_566(object);
                engineActivity = this.this$0;
                EngineActivity.cfr_renamed_560(engineActivity, null);
            }
            object2 = this.this$0;
            EngineActivity.cfr_renamed_567((EngineActivity)((Object)object2), (String)object);
        }
    }
}

