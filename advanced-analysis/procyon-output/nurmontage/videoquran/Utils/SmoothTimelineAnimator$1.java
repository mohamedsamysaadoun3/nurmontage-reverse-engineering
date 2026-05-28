// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.view.Choreographer;
import android.os.SystemClock;
import android.view.Choreographer$FrameCallback;

class SmoothTimelineAnimator$1 implements Choreographer$FrameCallback
{
    final /* synthetic */ SmoothTimelineAnimator this$0;
    
    SmoothTimelineAnimator$1(final SmoothTimelineAnimator this$0) {
        this.this$0 = this$0;
    }
    
    public void doFrame(long uptimeMillis) {
        if (!SmoothTimelineAnimator.-$$Nest$fgetisRunning(this.this$0)) {
            return;
        }
        uptimeMillis = SystemClock.uptimeMillis();
        uptimeMillis -= SmoothTimelineAnimator.-$$Nest$fgetstartTimeMs(this.this$0);
        final int n = (int)uptimeMillis;
        final SmoothTimelineAnimator this$0 = this.this$0;
        SmoothTimelineAnimator.-$$Nest$fputcurrentTimeMs(this$0, SmoothTimelineAnimator.-$$Nest$fgetstartCursorMs(this$0) + n);
        if (SmoothTimelineAnimator.-$$Nest$fgetcurrentTimeMs(this.this$0) >= SmoothTimelineAnimator.-$$Nest$fgetmaxTimeMs(this.this$0)) {
            SmoothTimelineAnimator.-$$Nest$fgetlistener(this.this$0).onUpdate(SmoothTimelineAnimator.-$$Nest$fgetmaxTimeMs(this.this$0));
            SmoothTimelineAnimator.-$$Nest$fgetlistener(this.this$0).onEnd();
            SmoothTimelineAnimator.-$$Nest$fputisRunning(this.this$0, false);
            return;
        }
        SmoothTimelineAnimator.-$$Nest$fgetlistener(this.this$0).onUpdate(SmoothTimelineAnimator.-$$Nest$fgetcurrentTimeMs(this.this$0));
        Choreographer.getInstance().postFrameCallback((Choreographer$FrameCallback)this);
    }
}
