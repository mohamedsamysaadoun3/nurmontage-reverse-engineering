// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.model.GallerySelected;
import hazem.nurmontage.videoquran.model.VideoItem;
import hazem.nurmontage.videoquran.model.PhotoItem;

class GalleryPickerOneImage$2 implements GalleryPickerVideo$IPicker
{
    final /* synthetic */ GalleryPickerOneImage this$0;
    
    GalleryPickerOneImage$2(final GalleryPickerOneImage this$0) {
        this.this$0 = this$0;
    }
    
    public void onAdd(final PhotoItem photoItem, final int n) {
        GalleryPickerOneImage.-$$Nest$fputmPhotoItem(this.this$0, photoItem);
    }
    
    public void onAdd(final VideoItem videoItem, final int n) {
    }
    
    public void onDelete(final GallerySelected gallerySelected) {
    }
    
    public void onEmptyList() {
        GalleryPickerOneImage.-$$Nest$msetSetting(this.this$0, false);
    }
}
