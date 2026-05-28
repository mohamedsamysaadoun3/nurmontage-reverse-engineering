// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class EditTrslEntityFragment$7 implements View$OnClickListener
{
    final /* synthetic */ EditTrslEntityFragment this$0;
    
    EditTrslEntityFragment$7(final EditTrslEntityFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (EditTrslEntityFragment.-$$Nest$fgetiEditEntityCallback(this.this$0) != null) {
            EditTrslEntityFragment.-$$Nest$fgetiEditEntityCallback(this.this$0).untilNow();
        }
    }
}
