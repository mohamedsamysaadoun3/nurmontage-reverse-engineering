/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import hazem.nurmontage.videoquran.fragment.EditS_NameFragment;
import hazem.nurmontage.videoquran.model.SurahNameEntity;

class EditS_NameFragment$1
implements View.OnClickListener {
    final /* synthetic */ EditS_NameFragment this$0;

    EditS_NameFragment$1(EditS_NameFragment editS_NameFragment) {
        this.this$0 = editS_NameFragment;
    }

    public void onClick(View object) {
        object = EditS_NameFragment.cfr_renamed_176(this.this$0);
        if (object != null) {
            object = EditS_NameFragment.cfr_renamed_176(this.this$0);
            SurahNameEntity surahNameEntity = EditS_NameFragment.cfr_renamed_177(this.this$0);
            object.onFont(surahNameEntity);
        }
    }
}

