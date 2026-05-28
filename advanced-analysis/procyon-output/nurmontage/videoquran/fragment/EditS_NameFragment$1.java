// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class EditS_NameFragment$1 implements View$OnClickListener
{
    final /* synthetic */ EditS_NameFragment this$0;
    
    EditS_NameFragment$1(final EditS_NameFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (EditS_NameFragment.-$$Nest$fgetiEditSName(this.this$0) != null) {
            EditS_NameFragment.-$$Nest$fgetiEditSName(this.this$0).onFont(EditS_NameFragment.-$$Nest$fgetentity_select(this.this$0));
        }
    }
}
