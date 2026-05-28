/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.widget.ImageView
 */
package hazem.nurmontage.videoquran;

import android.graphics.Bitmap;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.ChoiceBgFromVideoActivity;
import hazem.nurmontage.videoquran.views.VideoFrameSelectorView$OnFrameSelectedListener;

class ChoiceBgFromVideoActivity$3
implements VideoFrameSelectorView$OnFrameSelectedListener {
    final /* synthetic */ ChoiceBgFromVideoActivity this$0;

    ChoiceBgFromVideoActivity$3(ChoiceBgFromVideoActivity choiceBgFromVideoActivity) {
        this.this$0 = choiceBgFromVideoActivity;
    }

    public void onFrameSelected(int n, Bitmap bitmap) {
        ImageView imageView;
        if (bitmap != null && (imageView = ChoiceBgFromVideoActivity.cfr_renamed_113(this.this$0)) != null) {
            imageView = ChoiceBgFromVideoActivity.cfr_renamed_113(this.this$0);
            imageView.setImageBitmap(bitmap);
        }
    }
}

