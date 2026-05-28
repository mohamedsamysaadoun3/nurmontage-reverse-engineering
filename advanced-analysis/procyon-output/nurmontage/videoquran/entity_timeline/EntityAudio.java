// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.entity_timeline;

import android.graphics.PointF;
import java.util.Collection;
import java.util.ArrayList;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.graphics.RectF;
import android.graphics.Bitmap;
import android.net.Uri;
import hazem.nurmontage.videoquran.Utils.WaveformBitmapRenderer;
import java.util.List;
import android.graphics.Path;
import android.graphics.Paint;
import android.animation.ObjectAnimator;
import android.media.MediaPlayer;
import hazem.nurmontage.videoquran.views.TrackEntityView$ITrimLineCallback;
import hazem.nurmontage.videoquran.model.EffectAudio;

public class EntityAudio extends Entity
{
    private float[] amps;
    private float downX;
    private int duration;
    private EffectAudio effectAudio;
    private float h;
    private TrackEntityView$ITrimLineCallback iTrimLineCallback;
    private boolean isApplyEffectInPreview;
    private boolean isPlay;
    private boolean isStartFadeIn;
    private boolean isStartFadeOut;
    private float lastLeft;
    private float lastRight;
    private MediaPlayer mediaPlayer;
    private int min_duration;
    private ObjectAnimator objectAnimator;
    private Paint paintLine;
    private Paint paintPath;
    private Path path;
    private String path_ffmpeg;
    private String path_ffmpeg_effect;
    private List paths_http;
    WaveformBitmapRenderer renderer;
    private float scaleEffect;
    private float second_in_screen;
    private float tmpOffset;
    private Uri uri;
    private String video_path;
    public byte[] waveformValues;
    
    public EntityAudio(final Bitmap bitmap, final Uri uri, float width, final float n, float n2, final float n3, final float max, final float second_in_screen, final int n4) {
        super(n2);
        this.effectAudio = new EffectAudio();
        this.setOffset_right(0.0f);
        this.setOffset(0.0f);
        this.duration = n4 * 1000;
        this.end = (float)n4;
        this.second_in_screen = second_in_screen;
        final boolean visible = true;
        this.setVisible(visible);
        this.uri = uri;
        this.max = max;
        this.h = n2;
        this.rect = new RectF(width, n, n3, n2);
        this.left = this.rect.left;
        this.right = this.rect.right;
        this.color = -3042963;
        (this.paintLine = new Paint((int)(visible ? 1 : 0))).setColor(-2434342);
        this.paintLine.setStyle(Paint$Style.STROKE);
        final Paint paintLine = this.paintLine;
        width = 0.01f * n2;
        paintLine.setStrokeWidth(width);
        (this.paintPath = new Paint((int)(visible ? 1 : 0))).setColor(-1236326096);
        this.paintPath.setStyle(Paint$Style.FILL);
        this.path = new Path();
        width = 0.46f * n2;
        this.rectFLeft = new RectF(0.0f, 0.0f, width, n2);
        width = this.rectFLeft.width();
        this.rectFRight = new RectF(0.0f, 0.0f, width, n2);
        this.round = this.rectFRight.width() * 0.5f;
        n2 *= 0.07f;
        this.padding = n2;
    }
    
    public EntityAudio(final Bitmap bitmap, final Uri uri, float strokeWidth, final float n, float n2, final float n3, final float max, final float second_in_screen, final int n4, final float offset, final float offset_right, final float offset_left) {
        super(n2);
        this.effectAudio = new EffectAudio();
        this.setOffset_right(offset_right);
        this.setOffset(offset);
        this.setOffset_left(offset_left);
        this.duration = n4 * 1000;
        this.end = (float)n4;
        this.second_in_screen = second_in_screen;
        final boolean visible = true;
        this.setVisible(visible);
        this.uri = uri;
        this.max = max;
        this.h = n2;
        this.rect = new RectF(strokeWidth, n, n3, n2);
        this.left = this.rect.left;
        this.right = this.rect.right;
        this.color = -3042963;
        (this.paintLine = new Paint((int)(visible ? 1 : 0))).setColor(-2434342);
        this.paintLine.setStyle(Paint$Style.STROKE);
        final Paint paintLine = this.paintLine;
        strokeWidth = 0.01f * n2;
        paintLine.setStrokeWidth(strokeWidth);
        (this.paintPath = new Paint((int)(visible ? 1 : 0))).setColor(-1236326096);
        this.paintPath.setStyle(Paint$Style.FILL);
        this.path = new Path();
        this.rectFLeft = new RectF(0.0f, 0.0f, 0.46f * n2, n2);
        this.rectFRight = new RectF(0.0f, 0.0f, this.rectFLeft.width(), n2);
        this.round = this.rectFRight.width() * 0.5f;
        n2 *= 0.07f;
        this.padding = n2;
    }
    
