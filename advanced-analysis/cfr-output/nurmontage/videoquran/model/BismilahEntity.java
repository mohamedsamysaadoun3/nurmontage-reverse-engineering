/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  android.text.Layout$Alignment
 *  android.text.SpannableString
 *  android.text.StaticLayout
 *  android.text.StaticLayout$Builder
 *  android.text.TextPaint
 *  androidx.core.graphics.ColorUtils
 */
package hazem.nurmontage.videoquran.model;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import hazem.nurmontage.videoquran.Utils.ColorUtils;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.constant.TransitionType;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import hazem.nurmontage.videoquran.model.BismilahEntity$1;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import java.io.Serializable;
import java.lang.ref.WeakReference;

public class BismilahEntity
extends EntityView
implements Serializable {
    private EntityBismilahTimeline bismilahTimeline;
    private int clrAya;
    private int index;
    private int ipad_type;
    private boolean isFadeIn;
    private boolean isFadeOut;
    private boolean isVisible;
    private int mPreset;
    private String nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
    private ObjectAnimator objectAnimator;
    private float offsetX;
    private ObjectAnimator otherAnimation;
    private final TextPaint paintAya;
    private final TextPaint paintAyaOutline;
    private float scaleX = 1.0f;
    private StaticLayout staticLayout;
    private StaticLayout staticLayoutOutline;
    private String txt;
    private WeakReference viewWeakReference;
    private int viewWidth;
    private WeakReference weakBlurredImageView;
    private float x_translation;

    public BismilahEntity(String string2, RectF rectF, Typeface typeface, int n) {
        int n2;
        TextPaint textPaint;
        TextPaint textPaint2;
        boolean bl = true;
        this.paintAya = textPaint2 = new TextPaint(bl ? 1 : 0);
        this.paintAyaOutline = textPaint = new TextPaint(bl ? 1 : 0);
        this.txt = string2;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        super(f, f2, f3, f4);
        this.rect = string2;
        this.setVisible(bl);
        this.viewWidth = n2 = (int)rectF.width();
        textPaint2.setTypeface(typeface);
        textPaint2.setColor(n);
        textPaint2.setTextSize(0.05f);
        this.setClrAya(n);
        float f5 = this.rect.height();
        float f6 = 0.85f;
        this.max_h = n2 = (int)(f5 * f6);
        this.max_w = n2 = (int)(this.rect.width() * f6);
        this.createStaticLayout();
    }

    public BismilahEntity(String string2, RectF rectF, Typeface typeface, int n, int n2) {
        int n3;
        TextPaint textPaint;
        TextPaint textPaint2;
        boolean bl = true;
        this.paintAya = textPaint2 = new TextPaint(bl ? 1 : 0);
        this.paintAyaOutline = textPaint = new TextPaint(bl ? 1 : 0);
        this.txt = string2;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        super(f, f2, f3, f4);
        this.rect = string2;
        this.setVisible(bl);
        this.viewWidth = n3 = (int)rectF.width();
        textPaint2.setTypeface(typeface);
        textPaint2.setColor(n);
        textPaint2.setTextSize(0.05f);
        this.setClrAya(n);
        float f5 = this.rect.height();
        float f6 = 0.85f;
        this.max_h = n3 = (int)(f5 * f6);
        this.max_w = n3 = (int)(this.rect.width() * f6);
        this.mPreset = n2;
    }

    private StaticLayout buildStaticLayout(String string2, TextPaint textPaint, int n) {
        int n2 = string2.length();
        string2 = StaticLayout.Builder.obtain((CharSequence)string2, (int)0, (int)n2, (TextPaint)textPaint, (int)n);
        textPaint = Layout.Alignment.ALIGN_CENTER;
        return string2.setAlignment((Layout.Alignment)textPaint).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    private void fadeIn(int n, boolean bl) {
        int n2 = 255;
        Object object = new int[]{0, n2};
        String string2 = "OpacityFade";
        object = ObjectAnimator.ofInt((Object)this, (String)string2, (int[])object);
        this.objectAnimator = (ObjectAnimator)object;
        long l = n;
        object.setDuration(l);
        if (bl) {
            this.objectAnimator.setRepeatMode(1);
            ObjectAnimator objectAnimator = this.objectAnimator;
            int n3 = -1;
            objectAnimator.setRepeatCount(n3);
        }
        this.objectAnimator.start();
    }

    private void fadeOut(int n, boolean bl) {
        int n2 = 255;
        Object object = new int[]{n2, 0};
        String string2 = "OpacityFade";
        object = ObjectAnimator.ofInt((Object)this, (String)string2, (int[])object);
        this.objectAnimator = (ObjectAnimator)object;
        long l = n;
        object.setDuration(l);
        if (bl) {
            this.objectAnimator.setRepeatMode(1);
            ObjectAnimator objectAnimator = this.objectAnimator;
            int n3 = -1;
            objectAnimator.setRepeatCount(n3);
        }
        this.objectAnimator.start();
    }

    private StaticLayout getStaticLayoutOutline() {
        String string2 = this.txt;
        SpannableString spannableString = new SpannableString((CharSequence)string2);
        int n = spannableString.length();
        TextPaint textPaint = this.paintAyaOutline;
        int n2 = this.viewWidth;
        spannableString = StaticLayout.Builder.obtain((CharSequence)spannableString, (int)0, (int)n, (TextPaint)textPaint, (int)n2);
        string2 = Layout.Alignment.ALIGN_CENTER;
        return spannableString.setAlignment((Layout.Alignment)string2).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    public void applyAyaPreset(Paint paint, AyaTextPreset ayaTextPreset, int n, Typeface object, float f) {
        paint.reset();
        paint.setTypeface((Typeface)object);
        paint.setTextSize(f);
        Object object2 = 1;
        paint.setAntiAlias((boolean)object2);
        paint.setSubpixelText((boolean)object2);
        paint.setDither((boolean)object2);
        object = Paint.Style.FILL;
        paint.setStyle((Paint.Style)object);
        paint.setColor(n);
        object = BismilahEntity$1.$SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset;
        Object object3 = ayaTextPreset.ordinal();
        object3 = object[object3];
        object2 = 2;
        if (object3 != object2) {
            object2 = 3;
            if (object3 != object2) {
                object2 = 4;
                if (object3 == object2) {
                    f *= 0.45f;
                    float f2 = 3.57E-43f;
                    object3 = androidx.core.graphics.ColorUtils.setAlphaComponent((int)n, (int)255);
                    n = 0;
                    float f3 = 0.0f;
                    Object var10_14 = null;
                    paint.setShadowLayer(f, 0.0f, 0.0f, object3);
                }
            } else {
                object3 = this.ipad_type;
                IpadType ipadType = IpadType.HEART;
                n = ipadType.ordinal();
                if (object3 != n && (object3 = this.ipad_type) != (n = (ipadType = IpadType.BATTERY).ordinal()) && (object3 = this.ipad_type) != (n = (ipadType = IpadType.BLUE_TYPE).ordinal())) {
                    object3 = -16777216;
                    float f4 = -1.7014118E38f;
                } else {
                    object3 = -1;
                    float f5 = 0.0f / 0.0f;
                }
                n = 1043878380;
                float f6 = 0.18f * f;
                object2 = 120;
                object3 = androidx.core.graphics.ColorUtils.setAlphaComponent((int)object3, (int)object2);
                paint.setShadowLayer(f6, f *= 0.08f, f, object3);
            }
        } else {
            ayaTextPreset = Paint.Style.FILL_AND_STROKE;
            paint.setStyle((Paint.Style)ayaTextPreset);
            float f7 = 0.06f;
            paint.setStrokeWidth(f *= f7);
            ayaTextPreset = Paint.Cap.ROUND;
            paint.setStrokeCap((Paint.Cap)ayaTextPreset);
            ayaTextPreset = Paint.Join.ROUND;
            paint.setStrokeJoin((Paint.Join)ayaTextPreset);
            object3 = this.ipad_type;
            object = IpadType.HEART;
            object2 = ((Enum)object).ordinal();
            f = 0.85f;
            if (object3 != object2 && (object3 = this.ipad_type) != (object2 = ((Enum)(object = IpadType.BATTERY)).ordinal()) && (object3 = this.ipad_type) != (object2 = ((Enum)(object = IpadType.BLUE_TYPE)).ordinal())) {
                object3 = ColorUtils.darkenColor(n, f);
                paint.setColor(object3);
            } else {
                object3 = ColorUtils.lightenColor(n, f);
                paint.setColor(object3);
            }
        }
    }

    public float calculateTextSize() {
        float f = this.rect.height();
        float f2 = this.getFactor_scale();
        f /= f2;
        f2 = 0.85f;
        int n = (int)(f * f2);
        float f3 = this.rect.width();
        float f4 = this.getFactor_scale();
        int n2 = (int)(f3 / f4 * f2);
        String string2 = this.txt;
        TextPaint textPaint = this.paintAya;
        return this.calculateTextSize(string2, (Paint)textPaint, n2, n);
    }

    public float calculateTextSize(String string2, Paint paint, int n, int n2) {
        int n3;
        float f = 0.0f;
        if (string2 != null && (n3 = string2.isEmpty()) == 0 && n > 0 && n2 > 0) {
            n3 = 1065353216;
            float f2 = 1.0f;
            paint.setTextSize(f2);
            Rect rect = new Rect();
            int n4 = string2.length();
            paint.getTextBounds(string2, 0, n4, rect);
            rect.width();
            rect.height();
            n4 = 1148846080;
            float f3 = 1000.0f;
            int n5 = 0;
            while (true) {
                float f4;
                int n6 = 100;
                float f5 = 1.4E-43f;
                if (n5 >= n6) break;
                f5 = (f + f3) / 2.0f;
                paint.setTextSize(f5);
                int n7 = string2.length();
                paint.getTextBounds(string2, 0, n7, rect);
                float f6 = rect.width();
                int n8 = rect.height();
                float f7 = n8;
                float f8 = n;
                n7 = f6 == f8 ? 0 : (f6 < f8 ? -1 : 1);
                if (n7 <= 0 && (n7 = (int)((f4 = f7 - (f6 = (float)n2)) == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1))) <= 0) {
                    f = f5;
                } else {
                    f3 = f5;
                }
                ++n5;
            }
        }
        return f;
    }

    public void createStaticLayout() {
        TextPaint textPaint = this.paintAya;
        String string2 = this.txt;
        float f = this.viewWidth;
        float f2 = 0.8f;
        int n = (int)(f * f2);
        int n2 = (int)(this.rect.height() * f2);
        float f3 = this.calculateTextSize(string2, (Paint)textPaint, n, n2);
        textPaint.setTextSize(f3);
        string2 = this.txt;
        textPaint = new SpannableString((CharSequence)string2);
        int n3 = textPaint.length();
        TextPaint textPaint2 = this.paintAya;
        n2 = this.viewWidth;
        textPaint = StaticLayout.Builder.obtain((CharSequence)textPaint, (int)0, (int)n3, (TextPaint)textPaint2, (int)n2);
        string2 = Layout.Alignment.ALIGN_CENTER;
        textPaint = textPaint.setAlignment((Layout.Alignment)string2).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = textPaint;
        float f4 = this.rect.centerY();
        f3 = this.staticLayout.getHeight();
        f = 0.5f;
        this.y = f4 -= (f3 *= f);
        f4 = this.rect.centerX();
        f3 = (float)this.staticLayout.getWidth() * f;
        this.x = f4 -= f3;
    }

    public void draw(Canvas canvas) {
        StaticLayout staticLayout = this.staticLayout;
        if (staticLayout != null) {
            canvas.save();
            float f = this.x;
            float f2 = this.offsetX;
            StaticLayout staticLayout2 = this.staticLayout;
            int n = staticLayout2.getWidth();
            float f3 = n;
            f2 = this.y;
            canvas.translate(f += (f2 *= f3), f2);
            f = this.scaleX;
            canvas.scale(f, f);
            int n2 = this.mPreset;
            AyaTextPreset ayaTextPreset = AyaTextPreset.OUTLINE;
            int n3 = ayaTextPreset.ordinal();
            if (n2 == n3 && (staticLayout = this.staticLayoutOutline) != null) {
                staticLayout = this.paintAyaOutline;
                ayaTextPreset = this.paintAya;
                f2 = ayaTextPreset.getTextSize();
                staticLayout.setTextSize(f2);
                staticLayout = this.staticLayoutOutline;
                staticLayout.draw(canvas);
            }
            staticLayout = this.staticLayout;
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    public void endAnimator() {
        block11: {
            try {
                var1_1 = this.objectAnimator;
                if (var1_1 != null) {
                }
                ** GOTO lbl-1000
            }
            catch (Exception v0) {
                ** GOTO lbl20
            }
            {
                var2_2 = var1_1.isRunning();
                if (!var2_2) ** GOTO lbl-1000
            }
            {
                var1_1 = this.objectAnimator;
            }
            {
                var1_1.end();
            }
lbl-1000:
            // 3 sources

            {
                if ((var1_1 = this.otherAnimation) == null || !(var2_2 = var1_1.isRunning())) break block11;
            }
            {
                var1_1 = this.otherAnimation;
            }
            {
                var1_1.end();
            }
        }
        var2_2 = false;
        var1_1 = null;
        {
            this.objectAnimator = null;
        }
        {
            this.otherAnimation = null;
lbl20:
            // 2 sources

            this.setFadeIn(false);
            this.setFadeOut(false);
            this.offsetX = 0.0f;
        }
        this.paintAya.setAlpha(255);
        var1_1 = this.paintAyaOutline;
        var3_3 = this.paintAya.getAlpha();
        var1_1.setAlpha(var3_3);
    }

    public AyaTextPreset get(int n) {
        AyaTextPreset ayaTextPreset = AyaTextPreset.SHADOW;
        int n2 = ayaTextPreset.ordinal();
        if (n == n2) {
            return AyaTextPreset.SHADOW;
        }
        ayaTextPreset = AyaTextPreset.OUTLINE;
        n2 = ayaTextPreset.ordinal();
        if (n == n2) {
            return AyaTextPreset.OUTLINE;
        }
        ayaTextPreset = AyaTextPreset.GLOW;
        n2 = ayaTextPreset.ordinal();
        if (n == n2) {
            return AyaTextPreset.GLOW;
        }
        return AyaTextPreset.NONE;
    }

    public EntityBismilahTimeline getBismilahTimeline() {
        return this.bismilahTimeline;
    }

    public int getClrAya() {
        return this.clrAya;
    }

    public int getDuration_fade() {
        float f = this.getBismilahTimeline().getRect().left;
        float f2 = this.getBismilahTimeline().getSecond_in_screen();
        f = Math.abs(f / f2);
        f2 = this.getBismilahTimeline().getRect().right;
        float f3 = this.getBismilahTimeline().getSecond_in_screen();
        return (int)((Math.abs(f2 / f3) - f) * 0.2f * 1000.0f);
    }

    public int getIndex() {
        return this.index;
    }

    public int getIpad_type() {
        return this.ipad_type;
    }

    public int getMax_h() {
        return this.max_h;
    }

    public int getMax_w() {
        return this.max_w;
    }

    public String getNameFont() {
        return this.nameFont;
    }

    public TextPaint getPaintAya() {
        return this.paintAya;
    }

    public StaticLayout getStaticLayout() {
        return this.staticLayout;
    }

    public String getTxt() {
        return this.txt;
    }

    public int getViewWidth() {
        return this.viewWidth;
    }

    public float getWidth() {
        this.paintAya.setTextSize(3.0f);
        TextPaint textPaint = this.paintAya;
        String string2 = this.txt;
        return textPaint.measureText(string2);
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public int getmPreset() {
        return this.mPreset;
    }

    public void initPreset(int n) {
        AyaTextPreset ayaTextPreset;
        this.mPreset = n;
        AyaTextPreset ayaTextPreset2 = this.get(n);
        if (ayaTextPreset2 == (ayaTextPreset = AyaTextPreset.NONE)) {
            return;
        }
        ayaTextPreset = AyaTextPreset.OUTLINE;
        if (ayaTextPreset2 == ayaTextPreset) {
            TextPaint textPaint = this.paintAyaOutline;
            AyaTextPreset ayaTextPreset3 = AyaTextPreset.OUTLINE;
            int n2 = this.clrAya;
            Typeface typeface = this.paintAya.getTypeface();
            float f = this.paintAya.getTextSize();
            this.applyAyaPreset((Paint)textPaint, ayaTextPreset3, n2, typeface, f);
            ayaTextPreset = this.getStaticLayoutOutline();
            this.staticLayoutOutline = ayaTextPreset;
            TextPaint textPaint2 = this.paintAya;
            ayaTextPreset2 = AyaTextPreset.NONE;
            int n3 = this.clrAya;
            textPaint = this.paintAya.getTypeface();
            ayaTextPreset = this.paintAya;
            float f2 = ayaTextPreset.getTextSize();
            this.applyAyaPreset((Paint)textPaint2, ayaTextPreset2, n3, (Typeface)textPaint, f2);
        } else {
            TextPaint textPaint = this.paintAya;
            int n4 = this.clrAya;
            Typeface typeface = textPaint.getTypeface();
            ayaTextPreset = this.paintAya;
            float f = ayaTextPreset.getTextSize();
            this.applyAyaPreset((Paint)textPaint, ayaTextPreset2, n4, typeface, f);
        }
    }

    public void initPresetAya(int n) {
        AyaTextPreset ayaTextPreset;
        this.mPreset = n;
        AyaTextPreset ayaTextPreset2 = this.get(n);
        if (ayaTextPreset2 == (ayaTextPreset = AyaTextPreset.NONE)) {
            return;
        }
        ayaTextPreset = AyaTextPreset.OUTLINE;
        if (ayaTextPreset2 == ayaTextPreset) {
            TextPaint textPaint = this.paintAyaOutline;
            AyaTextPreset ayaTextPreset3 = AyaTextPreset.OUTLINE;
            int n2 = this.clrAya;
            Typeface typeface = this.paintAya.getTypeface();
            float f = this.paintAya.getTextSize();
            this.applyAyaPreset((Paint)textPaint, ayaTextPreset3, n2, typeface, f);
            ayaTextPreset = this.getStaticLayoutOutline();
            this.staticLayoutOutline = ayaTextPreset;
            TextPaint textPaint2 = this.paintAya;
            ayaTextPreset2 = AyaTextPreset.NONE;
            int n3 = this.clrAya;
            textPaint = this.paintAya.getTypeface();
            ayaTextPreset = this.paintAya;
            float f2 = ayaTextPreset.getTextSize();
            this.applyAyaPreset((Paint)textPaint2, ayaTextPreset2, n3, (Typeface)textPaint, f2);
        } else {
            TextPaint textPaint = this.paintAya;
            int n4 = this.clrAya;
            Typeface typeface = textPaint.getTypeface();
            ayaTextPreset = this.paintAya;
            float f = ayaTextPreset.getTextSize();
            this.applyAyaPreset((Paint)textPaint, ayaTextPreset2, n4, typeface, f);
        }
    }

    public boolean isAnimRun() {
        boolean bl;
        ObjectAnimator objectAnimator = this.objectAnimator;
        if (objectAnimator != null && (bl = objectAnimator.isRunning()) || (objectAnimator = this.otherAnimation) != null && (bl = objectAnimator.isRunning())) {
            bl = true;
        } else {
            bl = false;
            objectAnimator = null;
        }
        return bl;
    }

    public boolean isAnimTest() {
        return super.isAnimTest();
    }

    public boolean isFadeIn() {
        return this.isFadeIn;
    }

    public boolean isFadeOut() {
        return this.isFadeOut;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void postTranslate(float f, float f2) {
        this.rect.offset(f, f2);
        f = this.rect.centerX();
        f2 = this.staticLayout.getWidth();
        float f3 = 0.5f;
        this.x = f -= (f2 *= f3);
        f = this.rect.centerY();
        f2 = (float)this.staticLayout.getHeight() * f3;
        this.y = f -= f2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void restoreCanvas(Canvas canvas) {
        try {
            canvas.restore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public void runIn(int n, boolean bl, String string2) {
        boolean bl2;
        String string3 = TransitionType.SLIDE_TO_LEFT.getValue();
        boolean bl3 = string2.equals(string3);
        if (bl3) {
            this.slidToLeft(n, bl);
        }
        if (bl3 = string2.equals(string3 = TransitionType.SLIDE_TO_RIGHT.getValue())) {
            this.slidToRight(n, bl);
        }
        if (bl3 = string2.equals(string3 = TransitionType.ZOOM_IN.getValue())) {
            this.zoomIn_In(n, bl);
        }
        if (bl2 = string2.equals(string3 = TransitionType.FADE_IN.getValue())) {
            this.fadeIn(n, bl);
        }
    }

    public void runOut(int n, boolean bl, String string2) {
        boolean bl2;
        String string3 = TransitionType.SLIDE_TO_LEFT.getValue();
        boolean bl3 = string2.equals(string3);
        if (bl3) {
            this.slidToLeftOut(n, bl);
        }
        if (bl3 = string2.equals(string3 = TransitionType.SLIDE_TO_RIGHT.getValue())) {
            this.slidToRightOut(n, bl);
        }
        if (bl2 = string2.equals(string3 = TransitionType.FADE_OUT.getValue())) {
            this.fadeOut(n, bl);
        }
    }

    public void scale(float f, int n, int n2) {
        int n3;
        float f2;
        this.setFactor_scale(f);
        float f3 = this.rect.width() * f;
        float f4 = this.rect.height() * f;
        f = 0.5f;
        RectF rectF = this.rect;
        rectF.left = f2 = this.rect.centerX() - (f3 *= f);
        rectF = this.rect;
        rectF.right = f2 = this.rect.centerX() + f3;
        RectF rectF2 = this.rect;
        rectF2.top = f3 = this.rect.centerY() - (f4 *= f);
        rectF2 = this.rect;
        rectF2.bottom = f3 = this.rect.centerY() + f4;
        this.viewWidth = n3 = (int)this.rect.width();
        rectF2 = this.paintAya;
        f3 = this.calculateTextSize();
        rectF2.setTextSize(f3);
        this.createStaticLayout();
        f = this.paintAya.getTextSize();
        float f5 = n;
        this.setFcSize(f /= f5);
        n3 = this.getmPreset();
        this.initPreset(n3);
    }

    public void setAnimTest(boolean bl) {
        super.setAnimTest(bl);
    }

    public void setBismilahTimeline(EntityBismilahTimeline entityBismilahTimeline) {
        this.bismilahTimeline = entityBismilahTimeline;
    }

    public void setClrAya(int n) {
        this.clrAya = n;
    }

    public void setColor(int n) {
        this.setClrAya(n);
        this.paintAya.setColor(n);
    }

    public void setFactorSize(float f) {
        Object object;
        this.scaleX = f;
        boolean bl = this.isAnimTest();
        if (bl && (object = this.weakBlurredImageView) != null) {
            object = (BlurredImageView)((Object)object.get());
            object.invalidate();
        }
    }

    public void setFadeIn(boolean bl) {
        this.isFadeIn = bl;
    }

    public void setFadeOut(boolean bl) {
        this.isFadeOut = bl;
    }

    public void setIndex(int n) {
        this.index = n;
    }

    public void setIpad_type(int n) {
        this.ipad_type = n;
    }

    public void setOpacityFade(int n) {
        this.paintAya.setAlpha(n);
        Object object = this.paintAyaOutline;
        TextPaint textPaint = this.paintAya;
        int n2 = textPaint.getAlpha();
        object.setAlpha(n2);
        n = this.isAnimTest() ? 1 : 0;
        if (n != 0) {
            object = this.weakBlurredImageView;
            if (object != null) {
                object = (BlurredImageView)((Object)object.get());
                object.invalidate();
            }
        } else {
            object = this.viewWeakReference;
            if (object != null) {
                object = (TrackEntityView)((Object)object.get());
                object.invalidate();
            }
        }
    }

    public void setPreset(AyaTextPreset ayaTextPreset) {
        int n;
        this.mPreset = n = ayaTextPreset.ordinal();
        Object object = AyaTextPreset.OUTLINE;
        if (ayaTextPreset == object) {
            Object object2 = this.paintAyaOutline;
            AyaTextPreset ayaTextPreset2 = AyaTextPreset.OUTLINE;
            int n2 = this.clrAya;
            Typeface typeface = this.paintAya.getTypeface();
            float f = this.paintAya.getTextSize();
            BismilahEntity bismilahEntity = this;
            this.applyAyaPreset((Paint)object2, ayaTextPreset2, n2, typeface, f);
            ayaTextPreset = this.getStaticLayoutOutline();
            this.staticLayoutOutline = ayaTextPreset;
            bismilahEntity = this.paintAya;
            object2 = AyaTextPreset.NONE;
            int n3 = this.clrAya;
            Typeface typeface2 = this.paintAya.getTypeface();
            ayaTextPreset = this.paintAya;
            float f2 = ayaTextPreset.getTextSize();
            object = this;
            this.applyAyaPreset((Paint)bismilahEntity, (AyaTextPreset)((Object)object2), n3, typeface2, f2);
        } else {
            TextPaint textPaint = this.paintAya;
            int n4 = this.clrAya;
            Typeface typeface = textPaint.getTypeface();
            object = this.paintAya;
            float f = object.getTextSize();
            this.applyAyaPreset((Paint)textPaint, ayaTextPreset, n4, typeface, f);
        }
    }

    public void setSlideX(float f) {
        this.offsetX = f;
        TextPaint textPaint = this.paintAya;
        f = Math.abs(f);
        float f2 = 1.0f - f;
        f = 255.0f;
        int n = Math.round(f2 *= f);
        textPaint.setAlpha(n);
        Object object = this.paintAyaOutline;
        textPaint = this.paintAya;
        int n2 = textPaint.getAlpha();
        object.setAlpha(n2);
        n = this.isAnimTest() ? 1 : 0;
        if (n != 0 && (object = this.weakBlurredImageView) != null) {
            object = (BlurredImageView)((Object)object.get());
            object.invalidate();
        }
    }

    public void setSlideXOut(float f) {
        this.offsetX = f;
        TextPaint textPaint = this.paintAya;
        f = Math.abs(f);
        float f2 = 1.0f - f;
        f = 255.0f;
        int n = Math.round(f2 *= f);
        textPaint.setAlpha(n);
        Object object = this.paintAyaOutline;
        textPaint = this.paintAya;
        int n2 = textPaint.getAlpha();
        object.setAlpha(n2);
        n = this.isAnimTest() ? 1 : 0;
        if (n != 0 && (object = this.weakBlurredImageView) != null) {
            object = (BlurredImageView)((Object)object.get());
            object.invalidate();
        }
    }

    public void setStaticLayout() {
        String string2 = this.txt;
        SpannableString spannableString = new SpannableString((CharSequence)string2);
        int n = spannableString.length();
        TextPaint textPaint = this.paintAya;
        int n2 = this.viewWidth;
        spannableString = StaticLayout.Builder.obtain((CharSequence)spannableString, (int)0, (int)n, (TextPaint)textPaint, (int)n2);
        string2 = Layout.Alignment.ALIGN_CENTER;
        spannableString = spannableString.setAlignment((Layout.Alignment)string2).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = spannableString;
        float f = this.rect.centerX();
        float f2 = this.staticLayout.getWidth();
        float f3 = 0.5f;
        this.x = f -= (f2 *= f3);
        f = this.rect.centerY();
        f2 = (float)this.staticLayout.getHeight() * f3;
        this.y = f -= f2;
    }

    public void setTextSize(float f) {
        this.paintAya.setTextSize(f);
    }

    public void setTextSizeInBoucle(float f) {
        this.paintAya.setTextSize(f);
        String string2 = this.txt;
        SpannableString spannableString = new SpannableString((CharSequence)string2);
        int n = spannableString.length();
        TextPaint textPaint = this.paintAya;
        int n2 = this.viewWidth;
        spannableString = StaticLayout.Builder.obtain((CharSequence)spannableString, (int)0, (int)n, (TextPaint)textPaint, (int)n2);
        string2 = Layout.Alignment.ALIGN_CENTER;
        spannableString = spannableString.setAlignment((Layout.Alignment)string2).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = spannableString;
        f = this.rect.centerY();
        float f2 = this.staticLayout.getHeight();
        float f3 = 0.5f;
        this.y = f -= (f2 *= f3);
        f = this.rect.centerX();
        f2 = (float)this.staticLayout.getWidth() * f3;
        this.x = f -= f2;
    }

    public void setTranslate(float f, float f2) {
        float f3;
        float f4 = this.rect.width();
        float f5 = 0.5f;
        float f6 = this.rect.height() * f5;
        RectF rectF = this.rect;
        rectF.left = f3 = f - (f4 *= f5);
        rectF = this.rect;
        rectF.right = f += f4;
        RectF rectF2 = this.rect;
        rectF2.top = f4 = f2 - f6;
        rectF2 = this.rect;
        rectF2.bottom = f2 += f6;
        f = this.rect.centerX();
        f2 = (float)this.staticLayout.getWidth() * f5;
        this.x = f -= f2;
        f = this.rect.centerY();
        f2 = (float)this.staticLayout.getHeight() * f5;
        this.y = f -= f2;
    }

    public void setTxt(String string2) {
        this.txt = string2;
        SpannableString spannableString = new SpannableString((CharSequence)string2);
        int n = spannableString.length();
        TextPaint textPaint = this.paintAya;
        int n2 = this.viewWidth;
        string2 = StaticLayout.Builder.obtain((CharSequence)spannableString, (int)0, (int)n, (TextPaint)textPaint, (int)n2);
        spannableString = Layout.Alignment.ALIGN_CENTER;
        string2 = string2.setAlignment((Layout.Alignment)spannableString).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = string2;
    }

    public void setTypeface(Typeface typeface, String string2) {
        this.paintAya.setTypeface(typeface);
        this.nameFont = string2;
    }

    public void setTypefaceOneAya(Typeface typeface, String string2) {
        this.paintAya.setTypeface(typeface);
        this.nameFont = string2;
    }

    public void setUnderLine(boolean bl) {
        this.paintAya.setUnderlineText(bl);
    }

    public void setViewWeakReference(WeakReference weakReference, WeakReference weakReference2) {
        this.viewWeakReference = weakReference;
        this.weakBlurredImageView = weakReference2;
    }

    public void setVisible(boolean bl) {
        this.isVisible = bl;
    }

    public void setmPreset(int n) {
        this.mPreset = n;
    }

    public void setupCanvasDraw(Canvas canvas) {
        int n = canvas.getHeight();
        int n2 = this.staticLayout.getHeight();
        float f = n - n2;
        float f2 = 0.5f;
        this.y = f *= f2;
        n = canvas.getWidth();
        int n3 = this.staticLayout.getWidth();
        this.x = f = (float)(n - n3) * f2;
        canvas.save();
        f = this.x;
        f2 = this.y;
        canvas.translate(f, f2);
    }

    public void setupScale(float f, int n, int n2) {
        int n3;
        TextPaint textPaint = this.paintAya;
        float f2 = n;
        textPaint.setTextSize(f *= f2);
        String string2 = this.txt;
        SpannableString spannableString = new SpannableString((CharSequence)string2);
        f2 = this.rect.width();
        textPaint = this.paintAya;
        String string3 = spannableString.toString();
        float f3 = Math.round(textPaint.measureText(string3));
        this.viewWidth = n = (int)Math.max(f2, f3);
        n = spannableString.length();
        textPaint = this.paintAya;
        int n4 = this.viewWidth;
        spannableString = StaticLayout.Builder.obtain((CharSequence)spannableString, (int)0, (int)n, (TextPaint)textPaint, (int)n4);
        string2 = Layout.Alignment.ALIGN_CENTER;
        spannableString = spannableString.setAlignment((Layout.Alignment)string2).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = spannableString;
        f = spannableString.getWidth();
        f2 = 0.5f;
        f3 = f * f2;
        float f4 = this.rect.height();
        float f5 = this.rect.width();
        f4 = f4 * (f /= f5) * f2;
        f = this.rect.centerY();
        f5 = this.rect.centerX();
        RectF rectF = this.rect;
        float f6 = f5 - f3;
        float f7 = f - f4;
        rectF.set(f6, f7, f5 += f3, f += f4);
        f = this.rect.height();
        f3 = 0.85f;
        this.max_h = n3 = Math.round(f * f3);
        this.max_w = n3 = Math.round(this.rect.width() * f3);
        f = this.rect.centerX();
        f3 = (float)this.staticLayout.getWidth() * f2;
        this.x = f -= f3;
        f = this.rect.centerY();
        f3 = (float)this.staticLayout.getHeight() * f2;
        this.y = f -= f3;
    }

    public void setupScaleSave(float f, int n) {
        int n2;
        TextPaint textPaint = this.paintAya;
        float f2 = n;
        textPaint.setTextSize(f *= f2);
        String string2 = this.txt;
        SpannableString spannableString = new SpannableString((CharSequence)string2);
        this.viewWidth = n = (int)this.rect.width();
        n = spannableString.length();
        textPaint = this.paintAya;
        int n3 = this.viewWidth;
        spannableString = StaticLayout.Builder.obtain((CharSequence)spannableString, (int)0, (int)n, (TextPaint)textPaint, (int)n3);
        string2 = Layout.Alignment.ALIGN_CENTER;
        spannableString = spannableString.setAlignment((Layout.Alignment)string2).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = spannableString;
        f = this.rect.height();
        f2 = 0.85f;
        this.max_h = n2 = Math.round(f * f2);
        this.max_w = n2 = Math.round(this.rect.width() * f2);
        f = this.rect.centerX();
        f2 = this.staticLayout.getWidth();
        float f3 = 0.5f;
        this.x = f -= (f2 *= f3);
        f = this.rect.centerY();
        f2 = (float)this.staticLayout.getHeight() * f3;
        this.y = f -= f2;
    }

    public void singleDraw(Canvas canvas) {
        StaticLayout staticLayout = this.staticLayout;
        if (staticLayout != null) {
            int n = this.mPreset;
            AyaTextPreset ayaTextPreset = AyaTextPreset.OUTLINE;
            int n2 = ayaTextPreset.ordinal();
            if (n == n2 && (staticLayout = this.staticLayoutOutline) != null) {
                staticLayout = this.paintAyaOutline;
                ayaTextPreset = this.paintAya;
                float f = ayaTextPreset.getTextSize();
                staticLayout.setTextSize(f);
                staticLayout = this.staticLayoutOutline;
                staticLayout.draw(canvas);
            }
            staticLayout = this.staticLayout;
            staticLayout.draw(canvas);
        }
    }

    public void singleDraw(Canvas canvas, int n) {
        StaticLayout staticLayout = this.staticLayout;
        if (staticLayout != null) {
            staticLayout = this.paintAya;
            staticLayout.setAlpha(n);
            StaticLayout staticLayout2 = this.staticLayout;
            staticLayout2.draw(canvas);
        }
    }

    public void singleDraw(Canvas canvas, int n, float f) {
        StaticLayout staticLayout = this.staticLayout;
        if (staticLayout != null) {
            canvas.save();
            float f2 = this.staticLayout.getWidth();
            f *= f2;
            f2 = 0.0f;
            staticLayout = null;
            canvas.translate(f, 0.0f);
            TextPaint textPaint = this.paintAya;
            textPaint.setAlpha(n);
            StaticLayout staticLayout2 = this.staticLayout;
            staticLayout2.draw(canvas);
            canvas.restore();
        }
    }

    public void slidToLeft(int n, boolean bl) {
        int n2 = 2;
        Object object = new float[n2];
        object[0] = 1.0f;
        object[1] = 0.0f;
        String string2 = "SlideX";
        object = ObjectAnimator.ofFloat((Object)this, (String)string2, (float[])object);
        this.otherAnimation = (ObjectAnimator)object;
        long l = n;
        object.setDuration(l);
        if (bl) {
            this.otherAnimation.setRepeatMode(1);
            ObjectAnimator objectAnimator = this.otherAnimation;
            int n3 = -1;
            objectAnimator.setRepeatCount(n3);
        }
        this.otherAnimation.start();
    }

    public void slidToLeftOut(int n, boolean bl) {
        int n2 = 2;
        Object object = new float[n2];
        object[0] = 0.0f;
        object[1] = -1.0f;
        String string2 = "SlideXOut";
        object = ObjectAnimator.ofFloat((Object)this, (String)string2, (float[])object);
        this.otherAnimation = (ObjectAnimator)object;
        long l = n;
        object.setDuration(l);
        if (bl) {
            this.otherAnimation.setRepeatMode(1);
            ObjectAnimator objectAnimator = this.otherAnimation;
            int n3 = -1;
            objectAnimator.setRepeatCount(n3);
        }
        this.otherAnimation.start();
    }

    public void slidToRight(int n, boolean bl) {
        int n2 = 2;
        Object object = new float[n2];
        object[0] = -1.0f;
        object[1] = 0.0f;
        String string2 = "SlideX";
        object = ObjectAnimator.ofFloat((Object)this, (String)string2, (float[])object);
        this.otherAnimation = (ObjectAnimator)object;
        long l = n;
        object.setDuration(l);
        if (bl) {
            this.otherAnimation.setRepeatMode(1);
            ObjectAnimator objectAnimator = this.otherAnimation;
            int n3 = -1;
            objectAnimator.setRepeatCount(n3);
        }
        this.otherAnimation.start();
    }

    public void slidToRightOut(int n, boolean bl) {
        int n2 = 2;
        Object object = new float[n2];
        object[0] = 0.0f;
        object[1] = 1.0f;
        String string2 = "SlideXOut";
        object = ObjectAnimator.ofFloat((Object)this, (String)string2, (float[])object);
        this.otherAnimation = (ObjectAnimator)object;
        long l = n;
        object.setDuration(l);
        if (bl) {
            this.otherAnimation.setRepeatMode(1);
            ObjectAnimator objectAnimator = this.otherAnimation;
            int n3 = -1;
            objectAnimator.setRepeatCount(n3);
        }
        this.otherAnimation.start();
    }

    public void update(RectF rectF, int n, int n2) {
        int n3;
        RectF rectF2;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        this.rect = rectF2 = new RectF(f, f2, f3, f4);
        this.max_h = n2;
        this.max_w = n;
        this.viewWidth = n3 = (int)this.rect.width();
    }

    public void zoomIn_In(int n, boolean bl) {
        int n2 = 2;
        Object object = new float[n2];
        object[0] = 0.0f;
        object[1] = 1.0f;
        String string2 = "FactorSize";
        object = ObjectAnimator.ofFloat((Object)this, (String)string2, (float[])object);
        this.otherAnimation = (ObjectAnimator)object;
        long l = n;
        object.setDuration(l);
        if (bl) {
            this.otherAnimation.setRepeatMode(1);
            ObjectAnimator objectAnimator = this.otherAnimation;
            int n3 = -1;
            objectAnimator.setRepeatCount(n3);
        }
        this.otherAnimation.start();
    }
}

