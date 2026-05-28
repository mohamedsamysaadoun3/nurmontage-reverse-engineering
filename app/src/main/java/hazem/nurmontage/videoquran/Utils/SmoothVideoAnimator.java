package hazem.nurmontage.videoquran.Utils;

import android.view.Choreographer;
import hazem.nurmontage.videoquran.model.Template;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import java.io.File;
import java.util.Locale;

/* loaded from: classes2.dex */
public class SmoothVideoAnimator implements Choreographer.FrameCallback {
    private final int FPS;
    private int currentFrameIndex;
    private final long frameIntervalNanos;
    private long lastFrameTimeNanos = 0;
    private final FrameUpdateListener listener;
    private boolean mIsPlaying;
    private final Template mTemplate;
    private int maxFrameIndex;
    private final TrackEntityView trackViewEntity;

    public interface FrameUpdateListener {
        void onAnimationEnd();

        void onFrameUpdate(String textValue);
    }

    public SmoothVideoAnimator(TrackEntityView trackEntityView, Template template, int resId, FrameUpdateListener frameUpdateListener) {
        this.trackViewEntity = trackEntityView;
        this.mTemplate = template;
        this.FPS = resId;
        this.listener = frameUpdateListener;
        this.frameIntervalNanos = (long) (1.0E9f / resId);
    }

    public void start() {
        this.mIsPlaying = true;
        this.currentFrameIndex = Math.max(1, Math.round((this.trackViewEntity.getCurrent_cursur_position() / 1000.0f) * this.FPS));
        this.maxFrameIndex = this.mTemplate.getDuration_video_media() * this.FPS;
        this.lastFrameTimeNanos = 0L;
        Choreographer.getInstance().postFrameCallback(this);
    }

    public void stop() {
        this.mIsPlaying = false;
        Choreographer.getInstance().removeFrameCallback(this);
        FrameUpdateListener frameUpdateListener = this.listener;
        if (frameUpdateListener != null) {
            frameUpdateListener.onAnimationEnd();
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (!this.mIsPlaying || this.maxFrameIndex == 0) {
            return;
        }
        if (this.lastFrameTimeNanos == 0) {
            this.lastFrameTimeNanos = j;
        }
        if (j - this.lastFrameTimeNanos >= this.frameIntervalNanos) {
            this.lastFrameTimeNanos = j;
            this.listener.onFrameUpdate(new File(this.mTemplate.getFolder_template() + "/VideoFrame", buildFrameFilePath(this.currentFrameIndex)).getAbsolutePath());
            int resId = this.currentFrameIndex;
            this.currentFrameIndex = resId + 1;
            this.currentFrameIndex = (resId % this.maxFrameIndex) + 1;
        }
        Choreographer.getInstance().postFrameCallback(this);
    }

    private String buildFrameFilePath(int resId) {
        return String.format(Locale.US, "frame_%04d.jpg", Integer.valueOf(resId));
    }
}
