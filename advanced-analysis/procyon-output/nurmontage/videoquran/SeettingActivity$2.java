// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View;
import android.view.View$OnClickListener;

class SeettingActivity$2 implements View$OnClickListener
{
    final /* synthetic */ SeettingActivity this$0;
    
    SeettingActivity$2(final SeettingActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        this.this$0.findViewById(R$id.progress).setVisibility(0);
        SeettingActivity.-$$Nest$mrestoreSubscribe(this.this$0);
    }
}
