// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

public class PhotoItem
{
    private int adabter_pos;
    private String folder;
    private GallerySelected gallerySelected;
    private boolean isSelect;
    private int number;
    private String path;
    
    public PhotoItem(final String folder, final String path, final boolean isSelect) {
        this.path = path;
        this.isSelect = isSelect;
        this.folder = folder;
    }
    
    public int getAdabter_pos() {
        return this.adabter_pos;
    }
    
    public String getFolder() {
        return this.folder;
    }
    
    public GallerySelected getGallerySelected() {
        return this.gallerySelected;
    }
    
    public int getNumber() {
        return this.number;
    }
    
    public String getPath() {
        return this.path;
    }
    
    public boolean isSelect() {
        return this.isSelect;
    }
    
    public void setAdabter_pos(final int adabter_pos) {
        this.adabter_pos = adabter_pos;
    }
    
    public void setFolder(final String folder) {
        this.folder = folder;
    }
    
    public void setGallerySelected(final GallerySelected gallerySelected) {
        this.gallerySelected = gallerySelected;
    }
    
    public void setNumber(final int number) {
        this.number = number;
    }
    
    public void setSelect(final boolean isSelect) {
        this.isSelect = isSelect;
    }
}
