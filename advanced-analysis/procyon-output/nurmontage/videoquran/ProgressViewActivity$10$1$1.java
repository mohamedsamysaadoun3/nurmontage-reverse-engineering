// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Context;
import hazem.nurmontage.videoquran.Utils.Feadback;
import android.view.View;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import android.view.View$OnClickListener;

class ProgressViewActivity$10$1$1 implements View$OnClickListener
{
    final /* synthetic */ ProgressViewActivity$10$1 this$2;
    final /* synthetic */ ButtonCustumFont val$btnTeam;
    
    ProgressViewActivity$10$1$1(final ProgressViewActivity$10$1 this$2, final ButtonCustumFont val$btnTeam) {
        this.this$2 = this$2;
        this.val$btnTeam = val$btnTeam;
    }
    
    public void onClick(final View view) {
        Feadback.reportBug((Context)this.this$2.this$1.this$0, this.this$2.val$sb.toString(), this.val$btnTeam.getText().toString());
    }
}
