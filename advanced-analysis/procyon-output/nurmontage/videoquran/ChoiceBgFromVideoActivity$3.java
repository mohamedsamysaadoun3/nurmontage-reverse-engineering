// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.graphics.Bitmap;
import hazem.nurmontage.videoquran.views.VideoFrameSelectorView$OnFrameSelectedListener;

class ChoiceBgFromVideoActivity$3 implements VideoFrameSelectorView$OnFrameSelectedListener
{
    final /* synthetic */ ChoiceBgFromVideoActivity this$0;
    
    ChoiceBgFromVideoActivity$3(final ChoiceBgFromVideoActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onFrameSelected(final int n, final Bitmap imageBitmap) {
        if (imageBitmap != null && ChoiceBgFromVideoActivity.-$$Nest$fgetimageView(this.this$0) != null) {
            ChoiceBgFromVideoActivity.-$$Nest$fgetimageView(this.this$0).setImageBitmap(imageBitmap);
        }
    }
}
