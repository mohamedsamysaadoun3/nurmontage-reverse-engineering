// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.views.TrackEntityView;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.constant.TransitionType;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import hazem.nurmontage.videoquran.constant.IpadType;
import androidx.core.graphics.ColorUtils;
import android.graphics.Paint$Style;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import android.graphics.Paint;
import android.text.Layout$Alignment;
import android.text.StaticLayout$Builder;
import android.graphics.Typeface;
import android.graphics.RectF;
import java.lang.ref.WeakReference;
import android.text.StaticLayout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.animation.ObjectAnimator;
import java.io.Serializable;

public class TranslationQuranEntity extends EntityView implements Serializable
{
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
    
    public TranslationQuranEntity(int max_w, final int n, final String txt, final RectF rect, final Typeface typeface, final int number, final int n2, final String nameFont) {
        final int n3 = -16777216;
        this.clrBg = n3;
        final boolean b = true;
        this.isHaveBg = b;
        this.scaleX = 1.0f;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        final TextPaint paintAya = new TextPaint((int)(b ? 1 : 0));
        this.paintAya = paintAya;
        this.paintAyaOutline = new TextPaint((int)(b ? 1 : 0));
        this.paintAyaTrslOutline = new TextPaint((int)(b ? 1 : 0));
        final TextPaint paintBg = new TextPaint((int)(b ? 1 : 0));
        this.paintBg = paintBg;
        this.setCanvasWH(max_w, n);
        this.txt = txt;
        this.nameFont = nameFont;
        this.number = number;
        this.rect = rect;
        this.setVisible(b);
        max_w = (int)rect.width();
        this.viewWidth = max_w;
        paintAya.setTypeface(typeface);
        paintAya.setColor(n2);
        paintBg.setColor(n3);
        paintBg.setAlpha(100);
        this.setClrAya(n2);
        final float height = this.rect.height();
        final float n4 = 0.85f;
        max_w = (int)(height * n4);
        this.max_h = max_w;
        max_w = (int)(this.rect.width() * n4);
        this.max_w = max_w;
    }
    
    public TranslationQuranEntity(final String txt, final RectF rectF, final Typeface typeface, final int number, final int n, final String nameFont, final float textSize) {
        final int n2 = -16777216;
        this.clrBg = n2;
        final boolean b = true;
        this.isHaveBg = b;
        this.scaleX = 1.0f;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        final TextPaint paintAya = new TextPaint((int)(b ? 1 : 0));
        this.paintAya = paintAya;
        this.paintAyaOutline = new TextPaint((int)(b ? 1 : 0));
        this.paintAyaTrslOutline = new TextPaint((int)(b ? 1 : 0));
        final TextPaint paintBg = new TextPaint((int)(b ? 1 : 0));
        this.paintBg = paintBg;
        this.txt = txt;
        this.nameFont = nameFont;
        this.number = number;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.setVisible(b);
        this.viewWidth = (int)rectF.width();
        paintAya.setTypeface(typeface);
        paintAya.setColor(n);
        paintAya.setTextSize(textSize);
        paintBg.setColor(n2);
        paintBg.setAlpha(100);
        this.setClrAya(n);
        final float height = this.rect.height();
        final float n3 = 0.85f;
        this.max_h = (int)(height * n3);
        this.max_w = (int)(this.rect.width() * n3);
    }
    
    public TranslationQuranEntity(final String txt, final RectF rectF, final Typeface typeface, final int number, final int color, final String nameFont, final float textSize, final boolean b) {
        final int n = -16777216;
        this.clrBg = n;
        final boolean b2 = true;
        this.isHaveBg = b2;
        this.scaleX = 1.0f;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        final TextPaint paintAya = new TextPaint((int)(b2 ? 1 : 0));
        this.paintAya = paintAya;
        this.paintAyaOutline = new TextPaint((int)(b2 ? 1 : 0));
        this.paintAyaTrslOutline = new TextPaint((int)(b2 ? 1 : 0));
        final TextPaint paintBg = new TextPaint((int)(b2 ? 1 : 0));
        this.paintBg = paintBg;
        this.txt = txt;
        this.nameFont = nameFont;
        this.number = number;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.setVisible(b2);
        this.viewWidth = (int)rectF.width();
        paintAya.setTypeface(typeface);
        paintAya.setColor(color);
        paintAya.setTextSize(textSize);
        final float height = this.rect.height();
        final float n2 = 0.85f;
        this.max_h = (int)(height * n2);
        this.max_w = (int)(this.rect.width() * n2);
        paintBg.setColor(n);
        paintBg.setAlpha(100);
    }
    
