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
import hazem.nurmontage.videoquran.adabter.GalleryVideoAdabters$MyViewHolder;
import hazem.nurmontage.videoquran.model.GallerySelected;
import hazem.nurmontage.videoquran.model.PhotoItem;
import hazem.nurmontage.videoquran.model.VideoItem;
import hazem.nurmontage.videoquran.views.SquareImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GalleryVideoAdabters
extends RecyclerView.Adapter {
    private final String APP_VERSION;
    private List all_videoItems;
    private BitmapDrawable bitmapPlaceHolder;
    private final List gallerySelectedList;
    private GalleryPickerVideo$IPicker iPicker;
    private final int size;
    private VideoItem videoItem_select;
    private List videoItems;

    static /* bridge */ /* synthetic */ List cfr_renamed_312(GalleryVideoAdabters galleryVideoAdabters) {
        return galleryVideoAdabters.gallerySelectedList;
    }

    static /* bridge */ /* synthetic */ GalleryPickerVideo$IPicker cfr_renamed_278(GalleryVideoAdabters galleryVideoAdabters) {
        return galleryVideoAdabters.iPicker;
    }

    static /* bridge */ /* synthetic */ VideoItem cfr_renamed_352(GalleryVideoAdabters galleryVideoAdabters) {
        return galleryVideoAdabters.videoItem_select;
    }

    static /* bridge */ /* synthetic */ List cfr_renamed_353(GalleryVideoAdabters galleryVideoAdabters) {
        return galleryVideoAdabters.videoItems;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_354(GalleryVideoAdabters galleryVideoAdabters, VideoItem videoItem) {
        galleryVideoAdabters.videoItem_select = videoItem;
    }

    public GalleryVideoAdabters(String string2, Resources resources, List list, int n, GalleryPickerVideo$IPicker galleryPickerVideo$IPicker) {
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
        this.videoItems = object;
        GalleryPickerVideo$IPicker galleryPickerVideo$IPicker = this.iPicker;
        if (galleryPickerVideo$IPicker != null && (object == null || (bl = object.isEmpty()))) {
            object = this.iPicker;
            object.onEmptyList();
        }
    }

    public void clear() {
        List list = this.videoItems;
        if (list != null) {
            list.clear();
        }
    }

    public void doneItems(List list) {
        ArrayList arrayList;
        this.videoItems = list;
        this.all_videoItems = arrayList = new ArrayList(list);
    }

    public int getItemCount() {
        List list = this.videoItems;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void inselectItem(int n) {
        Object object = this.videoItems;
        int n2 = object.size();
        if (n >= n2) {
            return;
        }
        object = (VideoItem)this.videoItems.get(n);
        ((VideoItem)object).setSelect(false);
        this.notifyItemChanged(n);
        n = ((VideoItem)object).getNumber();
        this.updateNumbers(n);
    }

    public void onBindViewHolder(GalleryVideoAdabters$MyViewHolder object, int n) {
        Object object2 = (VideoItem)this.videoItems.get(n);
        SquareImageView squareImageView = GalleryVideoAdabters$MyViewHolder.cfr_renamed_113(object);
        int n2 = ((VideoItem)object2).getNumber();
        squareImageView.setNumber(n2);
        squareImageView = GalleryVideoAdabters$MyViewHolder.cfr_renamed_113(object);
        n2 = ((VideoItem)object2).isSelect() ? 1 : 0;
        squareImageView.onSelect(n2 != 0);
        squareImageView = Glide.with((View)object.itemView);
        Object object3 = ((VideoItem)object2).getPath();
        squareImageView = squareImageView.load((String)object3);
        n2 = this.size;
        squareImageView = (RequestBuilder)((RequestBuilder)squareImageView.override(n2, n2)).centerCrop();
        String string2 = this.APP_VERSION;
        object3 = new ObjectKey((Object)string2);
        squareImageView = (RequestBuilder)squareImageView.signature((Key)object3);
        object3 = DiskCacheStrategy.NONE;
        squareImageView = (RequestBuilder)squareImageView.diskCacheStrategy((DiskCacheStrategy)object3);
        object3 = this.bitmapPlaceHolder;
        squareImageView = (RequestBuilder)squareImageView.placeholder((Drawable)object3);
        object3 = GalleryVideoAdabters$MyViewHolder.cfr_renamed_113(object);
        squareImageView.into((ImageView)object3);
        object = GalleryVideoAdabters$MyViewHolder.cfr_renamed_332(object);
        object2 = ((VideoItem)object2).getTime();
        object.setText((CharSequence)object2);
    }

    public GalleryVideoAdabters$MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n2 = R$layout.row_gallery;
        viewGroup = layoutInflater.inflate(n2, viewGroup, false);
        GalleryVideoAdabters$MyViewHolder galleryVideoAdabters$MyViewHolder = new GalleryVideoAdabters$MyViewHolder(this, (View)viewGroup);
        return galleryVideoAdabters$MyViewHolder;
    }

    public void setFolder(String string2) {
        this.notifyDataSetChanged();
    }

    public void update(String string2) {
        boolean bl;
        this.videoItems.clear();
        Iterator iterator = this.all_videoItems.iterator();
        while (bl = iterator.hasNext()) {
            VideoItem videoItem = (VideoItem)iterator.next();
            Object object = videoItem.getFolderPath();
            boolean bl2 = ((String)object).equals(string2);
            if (!bl2) continue;
            object = this.videoItems;
            object.add(videoItem);
        }
        this.notifyDataSetChanged();
    }

    public void updateAll() {
        ArrayList arrayList = this.all_videoItems;
        if (arrayList != null && (arrayList = this.videoItems) != null) {
            arrayList.clear();
            List list = this.all_videoItems;
            this.videoItems = arrayList = new ArrayList(list);
            this.notifyDataSetChanged();
        }
    }

    public void updateNumbers(int n) {
        Object object;
        int n2;
        while (n < (n2 = (object = this.gallerySelectedList).size())) {
            int n3;
            object = (GallerySelected)this.gallerySelectedList.get(n);
            VideoItem videoItem = ((GallerySelected)object).getVideoItem();
            if (videoItem != null) {
                int n4 = videoItem.getNumber() + -1;
                videoItem.setNumber(n4);
                n3 = videoItem.getAdabter_pos();
                this.notifyItemChanged(n3);
            }
            if ((object = ((GallerySelected)object).getPhotoItem()) != null) {
                n3 = ((PhotoItem)object).getNumber() + -1;
                ((PhotoItem)object).setNumber(n3);
            }
            ++n;
        }
    }
}

