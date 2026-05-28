// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

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
import hazem.nurmontage.videoquran.model.PhotoItem;
import hazem.nurmontage.videoquran.GalleryPickerVideo$IPicker;
import android.graphics.drawable.BitmapDrawable;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class GalleryPickerAdabters extends RecyclerView$Adapter
{
    private String APP_VERSION;
    private List all_paths;
    private BitmapDrawable bitmapPlaceHolder;
    private final List gallerySelectedList;
    private GalleryPickerVideo$IPicker iPicker;
    private List paths;
    private PhotoItem photoItem_selected;
    private final int size;
    
    public GalleryPickerAdabters(final String app_VERSION, final Resources resources, final List gallerySelectedList, final int size, final GalleryPickerVideo$IPicker iPicker) {
        this.size = size;
        this.APP_VERSION = app_VERSION;
        this.iPicker = iPicker;
        this.gallerySelectedList = gallerySelectedList;
        final Bitmap bitmap = Bitmap.createBitmap(size, size, Bitmap$Config.RGB_565);
        bitmap.eraseColor(-16777216);
        this.bitmapPlaceHolder = new BitmapDrawable(resources, bitmap);
    }
    
    public void addItems(final List paths) {
        this.paths = paths;
        if (this.iPicker != null && (paths == null || paths.isEmpty())) {
            this.iPicker.onEmptyList();
        }
    }
    
    public void clear() {
        final List paths = this.paths;
        if (paths != null) {
            paths.clear();
        }
    }
    
    public void doneItems(final List list) {
        this.paths = list;
        this.all_paths = new ArrayList(list);
    }
    
    public int getItemCount() {
        final List paths = this.paths;
        if (paths != null) {
            return paths.size();
        }
        return 0;
    }
    
    public void inselectItem(int number) {
        if (number >= this.paths.size()) {
            return;
        }
        final PhotoItem photoItem = this.paths.get(number);
        photoItem.setSelect(false);
        this.notifyItemChanged(number);
        number = photoItem.getNumber();
        this.updateNumbers(number);
    }
    
    public void onBindViewHolder(final GalleryPickerAdabters$MyViewHolder galleryPickerAdabters$MyViewHolder, final int n) {
        final PhotoItem photoItem = this.paths.get(n);
        GalleryPickerAdabters$MyViewHolder.-$$Nest$fgetimageView(galleryPickerAdabters$MyViewHolder).setNumber(photoItem.getNumber());
        GalleryPickerAdabters$MyViewHolder.-$$Nest$fgetimageView(galleryPickerAdabters$MyViewHolder).onSelect(photoItem.isSelect());
        final RequestBuilder load = Glide.with(galleryPickerAdabters$MyViewHolder.itemView).load(photoItem.getPath());
        final int size = this.size;
        ((RequestBuilder)((RequestBuilder)((RequestBuilder)((RequestBuilder)((RequestBuilder)load.override(size, size)).centerCrop()).signature((Key)new ObjectKey((Object)this.APP_VERSION))).diskCacheStrategy(DiskCacheStrategy.NONE)).placeholder((Drawable)this.bitmapPlaceHolder)).into((ImageView)GalleryPickerAdabters$MyViewHolder.-$$Nest$fgetimageView(galleryPickerAdabters$MyViewHolder));
    }
    
    public GalleryPickerAdabters$MyViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new GalleryPickerAdabters$MyViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_gallery, viewGroup, false));
    }
    
    public void update(final String anObject) {
        this.paths.clear();
        for (final PhotoItem photoItem : this.all_paths) {
            if (photoItem.getFolder().equals(anObject)) {
                this.paths.add(photoItem);
            }
        }
        this.notifyDataSetChanged();
    }
    
    public void updateAll() {
        if (this.all_paths != null) {
            final List paths = this.paths;
            if (paths != null) {
                paths.clear();
                this.paths = new ArrayList(this.all_paths);
                this.notifyDataSetChanged();
            }
        }
    }
    
    public void updateNumbers(int i) {
        if (this.gallerySelectedList == null) {
            return;
        }
        while (i < this.gallerySelectedList.size()) {
            final PhotoItem photoItem = this.gallerySelectedList.get(i).getPhotoItem();
            if (photoItem != null) {
                photoItem.setNumber(photoItem.getNumber() - 1);
                this.notifyItemChanged(photoItem.getAdabter_pos());
            }
            ++i;
        }
    }
}
