// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.adabter.ColorAdabter$IColor;

class ColorS_NameFragment$2 implements ColorAdabter$IColor
{
    final /* synthetic */ ColorS_NameFragment this$0;
    
    ColorS_NameFragment$2(final ColorS_NameFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onColor(final int color, final int n) {
        if (ColorS_NameFragment.-$$Nest$fgetiEditSName(this.this$0) != null) {
            if (ColorS_NameFragment.-$$Nest$fgetentity_select(this.this$0) != null) {
                this.this$0.scrollToSelectedPosition();
                ColorS_NameFragment.-$$Nest$fgetentity_select(this.this$0).setColor(color);
                ColorS_NameFragment.-$$Nest$fgetiEditSName(this.this$0).update();
            }
        }
    }
}
