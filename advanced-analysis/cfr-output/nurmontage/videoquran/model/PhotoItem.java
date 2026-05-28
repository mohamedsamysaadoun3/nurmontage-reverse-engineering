/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.model.GallerySelected;

public class PhotoItem {
    private int adabter_pos;
    private String folder;
    private GallerySelected gallerySelected;
    private boolean isSelect;
    private int number;
    private String path;

    public PhotoItem(String string2, String string3, boolean bl) {
        this.path = string3;
        this.isSelect = bl;
        this.folder = string2;
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

    public void setAdabter_pos(int n) {
        this.adabter_pos = n;
    }

    public void setFolder(String string2) {
        this.folder = string2;
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

