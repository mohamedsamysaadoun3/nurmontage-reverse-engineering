// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import android.view.View$OnClickListener;

class EngineActivity$98 implements View$OnClickListener
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ ButtonCustumFont val$dialog_no;
    
    EngineActivity$98(final EngineActivity this$0, final ButtonCustumFont val$dialog_no) {
        this.this$0 = this$0;
        this.val$dialog_no = val$dialog_no;
    }
    
    public void onClick(final View view) {
        this.val$dialog_no.setClickable(false);
        EngineActivity.-$$Nest$mshowProgress(this.this$0);
        new Thread(new EngineActivity$98$1(this)).start();
        if (EngineActivity.-$$Nest$fgetdialog(this.this$0) != null) {
            EngineActivity.-$$Nest$fgetdialog(this.this$0).dismiss();
        }
    }
}
