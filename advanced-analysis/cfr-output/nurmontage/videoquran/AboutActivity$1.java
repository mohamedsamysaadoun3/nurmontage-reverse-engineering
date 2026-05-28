/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.activity.OnBackPressedCallback
 */
package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;
import hazem.nurmontage.videoquran.AboutActivity;

class AboutActivity$1
extends OnBackPressedCallback {
    final /* synthetic */ AboutActivity this$0;

    AboutActivity$1(AboutActivity aboutActivity, boolean bl) {
        this.this$0 = aboutActivity;
        super(bl);
    }

    public void handleOnBackPressed() {
        this.this$0.finish();
    }
}

