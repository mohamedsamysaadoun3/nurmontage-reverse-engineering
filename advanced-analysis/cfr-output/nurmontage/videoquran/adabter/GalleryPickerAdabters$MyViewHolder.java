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
import hazem.nurmontage.videoquran.adabter.GalleryPickerAdabters;
import hazem.nurmontage.videoquran.views.SquareImageView;

public class GalleryPickerAdabters$MyViewHolder
extends RecyclerView.ViewHolder {
    private SquareImageView imageView;
    final /* synthetic */ GalleryPickerAdabters this$0;

    static /* bridge */ /* synthetic */ SquareImageView cfr_renamed_113(GalleryPickerAdabters$MyViewHolder galleryPickerAdabters$MyViewHolder) {
        return galleryPickerAdabters$MyViewHolder.imageView;
    }

    public GalleryPickerAdabters$MyViewHolder(GalleryPickerAdabters galleryPickerAdabters, View view) {
        Object object;
        this.this$0 = galleryPickerAdabters;
        super(view);
        int n = R$id.img;
        this.imageView = object = (SquareImageView)view.findViewById(n);
        super(this, galleryPickerAdabters);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

