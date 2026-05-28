/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.activity.OnBackPressedCallback
 */
package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;
import hazem.nurmontage.videoquran.TextEditActivity;

class TextEditActivity$1
extends OnBackPressedCallback {
    final /* synthetic */ TextEditActivity this$0;

    TextEditActivity$1(TextEditActivity textEditActivity, boolean bl) {
        this.this$0 = textEditActivity;
        super(bl);
    }

    public void handleOnBackPressed() {
        this.this$0.setResult(-1, null);
        this.this$0.finish();
    }
}

