/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.TextEditActivity;

class TextEditActivity$2
implements View.OnClickListener {
    final /* synthetic */ TextEditActivity this$0;

    TextEditActivity$2(TextEditActivity textEditActivity) {
        this.this$0 = textEditActivity;
    }

    public void onClick(View view) {
        TextEditActivity.cfr_renamed_91(this.this$0).handleOnBackPressed();
    }
}

