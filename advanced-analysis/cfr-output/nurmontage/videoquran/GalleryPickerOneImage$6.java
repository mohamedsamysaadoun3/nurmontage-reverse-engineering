/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.GalleryPickerOneImage;

class GalleryPickerOneImage$6
implements View.OnClickListener {
    final /* synthetic */ GalleryPickerOneImage this$0;

    GalleryPickerOneImage$6(GalleryPickerOneImage galleryPickerOneImage) {
        this.this$0 = galleryPickerOneImage;
    }

    public void onClick(View object) {
        object = GalleryPickerOneImage.cfr_renamed_141(this.this$0);
        if (object != null && (object = GalleryPickerOneImage.cfr_renamed_142(this.this$0)) != null) {
            object = GalleryPickerOneImage.cfr_renamed_141(this.this$0);
            int n = object.getVisibility();
            if (n != 0) {
                GalleryPickerOneImage.cfr_renamed_141(this.this$0).setVisibility(0);
                object = GalleryPickerOneImage.cfr_renamed_142(this.this$0);
                int n2 = 17301507;
                object.setCompoundDrawablesWithIntrinsicBounds(0, 0, n2, 0);
            } else {
                GalleryPickerOneImage.cfr_renamed_141(this.this$0).setVisibility(4);
                object = GalleryPickerOneImage.cfr_renamed_142(this.this$0);
                int n3 = 17301506;
                object.setCompoundDrawablesWithIntrinsicBounds(0, 0, n3, 0);
            }
        }
    }
}

