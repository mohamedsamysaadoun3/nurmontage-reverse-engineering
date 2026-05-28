/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import hazem.nurmontage.videoquran.ProVersionActivityLast;
import hazem.nurmontage.videoquran.Utils.MyVibrationHelper;

class ProVersionActivityLast$20
implements Runnable {
    final /* synthetic */ ProVersionActivityLast this$0;

    ProVersionActivityLast$20(ProVersionActivityLast proVersionActivityLast) {
        this.this$0 = proVersionActivityLast;
    }

    public void run() {
        ProVersionActivityLast proVersionActivityLast = this.this$0;
        MyVibrationHelper myVibrationHelper = new MyVibrationHelper((Context)proVersionActivityLast);
        myVibrationHelper.vibrate(250L);
    }
}

