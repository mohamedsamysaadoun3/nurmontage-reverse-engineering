// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.R$layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.Glide;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import hazem.nurmontage.videoquran.model.GallerySelected;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.util.ArrayList;
import android.content.res.Resources;
import java.util.List;
import android.graphics.drawable.BitmapDrawable;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class GallerySelctedAdabters extends RecyclerView$Adapter
{
    private BitmapDrawable bitmapPlaceHolder;
    private final List gallerySelecteds;
    private GallerySelctedAdabters$IGallerySelected iGallerySelected;
    private final int size;
    
    public GallerySelctedAdabters(final Resources resources, final GallerySelctedAdabters$IGallerySelected iGallerySelected, final int size) {
        this.gallerySelecteds = new ArrayList();
        this.size = size;
        this.iGallerySelected = iGallerySelected;
        final Bitmap bitmap = Bitmap.createBitmap(size, size, Bitmap$Config.RGB_565);
        bitmap.eraseColor(-16777216);
        this.bitmapPlaceHolder = new BitmapDrawable(resources, bitmap);
    }
    
    public void addItemPhoto(final GallerySelected gallerySelected) {
        this.gallerySelecteds.add(gallerySelected);
        gallerySelected.getPhotoItem().setGallerySelected(gallerySelected);
        this.notifyItemInserted(this.gallerySelecteds.size() - 1);
    }
    
    public void addItemVideo(final GallerySelected gallerySelected) {
        this.gallerySelecteds.add(gallerySelected);
        gallerySelected.getVideoItem().setGallerySelected(gallerySelected);
        this.notifyItemInserted(this.gallerySelecteds.size() - 1);
    }
    
    public void deletedItem(final int n) {
        this.gallerySelecteds.remove(n);
        this.notifyItemRemoved(n);
    }
    
    public void deletedItem(final GallerySelected gallerySelected) {
        final int index = this.gallerySelecteds.indexOf(gallerySelected);
        if (index != -1) {
            this.gallerySelecteds.remove(index);
            this.notifyItemRemoved(index);
        }
    }
    
    public List getGallerySelecteds() {
        return this.gallerySelecteds;
    }
    
    public int getItemCount() {
        final List gallerySelecteds = this.gallerySelecteds;
        if (gallerySelecteds != null) {
            return gallerySelecteds.size();
        }
        return 0;
    }
    
    public int getSize() {
        return this.size;
    }
    
    public void onBindViewHolder(final GallerySelctedAdabters$MyViewHolder gallerySelctedAdabters$MyViewHolder, final int n) {
        String s;
        if (this.gallerySelecteds.get(n).getVideoItem() != null) {
            s = this.gallerySelecteds.get(n).getVideoItem().getPath();
            GallerySelctedAdabters$MyViewHolder.-$$Nest$fgettv_time(gallerySelctedAdabters$MyViewHolder).setVisibility(0);
            GallerySelctedAdabters$MyViewHolder.-$$Nest$fgettv_time(gallerySelctedAdabters$MyViewHolder).setText((CharSequence)this.gallerySelecteds.get(n).getVideoItem().getTime());
        }
        else {
            s = this.gallerySelecteds.get(n).getPhotoItem().getPath();
            GallerySelctedAdabters$MyViewHolder.-$$Nest$fgettv_time(gallerySelctedAdabters$MyViewHolder).setVisibility(8);
        }
        final RequestBuilder load = Glide.with(gallerySelctedAdabters$MyViewHolder.itemView).load(s);
        final int size = this.size;
        ((RequestBuilder)((RequestBuilder)((RequestBuilder)load.override(size, size)).centerCrop()).placeholder((Drawable)this.bitmapPlaceHolder)).into((ImageView)GallerySelctedAdabters$MyViewHolder.-$$Nest$fgetimageView(gallerySelctedAdabters$MyViewHolder));
    }
    
    public GallerySelctedAdabters$MyViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new GallerySelctedAdabters$MyViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.row_gallery_select, viewGroup, false));
    }
}
