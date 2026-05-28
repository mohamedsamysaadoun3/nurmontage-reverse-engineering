/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.model.GallerySelected;

public class VideoItem {
    private int adabter_pos;
    private String folderPath;
    private GallerySelected gallerySelected;
    private boolean isSelect;
    private int number;
    private String path;
    private String time;

    public VideoItem(String string2, String string3, String string4, boolean bl) {
        this.folderPath = string2;
        this.path = string3;
        this.time = string4;
        this.isSelect = bl;
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

    public void setAdabter_pos(int n) {
        this.adabter_pos = n;
    }

    public void setGallerySelected(GallerySelected gallerySelected) {
        this.gallerySelected = gallerySelected;
    }

    public void setNumber(int n) {
        this.number = n;
    }

    public void setSelect(boolean bl) {
        this.isSelect = bl;
    }
}

