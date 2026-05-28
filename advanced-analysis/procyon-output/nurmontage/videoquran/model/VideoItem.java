// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

public class VideoItem
{
    private int adabter_pos;
    private String folderPath;
    private GallerySelected gallerySelected;
    private boolean isSelect;
    private int number;
    private String path;
    private String time;
    
    public VideoItem(final String folderPath, final String path, final String time, final boolean isSelect) {
        this.folderPath = folderPath;
        this.path = path;
        this.time = time;
        this.isSelect = isSelect;
    }
    
    public int getAdabter_pos() {
        return this.adabter_pos;
    }
    
    public String getFolderPath() {
        return this.folderPath;
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
    
    public String getTime() {
        return this.time;
    }
    
    public boolean isSelect() {
        return this.isSelect;
    }
    
    public void setAdabter_pos(final int adabter_pos) {
        this.adabter_pos = adabter_pos;
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
