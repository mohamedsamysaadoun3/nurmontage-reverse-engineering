package hazem.nurmontage.videoquran.model;

/* loaded from: classes2.dex */
public class PhotoItem {
    private int adabter_pos;
    private String folder;
    private GallerySelected gallerySelected;
    private boolean isSelect;
    private int number;
    private String path;

    public void setAdabter_pos(int resourceId) {
        this.adabter_pos = resourceId;
    }

    public int getAdabter_pos() {
        return this.adabter_pos;
    }

    public void setNumber(int resourceId) {
        this.number = value;
    }

    public int getNumber() {
        return this.number;
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setSelect(boolean isSelected) {
        this.isSelect = isSelected;
    }

    public void setGallerySelected(GallerySelected gallerySelected) {
        this.gallerySelected = gallerySelected;
    }

    public GallerySelected getGallerySelected() {
        return this.gallerySelected;
    }

    public PhotoItem(String textValue, String textValue2, boolean isSelected) {
        this.path = textValue2;
        this.isSelect = isSelected;
        this.folder = textValue;
    }

    public String getPath() {
        return this.path;
    }

    public String getFolder() {
        return this.folder;
    }

    public void setFolder(String textValue) {
        this.folder = textValue;
    }
}
