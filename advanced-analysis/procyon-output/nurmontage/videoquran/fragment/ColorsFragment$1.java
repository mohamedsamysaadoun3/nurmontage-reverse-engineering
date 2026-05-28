// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.adabter.ColorAdabter$IColor;

class ColorsFragment$1 implements ColorAdabter$IColor
{
    final /* synthetic */ ColorsFragment this$0;
    
    ColorsFragment$1(final ColorsFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onColor(final int n, final int n2) {
        this.this$0.scrollToSelectedPosition();
        if (ColorsFragment.-$$Nest$fgetiIpadEditCallback(this.this$0) != null) {
            ColorsFragment.-$$Nest$fgetiIpadEditCallback(this.this$0).onClick(n, n2);
        }
    }
}
