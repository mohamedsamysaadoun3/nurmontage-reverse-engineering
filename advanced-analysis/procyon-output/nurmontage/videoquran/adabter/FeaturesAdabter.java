// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import hazem.nurmontage.videoquran.model.ModelFeatures;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class FeaturesAdabter extends RecyclerView$Adapter
{
    private boolean isSubscibe;
    private List list;
    
    public FeaturesAdabter(final List list) {
        this.list = list;
    }
    
    public int getItemCount() {
        final List list = this.list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
    
    public void onBindViewHolder(final FeaturesAdabter$ViewHolder featuresAdabter$ViewHolder, final int n) {
        FeaturesAdabter$ViewHolder.-$$Nest$fgettext(featuresAdabter$ViewHolder).setText((CharSequence)this.list.get(n).getName());
    }
    
    public FeaturesAdabter$ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new FeaturesAdabter$ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_feature, viewGroup, false));
    }
    
    public void setSubscribe(final boolean isSubscibe) {
        this.isSubscibe = isSubscibe;
        this.notifyDataSetChanged();
    }
}
