/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.activity.OnBackPressedCallback
 *  androidx.recyclerview.widget.RecyclerView
 */
package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.GalleryPickerVideo;
import hazem.nurmontage.videoquran.common.Common;

class GalleryPickerVideo$1
extends OnBackPressedCallback {
    final /* synthetic */ GalleryPickerVideo this$0;

    GalleryPickerVideo$1(GalleryPickerVideo galleryPickerVideo, boolean bl) {
        this.this$0 = galleryPickerVideo;
        super(bl);
    }

    public void handleOnBackPressed() {
        int n;
        RecyclerView recyclerView = GalleryPickerVideo.cfr_renamed_141(this.this$0);
        if (recyclerView != null && (n = (recyclerView = GalleryPickerVideo.cfr_renamed_141(this.this$0)).getVisibility()) == 0) {
            GalleryPickerVideo.cfr_renamed_142(this.this$0).performClick();
            return;
        }
        Common.LIST_SELECT = null;
        Common.INDEX_LIST_SELECT = 1;
        this.this$0.finish();
    }
}

