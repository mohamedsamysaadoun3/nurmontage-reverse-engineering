// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.model.PhotoItem;
import hazem.nurmontage.videoquran.model.GallerySelected;
import java.util.Iterator;
import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.Glide;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.Collection;
import java.util.ArrayList;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.content.res.Resources;
import hazem.nurmontage.videoquran.model.VideoItem;
import hazem.nurmontage.videoquran.GalleryPickerVideo$IPicker;
import android.graphics.drawable.BitmapDrawable;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class GalleryVideoAdabters extends RecyclerView$Adapter
{
    private final String APP_VERSION;
    private List all_videoItems;
    private BitmapDrawable bitmapPlaceHolder;
    private final List gallerySelectedList;
    private GalleryPickerVideo$IPicker iPicker;
    private final int size;
    private VideoItem videoItem_select;
    private List videoItems;
    
    public GalleryVideoAdabters(final String app_VERSION, final Resources resources, final List gallerySelectedList, final int size, final GalleryPickerVideo$IPicker iPicker) {
        this.size = size;
        this.APP_VERSION = app_VERSION;
        this.iPicker = iPicker;
        this.gallerySelectedList = gallerySelectedList;
        final Bitmap bitmap = Bitmap.createBitmap(size, size, Bitmap$Config.RGB_565);
        bitmap.eraseColor(-16777216);
        this.bitmapPlaceHolder = new BitmapDrawable(resources, bitmap);
    }
    
    public void addItems(final List videoItems) {
        this.videoItems = videoItems;
        if (this.iPicker != null && (videoItems == null || videoItems.isEmpty())) {
            this.iPicker.onEmptyList();
        }
    }
    
    public void clear() {
        final List videoItems = this.videoItems;
        if (videoItems != null) {
            videoItems.clear();
        }
    }
    
    public void doneItems(final List list) {
        this.videoItems = list;
        this.all_videoItems = new ArrayList(list);
    }
    
    public int getItemCount() {
        final List videoItems = this.videoItems;
        if (videoItems != null) {
            return videoItems.size();
        }
        return 0;
    }
    
    public void inselectItem(int number) {
        if (number >= this.videoItems.size()) {
            return;
        }
        final VideoItem videoItem = this.videoItems.get(number);
        videoItem.setSelect(false);
        this.notifyItemChanged(number);
        number = videoItem.getNumber();
        this.updateNumbers(number);
    }
    
    public void onBindViewHolder(final GalleryVideoAdabters$MyViewHolder galleryVideoAdabters$MyViewHolder, final int n) {
        final VideoItem videoItem = this.videoItems.get(n);
        GalleryVideoAdabters$MyViewHolder.-$$Nest$fgetimageView(galleryVideoAdabters$MyViewHolder).setNumber(videoItem.getNumber());
        GalleryVideoAdabters$MyViewHolder.-$$Nest$fgetimageView(galleryVideoAdabters$MyViewHolder).onSelect(videoItem.isSelect());
        final RequestBuilder load = Glide.with(galleryVideoAdabters$MyViewHolder.itemView).load(videoItem.getPath());
        final int size = this.size;
        ((RequestBuilder)((RequestBuilder)((RequestBuilder)((RequestBuilder)((RequestBuilder)load.override(size, size)).centerCrop()).signature((Key)new ObjectKey((Object)this.APP_VERSION))).diskCacheStrategy(DiskCacheStrategy.NONE)).placeholder((Drawable)this.bitmapPlaceHolder)).into((ImageView)GalleryVideoAdabters$MyViewHolder.-$$Nest$fgetimageView(galleryVideoAdabters$MyViewHolder));
        GalleryVideoAdabters$MyViewHolder.-$$Nest$fgettv_time(galleryVideoAdabters$MyViewHolder).setText((CharSequence)videoItem.getTime());
    }
    
    public GalleryVideoAdabters$MyViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new GalleryVideoAdabters$MyViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_gallery, viewGroup, false));
    }
    
    public void setFolder(final String s) {
        this.notifyDataSetChanged();
    }
    
    public void update(final String anObject) {
        this.videoItems.clear();
        for (final VideoItem videoItem : this.all_videoItems) {
            if (videoItem.getFolderPath().equals(anObject)) {
                this.videoItems.add(videoItem);
            }
        }
        this.notifyDataSetChanged();
    }
    
    public void updateAll() {
        if (this.all_videoItems != null) {
            final List videoItems = this.videoItems;
            if (videoItems != null) {
                videoItems.clear();
                this.videoItems = new ArrayList(this.all_videoItems);
                this.notifyDataSetChanged();
            }
        }
    }
    
    public void updateNumbers(int i) {
        while (i < this.gallerySelectedList.size()) {
            final GallerySelected gallerySelected = this.gallerySelectedList.get(i);
            final VideoItem videoItem = gallerySelected.getVideoItem();
            if (videoItem != null) {
                videoItem.setNumber(videoItem.getNumber() - 1);
                this.notifyItemChanged(videoItem.getAdabter_pos());
            }
            final PhotoItem photoItem = gallerySelected.getPhotoItem();
            if (photoItem != null) {
                photoItem.setNumber(photoItem.getNumber() - 1);
            }
            ++i;
        }
    }
}
