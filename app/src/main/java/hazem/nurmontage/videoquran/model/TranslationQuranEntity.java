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
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.constant.TransitionType;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import java.io.Serializable;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class TranslationQuranEntity extends EntityView implements Serializable {
    private static final int ALPHA_BG = 100;
    private int clrAya;
    private int index;
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
    private final TextPaint paintAya;
    private final TextPaint paintAyaOutline;
    private final TextPaint paintAyaTrslOutline;
    private final TextPaint paintBg;
    private SpannableString spannableString;
    private StaticLayout staticLayout;
    private StaticLayout staticLayoutOutline;
    private String txt;
    private WeakReference<TrackEntityView> viewWeakReference;
    private int viewWidth;
    private WeakReference<BlurredImageView> weakBlurredImageView;
    private int clrBg = ViewCompat.MEASURED_STATE_MASK;
    private boolean isHaveBg = true;
    private float scaleX = 1.0f;

    public int getClrBg() {
        return this.clrBg;
    }

    public void setHaveBg(boolean isFlag) {
        this.isHaveBg = isFlag;
    }

    public boolean isHaveBg() {
        return this.isHaveBg;
    }

    public void setClrBg(int value) {
        this.clrBg = value;
        this.paintBg.setColor(value);
        this.paintBg.setAlpha(100);
    }

    public int getmPreset() {
        return this.mPreset;
    }

    public void setmPreset(int value) {
        this.mPreset = value;
    }

    public void setIpad_type(int value) {
        this.ipad_type = value;
    }

    public String getTxt() {
        return this.txt;
    }

    public int getIpad_type() {
        return this.ipad_type;
    }

    public void applyAyaPreset(Paint paint, AyaTextPreset ayaTextPreset, int value, Typeface typeface, float floatValue) {
        paint.reset();
        paint.setTypeface(typeface);
        paint.setTextSize(floatValue);
        paint.setAntiAlias(true);
        paint.setSubpixelText(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(value);
        if (paint == this.paintAyaTrslOutline) {
            floatValue *= 1.35f;
        }
        int size2 = C22071.$SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset[ayaTextPreset.ordinal()];
        if (size2 != 2) {
            if (size2 != 3) {
                if (size2 != 4) {
                    return;
                }
                paint.setShadowLayer(floatValue * 0.45f, 0.0f, 0.0f, ColorUtils.setAlphaComponent(value, 255));
                return;
            } else {
                float floatValue2 = 0.18f * floatValue;
                float f3 = floatValue * 0.08f;
                paint.setShadowLayer(floatValue2, f3, f3, ColorUtils.setAlphaComponent((this.ipad_type == IpadType.HEART.ordinal() || this.ipad_type == IpadType.BATTERY.ordinal() || this.ipad_type == IpadType.BLUE_TYPE.ordinal()) ? -1 : ViewCompat.MEASURED_STATE_MASK, 120));
                return;
            }
        }
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(floatValue * 0.12f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        if (this.ipad_type == IpadType.HEART.ordinal() || this.ipad_type == IpadType.BATTERY.ordinal() || this.ipad_type == IpadType.BLUE_TYPE.ordinal()) {
            paint.setColor(hazem.nurmontage.videoquran.Utils.ColorUtils.lightenColor(value, 0.85f));
        } else {
            paint.setColor(hazem.nurmontage.videoquran.Utils.ColorUtils.darkenColor(value, 0.85f));
        }
    }

    /* renamed from: hazem.nurmontage.videoquran.model.TranslationQuranEntity$1 */
    static /* synthetic */ class C22071 {
        static final /* synthetic */ int[] $SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset;

        static {
            int[] iArr = new int[AyaTextPreset.values().length];
            $SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset = iArr;
            try {
                iArr[AyaTextPreset.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset[AyaTextPreset.OUTLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset[AyaTextPreset.SHADOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset[AyaTextPreset.GLOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void setPreset(AyaTextPreset ayaTextPreset) {
        this.mPreset = ayaTextPreset.ordinal();
        if (ayaTextPreset == AyaTextPreset.OUTLINE) {
            applyAyaPreset(this.paintAyaOutline, AyaTextPreset.OUTLINE, this.clrAya, this.paintAya.getTypeface(), this.paintAya.getTextSize());
            this.staticLayoutOutline = getStaticLayoutOutline();
            applyAyaPreset(this.paintAya, AyaTextPreset.NONE, this.clrAya, this.paintAya.getTypeface(), this.paintAya.getTextSize());
        } else {
            TextPaint textPaint = this.paintAya;
            applyAyaPreset(textPaint, ayaTextPreset, this.clrAya, textPaint.getTypeface(), this.paintAya.getTextSize());
        }
    }

    public AyaTextPreset get(int value) {
        if (value == AyaTextPreset.SHADOW.ordinal()) {
            return AyaTextPreset.SHADOW;
        }
        if (value == AyaTextPreset.OUTLINE.ordinal()) {
            return AyaTextPreset.OUTLINE;
        }
        if (value == AyaTextPreset.GLOW.ordinal()) {
            return AyaTextPreset.GLOW;
        }
        return AyaTextPreset.NONE;
    }

    public void initPreset(int value) {
        this.mPreset = value;
        AyaTextPreset ayaTextPreset = get(value);
        if (ayaTextPreset == AyaTextPreset.NONE) {
            return;
        }
        if (ayaTextPreset == AyaTextPreset.OUTLINE) {
            applyAyaPreset(this.paintAyaOutline, AyaTextPreset.OUTLINE, this.clrAya, this.paintAya.getTypeface(), this.paintAya.getTextSize());
            this.staticLayoutOutline = getStaticLayoutOutline();
            applyAyaPreset(this.paintAya, AyaTextPreset.NONE, this.clrAya, this.paintAya.getTypeface(), this.paintAya.getTextSize());
        } else {
            TextPaint textPaint = this.paintAya;
            applyAyaPreset(textPaint, ayaTextPreset, this.clrAya, textPaint.getTypeface(), this.paintAya.getTextSize());
        }
    }

    public void initPresetAya(int value) {
        this.mPreset = value;
        AyaTextPreset ayaTextPreset = get(value);
        if (ayaTextPreset == AyaTextPreset.NONE) {
            return;
        }
        if (ayaTextPreset == AyaTextPreset.OUTLINE) {
            applyAyaPreset(this.paintAyaOutline, AyaTextPreset.OUTLINE, this.clrAya, this.paintAya.getTypeface(), this.paintAya.getTextSize());
            this.staticLayoutOutline = getStaticLayoutOutline();
            applyAyaPreset(this.paintAya, AyaTextPreset.NONE, this.clrAya, this.paintAya.getTypeface(), this.paintAya.getTextSize());
        } else {
            TextPaint textPaint = this.paintAya;
            applyAyaPreset(textPaint, ayaTextPreset, this.clrAya, textPaint.getTypeface(), this.paintAya.getTextSize());
        }
    }

    public void setViewWeakReference(WeakReference<TrackEntityView> weakReference, WeakReference<BlurredImageView> weakReference2) {
        this.viewWeakReference = weakReference;
        this.weakBlurredImageView = weakReference2;
    }

    public int getDuration_fade() {
        return (int) ((Math.abs(getEntityQuran().getRect().right / getEntityQuran().getSecond_in_screen()) - Math.abs(getEntityQuran().getRect().left / getEntityQuran().getSecond_in_screen())) * 0.2f * 1000.0f);
    }

    public String getNameFont() {
        return this.nameFont;
    }

    public void setIndex(int value) {
        this.index = value;
    }

    public int getIndex() {
        return this.index;
    }

    public void setClrAya(int value) {
        this.clrAya = value;
    }

    public int getClrAya() {
        return this.clrAya;
    }

    public TextPaint getPaintAya() {
        return this.paintAya;
    }

    public float calculateTextSize(String textValue, Paint paint, int value, int size2) {
        float floatValue = 0.0f;
        if (textValue != null && !textValue.isEmpty() && value > 0 && size2 > 0) {
            paint.setTextSize(1.0f);
            Rect rect = new Rect();
            paint.getTextBounds(textValue, 0, textValue.length(), rect);
            rect.width();
            rect.height();
            float floatValue2 = 1000.0f;
            for (int value3 = 0; value3 < 100; value3++) {
                float f3 = (floatValue + floatValue2) / 2.0f;
                paint.setTextSize(f3);
                paint.getTextBounds(textValue, 0, textValue.length(), rect);
                float width = rect.width();
                float height = rect.height();
                if (width > value || height > size2) {
                    floatValue2 = f3;
                } else {
                    floatValue = f3;
                }
            }
        }
        return floatValue;
    }

    public float calculateOptimalTextSize(String textValue, int value, int size2, TextPaint textPaint) {
        float floatValue = 5.0f;
        float floatValue2 = 1000.0f;
        float f3 = 5.0f;
        while (floatValue <= floatValue2) {
            float f4 = (floatValue + floatValue2) / 2.0f;
            textPaint.setTextSize(f4);
            StaticLayout build = StaticLayout.Builder.obtain(textValue, 0, textValue.length(), textPaint, value).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
            float height = build.getHeight();
            float maxLineWidth = getMaxLineWidth(build);
            if (height > size2 || maxLineWidth > value) {
                floatValue2 = f4 - 0.03f;
            } else {
                f3 = f4;
                floatValue = 0.03f + f4;
            }
        }
        return f3;
    }

    private float getMaxLineWidth(StaticLayout staticLayout) {
        float floatValue = 0.0f;
        for (int value = 0; value < staticLayout.getLineCount(); value++) {
            floatValue = Math.max(floatValue, staticLayout.getLineWidth(value));
        }
        return floatValue;
    }

    private float createBestSizeLayout(String textValue, TextPaint textPaint, int value, int size2) {
        float height = this.rect.height() * 0.08f;
        for (float height2 = this.rect.height() * 0.28f; height2 >= height; height2 -= 1.0f) {
            textPaint.setTextSize(height2);
            if (StaticLayout.Builder.obtain(textValue, 0, textValue.length(), textPaint, value).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.12f).setIncludePad(false).build().getHeight() <= size2) {
                return textPaint.getTextSize();
            }
        }
        textPaint.setTextSize(height);
        return textPaint.getTextSize();
    }

    public float calculateTextSize() {
        return createBestSizeLayout(this.txt, this.paintAya, (int) (this.rect.width() * 0.9f), (int) (this.rect.height() * 0.95f));
    }

    public void setTextSize(float floatValue) {
        this.paintAya.setTextSize(floatValue);
    }

    public void setTextSizeInBoucle(float floatValue) {
        this.paintAya.setTextSize(floatValue);
        SpannableString spannableString = new SpannableString(this.txt);
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
    }

    private StaticLayout createBalancedLayout(String textValue, TextPaint textPaint, int value, float floatValue, float floatValue2) {
        StaticLayout build;
        SpannableString spannableString = new SpannableString(textValue);
        do {
            textPaint.setTextSize(floatValue);
            build = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, value).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).setLineSpacing(0.0f, 1.0f).build();
            int lineCount = build.getLineCount();
            if (lineCount <= 1) {
                break;
            }
            int size2 = lineCount - 1;
            if (!(build.getLineWidth(size2) >= ((float) value) * 0.25f ? textValue.substring(build.getLineStart(size2), build.getLineEnd(size2)).trim().split("\\s+").length <= 1 : true)) {
                break;
            }
            floatValue -= 1.0f;
        } while (floatValue > floatValue2);
        return build;
    }

    public void setupScale(float floatValue, int value, int size2) {
        float floatValue2 = value;
        int value3 = (int) (0.9f * floatValue2);
        this.viewWidth = value3;
        this.staticLayout = createBalancedLayout(this.txt, this.paintAya, value3, floatValue * floatValue2, 2.0f);
        float width = r7.getWidth() * 0.5f;
        float height = this.staticLayout.getHeight() * 0.5f;
        float height2 = this.rect.height() * 0.12f;
        float centerY = this.rect.centerY();
        float centerX = this.rect.centerX();
        this.rect.set(centerX - width, (centerY - height) - height2, centerX + width, centerY + height + height2);
        this.max_h = Math.round(this.rect.height() * 0.85f);
        this.max_w = Math.round(this.rect.width() * 0.85f);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
    }

    public void setupScaleSave(float floatValue, int value) {
        int round = Math.round(this.rect.width());
        this.viewWidth = round;
        this.staticLayout = createBalancedLayout(this.txt, this.paintAya, round, floatValue * value, 2.0f);
        this.max_h = Math.round(this.rect.height() * 0.85f);
        this.max_w = Math.round(this.rect.width() * 0.85f);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
    }

    public void updatePaint(float floatValue, int value) {
        this.paintAya.setTextSize(floatValue);
        SpannableString spannableString = new SpannableString(this.txt);
        this.viewWidth = value;
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.max_h = Math.round(this.rect.height() * 0.85f);
        this.max_w = Math.round(this.rect.width() * 0.85f);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public void scale(float floatValue, int value, int size2) {
        setFactor_scale(floatValue);
        float height = this.rect.height() * floatValue;
        float floatValue2 = value;
        float f3 = 0.46f * floatValue2;
        this.rect.left = this.rect.centerX() - f3;
        this.rect.right = this.rect.centerX() + f3;
        float f4 = height * 0.5f;
        this.rect.top = this.rect.centerY() - f4;
        this.rect.bottom = this.rect.centerY() + f4;
        this.viewWidth = (int) this.rect.width();
        this.paintAya.setTextSize(calculateTextSize());
        createStaticLayout();
        setFcSize(this.paintAya.getTextSize() / floatValue2);
        initPreset(getmPreset());
    }

    public void applyAll(int value, RectF rectF, float floatValue, float floatValue2, TranslationQuranEntity translationQuranEntity) {
        this.paintAya.setTextSize(floatValue);
        SpannableString spannableString = new SpannableString(this.txt);
        this.viewWidth = (int) (((int) Math.max(rectF.width(), Math.round(this.paintAya.measureText(spannableString.toString())))) * 1.1f);
        StaticLayout build = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = build;
        float width = build.getWidth();
        setFcSize(floatValue2);
        float f3 = width * 0.5f;
        float height = this.rect.height() * (width / this.rect.width()) * 0.5f;
        this.rect.set(rectF.centerX() - f3, rectF.centerY() - height, rectF.centerX() + f3, rectF.centerY() + height);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
        this.max_h = Math.round(this.rect.height() * 0.85f);
        this.max_w = Math.round(this.rect.width() * 0.85f);
        initPreset(getmPreset());
    }

    public void applyAll(int value, RectF rectF, float floatValue, float floatValue2) {
        int round = Math.round(rectF.width());
        this.viewWidth = round;
        StaticLayout createBalancedLayout = createBalancedLayout(this.txt, this.paintAya, round, floatValue, 2.0f);
        this.staticLayout = createBalancedLayout;
        float width = createBalancedLayout.getWidth();
        setFcSize(floatValue2);
        float height = this.rect.height() * 0.12f;
        float f3 = width * 0.5f;
        float height2 = this.staticLayout.getHeight() * 0.5f;
        this.rect.set(rectF.centerX() - f3, (rectF.centerY() - height2) - height, rectF.centerX() + f3, rectF.centerY() + height2 + height);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
        this.max_h = Math.round(this.rect.height() * 0.85f);
        this.max_w = Math.round(this.rect.width() * 0.85f);
        initPreset(getmPreset());
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public void postTranslate(float floatValue, float floatValue2) {
        this.rect.offset(floatValue, floatValue2);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
    }

    public void setTranslate(float floatValue, float floatValue2) {
        float width = this.rect.width() * 0.5f;
        float height = this.rect.height() * 0.5f;
        this.rect.left = floatValue - width;
        this.rect.right = floatValue + width;
        this.rect.top = floatValue2 - height;
        this.rect.bottom = floatValue2 + height;
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
    }

    public float getWidth() {
        this.paintAya.setTextSize(3.0f);
        return this.paintAya.measureText(this.txt);
    }

    public void createStaticLayout() {
        String textValue = this.txt;
        TextPaint textPaint = this.paintAya;
        this.staticLayout = createBalancedLayout(textValue, textPaint, this.viewWidth, textPaint.getTextSize(), 2.0f);
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
    }

    private StaticLayout buildStaticLayout(String textValue, TextPaint textPaint, int value) {
        return StaticLayout.Builder.obtain(textValue, 0, textValue.length(), textPaint, value).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    public void setStaticLayout() {
        SpannableString spannableString = new SpannableString(this.txt);
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
    }

    private StaticLayout getStaticLayoutOutline() {
        SpannableString spannableString = new SpannableString(this.txt);
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAyaOutline, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    public void updateStaticLayout() {
        SpannableString spannableString = this.spannableString;
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    public void setFadeIn(boolean isFlag) {
        this.isFadeIn = isFlag;
    }

    public void setFadeOut(boolean isFlag) {
        this.isFadeOut = isFlag;
    }

    public boolean isFadeIn() {
        return this.isFadeIn;
    }

    public boolean isFadeOut() {
        return this.isFadeOut;
    }

    public boolean isAnimRun() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.objectAnimator;
        return (objectAnimator2 != null && objectAnimator2.isRunning()) || ((objectAnimator = this.otherAnimation) != null && objectAnimator.isRunning());
    }

    public void setOpacityFade(int value) {
        this.paintAya.setAlpha(value);
        this.paintAyaTrslOutline.setAlpha(this.paintAya.getAlpha());
        this.paintAyaOutline.setAlpha(this.paintAya.getAlpha());
        if (isAnimTest()) {
            WeakReference<BlurredImageView> weakReference = this.weakBlurredImageView;
            if (weakReference != null) {
                weakReference.get().invalidate();
                return;
            }
            return;
        }
        WeakReference<TrackEntityView> weakReference2 = this.viewWeakReference;
        if (weakReference2 != null) {
            weakReference2.get().invalidate();
        }
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public void endAnimator() {
        try {
            ObjectAnimator objectAnimator = this.objectAnimator;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                this.objectAnimator.end();
            }
            ObjectAnimator objectAnimator2 = this.otherAnimation;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                this.otherAnimation.end();
            }
            this.objectAnimator = null;
            this.otherAnimation = null;
        } catch (Exception unused) {
        }
        setFadeIn(false);
        setFadeOut(false);
        this.offsetX = 0.0f;
        this.paintAya.setAlpha(255);
        this.paintAyaTrslOutline.setAlpha(this.paintAya.getAlpha());
        this.paintAyaOutline.setAlpha(this.paintAya.getAlpha());
    }

    public void setSlideX(float floatValue) {
        WeakReference<BlurredImageView> weakReference;
        this.offsetX = floatValue;
        this.paintAya.setAlpha(Math.round((1.0f - Math.abs(floatValue)) * 255.0f));
        this.paintAyaTrslOutline.setAlpha(this.paintAya.getAlpha());
        this.paintAyaOutline.setAlpha(this.paintAya.getAlpha());
        if (!isAnimTest() || (weakReference = this.weakBlurredImageView) == null) {
            return;
        }
        weakReference.get().invalidate();
    }

    public void setSlideXOut(float floatValue) {
        WeakReference<BlurredImageView> weakReference;
        this.offsetX = floatValue;
        this.paintAya.setAlpha(Math.round((1.0f - Math.abs(floatValue)) * 255.0f));
        this.paintAyaTrslOutline.setAlpha(this.paintAya.getAlpha());
        this.paintAyaOutline.setAlpha(this.paintAya.getAlpha());
        if (!isAnimTest() || (weakReference = this.weakBlurredImageView) == null) {
            return;
        }
        weakReference.get().invalidate();
    }

    public void setFactorSize(float floatValue) {
        WeakReference<BlurredImageView> weakReference;
        this.scaleX = floatValue;
        if (!isAnimTest() || (weakReference = this.weakBlurredImageView) == null) {
            return;
        }
        weakReference.get().invalidate();
    }

    public void slidToLeft(int value, boolean isFlag) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "SlideX", 1.0f, 0.0f);
        this.otherAnimation = ofFloat;
        ofFloat.setDuration(value);
        if (isFlag) {
            this.otherAnimation.setRepeatMode(1);
            this.otherAnimation.setRepeatCount(-1);
        }
        this.otherAnimation.start();
    }

    public void slidToRightOut(int value, boolean isFlag) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "SlideXOut", 0.0f, 1.0f);
        this.otherAnimation = ofFloat;
        ofFloat.setDuration(value);
        if (isFlag) {
            this.otherAnimation.setRepeatMode(1);
            this.otherAnimation.setRepeatCount(-1);
        }
        this.otherAnimation.start();
    }

    public void slidToLeftOut(int value, boolean isFlag) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "SlideXOut", 0.0f, -1.0f);
        this.otherAnimation = ofFloat;
        ofFloat.setDuration(value);
        if (isFlag) {
            this.otherAnimation.setRepeatMode(1);
            this.otherAnimation.setRepeatCount(-1);
        }
        this.otherAnimation.start();
    }

    public void slidToRight(int value, boolean isFlag) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "SlideX", -1.0f, 0.0f);
        this.otherAnimation = ofFloat;
        ofFloat.setDuration(value);
        if (isFlag) {
            this.otherAnimation.setRepeatMode(1);
            this.otherAnimation.setRepeatCount(-1);
        }
        this.otherAnimation.start();
    }

    public void zoomIn_In(int value, boolean isFlag) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "FactorSize", 0.0f, 1.0f);
        this.otherAnimation = ofFloat;
        ofFloat.setDuration(value);
        if (isFlag) {
            this.otherAnimation.setRepeatMode(1);
            this.otherAnimation.setRepeatCount(-1);
        }
        this.otherAnimation.start();
    }

    public void runIn(int value, boolean isFlag, String textValue) {
        if (textValue.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
            slidToLeft(value, isFlag);
        }
        if (textValue.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
            slidToRight(value, isFlag);
        }
        if (textValue.equals(TransitionType.ZOOM_IN.getValue())) {
            zoomIn_In(value, isFlag);
        }
        if (textValue.equals(TransitionType.FADE_IN.getValue())) {
            fadeIn(value, isFlag);
        }
    }

    private void fadeIn(int value, boolean isFlag) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "OpacityFade", 0, 255);
        this.objectAnimator = ofInt;
        ofInt.setDuration(value);
        if (isFlag) {
            this.objectAnimator.setRepeatMode(1);
            this.objectAnimator.setRepeatCount(-1);
        }
        this.objectAnimator.start();
    }

    private void fadeOut(int value, boolean isFlag) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "OpacityFade", 255, 0);
        this.objectAnimator = ofInt;
        ofInt.setDuration(value);
        if (isFlag) {
            this.objectAnimator.setRepeatMode(1);
            this.objectAnimator.setRepeatCount(-1);
        }
        this.objectAnimator.start();
    }

    public void runOut(int value, boolean isFlag, String textValue) {
        if (textValue.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
            slidToLeftOut(value, isFlag);
        }
        if (textValue.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
            slidToRightOut(value, isFlag);
        }
        if (textValue.equals(TransitionType.FADE_OUT.getValue())) {
            fadeOut(value, isFlag);
        }
    }

    public TranslationQuranEntity(String textValue, RectF rectF, Typeface typeface, int value, int size2, String textValue2, int value3, int value4) {
        this.nameFont = Common.FONT_QURAN;
        TextPaint textPaint = new TextPaint(1);
        this.paintAya = textPaint;
        this.paintAyaOutline = new TextPaint(1);
        this.paintAyaTrslOutline = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(1);
        this.paintBg = textPaint2;
        setCanvasWH(value3, value4);
        this.txt = textValue;
        this.nameFont = textValue2;
        this.number = value;
        float floatValue = value4;
        this.rect = new RectF(0.0f, floatValue - rectF.height(), value3, floatValue);
        setVisible(true);
        this.viewWidth = (int) rectF.width();
        textPaint.setTypeface(typeface);
        textPaint.setColor(size2);
        textPaint.setTextSize(calculateTextSize());
        textPaint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        textPaint2.setAlpha(100);
        setClrAya(size2);
        this.max_h = (int) (this.rect.height() * 0.85f);
        this.max_w = (int) (this.rect.width() * 0.85f);
        createStaticLayout();
    }

    public TranslationQuranEntity(int value, int size2, String textValue, RectF rectF, Typeface typeface, int value3, int value4, String textValue2) {
        this.nameFont = Common.FONT_QURAN;
        TextPaint textPaint = new TextPaint(1);
        this.paintAya = textPaint;
        this.paintAyaOutline = new TextPaint(1);
        this.paintAyaTrslOutline = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(1);
        this.paintBg = textPaint2;
        setCanvasWH(value, size2);
        this.txt = textValue;
        this.nameFont = textValue2;
        this.number = value3;
        this.rect = rectF;
        setVisible(true);
        this.viewWidth = (int) rectF.width();
        textPaint.setTypeface(typeface);
        textPaint.setColor(value4);
        textPaint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        textPaint2.setAlpha(100);
        setClrAya(value4);
        this.max_h = (int) (this.rect.height() * 0.85f);
        this.max_w = (int) (this.rect.width() * 0.85f);
    }

    public TranslationQuranEntity(String textValue, RectF rectF, Typeface typeface, int value, int size2, String textValue2, float floatValue) {
        this.nameFont = Common.FONT_QURAN;
        TextPaint textPaint = new TextPaint(1);
        this.paintAya = textPaint;
        this.paintAyaOutline = new TextPaint(1);
        this.paintAyaTrslOutline = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(1);
        this.paintBg = textPaint2;
        this.txt = textValue;
        this.nameFont = textValue2;
        this.number = value;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        setVisible(true);
        this.viewWidth = (int) rectF.width();
        textPaint.setTypeface(typeface);
        textPaint.setColor(size2);
        textPaint.setTextSize(floatValue);
        textPaint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        textPaint2.setAlpha(100);
        setClrAya(size2);
        this.max_h = (int) (this.rect.height() * 0.85f);
        this.max_w = (int) (this.rect.width() * 0.85f);
    }

    public TranslationQuranEntity(String textValue, RectF rectF, Typeface typeface, int value, int size2, String textValue2, float floatValue, boolean isFlag) {
        this.nameFont = Common.FONT_QURAN;
        TextPaint textPaint = new TextPaint(1);
        this.paintAya = textPaint;
        this.paintAyaOutline = new TextPaint(1);
        this.paintAyaTrslOutline = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(1);
        this.paintBg = textPaint2;
        this.txt = textValue;
        this.nameFont = textValue2;
        this.number = value;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        setVisible(true);
        this.viewWidth = (int) rectF.width();
        textPaint.setTypeface(typeface);
        textPaint.setColor(size2);
        textPaint.setTextSize(floatValue);
        this.max_h = (int) (this.rect.height() * 0.85f);
        this.max_w = (int) (this.rect.width() * 0.85f);
        textPaint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        textPaint2.setAlpha(100);
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int value) {
        this.number = value;
    }

    public void update(RectF rectF, int value, int size2) {
        this.rect = rectF;
        this.max_h = size2;
        this.max_w = value;
        this.viewWidth = (int) this.rect.width();
    }

    public void onResize(RectF rectF, int value, int size2) {
        this.rect = new RectF(0.0f, getCanvasH() - rectF.height(), getCanvasW(), getCanvasH());
        this.max_h = size2;
        this.max_w = value;
        this.viewWidth = (int) this.rect.width();
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public int getMax_h() {
        return this.max_h;
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public int getMax_w() {
        return this.max_w;
    }

    public StaticLayout getStaticLayout() {
        return this.staticLayout;
    }

    public void setTypeface(Typeface typeface, String textValue) {
        this.paintAya.setTypeface(typeface);
        this.nameFont = textValue;
    }

    public void setTypefaceOneAya(Typeface typeface, String textValue) {
        this.paintAya.setTypeface(typeface);
        this.nameFont = textValue;
    }

    public void setColor(int value) {
        setClrAya(value);
        this.paintAya.setColor(value);
    }

    public void draw(Canvas canvas) {
        if (this.staticLayout != null) {
            if (this.isHaveBg) {
                canvas.drawRect(0.0f, this.rect.top, canvas.getWidth(), this.rect.bottom, this.paintBg);
            }
            canvas.save();
            canvas.translate(this.f427x + (this.offsetX * this.staticLayout.getWidth()), this.f428y);
            float floatValue = this.scaleX;
            canvas.scale(floatValue, floatValue);
            if (this.mPreset == AyaTextPreset.OUTLINE.ordinal() && this.staticLayoutOutline != null) {
                this.paintAyaOutline.setTextSize(this.paintAya.getTextSize());
                this.staticLayoutOutline.draw(canvas);
            }
            this.staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public void setupCanvasDraw(Canvas canvas) {
        this.f428y = (canvas.getHeight() - this.staticLayout.getHeight()) * 0.5f;
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        canvas.save();
        if (this.isHaveBg) {
            canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.paintBg);
        }
        canvas.translate(this.f427x, this.f428y);
    }

    public void restoreCanvas(Canvas canvas) {
        try {
            canvas.restore();
        } catch (Exception unused) {
        }
    }

    public void singleDraw(Canvas canvas, int value) {
        if (this.staticLayout != null) {
            this.paintAya.setAlpha(value);
            this.staticLayout.draw(canvas);
        }
    }

    public void singleDraw(Canvas canvas, int value, float floatValue) {
        if (this.staticLayout != null) {
            canvas.save();
            canvas.translate(floatValue * this.staticLayout.getWidth(), 0.0f);
            this.paintAya.setAlpha(value);
            this.staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public void singleDraw(Canvas canvas) {
        if (this.staticLayout != null) {
            if (this.mPreset == AyaTextPreset.OUTLINE.ordinal() && this.staticLayoutOutline != null) {
                this.paintAyaOutline.setTextSize(this.paintAya.getTextSize());
                this.staticLayoutOutline.draw(canvas);
            }
            this.staticLayout.draw(canvas);
        }
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public boolean isVisible() {
        return this.isVisible;
    }

    public void setTxt(String textValue) {
        this.txt = textValue;
        createStaticLayout();
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public void setVisible(boolean isFlag) {
        this.isVisible = isFlag;
    }

    public float getX() {
        return this.f427x;
    }

    public float getY() {
        return this.f428y;
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public boolean isAnimTest() {
        return super.isAnimTest();
    }

    public void setUnderLine(boolean isFlag) {
        this.paintAya.setUnderlineText(isFlag);
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public void setAnimTest(boolean isFlag) {
        super.setAnimTest(isFlag);
    }
}
