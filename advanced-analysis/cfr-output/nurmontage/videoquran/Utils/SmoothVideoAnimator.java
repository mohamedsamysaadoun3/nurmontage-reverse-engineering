/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 */
package hazem.nurmontage.videoquran.Utils;

import android.view.Choreographer;
import hazem.nurmontage.videoquran.Utils.SmoothVideoAnimator$FrameUpdateListener;
import hazem.nurmontage.videoquran.model.Template;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import java.io.File;
import java.util.Locale;

public class SmoothVideoAnimator
implements Choreographer.FrameCallback {
    private final int FPS;
    private int currentFrameIndex;
    private final long frameIntervalNanos;
    private long lastFrameTimeNanos = 0L;
    private final SmoothVideoAnimator$FrameUpdateListener listener;
    private boolean mIsPlaying;
    private final Template mTemplate;
    private int maxFrameIndex;
    private final TrackEntityView trackViewEntity;

    public SmoothVideoAnimator(TrackEntityView trackEntityView, Template template, int n, SmoothVideoAnimator$FrameUpdateListener smoothVideoAnimator$FrameUpdateListener) {
        long l;
        this.trackViewEntity = trackEntityView;
        this.mTemplate = template;
        this.FPS = n;
        this.listener = smoothVideoAnimator$FrameUpdateListener;
        float f = n;
        this.frameIntervalNanos = l = (long)(1.0E9f / f);
    }

    private String buildFrameFilePath(int n) {
        Locale locale = Locale.US;
        Object[] objectArray = Integer.valueOf(n);
        objectArray = new Object[]{objectArray};
        return String.format(locale, "frame_%04d.jpg", objectArray);
    }

    public void doFrame(long l) {
        int n = this.mIsPlaying;
        if (n != 0 && (n = this.maxFrameIndex) != 0) {
            Object object;
            long l2 = this.lastFrameTimeNanos;
            long l3 = 0L;
            long l4 = l2 - l3;
            n = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (n == 0) {
                this.lastFrameTimeNanos = l;
            }
            l2 = this.lastFrameTimeNanos;
            l3 = this.frameIntervalNanos;
            long l5 = (l2 = l - l2) - l3;
            n = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
            if (n >= 0) {
                int n2;
                this.lastFrameTimeNanos = l;
                int n3 = this.currentFrameIndex;
                object = this.buildFrameFilePath(n3);
                SmoothVideoAnimator$FrameUpdateListener smoothVideoAnimator$FrameUpdateListener = this.listener;
                CharSequence charSequence = new StringBuilder();
                String string2 = this.mTemplate.getFolder_template();
                charSequence = charSequence.append(string2);
                string2 = "/VideoFrame";
                charSequence = charSequence.append(string2).toString();
                File file = new File((String)charSequence, (String)object);
                object = file.getAbsolutePath();
                smoothVideoAnimator$FrameUpdateListener.onFrameUpdate((String)object);
                n3 = this.currentFrameIndex;
                this.currentFrameIndex = n2 = n3 + 1;
                n2 = this.maxFrameIndex;
                this.currentFrameIndex = n3 = n3 % n2 + 1;
            }
            object = Choreographer.getInstance();
            object.postFrameCallback((Choreographer.FrameCallback)this);
        }
    }

    public void start() {
        int n = 1;
        this.mIsPlaying = n;
        float f = (float)this.trackViewEntity.getCurrent_cursur_position() / 1000.0f;
        float f2 = this.FPS;
        int n2 = Math.round(f * f2);
        this.currentFrameIndex = n = Math.max(n, n2);
        n = this.mTemplate.getDuration_video_media();
        n2 = this.FPS;
        this.maxFrameIndex = n *= n2;
        this.lastFrameTimeNanos = 0L;
        Choreographer.getInstance().postFrameCallback((Choreographer.FrameCallback)this);
    }

    public void stop() {
        this.mIsPlaying = false;
        Choreographer.getInstance().removeFrameCallback((Choreographer.FrameCallback)this);
        SmoothVideoAnimator$FrameUpdateListener smoothVideoAnimator$FrameUpdateListener = this.listener;
        if (smoothVideoAnimator$FrameUpdateListener != null) {
            smoothVideoAnimator$FrameUpdateListener.onAnimationEnd();
        }
    }
}

