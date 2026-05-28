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
import androidx.core.graphics.ColorUtils;
import android.graphics.Paint$Style;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import android.graphics.Paint;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.Utils.EndOfAyaSpan;
import android.text.Layout$Alignment;
import android.text.StaticLayout$Builder;
import androidx.core.content.ContextCompat;
import android.graphics.RectF;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.graphics.drawable.VectorDrawable;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.animation.ObjectAnimator;
import java.io.Serializable;

public class QuranEntity extends EntityView implements Serializable
{
    private int clrAya;
    private int clrTrsl;
    private String complete_aya;
    private int endWord_index;
    private String icon;
    private int index;
    private int indexNumber;
    private int ipad_type;
    private boolean isFadeIn;
    private boolean isFadeOut;
    private boolean isVisible;
    private int mPreset;
    private String nameFont;
    private int number;
    private ObjectAnimator objectAnimator;
    private float offsetX;
    private ObjectAnimator otherAnimation;
    private float padding;
    private final TextPaint paintAya;
    private final TextPaint paintAyaOutline;
    private final TextPaint paintAyaTrslOutline;
    private final TextPaint paintTranslationAya;
    private float scaleX;
    private SpannableString spannableString;
    private int startWord_index;
    private StaticLayout staticLayout;
    private StaticLayout staticLayoutOutline;
    private StaticLayout staticLayoutTranslation;
    private StaticLayout staticLayoutTranslationOutline;
    private String translation;
    private String translation_complete;
    private String txt;
    private final Typeface typefaceNumber;
    private VectorDrawable vectorDrawable;
    private WeakReference viewWeakReference;
    private int viewWidth;
    private WeakReference weakBlurredImageView;
    private float x_translation;
    
    public QuranEntity(final Context context, final int n, final String s, final String complete_aya, final String translation, final String translation_complete, final RectF rectF, final Typeface typeface, final Typeface typeface2, final int indexNumber, final int number, final Typeface typefaceNumber, final int n2, final int n3, final String nameFont, final boolean b) {
        final float n4 = 1.0f;
        this.padding = n4;
        this.scaleX = n4;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        final boolean visible = true;
        final TextPaint paintAya = new TextPaint((int)(visible ? 1 : 0));
        this.paintAya = paintAya;
        this.paintAyaOutline = new TextPaint((int)(visible ? 1 : 0));
        this.paintAyaTrslOutline = new TextPaint((int)(visible ? 1 : 0));
        final TextPaint paintTranslationAya = new TextPaint((int)(visible ? 1 : 0));
        this.paintTranslationAya = paintTranslationAya;
        this.txt = s;
        this.translation = translation;
        this.translation_complete = translation_complete;
        this.complete_aya = complete_aya;
        if (complete_aya == null || complete_aya.isEmpty()) {
            this.complete_aya = s;
        }
        this.nameFont = nameFont;
        this.indexNumber = indexNumber;
        this.number = number;
        this.typefaceNumber = typefaceNumber;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.setVisible(visible);
        this.viewWidth = (int)rectF.width();
        paintAya.setTypeface(typeface);
        paintAya.setColor(n2);
        final float n5 = 0.05f;
        paintAya.setTextSize(n5);
        paintTranslationAya.setTextSize(n5);
        paintTranslationAya.setColor(n3);
        paintTranslationAya.setTypeface(typeface2);
        this.setClrAya(n2);
        this.setClrTrsl(n3);
        this.vectorDrawable = (VectorDrawable)ContextCompat.getDrawable(context, n);
        final float height = this.rect.height();
        final float n6 = 0.85f;
        this.max_h = (int)(height * n6);
        this.max_w = (int)(this.rect.width() * n6);
    }
    
    public QuranEntity(final Context context, final String s, final String complete_aya, final String translation, final String translation_complete, final RectF rectF, final Typeface typeface, final Typeface typeface2, final int indexNumber, final int number, final Typeface typefaceNumber, final int n, final int n2, final String nameFont, final boolean b, final int n3) {
        final float n4 = 1.0f;
        this.padding = n4;
        this.scaleX = n4;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        final boolean visible = true;
        final TextPaint paintAya = new TextPaint((int)(visible ? 1 : 0));
        this.paintAya = paintAya;
        this.paintAyaOutline = new TextPaint((int)(visible ? 1 : 0));
        this.paintAyaTrslOutline = new TextPaint((int)(visible ? 1 : 0));
        final TextPaint paintTranslationAya = new TextPaint((int)(visible ? 1 : 0));
        this.paintTranslationAya = paintTranslationAya;
        this.txt = s;
        this.complete_aya = complete_aya;
        if (complete_aya == null || complete_aya.isEmpty()) {
            this.complete_aya = s;
        }
        this.translation = translation;
        this.translation_complete = translation_complete;
        this.nameFont = nameFont;
        this.indexNumber = indexNumber;
        this.number = number;
        this.typefaceNumber = typefaceNumber;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.setVisible(visible);
        this.viewWidth = (int)rectF.width();
        paintAya.setTypeface(typeface);
        paintAya.setColor(n);
        final float n5 = 0.05f;
        paintAya.setTextSize(n5);
        paintTranslationAya.setTextSize(n5);
        paintTranslationAya.setColor(n2);
        paintTranslationAya.setTypeface(typeface2);
        this.setClrAya(n);
        this.setClrTrsl(n2);
        this.vectorDrawable = (VectorDrawable)ContextCompat.getDrawable(context, n3);
        final float height = this.rect.height();
        final float n6 = 0.85f;
        this.max_h = (int)(height * n6);
        this.max_w = (int)(this.rect.width() * n6);
    }
    
    public QuranEntity(final String txt, final String complete_aya, final String translation, final String translation_complete, final RectF rectF, final Typeface typeface, final Typeface typeface2, final int indexNumber, final int number, final Typeface typefaceNumber, final int color, final int color2, final String nameFont, final float textSize, final float textSize2, final boolean b, final VectorDrawable vectorDrawable) {
        final float n = 1.0f;
        this.padding = n;
        this.scaleX = n;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        final boolean visible = true;
        final TextPaint paintAya = new TextPaint((int)(visible ? 1 : 0));
        this.paintAya = paintAya;
        this.paintAyaOutline = new TextPaint((int)(visible ? 1 : 0));
        this.paintAyaTrslOutline = new TextPaint((int)(visible ? 1 : 0));
        final TextPaint paintTranslationAya = new TextPaint((int)(visible ? 1 : 0));
        this.paintTranslationAya = paintTranslationAya;
        this.txt = txt;
        this.translation = translation;
        this.translation_complete = translation_complete;
        this.complete_aya = complete_aya;
        this.nameFont = nameFont;
        this.indexNumber = indexNumber;
        this.number = number;
        this.typefaceNumber = typefaceNumber;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.setVisible(visible);
        this.viewWidth = (int)rectF.width();
        paintAya.setTypeface(typeface);
        paintAya.setColor(color);
        paintAya.setTextSize(textSize);
        paintTranslationAya.setTextSize(textSize2);
        paintTranslationAya.setTypeface(typeface2);
        paintTranslationAya.setColor(color2);
        this.vectorDrawable = vectorDrawable;
        final float height = this.rect.height();
        final float n2 = 0.85f;
        this.max_h = (int)(height * n2);
        this.max_w = (int)(this.rect.width() * n2);
    }
    
