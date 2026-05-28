/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PorterDuff$Mode
 *  android.widget.ImageButton
 */
package hazem.nurmontage.videoquran;

import android.graphics.PorterDuff;
import android.widget.ImageButton;
import hazem.nurmontage.videoquran.EngineActivity;

class EngineActivity$61
implements Runnable {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$61(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void run() {
        ImageButton imageButton = EngineActivity.cfr_renamed_410(this.this$0);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageButton.setColorFilter(-1, mode);
        imageButton = EngineActivity.cfr_renamed_410(this.this$0);
        boolean bl = true;
        imageButton.setEnabled(bl);
        EngineActivity.cfr_renamed_410(this.this$0).setClickable(bl);
    }
}

