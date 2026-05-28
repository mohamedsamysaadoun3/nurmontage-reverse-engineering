// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

class CropView$1 implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ CropView this$0;
    
    CropView$1(final CropView this$0) {
        this.this$0 = this$0;
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final float floatValue = (float)valueAnimator.getAnimatedValue();
        final float n = CropView.-$$Nest$fgetinitialHintRectWidth(this.this$0) * floatValue;
        final float n2 = CropView.-$$Nest$fgetinitialHintRectHeight(this.this$0) * floatValue;
        final float -$$Nest$fgetinitialHintRectCenterX = CropView.-$$Nest$fgetinitialHintRectCenterX(this.this$0);
        final float n3 = 2.0f;
        final float n4 = n / n3;
        final float n5 = -$$Nest$fgetinitialHintRectCenterX - n4;
        final float -$$Nest$fgetinitialHintRectCenterY = CropView.-$$Nest$fgetinitialHintRectCenterY(this.this$0);
        final float n6 = n2 / n3;
        CropView.-$$Nest$fgetcropRect(this.this$0).set(n5, -$$Nest$fgetinitialHintRectCenterY - n6, CropView.-$$Nest$fgetinitialHintRectCenterX(this.this$0) + n4, CropView.-$$Nest$fgetinitialHintRectCenterY(this.this$0) + n6);
        this.this$0.invalidate();
    }
}
