/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
package hazem.nurmontage.videoquran.views;

import android.graphics.Bitmap;
import hazem.nurmontage.videoquran.views.VideoFrameSelectorView;

public class VideoFrameSelectorView$BitmapFrame {
    private Bitmap bitmap;
    final /* synthetic */ VideoFrameSelectorView this$0;
    private long time;

    static /* bridge */ /* synthetic */ Bitmap cfr_renamed_490(VideoFrameSelectorView$BitmapFrame videoFrameSelectorView$BitmapFrame) {
        return videoFrameSelectorView$BitmapFrame.bitmap;
    }

    public VideoFrameSelectorView$BitmapFrame(VideoFrameSelectorView videoFrameSelectorView, Bitmap bitmap, long l) {
        this.this$0 = videoFrameSelectorView;
        this.bitmap = bitmap;
        this.time = l;
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public long getTime() {
        return this.time;
    }
}

