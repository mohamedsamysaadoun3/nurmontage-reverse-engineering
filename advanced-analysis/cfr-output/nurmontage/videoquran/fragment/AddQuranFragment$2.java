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

class AddQuranFragment$2
implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ AddQuranFragment this$0;

    AddQuranFragment$2(AddQuranFragment addQuranFragment) {
        this.this$0 = addQuranFragment;
    }

    public void onItemSelected(AdapterView object, View view, int n, long l) {
        object = this.this$0;
        boolean bl = AddQuranFragment.cfr_renamed_207((AddQuranFragment)((Object)object));
        if (bl) {
            object = this.this$0;
            AddQuranFragment.cfr_renamed_208((AddQuranFragment)((Object)object));
        }
        AddQuranFragment.cfr_renamed_209(this.this$0, true);
    }

    public void onNothingSelected(AdapterView adapterView) {
    }
}

