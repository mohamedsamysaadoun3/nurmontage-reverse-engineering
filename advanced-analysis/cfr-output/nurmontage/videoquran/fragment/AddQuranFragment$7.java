/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.net.Uri;
import android.view.View;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment;

class AddQuranFragment$7
implements View.OnClickListener {
    final /* synthetic */ AddQuranFragment this$0;

    AddQuranFragment$7(AddQuranFragment addQuranFragment) {
        this.this$0 = addQuranFragment;
    }

    public void onClick(View object) {
        object = AddQuranFragment.cfr_renamed_185(this.this$0);
        if (object != null && (object = AddQuranFragment.cfr_renamed_259(this.this$0)) != null) {
            object = AddQuranFragment.cfr_renamed_185(this.this$0);
            String string2 = AddQuranFragment.cfr_renamed_253(this.this$0);
            String string3 = AddQuranFragment.cfr_renamed_251(this.this$0);
            Uri uri = AddQuranFragment.cfr_renamed_259(this.this$0);
            object.onAddReaderName(string2, string3, uri);
        }
    }
}

