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

class ProVersionActivityLast$13
implements Runnable {
    final /* synthetic */ ProVersionActivityLast this$0;

    ProVersionActivityLast$13(ProVersionActivityLast proVersionActivityLast) {
        this.this$0 = proVersionActivityLast;
    }

    public void run() {
        Toast.makeText((Context)this.this$0.getApplicationContext(), (CharSequence)"Purchase is pending", (int)0).show();
    }
}

