// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class EditIconQuranFragment$2 implements View$OnClickListener
{
    final /* synthetic */ EditIconQuranFragment this$0;
    
    EditIconQuranFragment$2(final EditIconQuranFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (EditIconQuranFragment.-$$Nest$fgetiQuranIconCallback(this.this$0) != null) {
            EditIconQuranFragment.-$$Nest$fgetiQuranIconCallback(this.this$0).onCancel(EditIconQuranFragment.-$$Nest$fgetlast_icon(this.this$0));
        }
    }
}
