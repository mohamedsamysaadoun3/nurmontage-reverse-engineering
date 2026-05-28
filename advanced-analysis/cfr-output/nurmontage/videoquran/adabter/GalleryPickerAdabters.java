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
 *  com.bumptech.glide.load.Key
 *  com.bumptech.glide.load.engine.DiskCacheStrategy
 *  com.bumptech.glide.signature.ObjectKey
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
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.signature.ObjectKey;
import hazem.nurmontage.videoquran.GalleryPickerVideo$IPicker;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.adabter.GalleryPickerAdabters$MyViewHolder;
import hazem.nurmontage.videoquran.model.GallerySelected;
import hazem.nurmontage.videoquran.model.PhotoItem;
import hazem.nurmontage.videoquran.views.SquareImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GalleryPickerAdabters
extends RecyclerView.Adapter {
    private String APP_VERSION;
    private List all_paths;
    private BitmapDrawable bitmapPlaceHolder;
    private final List gallerySelectedList;
    private GalleryPickerVideo$IPicker iPicker;
    private List paths;
    private PhotoItem photoItem_selected;
    private final int size;

    static /* bridge */ /* synthetic */ List cfr_renamed_312(GalleryPickerAdabters galleryPickerAdabters) {
        return galleryPickerAdabters.gallerySelectedList;
    }

    static /* bridge */ /* synthetic */ GalleryPickerVideo$IPicker cfr_renamed_278(GalleryPickerAdabters galleryPickerAdabters) {
        return galleryPickerAdabters.iPicker;
    }

    static /* bridge */ /* synthetic */ List cfr_renamed_313(GalleryPickerAdabters galleryPickerAdabters) {
        return galleryPickerAdabters.paths;
    }

    static /* bridge */ /* synthetic */ PhotoItem cfr_renamed_314(GalleryPickerAdabters galleryPickerAdabters) {
        return galleryPickerAdabters.photoItem_selected;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_315(GalleryPickerAdabters galleryPickerAdabters, PhotoItem photoItem) {
        galleryPickerAdabters.photoItem_selected = photoItem;
    }

    public GalleryPickerAdabters(String string2, Resources resources, List list, int n, GalleryPickerVideo$IPicker galleryPickerVideo$IPicker) {
        this.size = n;
        this.APP_VERSION = string2;
        this.iPicker = galleryPickerVideo$IPicker;
        this.gallerySelectedList = list;
        string2 = Bitmap.Config.RGB_565;
        string2 = Bitmap.createBitmap((int)n, (int)n, (Bitmap.Config)string2);
        string2.eraseColor(-16777216);
        super(resources, (Bitmap)string2);
        this.bitmapPlaceHolder = list;
    }

    public void addItems(List object) {
        boolean bl;
        this.paths = object;
        GalleryPickerVideo$IPicker galleryPickerVideo$IPicker = this.iPicker;
        if (galleryPickerVideo$IPicker != null && (object == null || (bl = object.isEmpty()))) {
            object = this.iPicker;
            object.onEmptyList();
        }
    }

    public void clear() {
        List list = this.paths;
        if (list != null) {
            list.clear();
        }
    }

    public void doneItems(List list) {
        ArrayList arrayList;
        this.paths = list;
        this.all_paths = arrayList = new ArrayList(list);
    }

    public int getItemCount() {
        List list = this.paths;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void inselectItem(int n) {
        Object object = this.paths;
        int n2 = object.size();
        if (n >= n2) {
            return;
        }
        object = (PhotoItem)this.paths.get(n);
        ((PhotoItem)object).setSelect(false);
        this.notifyItemChanged(n);
        n = ((PhotoItem)object).getNumber();
        this.updateNumbers(n);
    }

    public void onBindViewHolder(GalleryPickerAdabters$MyViewHolder object, int n) {
        Object object2 = (PhotoItem)this.paths.get(n);
        SquareImageView squareImageView = GalleryPickerAdabters$MyViewHolder.cfr_renamed_113(object);
        int bl = ((PhotoItem)object2).getNumber();
        squareImageView.setNumber(bl);
        squareImageView = GalleryPickerAdabters$MyViewHolder.cfr_renamed_113(object);
        boolean bl2 = ((PhotoItem)object2).isSelect();
        squareImageView.onSelect(bl2);
        squareImageView = Glide.with((View)object.itemView);
        object2 = ((PhotoItem)object2).getPath();
        object2 = squareImageView.load((String)object2);
        int n2 = this.size;
        object2 = (RequestBuilder)((RequestBuilder)object2.override(n2, n2)).centerCrop();
        String string2 = this.APP_VERSION;
        squareImageView = new ObjectKey((Object)string2);
        object2 = (RequestBuilder)object2.signature((Key)squareImageView);
        squareImageView = DiskCacheStrategy.NONE;
        object2 = (RequestBuilder)object2.diskCacheStrategy((DiskCacheStrategy)squareImageView);
        squareImageView = this.bitmapPlaceHolder;
        object2 = (RequestBuilder)object2.placeholder((Drawable)squareImageView);
        object = GalleryPickerAdabters$MyViewHolder.cfr_renamed_113(object);
        object2.into((ImageView)object);
    }

    public GalleryPickerAdabters$MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_gallery;
        viewGroup = layoutInflater.inflate(n2, viewGroup, false);
        GalleryPickerAdabters$MyViewHolder galleryPickerAdabters$MyViewHolder = new GalleryPickerAdabters$MyViewHolder(this, (View)viewGroup);
        return galleryPickerAdabters$MyViewHolder;
    }

    public void update(String string2) {
        boolean bl;
        this.paths.clear();
        Iterator iterator = this.all_paths.iterator();
        while (bl = iterator.hasNext()) {
            PhotoItem photoItem = (PhotoItem)iterator.next();
            Object object = photoItem.getFolder();
            boolean bl2 = ((String)object).equals(string2);
            if (!bl2) continue;
            object = this.paths;
            object.add(photoItem);
        }
        this.notifyDataSetChanged();
    }

    public void updateAll() {
        ArrayList arrayList = this.all_paths;
        if (arrayList != null && (arrayList = this.paths) != null) {
            arrayList.clear();
            List list = this.all_paths;
            this.paths = arrayList = new ArrayList(list);
            this.notifyDataSetChanged();
        }
    }

    public void updateNumbers(int n) {
        int n2;
        Object object = this.gallerySelectedList;
        if (object == null) {
            return;
        }
        while (n < (n2 = (object = this.gallerySelectedList).size())) {
            object = ((GallerySelected)this.gallerySelectedList.get(n)).getPhotoItem();
            if (object != null) {
                int n3 = ((PhotoItem)object).getNumber() + -1;
                ((PhotoItem)object).setNumber(n3);
                n2 = ((PhotoItem)object).getAdabter_pos();
                this.notifyItemChanged(n2);
            }
            ++n;
        }
    }
}

