// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import hazem.nurmontage.videoquran.multitouch.MoveGestureDetector;
import hazem.nurmontage.videoquran.multitouch.MoveGestureDetector$SimpleOnMoveGestureListener;

class BlurredImageView$MoveListener extends MoveGestureDetector$SimpleOnMoveGestureListener
{
    final /* synthetic */ BlurredImageView this$0;
    
    private BlurredImageView$MoveListener(final BlurredImageView this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public boolean onMove(final MoveGestureDetector moveGestureDetector) {
        BlurredImageView.-$$Nest$mhandleTranslate(this.this$0, moveGestureDetector.getFocusDelta());
        return true;
    }
    
    @Override
    public void onMoveEnd(final MoveGestureDetector moveGestureDetector) {
        super.onMoveEnd(moveGestureDetector);
        if (BlurredImageView.-$$Nest$fgetentity_select(this.this$0) != null && BlurredImageView.-$$Nest$fgetselectTool(this.this$0) != null) {
            BlurredImageView.-$$Nest$fgetselectTool(this.this$0).setApply_all(true);
        }
    }
}
