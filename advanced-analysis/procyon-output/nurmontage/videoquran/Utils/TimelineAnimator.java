// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.os.Handler;

public class TimelineAnimator
{
    private int currentTimeMs;
    private final Handler handler;
    private boolean isRunning;
    private long lastFrameTime;
    private final TimelineAnimator$AnimatorListener listener;
    private int maxTimeMs;
    private int startTimeMs;
    private final Runnable updateRunnable;
    
    public TimelineAnimator(final int n, final int maxTimeMs, final TimelineAnimator$AnimatorListener listener) {
        this.updateRunnable = new TimelineAnimator$1(this);
        this.handler = new Handler();
        this.startTimeMs = n;
        this.currentTimeMs = n;
        this.maxTimeMs = maxTimeMs;
        this.listener = listener;
    }
    
    private void postFrame() {
        this.handler.postDelayed(this.updateRunnable, (long)16);
    }
    
    public int getCurrentTimeMs() {
        return this.currentTimeMs;
    }
    
    public boolean isRunning() {
        return this.isRunning;
    }
    
    public void start() {
        this.isRunning = true;
        this.lastFrameTime = System.currentTimeMillis();
        this.postFrame();
    }
    
    public void stop() {
        this.isRunning = false;
        this.handler.removeCallbacks(this.updateRunnable);
    }
}
