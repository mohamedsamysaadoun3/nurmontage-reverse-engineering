// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.constant.SurahNameStyle;
import android.view.View;
import android.view.View$OnClickListener;

class EditS_NameActivity$3 implements View$OnClickListener
{
    final /* synthetic */ EditS_NameActivity this$0;
    
    EditS_NameActivity$3(final EditS_NameActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        EditS_NameActivity.-$$Nest$fputstyle(this.this$0, SurahNameStyle.ZAGHRAFAT.ordinal());
        final EditS_NameActivity this$0 = this.this$0;
        EditS_NameActivity.-$$Nest$mselectOption(this$0, EditS_NameActivity.-$$Nest$fgettvOption2(this$0), EditS_NameActivity.-$$Nest$fgettvOption1(this.this$0));
    }
}
