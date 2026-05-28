/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ScaleGestureDetector
 *  android.view.ScaleGestureDetector$SimpleOnScaleGestureListener
 */
package hazem.nurmontage.videoquran.views;

import android.view.ScaleGestureDetector;
import hazem.nurmontage.videoquran.views.CfrRenamed1106;
import hazem.nurmontage.videoquran.views.TrackEntityView;

class TrackEntityView$ScaleListener
extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ TrackEntityView this$0;

    private TrackEntityView$ScaleListener(TrackEntityView trackEntityView) {
        this.this$0 = trackEntityView;
    }

    /* synthetic */ TrackEntityView$ScaleListener(TrackEntityView trackEntityView, CfrRenamed1106 cfr_renamed_507) {
        this(trackEntityView);
    }

    public boolean onScale(ScaleGestureDetector object) {
        float f = object.getScaleFactor();
        f = Math.min(TrackEntityView.cfr_renamed_446(this.this$0) * f, 8.0f);
        f = Math.max(0.09f, f);
        TrackEntityView.cfr_renamed_467(this.this$0, f);
        object = this.this$0;
        float f2 = TrackEntityView.cfr_renamed_446((TrackEntityView)((Object)object));
        float f3 = TrackEntityView.cfr_renamed_433(this.this$0);
        TrackEntityView.cfr_renamed_468((TrackEntityView)((Object)object), f2 *= f3);
        this.this$0.invalidate();
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        Object object = this.this$0;
        boolean bl = true;
        TrackEntityView.cfr_renamed_464((TrackEntityView)((Object)object), bl);
        object = TrackEntityView.cfr_renamed_73(this.this$0);
        if (object != null) {
            object = TrackEntityView.cfr_renamed_73(this.this$0);
            object.pause();
        }
        return super.onScaleBegin(scaleGestureDetector);
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        super.onScaleEnd(scaleGestureDetector);
    }
}