    private void drawWave(final Canvas canvas, final RectF rectF) {
        if (this.amps != null) {
            if (this.renderer != null) {
                this.renderer.draw(canvas, rectF, this.getmScaleFactor() + this.getScaleEffect(), this.getOffset() + this.getOffset_left() + this.tmpOffset);
            }
        }
    }
    
    public void addPathHttp(final List list) {
        if (list == null) {
            return;
        }
        if (this.paths_http == null) {
            this.paths_http = new ArrayList();
        }
        this.paths_http.addAll(list);
    }
    
    @Override
    public boolean contains(final PointF pointF) {
        if (this.isSelect) {
            this.onTouch(pointF);
        }
        return this.isSelect = this.rect.contains(pointF.x, pointF.y);
    }
    
    @Override
    public void draw(final Canvas canvas) {
        try {
            this.drawWave(canvas, this.rect);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void draw(final Canvas canvas, final int n, final int n2) {
        try {
            this.drawWave(canvas, this.rect);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public float[] getAmps() {
        return this.amps;
    }
    
    @Override
    public float getDownX() {
        return this.downX;
    }
    
    public int getDuration() {
        return this.duration;
    }
    
    public EffectAudio getEffectAudio() {
        return this.effectAudio;
    }
    
    public float getEnd() {
        return this.end;
    }
    
    @Override
    public float getH() {
        return this.h;
    }
    
    @Override
    public float getLeft() {
        return this.left;
    }
    
    public float getMax() {
        return this.max;
    }
    
    public MediaPlayer getMediaPlayer() {
        return this.mediaPlayer;
    }
    
    public int getMin_duration() {
        return this.min_duration;
    }
    
    public String getPath_ffmpeg() {
        return this.path_ffmpeg;
    }
    
    public String getPath_ffmpeg_effect() {
        return this.path_ffmpeg_effect;
    }
    
    public List getPaths_http() {
        return this.paths_http;
    }
    
    @Override
    public RectF getRect() {
        return this.rect;
    }
    
    public WaveformBitmapRenderer getRenderer() {
        return this.renderer;
    }
    
    @Override
    public float getRight() {
        return this.right;
    }
    
    public float getScaleEffect() {
        return this.scaleEffect;
    }
    
    @Override
    public float getSecond_in_screen() {
        return this.second_in_screen * this.getmScaleFactor();
    }
    
    @Override
    public RectF getSelectTrim() {
        return this.selectTrim;
    }
    
    public float getStart() {
        return this.start;
    }
    
    @Override
    public int getTrim_type() {
        return this.trim_type;
    }
    
    public Uri getUri() {
        return this.uri;
    }
    
    public String getVideo_path() {
        return this.video_path;
    }
    
    public boolean isApplyEffectInPreview() {
        return this.isApplyEffectInPreview;
    }
    
    public boolean isPlay() {
        return this.isPlay;
    }
    
    public boolean isStartFadeIn() {
        return this.isStartFadeIn;
    }
    
    public boolean isStartFadeOut() {
        return this.isStartFadeOut;
    }
    
    public boolean isVisible() {
        return this.isVisible;
    }
    
    @Override
    public boolean onTouch(final PointF pointF) {
        this.selectTrim = null;
        this.downX = pointF.x;
        this.trim_type = -1;
        final boolean contains = this.rectFLeft.contains(pointF.x, pointF.y);
        final boolean isSelect = true;
        if (contains) {
            this.selectTrim = this.rectFLeft;
            this.trim_type = 0;
            this.isSelect = isSelect;
        }
        else if (this.rectFRight.contains(pointF.x, pointF.y)) {
            this.selectTrim = this.rectFRight;
            this.trim_type = (isSelect ? 1 : 0);
            this.isSelect = isSelect;
        }
        return isSelect;
    }
    
    @Override
    public void onUpLeft() {
        this.start = (float)Math.round(Math.abs(Math.round(this.getRect().left / this.getSecond_in_screen() * 1000.0f)) - this.getOnTapTime() + this.getStart());
        this.setOffset_left(this.getOffset_left() + this.tmpOffset);
        this.tmpOffset = 0.0f;
        final float start = this.start;
        final float start2 = (float)this.min_duration;
        if (start < start2) {
            this.start = start2;
        }
        this.left = this.lastLeft;
    }
    
    @Override
    public void onUpRight() {
        final float n = Math.round(this.getRect().right / this.getSecond_in_screen()) * 1000 - this.getOnTapTime();
        this.setOffset_right(this.getRect().left / this.getmScaleFactor() - this.getOffset_left() + this.getMax() - this.getRect().right / this.getmScaleFactor());
        this.end += n;
        final float end = this.end;
        final int duration = this.duration;
        if (end > duration) {
            this.end = (float)duration;
        }
        this.right = this.lastRight;
    }
    
    @Override
    public void release() {
        super.release();
        try {
            final MediaPlayer mediaPlayer = this.mediaPlayer;
            Label_0049: {
                if (mediaPlayer == null) {
                    break Label_0049;
                }
                Label_0031: {
                    if (!mediaPlayer.isPlaying()) {
                        break Label_0031;
                    }
                    final MediaPlayer mediaPlayer2 = this.mediaPlayer;
                    try {
                        mediaPlayer2.pause();
                        final MediaPlayer mediaPlayer3 = this.mediaPlayer;
                        try {
                            mediaPlayer3.release();
                            this.mediaPlayer = null;
                            final WaveformBitmapRenderer renderer = this.renderer;
                            if (renderer != null) {
                                renderer.release();
                            }
                        }
                        catch (final Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                    catch (final Exception ex2) {}
                }
            }
        }
        catch (final Exception ex3) {}
    }
    
    public void setAmps(final float[] amps) {
        this.amps = amps;
    }
    
    public void setAmps(final float[] amps, final int n, final int n2) {
        this.amps = amps;
        this.renderer = new WaveformBitmapRenderer(amps, n, n2, -11394781);
    }
    
    public void setApplyEffectInPreview(final boolean isApplyEffectInPreview) {
        this.isApplyEffectInPreview = isApplyEffectInPreview;
    }
    
    @Override
    public void setDownX(final float downX) {
        this.downX = downX;
    }
    
    public void setDuration(final int duration) {
        this.duration = duration;
    }
    
    public void setEffectAudio(final EffectAudio effectAudio) {
        if (effectAudio == null) {
            return;
        }
        this.effectAudio.setReverbPreset(effectAudio.getReverbPreset());
        this.effectAudio.setSpeed(effectAudio.getSpeed());
        this.effectAudio.setVolume(effectAudio.getVolume());
        this.effectAudio.setFade_in(effectAudio.getFade_in());
        this.effectAudio.setFade_out(effectAudio.getFade_out());
        this.effectAudio.setDecays(effectAudio.getDecays());
        this.effectAudio.setRemoveNoice(effectAudio.isRemoveNoice());
        this.effectAudio.setDelays_cmd(effectAudio.getDelays_cmd());
        this.effectAudio.setDelays(effectAudio.getDelays());
        this.effectAudio.setDecays_cmd(effectAudio.getDecays_cmd());
        this.effectAudio.setOutGain(effectAudio.getOutGain());
        this.effectAudio.setVolume_echo(effectAudio.getVolume_echo());
        this.effectAudio.setEnhance(effectAudio.isEnhance());
        this.effectAudio.setReverbPreset_index_list(effectAudio.getReverbPreset_index_list());
    }
    
    public void setEnd(final float end) {
        this.end = end;
    }
    
    public void setFadeInDelta(final float n) {
        final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
        if (iTrimLineCallback != null) {
            iTrimLineCallback.fadeInAudio(n);
        }
    }
    
    public void setFadeOutDelta(final float n) {
        final TrackEntityView$ITrimLineCallback iTrimLineCallback = this.iTrimLineCallback;
        if (iTrimLineCallback != null) {
            iTrimLineCallback.fadeOutAudio(n);
        }
    }
    
    @Override
    public void setLastLeft(final float lastLeft) {
        this.lastLeft = lastLeft;
    }
    
    @Override
    public void setLastRight(final float lastRight) {
        this.lastRight = lastRight;
    }
    
    public void setMax(final float max) {
        this.max = max;
    }
    
    public void setMediaPlayer(final MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }
    
    public void setMin_duration(final int min_duration) {
        this.min_duration = min_duration;
    }
    
    public void setPathHttp(final List paths_http) {
        this.paths_http = paths_http;
    }
    
    public void setPath_ffmpeg(final String path_ffmpeg) {
        this.setPath_ffmpeg_effect(this.path_ffmpeg = path_ffmpeg);
    }
    
    public void setPath_ffmpeg_effect(final String path_ffmpeg_effect) {
        this.path_ffmpeg_effect = path_ffmpeg_effect;
    }
    
    public void setPlay(final boolean isPlay) {
        this.isPlay = isPlay;
    }
    
    public void setRenderer(final WaveformBitmapRenderer renderer) {
        this.renderer = renderer;
    }
    
    @Override
    public void setRight(final float n) {
        this.rect.right = n;
        this.right = n;
    }
    
    public void setScaleEffect(final float scaleEffect) {
        this.scaleEffect = scaleEffect;
    }
    
    @Override
    public void setSecond_in_screen(final float second_in_screen) {
        this.second_in_screen = second_in_screen;
    }
    
    @Override
    public void setSelect(final boolean isSelect) {
        this.isSelect = isSelect;
    }
    
    public void setStart(final float start) {
        this.start = start;
    }
    
    public void setStartFadeIn(final boolean isStartFadeIn) {
        this.isStartFadeIn = isStartFadeIn;
    }
    
    public void setStartFadeOut(final boolean isStartFadeOut) {
        this.isStartFadeOut = isStartFadeOut;
    }
    
    public void setVideo_path(final String video_path) {
        this.video_path = video_path;
    }
    
    @Override
    public void setVisible(final boolean isVisible) {
        this.isVisible = isVisible;
    }
    
    @Override
    public void setX(float n) {
        if (n < 0.0f) {
            n = 0.0f;
        }
        this.left = n;
        this.rect.left = n;
    }
    
    @Override
    public void setY(final float top) {
        this.rect.top = top;
        this.rect.bottom = this.h + this.rect.top;
    }
    
    public void setiTrimLineCallback(final TrackEntityView$ITrimLineCallback iTrimLineCallback) {
        this.iTrimLineCallback = iTrimLineCallback;
    }
    
    public EntityAudio split(float n) {
        final EntityAudio entityAudio = new EntityAudio(null, this.uri, n, this.getRect().top, this.h, this.getRect().right, this.getRect().right / this.getmScaleFactor() + this.getOffset_right() - n / this.getmScaleFactor(), this.getSecond_in_screen(), (int)(this.getDuration() / 1000.0f), 0.0f, 0.0f, 0.0f);
        n = this.getFade_out();
        entityAudio.setFade_out(n);
        n = this.getFade_in();
        entityAudio.setFade_in(n);
        entityAudio.getRect().bottom = this.getRect().bottom;
        return entityAudio;
    }
    
    public void startFadeIn() {
        final ObjectAnimator objectAnimator = this.objectAnimator;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        final float n = this.getFade_in() * 1000.0f;
        final float[] array2;
        final float[] array = array2 = new float[2];
        array2[0] = 0.0f;
        array2[1] = 1.0f;
        (this.objectAnimator = ObjectAnimator.ofFloat((Object)this, "FadeInDelta", array)).setDuration((long)(int)n);
        this.objectAnimator.start();
    }
    
    public void startFadeOut() {
        final ObjectAnimator objectAnimator = this.objectAnimator;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        final float n = this.getFade_out() * 1000.0f;
        final float[] array2;
        final float[] array = array2 = new float[2];
        array2[0] = 1.0f;
        array2[1] = 0.0f;
        (this.objectAnimator = ObjectAnimator.ofFloat((Object)this, "FadeOutDelta", array)).setDuration((long)n);
        this.objectAnimator.start();
    }
    
    public void updateEffect() {
        this.effectAudio.setStart(this.getStart());
        this.effectAudio.setEnd(this.getEnd());
        this.effectAudio.setDuration((int)(this.getEnd() - this.getStart()));
    }
    
    @Override
    public void updateStartTrim() {
        this.tmpOffset = Math.abs(this.getRect().left / this.getmScaleFactor()) - Math.abs(this.getOnDown() / this.getmScaleFactor());
    }
}
