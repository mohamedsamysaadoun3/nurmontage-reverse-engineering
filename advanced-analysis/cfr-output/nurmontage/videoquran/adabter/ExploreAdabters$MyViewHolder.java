/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.adabter.ExploreAdabters;
import hazem.nurmontage.videoquran.views.SquareImageViewSimple;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public class ExploreAdabters$MyViewHolder
extends RecyclerView.ViewHolder {
    private SquareImageViewSimple imageView;
    final /* synthetic */ ExploreAdabters this$0;
    private TextCustumFont tv_name;
    private TextCustumFont tv_size;

    static /* bridge */ /* synthetic */ SquareImageViewSimple cfr_renamed_113(ExploreAdabters$MyViewHolder exploreAdabters$MyViewHolder) {
        return exploreAdabters$MyViewHolder.imageView;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_355(ExploreAdabters$MyViewHolder exploreAdabters$MyViewHolder) {
        return exploreAdabters$MyViewHolder.tv_name;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_356(ExploreAdabters$MyViewHolder exploreAdabters$MyViewHolder) {
        return exploreAdabters$MyViewHolder.tv_size;
    }

    public ExploreAdabters$MyViewHolder(ExploreAdabters exploreAdabters, View view) {
        Object object;
        this.this$0 = exploreAdabters;
        super(view);
        int n = R$id.img;
        this.imageView = object = (SquareImageViewSimple)view.findViewById(n);
        n = R$id.tv_name;
        object = (TextCustumFont)view.findViewById(n);
        this.tv_name = object;
        n = R$id.tv_size;
        object = (TextCustumFont)view.findViewById(n);
        this.tv_size = object;
        super(this, exploreAdabters);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

