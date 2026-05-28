/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.adabter.IconQuranAdabters$IIconQuranCallback;
import hazem.nurmontage.videoquran.fragment.EditIconQuranFragment;

class EditIconQuranFragment$3
implements IconQuranAdabters$IIconQuranCallback {
    final /* synthetic */ EditIconQuranFragment this$0;

    EditIconQuranFragment$3(EditIconQuranFragment editIconQuranFragment) {
        this.this$0 = editIconQuranFragment;
    }

    public void onIcon(String object) {
        Object object2 = this.this$0;
        EditIconQuranFragment.cfr_renamed_163(object2, (String)object);
        object = EditIconQuranFragment.cfr_renamed_160(this.this$0);
        if (object != null) {
            object = EditIconQuranFragment.cfr_renamed_160(this.this$0);
            object2 = EditIconQuranFragment.cfr_renamed_161(this.this$0);
            object.add((String)object2);
        }
    }
}

