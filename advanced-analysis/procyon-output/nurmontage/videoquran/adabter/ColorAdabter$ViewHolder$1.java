// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import android.view.View$OnClickListener;

class ColorAdabter$ViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ ColorAdabter$ViewHolder this$1;
    final /* synthetic */ ColorAdabter val$this$0;
    
    ColorAdabter$ViewHolder$1(final ColorAdabter$ViewHolder this$1, final ColorAdabter val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        if (this.this$1.this$0.iColorCallback != null && ColorAdabter.-$$Nest$fgetpos_select(this.this$1.this$0) != this.this$1.getAdapterPosition()) {
            if (ColorAdabter.-$$Nest$fgetenabled(this.this$1.this$0)) {
                final int -$$Nest$fgetpos_select = ColorAdabter.-$$Nest$fgetpos_select(this.this$1.this$0);
                ColorAdabter.-$$Nest$fputpos_select(this.this$1.this$0, this.this$1.getAdapterPosition());
                this.this$1.this$0.notifyItemChanged(-$$Nest$fgetpos_select);
                this.this$1.this$0.notifyItemChanged(ColorAdabter.-$$Nest$fgetpos_select(this.this$1.this$0));
                this.this$1.this$0.iColorCallback.onColor(ColorAdabter.-$$Nest$fgetcolors(this.this$1.this$0)[this.this$1.getAdapterPosition()], this.this$1.getAdapterPosition());
            }
        }
    }
}
