/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.Toast
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.widget.Toast;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$65;
import hazem.nurmontage.videoquran.R$string;

class EngineActivity$65$5
implements Runnable {
    final /* synthetic */ EngineActivity$65 this$1;

    EngineActivity$65$5(EngineActivity$65 engineActivity$65) {
        this.this$1 = engineActivity$65;
    }

    public void run() {
        EngineActivity engineActivity = this.this$1.this$0;
        Object object = EngineActivity.cfr_renamed_90(this.this$1.this$0);
        int n = R$string.error_limit;
        object = object.getString(n);
        Toast.makeText((Context)engineActivity, (CharSequence)object, (int)0).show();
    }
}

