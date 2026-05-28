// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import java.util.List;
import hazem.nurmontage.videoquran.model.PhotoItem;
import android.view.View;
import android.view.View$OnClickListener;

class GalleryPickerAdabters$MyViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ GalleryPickerAdabters$MyViewHolder this$1;
    final /* synthetic */ GalleryPickerAdabters val$this$0;
    
    GalleryPickerAdabters$MyViewHolder$1(final GalleryPickerAdabters$MyViewHolder this$1, final GalleryPickerAdabters val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        if (GalleryPickerAdabters.-$$Nest$fgetiPicker(this.this$1.this$0) != null) {
            if (this.this$1.getAdapterPosition() >= 0) {
                final List -$$Nest$fgetgallerySelectedList = GalleryPickerAdabters.-$$Nest$fgetgallerySelectedList(this.this$1.this$0);
                final int select = 1;
                if (-$$Nest$fgetgallerySelectedList == null) {
                    final PhotoItem photoItem = GalleryPickerAdabters.-$$Nest$fgetpaths(this.this$1.this$0).get(this.this$1.getAdapterPosition());
                    if (photoItem == GalleryPickerAdabters.-$$Nest$fgetphotoItem_selected(this.this$1.this$0)) {
                        return;
                    }
                    if (GalleryPickerAdabters.-$$Nest$fgetphotoItem_selected(this.this$1.this$0) != null) {
                        GalleryPickerAdabters.-$$Nest$fgetphotoItem_selected(this.this$1.this$0).setSelect(false);
                        this.this$1.this$0.notifyItemChanged(GalleryPickerAdabters.-$$Nest$fgetphotoItem_selected(this.this$1.this$0).getAdabter_pos());
                    }
                    photoItem.setSelect((boolean)(select != 0));
                    GalleryPickerAdabters$MyViewHolder.-$$Nest$fgetimageView(this.this$1).onSelect((boolean)(select != 0));
                    GalleryPickerAdabters.-$$Nest$fputphotoItem_selected(this.this$1.this$0, photoItem);
                    photoItem.setAdabter_pos(this.this$1.getAdapterPosition());
                    GalleryPickerAdabters.-$$Nest$fgetiPicker(this.this$1.this$0).onAdd(photoItem, this.this$1.getAdapterPosition());
                }
                else {
                    final PhotoItem photoItem2 = GalleryPickerAdabters.-$$Nest$fgetpaths(this.this$1.this$0).get(this.this$1.getAdapterPosition());
                    photoItem2.setSelect((boolean)(((photoItem2.isSelect() ? 1 : 0) ^ select) != 0x0));
                    GalleryPickerAdabters$MyViewHolder.-$$Nest$fgetimageView(this.this$1).onSelect(photoItem2.isSelect());
                    if (photoItem2.isSelect()) {
                        GalleryPickerAdabters$MyViewHolder.-$$Nest$fgetimageView(this.this$1).setNumber(GalleryPickerAdabters.-$$Nest$fgetgallerySelectedList(this.this$1.this$0).size() + select);
                        photoItem2.setNumber(GalleryPickerAdabters$MyViewHolder.-$$Nest$fgetimageView(this.this$1).getAnInt());
                        photoItem2.setAdabter_pos(this.this$1.getAdapterPosition());
                        GalleryPickerAdabters.-$$Nest$fgetiPicker(this.this$1.this$0).onAdd(photoItem2, this.this$1.getAdapterPosition());
                        return;
                    }
                    this.this$1.this$0.updateNumbers(GalleryPickerAdabters$MyViewHolder.-$$Nest$fgetimageView(this.this$1).getAnInt());
                    GalleryPickerAdabters.-$$Nest$fgetiPicker(this.this$1.this$0).onDelete(photoItem2.getGallerySelected());
                }
            }
        }
    }
}
