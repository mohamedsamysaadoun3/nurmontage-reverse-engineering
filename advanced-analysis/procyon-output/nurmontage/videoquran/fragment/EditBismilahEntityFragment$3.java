// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class EditBismilahEntityFragment$3 implements View$OnClickListener
{
    final /* synthetic */ EditBismilahEntityFragment this$0;
    
    EditBismilahEntityFragment$3(final EditBismilahEntityFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (EditBismilahEntityFragment.-$$Nest$fgetiEditEntityCallback(this.this$0) != null) {
            EditBismilahEntityFragment.-$$Nest$fgetiEditEntityCallback(this.this$0).fromNow();
        }
    }
}
