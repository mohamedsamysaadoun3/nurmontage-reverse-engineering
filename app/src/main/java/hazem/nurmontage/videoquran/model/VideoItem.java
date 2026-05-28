package hazem.nurmontage.videoquran.model;

/* loaded from: classes2.dex */
public class VideoItem {
    private int adabter_pos;
    private String folderPath;
    private GallerySelected gallerySelected;
    private boolean isSelect;
    private int number;
    private String path;
    private String time;

    public void setAdabter_pos(int value) {
        this.adabter_pos = value;
    }

    public int getAdabter_pos() {
        return this.adabter_pos;
    }

    public void setNumber(int value) {
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

    public VideoItem(String str, String str2, String textValue3, boolean isSelected) {
        this.folderPath = str;
        this.path = str2;
        this.time = textValue3;
        this.isSelect = isSelected;
    }

    public String getFolderPath() {
        return this.folderPath;
    }

    public String getPath() {
        return this.path;
    }

    public String getTime() {
        return this.time;
    }
}
