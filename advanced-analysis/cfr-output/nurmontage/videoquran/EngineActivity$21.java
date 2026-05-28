/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.views.TrackEntityView;

class EngineActivity$21
implements View.OnClickListener {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$21(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void onClick(View object) {
        TrackEntityView trackEntityView;
        int n;
        object = EngineActivity.cfr_renamed_18(this.this$0);
        int n2 = object.getCurrent_cursur_position();
        if (n2 == (n = (trackEntityView = EngineActivity.cfr_renamed_18(this.this$0)).getMaxTime())) {
            return;
        }
        EngineActivity.cfr_renamed_64(this.this$0).setProgress(1.0f);
        EngineActivity.cfr_renamed_68(this.this$0);
        EngineActivity.cfr_renamed_79(this.this$0, 0);
        EngineActivity.cfr_renamed_18(this.this$0).translateToEnd();
        object = this.this$0;
        n = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object)).getMaxTime();
        int n3 = EngineActivity.cfr_renamed_18(this.this$0).getCurrent_cursur_position();
        object.updateViewTime(n, n3);
        EngineActivity.cfr_renamed_53(this.this$0);
        EngineActivity.cfr_renamed_54(this.this$0);
    }
}

