/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.widget.AdapterView;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment;

class AddQuranFragment$9
implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ AddQuranFragment this$0;

    AddQuranFragment$9(AddQuranFragment addQuranFragment) {
        this.this$0 = addQuranFragment;
    }

    public void onItemSelected(AdapterView object, View view, int n, long l) {
        object = this.this$0;
        int n2 = AddQuranFragment.cfr_renamed_248((AddQuranFragment)((Object)object));
        if (n2 != 0) {
            object = AddQuranFragment.cfr_renamed_257(this.this$0);
            n = AddQuranFragment.cfr_renamed_252(this.this$0).getTo();
            object.setSelection(n);
            AddQuranFragment.cfr_renamed_261(this.this$0, false);
            return;
        }
        object = this.this$0;
        n2 = AddQuranFragment.cfr_renamed_249((AddQuranFragment)((Object)object));
        if (n2 == 0) {
            object = AddQuranFragment.cfr_renamed_257(this.this$0);
            n2 = object.getSelectedItemPosition();
            if (n2 != n) {
                object = AddQuranFragment.cfr_renamed_257(this.this$0);
                object.setSelection(n);
            }
        } else {
            object = this.this$0;
            AddQuranFragment.cfr_renamed_262((AddQuranFragment)((Object)object), false);
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }
}

