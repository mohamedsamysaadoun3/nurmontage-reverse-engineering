// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.view.Choreographer;
import android.os.SystemClock;
import android.view.Choreographer$FrameCallback;

public class SmoothTimelineAnimator
{
    private int currentTimeMs;
    private final Choreographer$FrameCallback frameCallback;
    private boolean isRunning;
    private final SmoothTimelineAnimator$AnimatorListener listener;
    private final int maxTimeMs;
    private int startCursorMs;
    private long startTimeMs;
    
    public SmoothTimelineAnimator(final int startCursorMs, final int maxTimeMs, final SmoothTimelineAnimator$AnimatorListener listener) {
        this.frameCallback = (Choreographer$FrameCallback)new SmoothTimelineAnimator$1(this);
        this.startCursorMs = startCursorMs;
        this.maxTimeMs = maxTimeMs;
        this.listener = listener;
    }
    
    public int getCurrentTimeMs() {
        return this.currentTimeMs;
    }
    
    public boolean isRunning() {
        return this.isRunning;
    }
    
    public void start() {
        this.isRunning = true;
        this.startTimeMs = SystemClock.uptimeMillis();
        Choreographer.getInstance().postFrameCallback(this.frameCallback);
    }
    
    public void stop() {
        this.isRunning = false;
        Choreographer.getInstance().removeFrameCallback(this.frameCallback);
    }
}
