// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class AddQuranFragment$6 implements View$OnClickListener
{
    final /* synthetic */ AddQuranFragment this$0;
    
    AddQuranFragment$6(final AddQuranFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (AddQuranFragment.-$$Nest$fgetiAddQuran(this.this$0) != null) {
            AddQuranFragment.-$$Nest$fgetiAddQuran(this.this$0).uploadRecitation();
        }
        AddQuranFragment.-$$Nest$fputiAddQuran(this.this$0, (AddQuranFragment$IAddQuran)null);
    }
}
