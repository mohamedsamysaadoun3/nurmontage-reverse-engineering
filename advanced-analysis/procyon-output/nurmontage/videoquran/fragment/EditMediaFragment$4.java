// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class EditMediaFragment$4 implements View$OnClickListener
{
    final /* synthetic */ EditMediaFragment this$0;
    
    EditMediaFragment$4(final EditMediaFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (EditMediaFragment.-$$Nest$fgetiEditMediaCallback(this.this$0) != null) {
            EditMediaFragment.-$$Nest$fgetiEditMediaCallback(this.this$0).onDuplicate();
        }
    }
}
