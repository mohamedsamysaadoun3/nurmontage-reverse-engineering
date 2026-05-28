// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import android.view.View$OnClickListener;

class ColorBgAdabter$ViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ ColorBgAdabter$ViewHolder this$1;
    final /* synthetic */ ColorBgAdabter val$this$0;
    
    ColorBgAdabter$ViewHolder$1(final ColorBgAdabter$ViewHolder this$1, final ColorBgAdabter val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        if (this.this$1.this$0.iColorCallback != null && ColorBgAdabter.-$$Nest$fgetpos_select(this.this$1.this$0) != this.this$1.getAdapterPosition()) {
            if (ColorBgAdabter.-$$Nest$fgetenabled(this.this$1.this$0)) {
                final int -$$Nest$fgetpos_select = ColorBgAdabter.-$$Nest$fgetpos_select(this.this$1.this$0);
                ColorBgAdabter.-$$Nest$fputpos_select(this.this$1.this$0, this.this$1.getAdapterPosition());
                this.this$1.this$0.notifyItemChanged(-$$Nest$fgetpos_select);
                this.this$1.this$0.notifyItemChanged(ColorBgAdabter.-$$Nest$fgetpos_select(this.this$1.this$0));
                this.this$1.this$0.iColorCallback.onColor(ColorBgAdabter.-$$Nest$fgetcolors(this.this$1.this$0)[this.this$1.getAdapterPosition()], this.this$1.getAdapterPosition());
            }
        }
    }
}
