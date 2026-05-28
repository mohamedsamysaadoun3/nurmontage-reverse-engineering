/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package hazem.nurmontage.videoquran.views;

import android.animation.ValueAnimator;
import hazem.nurmontage.videoquran.views.CropView;

class CropView$1
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ CropView this$0;

    CropView$1(CropView cropView) {
        this.this$0 = cropView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        float f2 = CropView.cfr_renamed_475(this.this$0) * f;
        float f3 = CropView.cfr_renamed_474(this.this$0) * f;
        f = CropView.cfr_renamed_472(this.this$0);
        float f4 = 2.0f;
        f -= (f2 /= f4);
        float f5 = CropView.cfr_renamed_473(this.this$0);
        f5 -= (f3 /= f4);
        f4 = CropView.cfr_renamed_472(this.this$0) + f2;
        f2 = CropView.cfr_renamed_473(this.this$0) + f3;
        CropView.cfr_renamed_471(this.this$0).set(f, f5, f4, f2);
        this.this$0.invalidate();
    }
}

