/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.recyclerview.widget.RecyclerView
 */
package hazem.nurmontage.videoquran;

import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.GalleryPickerVideo;
import hazem.nurmontage.videoquran.adabter.ExploreAdabters$IExplore;
import java.io.File;

class GalleryPickerVideo$3
implements ExploreAdabters$IExplore {
    final /* synthetic */ GalleryPickerVideo this$0;

    GalleryPickerVideo$3(GalleryPickerVideo galleryPickerVideo) {
        this.this$0 = galleryPickerVideo;
    }

    public void done() {
        int n;
        RecyclerView recyclerView = GalleryPickerVideo.cfr_renamed_141(this.this$0);
        int n2 = recyclerView.getVisibility();
        if (n2 != (n = 4)) {
            recyclerView = GalleryPickerVideo.cfr_renamed_141(this.this$0);
            recyclerView.setVisibility(n);
        }
    }

    public void folder(File file, String string2, String string3) {
        int n;
        file = GalleryPickerVideo.cfr_renamed_141(this.this$0);
        int n2 = file.getVisibility();
        if (n2 != (n = 4)) {
            file = GalleryPickerVideo.cfr_renamed_141(this.this$0);
            file.setVisibility(n);
        }
        this.this$0.changeFolder(string3);
        GalleryPickerVideo.cfr_renamed_142(this.this$0).setText(string2);
    }
}

