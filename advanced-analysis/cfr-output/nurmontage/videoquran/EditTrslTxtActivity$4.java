/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.EditTrslTxtActivity;

class EditTrslTxtActivity$4
implements View.OnClickListener {
    final /* synthetic */ EditTrslTxtActivity this$0;

    EditTrslTxtActivity$4(EditTrslTxtActivity editTrslTxtActivity) {
        this.this$0 = editTrslTxtActivity;
    }

    public void onClick(View object) {
        object = EditTrslTxtActivity.cfr_renamed_358(this.this$0);
        boolean bl = EditTrslTxtActivity.cfr_renamed_358(this.this$0).isChecked() ^ true;
        object.setChecked(bl);
    }
}

