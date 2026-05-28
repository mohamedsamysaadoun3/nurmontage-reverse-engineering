/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import hazem.nurmontage.videoquran.ProVersionActivityDone;
import hazem.nurmontage.videoquran.Utils.MyVibrationHelper;

class ProVersionActivityDone$15
implements Runnable {
    final /* synthetic */ ProVersionActivityDone this$0;

    ProVersionActivityDone$15(ProVersionActivityDone proVersionActivityDone) {
        this.this$0 = proVersionActivityDone;
    }

    public void run() {
        ProVersionActivityDone proVersionActivityDone = this.this$0;
        MyVibrationHelper myVibrationHelper = new MyVibrationHelper((Context)proVersionActivityDone);
        myVibrationHelper.vibrate(250L);
    }
}

