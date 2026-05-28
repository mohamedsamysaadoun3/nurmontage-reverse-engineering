/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageButton
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 */
package hazem.nurmontage.videoquran.adabter;

import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.adabter.GallerySelctedAdabters;
import hazem.nurmontage.videoquran.views.SquareImageView;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public class GallerySelctedAdabters$MyViewHolder
extends RecyclerView.ViewHolder {
    private ImageButton btnDeleted;
    private SquareImageView imageView;
    final /* synthetic */ GallerySelctedAdabters this$0;
    private TextCustumFont tv_time;

    static /* bridge */ /* synthetic */ SquareImageView cfr_renamed_113(GallerySelctedAdabters$MyViewHolder gallerySelctedAdabters$MyViewHolder) {
        return gallerySelctedAdabters$MyViewHolder.imageView;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_332(GallerySelctedAdabters$MyViewHolder gallerySelctedAdabters$MyViewHolder) {
        return gallerySelctedAdabters$MyViewHolder.tv_time;
    }

    public GallerySelctedAdabters$MyViewHolder(GallerySelctedAdabters gallerySelctedAdabters, View view) {
        Object object;
        this.this$0 = gallerySelctedAdabters;
        super(view);
        int n = R$id.img;
        this.imageView = object = (SquareImageView)view.findViewById(n);
        n = R$id.tv_time;
        object = (TextCustumFont)view.findViewById(n);
        this.tv_time = object;
        n = R$id.btn_deleted;
        view = (ImageButton)view.findViewById(n);
        this.btnDeleted = view;
        view.setVisibility(0);
        this.tv_time.setVisibility(0);
        view = this.btnDeleted;
        super(this, gallerySelctedAdabters);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

