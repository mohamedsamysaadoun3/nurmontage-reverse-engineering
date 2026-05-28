/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.activity.OnBackPressedCallback
 */
package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;
import hazem.nurmontage.videoquran.ProVersionActivityLast;

class ProVersionActivityLast$1
extends OnBackPressedCallback {
    final /* synthetic */ ProVersionActivityLast this$0;

    ProVersionActivityLast$1(ProVersionActivityLast proVersionActivityLast, boolean bl) {
        this.this$0 = proVersionActivityLast;
        super(bl);
    }

    public void handleOnBackPressed() {
        Object object = ProVersionActivityLast.cfr_renamed_2(this.this$0);
        if (object != null) {
            object = this.this$0;
            ProVersionActivityLast.cfr_renamed_67((ProVersionActivityLast)((Object)object));
        }
        this.this$0.finish();
    }
}

