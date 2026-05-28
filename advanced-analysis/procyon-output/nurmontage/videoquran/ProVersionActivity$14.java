// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.views.TextCustumFont;

class ProVersionActivity$14 implements Runnable
{
    final /* synthetic */ ProVersionActivity this$0;
    
    ProVersionActivity$14(final ProVersionActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        final View viewById = this.this$0.findViewById(R$id.tv_hint_ar);
        final int n = 8;
        viewById.setVisibility(n);
        this.this$0.findViewById(R$id.tv_hint_en).setVisibility(n);
        this.this$0.findViewById(R$id.btn_continue).setVisibility(n);
        this.this$0.findViewById(R$id.layout_price).setVisibility(n);
        final TextCustumFont textCustumFont = (TextCustumFont)this.this$0.findViewById(R$id.tv_thanks);
        textCustumFont.setVisibility(0);
        textCustumFont.setText((CharSequence)ProVersionActivity.-$$Nest$fgetmResources(this.this$0).getString(R$string.thanks_hint));
        ProVersionActivity.-$$Nest$minitBtnHelp(this.this$0, true);
        this.this$0.explode();
    }
}
