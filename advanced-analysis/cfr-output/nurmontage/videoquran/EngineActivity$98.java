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
import hazem.nurmontage.videoquran.EngineActivity$98$1;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;

class EngineActivity$98
implements View.OnClickListener {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ ButtonCustumFont val$dialog_no;

    EngineActivity$98(EngineActivity engineActivity, ButtonCustumFont buttonCustumFont) {
        this.this$0 = engineActivity;
        this.val$dialog_no = buttonCustumFont;
    }

    public void onClick(View object) {
        this.val$dialog_no.setClickable(false);
        EngineActivity.cfr_renamed_60(this.this$0);
        EngineActivity$98$1 engineActivity$98$1 = new EngineActivity$98$1(this);
        object = new Thread(engineActivity$98$1);
        ((Thread)object).start();
        object = EngineActivity.cfr_renamed_19(this.this$0);
        if (object != null) {
            object = EngineActivity.cfr_renamed_19(this.this$0);
            object.dismiss();
        }
    }
}

