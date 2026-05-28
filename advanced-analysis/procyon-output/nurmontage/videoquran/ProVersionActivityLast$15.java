// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;

class ProVersionActivityLast$15 implements Runnable
{
    final /* synthetic */ ProVersionActivityLast this$0;
    
    ProVersionActivityLast$15(final ProVersionActivityLast this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        final View viewById = this.this$0.findViewById(R$id.restore);
        final int visibility = 8;
        viewById.setVisibility(visibility);
        this.this$0.findViewById(R$id.layout_price).setVisibility(visibility);
        this.this$0.findViewById(R$id.view_success).setVisibility(0);
        ((TextCustumFont)this.this$0.findViewById(R$id.tv_thanks)).setText((CharSequence)ProVersionActivityLast.-$$Nest$fgetmResources(this.this$0).getString(R$string.thanks_hint));
        this.this$0.findViewById(R$id.tv_tittle_billing).setVisibility(visibility);
        final ProVersionActivityLast this$0 = this.this$0;
        ProVersionActivityLast.-$$Nest$fputbtnContinue(this$0, (ButtonCustumFont)this$0.findViewById(R$id.btn_done));
        ProVersionActivityLast.-$$Nest$fgetbtnContinue(this.this$0).setText((CharSequence)ProVersionActivityLast.-$$Nest$fgetmResources(this.this$0).getString(R$string.done));
        ProVersionActivityLast.-$$Nest$fgetbtnContinue(this.this$0).setOnClickListener((View$OnClickListener)new ProVersionActivityLast$15$1(this));
        ProVersionActivityLast.-$$Nest$fgetfeaturesAdabter(this.this$0).setSubscribe(true);
        this.this$0.explode();
    }
}
