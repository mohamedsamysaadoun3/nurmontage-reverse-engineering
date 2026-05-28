// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

public class GallerySelected
{
    private int index;
    private PhotoItem photoItem;
    private VideoItem videoItem;
    
    public GallerySelected(final PhotoItem photoItem, final int index) {
        this.photoItem = photoItem;
        this.index = index;
    }
    
    public GallerySelected(final VideoItem videoItem, final int index) {
        this.videoItem = videoItem;
        this.index = index;
    }
    
    public int getIndex() {
        return this.index;
    }
    
    public PhotoItem getPhotoItem() {
        return this.photoItem;
    }
    
    public VideoItem getVideoItem() {
        return this.videoItem;
    }
}
