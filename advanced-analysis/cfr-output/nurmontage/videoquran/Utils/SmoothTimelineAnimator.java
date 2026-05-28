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
import hazem.nurmontage.videoquran.Utils.SmoothTimelineAnimator$1;
import hazem.nurmontage.videoquran.Utils.SmoothTimelineAnimator$AnimatorListener;

public class SmoothTimelineAnimator {
    private int currentTimeMs;
    private final Choreographer.FrameCallback frameCallback;
    private boolean isRunning;
    private final SmoothTimelineAnimator$AnimatorListener listener;
    private final int maxTimeMs;
    private int startCursorMs;
    private long startTimeMs;

    static /* bridge */ /* synthetic */ int cfr_renamed_524(SmoothTimelineAnimator smoothTimelineAnimator) {
        return smoothTimelineAnimator.currentTimeMs;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_525(SmoothTimelineAnimator smoothTimelineAnimator) {
        return smoothTimelineAnimator.isRunning;
    }

    static /* bridge */ /* synthetic */ SmoothTimelineAnimator$AnimatorListener cfr_renamed_527(SmoothTimelineAnimator smoothTimelineAnimator) {
        return smoothTimelineAnimator.listener;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_528(SmoothTimelineAnimator smoothTimelineAnimator) {
        return smoothTimelineAnimator.maxTimeMs;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_534(SmoothTimelineAnimator smoothTimelineAnimator) {
        return smoothTimelineAnimator.startCursorMs;
    }

    static /* bridge */ /* synthetic */ long cfr_renamed_533(SmoothTimelineAnimator smoothTimelineAnimator) {
        return smoothTimelineAnimator.startTimeMs;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_529(SmoothTimelineAnimator smoothTimelineAnimator, int n) {
        smoothTimelineAnimator.currentTimeMs = n;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_530(SmoothTimelineAnimator smoothTimelineAnimator, boolean bl) {
        smoothTimelineAnimator.isRunning = bl;
    }

    public SmoothTimelineAnimator(int n, int n2, SmoothTimelineAnimator$AnimatorListener smoothTimelineAnimator$AnimatorListener) {
        SmoothTimelineAnimator$1 smoothTimelineAnimator$1 = new SmoothTimelineAnimator$1(this);
        this.frameCallback = smoothTimelineAnimator$1;
        this.startCursorMs = n;
        this.maxTimeMs = n2;
        this.listener = smoothTimelineAnimator$AnimatorListener;
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
        this.startTimeMs = l = SystemClock.uptimeMillis();
        Choreographer choreographer = Choreographer.getInstance();
        Choreographer.FrameCallback frameCallback = this.frameCallback;
        choreographer.postFrameCallback(frameCallback);
    }

    public void stop() {
        this.isRunning = false;
        Choreographer choreographer = Choreographer.getInstance();
        Choreographer.FrameCallback frameCallback = this.frameCallback;
        choreographer.removeFrameCallback(frameCallback);
    }
}

