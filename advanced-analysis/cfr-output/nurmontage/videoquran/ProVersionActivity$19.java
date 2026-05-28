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
import hazem.nurmontage.videoquran.ProVersionActivity;
import hazem.nurmontage.videoquran.R$string;

class ProVersionActivity$19
implements Runnable {
    final /* synthetic */ ProVersionActivity this$0;

    ProVersionActivity$19(ProVersionActivity proVersionActivity) {
        this.this$0 = proVersionActivity;
    }

    public void run() {
        ProVersionActivity.cfr_renamed_13(this.this$0);
        ProVersionActivity proVersionActivity = this.this$0;
        boolean bl = ProVersionActivity.cfr_renamed_85(proVersionActivity);
        if (bl) {
            proVersionActivity = this.this$0.getApplicationContext();
            Object object = ProVersionActivity.cfr_renamed_90(this.this$0);
            int n = R$string.not_have_susbcribe;
            object = object.getString(n);
            n = 0;
            proVersionActivity = Toast.makeText((Context)proVersionActivity, (CharSequence)object, (int)0);
            proVersionActivity.show();
        }
    }
}

