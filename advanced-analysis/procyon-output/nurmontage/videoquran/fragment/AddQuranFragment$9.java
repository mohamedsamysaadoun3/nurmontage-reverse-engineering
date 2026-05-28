// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.widget.Spinner;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;

class AddQuranFragment$9 implements AdapterView$OnItemSelectedListener
{
    final /* synthetic */ AddQuranFragment this$0;
    
    AddQuranFragment$9(final AddQuranFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onItemSelected(final AdapterView adapterView, final View view, int to, final long n) {
        if (AddQuranFragment.-$$Nest$fgetisFromSearch(this.this$0)) {
            final Spinner -$$Nest$fgetspinnerTo = AddQuranFragment.-$$Nest$fgetspinnerTo(this.this$0);
            to = AddQuranFragment.-$$Nest$fgetquranPreference(this.this$0).getTo();
            -$$Nest$fgetspinnerTo.setSelection(to);
            AddQuranFragment.-$$Nest$fputisFromSearch(this.this$0, false);
            return;
        }
        if (!AddQuranFragment.-$$Nest$fgetisFromSelect(this.this$0)) {
            if (AddQuranFragment.-$$Nest$fgetspinnerTo(this.this$0).getSelectedItemPosition() != to) {
                AddQuranFragment.-$$Nest$fgetspinnerTo(this.this$0).setSelection(to);
            }
        }
        else {
            AddQuranFragment.-$$Nest$fputisFromSelect(this.this$0, false);
        }
    }
    
    public void onNothingSelected(final AdapterView adapterView) {
    }
}
