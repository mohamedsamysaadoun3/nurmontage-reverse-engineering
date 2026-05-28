/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.Utils;

import hazem.nurmontage.videoquran.Utils.TimelineAnimator;

class TimelineAnimator$1
implements Runnable {
    final /* synthetic */ TimelineAnimator this$0;

    TimelineAnimator$1(TimelineAnimator timelineAnimator) {
        this.this$0 = timelineAnimator;
    }

    public void run() {
        Object object = this.this$0;
        int n = TimelineAnimator.cfr_renamed_525((TimelineAnimator)object);
        if (n == 0) {
            return;
        }
        long l = System.currentTimeMillis();
        TimelineAnimator timelineAnimator = this.this$0;
        long l2 = TimelineAnimator.cfr_renamed_526(timelineAnimator);
        l2 = l - l2;
        int n2 = (int)l2;
        TimelineAnimator timelineAnimator2 = this.this$0;
        TimelineAnimator.cfr_renamed_531(timelineAnimator2, l);
        object = this.this$0;
        int n3 = TimelineAnimator.cfr_renamed_524((TimelineAnimator)object) + n2;
        TimelineAnimator.cfr_renamed_529((TimelineAnimator)object, n3);
        object = this.this$0;
        n = TimelineAnimator.cfr_renamed_524((TimelineAnimator)object);
        TimelineAnimator timelineAnimator3 = this.this$0;
        n3 = TimelineAnimator.cfr_renamed_528(timelineAnimator3);
        if (n >= n3) {
            object = this.this$0;
            n3 = TimelineAnimator.cfr_renamed_528((TimelineAnimator)object);
            TimelineAnimator.cfr_renamed_529((TimelineAnimator)object, n3);
            object = TimelineAnimator.cfr_renamed_527(this.this$0);
            n3 = TimelineAnimator.cfr_renamed_524(this.this$0);
            object.onUpdate(n3);
            TimelineAnimator.cfr_renamed_527(this.this$0).onEnd();
            TimelineAnimator.cfr_renamed_530(this.this$0, false);
            return;
        }
        object = TimelineAnimator.cfr_renamed_527(this.this$0);
        n3 = TimelineAnimator.cfr_renamed_524(this.this$0);
        object.onUpdate(n3);
        TimelineAnimator.cfr_renamed_532(this.this$0);
    }
}

