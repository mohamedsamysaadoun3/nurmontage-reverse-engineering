/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.adabter.DimensionAdabters;
import hazem.nurmontage.videoquran.views.TextCustumFont;

class DimensionAdabters$ViewHolder
extends RecyclerView.ViewHolder {
    private final TextCustumFont dimension;
    private final ImageView imageView;
    public FrameLayout layout;
    private final TextCustumFont name;
    final /* synthetic */ DimensionAdabters this$0;

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_351(DimensionAdabters$ViewHolder dimensionAdabters$ViewHolder) {
        return dimensionAdabters$ViewHolder.dimension;
    }

    static /* bridge */ /* synthetic */ ImageView cfr_renamed_113(DimensionAdabters$ViewHolder dimensionAdabters$ViewHolder) {
        return dimensionAdabters$ViewHolder.imageView;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_350(DimensionAdabters$ViewHolder dimensionAdabters$ViewHolder) {
        return dimensionAdabters$ViewHolder.name;
    }

    public DimensionAdabters$ViewHolder(DimensionAdabters dimensionAdabters, View view) {
        Object object;
        this.this$0 = dimensionAdabters;
        super(view);
        int n = R$id.layout;
        this.layout = object = (FrameLayout)view.findViewById(n);
        n = R$id.icon;
        object = (ImageView)view.findViewById(n);
        this.imageView = object;
        n = R$id.aspect_name;
        object = (TextCustumFont)view.findViewById(n);
        this.name = object;
        n = R$id.aspect_size;
        object = (TextCustumFont)view.findViewById(n);
        this.dimension = object;
        super(this, dimensionAdabters);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

