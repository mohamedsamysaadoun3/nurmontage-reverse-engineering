// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;

class AddQuranFragment$2 implements AdapterView$OnItemSelectedListener
{
    final /* synthetic */ AddQuranFragment this$0;
    
    AddQuranFragment$2(final AddQuranFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
        if (AddQuranFragment.-$$Nest$fgetisFromSelectReciters(this.this$0)) {
            AddQuranFragment.-$$Nest$mgoneReaderNameUpload(this.this$0);
        }
        AddQuranFragment.-$$Nest$fputisFromSelectReciters(this.this$0, true);
    }
    
    public void onNothingSelected(final AdapterView adapterView) {
    }
}
