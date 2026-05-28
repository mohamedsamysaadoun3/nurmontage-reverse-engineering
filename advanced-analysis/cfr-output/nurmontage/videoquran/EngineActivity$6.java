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
import hazem.nurmontage.videoquran.EngineActivity$6$1;

class EngineActivity$6
implements View.OnClickListener {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$6(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void onClick(View object) {
        object = this.this$0;
        EngineActivity$6$1 engineActivity$6$1 = new EngineActivity$6$1(this);
        object.runOnUiThread((Runnable)engineActivity$6$1);
    }
}

