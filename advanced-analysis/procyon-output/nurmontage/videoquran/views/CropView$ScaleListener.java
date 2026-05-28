// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector$SimpleOnScaleGestureListener;

class CropView$ScaleListener extends ScaleGestureDetector$SimpleOnScaleGestureListener
{
    final /* synthetic */ CropView this$0;
    
    private CropView$ScaleListener(final CropView this$0) {
        this.this$0 = this$0;
    }
    
    public boolean onScale(final ScaleGestureDetector scaleGestureDetector) {
        final float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
            final CropView this$0 = this.this$0;
            CropView.-$$Nest$fputscaleFactor(this$0, CropView.-$$Nest$fgetscaleFactor(this$0) * scaleFactor);
            final float focusX = scaleGestureDetector.getFocusX();
            final float focusY = scaleGestureDetector.getFocusY();
            final float width = CropView.-$$Nest$fgetcropRect(this.this$0).width();
            final float height = CropView.-$$Nest$fgetcropRect(this.this$0).height();
            float n = width * scaleFactor;
            float n2 = height * scaleFactor;
            if (n < CropView.-$$Nest$fgetminW(this.this$0)) {
                n = CropView.-$$Nest$fgetminW(this.this$0);
            }
            if (n2 < CropView.-$$Nest$fgetminH(this.this$0)) {
                n2 = CropView.-$$Nest$fgetminH(this.this$0);
            }
            if (n > CropView.-$$Nest$fgetmWidth(this.this$0)) {
                n = CropView.-$$Nest$fgetcropRect(this.this$0).width();
            }
            if (n2 > CropView.-$$Nest$fgetmHeight(this.this$0)) {
                n2 = CropView.-$$Nest$fgetcropRect(this.this$0).height();
            }
            final float n3 = focusX - CropView.-$$Nest$fgetlastFocusX(this.this$0);
            final float n4 = focusY - CropView.-$$Nest$fgetlastFocusY(this.this$0);
            final float centerX = CropView.-$$Nest$fgetcropRect(this.this$0).centerX();
            final float centerY = CropView.-$$Nest$fgetcropRect(this.this$0).centerY();
            final float n5 = 2.0f;
            final float n6 = n / n5;
            final float n7 = centerX - n6;
            final float n8 = n2 / n5;
            CropView.-$$Nest$fgetcropRect(this.this$0).set(n7, centerY - n8, centerX + n6, centerY + n8);
            CropView.-$$Nest$mmoveCropRect(this.this$0, n3, n4);
            CropView.-$$Nest$fputlastFocusX(this.this$0, focusX);
            CropView.-$$Nest$fputlastFocusY(this.this$0, focusY);
            this.this$0.invalidate();
            return true;
        }
        return false;
    }
    
    public boolean onScaleBegin(final ScaleGestureDetector scaleGestureDetector) {
        CropView.-$$Nest$fputlastFocusX(this.this$0, scaleGestureDetector.getFocusX());
        CropView.-$$Nest$fputlastFocusY(this.this$0, scaleGestureDetector.getFocusY());
        return true;
    }
    
    public void onScaleEnd(final ScaleGestureDetector scaleGestureDetector) {
    }
}
