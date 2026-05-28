// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.model.BgItem;
import android.view.View;
import android.view.View$OnClickListener;

class BgAdabterL$ViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ BgAdabterL$ViewHolder this$1;
    final /* synthetic */ BgAdabterL val$this$0;
    
    BgAdabterL$ViewHolder$1(final BgAdabterL$ViewHolder this$1, final BgAdabterL val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        if (this.this$1.this$0.iBgCallback != null) {
            BgAdabterL.-$$Nest$fputselected(this.this$1.this$0, this.this$1.getAdapterPosition());
            this.this$1.this$0.iBgCallback.onAdd(BgAdabterL.-$$Nest$fgetimages(this.this$1.this$0).get(this.this$1.getAdapterPosition()));
        }
    }
}
