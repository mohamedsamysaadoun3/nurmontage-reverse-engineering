/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$90;
import hazem.nurmontage.videoquran.views.BlurredImageView;

class EngineActivity$90$1
implements Runnable {
    final /* synthetic */ EngineActivity$90 this$1;

    EngineActivity$90$1(EngineActivity$90 engineActivity$90) {
        this.this$1 = engineActivity$90;
    }

    public void run() {
        Object object = this.this$1.this$0;
        boolean bl = EngineActivity.cfr_renamed_63(object);
        if (!bl) {
            object = EngineActivity.cfr_renamed_64(this.this$1.this$0);
            boolean bl2 = true;
            ((BlurredImageView)((Object)object)).setDrawingSquareVideo(bl2);
        }
        EngineActivity.cfr_renamed_64(this.this$1.this$0).invalidate();
    }
}

