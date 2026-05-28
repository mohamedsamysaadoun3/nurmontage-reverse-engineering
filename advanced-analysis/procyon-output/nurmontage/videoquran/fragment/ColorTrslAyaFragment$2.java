// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.adabter.ColorAdabter$IColor;

class ColorTrslAyaFragment$2 implements ColorAdabter$IColor
{
    final /* synthetic */ ColorTrslAyaFragment this$0;
    
    ColorTrslAyaFragment$2(final ColorTrslAyaFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onColor(final int n, final int n2) {
        if (ColorTrslAyaFragment.-$$Nest$fgetiEditEntityCallback(this.this$0) == null) {
            return;
        }
        this.this$0.scrollToSelectedPosition();
        ColorTrslAyaFragment.-$$Nest$fgetiEditEntityCallback(this.this$0).updateAya(n);
    }
}
