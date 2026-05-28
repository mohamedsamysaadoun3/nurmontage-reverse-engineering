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
import hazem.nurmontage.videoquran.adabter.GalleryVideoAdabters;
import hazem.nurmontage.videoquran.views.SquareImageView;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public class GalleryVideoAdabters$MyViewHolder
extends RecyclerView.ViewHolder {
    private SquareImageView imageView;
    final /* synthetic */ GalleryVideoAdabters this$0;
    private TextCustumFont tv_time;

    static /* bridge */ /* synthetic */ SquareImageView cfr_renamed_113(GalleryVideoAdabters$MyViewHolder galleryVideoAdabters$MyViewHolder) {
        return galleryVideoAdabters$MyViewHolder.imageView;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_332(GalleryVideoAdabters$MyViewHolder galleryVideoAdabters$MyViewHolder) {
        return galleryVideoAdabters$MyViewHolder.tv_time;
    }

    public GalleryVideoAdabters$MyViewHolder(GalleryVideoAdabters galleryVideoAdabters, View view) {
        Object object;
        this.this$0 = galleryVideoAdabters;
        super(view);
        int n = R$id.img;
        this.imageView = object = (SquareImageView)view.findViewById(n);
        n = R$id.tv_time;
        object = (TextCustumFont)view.findViewById(n);
        this.tv_time = object;
        object.setVisibility(0);
        super(this, galleryVideoAdabters);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