    public TranslationQuranEntity(final String txt, final RectF rectF, final Typeface typeface, final int number, final int n, final String nameFont, final int n2, final int n3) {
        final int n4 = -16777216;
        this.clrBg = n4;
        final boolean b = true;
        this.isHaveBg = b;
        this.scaleX = 1.0f;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        final TextPaint paintAya = new TextPaint((int)(b ? 1 : 0));
        this.paintAya = paintAya;
        this.paintAyaOutline = new TextPaint((int)(b ? 1 : 0));
        this.paintAyaTrslOutline = new TextPaint((int)(b ? 1 : 0));
        final TextPaint paintBg = new TextPaint((int)(b ? 1 : 0));
        this.paintBg = paintBg;
        this.setCanvasWH(n2, n3);
        this.txt = txt;
        this.nameFont = nameFont;
        this.number = number;
        final float n5 = (float)n3;
        this.rect = new RectF(0.0f, n5 - rectF.height(), (float)n2, n5);
        this.setVisible(b);
        this.viewWidth = (int)rectF.width();
        paintAya.setTypeface(typeface);
        paintAya.setColor(n);
        paintAya.setTextSize(this.calculateTextSize());
        paintBg.setColor(n4);
        paintBg.setAlpha(100);
        this.setClrAya(n);
        final float height = this.rect.height();
        final float n6 = 0.85f;
        this.max_h = (int)(height * n6);
        this.max_w = (int)(this.rect.width() * n6);
        this.createStaticLayout();
    }
    
    private StaticLayout buildStaticLayout(final String s, final TextPaint textPaint, final int n) {
        return StaticLayout$Builder.obtain((CharSequence)s, 0, s.length(), textPaint, n).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }
    
