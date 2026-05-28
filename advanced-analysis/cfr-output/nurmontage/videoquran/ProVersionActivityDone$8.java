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

class ProVersionActivityDone$8
implements Runnable {
    final /* synthetic */ ProVersionActivityDone this$0;

    ProVersionActivityDone$8(ProVersionActivityDone proVersionActivityDone) {
        this.this$0 = proVersionActivityDone;
    }

    public void run() {
        Toast.makeText((Context)this.this$0.getApplicationContext(), (CharSequence)"Purchase is pending", (int)0).show();
    }
}

