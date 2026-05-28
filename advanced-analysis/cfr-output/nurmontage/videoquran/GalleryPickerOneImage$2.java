/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.GalleryPickerOneImage;
import hazem.nurmontage.videoquran.GalleryPickerVideo$IPicker;
import hazem.nurmontage.videoquran.model.GallerySelected;
import hazem.nurmontage.videoquran.model.PhotoItem;
import hazem.nurmontage.videoquran.model.VideoItem;

class GalleryPickerOneImage$2
implements GalleryPickerVideo$IPicker {
    final /* synthetic */ GalleryPickerOneImage this$0;

    GalleryPickerOneImage$2(GalleryPickerOneImage galleryPickerOneImage) {
        this.this$0 = galleryPickerOneImage;
    }

    public void onAdd(PhotoItem photoItem, int n) {
        GalleryPickerOneImage.cfr_renamed_407(this.this$0, photoItem);
    }

    public void onAdd(VideoItem videoItem, int n) {
    }

    public void onDelete(GallerySelected gallerySelected) {
    }

    public void onEmptyList() {
        GalleryPickerOneImage.cfr_renamed_408(this.this$0, false);
    }
}

