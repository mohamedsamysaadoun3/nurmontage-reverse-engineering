// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import android.view.View$OnClickListener;

class IconQuranAdabters$ViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ IconQuranAdabters$ViewHolder this$1;
    final /* synthetic */ IconQuranAdabters val$this$0;
    
    IconQuranAdabters$ViewHolder$1(final IconQuranAdabters$ViewHolder this$1, final IconQuranAdabters val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        if (IconQuranAdabters.-$$Nest$fgeticonQuranCallback(this.this$1.this$0) != null) {
            if (IconQuranAdabters.-$$Nest$fgetselect(this.this$1.this$0) == this.this$1.getAdapterPosition()) {
                return;
            }
            final int -$$Nest$fgetselect = IconQuranAdabters.-$$Nest$fgetselect(this.this$1.this$0);
            IconQuranAdabters.-$$Nest$fputselect(this.this$1.this$0, this.this$1.getAdapterPosition());
            this.this$1.this$0.notifyItemChanged(-$$Nest$fgetselect);
            this.this$1.this$0.notifyItemChanged(IconQuranAdabters.-$$Nest$fgetselect(this.this$1.this$0));
            IconQuranAdabters.-$$Nest$fgeticonQuranCallback(this.this$1.this$0).onIcon(IconQuranAdabters.-$$Nest$fgetlist(this.this$1.this$0).get(this.this$1.getAdapterPosition()));
        }
    }
}
