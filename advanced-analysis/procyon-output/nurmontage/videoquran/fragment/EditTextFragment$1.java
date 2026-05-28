// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class EditTextFragment$1 implements View$OnClickListener
{
    final /* synthetic */ EditTextFragment this$0;
    
    EditTextFragment$1(final EditTextFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (EditTextFragment.-$$Nest$fgetiEditEntityCallback(this.this$0) != null) {
            EditTextFragment.-$$Nest$fgetiEditEntityCallback(this.this$0).onDone(EditTextFragment.-$$Nest$fgetquranEntity(this.this$0).getEntityQuran());
        }
    }
}
