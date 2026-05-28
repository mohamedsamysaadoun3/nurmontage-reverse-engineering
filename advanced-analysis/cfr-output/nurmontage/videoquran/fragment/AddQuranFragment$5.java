/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment;

class AddQuranFragment$5
implements View.OnClickListener {
    final /* synthetic */ AddQuranFragment this$0;

    AddQuranFragment$5(AddQuranFragment addQuranFragment) {
        this.this$0 = addQuranFragment;
    }

    public void onClick(View object) {
        AddQuranFragment.cfr_renamed_264(this.this$0);
        object = AddQuranFragment.cfr_renamed_185(this.this$0);
        if (object != null) {
            object = AddQuranFragment.cfr_renamed_185(this.this$0);
            object.onSearch();
        }
    }
}

