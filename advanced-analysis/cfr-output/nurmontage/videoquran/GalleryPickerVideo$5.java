/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.view.View;
import hazem.nurmontage.videoquran.GalleryPickerVideo;
import hazem.nurmontage.videoquran.Utils.AppSettingsHelper;

class GalleryPickerVideo$5
implements View.OnClickListener {
    final /* synthetic */ GalleryPickerVideo this$0;

    GalleryPickerVideo$5(GalleryPickerVideo galleryPickerVideo) {
        this.this$0 = galleryPickerVideo;
    }

    public void onClick(View view) {
        GalleryPickerVideo.cfr_renamed_66(this.this$0, true);
        AppSettingsHelper.openAppSettings((Context)this.this$0);
    }
}

