// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.graphics.Bitmap;

public class VideoFrameSelectorView$BitmapFrame
{
    private Bitmap bitmap;
    final /* synthetic */ VideoFrameSelectorView this$0;
    private long time;
    
    public VideoFrameSelectorView$BitmapFrame(final VideoFrameSelectorView this$0, final Bitmap bitmap, final long time) {
        this.this$0 = this$0;
        this.bitmap = bitmap;
        this.time = time;
    }
    
    public Bitmap getBitmap() {
        return this.bitmap;
    }
    
    public long getTime() {
        return this.time;
    }
}
