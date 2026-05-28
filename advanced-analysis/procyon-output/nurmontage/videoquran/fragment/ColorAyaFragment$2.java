// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.adabter.ColorAdabter$IColor;

class ColorAyaFragment$2 implements ColorAdabter$IColor
{
    final /* synthetic */ ColorAyaFragment this$0;
    
    ColorAyaFragment$2(final ColorAyaFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onColor(final int n, int selectedTabPosition) {
        if (ColorAyaFragment.-$$Nest$fgetiEditEntityCallback(this.this$0) == null) {
            return;
        }
        this.this$0.scrollToSelectedPosition();
        if (ColorAyaFragment.-$$Nest$fgettabLayout(this.this$0) != null) {
            selectedTabPosition = ColorAyaFragment.-$$Nest$fgettabLayout(this.this$0).getSelectedTabPosition();
            if (selectedTabPosition != 0) {
                ColorAyaFragment.-$$Nest$fgetiEditEntityCallback(this.this$0).updateTrsl(n);
                return;
            }
        }
        ColorAyaFragment.-$$Nest$fgetiEditEntityCallback(this.this$0).updateAya(n);
    }
}
