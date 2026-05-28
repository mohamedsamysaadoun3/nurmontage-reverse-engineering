/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.model.PhotoItem;
import hazem.nurmontage.videoquran.model.VideoItem;

public class GallerySelected {
    private int index;
    private PhotoItem photoItem;
    private VideoItem videoItem;

    public GallerySelected(PhotoItem photoItem, int n) {
        this.photoItem = photoItem;
        this.index = n;
    }

    public GallerySelected(VideoItem videoItem, int n) {
        this.videoItem = videoItem;
        this.index = n;
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

