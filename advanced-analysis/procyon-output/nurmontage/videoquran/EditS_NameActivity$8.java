// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.adabter.ColorBgAdabter$IColor;

class EditS_NameActivity$8 implements ColorBgAdabter$IColor
{
    final /* synthetic */ EditS_NameActivity this$0;
    
    EditS_NameActivity$8(final EditS_NameActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onColor(final int n, final int n2) {
        EditS_NameActivity.-$$Nest$fputclrBg(this.this$0, n);
        this.this$0.scrollToSelectedPosition();
    }
}
