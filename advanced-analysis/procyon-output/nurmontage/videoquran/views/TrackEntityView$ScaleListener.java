// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector$SimpleOnScaleGestureListener;

class TrackEntityView$ScaleListener extends ScaleGestureDetector$SimpleOnScaleGestureListener
{
    final /* synthetic */ TrackEntityView this$0;
    
    private TrackEntityView$ScaleListener(final TrackEntityView this$0) {
        this.this$0 = this$0;
    }
    
    public boolean onScale(final ScaleGestureDetector scaleGestureDetector) {
        TrackEntityView.-$$Nest$fputscaleFactor(this.this$0, Math.max(0.09f, Math.min(TrackEntityView.-$$Nest$fgetscaleFactor(this.this$0) * scaleGestureDetector.getScaleFactor(), 8.0f)));
        final TrackEntityView this$0 = this.this$0;
        TrackEntityView.-$$Nest$fputscrolled_with_zoom(this$0, TrackEntityView.-$$Nest$fgetscaleFactor(this$0) * TrackEntityView.-$$Nest$fgetcurrentPosition(this.this$0));
        this.this$0.invalidate();
        return true;
    }
    
    public boolean onScaleBegin(final ScaleGestureDetector scaleGestureDetector) {
        TrackEntityView.-$$Nest$fputisScaleListener(this.this$0, true);
        if (TrackEntityView.-$$Nest$fgetiTrimLineCallback(this.this$0) != null) {
            TrackEntityView.-$$Nest$fgetiTrimLineCallback(this.this$0).pause();
        }
        return super.onScaleBegin(scaleGestureDetector);
    }
    
    public void onScaleEnd(final ScaleGestureDetector scaleGestureDetector) {
        super.onScaleEnd(scaleGestureDetector);
    }
}
