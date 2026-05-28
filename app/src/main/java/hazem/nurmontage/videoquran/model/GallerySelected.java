package hazem.nurmontage.videoquran.model;

/* loaded from: classes2.dex */
public class GallerySelected {
    private int index;
    private PhotoItem photoItem;
    private VideoItem videoItem;

    public GallerySelected(PhotoItem photoItem, int index0) {
        this.photoItem = photoItem;
        this.index = index0;
    }

    public GallerySelected(VideoItem videoItem, int resourceId) {
        this.videoItem = videoItem;
        this.index = resourceId;
    }

    public VideoItem getVideoItem() {
        return this.videoItem;
    }

    public PhotoItem getPhotoItem() {
        return this.photoItem;
    }

    public int getIndex() {
        return this.index;
    }
}
