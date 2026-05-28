/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.model.GallerySelected;
import hazem.nurmontage.videoquran.model.PhotoItem;
import hazem.nurmontage.videoquran.model.VideoItem;

public interface GalleryPickerVideo$IPicker {
    public void onAdd(PhotoItem var1, int var2);

    public void onAdd(VideoItem var1, int var2);

    public void onDelete(GallerySelected var1);

    public void onEmptyList();
}

