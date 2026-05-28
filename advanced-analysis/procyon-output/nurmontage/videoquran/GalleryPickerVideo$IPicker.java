// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.model.GallerySelected;
import hazem.nurmontage.videoquran.model.VideoItem;
import hazem.nurmontage.videoquran.model.PhotoItem;

public interface GalleryPickerVideo$IPicker
{
    void onAdd(final PhotoItem p0, final int p1);
    
    void onAdd(final VideoItem p0, final int p1);
    
    void onDelete(final GallerySelected p0);
    
    void onEmptyList();
}
