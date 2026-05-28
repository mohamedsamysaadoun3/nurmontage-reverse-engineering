// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.model.ItemDimension;
import android.view.View;
import android.view.View$OnClickListener;

class DimensionAdabters$ViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ DimensionAdabters$ViewHolder this$1;
    final /* synthetic */ DimensionAdabters val$this$0;
    
    DimensionAdabters$ViewHolder$1(final DimensionAdabters$ViewHolder this$1, final DimensionAdabters val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        if (DimensionAdabters.-$$Nest$fgetmIDimensionCallback(this.this$1.this$0) != null) {
            final int -$$Nest$fgetselected = DimensionAdabters.-$$Nest$fgetselected(this.this$1.this$0);
            DimensionAdabters.-$$Nest$fputselected(this.this$1.this$0, this.this$1.getAdapterPosition());
            this.this$1.this$0.notifyItemChanged(-$$Nest$fgetselected);
            this.this$1.this$0.notifyItemChanged(DimensionAdabters.-$$Nest$fgetselected(this.this$1.this$0));
            final ItemDimension itemDimension = DimensionAdabters.-$$Nest$fgetmDimensionList(this.this$1.this$0).get(this.this$1.getAdapterPosition());
            DimensionAdabters.-$$Nest$fgetmIDimensionCallback(this.this$1.this$0).onCustumSize(itemDimension.getW(), itemDimension.getH(), itemDimension.getResizeType().ordinal(), itemDimension.getId(), itemDimension.getImage());
        }
    }
}
