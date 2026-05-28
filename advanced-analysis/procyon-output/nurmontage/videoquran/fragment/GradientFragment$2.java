// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.model.Gradient;
import hazem.nurmontage.videoquran.adabter.GradientAdabter$IColor;

class GradientFragment$2 implements GradientAdabter$IColor
{
    final /* synthetic */ GradientFragment this$0;
    
    GradientFragment$2(final GradientFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onGradient(final Gradient gradient, final int n) {
        if (GradientFragment.-$$Nest$fgetgradient(this.this$0) == null) {
            GradientFragment.-$$Nest$fgetbinding(this.this$0).getRoot().findViewById(R$id.layout_edit_gradient).setVisibility(0);
        }
        GradientFragment.-$$Nest$fputgradient(this.this$0, gradient);
        GradientFragment.-$$Nest$fgetgradient(this.this$0).setAngle(GradientFragment.-$$Nest$fgetseekBar_angle(this.this$0).getProgress());
        GradientFragment.-$$Nest$fputindex(this.this$0, n);
        this.this$0.scrollToSelectedPosition();
        if (GradientFragment.-$$Nest$fgetiIpadEditCallback(this.this$0) != null) {
            GradientFragment.-$$Nest$fgetiIpadEditCallback(this.this$0).onClick(gradient, n);
        }
    }
}
