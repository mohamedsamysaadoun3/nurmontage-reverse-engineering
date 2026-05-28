/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import hazem.nurmontage.videoquran.fragment.EditIpadFragment;

class EditIpadFragment$1
implements View.OnClickListener {
    final /* synthetic */ EditIpadFragment this$0;

    EditIpadFragment$1(EditIpadFragment editIpadFragment) {
        this.this$0 = editIpadFragment;
    }

    public void onClick(View object) {
        object = EditIpadFragment.cfr_renamed_172(this.this$0);
        if (object != null) {
            object = EditIpadFragment.cfr_renamed_172(this.this$0);
            object.onDone();
        }
    }
}

