// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.adabter.ColorAdabter$IColor;

class ColorBismilahFragment$2 implements ColorAdabter$IColor
{
    final /* synthetic */ ColorBismilahFragment this$0;
    
    ColorBismilahFragment$2(final ColorBismilahFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onColor(final int n, final int n2) {
        if (ColorBismilahFragment.-$$Nest$fgetiEditSName(this.this$0) != null) {
            if (ColorBismilahFragment.-$$Nest$fgetentity_select(this.this$0) != null) {
                this.this$0.scrollToSelectedPosition();
                ColorBismilahFragment.-$$Nest$fgetiEditSName(this.this$0).updateAya(n);
            }
        }
    }
}
