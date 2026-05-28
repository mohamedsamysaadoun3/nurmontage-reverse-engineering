/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Spinner
 */
package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.widget.Spinner;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment$3$1;

class AddQuranFragment$3
implements View.OnClickListener {
    final /* synthetic */ AddQuranFragment this$0;

    AddQuranFragment$3(AddQuranFragment addQuranFragment) {
        this.this$0 = addQuranFragment;
    }

    public void onClick(View object) {
        object = AddQuranFragment.cfr_renamed_185(this.this$0);
        if (object != null) {
            object = AddQuranFragment.cfr_renamed_254(this.this$0);
            int n = object.getSelectedItemPosition() + 1;
            Spinner spinner = AddQuranFragment.cfr_renamed_257(this.this$0);
            int n2 = spinner.getSelectedItemPosition() + 1;
            Spinner spinner2 = AddQuranFragment.cfr_renamed_256(this.this$0);
            int n3 = spinner2.getSelectedItemPosition() + 1;
            AddQuranFragment$3$1 addQuranFragment$3$1 = new AddQuranFragment$3$1(this, n, n2, n3);
            Thread thread = new Thread(addQuranFragment$3$1);
            thread.start();
        }
    }
}

