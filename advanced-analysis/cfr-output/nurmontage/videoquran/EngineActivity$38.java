/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package hazem.nurmontage.videoquran;

import android.app.Activity;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import hazem.nurmontage.videoquran.views.TrackEntityView;

class EngineActivity$38
implements Runnable {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$38(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void run() {
        int n = ScreenUtils.getScreenWidth((Activity)this.this$0);
        float f = (float)n * 0.12f;
        EngineActivity.cfr_renamed_18(this.this$0).setSecond_in_screen(f);
        EngineActivity.cfr_renamed_18(this.this$0).setSecond_in_screen(f, 0, n);
        EngineActivity.cfr_renamed_18(this.this$0).setMaxTime(0);
        TrackEntityView trackEntityView = EngineActivity.cfr_renamed_18(this.this$0);
        int n2 = EngineActivity.cfr_renamed_18(this.this$0).getHeight();
        trackEntityView.init(n, n2);
        Object object = EngineActivity.cfr_renamed_18(this.this$0);
        int n3 = EngineActivity.cfr_renamed_2(this.this$0).getCurrentCursur();
        ((TrackEntityView)((Object)object)).setPosCursur(n3);
        object = this.this$0;
        n3 = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object)).getCurrent_cursur_position();
        EngineActivity.cfr_renamed_79((EngineActivity)((Object)object), n3);
        object = this.this$0;
        n3 = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object)).getMaxTime();
        n2 = EngineActivity.cfr_renamed_18(this.this$0).getCurrent_cursur_position();
        ((EngineActivity)((Object)object)).updateViewTime(n3, n2);
    }
}

