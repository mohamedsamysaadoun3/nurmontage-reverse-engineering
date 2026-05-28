/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import hazem.nurmontage.videoquran.GalleryPickerVideo;

class GalleryPickerVideo$4
implements View.OnClickListener {
    final /* synthetic */ GalleryPickerVideo this$0;

    GalleryPickerVideo$4(GalleryPickerVideo galleryPickerVideo) {
        this.this$0 = galleryPickerVideo;
    }

    public void onClick(View object) {
        object = GalleryPickerVideo.cfr_renamed_298(this.this$0);
        if (object != null) {
            object = new Intent();
            Object object2 = Uri.parse((String)GalleryPickerVideo.cfr_renamed_298(this.this$0).getPath());
            object.setData(object2);
            object2 = this.this$0;
            int n = -1;
            object2.setResult(n, (Intent)object);
        }
        this.this$0.finish();
    }
}

