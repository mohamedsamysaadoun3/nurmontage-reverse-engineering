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
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.model.TranslationQuranEntity$1;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import java.io.Serializable;
import java.lang.ref.WeakReference;

public class TranslationQuranEntity
extends EntityView
implements Serializable {
    private static final int ALPHA_BG = 100;
    private int clrAya;
    private int clrBg;
    private int index;
    private int ipad_type;
    private boolean isFadeIn;
    private boolean isFadeOut;
    private boolean isHaveBg;
    private boolean isVisible;
    private int mPreset;
    private String nameFont;
    private int number;
    private ObjectAnimator objectAnimator;
    private float offsetX;
    private ObjectAnimator otherAnimation;
    private final TextPaint paintAya;
    private final TextPaint paintAyaOutline;
    private final TextPaint paintAyaTrslOutline;
    private final TextPaint paintBg;
    private float scaleX;
    private SpannableString spannableString;
    private StaticLayout staticLayout;
    private StaticLayout staticLayoutOutline;
    private String txt;
    private WeakReference viewWeakReference;
    private int viewWidth;
    private WeakReference weakBlurredImageView;

    public TranslationQuranEntity(int n, int n2, String string2, RectF rectF, Typeface typeface, int n3, int n4, String string3) {
        TextPaint textPaint;
        TextPaint textPaint2;
        boolean bl;
        int n5;
        this.clrBg = n5 = -16777216;
        this.isHaveBg = bl = true;
        this.scaleX = 1.0f;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        this.paintAya = textPaint2 = new TextPaint(bl ? 1 : 0);
        this.paintAyaOutline = textPaint = new TextPaint(bl ? 1 : 0);
        this.paintAyaTrslOutline = textPaint = new TextPaint(bl ? 1 : 0);
        this.paintBg = textPaint = new TextPaint(bl ? 1 : 0);
        this.setCanvasWH(n, n2);
        this.txt = string2;
        this.nameFont = string3;
        this.number = n3;
        this.rect = rectF;
        this.setVisible(bl);
        this.viewWidth = n = (int)rectF.width();
        textPaint2.setTypeface(typeface);
        textPaint2.setColor(n4);
        textPaint.setColor(n5);
        textPaint.setAlpha(100);
        this.setClrAya(n4);
        float f = this.rect.height();
        float f2 = 0.85f;
        this.max_h = n = (int)(f * f2);
        this.max_w = n = (int)(this.rect.width() * f2);
    }

    public TranslationQuranEntity(String string2, RectF rectF, Typeface typeface, int n, int n2, String string3, float f) {
        int n3;
        TextPaint textPaint;
        TextPaint textPaint2;
        boolean bl;
        int n4;
        this.clrBg = n4 = -16777216;
        this.isHaveBg = bl = true;
        this.scaleX = 1.0f;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        this.paintAya = textPaint2 = new TextPaint(bl ? 1 : 0);
        this.paintAyaOutline = textPaint = new TextPaint(bl ? 1 : 0);
        this.paintAyaTrslOutline = textPaint = new TextPaint(bl ? 1 : 0);
        this.paintBg = textPaint = new TextPaint(bl ? 1 : 0);
        this.txt = string2;
        this.nameFont = string3;
        this.number = n;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        super(f2, f3, f4, f5);
        this.rect = string2;
        this.setVisible(bl);
        this.viewWidth = n3 = (int)rectF.width();
        textPaint2.setTypeface(typeface);
        textPaint2.setColor(n2);
        textPaint2.setTextSize(f);
        textPaint.setColor(n4);
        textPaint.setAlpha(100);
        this.setClrAya(n2);
        float f6 = this.rect.height();
        float f7 = 0.85f;
        this.max_h = n3 = (int)(f6 * f7);
        this.max_w = n3 = (int)(this.rect.width() * f7);
    }

    public TranslationQuranEntity(String string2, RectF rectF, Typeface typeface, int n, int n2, String string3, float f, boolean bl) {
        int n3;
        TextPaint textPaint;
        TextPaint textPaint2;
        boolean bl2;
        int n4;
        this.clrBg = n4 = -16777216;
        this.isHaveBg = bl2 = true;
        this.scaleX = 1.0f;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        this.paintAya = textPaint2 = new TextPaint(bl2 ? 1 : 0);
        this.paintAyaOutline = textPaint = new TextPaint(bl2 ? 1 : 0);
        this.paintAyaTrslOutline = textPaint = new TextPaint(bl2 ? 1 : 0);
        this.paintBg = textPaint = new TextPaint(bl2 ? 1 : 0);
        this.txt = string2;
        this.nameFont = string3;
        this.number = n;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        super(f2, f3, f4, f5);
        this.rect = string2;
        this.setVisible(bl2);
        this.viewWidth = n3 = (int)rectF.width();
        textPaint2.setTypeface(typeface);
        textPaint2.setColor(n2);
        textPaint2.setTextSize(f);
        float f6 = this.rect.height();
        float f7 = 0.85f;
        this.max_h = n3 = (int)(f6 * f7);
        this.max_w = n3 = (int)(this.rect.width() * f7);
        textPaint.setColor(n4);
        textPaint.setAlpha(100);
    }

    public TranslationQuranEntity(String string2, RectF rectF, Typeface typeface, int n, int n2, String string3, int n3, int n4) {
        int n5;
        TextPaint textPaint;
        TextPaint textPaint2;
        boolean bl;
        int n6;
        this.clrBg = n6 = -16777216;
        this.isHaveBg = bl = true;
        this.scaleX = 1.0f;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        this.paintAya = textPaint2 = new TextPaint(bl ? 1 : 0);
        this.paintAyaOutline = textPaint = new TextPaint(bl ? 1 : 0);
        this.paintAyaTrslOutline = textPaint = new TextPaint(bl ? 1 : 0);
        this.paintBg = textPaint = new TextPaint(bl ? 1 : 0);
        this.setCanvasWH(n3, n4);
        this.txt = string2;
        this.nameFont = string3;
        this.number = n;
        float f = n4;
        float f2 = rectF.height();
        f2 = f - f2;
        float f3 = n3;
        super(0.0f, f2, f3, f);
        this.rect = string2;
        this.setVisible(bl);
        this.viewWidth = n5 = (int)rectF.width();
        textPaint2.setTypeface(typeface);
        textPaint2.setColor(n2);
        float f4 = this.calculateTextSize();
        textPaint2.setTextSize(f4);
        textPaint.setColor(n6);
        textPaint.setAlpha(100);
        this.setClrAya(n2);
        f4 = this.rect.height();
        float f5 = 0.85f;
        this.max_h = n5 = (int)(f4 * f5);
        this.max_w = n5 = (int)(this.rect.width() * f5);
        this.createStaticLayout();
    }

    private StaticLayout buildStaticLayout(String string2, TextPaint textPaint, int n) {
        int n2 = string2.length();
        string2 = StaticLayout.Builder.obtain((CharSequence)string2, (int)0, (int)n2, (TextPaint)textPaint, (int)n);
        textPaint = Layout.Alignment.ALIGN_CENTER;
        return string2.setAlignment((Layout.Alignment)textPaint).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    private StaticLayout createBalancedLayout(String string2, TextPaint textPaint, int n, float f, float f2) {
        StaticLayout.Builder builder;
        float f3;
        float f4;
        int n2;
        int n3;
        SpannableString spannableString = new SpannableString((CharSequence)string2);
        do {
            textPaint.setTextSize(f);
            int n4 = spannableString.length();
            n2 = 0;
            float f5 = 0.0f;
            builder = StaticLayout.Builder.obtain((CharSequence)spannableString, (int)0, (int)n4, (TextPaint)textPaint, (int)n);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            builder = builder.setAlignment(alignment).setIncludePad(false);
            float f6 = 0.0f;
            alignment = null;
            f3 = 1.0f;
            builder = builder.setLineSpacing(0.0f, f3).build();
            int n5 = builder.getLineCount();
            n3 = 1;
            float f7 = Float.MIN_VALUE;
            if (n5 <= n3) break;
            int n6 = builder.getLineStart(n5 += -1);
            int n7 = builder.getLineEnd(n5);
            String[] stringArray = string2.substring(n6, n7).trim();
            String string3 = "\\s+";
            n6 = (stringArray = stringArray.split(string3)).length;
            if (n6 <= n3) {
                n2 = n3;
                f5 = f7;
            }
            f6 = builder.getLineWidth(n5);
            float f8 = n;
            n7 = 1048576000;
            float f9 = 0.25f;
            float f10 = f6 - (f8 *= f9);
            n5 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
            if (n5 < 0) continue;
            n3 = n2;
            f7 = f5;
        } while (n3 != 0 && (n2 = (int)((f4 = (f -= f3) - f2) == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1))) > 0);
        return builder;
    }

    private float createBestSizeLayout(String string2, TextPaint textPaint, int n, int n2) {
        RectF rectF = this.rect;
        float f = rectF.height() * 0.28f;
        RectF rectF2 = this.rect;
        float f2 = rectF2.height();
        int n3 = 1034147594;
        float f3 = 0.08f;
        f2 *= f3;
        while ((n3 = (int)(f == f2 ? 0 : (f > f2 ? 1 : -1))) >= 0) {
            textPaint.setTextSize(f);
            n3 = string2.length();
            StaticLayout.Builder builder = StaticLayout.Builder.obtain((CharSequence)string2, (int)0, (int)n3, (TextPaint)textPaint, (int)n);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            builder = builder.setAlignment(alignment);
            alignment = null;
            float f4 = 1.12f;
            builder = builder.setLineSpacing(0.0f, f4).setIncludePad(false).build();
            n3 = builder.getHeight();
            if (n3 <= n2) {
                return textPaint.getTextSize();
            }
            n3 = 1065353216;
            f3 = 1.0f;
            f -= f3;
        }
        textPaint.setTextSize(f2);
        return textPaint.getTextSize();
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

    private float getMaxLineWidth(StaticLayout staticLayout) {
        int n;
        float f = 0.0f;
        for (int i = 0; i < (n = staticLayout.getLineCount()); ++i) {
            float f2 = staticLayout.getLineWidth(i);
            f = Math.max(f, f2);
        }
        return f;
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

    public void applyAll(int n, RectF rectF, float f, float f2) {
        StaticLayout staticLayout;
        int n2;
        this.viewWidth = n2 = Math.round(rectF.width());
        String string2 = this.txt;
        TextPaint textPaint = this.paintAya;
        float f3 = f;
        this.staticLayout = staticLayout = this.createBalancedLayout(string2, textPaint, n2, f, 2.0f);
        float f4 = staticLayout.getWidth();
        this.setFcSize(f2);
        f = this.rect.height() * 0.12f;
        f2 = 0.5f;
        float f5 = (float)this.staticLayout.getHeight() * f2;
        string2 = this.rect;
        float f6 = rectF.centerX() - (f4 *= f2);
        float f7 = rectF.centerY() - f5 - f;
        f3 = rectF.centerX() + f4;
        f4 = rectF.centerY() + f5 + f;
        string2.set(f6, f7, f3, f4);
        f4 = this.rect.centerX();
        float f8 = (float)this.staticLayout.getWidth() * f2;
        this.x = f4 -= f8;
        f4 = this.rect.centerY();
        f8 = (float)this.staticLayout.getHeight() * f2;
        this.y = f4 -= f8;
        f4 = this.rect.height();
        f8 = 0.85f;
        this.max_h = n = Math.round(f4 * f8);
        this.max_w = n = Math.round(this.rect.width() * f8);
        n = this.getmPreset();
        this.initPreset(n);
    }

    public void applyAll(int n, RectF rectF, float f, float f2, TranslationQuranEntity translationQuranEntity) {
        int n2;
        this.paintAya.setTextSize(f);
        String string2 = this.txt;
        SpannableString spannableString = new SpannableString((CharSequence)string2);
        f = rectF.width();
        translationQuranEntity = this.paintAya;
        String string3 = spannableString.toString();
        float f3 = Math.round(translationQuranEntity.measureText(string3));
        this.viewWidth = n2 = (int)((float)((int)Math.max(f, f3)) * 1.1f);
        n2 = spannableString.length();
        translationQuranEntity = this.paintAya;
        int n3 = this.viewWidth;
        spannableString = StaticLayout.Builder.obtain((CharSequence)spannableString, (int)0, (int)n2, (TextPaint)translationQuranEntity, (int)n3);
        string2 = Layout.Alignment.ALIGN_CENTER;
        spannableString = spannableString.setAlignment((Layout.Alignment)string2).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = spannableString;
        float f4 = spannableString.getWidth();
        this.setFcSize(f2);
        f = 0.5f;
        f2 = f4 * f;
        f3 = this.rect.height();
        float f5 = this.rect.width();
        f3 = f3 * (f4 /= f5) * f;
        spannableString = this.rect;
        f5 = rectF.centerX() - f2;
        float f6 = rectF.centerY() - f3;
        float f7 = rectF.centerX() + f2;
        float f8 = rectF.centerY() + f3;
        spannableString.set(f5, f6, f7, f8);
        f4 = this.rect.centerX();
        f8 = (float)this.staticLayout.getWidth() * f;
        this.x = f4 -= f8;
        f4 = this.rect.centerY();
        f8 = (float)this.staticLayout.getHeight() * f;
        this.y = f4 -= f8;
        f4 = this.rect.height();
        f8 = 0.85f;
        this.max_h = n = Math.round(f4 * f8);
        this.max_w = n = Math.round(this.rect.width() * f8);
        n = this.getmPreset();
        this.initPreset(n);
    }

    public void applyAyaPreset(Paint paint, AyaTextPreset ayaTextPreset, int n, Typeface object, float f) {
        paint.reset();
        paint.setTypeface((Typeface)object);
        paint.setTextSize(f);
        Object object2 = 1;
        float f2 = Float.MIN_VALUE;
        paint.setAntiAlias((boolean)object2);
        paint.setSubpixelText((boolean)object2);
        paint.setDither((boolean)object2);
        object = Paint.Style.FILL;
        paint.setStyle((Paint.Style)object);
        paint.setColor(n);
        object = this.paintAyaTrslOutline;
        if (paint == object) {
            object2 = 1068289229;
            f2 = 1.35f;
            f *= f2;
        }
        object = TranslationQuranEntity$1.$SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset;
        Object object3 = ayaTextPreset.ordinal();
        object3 = object[object3];
        object2 = 2;
        f2 = 2.8E-45f;
        if (object3 != object2) {
            object2 = 3;
            f2 = 4.2E-45f;
            if (object3 != object2) {
                object2 = 4;
                f2 = 5.6E-45f;
                if (object3 == object2) {
                    f *= 0.45f;
                    float f3 = 3.57E-43f;
                    object3 = androidx.core.graphics.ColorUtils.setAlphaComponent((int)n, (int)255);
                    n = 0;
                    float f4 = 0.0f;
                    Object var11_15 = null;
                    paint.setShadowLayer(f, 0.0f, 0.0f, object3);
                }
            } else {
                object3 = this.ipad_type;
                IpadType ipadType = IpadType.HEART;
                n = ipadType.ordinal();
                if (object3 != n && (object3 = this.ipad_type) != (n = (ipadType = IpadType.BATTERY).ordinal()) && (object3 = this.ipad_type) != (n = (ipadType = IpadType.BLUE_TYPE).ordinal())) {
                    object3 = -16777216;
                    float f5 = -1.7014118E38f;
                } else {
                    object3 = -1;
                    float f6 = 0.0f / 0.0f;
                }
                n = 1043878380;
                float f7 = 0.18f * f;
                object2 = 120;
                f2 = 1.68E-43f;
                object3 = androidx.core.graphics.ColorUtils.setAlphaComponent((int)object3, (int)object2);
                paint.setShadowLayer(f7, f *= 0.08f, f, object3);
            }
        } else {
            ayaTextPreset = Paint.Style.FILL_AND_STROKE;
            paint.setStyle((Paint.Style)ayaTextPreset);
            float f8 = 0.12f;
            paint.setStrokeWidth(f *= f8);
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

    public float calculateOptimalTextSize(String string2, int n, int n2, TextPaint textPaint) {
        float f;
        float f2 = 5.0f;
        float f3 = 1000.0f;
        float f4 = f2;
        while ((f = f2 == f3 ? 0 : (f2 < f3 ? -1 : 1)) <= 0) {
            float f5;
            float f6 = (f2 + f3) / 2.0f;
            textPaint.setTextSize(f6);
            int n3 = string2.length();
            StaticLayout.Builder builder = StaticLayout.Builder.obtain((CharSequence)string2, (int)0, (int)n3, (TextPaint)textPaint, (int)n);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            builder = builder.setAlignment(alignment);
            alignment = null;
            float f7 = 1.0f;
            builder = builder.setLineSpacing(0.0f, f7).setIncludePad(false).build();
            float f8 = builder.getHeight();
            float f9 = this.getMaxLineWidth((StaticLayout)builder);
            float f10 = n2;
            float f11 = f8 == f10 ? 0 : (f8 < f10 ? -1 : 1);
            f10 = 0.03f;
            if (f11 <= 0 && (n3 = (int)((f5 = f9 - (f8 = (float)n)) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1))) <= 0) {
                f4 = f6;
                f2 = f10 += f6;
                continue;
            }
            f3 = f6 -= f10;
        }
        return f4;
    }

    public float calculateTextSize() {
        int n = (int)(this.rect.width() * 0.9f);
        int n2 = (int)(this.rect.height() * 0.95f);
        String string2 = this.txt;
        TextPaint textPaint = this.paintAya;
        return this.createBestSizeLayout(string2, textPaint, n, n2);
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
        String string2 = this.txt;
        TextPaint textPaint = this.paintAya;
        int n = this.viewWidth;
        float f = textPaint.getTextSize();
        TranslationQuranEntity translationQuranEntity = this;
        translationQuranEntity = this.createBalancedLayout(string2, textPaint, n, f, 2.0f);
        this.staticLayout = translationQuranEntity;
        float f2 = this.rect.centerY();
        float f3 = this.staticLayout.getHeight();
        float f4 = 0.5f;
        this.y = f2 -= (f3 *= f4);
        f2 = this.rect.centerX();
        f3 = (float)this.staticLayout.getWidth() * f4;
        this.x = f2 -= f3;
    }

    public void draw(Canvas canvas) {
        StaticLayout staticLayout = this.staticLayout;
        if (staticLayout != null) {
            Object object;
            StaticLayout staticLayout2;
            float f;
            int n;
            int n2 = this.isHaveBg;
            if (n2 != 0) {
                float f2 = this.rect.top;
                n2 = canvas.getWidth();
                float f3 = n2;
                staticLayout = this.rect;
                float f4 = staticLayout.bottom;
                TextPaint textPaint = this.paintBg;
                n = 0;
                f = 0.0f;
                staticLayout2 = null;
                object = canvas;
                canvas.drawRect(0.0f, f2, f3, f4, (Paint)textPaint);
            }
            canvas.save();
            float f5 = this.x;
            float f6 = this.offsetX;
            staticLayout2 = this.staticLayout;
            n = staticLayout2.getWidth();
            f = n;
            f6 = this.y;
            canvas.translate(f5 += (f6 *= f), f6);
            f5 = this.scaleX;
            canvas.scale(f5, f5);
            n2 = this.mPreset;
            object = AyaTextPreset.OUTLINE;
            int n3 = ((Enum)object).ordinal();
            if (n2 == n3 && (staticLayout = this.staticLayoutOutline) != null) {
                staticLayout = this.paintAyaOutline;
                object = this.paintAya;
                f6 = object.getTextSize();
                staticLayout.setTextSize(f6);
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
        var1_1 = this.paintAyaTrslOutline;
        var3_3 = this.paintAya.getAlpha();
        var1_1.setAlpha(var3_3);
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

    public int getClrAya() {
        return this.clrAya;
    }

    public int getClrBg() {
        return this.clrBg;
    }

    public int getDuration_fade() {
        float f = this.getEntityQuran().getRect().left;
        float f2 = this.getEntityQuran().getSecond_in_screen();
        f = Math.abs(f / f2);
        f2 = this.getEntityQuran().getRect().right;
        float f3 = this.getEntityQuran().getSecond_in_screen();
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

    public int getNumber() {
        return this.number;
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

    public boolean isHaveBg() {
        return this.isHaveBg;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void onResize(RectF rectF, int n, int n2) {
        int n3;
        RectF rectF2;
        float f = this.getCanvasH();
        float f2 = rectF.height();
        f -= f2;
        f2 = this.getCanvasW();
        float f3 = this.getCanvasH();
        this.rect = rectF2 = new RectF(0.0f, f, f2, f3);
        this.max_h = n2;
        this.max_w = n;
        this.viewWidth = n3 = (int)this.rect.width();
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
        float f2;
        float f3;
        this.setFactor_scale(f);
        float f4 = this.rect.height() * f;
        f = n;
        float f5 = 0.46f * f;
        RectF rectF = this.rect;
        rectF.left = f3 = this.rect.centerX() - f5;
        rectF = this.rect;
        rectF.right = f3 = this.rect.centerX() + f5;
        RectF rectF2 = this.rect;
        rectF2.top = f2 = this.rect.centerY() - (f4 *= 0.5f);
        rectF2 = this.rect;
        rectF2.bottom = f2 = this.rect.centerY() + f4;
        this.viewWidth = n = (int)this.rect.width();
        rectF2 = this.paintAya;
        f4 = this.calculateTextSize();
        rectF2.setTextSize(f4);
        this.createStaticLayout();
        f5 = this.paintAya.getTextSize() / f;
        this.setFcSize(f5);
        int n3 = this.getmPreset();
        this.initPreset(n3);
    }

    public void setAnimTest(boolean bl) {
        super.setAnimTest(bl);
    }

    public void setClrAya(int n) {
        this.clrAya = n;
    }

    public void setClrBg(int n) {
        this.clrBg = n;
        this.paintBg.setColor(n);
        this.paintBg.setAlpha(100);
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

    public void setHaveBg(boolean bl) {
        this.isHaveBg = bl;
    }

    public void setIndex(int n) {
        this.index = n;
    }

    public void setIpad_type(int n) {
        this.ipad_type = n;
    }

    public void setNumber(int n) {
        this.number = n;
    }

    public void setOpacityFade(int n) {
        this.paintAya.setAlpha(n);
        Object object = this.paintAyaTrslOutline;
        int n2 = this.paintAya.getAlpha();
        object.setAlpha(n2);
        object = this.paintAyaOutline;
        TextPaint textPaint = this.paintAya;
        n2 = textPaint.getAlpha();
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
            TranslationQuranEntity translationQuranEntity = this;
            this.applyAyaPreset((Paint)object2, ayaTextPreset2, n2, typeface, f);
            ayaTextPreset = this.getStaticLayoutOutline();
            this.staticLayoutOutline = ayaTextPreset;
            translationQuranEntity = this.paintAya;
            object2 = AyaTextPreset.NONE;
            int n3 = this.clrAya;
            Typeface typeface2 = this.paintAya.getTypeface();
            ayaTextPreset = this.paintAya;
            float f2 = ayaTextPreset.getTextSize();
            object = this;
            this.applyAyaPreset((Paint)translationQuranEntity, (AyaTextPreset)((Object)object2), n3, typeface2, f2);
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
        Object object = this.paintAyaTrslOutline;
        int n2 = this.paintAya.getAlpha();
        object.setAlpha(n2);
        object = this.paintAyaOutline;
        textPaint = this.paintAya;
        n2 = textPaint.getAlpha();
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
        Object object = this.paintAyaTrslOutline;
        int n2 = this.paintAya.getAlpha();
        object.setAlpha(n2);
        object = this.paintAyaOutline;
        textPaint = this.paintAya;
        n2 = textPaint.getAlpha();
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
        this.createStaticLayout();
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
        StaticLayout staticLayout = this.staticLayout;
        int n2 = staticLayout.getHeight();
        float f = n - n2;
        n2 = 0x3F000000;
        float f2 = 0.5f;
        this.y = f *= f2;
        RectF rectF = this.rect;
        f = rectF.centerX();
        StaticLayout staticLayout2 = this.staticLayout;
        int n3 = staticLayout2.getWidth();
        float f3 = (float)n3 * f2;
        this.x = f -= f3;
        canvas.save();
        n = this.isHaveBg ? 1 : 0;
        if (n != 0) {
            float f4 = canvas.getWidth();
            n = canvas.getHeight();
            float f5 = n;
            TextPaint textPaint = this.paintBg;
            n3 = 0;
            f3 = 0.0f;
            staticLayout2 = null;
            staticLayout = canvas;
            canvas.drawRect(0.0f, 0.0f, f4, f5, (Paint)textPaint);
        }
        f = this.x;
        f2 = this.y;
        canvas.translate(f, f2);
    }

    public void setupScale(float f, int n, int n2) {
        int n3;
        StaticLayout staticLayout;
        int n4;
        float f2 = n;
        this.viewWidth = n4 = (int)(0.9f * f2);
        String string2 = this.txt;
        TextPaint textPaint = this.paintAya;
        float f3 = f * f2;
        this.staticLayout = staticLayout = this.createBalancedLayout(string2, textPaint, n4, f3, 2.0f);
        f = staticLayout.getWidth();
        f2 = 0.5f;
        f *= f2;
        float f4 = (float)this.staticLayout.getHeight() * f2;
        float f5 = this.rect.height() * 0.12f;
        float f6 = this.rect.centerY();
        float f7 = this.rect.centerX();
        RectF rectF = this.rect;
        f3 = f7 - f;
        float f8 = f6 - f4 - f5;
        f6 = f6 + f4 + f5;
        rectF.set(f3, f8, f7 += f, f6);
        f = this.rect.height();
        f4 = 0.85f;
        this.max_h = n3 = Math.round(f * f4);
        this.max_w = n3 = Math.round(this.rect.width() * f4);
        f = this.rect.centerX();
        f4 = (float)this.staticLayout.getWidth() * f2;
        this.x = f -= f4;
        f = this.rect.centerY();
        f4 = (float)this.staticLayout.getHeight() * f2;
        this.y = f -= f4;
    }

    public void setupScaleSave(float f, int n) {
        int n2;
        StaticLayout staticLayout;
        int n3;
        this.viewWidth = n3 = Math.round(this.rect.width());
        String string2 = this.txt;
        TextPaint textPaint = this.paintAya;
        float f2 = n;
        float f3 = f * f2;
        this.staticLayout = staticLayout = this.createBalancedLayout(string2, textPaint, n3, f3, 2.0f);
        f = this.rect.height();
        f2 = 0.85f;
        this.max_h = n2 = Math.round(f * f2);
        this.max_w = n2 = Math.round(this.rect.width() * f2);
        f = this.rect.centerX();
        f2 = this.staticLayout.getWidth();
        float f4 = 0.5f;
        this.x = f -= (f2 *= f4);
        f = this.rect.centerY();
        f2 = (float)this.staticLayout.getHeight() * f4;
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
        this.rect = rectF;
        this.max_h = n2;
        this.max_w = n;
        this.viewWidth = n3 = (int)this.rect.width();
    }

    public void updatePaint(float f, int n) {
        int n2;
        this.paintAya.setTextSize(f);
        String string2 = this.txt;
        SpannableString spannableString = new SpannableString((CharSequence)string2);
        this.viewWidth = n;
        n = spannableString.length();
        string2 = this.paintAya;
        int n3 = this.viewWidth;
        spannableString = StaticLayout.Builder.obtain((CharSequence)spannableString, (int)0, (int)n, (TextPaint)string2, (int)n3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        spannableString = spannableString.setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = spannableString;
        f = this.rect.height();
        float f2 = 0.85f;
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

    public void updateStaticLayout() {
        SpannableString spannableString = this.spannableString;
        int n = spannableString.length();
        TextPaint textPaint = this.paintAya;
        int n2 = this.viewWidth;
        spannableString = StaticLayout.Builder.obtain((CharSequence)spannableString, (int)0, (int)n, (TextPaint)textPaint, (int)n2);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        spannableString = spannableString.setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = spannableString;
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

