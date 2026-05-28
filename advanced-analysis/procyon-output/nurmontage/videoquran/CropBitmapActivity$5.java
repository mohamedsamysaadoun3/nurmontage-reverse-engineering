// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Context;
import hazem.nurmontage.videoquran.Utils.MyPrefereces;
import hazem.nurmontage.videoquran.common.Common;

class CropBitmapActivity$5 implements Runnable
{
    final /* synthetic */ CropBitmapActivity this$0;
    
    CropBitmapActivity$5(final CropBitmapActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        if (Common.bitmap == null) {
            return;
        }
        CropBitmapActivity.-$$Nest$fgetcropView(this.this$0).setBitmap(Common.bitmap, Common.rect, Common.radius, MyPrefereces.isShowHint((Context)this.this$0));
    }
}
