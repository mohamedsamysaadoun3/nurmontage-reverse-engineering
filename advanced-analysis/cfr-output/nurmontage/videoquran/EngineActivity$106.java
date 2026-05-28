/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.Utils.SmoothVideoAnimator$FrameUpdateListener;

class EngineActivity$106
implements SmoothVideoAnimator$FrameUpdateListener {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$106(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void onAnimationEnd() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public void onFrameUpdate(String object) {
        Object object2 = EngineActivity.cfr_renamed_559(this.this$0);
        synchronized (object2) {
            Object object3 = this.this$0;
            EngineActivity.cfr_renamed_560(object3, (String)object);
            object = this.this$0;
            boolean bl = EngineActivity.cfr_renamed_561((EngineActivity)((Object)object));
            if (!bl) {
                object = this.this$0;
                boolean bl2 = true;
                EngineActivity.cfr_renamed_562((EngineActivity)((Object)object), bl2);
                object = this.this$0;
                object = EngineActivity.cfr_renamed_413((EngineActivity)((Object)object));
                object3 = this.this$0;
                object3 = EngineActivity.cfr_renamed_563(object3);
                object.execute((Runnable)object3);
            }
            return;
        }
    }
}

