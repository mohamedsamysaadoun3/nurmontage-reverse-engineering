/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import hazem.nurmontage.videoquran.fragment.EditIconQuranFragment;

class EditIconQuranFragment$1
implements View.OnClickListener {
    final /* synthetic */ EditIconQuranFragment this$0;

    EditIconQuranFragment$1(EditIconQuranFragment editIconQuranFragment) {
        this.this$0 = editIconQuranFragment;
    }

    public void onClick(View object) {
        object = EditIconQuranFragment.cfr_renamed_160(this.this$0);
        if (object != null) {
            object = EditIconQuranFragment.cfr_renamed_160(this.this$0);
            String string2 = EditIconQuranFragment.cfr_renamed_161(this.this$0);
            object.onDone(string2);
        }
    }
}

