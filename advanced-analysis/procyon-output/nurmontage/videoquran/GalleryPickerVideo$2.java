// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.model.GallerySelected;
import hazem.nurmontage.videoquran.model.VideoItem;
import hazem.nurmontage.videoquran.model.PhotoItem;

class GalleryPickerVideo$2 implements GalleryPickerVideo$IPicker
{
    final /* synthetic */ GalleryPickerVideo this$0;
    
    GalleryPickerVideo$2(final GalleryPickerVideo this$0) {
        this.this$0 = this$0;
    }
    
    public void onAdd(final PhotoItem photoItem, final int n) {
    }
    
    public void onAdd(final VideoItem videoItem, final int n) {
        GalleryPickerVideo.-$$Nest$fputvideoItem(this.this$0, videoItem);
    }
    
    public void onDelete(final GallerySelected gallerySelected) {
    }
    
    public void onEmptyList() {
    }
}
