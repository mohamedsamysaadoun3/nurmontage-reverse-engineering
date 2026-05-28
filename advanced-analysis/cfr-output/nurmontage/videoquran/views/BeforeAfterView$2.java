/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package hazem.nurmontage.videoquran.views;

import android.animation.ValueAnimator;
import hazem.nurmontage.videoquran.views.BeforeAfterView;

class BeforeAfterView$2
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ BeforeAfterView this$0;

    BeforeAfterView$2(BeforeAfterView beforeAfterView) {
        this.this$0 = beforeAfterView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        BeforeAfterView beforeAfterView = this.this$0;
        float f = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        BeforeAfterView.cfr_renamed_488(beforeAfterView, f);
        this.this$0.invalidate();
    }
}

