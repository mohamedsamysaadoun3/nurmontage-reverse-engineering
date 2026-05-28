/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View$OnTouchListener
 */
package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$78$1;
import hazem.nurmontage.videoquran.views.TrackEntityView;

class EngineActivity$78$1$1
implements Runnable {
    final /* synthetic */ EngineActivity$78$1 this$2;

    EngineActivity$78$1$1(EngineActivity$78$1 engineActivity$78$1) {
        this.this$2 = engineActivity$78$1;
    }

    public void run() {
        TrackEntityView trackEntityView;
        int n;
        View.OnTouchListener onTouchListener = EngineActivity.cfr_renamed_18(this.this$2.this$1.this$0);
        int n2 = onTouchListener.getCurrent_cursur_position();
        if (n2 > (n = (trackEntityView = EngineActivity.cfr_renamed_18(this.this$2.this$1.this$0)).getMaxTime())) {
            onTouchListener = EngineActivity.cfr_renamed_64(this.this$2.this$1.this$0);
            onTouchListener.invalidate();
        }
        EngineActivity.cfr_renamed_18(this.this$2.this$1.this$0).invalidate();
        EngineActivity.cfr_renamed_74(this.this$2.this$1.this$0);
    }
}

