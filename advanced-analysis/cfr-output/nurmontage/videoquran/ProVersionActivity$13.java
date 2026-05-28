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

class ProVersionActivity$13
implements Runnable {
    final /* synthetic */ ProVersionActivity this$0;

    ProVersionActivity$13(ProVersionActivity proVersionActivity) {
        this.this$0 = proVersionActivity;
    }

    public void run() {
        Toast.makeText((Context)this.this$0.getApplicationContext(), (CharSequence)"Purchase is in unknown state", (int)0).show();
    }
}

