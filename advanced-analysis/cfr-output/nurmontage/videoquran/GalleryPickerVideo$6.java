/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.view.View;
import hazem.nurmontage.videoquran.GalleryPickerVideo;

class GalleryPickerVideo$6
implements View.OnClickListener {
    final /* synthetic */ GalleryPickerVideo this$0;

    GalleryPickerVideo$6(GalleryPickerVideo galleryPickerVideo) {
        this.this$0 = galleryPickerVideo;
    }

    public void onClick(View object) {
        object = GalleryPickerVideo.cfr_renamed_141(this.this$0);
        if (object != null && (object = GalleryPickerVideo.cfr_renamed_142(this.this$0)) != null) {
            object = GalleryPickerVideo.cfr_renamed_141(this.this$0);
            int n = object.getVisibility();
            if (n != 0) {
                GalleryPickerVideo.cfr_renamed_141(this.this$0).setVisibility(0);
                object = GalleryPickerVideo.cfr_renamed_142(this.this$0);
                int n2 = 17301507;
                object.setCompoundDrawablesWithIntrinsicBounds(0, 0, n2, 0);
            } else {
                GalleryPickerVideo.cfr_renamed_141(this.this$0).setVisibility(4);
                object = GalleryPickerVideo.cfr_renamed_142(this.this$0);
                int n3 = 17301506;
                object.setCompoundDrawablesWithIntrinsicBounds(0, 0, n3, 0);
            }
        }
    }
}

