/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.activity.OnBackPressedCallback
 */
package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;
import hazem.nurmontage.videoquran.ProVersionActivityDone;

class ProVersionActivityDone$1
extends OnBackPressedCallback {
    final /* synthetic */ ProVersionActivityDone this$0;

    ProVersionActivityDone$1(ProVersionActivityDone proVersionActivityDone, boolean bl) {
        this.this$0 = proVersionActivityDone;
        super(bl);
    }

    public void handleOnBackPressed() {
        Object object = ProVersionActivityDone.cfr_renamed_2(this.this$0);
        if (object != null) {
            object = this.this$0;
            ProVersionActivityDone.cfr_renamed_67((ProVersionActivityDone)((Object)object));
        }
        this.this$0.finish();
    }
}

