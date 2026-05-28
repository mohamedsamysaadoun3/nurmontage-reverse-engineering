// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

class BeforeAfterView$2 implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ BeforeAfterView this$0;
    
    BeforeAfterView$2(final BeforeAfterView this$0) {
        this.this$0 = this$0;
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
        BeforeAfterView.-$$Nest$fputdividerX(this.this$0, (float)valueAnimator.getAnimatedValue());
        this.this$0.invalidate();
    }
}
