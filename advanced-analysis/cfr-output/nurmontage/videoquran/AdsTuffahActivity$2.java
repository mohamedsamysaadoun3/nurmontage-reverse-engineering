/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.activity.OnBackPressedCallback
 */
package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;
import hazem.nurmontage.videoquran.AdsTuffahActivity;

class AdsTuffahActivity$2
extends OnBackPressedCallback {
    final /* synthetic */ AdsTuffahActivity this$0;

    AdsTuffahActivity$2(AdsTuffahActivity adsTuffahActivity, boolean bl) {
        this.this$0 = adsTuffahActivity;
        super(bl);
    }

    public void handleOnBackPressed() {
        this.this$0.finish();
    }
}

