/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.widget.SeekBar;
import hazem.nurmontage.videoquran.fragment.GradientFragment;
import hazem.nurmontage.videoquran.model.Gradient;

class GradientFragment$1
implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ GradientFragment this$0;

    GradientFragment$1(GradientFragment gradientFragment) {
        this.this$0 = gradientFragment;
    }

    public void onProgressChanged(SeekBar object, int n, boolean bl) {
        object = GradientFragment.cfr_renamed_167(this.this$0);
        if (object != null && (object = GradientFragment.cfr_renamed_172(this.this$0)) != null) {
            GradientFragment.cfr_renamed_167(this.this$0).setAngle(n);
            object = GradientFragment.cfr_renamed_204(this.this$0);
            Object object2 = String.valueOf(n);
            object.setText((CharSequence)object2);
            object = GradientFragment.cfr_renamed_172(this.this$0);
            object2 = GradientFragment.cfr_renamed_167(this.this$0);
            GradientFragment gradientFragment = this.this$0;
            int n2 = GradientFragment.cfr_renamed_203(gradientFragment);
            object.onClick((Gradient)object2, n2);
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}

