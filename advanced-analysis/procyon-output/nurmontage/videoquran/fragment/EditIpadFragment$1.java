// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class EditIpadFragment$1 implements View$OnClickListener
{
    final /* synthetic */ EditIpadFragment this$0;
    
    EditIpadFragment$1(final EditIpadFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (EditIpadFragment.-$$Nest$fgetiIpadEditCallback(this.this$0) != null) {
            EditIpadFragment.-$$Nest$fgetiIpadEditCallback(this.this$0).onDone();
        }
    }
}
