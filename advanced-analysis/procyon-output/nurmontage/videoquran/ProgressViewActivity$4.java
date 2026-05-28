// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View;
import android.view.View$OnClickListener;

class ProgressViewActivity$4 implements View$OnClickListener
{
    final /* synthetic */ ProgressViewActivity this$0;
    
    ProgressViewActivity$4(final ProgressViewActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (ProgressViewActivity.-$$Nest$fgetdialog(this.this$0) != null) {
            ProgressViewActivity.-$$Nest$fgetdialog(this.this$0).dismiss();
        }
    }
}
