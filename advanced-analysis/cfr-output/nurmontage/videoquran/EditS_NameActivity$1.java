/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.activity.OnBackPressedCallback
 */
package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;
import hazem.nurmontage.videoquran.EditS_NameActivity;

class EditS_NameActivity$1
extends OnBackPressedCallback {
    final /* synthetic */ EditS_NameActivity this$0;

    EditS_NameActivity$1(EditS_NameActivity editS_NameActivity, boolean bl) {
        this.this$0 = editS_NameActivity;
        super(bl);
    }

    public void handleOnBackPressed() {
        this.this$0.closeKeyboard();
        this.this$0.setResult(0, null);
        this.this$0.overridePendingTransition(0, 0);
        this.this$0.finish();
    }
}

