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
import hazem.nurmontage.videoquran.GalleryPickerOneImage;

class GalleryPickerOneImage$4
implements View.OnClickListener {
    final /* synthetic */ GalleryPickerOneImage this$0;

    GalleryPickerOneImage$4(GalleryPickerOneImage galleryPickerOneImage) {
        this.this$0 = galleryPickerOneImage;
    }

    public void onClick(View object) {
        object = GalleryPickerOneImage.cfr_renamed_271(this.this$0);
        if (object != null) {
            object = new Intent();
            Object object2 = Uri.parse((String)GalleryPickerOneImage.cfr_renamed_271(this.this$0).getPath());
            object.setData(object2);
            object2 = this.this$0;
            int n = -1;
            object2.setResult(n, (Intent)object);
        }
        this.this$0.finish();
    }
}

