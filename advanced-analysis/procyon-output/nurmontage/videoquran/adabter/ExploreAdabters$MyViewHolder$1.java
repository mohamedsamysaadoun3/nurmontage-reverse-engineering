// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.model.ExploreItem;
import android.view.View;
import android.view.View$OnClickListener;

class ExploreAdabters$MyViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ ExploreAdabters$MyViewHolder this$1;
    final /* synthetic */ ExploreAdabters val$this$0;
    
    ExploreAdabters$MyViewHolder$1(final ExploreAdabters$MyViewHolder this$1, final ExploreAdabters val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        if (ExploreAdabters.-$$Nest$fgetiExplore(this.this$1.this$0) != null) {
            final ExploreItem exploreItem = ExploreAdabters.-$$Nest$fgetexploreItems(this.this$1.this$0).get(this.this$1.getAdapterPosition());
            ExploreAdabters.-$$Nest$fgetiExplore(this.this$1.this$0).folder(exploreItem.getFolder(), exploreItem.getName(), exploreItem.getPath());
        }
    }
}
