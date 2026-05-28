/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  com.bumptech.glide.Glide
 *  com.bumptech.glide.RequestBuilder
 */
package hazem.nurmontage.videoquran.adabter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.adabter.ExploreAdabters$IExplore;
import hazem.nurmontage.videoquran.adabter.ExploreAdabters$MyViewHolder;
import hazem.nurmontage.videoquran.model.ExploreItem;
import java.util.List;

public class ExploreAdabters
extends RecyclerView.Adapter {
    private final List exploreItems;
    private String folder_select;
    private ExploreAdabters$IExplore iExplore;
    private final int size;

    static /* bridge */ /* synthetic */ List cfr_renamed_343(ExploreAdabters exploreAdabters) {
        return exploreAdabters.exploreItems;
    }

    static /* bridge */ /* synthetic */ ExploreAdabters$IExplore cfr_renamed_342(ExploreAdabters exploreAdabters) {
        return exploreAdabters.iExplore;
    }

    public ExploreAdabters(List list, int n, ExploreAdabters$IExplore exploreAdabters$IExplore, String string2) {
        this.exploreItems = list;
        this.size = n;
        this.iExplore = exploreAdabters$IExplore;
        this.folder_select = string2;
    }

    public int getItemCount() {
        List list = this.exploreItems;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void onBindViewHolder(ExploreAdabters$MyViewHolder object, int n) {
        Object object2 = Glide.with((View)object.itemView);
        Object object3 = ((ExploreItem)this.exploreItems.get(n)).getFirstFilePath();
        object2 = object2.load(object3);
        int n2 = this.size;
        object2 = (RequestBuilder)((RequestBuilder)object2.override(n2, n2)).centerCrop();
        n2 = R$drawable.image_24px;
        object2 = (RequestBuilder)object2.placeholder(n2);
        object3 = ExploreAdabters$MyViewHolder.cfr_renamed_113(object);
        object2.into((ImageView)object3);
        object2 = ExploreAdabters$MyViewHolder.cfr_renamed_355(object);
        object3 = ((ExploreItem)this.exploreItems.get(n)).getName();
        object2.setText((CharSequence)object3);
        object = ExploreAdabters$MyViewHolder.cfr_renamed_356(object);
        String string2 = ((ExploreItem)this.exploreItems.get(n)).getSize();
        object.setText(string2);
    }

    public ExploreAdabters$MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_explore;
        viewGroup = layoutInflater.inflate(n2, viewGroup, false);
        ExploreAdabters$MyViewHolder exploreAdabters$MyViewHolder = new ExploreAdabters$MyViewHolder(this, (View)viewGroup);
        return exploreAdabters$MyViewHolder;
    }
}

