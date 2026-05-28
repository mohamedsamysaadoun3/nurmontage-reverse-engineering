// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

import java.util.List;
import hazem.nurmontage.videoquran.model.VideoItem;
import android.view.View;
import android.view.View$OnClickListener;

class GalleryVideoAdabters$MyViewHolder$1 implements View$OnClickListener
{
    final /* synthetic */ GalleryVideoAdabters$MyViewHolder this$1;
    final /* synthetic */ GalleryVideoAdabters val$this$0;
    
    GalleryVideoAdabters$MyViewHolder$1(final GalleryVideoAdabters$MyViewHolder this$1, final GalleryVideoAdabters val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
    }
    
    public void onClick(final View view) {
        if (GalleryVideoAdabters.-$$Nest$fgetiPicker(this.this$1.this$0) != null) {
            if (this.this$1.getAdapterPosition() >= 0) {
                final List -$$Nest$fgetgallerySelectedList = GalleryVideoAdabters.-$$Nest$fgetgallerySelectedList(this.this$1.this$0);
                final int select = 1;
                if (-$$Nest$fgetgallerySelectedList == null) {
                    final VideoItem videoItem = GalleryVideoAdabters.-$$Nest$fgetvideoItems(this.this$1.this$0).get(this.this$1.getAdapterPosition());
                    if (videoItem == GalleryVideoAdabters.-$$Nest$fgetvideoItem_select(this.this$1.this$0)) {
                        return;
                    }
                    if (GalleryVideoAdabters.-$$Nest$fgetvideoItem_select(this.this$1.this$0) != null) {
                        GalleryVideoAdabters.-$$Nest$fgetvideoItem_select(this.this$1.this$0).setSelect(false);
                        this.this$1.this$0.notifyItemChanged(GalleryVideoAdabters.-$$Nest$fgetvideoItem_select(this.this$1.this$0).getAdabter_pos());
                    }
                    GalleryVideoAdabters.-$$Nest$fputvideoItem_select(this.this$1.this$0, videoItem);
                    videoItem.setSelect((boolean)(select != 0));
                    GalleryVideoAdabters$MyViewHolder.-$$Nest$fgetimageView(this.this$1).onSelect((boolean)(select != 0));
                    videoItem.setAdabter_pos(this.this$1.getAdapterPosition());
                    GalleryVideoAdabters.-$$Nest$fgetiPicker(this.this$1.this$0).onAdd(videoItem, this.this$1.getAdapterPosition());
                }
                else {
                    final VideoItem videoItem2 = GalleryVideoAdabters.-$$Nest$fgetvideoItems(this.this$1.this$0).get(this.this$1.getAdapterPosition());
                    videoItem2.setSelect((boolean)(((videoItem2.isSelect() ? 1 : 0) ^ select) != 0x0));
                    GalleryVideoAdabters$MyViewHolder.-$$Nest$fgetimageView(this.this$1).onSelect(videoItem2.isSelect());
                    if (videoItem2.isSelect()) {
                        GalleryVideoAdabters$MyViewHolder.-$$Nest$fgetimageView(this.this$1).setNumber(GalleryVideoAdabters.-$$Nest$fgetgallerySelectedList(this.this$1.this$0).size() + select);
                        videoItem2.setNumber(GalleryVideoAdabters$MyViewHolder.-$$Nest$fgetimageView(this.this$1).getAnInt());
                        videoItem2.setAdabter_pos(this.this$1.getAdapterPosition());
                        GalleryVideoAdabters.-$$Nest$fgetiPicker(this.this$1.this$0).onAdd(videoItem2, this.this$1.getAdapterPosition());
                        return;
                    }
                    this.this$1.this$0.updateNumbers(GalleryVideoAdabters$MyViewHolder.-$$Nest$fgetimageView(this.this$1).getAnInt());
                    GalleryVideoAdabters.-$$Nest$fgetiPicker(this.this$1.this$0).onDelete(videoItem2.getGallerySelected());
                }
            }
        }
    }
}
