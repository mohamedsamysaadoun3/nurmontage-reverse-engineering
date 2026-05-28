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
import hazem.nurmontage.videoquran.EngineActivity$86;
import hazem.nurmontage.videoquran.R$string;

class EngineActivity$86$2
implements Runnable {
    final /* synthetic */ EngineActivity$86 this$1;

    EngineActivity$86$2(EngineActivity$86 engineActivity$86) {
        this.this$1 = engineActivity$86;
    }

    public void run() {
        EngineActivity.cfr_renamed_13(this.this$1.this$0);
        EngineActivity.cfr_renamed_75(this.this$1.this$0);
        EngineActivity engineActivity = this.this$1.this$0;
        Object object = EngineActivity.cfr_renamed_90(this.this$1.this$0);
        int n = R$string.video_not_have_sound;
        object = object.getString(n);
        Toast.makeText((Context)engineActivity, (CharSequence)object, (int)0).show();
    }
}

