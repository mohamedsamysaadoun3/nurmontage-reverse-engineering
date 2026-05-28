/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 */
package hazem.nurmontage.videoquran.views;

import android.graphics.PointF;
import hazem.nurmontage.videoquran.model.EntitySelectTool;
import hazem.nurmontage.videoquran.multitouch.MoveGestureDetector;
import hazem.nurmontage.videoquran.multitouch.MoveGestureDetector$SimpleOnMoveGestureListener;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.views.CfrRenamed1108;

class BlurredImageView$MoveListener
extends MoveGestureDetector$SimpleOnMoveGestureListener {
    final /* synthetic */ BlurredImageView this$0;

    private BlurredImageView$MoveListener(BlurredImageView blurredImageView) {
        this.this$0 = blurredImageView;
    }

    /* synthetic */ BlurredImageView$MoveListener(BlurredImageView blurredImageView, CfrRenamed1108 cfr_renamed_491) {
        this(blurredImageView);
    }

    public boolean onMove(MoveGestureDetector moveGestureDetector) {
        BlurredImageView blurredImageView = this.this$0;
        moveGestureDetector = moveGestureDetector.getFocusDelta();
        BlurredImageView.cfr_renamed_504(blurredImageView, (PointF)moveGestureDetector);
        return true;
    }

    public void onMoveEnd(MoveGestureDetector object) {
        super.onMoveEnd((MoveGestureDetector)object);
        object = BlurredImageView.cfr_renamed_177(this.this$0);
        if (object != null && (object = BlurredImageView.cfr_renamed_493(this.this$0)) != null) {
            object = BlurredImageView.cfr_renamed_493(this.this$0);
            boolean bl = true;
            ((EntitySelectTool)object).setApply_all(bl);
        }
    }
}

