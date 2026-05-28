/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 */
package hazem.nurmontage.videoquran.fragment;

import android.widget.SeekBar;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.adabter.GradientAdabter$IColor;
import hazem.nurmontage.videoquran.fragment.GradientFragment;
import hazem.nurmontage.videoquran.model.Gradient;

class GradientFragment$2
implements GradientAdabter$IColor {
    final /* synthetic */ GradientFragment this$0;

    GradientFragment$2(GradientFragment gradientFragment) {
        this.this$0 = gradientFragment;
    }

    public void onGradient(Gradient gradient, int n) {
        SeekBar seekBar;
        int n2;
        Object object = GradientFragment.cfr_renamed_167(this.this$0);
        if (object == null) {
            object = GradientFragment.cfr_renamed_168(this.this$0).getRoot();
            n2 = R$id.layout_edit_gradient;
            object = object.findViewById(n2);
            n2 = 0;
            seekBar = null;
            object.setVisibility(0);
        }
        GradientFragment.cfr_renamed_169(this.this$0, gradient);
        object = GradientFragment.cfr_renamed_167(this.this$0);
        seekBar = GradientFragment.cfr_renamed_170(this.this$0);
        n2 = seekBar.getProgress();
        ((Gradient)object).setAngle(n2);
        GradientFragment.cfr_renamed_171(this.this$0, n);
        this.this$0.scrollToSelectedPosition();
        object = GradientFragment.cfr_renamed_172(this.this$0);
        if (object != null) {
            object = GradientFragment.cfr_renamed_172(this.this$0);
            object.onClick(gradient, n);
        }
    }
}