    public QuranEntity(final String txt, final String complete_aya, final String translation, final String translation_complete, final RectF rectF, final Typeface typeface, final Typeface typeface2, final int indexNumber, final int number, final Typeface typefaceNumber, final int color, final int color2, final String nameFont, final float textSize, final boolean b, final VectorDrawable vectorDrawable) {
        final float n = 1.0f;
        this.padding = n;
        this.scaleX = n;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        final boolean visible = true;
        final TextPaint paintAya = new TextPaint((int)(visible ? 1 : 0));
        this.paintAya = paintAya;
        this.paintAyaOutline = new TextPaint((int)(visible ? 1 : 0));
        this.paintAyaTrslOutline = new TextPaint((int)(visible ? 1 : 0));
        final TextPaint paintTranslationAya = new TextPaint((int)(visible ? 1 : 0));
        this.paintTranslationAya = paintTranslationAya;
        this.txt = txt;
        this.translation = translation;
        this.translation_complete = translation_complete;
        this.complete_aya = complete_aya;
        this.nameFont = nameFont;
        this.indexNumber = indexNumber;
        this.number = number;
        this.typefaceNumber = typefaceNumber;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.setVisible(visible);
        this.viewWidth = (int)rectF.width();
        paintAya.setTypeface(typeface);
        paintAya.setColor(color);
        paintAya.setTextSize(textSize);
        paintTranslationAya.setTextSize(0.05f);
        paintTranslationAya.setTypeface(typeface2);
        paintTranslationAya.setColor(color2);
        this.vectorDrawable = vectorDrawable;
        final float height = this.rect.height();
        final float n2 = 0.85f;
        this.max_h = (int)(height * n2);
        this.max_w = (int)(this.rect.width() * n2);
    }
    
    private StaticLayout buildStaticLayout(final String s, final TextPaint textPaint, final int n) {
        return StaticLayout$Builder.obtain((CharSequence)s, 0, s.length(), textPaint, n).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
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
        final String str = "";
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        if (this.number != -1) {
            try {
                final String txt = this.txt;
                try {
                    final int length = txt.length();
                    try {
                        if (length <= this.indexNumber) {
                            return StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAyaOutline, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
                        }
                        try {
                            final VectorDrawable vectorDrawable = this.vectorDrawable;
                            try {
                                final Typeface typefaceNumber = this.typefaceNumber;
                                try {
                                    final StringBuilder append = new StringBuilder(str).append(this.number);
                                    try {
                                        spannableString.setSpan((Object)new EndOfAyaSpan(vectorDrawable, typefaceNumber, append.toString()), this.indexNumber, length, 0);
                                    }
                                    catch (final Exception ex) {
                                        ex.printStackTrace();
                                    }
                                }
                                catch (final Exception ex2) {}
                            }
                            catch (final Exception ex3) {}
                        }
                        catch (final Exception ex4) {}
                    }
                    catch (final Exception ex5) {}
                }
                catch (final Exception ex6) {}
            }
            catch (final Exception ex7) {}
        }
        return StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAyaOutline, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }
    
    private boolean isTrsl() {
        return this.translation != null && this.getIpad_type() != IpadType.CASSET.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG.ordinal() && this.getIpad_type() != IpadType.BOTTOM_RECT.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG_BLUR.ordinal();
    }
    
    private void setTls() {
        this.updateTranslation(this.calculateOptimalTextSize((int)(this.getRect().width() * 0.85f), (int)(this.getRect().height() * 0.5f * 0.83f)));
    }
    
    public void applyAll(int getmPreset, RectF rect, float textSize, float fcSize) {
        final String str = "";
        this.paintAya.setTextSize(textSize);
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        final int number = this.number;
        final int n = -1;
        boolean b = false;
        Label_0170: {
            if (number != n) {
                try {
                    final String txt = this.txt;
                    try {
                        final int length = txt.length();
                        try {
                            if (length <= this.indexNumber) {
                                break Label_0170;
                            }
                            try {
                                final VectorDrawable vectorDrawable = this.vectorDrawable;
                                try {
                                    final Typeface typefaceNumber = this.typefaceNumber;
                                    try {
                                        final StringBuilder append = new StringBuilder(str).append(this.number);
                                        try {
                                            spannableString.setSpan((Object)new EndOfAyaSpan(vectorDrawable, typefaceNumber, append.toString()), this.indexNumber, length, 0);
                                        }
                                        catch (final Exception ex) {
                                            ex.printStackTrace();
                                        }
                                    }
                                    catch (final Exception ex2) {}
                                }
                                catch (final Exception ex3) {}
                            }
                            catch (final Exception ex4) {}
                        }
                        catch (final Exception ex5) {}
                    }
                    catch (final Exception ex6) {}
                }
                catch (final Exception ex7) {}
            }
        }
        this.viewWidth = (int)((int)Math.max(rect.width(), (float)Math.round(this.paintAya.measureText(spannableString.toString()))) * 1.1f);
        final StaticLayout build = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = build;
        textSize = (float)build.getWidth();
        this.setFcSize(fcSize);
        fcSize = 0.5f;
        final float n2 = textSize * fcSize;
        final float height = this.rect.height();
        textSize /= this.rect.width();
        final float n3 = height * textSize * fcSize;
        this.rect.set(rect.centerX() - n2, rect.centerY() - n3, rect.centerX() + n2, rect.centerY() + n3);
        final float centerX = this.rect.centerX();
        textSize = this.staticLayout.getWidth() * fcSize;
        this.x = centerX - textSize;
        final float centerY = this.rect.centerY();
        textSize = this.staticLayout.getHeight() * fcSize;
        this.y = centerY - textSize;
        if (this.translation != null && this.staticLayoutTranslation != null) {
            b = true;
        }
        final float height2 = this.rect.height();
        textSize = 0.85f;
        this.max_h = Math.round(height2 * textSize);
        rect = this.rect;
        this.max_w = Math.round(rect.width() * textSize);
        if (b) {
            final int n4 = (int)(this.getRect().width() * textSize);
            textSize = this.getRect().height() * fcSize;
            fcSize = 0.83f;
            textSize *= fcSize;
            this.updateTranslation(this.calculateOptimalTextSize(n4, (int)textSize));
            this.setFactorSizeTrl(this.paintTranslationAya.getTextSize() / getmPreset);
        }
        getmPreset = this.getmPreset();
        this.initPreset(getmPreset);
    }
    
