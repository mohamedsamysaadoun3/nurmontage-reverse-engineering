/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
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
 *  android.text.TextDirectionHeuristic
 *  android.text.TextDirectionHeuristics
 *  android.text.TextPaint
 *  androidx.core.graphics.ColorUtils
 */
package hazem.nurmontage.videoquran.model;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import hazem.nurmontage.videoquran.Utils.ColorUtils;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.constant.SurahNameStyle;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.model.EntityView;
import hazem.nurmontage.videoquran.model.SurahNameEntity$1;
import java.io.Serializable;

public class SurahNameEntity
extends EntityView
implements Serializable {
    private Layout.Alignment alignment;
    private int clrBg;
    private int clrS_name;
    private EntityQuranTimeline entityQuran;
    private int index_surah;
    private int ipad_type;
    private boolean isHaveBg;
    private boolean isVisible;
    private int mPreset;
    private String name;
    private String nameFont;
    private String name_style;
    private final TextPaint paintAya;
    private final TextPaint paintAyaOutline;
    private final TextPaint paintAyaStyle;
    private final TextPaint paintAyaStyleOutline;
    private final TextPaint paintBg;
    private String reader;
    private StaticLayout staticLayout;
    private StaticLayout staticLayoutOutline;
    private StaticLayout staticLayoutStyle;
    private StaticLayout staticLayoutStyleOutline;
    private int style;
    private Typeface typefaceStyle;
    private int viewWidth;
    private float x;
    private float y;

    public SurahNameEntity(Layout.Alignment alignment, String string2, String string3, RectF rectF, Typeface typeface, int n, float f, String string4, int n2, Typeface typeface2, int n3, int n4, int n5, boolean bl, int n6) {
        int n7;
        float f2;
        TextPaint textPaint;
        TextPaint textPaint2;
        TextPaint textPaint3;
        String string5;
        this.name = string5 = "";
        this.reader = string5;
        this.nameFont = "\u062e\u0637 \u0627\u0644\u0625\u0628\u0644.otf";
        int n8 = 1;
        super(n8);
        this.paintAya = string5;
        this.paintBg = textPaint3 = new TextPaint(n8);
        this.paintAyaStyle = textPaint2 = new TextPaint(n8);
        this.paintAyaStyleOutline = textPaint = new TextPaint(n8);
        this.paintAyaOutline = textPaint = new TextPaint(n8);
        this.setFactor_scale(f);
        this.clrBg = n6;
        this.isHaveBg = bl;
        this.setIpad_type(n5);
        this.style = n3;
        this.index_surah = n4;
        this.setupSurahFont();
        this.typefaceStyle = typeface2;
        textPaint2.setTypeface(typeface2);
        this.name = string2;
        this.mPreset = n2;
        this.reader = string3;
        this.x = f2 = rectF.left;
        this.y = f2 = rectF.top;
        this.rect = rectF;
        this.setVisible(n8 != 0);
        this.viewWidth = n7 = (int)rectF.width();
        string5.setTypeface(typeface);
        string5.setColor(n);
        n7 = string5.getColor();
        textPaint2.setColor(n7);
        textPaint3.setColor(n6);
        textPaint3.setAlpha(180);
        this.setClrS_name(n);
        string5.setTextSize(0.05f);
        this.nameFont = string4;
        this.alignment = alignment;
        float f3 = this.getFactor_scale();
        float f4 = 1.0f;
        n7 = f3 == f4 ? 0 : (f3 > f4 ? 1 : -1);
        if (n7 != 0) {
            f3 = this.getFactor_scale();
            this.scale(f3, n8, n8);
        } else {
            this.createStaticLayout();
        }
    }

    private void createStaticLayout() {
        int n;
        String string2;
        float f;
        int n2;
        Object object;
        int n3 = this.style;
        Object object2 = SurahNameStyle.ZAGHRAFAT;
        int n4 = object2.ordinal();
        if (n3 == n4) {
            object = this.reader;
        } else {
            object = this.name;
            object2 = this.reader;
            n4 = ((String)object2).length();
            n2 = 3;
            f = 4.2E-45f;
            if (n4 > n2) {
                object2 = new StringBuilder();
                object = ((StringBuilder)object2).append((String)object).append("\n");
                object2 = this.reader;
                object = ((StringBuilder)object).append((String)object2).toString();
            }
        }
        object2 = new SpannableString((CharSequence)object);
        n3 = this.style;
        Object object3 = SurahNameStyle.ZAGHRAFAT;
        n2 = ((Enum)object3).ordinal();
        float f2 = 1.0f;
        float f3 = 0.5f;
        if (n3 == n2) {
            object = this.paintAyaStyle;
            object3 = this.name_style;
            float f4 = this.viewWidth;
            float f5 = 0.9f;
            int n5 = (int)(f4 * f5);
            int n6 = (int)(this.rect.height() * f3);
            f = this.calculateTextSize((String)object3, (Paint)object, n5, n6);
            object.setTextSize(f);
            object = this.name_style;
            n2 = object.length();
            string2 = this.paintAyaStyle;
            n6 = this.viewWidth;
            object = StaticLayout.Builder.obtain((CharSequence)object, (int)0, (int)n2, (TextPaint)string2, (int)n6);
            object3 = Layout.Alignment.ALIGN_CENTER;
            object = object.setAlignment((Layout.Alignment)object3).setLineSpacing(0.0f, f2);
            object3 = TextDirectionHeuristics.LTR;
            object = object.setTextDirection((TextDirectionHeuristic)object3).setIncludePad(false).build();
            this.staticLayoutStyle = object;
            object = Layout.Alignment.ALIGN_CENTER;
            object3 = this.paintAya;
            string2 = this.reader;
            n = (int)((float)this.viewWidth * f5);
            RectF rectF = this.rect;
            float f6 = rectF.height();
            float f7 = 0.4f;
            n6 = (int)(f6 *= f7);
            f4 = this.calculateTextSize(string2, (Paint)object3, n, n6);
            object3.setTextSize(f4);
        } else {
            object = this.alignment;
            object3 = this.name;
            n2 = ((String)object3).length();
            string2 = this.reader;
            int n7 = string2.length();
            n = 1061997773;
            float f8 = 0.8f;
            if (n2 > n7) {
                object3 = this.paintAya;
                string2 = this.name;
                float f9 = (float)this.viewWidth * f8;
                int n8 = (int)f9;
                RectF rectF = this.rect;
                float f10 = rectF.height() * f8;
                n = (int)f10;
                float f11 = this.calculateTextSize(string2, (Paint)object3, n8, n);
                object3.setTextSize(f11);
            } else {
                object3 = this.paintAya;
                string2 = this.reader;
                float f12 = (float)this.viewWidth * f8;
                int n9 = (int)f12;
                RectF rectF = this.rect;
                float f13 = rectF.height() * f8;
                n = (int)f13;
                float f14 = this.calculateTextSize(string2, (Paint)object3, n9, n);
                object3.setTextSize(f14);
            }
        }
        n2 = object2.length();
        string2 = this.paintAya;
        n = this.viewWidth;
        object = StaticLayout.Builder.obtain((CharSequence)object2, (int)0, (int)n2, (TextPaint)string2, (int)n).setAlignment((Layout.Alignment)object).setLineSpacing(0.0f, f2);
        object2 = TextDirectionHeuristics.LTR;
        object = object.setTextDirection((TextDirectionHeuristic)object2).setIncludePad(false).build();
        this.staticLayout = object;
        n3 = this.getmPreset();
        object = this.get(n3);
        this.setPreset((AyaTextPreset)((Object)object));
        n3 = this.style;
        object2 = SurahNameStyle.ZAGHRAFAT;
        n4 = object2.ordinal();
        if (n3 == n4 && (object = this.staticLayoutStyle) != null) {
            object = this.rect;
            float f15 = object.centerY();
            object2 = this.staticLayoutStyle;
            n4 = object2.getHeight();
            object3 = this.staticLayout;
            n2 = object3.getHeight();
            float f16 = (float)(n4 += n2) * f3;
            this.y = f15 -= f16;
        } else {
            object = this.rect;
            float f17 = object.centerY();
            object2 = this.staticLayout;
            n4 = object2.getHeight();
            float f18 = (float)n4 * f3;
            this.y = f17 -= f18;
        }
    }

    private StaticLayout getStaticLayoutOutline() {
        int n;
        int n2 = this.style;
        Object object = SurahNameStyle.ZAGHRAFAT;
        int n3 = ((Enum)object).ordinal();
        float f = 1.0f;
        if (n2 == n3) {
            String string2 = this.reader;
            n3 = string2.length();
            TextPaint textPaint = this.paintAyaOutline;
            int n4 = this.viewWidth;
            string2 = StaticLayout.Builder.obtain((CharSequence)string2, (int)0, (int)n3, (TextPaint)textPaint, (int)n4);
            object = Layout.Alignment.ALIGN_CENTER;
            string2 = string2.setAlignment((Layout.Alignment)object).setLineSpacing(0.0f, f);
            object = TextDirectionHeuristics.LTR;
            return string2.setTextDirection((TextDirectionHeuristic)object).setIncludePad(false).build();
        }
        CharSequence charSequence = this.name;
        object = this.reader;
        n3 = ((String)object).length();
        if (n3 > (n = 3)) {
            object = new StringBuilder();
            charSequence = ((StringBuilder)object).append((String)charSequence).append("\n");
            object = this.reader;
            charSequence = ((StringBuilder)charSequence).append((String)object).toString();
        }
        n3 = ((String)charSequence).length();
        TextPaint textPaint = this.paintAyaOutline;
        int n5 = this.viewWidth;
        charSequence = StaticLayout.Builder.obtain((CharSequence)charSequence, (int)0, (int)n3, (TextPaint)textPaint, (int)n5);
        object = this.alignment;
        charSequence = charSequence.setAlignment((Layout.Alignment)object).setLineSpacing(0.0f, f);
        object = TextDirectionHeuristics.LTR;
        return charSequence.setTextDirection((TextDirectionHeuristic)object).setIncludePad(false).build();
    }

    private StaticLayout getStaticLayoutStyleOutline() {
        String string2 = this.name_style;
        int n = string2.length();
        TextPaint textPaint = this.paintAyaStyleOutline;
        int n2 = this.viewWidth;
        string2 = StaticLayout.Builder.obtain((CharSequence)string2, (int)0, (int)n, (TextPaint)textPaint, (int)n2);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        string2 = string2.setAlignment(alignment).setLineSpacing(0.0f, 1.0f);
        alignment = TextDirectionHeuristics.LTR;
        return string2.setTextDirection((TextDirectionHeuristic)alignment).setIncludePad(false).build();
    }

    private void updatePaintStyle() {
        StaticLayout staticLayout = this.staticLayoutStyle;
        if (staticLayout != null) {
            staticLayout = this.paintAyaStyle;
            float f = staticLayout.getTextSize();
            this.paintAyaStyle.reset();
            TextPaint textPaint = this.paintAyaStyle;
            TextPaint textPaint2 = this.paintAya;
            textPaint.set(textPaint2);
            textPaint = this.paintAyaStyle;
            textPaint2 = this.typefaceStyle;
            textPaint.setTypeface((Typeface)textPaint2);
            textPaint = this.paintAyaStyle;
            textPaint.setTextSize(f);
        }
    }

    public void applyAyaPreset(Paint paint, AyaTextPreset ayaTextPreset, int n, Typeface object, float f) {
        paint.reset();
        paint.setTypeface((Typeface)object);
        paint.setTextSize(f);
        int n2 = 1;
        float f2 = Float.MIN_VALUE;
        paint.setAntiAlias(n2 != 0);
        paint.setSubpixelText(n2 != 0);
        paint.setDither(n2 != 0);
        object = Paint.Style.FILL;
        paint.setStyle((Paint.Style)object);
        paint.setColor(n);
        n2 = this.style;
        SurahNameStyle surahNameStyle = SurahNameStyle.ZAGHRAFAT;
        int n3 = surahNameStyle.ordinal();
        if (n2 == n3) {
            object = this.paintAyaStyleOutline;
            if (object == paint) {
                n2 = 0x3F000000;
                f2 = 0.5f;
                f *= f2;
            }
            if ((object = this.paintAyaOutline) == paint) {
                n2 = 1067869798;
                f2 = 1.3f;
                f *= f2;
            }
        }
        object = SurahNameEntity$1.$SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset;
        Object object2 = ayaTextPreset.ordinal();
        object2 = object[object2];
        n2 = 2;
        f2 = 2.8E-45f;
        if (object2 != n2) {
            n2 = 3;
            f2 = 4.2E-45f;
            if (object2 != n2) {
                n2 = 4;
                f2 = 5.6E-45f;
                if (object2 == n2) {
                    f *= 0.45f;
                    float f3 = 3.57E-43f;
                    object2 = androidx.core.graphics.ColorUtils.setAlphaComponent((int)n, (int)255);
                    n = 0;
                    float f4 = 0.0f;
                    Object var13_17 = null;
                    paint.setShadowLayer(f, 0.0f, 0.0f, object2);
                }
            } else {
                object2 = this.ipad_type;
                IpadType ipadType = IpadType.HEART;
                n = ipadType.ordinal();
                if (object2 != n && (object2 = this.ipad_type) != (n = (ipadType = IpadType.BATTERY).ordinal()) && (object2 = this.ipad_type) != (n = (ipadType = IpadType.BLUE_TYPE).ordinal()) && (object2 = (Object)this.isHaveBg()) == 0) {
                    object2 = -16777216;
                    float f5 = -1.7014118E38f;
                } else {
                    object2 = -1;
                    float f6 = 0.0f / 0.0f;
                }
                n = 1043878380;
                float f7 = 0.18f * f;
                n2 = 180;
                f2 = 2.52E-43f;
                object2 = androidx.core.graphics.ColorUtils.setAlphaComponent((int)object2, (int)n2);
                paint.setShadowLayer(f7, f *= 0.08f, f, object2);
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
            object2 = this.ipad_type;
            object = IpadType.HEART;
            n2 = ((Enum)object).ordinal();
            f = 0.85f;
            if (object2 != n2 && (object2 = this.ipad_type) != (n2 = ((Enum)(object = IpadType.BATTERY)).ordinal()) && (object2 = this.ipad_type) != (n2 = ((Enum)(object = IpadType.BLUE_TYPE)).ordinal()) && (object2 = (Object)this.isHaveBg()) == 0) {
                object2 = ColorUtils.darkenColor(n, f);
                paint.setColor(object2);
            } else {
                object2 = ColorUtils.lightenColor(n, f);
                paint.setColor(object2);
            }
        }
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

    public void draw(Canvas canvas) {
        StaticLayout staticLayout = this.staticLayout;
        if (staticLayout != null) {
            AyaTextPreset ayaTextPreset;
            float f;
            float f2;
            int n;
            Enum enum_;
            int n2 = this.isHaveBg();
            int n3 = 1064178811;
            float f3 = 0.93f;
            if (n2 != 0) {
                n2 = this.style;
                enum_ = SurahNameStyle.ZAGHRAFAT;
                n = enum_.ordinal();
                if (n2 == n) {
                    staticLayout = this.staticLayout;
                    n2 = staticLayout.getHeight();
                    f2 = n2;
                    f = (float)this.staticLayoutStyle.getHeight() * f3;
                    f2 = (f2 + f) * 0.5f;
                    float f4 = this.rect.centerY() - f2;
                    n = canvas.getWidth();
                    float f5 = n;
                    enum_ = this.rect;
                    f = enum_.centerY();
                    float f6 = f + f2;
                    TextPaint textPaint = this.paintBg;
                    float f7 = 0.0f;
                    canvas.drawRect(0.0f, f4, f5, f6, (Paint)textPaint);
                } else {
                    float f8 = this.rect.top;
                    n2 = canvas.getWidth();
                    float f9 = n2;
                    staticLayout = this.rect;
                    float f10 = staticLayout.bottom;
                    TextPaint textPaint = this.paintBg;
                    enum_ = canvas;
                    canvas.drawRect(0.0f, f8, f9, f10, (Paint)textPaint);
                }
            }
            canvas.save();
            f2 = this.x;
            f = this.y;
            canvas.translate(f2, f);
            n2 = this.style;
            enum_ = SurahNameStyle.ZAGHRAFAT;
            n = enum_.ordinal();
            if (n2 == n && (staticLayout = this.staticLayoutStyle) != null) {
                n2 = this.mPreset;
                enum_ = AyaTextPreset.OUTLINE;
                n = enum_.ordinal();
                if (n2 == n && (staticLayout = this.staticLayoutStyleOutline) != null) {
                    staticLayout = this.paintAyaStyleOutline;
                    enum_ = this.paintAyaStyle;
                    f = enum_.getTextSize();
                    staticLayout.setTextSize(f);
                    staticLayout = this.staticLayoutStyleOutline;
                    staticLayout.draw(canvas);
                }
                this.staticLayoutStyle.draw(canvas);
                staticLayout = this.staticLayoutStyle;
                n2 = staticLayout.getHeight();
                f2 = (float)n2 * f3;
                n3 = 0;
                f3 = 0.0f;
                ayaTextPreset = null;
                canvas.translate(0.0f, f2);
            }
            if ((n2 = this.mPreset) == (n3 = (ayaTextPreset = AyaTextPreset.OUTLINE).ordinal()) && (staticLayout = this.staticLayoutOutline) != null) {
                staticLayout = this.paintAyaOutline;
                ayaTextPreset = this.paintAya;
                f3 = ayaTextPreset.getTextSize();
                staticLayout.setTextSize(f3);
                staticLayout = this.staticLayoutOutline;
                staticLayout.draw(canvas);
            }
            staticLayout = this.staticLayout;
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public void endAnimator() {
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

    public int getClrBg() {
        return this.clrBg;
    }

    public int getClrS_name() {
        return this.clrS_name;
    }

    public EntityQuranTimeline getEntityQuran() {
        return this.entityQuran;
    }

    public int getIndex_surah() {
        return this.index_surah;
    }

    public String getName() {
        return this.name;
    }

    public String getNameFont() {
        return this.nameFont;
    }

    public TextPaint getPaintAya() {
        return this.paintAya;
    }

    public String getReader() {
        return this.reader;
    }

    public StaticLayout getStaticLayout() {
        return this.staticLayout;
    }

    public int getStyle() {
        return this.style;
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
        AyaTextPreset ayaTextPreset = this.get(n);
        this.setPreset(ayaTextPreset);
    }

    public boolean isHaveBg() {
        return this.isHaveBg;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void move() {
        float f;
        RectF rectF = this.rect;
        this.x = f = rectF.left;
        int n = this.style;
        SurahNameStyle surahNameStyle = SurahNameStyle.ZAGHRAFAT;
        int n2 = surahNameStyle.ordinal();
        float f2 = 0.5f;
        if (n == n2 && (rectF = this.staticLayoutStyle) != null) {
            rectF = this.rect;
            f = rectF.centerY();
            surahNameStyle = this.staticLayoutStyle;
            n2 = surahNameStyle.getHeight();
            StaticLayout staticLayout = this.staticLayout;
            int n3 = staticLayout.getHeight();
            float f3 = (float)(n2 += n3) * f2;
            this.y = f -= f3;
        } else {
            rectF = this.rect;
            f = rectF.centerY();
            surahNameStyle = this.staticLayout;
            n2 = surahNameStyle.getHeight();
            float f4 = (float)n2 * f2;
            this.y = f -= f4;
        }
    }

    public void postTranslate(float f, float f2) {
        RectF rectF = this.rect;
        rectF.offset(f, f2);
        RectF rectF2 = this.rect;
        this.x = f = rectF2.left;
        int n = this.style;
        SurahNameStyle surahNameStyle = SurahNameStyle.ZAGHRAFAT;
        int n2 = surahNameStyle.ordinal();
        float f3 = 0.5f;
        if (n == n2 && (rectF2 = this.staticLayoutStyle) != null) {
            rectF2 = this.rect;
            f = rectF2.centerY();
            surahNameStyle = this.staticLayoutStyle;
            n2 = surahNameStyle.getHeight();
            StaticLayout staticLayout = this.staticLayout;
            int n3 = staticLayout.getHeight();
            f2 = (float)(n2 += n3) * f3;
            this.y = f -= f2;
        } else {
            rectF2 = this.rect;
            f = rectF2.centerY();
            surahNameStyle = this.staticLayout;
            n2 = surahNameStyle.getHeight();
            f2 = (float)n2 * f3;
            this.y = f -= f2;
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
        this.createStaticLayout();
        this.x = f = this.rect.left;
    }

    public void setAlignment(Layout.Alignment alignment) {
        this.alignment = alignment;
    }

    public void setClrBg(int n) {
        this.clrBg = n;
        this.paintBg.setColor(n);
        this.paintBg.setAlpha(180);
    }

    public void setClrS_name(int n) {
        this.clrS_name = n;
    }

    public void setColor(int n) {
        this.setClrS_name(n);
        this.paintAya.setColor(n);
        this.paintAyaStyle.setColor(n);
    }

    public void setEntityQuran(EntityQuranTimeline entityQuranTimeline) {
        this.entityQuran = entityQuranTimeline;
    }

    public void setIndex_surah(int n) {
        this.index_surah = n;
        this.setupSurahFont();
    }

    public void setIpad_type(int n) {
        this.ipad_type = n;
    }

    public void setNameAndReader(Layout.Alignment alignment, String string2, String string3) {
        this.name = string2;
        this.reader = string3;
        this.alignment = alignment;
        this.paintAya.setTextSize(0.05f);
        this.createStaticLayout();
    }

    public void setPreset(AyaTextPreset ayaTextPreset) {
        int n;
        this.mPreset = n = ayaTextPreset.ordinal();
        Object object = AyaTextPreset.OUTLINE;
        if (ayaTextPreset == object) {
            Object object2 = this.paintAyaStyleOutline;
            AyaTextPreset ayaTextPreset2 = AyaTextPreset.OUTLINE;
            int n2 = this.clrS_name;
            Typeface typeface = this.paintAyaStyle.getTypeface();
            float f = this.paintAyaStyle.getTextSize();
            SurahNameEntity surahNameEntity = this;
            this.applyAyaPreset((Paint)object2, ayaTextPreset2, n2, typeface, f);
            ayaTextPreset = this.getStaticLayoutStyleOutline();
            this.staticLayoutStyleOutline = ayaTextPreset;
            surahNameEntity = this.paintAyaStyle;
            object2 = AyaTextPreset.NONE;
            int n3 = this.clrS_name;
            Typeface typeface2 = this.paintAyaStyle.getTypeface();
            float f2 = this.paintAyaStyle.getTextSize();
            object = this;
            this.applyAyaPreset((Paint)surahNameEntity, (AyaTextPreset)((Object)object2), n3, typeface2, f2);
            TextPaint textPaint = this.paintAyaOutline;
            AyaTextPreset ayaTextPreset3 = AyaTextPreset.OUTLINE;
            int n4 = this.clrS_name;
            Typeface typeface3 = this.paintAya.getTypeface();
            float f3 = this.paintAya.getTextSize();
            this.applyAyaPreset((Paint)textPaint, ayaTextPreset3, n4, typeface3, f3);
            ayaTextPreset = this.getStaticLayoutOutline();
            this.staticLayoutOutline = ayaTextPreset;
            surahNameEntity = this.paintAya;
            object2 = AyaTextPreset.NONE;
            n3 = this.clrS_name;
            typeface2 = this.paintAya.getTypeface();
            ayaTextPreset = this.paintAya;
            f2 = ayaTextPreset.getTextSize();
            this.applyAyaPreset((Paint)surahNameEntity, (AyaTextPreset)((Object)object2), n3, typeface2, f2);
        } else {
            TextPaint textPaint = this.paintAya;
            int n5 = this.clrS_name;
            Typeface typeface = textPaint.getTypeface();
            object = this.paintAya;
            float f = object.getTextSize();
            AyaTextPreset ayaTextPreset4 = ayaTextPreset;
            this.applyAyaPreset((Paint)textPaint, ayaTextPreset, n5, typeface, f);
            this.updatePaintStyle();
        }
    }

    public void setRect(RectF rectF) {
        float f;
        float f2;
        this.rect = rectF;
        this.y = f2 = rectF.top;
        this.x = f = rectF.left;
    }

    public void setStyle(Context context, int n, String string2, boolean bl) {
        Object object = this.typefaceStyle;
        if (object == null) {
            context = context.getResources().getAssets();
            object = "fonts/surah_name.otf";
            context = Typeface.createFromAsset((AssetManager)context, (String)object);
            this.typefaceStyle = context;
        }
        this.isHaveBg = bl;
        context = this.paintAyaStyle;
        Typeface typeface = this.typefaceStyle;
        context.setTypeface(typeface);
        this.style = n;
        this.reader = string2;
        this.paintAya.setTextSize(0.05f);
        this.createStaticLayout();
    }

    public void setTypeface(Typeface typeface, String string2) {
        this.paintAya.setTypeface(typeface);
        this.nameFont = string2;
        this.createStaticLayout();
    }

    public void setVisible(boolean bl) {
        this.isVisible = bl;
    }

    public void setupSurahFont() {
        int n = this.index_surah;
        int n2 = 10;
        String string2 = "sura";
        if (n < n2) {
            String string3 = "00";
            CharSequence charSequence = new StringBuilder(string3);
            n2 = this.index_surah;
            charSequence = charSequence.append(n2).append(string2).toString();
            this.name_style = charSequence;
        } else {
            n2 = 100;
            if (n < n2) {
                String string4 = "0";
                CharSequence charSequence = new StringBuilder(string4);
                n2 = this.index_surah;
                charSequence = charSequence.append(n2).append(string2).toString();
                this.name_style = charSequence;
            } else {
                CharSequence charSequence = new StringBuilder();
                n2 = this.index_surah;
                charSequence = charSequence.append(n2).append(string2).toString();
                this.name_style = charSequence;
            }
        }
    }

    public void singleDraw(Canvas canvas) {
        StaticLayout staticLayout = this.staticLayout;
        if (staticLayout != null) {
            this.createStaticLayout();
            staticLayout = this.staticLayout;
            staticLayout.draw(canvas);
        }
    }

    public void update(RectF rectF) {
        int n;
        float f;
        this.rect = rectF;
        this.y = f = rectF.top;
        this.x = f = rectF.left;
        this.viewWidth = n = (int)rectF.width();
        this.paintAya.setTextSize(0.05f);
        this.createStaticLayout();
    }
}

