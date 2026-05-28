/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 */
package hazem.nurmontage.videoquran.Utils;

import android.os.SystemClock;
import android.view.Choreographer;
import hazem.nurmontage.videoquran.Utils.SmoothTimelineAnimator;

class SmoothTimelineAnimator$1
implements Choreographer.FrameCallback {
    final /* synthetic */ SmoothTimelineAnimator this$0;

    SmoothTimelineAnimator$1(SmoothTimelineAnimator smoothTimelineAnimator) {
        this.this$0 = smoothTimelineAnimator;
    }

    public void doFrame(long l) {
        Object object = this.this$0;
        int n = SmoothTimelineAnimator.cfr_renamed_525((SmoothTimelineAnimator)object);
        if (n == 0) {
            return;
        }
        l = SystemClock.uptimeMillis();
        SmoothTimelineAnimator smoothTimelineAnimator = this.this$0;
        long l2 = SmoothTimelineAnimator.cfr_renamed_533(smoothTimelineAnimator);
        n = (int)(l -= l2);
        SmoothTimelineAnimator smoothTimelineAnimator2 = this.this$0;
        int n2 = SmoothTimelineAnimator.cfr_renamed_534(smoothTimelineAnimator2) + n;
        SmoothTimelineAnimator.cfr_renamed_529(smoothTimelineAnimator2, n2);
        object = this.this$0;
        n = SmoothTimelineAnimator.cfr_renamed_524((SmoothTimelineAnimator)object);
        smoothTimelineAnimator2 = this.this$0;
        int n3 = SmoothTimelineAnimator.cfr_renamed_528(smoothTimelineAnimator2);
        if (n >= n3) {
            object = SmoothTimelineAnimator.cfr_renamed_527(this.this$0);
            n3 = SmoothTimelineAnimator.cfr_renamed_528(this.this$0);
            object.onUpdate(n3);
            SmoothTimelineAnimator.cfr_renamed_527(this.this$0).onEnd();
            SmoothTimelineAnimator.cfr_renamed_530(this.this$0, false);
            return;
        }
        object = SmoothTimelineAnimator.cfr_renamed_527(this.this$0);
        n3 = SmoothTimelineAnimator.cfr_renamed_524(this.this$0);
        object.onUpdate(n3);
        Choreographer.getInstance().postFrameCallback((Choreographer.FrameCallback)this);
    }
}

