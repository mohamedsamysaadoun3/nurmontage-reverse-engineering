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

class AddQuranFragment$1
implements View.OnClickListener {
    final /* synthetic */ AddQuranFragment this$0;

    AddQuranFragment$1(AddQuranFragment addQuranFragment) {
        this.this$0 = addQuranFragment;
    }

    public void onClick(View object) {
        object = AddQuranFragment.cfr_renamed_199(this.this$0);
        boolean bl = AddQuranFragment.cfr_renamed_199(this.this$0).isChecked() ^ true;
        object.setChecked(bl);
    }
}

