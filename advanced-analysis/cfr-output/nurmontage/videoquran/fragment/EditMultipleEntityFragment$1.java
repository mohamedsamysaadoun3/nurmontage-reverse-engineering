/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import hazem.nurmontage.videoquran.fragment.EditMultipleEntityFragment;

class EditMultipleEntityFragment$1
implements View.OnClickListener {
    final /* synthetic */ EditMultipleEntityFragment this$0;

    EditMultipleEntityFragment$1(EditMultipleEntityFragment editMultipleEntityFragment) {
        this.this$0 = editMultipleEntityFragment;
    }

    public void onClick(View object) {
        object = EditMultipleEntityFragment.cfr_renamed_69(this.this$0);
        if (object != null) {
            object = EditMultipleEntityFragment.cfr_renamed_69(this.this$0);
            object.onDelete();
        }
    }
}

