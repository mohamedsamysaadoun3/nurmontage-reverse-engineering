/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.EditS_NameActivity;

class EditS_NameActivity$6
implements View.OnClickListener {
    final /* synthetic */ EditS_NameActivity this$0;

    EditS_NameActivity$6(EditS_NameActivity editS_NameActivity) {
        this.this$0 = editS_NameActivity;
    }

    public void onClick(View object) {
        object = EditS_NameActivity.cfr_renamed_358(this.this$0);
        boolean bl = EditS_NameActivity.cfr_renamed_358(this.this$0).isChecked() ^ true;
        object.setChecked(bl);
    }
}

