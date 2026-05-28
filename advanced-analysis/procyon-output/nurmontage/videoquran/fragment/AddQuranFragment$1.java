// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class AddQuranFragment$1 implements View$OnClickListener
{
    final /* synthetic */ AddQuranFragment this$0;
    
    AddQuranFragment$1(final AddQuranFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        AddQuranFragment.-$$Nest$fgetincludeBismilah(this.this$0).setChecked(AddQuranFragment.-$$Nest$fgetincludeBismilah(this.this$0).isChecked() ^ true);
    }
}
