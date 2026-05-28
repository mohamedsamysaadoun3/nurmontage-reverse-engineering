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
import hazem.nurmontage.videoquran.ProVersionActivityLast;
import hazem.nurmontage.videoquran.R$string;

class ProVersionActivityLast$19
implements Runnable {
    final /* synthetic */ ProVersionActivityLast this$0;

    ProVersionActivityLast$19(ProVersionActivityLast proVersionActivityLast) {
        this.this$0 = proVersionActivityLast;
    }

    public void run() {
        ProVersionActivityLast.cfr_renamed_13(this.this$0);
        Context context = this.this$0.getApplicationContext();
        Object object = ProVersionActivityLast.cfr_renamed_90(this.this$0);
        int n = R$string.not_have_susbcribe;
        object = object.getString(n);
        Toast.makeText((Context)context, (CharSequence)object, (int)0).show();
    }
}

