/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
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
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.adabter.GallerySelctedAdabters$IGallerySelected;
import hazem.nurmontage.videoquran.adabter.GallerySelctedAdabters$MyViewHolder;
import hazem.nurmontage.videoquran.model.GallerySelected;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.ArrayList;
import java.util.List;

public class GallerySelctedAdabters
extends RecyclerView.Adapter {
    private BitmapDrawable bitmapPlaceHolder;
    private final List gallerySelecteds;
    private GallerySelctedAdabters$IGallerySelected iGallerySelected;
    private final int size;

    static /* bridge */ /* synthetic */ List cfr_renamed_322(GallerySelctedAdabters gallerySelctedAdabters) {
        return gallerySelctedAdabters.gallerySelecteds;
    }

    static /* bridge */ /* synthetic */ GallerySelctedAdabters$IGallerySelected cfr_renamed_323(GallerySelctedAdabters gallerySelctedAdabters) {
        return gallerySelctedAdabters.iGallerySelected;
    }

    public GallerySelctedAdabters(Resources resources, GallerySelctedAdabters$IGallerySelected gallerySelctedAdabters$IGallerySelected, int n) {
        BitmapDrawable bitmapDrawable;
        ArrayList arrayList;
        this.gallerySelecteds = arrayList = new ArrayList();
        this.size = n;
        this.iGallerySelected = gallerySelctedAdabters$IGallerySelected;
        gallerySelctedAdabters$IGallerySelected = Bitmap.Config.RGB_565;
        gallerySelctedAdabters$IGallerySelected = Bitmap.createBitmap((int)n, (int)n, (Bitmap.Config)gallerySelctedAdabters$IGallerySelected);
        gallerySelctedAdabters$IGallerySelected.eraseColor(-16777216);
        this.bitmapPlaceHolder = bitmapDrawable = new BitmapDrawable(resources, (Bitmap)gallerySelctedAdabters$IGallerySelected);
    }

    public void addItemPhoto(GallerySelected gallerySelected) {
        this.gallerySelecteds.add(gallerySelected);
        gallerySelected.getPhotoItem().setGallerySelected(gallerySelected);
        int n = this.gallerySelecteds.size() + -1;
        this.notifyItemInserted(n);
    }

    public void addItemVideo(GallerySelected gallerySelected) {
        this.gallerySelecteds.add(gallerySelected);
        gallerySelected.getVideoItem().setGallerySelected(gallerySelected);
        int n = this.gallerySelecteds.size() + -1;
        this.notifyItemInserted(n);
    }

    public void deletedItem(int n) {
        this.gallerySelecteds.remove(n);
        this.notifyItemRemoved(n);
    }

    public void deletedItem(GallerySelected gallerySelected) {
        int n;
        List list = this.gallerySelecteds;
        int n2 = list.indexOf(gallerySelected);
        if (n2 != (n = -1)) {
            list = this.gallerySelecteds;
            list.remove(n2);
            this.notifyItemRemoved(n2);
        }
    }

    public List getGallerySelecteds() {
        return this.gallerySelecteds;
    }

    public int getItemCount() {
        List list = this.gallerySelecteds;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public int getSize() {
        return this.size;
    }

    public void onBindViewHolder(GallerySelctedAdabters$MyViewHolder object, int n) {
        Object object2;
        Object object3 = ((GallerySelected)this.gallerySelecteds.get(n)).getVideoItem();
        if (object3 != null) {
            object3 = ((GallerySelected)this.gallerySelecteds.get(n)).getVideoItem().getPath();
            GallerySelctedAdabters$MyViewHolder.cfr_renamed_332(object).setVisibility(0);
            TextCustumFont textCustumFont = GallerySelctedAdabters$MyViewHolder.cfr_renamed_332(object);
            List list = this.gallerySelecteds;
            object2 = ((GallerySelected)list.get(n)).getVideoItem().getTime();
            textCustumFont.setText((CharSequence)object2);
        } else {
            object3 = ((GallerySelected)this.gallerySelecteds.get(n)).getPhotoItem().getPath();
            object2 = GallerySelctedAdabters$MyViewHolder.cfr_renamed_332(object);
            int n2 = 8;
            object2.setVisibility(n2);
        }
        object2 = Glide.with((View)object.itemView).load((String)object3);
        int n3 = this.size;
        object2 = (RequestBuilder)((RequestBuilder)object2.override(n3, n3)).centerCrop();
        object3 = this.bitmapPlaceHolder;
        object2 = (RequestBuilder)object2.placeholder((Drawable)object3);
        object = GallerySelctedAdabters$MyViewHolder.cfr_renamed_113(object);
        object2.into((ImageView)object);
    }

    public GallerySelctedAdabters$MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_gallery_select;
        viewGroup = layoutInflater.inflate(n2, viewGroup, false);
        GallerySelctedAdabters$MyViewHolder gallerySelctedAdabters$MyViewHolder = new GallerySelctedAdabters$MyViewHolder(this, (View)viewGroup);
        return gallerySelctedAdabters$MyViewHolder;
    }
}

