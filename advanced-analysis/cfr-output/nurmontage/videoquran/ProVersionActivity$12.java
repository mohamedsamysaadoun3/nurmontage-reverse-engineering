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

class ProVersionActivity$12
implements Runnable {
    final /* synthetic */ ProVersionActivity this$0;

    ProVersionActivity$12(ProVersionActivity proVersionActivity) {
        this.this$0 = proVersionActivity;
    }

    public void run() {
        Toast.makeText((Context)this.this$0.getApplicationContext(), (CharSequence)"Purchase is pending", (int)0).show();
    }
}