    public void applyAll(int getmPreset, RectF rect, float textSize, float fcSize, final QuranEntity quranEntity) {
        final String str = "";
        this.paintAya.setTextSize(textSize);
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        final int number = this.number;
        final int n = -1;
        boolean b = false;
        Label_0170: {
            if (number != n) {
                try {
                    final String txt = this.txt;
                    try {
                        final int length = txt.length();
                        try {
                            if (length <= this.indexNumber) {
                                break Label_0170;
                            }
                            try {
                                final VectorDrawable vectorDrawable = this.vectorDrawable;
                                try {
                                    final Typeface typefaceNumber = this.typefaceNumber;
                                    try {
                                        final StringBuilder append = new StringBuilder(str).append(this.number);
                                        try {
                                            spannableString.setSpan((Object)new EndOfAyaSpan(vectorDrawable, typefaceNumber, append.toString()), this.indexNumber, length, 0);
                                        }
                                        catch (final Exception ex) {
                                            ex.printStackTrace();
                                        }
                                    }
                                    catch (final Exception ex2) {}
                                }
                                catch (final Exception ex3) {}
                            }
                            catch (final Exception ex4) {}
                        }
                        catch (final Exception ex5) {}
                    }
                    catch (final Exception ex6) {}
                }
                catch (final Exception ex7) {}
            }
        }
        this.viewWidth = (int)((int)Math.max(rect.width(), (float)Math.round(this.paintAya.measureText(spannableString.toString()))) * 1.1f);
        final StaticLayout build = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = build;
        textSize = (float)build.getWidth();
        this.setFcSize(fcSize);
        fcSize = 0.5f;
        final float n2 = textSize * fcSize;
        final float height = this.rect.height();
        textSize /= this.rect.width();
        final float n3 = height * textSize * fcSize;
        this.rect.set(rect.centerX() - n2, rect.centerY() - n3, rect.centerX() + n2, rect.centerY() + n3);
        final float centerX = this.rect.centerX();
        textSize = this.staticLayout.getWidth() * fcSize;
        this.x = centerX - textSize;
        final float centerY = this.rect.centerY();
        textSize = this.staticLayout.getHeight() * fcSize;
        this.y = centerY - textSize;
        if (this.translation != null && this.staticLayoutTranslation != null) {
            b = true;
        }
        final float height2 = this.rect.height();
        textSize = 0.85f;
        this.max_h = Math.round(height2 * textSize);
        rect = this.rect;
        this.max_w = Math.round(rect.width() * textSize);
        if (b) {
            final TextPaint paintTranslationAya = this.paintTranslationAya;
            textSize = quranEntity.getPaintTranslationAya().getTextSize();
            paintTranslationAya.setTextSize(textSize);
            final float n4 = (float)this.viewWidth;
            textSize = 0.9f;
            this.staticLayoutTranslation = this.buildStaticLayout(this.translation, this.paintTranslationAya, (int)(n4 * textSize));
            this.setFactorSizeTrl(this.paintTranslationAya.getTextSize() / getmPreset);
        }
        getmPreset = this.getmPreset();
        this.initPreset(getmPreset);
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
        final int n2 = QuranEntity$1.$SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset[ayaTextPreset.ordinal()];
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
                Label_0288: {
                    if (ipad_type != color) {
                        final int ipad_type2 = this.ipad_type;
                        color = IpadType.BATTERY.ordinal();
                        if (ipad_type2 != color) {
                            final int ipad_type3 = this.ipad_type;
                            color = IpadType.BLUE_TYPE.ordinal();
                            if (ipad_type3 != color) {
                                n3 = -16777216;
                                break Label_0288;
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
    
    public float calculateOptimalTextSize(final int n, final int n2) {
        final String translation = this.translation;
        if (translation == null) {
            return 0.0f;
        }
        return this.calculateOptimalTextSize(translation, n, n2, this.paintTranslationAya);
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
        float height;
        if (this.isTrsl()) {
            height = this.rect.height() * 0.5f;
        }
        else {
            height = this.rect.height();
        }
        final float n = height / this.getFactor_scale();
        final float n2 = 0.85f;
        return this.calculateTextSize(this.txt, (Paint)this.paintAya, (int)(this.rect.width() / this.getFactor_scale() * n2), (int)(n * n2));
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
        final String str = "";
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        Label_0153: {
            if (this.number != -1) {
                try {
                    final String txt = this.txt;
                    try {
                        final int length = txt.length();
                        try {
                            if (length <= this.indexNumber) {
                                break Label_0153;
                            }
                            try {
                                final VectorDrawable vectorDrawable = this.vectorDrawable;
                                try {
                                    final Typeface typefaceNumber = this.typefaceNumber;
                                    try {
                                        final StringBuilder append = new StringBuilder(str).append(this.number);
                                        try {
                                            spannableString.setSpan((Object)new EndOfAyaSpan(vectorDrawable, typefaceNumber, append.toString()), this.indexNumber, length, 0);
                                        }
                                        catch (final Exception ex) {
                                            ex.printStackTrace();
                                        }
                                    }
                                    catch (final Exception ex2) {}
                                }
                                catch (final Exception ex3) {}
                            }
                            catch (final Exception ex4) {}
                        }
                        catch (final Exception ex5) {}
                    }
                    catch (final Exception ex6) {}
                }
                catch (final Exception ex7) {}
            }
        }
        this.staticLayout = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        final String translation = this.translation;
        final float n = 0.5f;
        if (translation != null && this.getIpad_type() != IpadType.BOTTOM_RECT.ordinal() && this.getIpad_type() != IpadType.CASSET.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG_BLUR.ordinal()) {
            float n2 = 0.0f;
            Label_0541: {
                if (this.getIpad_type() == IpadType.IPAD_NEOMORPHIC.ordinal()) {
                    n2 = 2.0f;
                }
                else {
                    final int ipad_type = this.getIpad_type();
                    final int ordinal = IpadType.MASK_BRUSH.ordinal();
                    final float n3 = 0.45f;
                    if (ipad_type != ordinal && this.getIpad_type() != IpadType.BLUE_TYPE.ordinal() && this.getIpad_type() != IpadType.HEART.ordinal()) {
                        if (this.getIpad_type() != IpadType.BATTERY.ordinal()) {
                            if (this.getIpad_type() != IpadType.BLACK_LAYER.ordinal()) {
                                if (this.getIpad_type() != IpadType.GRADIENT.ordinal()) {
                                    n2 = 1.2f;
                                    break Label_0541;
                                }
                            }
                        }
                    }
                    n2 = n3;
                }
            }
            this.x = this.rect.centerX() - this.staticLayout.getWidth() * n;
            this.paintTranslationAya.setTextSize(this.calculateOptimalTextSize(this.translation, (int)(this.viewWidth * 0.85f), (int)(this.rect.height() - this.staticLayout.getHeight() * n2), this.paintTranslationAya));
            int viewWidth = this.viewWidth;
            final StaticLayout buildStaticLayout = this.buildStaticLayout(this.translation, this.paintTranslationAya, viewWidth);
            this.staticLayoutTranslation = buildStaticLayout;
            if (buildStaticLayout.getLineCount() == 2) {
                final int n4 = this.staticLayoutTranslation.getLineCount() - 1;
                while (this.translation.substring(this.staticLayoutTranslation.getLineStart(n4), this.staticLayoutTranslation.getLineEnd(n4)).trim().split("\\s+").length < 3) {
                    viewWidth -= 10;
                    if (viewWidth < 10) {
                        break;
                    }
                    this.staticLayoutTranslation = this.buildStaticLayout(this.translation, this.paintTranslationAya, viewWidth);
                }
                this.x_translation = this.rect.centerX() - this.staticLayoutTranslation.getWidth() * n;
            }
            else {
                this.x_translation = this.x;
            }
            this.y = this.rect.centerY() - (this.staticLayout.getHeight() + this.staticLayoutTranslation.getHeight()) * n;
        }
        else {
            this.y = this.rect.centerY() - this.staticLayout.getHeight() * n;
        }
        this.x = this.rect.centerX() - this.staticLayout.getWidth() * n;
    }
    
    public void draw(final Canvas canvas) {
        if (this.staticLayout != null) {
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
            if (this.translation != null && this.staticLayoutTranslation != null && this.getIpad_type() != IpadType.BOTTOM_RECT.ordinal() && this.getIpad_type() != IpadType.CASSET.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG_BLUR.ordinal()) {
                canvas.save();
                canvas.translate(this.x_translation + this.offsetX * this.staticLayout.getWidth(), this.y + this.staticLayout.getHeight() * this.padding);
                final float scaleX2 = this.scaleX;
                canvas.scale(scaleX2, scaleX2);
                if (this.mPreset == AyaTextPreset.OUTLINE.ordinal() && this.staticLayoutTranslationOutline != null) {
                    this.paintAyaTrslOutline.setTextSize(this.paintTranslationAya.getTextSize());
                    this.staticLayoutTranslationOutline.draw(canvas);
                }
                this.staticLayoutTranslation.draw(canvas);
                canvas.restore();
            }
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
                                this.paintTranslationAya.setAlpha(this.paintAya.getAlpha());
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
    
    public int getClrTrsl() {
        return this.clrTrsl;
    }
    
    public String getComplete_aya() {
        return this.complete_aya;
    }
    
    public int getDuration_fade() {
        return (int)((Math.abs(this.getEntityQuran().getRect().right / this.getEntityQuran().getSecond_in_screen()) - Math.abs(this.getEntityQuran().getRect().left / this.getEntityQuran().getSecond_in_screen())) * 0.2f * 1000.0f);
    }
    
    public int getEndWord_index() {
        return this.endWord_index;
    }
    
    public String getIcon() {
        return this.icon;
    }
    
    public int getIndex() {
        return this.index;
    }
    
    public int getIndexNumber() {
        return this.indexNumber;
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
    
    public TextPaint getPaintTranslationAya() {
        return this.paintTranslationAya;
    }
    
    public int getStartWord_index() {
        return this.startWord_index;
    }
    
    public StaticLayout getStaticLayout() {
        return this.staticLayout;
    }
    
    public String getTranslation() {
        return this.translation;
    }
    
    public float getTranslationWidth() {
        this.paintTranslationAya.setTextSize(3.0f);
        return this.paintTranslationAya.measureText(this.translation);
    }
    
    public String getTranslation_complete() {
        return this.translation_complete;
    }
    
    public String getTxt() {
        return this.txt;
    }
    
    public Typeface getTypefaceNumber() {
        return this.typefaceNumber;
    }
    
    public VectorDrawable getVectorDrawable() {
        return this.vectorDrawable;
    }
    
    public int getViewWidth() {
        return this.viewWidth;
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
    
    public void initPreset(int trsl) {
        this.mPreset = trsl;
        final AyaTextPreset value = this.get(trsl);
        if (value == AyaTextPreset.NONE) {
            return;
        }
        if (value == AyaTextPreset.OUTLINE) {
            this.applyAyaPreset((Paint)this.paintAyaOutline, AyaTextPreset.OUTLINE, this.clrAya, this.paintAya.getTypeface(), this.paintAya.getTextSize());
            this.staticLayoutOutline = this.getStaticLayoutOutline();
            this.applyAyaPreset((Paint)this.paintAya, AyaTextPreset.NONE, this.clrAya, this.paintAya.getTypeface(), this.paintAya.getTextSize());
            trsl = (this.isTrsl() ? 1 : 0);
            if (trsl != 0) {
                this.applyAyaPreset((Paint)this.paintAyaTrslOutline, AyaTextPreset.OUTLINE, this.clrTrsl, this.paintTranslationAya.getTypeface(), this.paintTranslationAya.getTextSize());
                this.staticLayoutTranslationOutline = this.buildStaticLayout(this.translation, this.paintAyaTrslOutline, this.staticLayoutTranslation.getWidth());
                this.applyAyaPreset((Paint)this.paintTranslationAya, AyaTextPreset.NONE, this.clrTrsl, this.paintTranslationAya.getTypeface(), this.paintTranslationAya.getTextSize());
            }
        }
        else {
            final TextPaint paintAya = this.paintAya;
            this.applyAyaPreset((Paint)paintAya, value, this.clrAya, paintAya.getTypeface(), this.paintAya.getTextSize());
            if (this.isTrsl() && this.staticLayoutTranslation != null) {
                final TextPaint paintTranslationAya = this.paintTranslationAya;
                this.applyAyaPreset((Paint)paintTranslationAya, value, this.clrTrsl, paintTranslationAya.getTypeface(), this.paintTranslationAya.getTextSize());
            }
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
    
    public void initPresetTrsl(int mPreset) {
        this.mPreset = mPreset;
        final AyaTextPreset value = this.get(mPreset);
        if (value == AyaTextPreset.NONE) {
            return;
        }
        if (value == AyaTextPreset.OUTLINE) {
            mPreset = (this.isTrsl() ? 1 : 0);
            if (mPreset != 0) {
                this.applyAyaPreset((Paint)this.paintAyaTrslOutline, AyaTextPreset.OUTLINE, this.clrTrsl, this.paintTranslationAya.getTypeface(), this.paintTranslationAya.getTextSize());
                this.staticLayoutTranslationOutline = this.buildStaticLayout(this.translation, this.paintAyaTrslOutline, this.staticLayoutTranslation.getWidth());
                this.applyAyaPreset((Paint)this.paintTranslationAya, AyaTextPreset.NONE, this.clrTrsl, this.paintTranslationAya.getTypeface(), this.paintTranslationAya.getTextSize());
            }
        }
        else {
            mPreset = (this.isTrsl() ? 1 : 0);
            if (mPreset != 0 && this.staticLayoutTranslation != null) {
                final TextPaint paintTranslationAya = this.paintTranslationAya;
                this.applyAyaPreset((Paint)paintTranslationAya, value, this.clrTrsl, paintTranslationAya.getTypeface(), this.paintTranslationAya.getTextSize());
            }
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
    
    @Override
    public boolean isVisible() {
        return this.isVisible;
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
        if (this.isTrsl() && this.staticLayoutTranslation != null) {
            n = this.rect.centerX();
            n2 = this.staticLayoutTranslation.getWidth() * n3;
            n -= n2;
            this.x_translation = n;
            n = this.rect.centerY();
            n2 = (this.staticLayout.getHeight() + this.staticLayoutTranslation.getHeight()) * n3;
            n -= n2;
            this.y = n;
        }
        else {
            n = this.rect.centerY();
            n2 = this.staticLayout.getHeight() * n3;
            n -= n2;
            this.y = n;
        }
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
    public void scale(float n, final int n2, int viewWidth) {
        this.setFactor_scale(n);
        final float n3 = this.rect.width() * n;
        final float n4 = this.rect.height() * n;
        n = 0.5f;
        final float n5 = n3 * n;
        this.rect.left = this.rect.centerX() - n5;
        this.rect.right = this.rect.centerX() + n5;
        final float n6 = n4 * n;
        this.rect.top = this.rect.centerY() - n6;
        this.rect.bottom = this.rect.centerY() + n6;
        boolean b;
        if (this.translation != null && this.staticLayoutTranslation != null) {
            b = true;
            n = Float.MIN_VALUE;
        }
        else {
            b = false;
            n = 0.0f;
        }
        viewWidth = (int)this.rect.width();
        this.viewWidth = viewWidth;
        this.paintAya.setTextSize(this.calculateTextSize());
        this.createStaticLayout();
        final float textSize = this.paintAya.getTextSize();
        final float n7 = (float)n2;
        this.setFcSize(textSize / n7);
        if (b) {
            this.setTls();
            n = this.paintTranslationAya.getTextSize() / n7;
            this.setFactorSizeTrl(n);
        }
        this.initPreset(this.getmPreset());
    }
    
    @Override
    public void setAnimTest(final boolean animTest) {
        super.setAnimTest(animTest);
    }
    
    public void setClrAya(final int clrAya) {
        this.clrAya = clrAya;
    }
    
    public void setClrTrsl(final int clrTrsl) {
        this.clrTrsl = clrTrsl;
    }
    
    public void setColor(final int n) {
        this.setClrAya(n);
        this.paintAya.setColor(n);
    }
    
    public void setColorTranslation(final int n) {
        this.setClrTrsl(n);
        final TextPaint paintTranslationAya = this.paintTranslationAya;
        if (paintTranslationAya != null) {
            paintTranslationAya.setColor(n);
        }
    }
    
    public void setEndWord_index(final int endWord_index) {
        this.endWord_index = endWord_index;
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
    
    public void setIcon(final String icon) {
        this.icon = icon;
    }
    
    public void setIndex(final int index) {
        this.index = index;
    }
    
    public void setIndexNumber(final int indexNumber) {
        this.indexNumber = indexNumber;
    }
    
    public void setIpad_type(final int ipad_type) {
        this.ipad_type = ipad_type;
    }
    
    public void setNumber(final int number) {
        this.number = number;
    }
    
    public void setOpacityFade(int animTest) {
        this.paintAya.setAlpha(animTest);
        this.paintTranslationAya.setAlpha(this.paintAya.getAlpha());
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
            if (this.isTrsl()) {
                this.applyAyaPreset((Paint)this.paintAyaTrslOutline, AyaTextPreset.OUTLINE, this.clrTrsl, this.paintTranslationAya.getTypeface(), this.paintTranslationAya.getTextSize());
                this.staticLayoutTranslationOutline = this.buildStaticLayout(this.translation, this.paintAyaTrslOutline, this.staticLayoutTranslation.getWidth());
                this.applyAyaPreset((Paint)this.paintTranslationAya, AyaTextPreset.NONE, this.clrTrsl, this.paintTranslationAya.getTypeface(), this.paintTranslationAya.getTextSize());
            }
        }
        else {
            final TextPaint paintAya = this.paintAya;
            this.applyAyaPreset((Paint)paintAya, ayaTextPreset, this.clrAya, paintAya.getTypeface(), this.paintAya.getTextSize());
            if (this.isTrsl()) {
                final TextPaint paintTranslationAya = this.paintTranslationAya;
                this.applyAyaPreset((Paint)paintTranslationAya, ayaTextPreset, this.clrTrsl, paintTranslationAya.getTypeface(), this.paintTranslationAya.getTextSize());
            }
        }
    }
    
    public void setSlideX(float abs) {
        this.offsetX = abs;
        final TextPaint paintAya = this.paintAya;
        abs = Math.abs(abs);
        final float n = 1.0f - abs;
        abs = 255.0f;
        paintAya.setAlpha(Math.round(n * abs));
        this.paintTranslationAya.setAlpha(this.paintAya.getAlpha());
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
        this.paintTranslationAya.setAlpha(this.paintAya.getAlpha());
        this.paintAyaTrslOutline.setAlpha(this.paintAya.getAlpha());
        this.paintAyaOutline.setAlpha(this.paintAya.getAlpha());
        if (this.isAnimTest()) {
            final WeakReference weakBlurredImageView = this.weakBlurredImageView;
            if (weakBlurredImageView != null) {
                ((BlurredImageView)weakBlurredImageView.get()).invalidate();
            }
        }
    }
    
    public void setStartWord_index(final int startWord_index) {
        this.startWord_index = startWord_index;
    }
    
    public void setStaticLayout() {
        final String str = "";
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        Label_0145: {
            if (this.number != -1) {
                try {
                    final String txt = this.txt;
                    try {
                        final int length = txt.length();
                        try {
                            if (length <= this.indexNumber) {
                                break Label_0145;
                            }
                            try {
                                final VectorDrawable vectorDrawable = this.vectorDrawable;
                                try {
                                    final Typeface typefaceNumber = this.typefaceNumber;
                                    try {
                                        final StringBuilder append = new StringBuilder(str).append(this.number);
                                        try {
                                            spannableString.setSpan((Object)new EndOfAyaSpan(vectorDrawable, typefaceNumber, append.toString()), this.indexNumber, length, 0);
                                        }
                                        catch (final Exception ex) {
                                            ex.printStackTrace();
                                        }
                                    }
                                    catch (final Exception ex2) {}
                                }
                                catch (final Exception ex3) {}
                            }
                            catch (final Exception ex4) {}
                        }
                        catch (final Exception ex5) {}
                    }
                    catch (final Exception ex6) {}
                }
                catch (final Exception ex7) {}
            }
        }
        this.staticLayout = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        final float centerX = this.rect.centerX();
        final float n = (float)this.staticLayout.getWidth();
        final float n2 = 0.5f;
        this.x = centerX - n * n2;
        if (this.translation != null && this.getIpad_type() != IpadType.BOTTOM_RECT.ordinal() && this.getIpad_type() != IpadType.CASSET.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG_BLUR.ordinal()) {
            int viewWidth = this.viewWidth;
            final StaticLayout buildStaticLayout = this.buildStaticLayout(this.translation, this.paintTranslationAya, viewWidth);
            this.staticLayoutTranslation = buildStaticLayout;
            if (buildStaticLayout.getLineCount() == 2) {
                final int n3 = this.staticLayoutTranslation.getLineCount() - 1;
                while (this.translation.substring(this.staticLayoutTranslation.getLineStart(n3), this.staticLayoutTranslation.getLineEnd(n3)).trim().split("\\s+").length < 3) {
                    viewWidth -= 10;
                    if (viewWidth < 10) {
                        break;
                    }
                    this.staticLayoutTranslation = this.buildStaticLayout(this.translation, this.paintTranslationAya, viewWidth);
                }
                this.x_translation = this.rect.centerX() - this.staticLayoutTranslation.getWidth() * n2;
            }
            else {
                this.x_translation = this.x;
            }
            this.y = this.rect.centerY() - (this.staticLayout.getHeight() + this.staticLayoutTranslation.getHeight()) * n2;
        }
        else {
            this.y = this.rect.centerY() - this.staticLayout.getHeight() * n2;
        }
    }
    
    public void setTextSize(final float textSize) {
        this.paintAya.setTextSize(textSize);
    }
    
    public void setTextSizeInBoucle(float x) {
        final String str = "";
        this.paintAya.setTextSize(x);
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        Label_0151: {
            if (this.number != -1) {
                try {
                    final String txt = this.txt;
                    try {
                        final int length = txt.length();
                        try {
                            if (length <= this.indexNumber) {
                                break Label_0151;
                            }
                            try {
                                final VectorDrawable vectorDrawable = this.vectorDrawable;
                                try {
                                    final Typeface typefaceNumber = this.typefaceNumber;
                                    try {
                                        final StringBuilder append = new StringBuilder(str).append(this.number);
                                        try {
                                            spannableString.setSpan((Object)new EndOfAyaSpan(vectorDrawable, typefaceNumber, append.toString()), this.indexNumber, length, 0);
                                        }
                                        catch (final Exception ex) {
                                            ex.printStackTrace();
                                        }
                                    }
                                    catch (final Exception ex2) {}
                                }
                                catch (final Exception ex3) {}
                            }
                            catch (final Exception ex4) {}
                        }
                        catch (final Exception ex5) {}
                    }
                    catch (final Exception ex6) {}
                }
                catch (final Exception ex7) {}
            }
        }
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
        if (this.translation != null && this.staticLayoutTranslation != null) {
            y = this.rect.centerX();
            bottom = this.staticLayoutTranslation.getWidth() * n;
            y -= bottom;
            this.x_translation = y;
            y = this.rect.centerY();
            bottom = (this.staticLayout.getHeight() + this.staticLayoutTranslation.getHeight()) * n;
            y -= bottom;
            this.y = y;
        }
        else {
            y = this.rect.centerY();
            bottom = this.staticLayout.getHeight() * n;
            y -= bottom;
            this.y = y;
        }
    }
    
    public void setTranslation(final String translation) {
        this.translation = translation;
    }
    
    public void setTranslation_complete(final String translation_complete) {
        this.translation_complete = translation_complete;
    }
    
    public void setTxt(String translation) {
        final String str = "";
        this.txt = translation;
        final SpannableString spannableString = new SpannableString((CharSequence)translation);
        Label_0134: {
            if (this.number != -1) {
                try {
                    final int length = translation.length();
                    try {
                        if (length <= this.indexNumber) {
                            break Label_0134;
                        }
                        try {
                            final VectorDrawable vectorDrawable = this.vectorDrawable;
                            try {
                                final Typeface typefaceNumber = this.typefaceNumber;
                                try {
                                    final StringBuilder append = new StringBuilder(str).append(this.number);
                                    try {
                                        spannableString.setSpan((Object)new EndOfAyaSpan(vectorDrawable, typefaceNumber, append.toString()), this.indexNumber, length, 0);
                                    }
                                    catch (final Exception ex) {
                                        ex.printStackTrace();
                                    }
                                }
                                catch (final Exception ex2) {}
                            }
                            catch (final Exception ex3) {}
                        }
                        catch (final Exception ex4) {}
                    }
                    catch (final Exception ex5) {}
                }
                catch (final Exception ex6) {}
            }
        }
        this.staticLayout = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        if (this.isTrsl()) {
            translation = this.translation;
            this.staticLayoutTranslation = this.buildStaticLayout(translation, this.paintTranslationAya, this.staticLayoutTranslation.getWidth());
            final float centerY = this.rect.centerY();
            final float n = (float)(this.staticLayout.getHeight() + this.staticLayoutTranslation.getHeight());
            final float n2 = 0.5f;
            this.y = centerY - n * n2;
            this.x_translation = this.rect.centerX() - this.staticLayoutTranslation.getWidth() * n2;
        }
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
    
    public void setVectorDrawable(final VectorDrawable vectorDrawable) {
        this.vectorDrawable = vectorDrawable;
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
        final String translation = this.translation;
        final float n = 0.5f;
        if (translation != null && this.staticLayoutTranslation != null && this.getIpad_type() != IpadType.BOTTOM_RECT.ordinal() && this.getIpad_type() != IpadType.CASSET.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG_BLUR.ordinal()) {
            this.y = (canvas.getHeight() - this.staticLayout.getHeight() - this.staticLayoutTranslation.getHeight()) * n;
            this.x_translation = (canvas.getWidth() - this.staticLayoutTranslation.getWidth()) * n;
        }
        else {
            this.y = (canvas.getHeight() - this.staticLayout.getHeight()) * n;
        }
        this.x = (canvas.getWidth() - this.staticLayout.getWidth()) * n;
        canvas.save();
        canvas.translate(this.x, this.y);
    }
    
    public void setupScale(float y, int n, final int n2) {
        final String str = "";
        final TextPaint paintAya = this.paintAya;
        y *= n;
        paintAya.setTextSize(y);
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        final int number = this.number;
        final int n3 = -1;
        boolean b = false;
        Label_0183: {
            if (number != n3) {
                try {
                    final String txt = this.txt;
                    try {
                        final int length = txt.length();
                        try {
                            if (length <= this.indexNumber) {
                                break Label_0183;
                            }
                            try {
                                final VectorDrawable vectorDrawable = this.vectorDrawable;
                                try {
                                    final Typeface typefaceNumber = this.typefaceNumber;
                                    try {
                                        final StringBuilder append = new StringBuilder(str).append(this.number);
                                        try {
                                            spannableString.setSpan((Object)new EndOfAyaSpan(vectorDrawable, typefaceNumber, append.toString()), this.indexNumber, length, 0);
                                        }
                                        catch (final Exception ex) {
                                            ex.printStackTrace();
                                        }
                                    }
                                    catch (final Exception ex2) {}
                                }
                                catch (final Exception ex3) {}
                            }
                            catch (final Exception ex4) {}
                        }
                        catch (final Exception ex5) {}
                    }
                    catch (final Exception ex6) {}
                }
                catch (final Exception ex7) {}
            }
        }
        this.viewWidth = (int)Math.max(this.rect.width(), (float)Math.round(this.paintAya.measureText(spannableString.toString())));
        final StaticLayout build = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = build;
        y = (float)build.getWidth();
        final float n4 = 0.5f;
        final float n5 = y * n4;
        final float height = this.rect.height();
        y /= this.rect.width();
        final float n6 = height * y * n4;
        y = this.rect.centerY();
        final float centerX = this.rect.centerX();
        final RectF rect = this.rect;
        final float n7 = centerX - n5;
        final float n8 = y - n6;
        final float n9 = centerX + n5;
        y += n6;
        rect.set(n7, n8, n9, y);
        if (this.translation != null && this.staticLayoutTranslation != null) {
            b = true;
        }
        if (b && this.txt.length() < 20) {
            y = this.rect.height();
            n = 1057803469;
            final float n10 = 0.55f;
            this.max_h = Math.round(y * n10);
            y = this.rect.width() * n10;
            this.max_w = Math.round(y);
        }
        else if (b && n > n2) {
            y = this.rect.height();
            n = 1059313418;
            final float n11 = 0.64f;
            this.max_h = Math.round(y * n11);
            y = this.rect.width() * n11;
            this.max_w = Math.round(y);
        }
        else if (b && n == n2) {
            y = this.rect.height();
            n = 1061997773;
            final float n12 = 0.8f;
            this.max_h = Math.round(y * n12);
            y = this.rect.width() * n12;
            this.max_w = Math.round(y);
        }
        else {
            y = this.rect.height();
            n = 1062836634;
            final float n13 = 0.85f;
            this.max_h = Math.round(y * n13);
            y = this.rect.width() * n13;
            this.max_w = Math.round(y);
        }
        y = this.rect.centerX();
        y -= this.staticLayout.getWidth() * n4;
        this.x = y;
        y = this.rect.centerY();
        y -= this.staticLayout.getHeight() * n4;
        this.y = y;
    }
    
    public void setupScaleSave(float y, int height) {
        final String str = "";
        final TextPaint paintAya = this.paintAya;
        final float n = (float)height;
        y *= n;
        paintAya.setTextSize(y);
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        Label_0167: {
            if (this.number != -1) {
                try {
                    final String txt = this.txt;
                    try {
                        final int length = txt.length();
                        try {
                            if (length <= this.indexNumber) {
                                break Label_0167;
                            }
                            try {
                                final VectorDrawable vectorDrawable = this.vectorDrawable;
                                try {
                                    final Typeface typefaceNumber = this.typefaceNumber;
                                    try {
                                        final StringBuilder append = new StringBuilder(str).append(this.number);
                                        try {
                                            spannableString.setSpan((Object)new EndOfAyaSpan(vectorDrawable, typefaceNumber, append.toString()), this.indexNumber, length, 0);
                                        }
                                        catch (final Exception ex) {
                                            ex.printStackTrace();
                                        }
                                    }
                                    catch (final Exception ex2) {}
                                }
                                catch (final Exception ex3) {}
                            }
                            catch (final Exception ex4) {}
                        }
                        catch (final Exception ex5) {}
                    }
                    catch (final Exception ex6) {}
                }
                catch (final Exception ex7) {}
            }
        }
        this.viewWidth = (int)Math.max(this.rect.width(), (float)Math.round(this.paintAya.measureText(spannableString.toString())));
        this.staticLayout = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        y = this.rect.height();
        final float n2 = 0.85f;
        this.max_h = Math.round(y * n2);
        this.max_w = Math.round(this.rect.width() * n2);
        y = this.rect.centerX();
        final float n3 = (float)this.staticLayout.getWidth();
        final float n4 = 0.5f;
        y -= n3 * n4;
        this.x = y;
        if (this.translation != null) {
            y = this.getFactorSizeTrl() * n;
            this.updateTranslationSave(y);
            if (this.staticLayoutTranslation != null) {
                y = this.rect.centerX();
                y -= this.staticLayoutTranslation.getWidth() * n4;
                this.x_translation = y;
                y = this.rect.centerY();
                height = this.staticLayout.getHeight();
                y -= (height + this.staticLayoutTranslation.getHeight()) * n4;
                this.y = y;
                return;
            }
        }
        y = this.rect.centerY();
        y -= this.staticLayout.getHeight() * n4;
        this.y = y;
    }
    
    public void singleDraw(final Canvas canvas) {
        if (this.staticLayout != null) {
            if (this.mPreset == AyaTextPreset.OUTLINE.ordinal() && this.staticLayoutOutline != null) {
                this.paintAyaOutline.setTextSize(this.paintAya.getTextSize());
                this.staticLayoutOutline.draw(canvas);
            }
            this.staticLayout.draw(canvas);
            if (this.translation != null && this.staticLayoutTranslation != null && this.getIpad_type() != IpadType.BOTTOM_RECT.ordinal() && this.getIpad_type() != IpadType.CASSET.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG_BLUR.ordinal()) {
                canvas.save();
                canvas.translate(-this.x + this.x_translation, this.staticLayout.getHeight() * this.padding);
                if (this.mPreset == AyaTextPreset.OUTLINE.ordinal() && this.staticLayoutTranslationOutline != null) {
                    this.paintAyaTrslOutline.setTextSize(this.paintTranslationAya.getTextSize());
                    this.staticLayoutTranslationOutline.draw(canvas);
                }
                this.staticLayoutTranslation.draw(canvas);
                canvas.restore();
            }
        }
    }
    
    public void singleDraw(final Canvas canvas, final int n) {
        if (this.staticLayout != null) {
            this.paintAya.setAlpha(n);
            this.staticLayout.draw(canvas);
            if (this.translation != null && this.staticLayoutTranslation != null && this.getIpad_type() != IpadType.BOTTOM_RECT.ordinal() && this.getIpad_type() != IpadType.CASSET.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG_BLUR.ordinal()) {
                canvas.save();
                canvas.translate(-this.x + this.x_translation, this.staticLayout.getHeight() * this.padding);
                this.paintTranslationAya.setAlpha(n);
                this.staticLayoutTranslation.draw(canvas);
                canvas.restore();
            }
        }
    }
    
    public void singleDraw(final Canvas canvas, final int n, float n2) {
        if (this.staticLayout != null) {
            canvas.save();
            canvas.translate(this.staticLayout.getWidth() * n2, 0.0f);
            this.paintAya.setAlpha(n);
            this.staticLayout.draw(canvas);
            canvas.restore();
            if (this.translation != null && this.staticLayoutTranslation != null && this.getIpad_type() != IpadType.BOTTOM_RECT.ordinal() && this.getIpad_type() != IpadType.CASSET.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG_BLUR.ordinal()) {
                canvas.save();
                canvas.translate(-this.x + this.x_translation, this.staticLayout.getHeight() * this.padding);
                n2 *= this.staticLayout.getWidth();
                canvas.translate(n2, 0.0f);
                this.paintTranslationAya.setAlpha(n);
                this.staticLayoutTranslation.draw(canvas);
                canvas.restore();
            }
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
    
    public void update(final RectF rectF, final int max_w, final int max_h) {
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.max_h = max_h;
        this.max_w = max_w;
        this.viewWidth = (int)this.rect.width();
    }
    
    public void updateIconDraw() {
        final String str = "";
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        Label_0139: {
            if (this.number != -1) {
                try {
                    final String txt = this.txt;
                    try {
                        final int length = txt.length();
                        try {
                            if (length <= this.indexNumber) {
                                break Label_0139;
                            }
                            try {
                                final VectorDrawable vectorDrawable = this.vectorDrawable;
                                try {
                                    final Typeface typefaceNumber = this.typefaceNumber;
                                    try {
                                        final StringBuilder append = new StringBuilder(str).append(this.number);
                                        try {
                                            spannableString.setSpan((Object)new EndOfAyaSpan(vectorDrawable, typefaceNumber, append.toString()), this.indexNumber, length, 0);
                                        }
                                        catch (final Exception ex) {
                                            ex.printStackTrace();
                                        }
                                    }
                                    catch (final Exception ex2) {}
                                }
                                catch (final Exception ex3) {}
                            }
                            catch (final Exception ex4) {}
                        }
                        catch (final Exception ex5) {}
                    }
                    catch (final Exception ex6) {}
                }
                catch (final Exception ex7) {}
            }
        }
        this.staticLayout = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }
    
    public void updateStaticLayout() {
        final SpannableString spannableString = this.spannableString;
        this.staticLayout = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        if (this.translation != null && this.getIpad_type() != IpadType.BOTTOM_RECT.ordinal() && this.getIpad_type() != IpadType.CASSET.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG_BLUR.ordinal()) {
            int viewWidth = this.viewWidth;
            final StaticLayout buildStaticLayout = this.buildStaticLayout(this.translation, this.paintTranslationAya, viewWidth);
            this.staticLayoutTranslation = buildStaticLayout;
            if (buildStaticLayout.getLineCount() == 2) {
                final int n = this.staticLayoutTranslation.getLineCount() - 1;
                while (this.translation.substring(this.staticLayoutTranslation.getLineStart(n), this.staticLayoutTranslation.getLineEnd(n)).trim().split("\\s+").length < 3) {
                    viewWidth -= 10;
                    if (viewWidth < 10) {
                        break;
                    }
                    this.staticLayoutTranslation = this.buildStaticLayout(this.translation, this.paintTranslationAya, viewWidth);
                }
                this.x_translation = this.rect.centerX() - this.staticLayoutTranslation.getWidth() * 0.5f;
            }
            else {
                this.x_translation = this.x;
            }
        }
    }
    
    public void updateTranslation(float n) {
        if (!this.isTrsl()) {
            return;
        }
        this.paintTranslationAya.setTextSize(n);
        int n2 = (int)(this.viewWidth * 0.9f);
        this.staticLayoutTranslation = this.buildStaticLayout(this.translation, this.paintTranslationAya, n2);
        final float n3 = n2 * 0.17f;
        final float n4 = this.staticLayout.getWidth() * 0.4f;
        final int n5 = this.staticLayoutTranslation.getLineCount() - 1;
        while (this.translation.substring(this.staticLayoutTranslation.getLineStart(n5), this.staticLayoutTranslation.getLineEnd(n5)).trim().split("\\s+").length < 2) {
            n2 -= (int)n3;
            if (n2 < n4) {
                this.paintTranslationAya.setTextSize(n);
                this.staticLayoutTranslation = this.buildStaticLayout(this.translation, this.paintTranslationAya, this.viewWidth);
                break;
            }
            this.staticLayoutTranslation = this.buildStaticLayout(this.translation, this.paintTranslationAya, n2);
        }
        n = this.rect.centerX();
        final float n6 = (float)this.staticLayoutTranslation.getWidth();
        final float n7 = 0.5f;
        n -= n6 * n7;
        this.x_translation = n;
        n = this.rect.centerY();
        n -= (this.staticLayout.getHeight() + this.staticLayoutTranslation.getHeight()) * n7;
        this.y = n;
    }
    
    public void updateTranslationSave(float textSize) {
        if (this.translation != null && this.getIpad_type() != IpadType.CASSET.ordinal() && this.getIpad_type() != IpadType.CASSET_IMG.ordinal() && this.getIpad_type() != IpadType.BOTTOM_RECT.ordinal()) {
            if (this.getIpad_type() != IpadType.CASSET_IMG_BLUR.ordinal()) {
                this.paintTranslationAya.setTextSize(textSize);
                this.staticLayoutTranslation = this.buildStaticLayout(this.translation, this.paintTranslationAya, (int)(this.viewWidth * 0.9f));
                textSize = (float)this.staticLayout.getWidth();
                final float n = fcmpl(textSize, this.rect.width());
                final float n2 = 0.5f;
                if (n > 0) {
                    textSize = this.staticLayout.getWidth() * n2;
                    this.rect.left = this.rect.centerX() - textSize;
                    this.rect.right = this.rect.centerX() + textSize;
                }
                textSize = (float)this.staticLayoutTranslation.getWidth();
                if (textSize > this.rect.width()) {
                    textSize = this.staticLayoutTranslation.getWidth() * n2;
                    this.rect.left = this.rect.centerX() - textSize;
                    this.rect.right = this.rect.centerX() + textSize;
                }
                textSize = (float)this.staticLayout.getHeight();
                if (textSize > this.rect.height()) {
                    textSize = this.staticLayout.getHeight() * n2;
                    this.rect.top = this.rect.centerY() - textSize;
                    this.rect.bottom = this.rect.centerY() + textSize;
                }
                textSize = (float)this.staticLayoutTranslation.getHeight();
                if (textSize > this.rect.height()) {
                    textSize = this.staticLayoutTranslation.getHeight() * n2;
                    this.rect.top = this.rect.centerY() - textSize;
                    this.rect.bottom = this.rect.centerY() + textSize;
                }
            }
        }
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
