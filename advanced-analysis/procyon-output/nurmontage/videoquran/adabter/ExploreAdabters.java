// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.R$drawable;
import com.bumptech.glide.RequestBuilder;
import hazem.nurmontage.videoquran.model.ExploreItem;
import com.bumptech.glide.Glide;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class ExploreAdabters extends RecyclerView$Adapter
{
    private final List exploreItems;
    private String folder_select;
    private ExploreAdabters$IExplore iExplore;
    private final int size;
    
    public ExploreAdabters(final List exploreItems, final int size, final ExploreAdabters$IExplore iExplore, final String folder_select) {
        this.exploreItems = exploreItems;
        this.size = size;
        this.iExplore = iExplore;
        this.folder_select = folder_select;
    }
    
    public int getItemCount() {
        final List exploreItems = this.exploreItems;
        if (exploreItems != null) {
            return exploreItems.size();
        }
        return 0;
    }
    
    public void onBindViewHolder(final ExploreAdabters$MyViewHolder exploreAdabters$MyViewHolder, final int n) {
        final RequestBuilder load = Glide.with(exploreAdabters$MyViewHolder.itemView).load(this.exploreItems.get(n).getFirstFilePath());
        final int size = this.size;
        ((RequestBuilder)((RequestBuilder)((RequestBuilder)load.override(size, size)).centerCrop()).placeholder(R$drawable.image_24px)).into((ImageView)ExploreAdabters$MyViewHolder.-$$Nest$fgetimageView(exploreAdabters$MyViewHolder));
        ExploreAdabters$MyViewHolder.-$$Nest$fgettv_name(exploreAdabters$MyViewHolder).setText((CharSequence)this.exploreItems.get(n).getName());
        ExploreAdabters$MyViewHolder.-$$Nest$fgettv_size(exploreAdabters$MyViewHolder).setText((CharSequence)this.exploreItems.get(n).getSize());
    }
    
    public ExploreAdabters$MyViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new ExploreAdabters$MyViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_explore, viewGroup, false));
    }
}
