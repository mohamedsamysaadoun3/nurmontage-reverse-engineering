/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.activity.OnBackPressedCallback
 */
package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;
import hazem.nurmontage.videoquran.QuranSearchActivity;

class QuranSearchActivity$2
extends OnBackPressedCallback {
    final /* synthetic */ QuranSearchActivity this$0;

    QuranSearchActivity$2(QuranSearchActivity quranSearchActivity, boolean bl) {
        this.this$0 = quranSearchActivity;
        super(bl);
    }

    public void handleOnBackPressed() {
        this.this$0.closeKeyboard();
        this.this$0.setResult(0);
        this.this$0.finish();
    }
}

