/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package hazem.nurmontage.videoquran.Utils;

import android.os.Handler;
import hazem.nurmontage.videoquran.Utils.TimelineAnimator$1;
import hazem.nurmontage.videoquran.Utils.TimelineAnimator$AnimatorListener;

public class TimelineAnimator {
    private int currentTimeMs;
    private final Handler handler;
    private boolean isRunning;
    private long lastFrameTime;
    private final TimelineAnimator$AnimatorListener listener;
    private int maxTimeMs;
    private int startTimeMs;
    private final Runnable updateRunnable;

    static /* bridge */ /* synthetic */ int cfr_renamed_524(TimelineAnimator timelineAnimator) {
        return timelineAnimator.currentTimeMs;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_525(TimelineAnimator timelineAnimator) {
        return timelineAnimator.isRunning;
    }

    static /* bridge */ /* synthetic */ long cfr_renamed_526(TimelineAnimator timelineAnimator) {
        return timelineAnimator.lastFrameTime;
    }

    static /* bridge */ /* synthetic */ TimelineAnimator$AnimatorListener cfr_renamed_527(TimelineAnimator timelineAnimator) {
        return timelineAnimator.listener;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_528(TimelineAnimator timelineAnimator) {
        return timelineAnimator.maxTimeMs;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_529(TimelineAnimator timelineAnimator, int n) {
        timelineAnimator.currentTimeMs = n;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_530(TimelineAnimator timelineAnimator, boolean bl) {
        timelineAnimator.isRunning = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_531(TimelineAnimator timelineAnimator, long l) {
        timelineAnimator.lastFrameTime = l;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_532(TimelineAnimator timelineAnimator) {
        timelineAnimator.postFrame();
    }

    public TimelineAnimator(int n, int n2, TimelineAnimator$AnimatorListener timelineAnimator$AnimatorListener) {
        TimelineAnimator$1 timelineAnimator$1 = new TimelineAnimator$1(this);
        this.updateRunnable = timelineAnimator$1;
        this.handler = timelineAnimator$1;
        this.startTimeMs = n;
        this.currentTimeMs = n;
        this.maxTimeMs = n2;
        this.listener = timelineAnimator$AnimatorListener;
    }

    private void postFrame() {
        Handler handler = this.handler;
        Runnable runnable = this.updateRunnable;
        handler.postDelayed(runnable, (long)16);
    }

    public int getCurrentTimeMs() {
        return this.currentTimeMs;
    }

    public boolean isRunning() {
        return this.isRunning;
    }

    public void start() {
        long l;
        this.isRunning = true;
        this.lastFrameTime = l = System.currentTimeMillis();
        this.postFrame();
    }

    public void stop() {
        this.isRunning = false;
        Handler handler = this.handler;
        Runnable runnable = this.updateRunnable;
        handler.removeCallbacks(runnable);
    }
}

