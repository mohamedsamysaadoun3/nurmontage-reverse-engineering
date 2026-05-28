// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.adabter.ColorBgAdabter$IColor;

class EditTrslTxtActivity$6 implements ColorBgAdabter$IColor
{
    final /* synthetic */ EditTrslTxtActivity this$0;
    
    EditTrslTxtActivity$6(final EditTrslTxtActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onColor(final int n, final int n2) {
        EditTrslTxtActivity.-$$Nest$fputclrBg(this.this$0, n);
        this.this$0.scrollToSelectedPosition();
    }
}
