// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import hazem.nurmontage.videoquran.model.GallerySelected;
import android.view.View;
import android.view.View$OnClickListener;

class GallerySelctedAdabters$MyViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ GallerySelctedAdabters$MyViewHolder this$1;
    final /* synthetic */ GallerySelctedAdabters val$this$0;
    
    GallerySelctedAdabters$MyViewHolder$1(final GallerySelctedAdabters$MyViewHolder this$1, final GallerySelctedAdabters val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        final GallerySelected gallerySelected = GallerySelctedAdabters.-$$Nest$fgetgallerySelecteds(this.this$1.this$0).get(this.this$1.getAdapterPosition());
        this.this$1.this$0.deletedItem(this.this$1.getAdapterPosition());
        if (gallerySelected.getVideoItem() != null) {
            GallerySelctedAdabters.-$$Nest$fgetiGallerySelected(this.this$1.this$0).inselectVideo(gallerySelected.getIndex());
        }
        else {
            GallerySelctedAdabters.-$$Nest$fgetiGallerySelected(this.this$1.this$0).inselectPhoto(gallerySelected.getIndex());
        }
    }
}
