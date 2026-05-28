// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.model.TranslationQuranEntity;
import hazem.nurmontage.videoquran.model.QuranEntity;
import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;

class BlurredImageView$1 extends GestureDetector$SimpleOnGestureListener
{
    final /* synthetic */ BlurredImageView this$0;
    
    BlurredImageView$1(final BlurredImageView this$0) {
        this.this$0 = this$0;
    }
    
    public boolean onDown(final MotionEvent motionEvent) {
        final boolean -$$Nest$fgetisPro = BlurredImageView.-$$Nest$fgetisPro(this.this$0);
        final boolean b = true;
        if (!-$$Nest$fgetisPro && BlurredImageView.-$$Nest$fgetmRectWattermark(this.this$0) != null && BlurredImageView.-$$Nest$fgetmRectWattermark(this.this$0).contains(motionEvent.getX(), motionEvent.getY())) {
            BlurredImageView.-$$Nest$fputisWattermark(this.this$0, b);
        }
        if (BlurredImageView.-$$Nest$fgetentity_select(this.this$0) != null && BlurredImageView.-$$Nest$fgetentity_select(this.this$0).isVisible() && !BlurredImageView.-$$Nest$fgetisWattermark(this.this$0)) {
            if (BlurredImageView.-$$Nest$fgetselectTool(this.this$0).isApply(BlurredImageView.-$$Nest$fgetentity_select(this.this$0), motionEvent.getX(), motionEvent.getY())) {
                if (BlurredImageView.-$$Nest$fgetselectTool(this.this$0).isApply_Move()) {
                    BlurredImageView.-$$Nest$fgetiViewCallback(this.this$0).onEndMove();
                }
                if (BlurredImageView.-$$Nest$fgetselectTool(this.this$0).isApply_Scale()) {
                    BlurredImageView.-$$Nest$fgetiViewCallback(this.this$0).onEndScale();
                }
                BlurredImageView.-$$Nest$fgetselectTool(this.this$0).setClick_apply(b);
                BlurredImageView.-$$Nest$fgetselectTool(this.this$0).reset();
            }
            else {
                BlurredImageView.-$$Nest$fgetselectTool(this.this$0).isScale(BlurredImageView.-$$Nest$fgetentity_select(this.this$0), motionEvent.getX(), motionEvent.getY());
            }
            if (BlurredImageView.-$$Nest$fgetselectTool(this.this$0).isApply_Scale()) {
                BlurredImageView.-$$Nest$fgetselectTool(this.this$0).setOnProgress(b);
                final BlurredImageView this$0 = this.this$0;
                BlurredImageView.-$$Nest$fputprevDistance(this$0, BlurredImageView.-$$Nest$mdistanceToCenter(this$0, motionEvent.getX(), motionEvent.getY()));
            }
        }
        return b;
    }
    
    public boolean onSingleTapUp(final MotionEvent motionEvent) {
        final EntityView -$$Nest$fgetentity_select = BlurredImageView.-$$Nest$fgetentity_select(this.this$0);
        final boolean apply_all = true;
        if (-$$Nest$fgetentity_select != null && BlurredImageView.-$$Nest$fgetselectTool(this.this$0).isClick_apply()) {
            BlurredImageView.-$$Nest$fgetselectTool(this.this$0).setClick_apply(false);
            this.this$0.invalidate();
            return apply_all;
        }
        if (!BlurredImageView.-$$Nest$fgetisWattermark(this.this$0)) {
            BlurredImageView.-$$Nest$mupdateSelectionOnTap(this.this$0, motionEvent);
        }
        BlurredImageView.-$$Nest$fputisOnScale(this.this$0, false);
        if (BlurredImageView.-$$Nest$fgetiViewCallback(this.this$0) != null) {
            if (BlurredImageView.-$$Nest$fgetentity_select(this.this$0) == null) {
                if (BlurredImageView.-$$Nest$fgetisWattermark(this.this$0)) {
                    BlurredImageView.-$$Nest$fgetiViewCallback(this.this$0).onWattermark();
                }
                else if (BlurredImageView.-$$Nest$fgetisSquare(this.this$0)) {
                    BlurredImageView.-$$Nest$fgetiViewCallback(this.this$0).onSquare();
                }
                else {
                    BlurredImageView.-$$Nest$fgetiViewCallback(this.this$0).onEmtyClick();
                }
            }
            else if (BlurredImageView.-$$Nest$fgetselectTool(this.this$0) != null && BlurredImageView.-$$Nest$fgetselectTool(this.this$0).isApply_Move() && (BlurredImageView.-$$Nest$fgetentity_select(this.this$0) instanceof QuranEntity || BlurredImageView.-$$Nest$fgetentity_select(this.this$0) instanceof TranslationQuranEntity) && !BlurredImageView.-$$Nest$fgetselectTool(this.this$0).isApply_all()) {
                BlurredImageView.-$$Nest$fgetselectTool(this.this$0).setApply_all(apply_all);
                this.this$0.invalidate();
            }
            final BlurredImageView this$0 = this.this$0;
            BlurredImageView.-$$Nest$fputisWattermark(this$0, false);
            BlurredImageView.-$$Nest$fputisSquare(this$0, false);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
