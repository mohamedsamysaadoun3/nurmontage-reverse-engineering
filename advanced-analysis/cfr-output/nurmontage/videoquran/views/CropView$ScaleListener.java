/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  android.view.ScaleGestureDetector
 *  android.view.ScaleGestureDetector$SimpleOnScaleGestureListener
 */
package hazem.nurmontage.videoquran.views;

import android.graphics.RectF;
import android.view.ScaleGestureDetector;
import hazem.nurmontage.videoquran.views.CfrRenamed1093;
import hazem.nurmontage.videoquran.views.CropView;

class CropView$ScaleListener
extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ CropView this$0;

    private CropView$ScaleListener(CropView cropView) {
        this.this$0 = cropView;
    }

    /* synthetic */ CropView$ScaleListener(CropView cropView, CfrRenamed1093 cfr_renamed_485) {
        this(cropView);
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float f = scaleGestureDetector.getScaleFactor();
        boolean bl = Float.isNaN(f);
        if (!bl && !(bl = Float.isInfinite(f))) {
            float f2;
            float f3;
            float f4;
            CropView cropView = this.this$0;
            float f5 = CropView.cfr_renamed_446(cropView) * f;
            CropView.cfr_renamed_467(cropView, f5);
            float f6 = scaleGestureDetector.getFocusX();
            float f7 = scaleGestureDetector.getFocusY();
            RectF rectF = CropView.cfr_renamed_471(this.this$0);
            f5 = rectF.width();
            RectF rectF2 = CropView.cfr_renamed_471(this.this$0);
            float f8 = rectF2.height();
            f5 *= f;
            f8 *= f;
            CropView cropView2 = this.this$0;
            f = CropView.cfr_renamed_481(cropView2);
            float f9 = f5 == f ? 0 : (f5 < f ? -1 : 1);
            if (f9 < 0) {
                cropView2 = this.this$0;
                f5 = CropView.cfr_renamed_481(cropView2);
            }
            if ((f9 = (f4 = f8 - (f = CropView.cfr_renamed_480(cropView2 = this.this$0))) == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1)) < 0) {
                cropView2 = this.this$0;
                f8 = CropView.cfr_renamed_480(cropView2);
            }
            if ((f9 = (f3 = f5 - (f = CropView.cfr_renamed_479(cropView2 = this.this$0))) == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1)) > 0) {
                cropView2 = CropView.cfr_renamed_471(this.this$0);
                f5 = cropView2.width();
            }
            if ((f9 = (f2 = f8 - (f = CropView.cfr_renamed_478(cropView2 = this.this$0))) == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1)) > 0) {
                cropView2 = CropView.cfr_renamed_471(this.this$0);
                f8 = cropView2.height();
            }
            f = CropView.cfr_renamed_476(this.this$0);
            f = f6 - f;
            float f10 = CropView.cfr_renamed_477(this.this$0);
            f10 = f7 - f10;
            float f11 = CropView.cfr_renamed_471(this.this$0).centerX();
            float f12 = CropView.cfr_renamed_471(this.this$0).centerY();
            float f13 = 2.0f;
            float f14 = f11 - (f5 /= f13);
            f8 /= f13;
            f13 = f12 - f8;
            CropView.cfr_renamed_471(this.this$0).set(f14, f13, f11 += f5, f12 += f8);
            CropView.cfr_renamed_484(this.this$0, f, f10);
            CropView.cfr_renamed_482(this.this$0, f6);
            CropView.cfr_renamed_483(this.this$0, f7);
            this.this$0.invalidate();
            return true;
        }
        return false;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        CropView cropView = this.this$0;
        float f = scaleGestureDetector.getFocusX();
        CropView.cfr_renamed_482(cropView, f);
        cropView = this.this$0;
        float f2 = scaleGestureDetector.getFocusY();
        CropView.cfr_renamed_483(cropView, f2);
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}

