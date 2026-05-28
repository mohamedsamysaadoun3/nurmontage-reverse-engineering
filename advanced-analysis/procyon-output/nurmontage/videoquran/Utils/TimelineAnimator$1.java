// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

class TimelineAnimator$1 implements Runnable
{
    final /* synthetic */ TimelineAnimator this$0;
    
    TimelineAnimator$1(final TimelineAnimator this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        if (!TimelineAnimator.-$$Nest$fgetisRunning(this.this$0)) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final int n = (int)(currentTimeMillis - TimelineAnimator.-$$Nest$fgetlastFrameTime(this.this$0));
        TimelineAnimator.-$$Nest$fputlastFrameTime(this.this$0, currentTimeMillis);
        final TimelineAnimator this$0 = this.this$0;
        TimelineAnimator.-$$Nest$fputcurrentTimeMs(this$0, TimelineAnimator.-$$Nest$fgetcurrentTimeMs(this$0) + n);
        if (TimelineAnimator.-$$Nest$fgetcurrentTimeMs(this.this$0) >= TimelineAnimator.-$$Nest$fgetmaxTimeMs(this.this$0)) {
            final TimelineAnimator this$2 = this.this$0;
            TimelineAnimator.-$$Nest$fputcurrentTimeMs(this$2, TimelineAnimator.-$$Nest$fgetmaxTimeMs(this$2));
            TimelineAnimator.-$$Nest$fgetlistener(this.this$0).onUpdate(TimelineAnimator.-$$Nest$fgetcurrentTimeMs(this.this$0));
            TimelineAnimator.-$$Nest$fgetlistener(this.this$0).onEnd();
            TimelineAnimator.-$$Nest$fputisRunning(this.this$0, false);
            return;
        }
        TimelineAnimator.-$$Nest$fgetlistener(this.this$0).onUpdate(TimelineAnimator.-$$Nest$fgetcurrentTimeMs(this.this$0));
        TimelineAnimator.-$$Nest$mpostFrame(this.this$0);
    }
}
