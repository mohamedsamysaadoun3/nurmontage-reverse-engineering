/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.activity.OnBackPressedCallback
 */
package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;
import hazem.nurmontage.videoquran.EditTrslTxtActivity;

class EditTrslTxtActivity$1
extends OnBackPressedCallback {
    final /* synthetic */ EditTrslTxtActivity this$0;

    EditTrslTxtActivity$1(EditTrslTxtActivity editTrslTxtActivity, boolean bl) {
        this.this$0 = editTrslTxtActivity;
        super(bl);
    }

    public void handleOnBackPressed() {
        this.this$0.closeKeyboard();
        this.this$0.setResult(0, null);
        this.this$0.overridePendingTransition(0, 0);
        this.this$0.finish();
    }
}

