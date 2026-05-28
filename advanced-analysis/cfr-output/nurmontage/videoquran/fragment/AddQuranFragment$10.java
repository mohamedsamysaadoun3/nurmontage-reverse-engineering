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
import hazem.nurmontage.videoquran.Utils.QuranPreference;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment;
import java.util.ArrayList;
import java.util.Collection;

class AddQuranFragment$10
implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ AddQuranFragment this$0;

    AddQuranFragment$10(AddQuranFragment addQuranFragment) {
        this.this$0 = addQuranFragment;
    }

    public void onItemSelected(AdapterView object, View object2, int n, long l) {
        int n2;
        int n3;
        object = this.this$0;
        Object object3 = AddQuranFragment.cfr_renamed_247((AddQuranFragment)((Object)object));
        if (n == object3) {
            return;
        }
        object = this.this$0;
        object3 = AddQuranFragment.cfr_renamed_250((AddQuranFragment)((Object)object));
        if (object3 != 0) {
            object = AddQuranFragment.cfr_renamed_246(this.this$0);
            object2 = AddQuranFragment.cfr_renamed_252(this.this$0);
            n3 = ((QuranPreference)object2).getSurah();
            object3 = object[n3];
        } else {
            object = AddQuranFragment.cfr_renamed_246(this.this$0);
            object3 = object[n];
        }
        object2 = new ArrayList();
        for (n2 = n = 1; n2 <= object3; ++n2) {
            String string2 = String.valueOf(n2);
            ((ArrayList)object2).add(string2);
        }
        AddQuranFragment.cfr_renamed_244(this.this$0).clear();
        AddQuranFragment.cfr_renamed_244(this.this$0).addAll((Collection)object2);
        AddQuranFragment.cfr_renamed_245(this.this$0).clear();
        AddQuranFragment.cfr_renamed_245(this.this$0).addAll((Collection)object2);
        object = this.this$0;
        object3 = AddQuranFragment.cfr_renamed_250((AddQuranFragment)((Object)object));
        n3 = 0;
        object2 = null;
        if (object3 != 0) {
            object = this.this$0;
            object = AddQuranFragment.cfr_renamed_256((AddQuranFragment)((Object)object));
            Object object4 = this.this$0;
            object4 = AddQuranFragment.cfr_renamed_252((AddQuranFragment)((Object)object4));
            n2 = ((QuranPreference)object4).getSurah();
            object.setSelection(n2, n != 0);
            object = this.this$0;
            object = AddQuranFragment.cfr_renamed_254((AddQuranFragment)((Object)object));
            Object object5 = this.this$0;
            object5 = AddQuranFragment.cfr_renamed_252((AddQuranFragment)((Object)object5));
            n = ((QuranPreference)object5).getFrom();
            object.setSelection(n, false);
            object = this.this$0;
            object = AddQuranFragment.cfr_renamed_257((AddQuranFragment)((Object)object));
            object5 = this.this$0;
            object5 = AddQuranFragment.cfr_renamed_252((AddQuranFragment)((Object)object5));
            n = ((QuranPreference)object5).getTo();
            object.setSelection(n, false);
            object = this.this$0;
            object = AddQuranFragment.cfr_renamed_255((AddQuranFragment)((Object)object));
            object5 = this.this$0;
            object5 = AddQuranFragment.cfr_renamed_252((AddQuranFragment)((Object)object5));
            n = ((QuranPreference)object5).getNameReader();
            object.setSelection(n, false);
            object = this.this$0;
            object = AddQuranFragment.cfr_renamed_258((AddQuranFragment)((Object)object));
            object5 = this.this$0;
            object5 = AddQuranFragment.cfr_renamed_252((AddQuranFragment)((Object)object5));
            n = ((QuranPreference)object5).getTranslation();
            try {
                object.setSelection(n, false);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            object = this.this$0;
            AddQuranFragment.cfr_renamed_263((AddQuranFragment)((Object)object), false);
        } else {
            AddQuranFragment.cfr_renamed_257(this.this$0).setSelection(0, false);
            object = AddQuranFragment.cfr_renamed_254(this.this$0);
            object.setSelection(0, false);
        }
        object = this.this$0;
        n3 = AddQuranFragment.cfr_renamed_256((AddQuranFragment)((Object)object)).getSelectedItemPosition();
        AddQuranFragment.cfr_renamed_260((AddQuranFragment)((Object)object), n3);
    }

    public void onNothingSelected(AdapterView adapterView) {
    }
}