    private StaticLayout createBalancedLayout(final String s, final TextPaint textPaint, final int n, float textSize, final float n2) {
        final SpannableString spannableString = new SpannableString((CharSequence)s);
        StaticLayout build;
        do {
            textPaint.setTextSize(textSize);
            final int length = spannableString.length();
            int n3 = 0;
            final StaticLayout$Builder setIncludePad = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, length, textPaint, n).setAlignment(Layout$Alignment.ALIGN_CENTER).setIncludePad(false);
            final float n4 = 1.0f;
            build = setIncludePad.setLineSpacing(0.0f, n4).build();
            final int lineCount = build.getLineCount();
            int n5 = 1;
            if (lineCount <= n5) {
                break;
            }
            final int n6 = lineCount - 1;
            if (s.substring(build.getLineStart(n6), build.getLineEnd(n6)).trim().split("\\s+").length <= n5) {
                n3 = n5;
            }
            if (build.getLineWidth(n6) >= n * 0.25f) {
                n5 = n3;
            }
            if (n5 == 0) {
                break;
            }
            textSize -= n4;
        } while (textSize > n2);
        return build;
    }
    
    private float createBestSizeLayout(final String s, final TextPaint textPaint, final int n, final int n2) {
        float textSize;
        float textSize2;
        for (textSize = this.rect.height() * 0.28f, textSize2 = this.rect.height() * 0.08f; textSize >= textSize2; --textSize) {
            textPaint.setTextSize(textSize);
            if (StaticLayout$Builder.obtain((CharSequence)s, 0, s.length(), textPaint, n).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.12f).setIncludePad(false).build().getHeight() <= n2) {
                return textPaint.getTextSize();
            }
        }
        textPaint.setTextSize(textSize2);
        return textPaint.getTextSize();
    }
    
    private void fadeIn(final int n, final boolean b) {
        (this.objectAnimator = ObjectAnimator.ofInt((Object)this, "OpacityFade", new int[] { 0, 255 })).setDuration((long)n);
        if (b) {
            this.objectAnimator.setRepeatMode(1);
            this.objectAnimator.setRepeatCount(-1);
        }
        this.objectAnimator.start();
    }
    
    private void fadeOut(final int n, final boolean b) {
        (this.objectAnimator = ObjectAnimator.ofInt((Object)this, "OpacityFade", new int[] { 255, 0 })).setDuration((long)n);
        if (b) {
            this.objectAnimator.setRepeatMode(1);
            this.objectAnimator.setRepeatCount(-1);
        }
        this.objectAnimator.start();
    }
    
    private float getMaxLineWidth(final StaticLayout staticLayout) {
        float max = 0.0f;
        for (int i = 0; i < staticLayout.getLineCount(); ++i) {
            max = Math.max(max, staticLayout.getLineWidth(i));
        }
        return max;
    }
    
    private StaticLayout getStaticLayoutOutline() {
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        return StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAyaOutline, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }
    
    public void applyAll(int n, final RectF rectF, float n2, float fcSize) {
        final int round = Math.round(rectF.width());
        this.viewWidth = round;
        final StaticLayout balancedLayout = this.createBalancedLayout(this.txt, this.paintAya, round, n2, 2.0f);
        this.staticLayout = balancedLayout;
        final float n3 = (float)balancedLayout.getWidth();
        this.setFcSize(fcSize);
        n2 = this.rect.height() * 0.12f;
        fcSize = 0.5f;
        final float n4 = n3 * fcSize;
        final float n5 = this.staticLayout.getHeight() * fcSize;
        this.rect.set(rectF.centerX() - n4, rectF.centerY() - n5 - n2, rectF.centerX() + n4, rectF.centerY() + n5 + n2);
        this.x = this.rect.centerX() - this.staticLayout.getWidth() * fcSize;
        this.y = this.rect.centerY() - this.staticLayout.getHeight() * fcSize;
        final float height = this.rect.height();
        final float n6 = 0.85f;
        n = Math.round(height * n6);
        this.max_h = n;
        n = Math.round(this.rect.width() * n6);
        this.max_w = n;
        n = this.getmPreset();
        this.initPreset(n);
    }
    
    public void applyAll(int n, final RectF rectF, float width, float fcSize, final TranslationQuranEntity translationQuranEntity) {
        this.paintAya.setTextSize(width);
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        width = rectF.width();
        this.viewWidth = (int)((int)Math.max(width, (float)Math.round(this.paintAya.measureText(spannableString.toString()))) * 1.1f);
        final StaticLayout build = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = build;
        final float n2 = (float)build.getWidth();
        this.setFcSize(fcSize);
        width = 0.5f;
        fcSize = n2 * width;
        final float n3 = this.rect.height() * (n2 / this.rect.width()) * width;
        this.rect.set(rectF.centerX() - fcSize, rectF.centerY() - n3, rectF.centerX() + fcSize, rectF.centerY() + n3);
        this.x = this.rect.centerX() - this.staticLayout.getWidth() * width;
        this.y = this.rect.centerY() - this.staticLayout.getHeight() * width;
        final float height = this.rect.height();
        final float n4 = 0.85f;
        n = Math.round(height * n4);
        this.max_h = n;
        n = Math.round(this.rect.width() * n4);
        this.max_w = n;
        n = this.getmPreset();
        this.initPreset(n);
    }
    
    public void applyAyaPreset(final Paint paint, final AyaTextPreset ayaTextPreset, int color, final Typeface typeface, float n) {
        paint.reset();
        paint.setTypeface(typeface);
        paint.setTextSize(n);
        final boolean dither = true;
        paint.setAntiAlias(dither);
        paint.setSubpixelText(dither);
        paint.setDither(dither);
        paint.setStyle(Paint$Style.FILL);
        paint.setColor(color);
        if (paint == this.paintAyaTrslOutline) {
            n *= 1.35f;
        }
        final int n2 = TranslationQuranEntity$1.$SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset[ayaTextPreset.ordinal()];
        if (n2 != 2) {
            if (n2 != 3) {
                if (n2 == 4) {
                    n *= 0.45f;
                    final int setAlphaComponent = ColorUtils.setAlphaComponent(color, 255);
                    color = 0;
                    paint.setShadowLayer(n, 0.0f, 0.0f, setAlphaComponent);
                }
            }
            else {
                final int ipad_type = this.ipad_type;
                color = IpadType.HEART.ordinal();
                int n3 = 0;
                Label_0286: {
                    if (ipad_type != color) {
                        final int ipad_type2 = this.ipad_type;
                        color = IpadType.BATTERY.ordinal();
                        if (ipad_type2 != color) {
                            final int ipad_type3 = this.ipad_type;
                            color = IpadType.BLUE_TYPE.ordinal();
                            if (ipad_type3 != color) {
                                n3 = -16777216;
                                break Label_0286;
                            }
                        }
                    }
                    n3 = -1;
                }
                color = 1043878380;
                final float n4 = 0.18f * n;
                n *= 0.08f;
                paint.setShadowLayer(n4, n, n, ColorUtils.setAlphaComponent(n3, 120));
            }
        }
        else {
            paint.setStyle(Paint$Style.FILL_AND_STROKE);
            n *= 0.12f;
            paint.setStrokeWidth(n);
            paint.setStrokeCap(Paint$Cap.ROUND);
            paint.setStrokeJoin(Paint$Join.ROUND);
            final int ipad_type4 = this.ipad_type;
            final int ordinal = IpadType.HEART.ordinal();
            n = 0.85f;
            if (ipad_type4 != ordinal && this.ipad_type != IpadType.BATTERY.ordinal() && this.ipad_type != IpadType.BLUE_TYPE.ordinal()) {
                paint.setColor(hazem.nurmontage.videoquran.Utils.ColorUtils.darkenColor(color, n));
            }
            else {
                paint.setColor(hazem.nurmontage.videoquran.Utils.ColorUtils.lightenColor(color, n));
            }
        }
    }
    
    public float calculateOptimalTextSize(final String s, final int n, final int n2, final TextPaint textPaint) {
        float n3 = 5.0f;
        float n4 = 1000.0f;
        float n5 = n3;
        while (n3 <= n4) {
            final float textSize = (n3 + n4) / 2.0f;
            textPaint.setTextSize(textSize);
            final StaticLayout build = StaticLayout$Builder.obtain((CharSequence)s, 0, s.length(), textPaint, n).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
            final float n6 = (float)build.getHeight();
            final float maxLineWidth = this.getMaxLineWidth(build);
            final float n7 = fcmpg(n6, (float)n2);
            final float n8 = 0.03f;
            if (n7 <= 0 && maxLineWidth <= n) {
                final float n9 = n8 + textSize;
                n5 = textSize;
                n3 = n9;
            }
            else {
                n4 = textSize - n8;
            }
        }
        return n5;
    }
    
    public float calculateTextSize() {
        return this.createBestSizeLayout(this.txt, this.paintAya, (int)(this.rect.width() * 0.9f), (int)(this.rect.height() * 0.95f));
    }
    
    public float calculateTextSize(final String s, final Paint paint, final int n, final int n2) {
        float n3 = 0.0f;
        if (s != null && !s.isEmpty() && n > 0) {
            if (n2 > 0) {
                paint.setTextSize(1.0f);
                final Rect rect = new Rect();
                paint.getTextBounds(s, 0, s.length(), rect);
                rect.width();
                rect.height();
                float n4 = 1000.0f;
                for (int i = 0; i < 100; ++i) {
                    final float textSize = (n3 + n4) / 2.0f;
                    paint.setTextSize(textSize);
                    paint.getTextBounds(s, 0, s.length(), rect);
                    final float n5 = (float)rect.width();
                    final float n6 = (float)rect.height();
                    if (n5 <= n && n6 <= n2) {
                        n3 = textSize;
                    }
                    else {
                        n4 = textSize;
                    }
                }
            }
        }
        return n3;
    }
    
    public void createStaticLayout() {
        final String txt = this.txt;
        final TextPaint paintAya = this.paintAya;
        this.staticLayout = this.createBalancedLayout(txt, paintAya, this.viewWidth, paintAya.getTextSize(), 2.0f);
        final float centerY = this.rect.centerY();
        final float n = (float)this.staticLayout.getHeight();
        final float n2 = 0.5f;
        this.y = centerY - n * n2;
        this.x = this.rect.centerX() - this.staticLayout.getWidth() * n2;
    }
    
    public void draw(final Canvas canvas) {
        if (this.staticLayout != null) {
            if (this.isHaveBg) {
                canvas.drawRect(0.0f, this.rect.top, (float)canvas.getWidth(), this.rect.bottom, (Paint)this.paintBg);
            }
            canvas.save();
            canvas.translate(this.x + this.offsetX * this.staticLayout.getWidth(), this.y);
            final float scaleX = this.scaleX;
            canvas.scale(scaleX, scaleX);
            if (this.mPreset == AyaTextPreset.OUTLINE.ordinal() && this.staticLayoutOutline != null) {
                this.paintAyaOutline.setTextSize(this.paintAya.getTextSize());
                this.staticLayoutOutline.draw(canvas);
            }
            this.staticLayout.draw(canvas);
            canvas.restore();
        }
    }
    
    @Override
    public void endAnimator() {
        try {
            final ObjectAnimator objectAnimator = this.objectAnimator;
            Label_0027: {
                if (objectAnimator == null || !objectAnimator.isRunning()) {
                    break Label_0027;
                }
                final ObjectAnimator objectAnimator2 = this.objectAnimator;
                try {
                    objectAnimator2.end();
                    final ObjectAnimator otherAnimation = this.otherAnimation;
                    Label_0054: {
                        if (otherAnimation == null || !otherAnimation.isRunning()) {
                            break Label_0054;
                        }
                        final ObjectAnimator otherAnimation2 = this.otherAnimation;
                        try {
                            otherAnimation2.end();
                            this.objectAnimator = null;
                            try {
                                this.otherAnimation = null;
                                this.setFadeIn(false);
                                this.setFadeOut(false);
                                this.offsetX = 0.0f;
                                this.paintAya.setAlpha(255);
                                this.paintAyaTrslOutline.setAlpha(this.paintAya.getAlpha());
                                this.paintAyaOutline.setAlpha(this.paintAya.getAlpha());
                            }
                            catch (final Exception ex) {}
                        }
                        catch (final Exception ex2) {}
                    }
                }
                catch (final Exception ex3) {}
            }
        }
        catch (final Exception ex4) {}
    }
    
    public AyaTextPreset get(final int n) {
        if (n == AyaTextPreset.SHADOW.ordinal()) {
            return AyaTextPreset.SHADOW;
        }
        if (n == AyaTextPreset.OUTLINE.ordinal()) {
            return AyaTextPreset.OUTLINE;
        }
        if (n == AyaTextPreset.GLOW.ordinal()) {
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
        return (int)((Math.abs(this.getEntityQuran().getRect().right / this.getEntityQuran().getSecond_in_screen()) - Math.abs(this.getEntityQuran().getRect().left / this.getEntityQuran().getSecond_in_screen())) * 0.2f * 1000.0f);
    }
    
    public int getIndex() {
        return this.index;
    }
    
    public int getIpad_type() {
        return this.ipad_type;
    }
    
    @Override
    public int getMax_h() {
        return this.max_h;
    }
    
    @Override
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
        return this.paintAya.measureText(this.txt);
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
    
    public void initPreset(final int mPreset) {
        this.mPreset = mPreset;
        final AyaTextPreset value = this.get(mPreset);
        if (value == AyaTextPreset.NONE) {
            return;
        }
        if (value == AyaTextPreset.OUTLINE) {
            this.applyAyaPreset((Paint)this.paintAyaOutline, AyaTextPreset.OUTLINE, this.clrAya, this.paintAya.getTypeface(), this.paintAya.getTextSize());
            this.staticLayoutOutline = this.getStaticLayoutOutline();
            this.applyAyaPreset((Paint)this.paintAya, AyaTextPreset.NONE, this.clrAya, this.paintAya.getTypeface(), this.paintAya.getTextSize());
        }
        else {
            final TextPaint paintAya = this.paintAya;
            this.applyAyaPreset((Paint)paintAya, value, this.clrAya, paintAya.getTypeface(), this.paintAya.getTextSize());
        }
    }
    
    public void initPresetAya(final int mPreset) {
        this.mPreset = mPreset;
        final AyaTextPreset value = this.get(mPreset);
        if (value == AyaTextPreset.NONE) {
            return;
        }
        if (value == AyaTextPreset.OUTLINE) {
            this.applyAyaPreset((Paint)this.paintAyaOutline, AyaTextPreset.OUTLINE, this.clrAya, this.paintAya.getTypeface(), this.paintAya.getTextSize());
            this.staticLayoutOutline = this.getStaticLayoutOutline();
            this.applyAyaPreset((Paint)this.paintAya, AyaTextPreset.NONE, this.clrAya, this.paintAya.getTypeface(), this.paintAya.getTextSize());
        }
        else {
            final TextPaint paintAya = this.paintAya;
            this.applyAyaPreset((Paint)paintAya, value, this.clrAya, paintAya.getTypeface(), this.paintAya.getTextSize());
        }
    }
    
    public boolean isAnimRun() {
        final ObjectAnimator objectAnimator = this.objectAnimator;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            final ObjectAnimator otherAnimation = this.otherAnimation;
            if (otherAnimation == null || !otherAnimation.isRunning()) {
                return false;
            }
        }
        return true;
    }
    
    @Override
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
    
    @Override
    public boolean isVisible() {
        return this.isVisible;
    }
    
    public void onResize(final RectF rectF, final int max_w, final int max_h) {
        this.rect = new RectF(0.0f, this.getCanvasH() - rectF.height(), (float)this.getCanvasW(), (float)this.getCanvasH());
        this.max_h = max_h;
        this.max_w = max_w;
        this.viewWidth = (int)this.rect.width();
    }
    
    @Override
    public void postTranslate(float n, float n2) {
        this.rect.offset(n, n2);
        n = this.rect.centerX();
        n2 = (float)this.staticLayout.getWidth();
        final float n3 = 0.5f;
        n2 *= n3;
        n -= n2;
        this.x = n;
        n = this.rect.centerY();
        n2 = this.staticLayout.getHeight() * n3;
        n -= n2;
        this.y = n;
    }
    
    public void restoreCanvas(final Canvas canvas) {
        try {
            canvas.restore();
        }
        catch (final Exception ex) {}
    }
    
    public void runIn(final int n, final boolean b, final String s) {
        if (s.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
            this.slidToLeft(n, b);
        }
        if (s.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
            this.slidToRight(n, b);
        }
        if (s.equals(TransitionType.ZOOM_IN.getValue())) {
            this.zoomIn_In(n, b);
        }
        if (s.equals(TransitionType.FADE_IN.getValue())) {
            this.fadeIn(n, b);
        }
    }
    
    public void runOut(final int n, final boolean b, final String s) {
        if (s.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
            this.slidToLeftOut(n, b);
        }
        if (s.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
            this.slidToRightOut(n, b);
        }
        if (s.equals(TransitionType.FADE_OUT.getValue())) {
            this.fadeOut(n, b);
        }
    }
    
    @Override
    public void scale(float factor_scale, int viewWidth, final int n) {
        this.setFactor_scale(factor_scale);
        final float n2 = this.rect.height() * factor_scale;
        factor_scale = (float)viewWidth;
        final float n3 = 0.46f * factor_scale;
        this.rect.left = this.rect.centerX() - n3;
        this.rect.right = this.rect.centerX() + n3;
        final float n4 = n2 * 0.5f;
        this.rect.top = this.rect.centerY() - n4;
        this.rect.bottom = this.rect.centerY() + n4;
        viewWidth = (int)this.rect.width();
        this.viewWidth = viewWidth;
        this.paintAya.setTextSize(this.calculateTextSize());
        this.createStaticLayout();
        this.setFcSize(this.paintAya.getTextSize() / factor_scale);
        this.initPreset(this.getmPreset());
    }
    
    @Override
    public void setAnimTest(final boolean animTest) {
        super.setAnimTest(animTest);
    }
    
    public void setClrAya(final int clrAya) {
        this.clrAya = clrAya;
    }
    
    public void setClrBg(final int n) {
        this.clrBg = n;
        this.paintBg.setColor(n);
        this.paintBg.setAlpha(100);
    }
    
    public void setColor(final int n) {
        this.setClrAya(n);
        this.paintAya.setColor(n);
    }
    
    public void setFactorSize(final float scaleX) {
        this.scaleX = scaleX;
        if (this.isAnimTest()) {
            final WeakReference weakBlurredImageView = this.weakBlurredImageView;
            if (weakBlurredImageView != null) {
                ((BlurredImageView)weakBlurredImageView.get()).invalidate();
            }
        }
    }
    
    public void setFadeIn(final boolean isFadeIn) {
        this.isFadeIn = isFadeIn;
    }
    
    public void setFadeOut(final boolean isFadeOut) {
        this.isFadeOut = isFadeOut;
    }
    
    public void setHaveBg(final boolean isHaveBg) {
        this.isHaveBg = isHaveBg;
    }
    
    public void setIndex(final int index) {
        this.index = index;
    }
    
    public void setIpad_type(final int ipad_type) {
        this.ipad_type = ipad_type;
    }
    
    public void setNumber(final int number) {
        this.number = number;
    }
    
    public void setOpacityFade(int animTest) {
        this.paintAya.setAlpha(animTest);
        this.paintAyaTrslOutline.setAlpha(this.paintAya.getAlpha());
        this.paintAyaOutline.setAlpha(this.paintAya.getAlpha());
        animTest = (this.isAnimTest() ? 1 : 0);
        if (animTest != 0) {
            final WeakReference weakBlurredImageView = this.weakBlurredImageView;
            if (weakBlurredImageView != null) {
                ((BlurredImageView)weakBlurredImageView.get()).invalidate();
            }
        }
        else {
            final WeakReference viewWeakReference = this.viewWeakReference;
            if (viewWeakReference != null) {
                ((TrackEntityView)viewWeakReference.get()).invalidate();
            }
        }
    }
    
    public void setPreset(final AyaTextPreset ayaTextPreset) {
        this.mPreset = ayaTextPreset.ordinal();
        if (ayaTextPreset == AyaTextPreset.OUTLINE) {
            this.applyAyaPreset((Paint)this.paintAyaOutline, AyaTextPreset.OUTLINE, this.clrAya, this.paintAya.getTypeface(), this.paintAya.getTextSize());
            this.staticLayoutOutline = this.getStaticLayoutOutline();
            this.applyAyaPreset((Paint)this.paintAya, AyaTextPreset.NONE, this.clrAya, this.paintAya.getTypeface(), this.paintAya.getTextSize());
        }
        else {
            final TextPaint paintAya = this.paintAya;
            this.applyAyaPreset((Paint)paintAya, ayaTextPreset, this.clrAya, paintAya.getTypeface(), this.paintAya.getTextSize());
        }
    }
    
    public void setSlideX(float abs) {
        this.offsetX = abs;
        final TextPaint paintAya = this.paintAya;
        abs = Math.abs(abs);
        final float n = 1.0f - abs;
        abs = 255.0f;
        paintAya.setAlpha(Math.round(n * abs));
        this.paintAyaTrslOutline.setAlpha(this.paintAya.getAlpha());
        this.paintAyaOutline.setAlpha(this.paintAya.getAlpha());
        if (this.isAnimTest()) {
            final WeakReference weakBlurredImageView = this.weakBlurredImageView;
            if (weakBlurredImageView != null) {
                ((BlurredImageView)weakBlurredImageView.get()).invalidate();
            }
        }
    }
    
    public void setSlideXOut(float abs) {
        this.offsetX = abs;
        final TextPaint paintAya = this.paintAya;
        abs = Math.abs(abs);
        final float n = 1.0f - abs;
        abs = 255.0f;
        paintAya.setAlpha(Math.round(n * abs));
        this.paintAyaTrslOutline.setAlpha(this.paintAya.getAlpha());
        this.paintAyaOutline.setAlpha(this.paintAya.getAlpha());
        if (this.isAnimTest()) {
            final WeakReference weakBlurredImageView = this.weakBlurredImageView;
            if (weakBlurredImageView != null) {
                ((BlurredImageView)weakBlurredImageView.get()).invalidate();
            }
        }
    }
    
    public void setStaticLayout() {
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        this.staticLayout = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        final float centerX = this.rect.centerX();
        final float n = (float)this.staticLayout.getWidth();
        final float n2 = 0.5f;
        this.x = centerX - n * n2;
        this.y = this.rect.centerY() - this.staticLayout.getHeight() * n2;
    }
    
    public void setTextSize(final float textSize) {
        this.paintAya.setTextSize(textSize);
    }
    
    public void setTextSizeInBoucle(float x) {
        this.paintAya.setTextSize(x);
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        this.staticLayout = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        x = this.rect.centerY();
        final float n = (float)this.staticLayout.getHeight();
        final float n2 = 0.5f;
        x -= n * n2;
        this.y = x;
        x = this.rect.centerX();
        x -= this.staticLayout.getWidth() * n2;
        this.x = x;
    }
    
    public void setTranslate(float y, float bottom) {
        final float width = this.rect.width();
        final float n = 0.5f;
        final float n2 = width * n;
        final float n3 = this.rect.height() * n;
        this.rect.left = y - n2;
        final RectF rect = this.rect;
        y += n2;
        rect.right = y;
        this.rect.top = bottom - n3;
        final RectF rect2 = this.rect;
        bottom += n3;
        rect2.bottom = bottom;
        y = this.rect.centerX();
        bottom = this.staticLayout.getWidth() * n;
        y -= bottom;
        this.x = y;
        y = this.rect.centerY();
        bottom = this.staticLayout.getHeight() * n;
        y -= bottom;
        this.y = y;
    }
    
    public void setTxt(final String txt) {
        this.txt = txt;
        this.createStaticLayout();
    }
    
    public void setTypeface(final Typeface typeface, final String nameFont) {
        this.paintAya.setTypeface(typeface);
        this.nameFont = nameFont;
    }
    
    public void setTypefaceOneAya(final Typeface typeface, final String nameFont) {
        this.paintAya.setTypeface(typeface);
        this.nameFont = nameFont;
    }
    
    public void setUnderLine(final boolean underlineText) {
        this.paintAya.setUnderlineText(underlineText);
    }
    
    public void setViewWeakReference(final WeakReference viewWeakReference, final WeakReference weakBlurredImageView) {
        this.viewWeakReference = viewWeakReference;
        this.weakBlurredImageView = weakBlurredImageView;
    }
    
    @Override
    public void setVisible(final boolean isVisible) {
        this.isVisible = isVisible;
    }
    
    public void setmPreset(final int mPreset) {
        this.mPreset = mPreset;
    }
    
    public void setupCanvasDraw(final Canvas canvas) {
        final float n = (float)(canvas.getHeight() - this.staticLayout.getHeight());
        final float n2 = 0.5f;
        this.y = n * n2;
        this.x = this.rect.centerX() - this.staticLayout.getWidth() * n2;
        canvas.save();
        if (this.isHaveBg) {
            canvas.drawRect(0.0f, 0.0f, (float)canvas.getWidth(), (float)canvas.getHeight(), (Paint)this.paintBg);
        }
        canvas.translate(this.x, this.y);
    }
    
    public void setupScale(float n, final int n2, final int n3) {
        final float n4 = (float)n2;
        final int viewWidth = (int)(0.9f * n4);
        this.viewWidth = viewWidth;
        final StaticLayout balancedLayout = this.createBalancedLayout(this.txt, this.paintAya, viewWidth, n * n4, 2.0f);
        this.staticLayout = balancedLayout;
        n = (float)balancedLayout.getWidth();
        final float n5 = 0.5f;
        n *= n5;
        final float n6 = this.staticLayout.getHeight() * n5;
        final float n7 = this.rect.height() * 0.12f;
        final float centerY = this.rect.centerY();
        final float centerX = this.rect.centerX();
        this.rect.set(centerX - n, centerY - n6 - n7, centerX + n, centerY + n6 + n7);
        n = this.rect.height();
        final float n8 = 0.85f;
        this.max_h = Math.round(n * n8);
        this.max_w = Math.round(this.rect.width() * n8);
        n = this.rect.centerX();
        n -= this.staticLayout.getWidth() * n5;
        this.x = n;
        n = this.rect.centerY();
        n -= this.staticLayout.getHeight() * n5;
        this.y = n;
    }
    
    public void setupScaleSave(float n, final int n2) {
        final int round = Math.round(this.rect.width());
        this.viewWidth = round;
        this.staticLayout = this.createBalancedLayout(this.txt, this.paintAya, round, n * n2, 2.0f);
        n = this.rect.height();
        final float n3 = 0.85f;
        this.max_h = Math.round(n * n3);
        this.max_w = Math.round(this.rect.width() * n3);
        n = this.rect.centerX();
        final float n4 = (float)this.staticLayout.getWidth();
        final float n5 = 0.5f;
        n -= n4 * n5;
        this.x = n;
        n = this.rect.centerY();
        n -= this.staticLayout.getHeight() * n5;
        this.y = n;
    }
    
    public void singleDraw(final Canvas canvas) {
        if (this.staticLayout != null) {
            if (this.mPreset == AyaTextPreset.OUTLINE.ordinal() && this.staticLayoutOutline != null) {
                this.paintAyaOutline.setTextSize(this.paintAya.getTextSize());
                this.staticLayoutOutline.draw(canvas);
            }
            this.staticLayout.draw(canvas);
        }
    }
    
    public void singleDraw(final Canvas canvas, final int alpha) {
        if (this.staticLayout != null) {
            this.paintAya.setAlpha(alpha);
            this.staticLayout.draw(canvas);
        }
    }
    
    public void singleDraw(final Canvas canvas, final int alpha, float n) {
        if (this.staticLayout != null) {
            canvas.save();
            n *= this.staticLayout.getWidth();
            canvas.translate(n, 0.0f);
            this.paintAya.setAlpha(alpha);
            this.staticLayout.draw(canvas);
            canvas.restore();
        }
    }
    
    public void slidToLeft(final int n, final boolean b) {
        final float[] array2;
        final float[] array = array2 = new float[2];
        array2[0] = 1.0f;
        array2[1] = 0.0f;
        (this.otherAnimation = ObjectAnimator.ofFloat((Object)this, "SlideX", array)).setDuration((long)n);
        if (b) {
            this.otherAnimation.setRepeatMode(1);
            this.otherAnimation.setRepeatCount(-1);
        }
        this.otherAnimation.start();
    }
    
    public void slidToLeftOut(final int n, final boolean b) {
        final float[] array2;
        final float[] array = array2 = new float[2];
        array2[0] = 0.0f;
        array2[1] = -1.0f;
        (this.otherAnimation = ObjectAnimator.ofFloat((Object)this, "SlideXOut", array)).setDuration((long)n);
        if (b) {
            this.otherAnimation.setRepeatMode(1);
            this.otherAnimation.setRepeatCount(-1);
        }
        this.otherAnimation.start();
    }
    
    public void slidToRight(final int n, final boolean b) {
        final float[] array2;
        final float[] array = array2 = new float[2];
        array2[0] = -1.0f;
        array2[1] = 0.0f;
        (this.otherAnimation = ObjectAnimator.ofFloat((Object)this, "SlideX", array)).setDuration((long)n);
        if (b) {
            this.otherAnimation.setRepeatMode(1);
            this.otherAnimation.setRepeatCount(-1);
        }
        this.otherAnimation.start();
    }
    
    public void slidToRightOut(final int n, final boolean b) {
        final float[] array2;
        final float[] array = array2 = new float[2];
        array2[0] = 0.0f;
        array2[1] = 1.0f;
        (this.otherAnimation = ObjectAnimator.ofFloat((Object)this, "SlideXOut", array)).setDuration((long)n);
        if (b) {
            this.otherAnimation.setRepeatMode(1);
            this.otherAnimation.setRepeatCount(-1);
        }
        this.otherAnimation.start();
    }
    
    public void update(final RectF rect, final int max_w, final int max_h) {
        this.rect = rect;
        this.max_h = max_h;
        this.max_w = max_w;
        this.viewWidth = (int)this.rect.width();
    }
    
    public void updatePaint(float y, int length) {
        this.paintAya.setTextSize(y);
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        this.viewWidth = length;
        length = spannableString.length();
        this.staticLayout = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, length, this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        y = this.rect.height();
        final float n = 0.85f;
        this.max_h = Math.round(y * n);
        this.max_w = Math.round(this.rect.width() * n);
        y = this.rect.centerX();
        final float n2 = (float)this.staticLayout.getWidth();
        final float n3 = 0.5f;
        y -= n2 * n3;
        this.x = y;
        y = this.rect.centerY();
        y -= this.staticLayout.getHeight() * n3;
        this.y = y;
    }
    
    public void updateStaticLayout() {
        final SpannableString spannableString = this.spannableString;
        this.staticLayout = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }
    
    public void zoomIn_In(final int n, final boolean b) {
        final float[] array2;
        final float[] array = array2 = new float[2];
        array2[0] = 0.0f;
        array2[1] = 1.0f;
        (this.otherAnimation = ObjectAnimator.ofFloat((Object)this, "FactorSize", array)).setDuration((long)n);
        if (b) {
            this.otherAnimation.setRepeatMode(1);
            this.otherAnimation.setRepeatCount(-1);
        }
        this.otherAnimation.start();
    }
}
