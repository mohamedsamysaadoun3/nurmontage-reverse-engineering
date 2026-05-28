// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.view.Choreographer;
import java.io.File;
import java.util.Locale;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import hazem.nurmontage.videoquran.model.Template;
import android.view.Choreographer$FrameCallback;

public class SmoothVideoAnimator implements Choreographer$FrameCallback
{
    private final int FPS;
    private int currentFrameIndex;
    private final long frameIntervalNanos;
    private long lastFrameTimeNanos;
    private final SmoothVideoAnimator$FrameUpdateListener listener;
    private boolean mIsPlaying;
    private final Template mTemplate;
    private int maxFrameIndex;
    private final TrackEntityView trackViewEntity;
    
    public SmoothVideoAnimator(final TrackEntityView trackViewEntity, final Template mTemplate, final int fps, final SmoothVideoAnimator$FrameUpdateListener listener) {
        this.lastFrameTimeNanos = 0L;
        this.trackViewEntity = trackViewEntity;
        this.mTemplate = mTemplate;
        this.FPS = fps;
        this.listener = listener;
        this.frameIntervalNanos = (long)(1.0E9f / fps);
    }
    
    private String buildFrameFilePath(final int i) {
        return String.format(Locale.US, "frame_%04d.jpg", i);
    }
    
    public void doFrame(final long n) {
        if (this.mIsPlaying) {
            if (this.maxFrameIndex != 0) {
                if (this.lastFrameTimeNanos == 0L) {
                    this.lastFrameTimeNanos = n;
                }
                if (n - this.lastFrameTimeNanos >= this.frameIntervalNanos) {
                    this.lastFrameTimeNanos = n;
                    this.listener.onFrameUpdate(new File(this.mTemplate.getFolder_template() + "/VideoFrame", this.buildFrameFilePath(this.currentFrameIndex)).getAbsolutePath());
                    this.currentFrameIndex = this.currentFrameIndex++ % this.maxFrameIndex + 1;
                }
                Choreographer.getInstance().postFrameCallback((Choreographer$FrameCallback)this);
            }
        }
    }
    
    public void start() {
        final int n = 1;
        this.mIsPlaying = (n != 0);
        this.currentFrameIndex = Math.max(n, Math.round(this.trackViewEntity.getCurrent_cursur_position() / 1000.0f * this.FPS));
        this.maxFrameIndex = this.mTemplate.getDuration_video_media() * this.FPS;
        this.lastFrameTimeNanos = 0L;
        Choreographer.getInstance().postFrameCallback((Choreographer$FrameCallback)this);
    }
    
    public void stop() {
        this.mIsPlaying = false;
        Choreographer.getInstance().removeFrameCallback((Choreographer$FrameCallback)this);
        final SmoothVideoAnimator$FrameUpdateListener listener = this.listener;
        if (listener != null) {
            listener.onAnimationEnd();
        }
    }
}
