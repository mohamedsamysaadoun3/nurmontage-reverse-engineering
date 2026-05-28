/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 */
package hazem.nurmontage.videoquran.views;

import android.view.MotionEvent;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.views.TrackEntityView;

class TrackEntityView$4
implements Runnable {
    final /* synthetic */ TrackEntityView this$0;
    final /* synthetic */ MotionEvent val$motionEvent;

    TrackEntityView$4(TrackEntityView trackEntityView, MotionEvent motionEvent) {
        this.this$0 = trackEntityView;
        this.val$motionEvent = motionEvent;
    }

    public void run() {
        Entity entity = TrackEntityView.cfr_renamed_449(this.this$0);
        if (entity != null) {
            entity = TrackEntityView.cfr_renamed_449(this.this$0);
            MotionEvent motionEvent = this.val$motionEvent;
            float f = motionEvent.getX();
            entity.setDownX(f);
        }
        TrackEntityView.cfr_renamed_465(this.this$0, true);
        TrackEntityView.cfr_renamed_466(this.this$0, false);
        TrackEntityView.cfr_renamed_461(this.this$0, false);
    }
}

