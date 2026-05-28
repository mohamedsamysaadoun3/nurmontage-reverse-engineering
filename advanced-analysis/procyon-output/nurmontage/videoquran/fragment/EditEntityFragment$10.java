// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class EditEntityFragment$10 implements View$OnClickListener
{
    final /* synthetic */ EditEntityFragment this$0;
    
    EditEntityFragment$10(final EditEntityFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (EditEntityFragment.-$$Nest$fgetiEditEntityCallback(this.this$0) != null) {
            EditEntityFragment.-$$Nest$fgetiEditEntityCallback(this.this$0).onFont();
        }
    }
}
