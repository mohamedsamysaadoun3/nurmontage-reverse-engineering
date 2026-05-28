/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.recyclerview.widget.RecyclerView
 */
package hazem.nurmontage.videoquran;

import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.GalleryPickerOneImage;
import hazem.nurmontage.videoquran.adabter.ExploreAdabters$IExplore;
import java.io.File;

class GalleryPickerOneImage$3
implements ExploreAdabters$IExplore {
    final /* synthetic */ GalleryPickerOneImage this$0;

    GalleryPickerOneImage$3(GalleryPickerOneImage galleryPickerOneImage) {
        this.this$0 = galleryPickerOneImage;
    }

    public void done() {
        int n;
        RecyclerView recyclerView = GalleryPickerOneImage.cfr_renamed_141(this.this$0);
        int n2 = recyclerView.getVisibility();
        if (n2 != (n = 4)) {
            recyclerView = GalleryPickerOneImage.cfr_renamed_141(this.this$0);
            recyclerView.setVisibility(n);
        }
    }

    public void folder(File file, String string2, String string3) {
        int n;
        file = GalleryPickerOneImage.cfr_renamed_141(this.this$0);
        int n2 = file.getVisibility();
        if (n2 != (n = 4)) {
            file = GalleryPickerOneImage.cfr_renamed_141(this.this$0);
            file.setVisibility(n);
        }
        this.this$0.changeFolder(string3);
        GalleryPickerOneImage.cfr_renamed_142(this.this$0).setText(string2);
    }
}

