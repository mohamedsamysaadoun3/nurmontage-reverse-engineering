/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import hazem.nurmontage.videoquran.fragment.EditMediaFragment;

class EditMediaFragment$3
implements View.OnClickListener {
    final /* synthetic */ EditMediaFragment this$0;

    EditMediaFragment$3(EditMediaFragment editMediaFragment) {
        this.this$0 = editMediaFragment;
    }

    public void onClick(View object) {
        object = EditMediaFragment.cfr_renamed_69(this.this$0);
        if (object != null) {
            object = EditMediaFragment.cfr_renamed_69(this.this$0);
            object.onDelete();
        }
    }
}

