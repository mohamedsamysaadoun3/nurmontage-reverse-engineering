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
import hazem.nurmontage.videoquran.ProVersionActivityDone;
import hazem.nurmontage.videoquran.R$string;

class ProVersionActivityDone$14
implements Runnable {
    final /* synthetic */ ProVersionActivityDone this$0;

    ProVersionActivityDone$14(ProVersionActivityDone proVersionActivityDone) {
        this.this$0 = proVersionActivityDone;
    }

    public void run() {
        ProVersionActivityDone.cfr_renamed_13(this.this$0);
        ProVersionActivityDone proVersionActivityDone = this.this$0;
        boolean bl = ProVersionActivityDone.cfr_renamed_85(proVersionActivityDone);
        if (bl) {
            proVersionActivityDone = this.this$0.getApplicationContext();
            Object object = ProVersionActivityDone.cfr_renamed_90(this.this$0);
            int n = R$string.not_have_susbcribe;
            object = object.getString(n);
            n = 0;
            proVersionActivityDone = Toast.makeText((Context)proVersionActivityDone, (CharSequence)object, (int)0);
            proVersionActivityDone.show();
        }
    }
}

