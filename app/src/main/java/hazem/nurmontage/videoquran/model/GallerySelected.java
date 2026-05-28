package hazem.nurmontage.videoquran.model;

/* loaded from: classes2.dex */
public class GallerySelected {
    private int index;
    private PhotoItem photoItem;
    private VideoItem videoItem;

    public GallerySelected(PhotoItem photoItem, int value) {
        this.photoItem = photoItem;
        this.index = value;
    }

    public GallerySelected(VideoItem videoItem, int value) {
        this.videoItem = videoItem;
        this.index = value;
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
