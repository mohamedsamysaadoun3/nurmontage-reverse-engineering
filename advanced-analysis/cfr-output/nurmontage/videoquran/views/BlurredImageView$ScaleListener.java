/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ScaleGestureDetector
 *  android.view.ScaleGestureDetector$SimpleOnScaleGestureListener
 */
package hazem.nurmontage.videoquran.views;

import android.view.ScaleGestureDetector;
import hazem.nurmontage.videoquran.model.EntitySelectTool;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.views.CfrRenamed1108;

class BlurredImageView$ScaleListener
extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ BlurredImageView this$0;

    private BlurredImageView$ScaleListener(BlurredImageView blurredImageView) {
        this.this$0 = blurredImageView;
    }

    /* synthetic */ BlurredImageView$ScaleListener(BlurredImageView blurredImageView, CfrRenamed1108 cfr_renamed_491) {
        this(blurredImageView);
    }

    public boolean onScale(ScaleGestureDetector object) {
        EntityView entityView = BlurredImageView.cfr_renamed_177(this.this$0);
        if (entityView != null) {
            float f = object.getScaleFactor();
            entityView = BlurredImageView.cfr_renamed_177(this.this$0);
            BlurredImageView blurredImageView = this.this$0;
            int n = blurredImageView.getmCanvas_width();
            BlurredImageView blurredImageView2 = this.this$0;
            int n2 = blurredImageView2.getmCanvas_height();
            entityView.scale(f, n, n2);
            object = this.this$0;
            object.invalidate();
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        Object object = BlurredImageView.cfr_renamed_177(this.this$0);
        if (object != null) {
            object = this.this$0;
            boolean bl = true;
            BlurredImageView.cfr_renamed_492((BlurredImageView)((Object)object), bl);
            BlurredImageView.cfr_renamed_493(this.this$0).setApply_Scale(bl);
            object = BlurredImageView.cfr_renamed_493(this.this$0);
            ((EntitySelectTool)object).setOnProgress(bl);
        }
        return super.onScaleBegin(scaleGestureDetector);
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        Object object = BlurredImageView.cfr_renamed_177(this.this$0);
        boolean bl = object instanceof QuranEntity;
        if (bl) {
            BlurredImageView.cfr_renamed_493(this.this$0).setApply_all(true);
            object = BlurredImageView.cfr_renamed_493(this.this$0);
            ((EntitySelectTool)object).setOnProgress(false);
        }
        super.onScaleEnd(scaleGestureDetector);
    }
}

