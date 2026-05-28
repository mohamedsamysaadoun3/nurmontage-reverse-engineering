// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.views;

import android.view.MotionEvent;

class TrackEntityView$7 implements Runnable
{
    final /* synthetic */ TrackEntityView this$0;
    final /* synthetic */ MotionEvent val$motionEvent;
    
    TrackEntityView$7(final TrackEntityView this$0, final MotionEvent val$motionEvent) {
        this.this$0 = this$0;
        this.val$motionEvent = val$motionEvent;
    }
    
    public void run() {
        if (TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0) != null) {
            TrackEntityView.-$$Nest$fgetselectedEntity(this.this$0).setDownX(this.val$motionEvent.getX());
        }
        TrackEntityView.-$$Nest$fputonThink(this.this$0, true);
        TrackEntityView.-$$Nest$fputpass(this.this$0, false);
        TrackEntityView.-$$Nest$fputisCheckLineCursur(this.this$0, false);
    }
}
