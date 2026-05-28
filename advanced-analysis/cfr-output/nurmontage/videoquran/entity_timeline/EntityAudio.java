/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.PointF
 *  android.graphics.RectF
 *  android.media.MediaPlayer
 *  android.net.Uri
 */
package hazem.nurmontage.videoquran.entity_timeline;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.media.MediaPlayer;
import android.net.Uri;
import hazem.nurmontage.videoquran.Utils.WaveformBitmapRenderer;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.model.EffectAudio;
import hazem.nurmontage.videoquran.views.TrackEntityView$ITrimLineCallback;
import java.util.ArrayList;
import java.util.List;

public class EntityAudio
extends Entity {
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

    public EntityAudio(Bitmap object, Uri uri, float f, float f2, float f3, float f4, float f5, float f6, int n) {
        super(f3);
        float f7;
        float f8;
        float f9;
        int n2;
        super();
        this.effectAudio = object;
        this.setOffset_right(0.0f);
        this.setOffset(0.0f);
        this.duration = n2 = n * 1000;
        this.end = f9 = (float)n;
        this.second_in_screen = f6;
        int n3 = 1;
        this.setVisible(n3 != 0);
        this.uri = uri;
        this.max = f5;
        this.h = f3;
        super(f, f2, f4, f3);
        this.rect = uri;
        this.left = f8 = this.rect.left;
        this.right = f8 = this.rect.right;
        this.color = -3042963;
        super(n3);
        this.paintLine = uri;
        uri.setColor(-2434342);
        uri = this.paintLine;
        Paint.Style style2 = Paint.Style.STROKE;
        uri.setStyle(style2);
        uri = this.paintLine;
        f = 0.01f * f3;
        uri.setStrokeWidth(f);
        super(n3);
        this.paintPath = uri;
        uri.setColor(-1236326096);
        uri = this.paintPath;
        style2 = Paint.Style.FILL;
        uri.setStyle(style2);
        super();
        this.path = uri;
        f = 0.46f * f3;
        super(0.0f, 0.0f, f, f3);
        this.rectFLeft = uri;
        f = this.rectFLeft.width();
        super(0.0f, 0.0f, f, f3);
        this.rectFRight = uri;
        this.round = f7 = this.rectFRight.width() * 0.5f;
        this.padding = f3 *= 0.07f;
    }

    public EntityAudio(Bitmap object, Uri uri, float f, float f2, float f3, float f4, float f5, float f6, int n, float f7, float f8, float f9) {
        super(f3);
        float f10;
        float f11;
        int n2;
        super();
        this.effectAudio = object;
        this.setOffset_right(f8);
        this.setOffset(f7);
        this.setOffset_left(f9);
        this.duration = n2 = n * 1000;
        this.end = f11 = (float)n;
        this.second_in_screen = f6;
        n2 = 1;
        this.setVisible(n2 != 0);
        this.uri = uri;
        this.max = f5;
        this.h = f3;
        super(f, f2, f4, f3);
        this.rect = uri;
        this.left = f10 = this.rect.left;
        this.right = f10 = this.rect.right;
        this.color = -3042963;
        super(n2);
        this.paintLine = uri;
        uri.setColor(-2434342);
        uri = this.paintLine;
        Paint.Style style2 = Paint.Style.STROKE;
        uri.setStyle(style2);
        uri = this.paintLine;
        f = 0.01f * f3;
        uri.setStrokeWidth(f);
        super(n2);
        this.paintPath = uri;
        uri.setColor(-1236326096);
        object = this.paintPath;
        uri = Paint.Style.FILL;
        object.setStyle((Paint.Style)uri);
        super();
        this.path = object;
        f10 = 0.46f * f3;
        super(0.0f, 0.0f, f10, f3);
        this.rectFLeft = object;
        f10 = this.rectFLeft.width();
        super(0.0f, 0.0f, f10, f3);
        this.rectFRight = object;
        this.round = f11 = this.rectFRight.width() * 0.5f;
        this.padding = f3 *= 0.07f;
    }

    private void drawWave(Canvas canvas, RectF rectF) {
        Object object = this.amps;
        if (object != null && (object = (Object)this.renderer) != null) {
            float f = this.getOffset();
            float f2 = this.getOffset_left();
            f += f2;
            f2 = this.tmpOffset;
            f += f2;
            f2 = this.getmScaleFactor();
            float f3 = this.getScaleEffect();
            WaveformBitmapRenderer waveformBitmapRenderer = this.renderer;
            waveformBitmapRenderer.draw(canvas, rectF, f2 += f3, f);
        }
    }

    public void addPathHttp(List list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = this.paths_http;
        if (arrayList == null) {
            this.paths_http = arrayList = new ArrayList();
        }
        this.paths_http.addAll(list);
    }

    public boolean contains(PointF pointF) {
        boolean bl;
        boolean bl2 = this.isSelect;
        if (bl2) {
            this.onTouch(pointF);
        }
        RectF rectF = this.rect;
        float f = pointF.x;
        float f2 = pointF.y;
        this.isSelect = bl = rectF.contains(f, f2);
        return this.isSelect;
    }

    public void draw(Canvas canvas) {
        RectF rectF = this.rect;
        try {
            this.drawWave(canvas, rectF);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void draw(Canvas canvas, int n, int n2) {
        RectF rectF = this.rect;
        try {
            this.drawWave(canvas, rectF);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public float[] getAmps() {
        return this.amps;
    }

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

    public float getH() {
        return this.h;
    }

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

    public RectF getRect() {
        return this.rect;
    }

    public WaveformBitmapRenderer getRenderer() {
        return this.renderer;
    }

    public float getRight() {
        return this.right;
    }

    public float getScaleEffect() {
        return this.scaleEffect;
    }

    public float getSecond_in_screen() {
        float f = this.second_in_screen;
        float f2 = this.getmScaleFactor();
        return f * f2;
    }

    public RectF getSelectTrim() {
        return this.selectTrim;
    }

    public float getStart() {
        return this.start;
    }

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

    public boolean onTouch(PointF pointF) {
        float f;
        this.selectTrim = null;
        this.downX = f = pointF.x;
        f = 0.0f / 0.0f;
        this.trim_type = -1;
        RectF rectF = this.rectFLeft;
        float f2 = pointF.x;
        float f3 = pointF.y;
        boolean bl = rectF.contains(f2, f3);
        boolean bl2 = true;
        f2 = Float.MIN_VALUE;
        if (bl) {
            pointF = this.rectFLeft;
            this.selectTrim = pointF;
            boolean bl3 = false;
            float f4 = 0.0f;
            pointF = null;
            this.trim_type = 0;
            this.isSelect = bl2;
        } else {
            rectF = this.rectFRight;
            f3 = pointF.x;
            float f5 = pointF.y;
            boolean bl4 = rectF.contains(f3, f5);
            if (bl4) {
                pointF = this.rectFRight;
                this.selectTrim = pointF;
                this.trim_type = bl2 ? 1 : 0;
                this.isSelect = bl2;
            }
        }
        return bl2;
    }

    public void onUpLeft() {
        float f = this.getRect().left;
        float f2 = this.getSecond_in_screen();
        f = Math.abs(Math.round(f / f2 * 1000.0f));
        f2 = this.getOnTapTime();
        f -= f2;
        f2 = this.getStart();
        this.start = f = (float)Math.round(f + f2);
        f = this.getOffset_left();
        f2 = this.tmpOffset;
        this.setOffset_left(f += f2);
        this.tmpOffset = 0.0f;
        f = this.start;
        int n = this.min_duration;
        f2 = n;
        float f3 = f == f2 ? 0 : (f < f2 ? -1 : 1);
        if (f3 < 0) {
            this.start = f2;
        }
        this.left = f = this.lastLeft;
    }

    public void onUpRight() {
        RectF rectF = this.getRect();
        float f = rectF.right;
        float f2 = this.getSecond_in_screen();
        f = Math.round(f / f2) * 1000;
        f2 = this.getOnTapTime();
        f -= f2;
        RectF rectF2 = this.getRect();
        f2 = rectF2.left;
        float f3 = this.getmScaleFactor();
        f2 /= f3;
        f3 = this.getOffset_left();
        f2 -= f3;
        f3 = this.getMax();
        f2 += f3;
        RectF rectF3 = this.getRect();
        f3 = rectF3.right;
        float f4 = this.getmScaleFactor();
        this.setOffset_right(f2 -= (f3 /= f4));
        f = this.end = (f2 = this.end + f);
        int n = this.duration;
        f3 = n;
        float f5 = f == f3 ? 0 : (f > f3 ? 1 : -1);
        if (f5 > 0) {
            this.end = f = (float)n;
        }
        this.right = f = this.lastRight;
    }

    /*
     * Unable to fully structure code
     */
    public void release() {
        block8: {
            super.release();
            var1_1 = this.mediaPlayer;
            if (var1_1 == null) ** GOTO lbl19
            var2_3 = var1_1.isPlaying();
            if (!var2_3) ** GOTO lbl12
            var1_1 = this.mediaPlayer;
            var1_1.pause();
lbl12:
            // 2 sources

            var1_1 = this.mediaPlayer;
            var1_1.release();
            var2_3 = false;
            var1_1 = null;
            this.mediaPlayer = null;
lbl19:
            // 2 sources

            if ((var1_1 = this.renderer) == null) break block8;
            try {
                var1_1.release();
            }
            catch (Exception var1_2) {
                var1_2.printStackTrace();
            }
        }
    }

    public void setAmps(float[] fArray) {
        this.amps = fArray;
    }

    public void setAmps(float[] fArray, int n, int n2) {
        WaveformBitmapRenderer waveformBitmapRenderer;
        this.amps = fArray;
        this.renderer = waveformBitmapRenderer = new WaveformBitmapRenderer(fArray, n, n2, -11394781);
    }

    public void setApplyEffectInPreview(boolean bl) {
        this.isApplyEffectInPreview = bl;
    }

    public void setDownX(float f) {
        this.downX = f;
    }

    public void setDuration(int n) {
        this.duration = n;
    }

    public void setEffectAudio(EffectAudio effectAudio) {
        if (effectAudio == null) {
            return;
        }
        EffectAudio effectAudio2 = this.effectAudio;
        String string2 = effectAudio.getReverbPreset();
        effectAudio2.setReverbPreset(string2);
        effectAudio2 = this.effectAudio;
        float f = effectAudio.getSpeed();
        effectAudio2.setSpeed(f);
        effectAudio2 = this.effectAudio;
        f = effectAudio.getVolume();
        effectAudio2.setVolume(f);
        effectAudio2 = this.effectAudio;
        int bl = effectAudio.getFade_in();
        effectAudio2.setFade_in(bl);
        effectAudio2 = this.effectAudio;
        int n = effectAudio.getFade_out();
        effectAudio2.setFade_out(n);
        effectAudio2 = this.effectAudio;
        int n2 = effectAudio.getDecays();
        effectAudio2.setDecays(n2);
        effectAudio2 = this.effectAudio;
        boolean bl2 = effectAudio.isRemoveNoice();
        effectAudio2.setRemoveNoice(bl2);
        effectAudio2 = this.effectAudio;
        string2 = effectAudio.getDelays_cmd();
        effectAudio2.setDelays_cmd(string2);
        effectAudio2 = this.effectAudio;
        int n3 = effectAudio.getDelays();
        effectAudio2.setDelays(n3);
        effectAudio2 = this.effectAudio;
        string2 = effectAudio.getDecays_cmd();
        effectAudio2.setDecays_cmd(string2);
        effectAudio2 = this.effectAudio;
        f = effectAudio.getOutGain();
        effectAudio2.setOutGain(f);
        effectAudio2 = this.effectAudio;
        int n4 = effectAudio.getVolume_echo();
        effectAudio2.setVolume_echo(n4);
        effectAudio2 = this.effectAudio;
        boolean bl3 = effectAudio.isEnhance();
        effectAudio2.setEnhance(bl3);
        effectAudio2 = this.effectAudio;
        int n5 = effectAudio.getReverbPreset_index_list();
        effectAudio2.setReverbPreset_index_list(n5);
    }

    public void setEnd(float f) {
        this.end = f;
    }

    public void setFadeInDelta(float f) {
        TrackEntityView$ITrimLineCallback trackEntityView$ITrimLineCallback = this.iTrimLineCallback;
        if (trackEntityView$ITrimLineCallback != null) {
            trackEntityView$ITrimLineCallback.fadeInAudio(f);
        }
    }

    public void setFadeOutDelta(float f) {
        TrackEntityView$ITrimLineCallback trackEntityView$ITrimLineCallback = this.iTrimLineCallback;
        if (trackEntityView$ITrimLineCallback != null) {
            trackEntityView$ITrimLineCallback.fadeOutAudio(f);
        }
    }

    public void setLastLeft(float f) {
        this.lastLeft = f;
    }

    public void setLastRight(float f) {
        this.lastRight = f;
    }

    public void setMax(float f) {
        this.max = f;
    }

    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public void setMin_duration(int n) {
        this.min_duration = n;
    }

    public void setPathHttp(List list) {
        this.paths_http = list;
    }

    public void setPath_ffmpeg(String string2) {
        this.path_ffmpeg = string2;
        this.setPath_ffmpeg_effect(string2);
    }

    public void setPath_ffmpeg_effect(String string2) {
        this.path_ffmpeg_effect = string2;
    }

    public void setPlay(boolean bl) {
        this.isPlay = bl;
    }

    public void setRenderer(WaveformBitmapRenderer waveformBitmapRenderer) {
        this.renderer = waveformBitmapRenderer;
    }

    public void setRight(float f) {
        this.rect.right = f;
        this.right = f;
    }

    public void setScaleEffect(float f) {
        this.scaleEffect = f;
    }

    public void setSecond_in_screen(float f) {
        this.second_in_screen = f;
    }

    public void setSelect(boolean bl) {
        this.isSelect = bl;
    }

    public void setStart(float f) {
        this.start = f;
    }

    public void setStartFadeIn(boolean bl) {
        this.isStartFadeIn = bl;
    }

    public void setStartFadeOut(boolean bl) {
        this.isStartFadeOut = bl;
    }

    public void setVideo_path(String string2) {
        this.video_path = string2;
    }

    public void setVisible(boolean bl) {
        this.isVisible = bl;
    }

    public void setX(float f) {
        float f2 = f - 0.0f;
        float f3 = f2 == 0.0f ? 0 : (f2 < 0.0f ? -1 : 1);
        if (f3 < 0) {
            f = 0.0f;
        }
        this.left = f;
        this.rect.left = f;
    }

    public void setY(float f) {
        this.rect.top = f;
        RectF rectF = this.rect;
        float f2 = this.h;
        float f3 = this.rect.top;
        rectF.bottom = f2 += f3;
    }

    public void setiTrimLineCallback(TrackEntityView$ITrimLineCallback trackEntityView$ITrimLineCallback) {
        this.iTrimLineCallback = trackEntityView$ITrimLineCallback;
    }

    public EntityAudio split(float f) {
        Uri uri = this.uri;
        float f2 = this.getRect().top;
        float f3 = this.h;
        float f4 = this.getRect().right;
        float f5 = this.getRect().right;
        float f6 = this.getmScaleFactor();
        f5 /= f6;
        f6 = this.getOffset_right();
        f5 += f6;
        f6 = this.getmScaleFactor();
        f6 = f / f6;
        float f7 = f5 - f6;
        float f8 = this.getSecond_in_screen();
        int n = (int)((float)this.getDuration() / 1000.0f);
        EntityAudio entityAudio = new EntityAudio(null, uri, f, f2, f3, f4, f7, f8, n, 0.0f, 0.0f, 0.0f);
        f = this.getFade_out();
        entityAudio.setFade_out(f);
        f = this.getFade_in();
        entityAudio.setFade_in(f);
        RectF rectF = entityAudio.getRect();
        rectF.bottom = f5 = this.getRect().bottom;
        return entityAudio;
    }

    public void startFadeIn() {
        ObjectAnimator objectAnimator = this.objectAnimator;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        float f = this.getFade_in() * 1000.0f;
        Object object = new float[]{0.0f, 1.0f};
        object = ObjectAnimator.ofFloat((Object)this, (String)"FadeInDelta", (float[])object);
        this.objectAnimator = (ObjectAnimator)object;
        long l = (int)f;
        object.setDuration(l);
        this.objectAnimator.start();
    }

    public void startFadeOut() {
        ObjectAnimator objectAnimator = this.objectAnimator;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        float f = this.getFade_out() * 1000.0f;
        Object object = new float[]{1.0f, 0.0f};
        object = ObjectAnimator.ofFloat((Object)this, (String)"FadeOutDelta", (float[])object);
        this.objectAnimator = (ObjectAnimator)object;
        long l = (long)f;
        object.setDuration(l);
        this.objectAnimator.start();
    }

    public void updateEffect() {
        EffectAudio effectAudio = this.effectAudio;
        float f = this.getStart();
        effectAudio.setStart(f);
        effectAudio = this.effectAudio;
        f = this.getEnd();
        effectAudio.setEnd(f);
        effectAudio = this.effectAudio;
        f = this.getEnd();
        float f2 = this.getStart();
        int n = (int)(f - f2);
        effectAudio.setDuration(n);
    }

    public void updateStartTrim() {
        float f = this.getRect().left;
        float f2 = this.getmScaleFactor();
        f = Math.abs(f / f2);
        f2 = this.getOnDown();
        float f3 = this.getmScaleFactor();
        f2 = Math.abs(f2 / f3);
        this.tmpOffset = f -= f2;
    }
}

