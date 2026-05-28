// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;

class CropBitmapActivity$1 extends OnBackPressedCallback
{
    final /* synthetic */ CropBitmapActivity this$0;
    
    CropBitmapActivity$1(final CropBitmapActivity this$0, final boolean b) {
        this.this$0 = this$0;
        super(b);
    }
    
    public void handleOnBackPressed() {
        CropBitmapActivity.-$$Nest$mcancel(this.this$0);
    }
}
