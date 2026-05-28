/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.GalleryPickerVideo;
import hazem.nurmontage.videoquran.GalleryPickerVideo$IPicker;
import hazem.nurmontage.videoquran.model.GallerySelected;
import hazem.nurmontage.videoquran.model.PhotoItem;
import hazem.nurmontage.videoquran.model.VideoItem;

class GalleryPickerVideo$2
implements GalleryPickerVideo$IPicker {
    final /* synthetic */ GalleryPickerVideo this$0;

    GalleryPickerVideo$2(GalleryPickerVideo galleryPickerVideo) {
        this.this$0 = galleryPickerVideo;
    }

    public void onAdd(PhotoItem photoItem, int n) {
    }

    public void onAdd(VideoItem videoItem, int n) {
        GalleryPickerVideo.cfr_renamed_299(this.this$0, videoItem);
    }

    public void onDelete(GallerySelected gallerySelected) {
    }

    public void onEmptyList() {
    }
}

