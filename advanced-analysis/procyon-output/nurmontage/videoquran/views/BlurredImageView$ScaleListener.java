// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import hazem.nurmontage.videoquran.model.QuranEntity;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector$SimpleOnScaleGestureListener;

class BlurredImageView$ScaleListener extends ScaleGestureDetector$SimpleOnScaleGestureListener
{
    final /* synthetic */ BlurredImageView this$0;
    
    private BlurredImageView$ScaleListener(final BlurredImageView this$0) {
        this.this$0 = this$0;
    }
    
    public boolean onScale(final ScaleGestureDetector scaleGestureDetector) {
        if (BlurredImageView.-$$Nest$fgetentity_select(this.this$0) != null) {
            BlurredImageView.-$$Nest$fgetentity_select(this.this$0).scale(scaleGestureDetector.getScaleFactor(), this.this$0.getmCanvas_width(), this.this$0.getmCanvas_height());
            this.this$0.invalidate();
        }
        return true;
    }
    
    public boolean onScaleBegin(final ScaleGestureDetector scaleGestureDetector) {
        if (BlurredImageView.-$$Nest$fgetentity_select(this.this$0) != null) {
            final BlurredImageView this$0 = this.this$0;
            final boolean b = true;
            BlurredImageView.-$$Nest$fputisOnScale(this$0, b);
            BlurredImageView.-$$Nest$fgetselectTool(this.this$0).setApply_Scale(b);
            BlurredImageView.-$$Nest$fgetselectTool(this.this$0).setOnProgress(b);
        }
        return super.onScaleBegin(scaleGestureDetector);
    }
    
    public void onScaleEnd(final ScaleGestureDetector scaleGestureDetector) {
        if (BlurredImageView.-$$Nest$fgetentity_select(this.this$0) instanceof QuranEntity) {
            BlurredImageView.-$$Nest$fgetselectTool(this.this$0).setApply_all(true);
            BlurredImageView.-$$Nest$fgetselectTool(this.this$0).setOnProgress(false);
        }
        super.onScaleEnd(scaleGestureDetector);
    }
}
