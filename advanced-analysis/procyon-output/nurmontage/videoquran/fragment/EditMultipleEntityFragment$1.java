// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class EditMultipleEntityFragment$1 implements View$OnClickListener
{
    final /* synthetic */ EditMultipleEntityFragment this$0;
    
    EditMultipleEntityFragment$1(final EditMultipleEntityFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (EditMultipleEntityFragment.-$$Nest$fgetiEditMediaCallback(this.this$0) != null) {
            EditMultipleEntityFragment.-$$Nest$fgetiEditMediaCallback(this.this$0).onDelete();
        }
    }
}
