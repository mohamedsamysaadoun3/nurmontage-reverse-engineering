package hazem.nurmontage.videoquran.model;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.VectorDrawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import hazem.nurmontage.videoquran.Utils.EndOfAyaSpan;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.constant.TransitionType;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import java.io.Serializable;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class QuranEntity extends EntityView implements Serializable {
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
    private final TextPaint paintAya;
    private final TextPaint paintAyaOutline;
    private final TextPaint paintAyaTrslOutline;
    private final TextPaint paintTranslationAya;
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
    private WeakReference<TrackEntityView> viewWeakReference;
    private int viewWidth;
    private WeakReference<BlurredImageView> weakBlurredImageView;
    private float x_translation;
    private float padding = 1.0f;
    private float scaleX = 1.0f;

    public int getmPreset() {
        return this.mPreset;
    }

    public void setmPreset(int value) {
        this.mPreset = value;
    }

    public void setIpad_type(int value) {
        this.ipad_type = value;
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
        int size2 = C22051.$SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset[ayaTextPreset.ordinal()];
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

    /* renamed from: hazem.nurmontage.videoquran.model.QuranEntity$1 */
    static /* synthetic */ class C22051 {
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
            if (isTrsl()) {
                applyAyaPreset(this.paintAyaTrslOutline, AyaTextPreset.OUTLINE, this.clrTrsl, this.paintTranslationAya.getTypeface(), this.paintTranslationAya.getTextSize());
                this.staticLayoutTranslationOutline = buildStaticLayout(this.translation, this.paintAyaTrslOutline, this.staticLayoutTranslation.getWidth());
                applyAyaPreset(this.paintTranslationAya, AyaTextPreset.NONE, this.clrTrsl, this.paintTranslationAya.getTypeface(), this.paintTranslationAya.getTextSize());
                return;
            }
            return;
        }
        TextPaint textPaint = this.paintAya;
        applyAyaPreset(textPaint, ayaTextPreset, this.clrAya, textPaint.getTypeface(), this.paintAya.getTextSize());
        if (isTrsl()) {
            TextPaint textPaint2 = this.paintTranslationAya;
            applyAyaPreset(textPaint2, ayaTextPreset, this.clrTrsl, textPaint2.getTypeface(), this.paintTranslationAya.getTextSize());
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
            if (isTrsl()) {
                applyAyaPreset(this.paintAyaTrslOutline, AyaTextPreset.OUTLINE, this.clrTrsl, this.paintTranslationAya.getTypeface(), this.paintTranslationAya.getTextSize());
                this.staticLayoutTranslationOutline = buildStaticLayout(this.translation, this.paintAyaTrslOutline, this.staticLayoutTranslation.getWidth());
                applyAyaPreset(this.paintTranslationAya, AyaTextPreset.NONE, this.clrTrsl, this.paintTranslationAya.getTypeface(), this.paintTranslationAya.getTextSize());
                return;
            }
            return;
        }
        TextPaint textPaint = this.paintAya;
        applyAyaPreset(textPaint, ayaTextPreset, this.clrAya, textPaint.getTypeface(), this.paintAya.getTextSize());
        if (!isTrsl() || this.staticLayoutTranslation == null) {
            return;
        }
        TextPaint textPaint2 = this.paintTranslationAya;
        applyAyaPreset(textPaint2, ayaTextPreset, this.clrTrsl, textPaint2.getTypeface(), this.paintTranslationAya.getTextSize());
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

    public void initPresetTrsl(int value) {
        this.mPreset = value;
        AyaTextPreset ayaTextPreset = get(value);
        if (ayaTextPreset == AyaTextPreset.NONE) {
            return;
        }
        if (ayaTextPreset == AyaTextPreset.OUTLINE) {
            if (isTrsl()) {
                applyAyaPreset(this.paintAyaTrslOutline, AyaTextPreset.OUTLINE, this.clrTrsl, this.paintTranslationAya.getTypeface(), this.paintTranslationAya.getTextSize());
                this.staticLayoutTranslationOutline = buildStaticLayout(this.translation, this.paintAyaTrslOutline, this.staticLayoutTranslation.getWidth());
                applyAyaPreset(this.paintTranslationAya, AyaTextPreset.NONE, this.clrTrsl, this.paintTranslationAya.getTypeface(), this.paintTranslationAya.getTextSize());
                return;
            }
            return;
        }
        if (!isTrsl() || this.staticLayoutTranslation == null) {
            return;
        }
        TextPaint textPaint = this.paintTranslationAya;
        applyAyaPreset(textPaint, ayaTextPreset, this.clrTrsl, textPaint.getTypeface(), this.paintTranslationAya.getTextSize());
    }

    public void setVectorDrawable(VectorDrawable vectorDrawable) {
        this.vectorDrawable = vectorDrawable;
    }

    public void setTranslation(String textValue) {
        this.translation = textValue;
    }

    public String getTranslation() {
        return this.translation;
    }

    public Typeface getTypefaceNumber() {
        return this.typefaceNumber;
    }

    public void setTranslation_complete(String textValue) {
        this.translation_complete = textValue;
    }

    public String getTranslation_complete() {
        return this.translation_complete;
    }

    public void setStartWord_index(int value) {
        this.startWord_index = value;
    }

    public void setEndWord_index(int value) {
        this.endWord_index = value;
    }

    public int getStartWord_index() {
        return this.startWord_index;
    }

    public int getEndWord_index() {
        return this.endWord_index;
    }

    public void setIcon(String textValue) {
        this.icon = textValue;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getViewWidth() {
        return this.viewWidth;
    }

    public void setViewWeakReference(WeakReference<TrackEntityView> weakReference, WeakReference<BlurredImageView> weakReference2) {
        this.viewWeakReference = weakReference;
        this.weakBlurredImageView = weakReference2;
    }

    public int getDuration_fade() {
        return (int) ((Math.abs(getEntityQuran().getRect().right / getEntityQuran().getSecond_in_screen()) - Math.abs(getEntityQuran().getRect().left / getEntityQuran().getSecond_in_screen())) * 0.2f * 1000.0f);
    }

    public VectorDrawable getVectorDrawable() {
        return this.vectorDrawable;
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

    public void setTxt(String textValue) {
        this.txt = textValue;
        SpannableString spannableString = new SpannableString(textValue);
        if (this.number != -1) {
            try {
                int length = textValue.length();
                if (length > this.indexNumber) {
                    spannableString.setSpan(new EndOfAyaSpan(this.vectorDrawable, this.typefaceNumber, "" + this.number), this.indexNumber, length, 0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        if (isTrsl()) {
            this.staticLayoutTranslation = buildStaticLayout(this.translation, this.paintTranslationAya, this.staticLayoutTranslation.getWidth());
            this.f428y = this.rect.centerY() - ((this.staticLayout.getHeight() + this.staticLayoutTranslation.getHeight()) * 0.5f);
            this.x_translation = this.rect.centerX() - (this.staticLayoutTranslation.getWidth() * 0.5f);
        }
    }

    public void setClrAya(int value) {
        this.clrAya = value;
    }

    public void setClrTrsl(int value) {
        this.clrTrsl = value;
    }

    public int getClrAya() {
        return this.clrAya;
    }

    public int getClrTrsl() {
        return this.clrTrsl;
    }

    public TextPaint getPaintAya() {
        return this.paintAya;
    }

    public TextPaint getPaintTranslationAya() {
        return this.paintTranslationAya;
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

    public float calculateOptimalTextSize(int value, int size2) {
        String textValue = this.translation;
        if (textValue == null) {
            return 0.0f;
        }
        return calculateOptimalTextSize(textValue, value, size2, this.paintTranslationAya);
    }

    private boolean isTrsl() {
        return (this.translation == null || getIpad_type() == IpadType.CASSET.ordinal() || getIpad_type() == IpadType.CASSET_IMG.ordinal() || getIpad_type() == IpadType.BOTTOM_RECT.ordinal() || getIpad_type() == IpadType.CASSET_IMG_BLUR.ordinal()) ? false : true;
    }

    public float calculateTextSize() {
        return calculateTextSize(this.txt, this.paintAya, (int) ((this.rect.width() / getFactor_scale()) * 0.85f), (int) (((isTrsl() ? this.rect.height() * 0.5f : this.rect.height()) / getFactor_scale()) * 0.85f));
    }

    public void setTextSize(float floatValue) {
        this.paintAya.setTextSize(floatValue);
    }

    public void setTextSizeInBoucle(float floatValue) {
        this.paintAya.setTextSize(floatValue);
        SpannableString spannableString = new SpannableString(this.txt);
        if (this.number != -1) {
            try {
                int length = this.txt.length();
                if (length > this.indexNumber) {
                    spannableString.setSpan(new EndOfAyaSpan(this.vectorDrawable, this.typefaceNumber, "" + this.number), this.indexNumber, length, 0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
    }

    public void updateTranslation(float floatValue) {
        if (isTrsl()) {
            this.paintTranslationAya.setTextSize(floatValue);
            int value = (int) (this.viewWidth * 0.9f);
            this.staticLayoutTranslation = buildStaticLayout(this.translation, this.paintTranslationAya, value);
            float floatValue2 = value * 0.17f;
            float width = this.staticLayout.getWidth() * 0.4f;
            int lineCount = this.staticLayoutTranslation.getLineCount() - 1;
            while (true) {
                if (this.translation.substring(this.staticLayoutTranslation.getLineStart(lineCount), this.staticLayoutTranslation.getLineEnd(lineCount)).trim().split("\\s+").length >= 2) {
                    break;
                }
                value = (int) (value - floatValue2);
                if (value < width) {
                    this.paintTranslationAya.setTextSize(floatValue);
                    this.staticLayoutTranslation = buildStaticLayout(this.translation, this.paintTranslationAya, this.viewWidth);
                    break;
                }
                this.staticLayoutTranslation = buildStaticLayout(this.translation, this.paintTranslationAya, value);
            }
            this.x_translation = this.rect.centerX() - (this.staticLayoutTranslation.getWidth() * 0.5f);
            this.f428y = this.rect.centerY() - ((this.staticLayout.getHeight() + this.staticLayoutTranslation.getHeight()) * 0.5f);
        }
    }

    public void updateTranslationSave(float floatValue) {
        if (this.translation == null || getIpad_type() == IpadType.CASSET.ordinal() || getIpad_type() == IpadType.CASSET_IMG.ordinal() || getIpad_type() == IpadType.BOTTOM_RECT.ordinal() || getIpad_type() == IpadType.CASSET_IMG_BLUR.ordinal()) {
            return;
        }
        this.paintTranslationAya.setTextSize(floatValue);
        this.staticLayoutTranslation = buildStaticLayout(this.translation, this.paintTranslationAya, (int) (this.viewWidth * 0.9f));
        if (this.staticLayout.getWidth() > this.rect.width()) {
            float width = this.staticLayout.getWidth() * 0.5f;
            this.rect.left = this.rect.centerX() - width;
            this.rect.right = this.rect.centerX() + width;
        }
        if (this.staticLayoutTranslation.getWidth() > this.rect.width()) {
            float width2 = this.staticLayoutTranslation.getWidth() * 0.5f;
            this.rect.left = this.rect.centerX() - width2;
            this.rect.right = this.rect.centerX() + width2;
        }
        if (this.staticLayout.getHeight() > this.rect.height()) {
            float height = this.staticLayout.getHeight() * 0.5f;
            this.rect.top = this.rect.centerY() - height;
            this.rect.bottom = this.rect.centerY() + height;
        }
        if (this.staticLayoutTranslation.getHeight() > this.rect.height()) {
            float height2 = this.staticLayoutTranslation.getHeight() * 0.5f;
            this.rect.top = this.rect.centerY() - height2;
            this.rect.bottom = this.rect.centerY() + height2;
        }
    }

    public void setupScale(float floatValue, int value, int size2) {
        this.paintAya.setTextSize(floatValue * value);
        SpannableString spannableString = new SpannableString(this.txt);
        boolean isFlag = false;
        if (this.number != -1) {
            try {
                int length = this.txt.length();
                if (length > this.indexNumber) {
                    spannableString.setSpan(new EndOfAyaSpan(this.vectorDrawable, this.typefaceNumber, "" + this.number), this.indexNumber, length, 0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.viewWidth = (int) Math.max(this.rect.width(), Math.round(this.paintAya.measureText(spannableString.toString())));
        StaticLayout build = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = build;
        float width = build.getWidth();
        float floatValue2 = width * 0.5f;
        float height = this.rect.height() * (width / this.rect.width()) * 0.5f;
        float centerY = this.rect.centerY();
        float centerX = this.rect.centerX();
        this.rect.set(centerX - floatValue2, centerY - height, centerX + floatValue2, centerY + height);
        if (this.translation != null && this.staticLayoutTranslation != null) {
            isFlag = true;
        }
        if (isFlag && this.txt.length() < 20) {
            this.max_h = Math.round(this.rect.height() * 0.55f);
            this.max_w = Math.round(this.rect.width() * 0.55f);
        } else if (isFlag && value > size2) {
            this.max_h = Math.round(this.rect.height() * 0.64f);
            this.max_w = Math.round(this.rect.width() * 0.64f);
        } else if (isFlag && value == size2) {
            this.max_h = Math.round(this.rect.height() * 0.8f);
            this.max_w = Math.round(this.rect.width() * 0.8f);
        } else {
            this.max_h = Math.round(this.rect.height() * 0.85f);
            this.max_w = Math.round(this.rect.width() * 0.85f);
        }
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
    }

    public void setupScaleSave(float floatValue, int value) {
        float floatValue2 = value;
        this.paintAya.setTextSize(floatValue * floatValue2);
        SpannableString spannableString = new SpannableString(this.txt);
        if (this.number != -1) {
            try {
                int length = this.txt.length();
                if (length > this.indexNumber) {
                    spannableString.setSpan(new EndOfAyaSpan(this.vectorDrawable, this.typefaceNumber, "" + this.number), this.indexNumber, length, 0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.viewWidth = (int) Math.max(this.rect.width(), Math.round(this.paintAya.measureText(spannableString.toString())));
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.max_h = Math.round(this.rect.height() * 0.85f);
        this.max_w = Math.round(this.rect.width() * 0.85f);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        if (this.translation != null) {
            updateTranslationSave(getFactorSizeTrl() * floatValue2);
            if (this.staticLayoutTranslation != null) {
                this.x_translation = this.rect.centerX() - (this.staticLayoutTranslation.getWidth() * 0.5f);
                this.f428y = this.rect.centerY() - ((this.staticLayout.getHeight() + this.staticLayoutTranslation.getHeight()) * 0.5f);
                return;
            }
        }
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public void scale(float floatValue, int value, int size2) {
        setFactor_scale(floatValue);
        float width = this.rect.width() * floatValue;
        float height = this.rect.height() * floatValue;
        float floatValue2 = width * 0.5f;
        this.rect.left = this.rect.centerX() - floatValue2;
        this.rect.right = this.rect.centerX() + floatValue2;
        float f3 = height * 0.5f;
        this.rect.top = this.rect.centerY() - f3;
        this.rect.bottom = this.rect.centerY() + f3;
        boolean isFlag = (this.translation == null || this.staticLayoutTranslation == null) ? false : true;
        this.viewWidth = (int) this.rect.width();
        this.paintAya.setTextSize(calculateTextSize());
        createStaticLayout();
        float f4 = value;
        setFcSize(this.paintAya.getTextSize() / f4);
        if (isFlag) {
            setTls();
            setFactorSizeTrl(this.paintTranslationAya.getTextSize() / f4);
        }
        initPreset(getmPreset());
    }

    private void setTls() {
        updateTranslation(calculateOptimalTextSize((int) (getRect().width() * 0.85f), (int) (getRect().height() * 0.5f * 0.83f)));
    }

    public void applyAll(int value, RectF rectF, float floatValue, float floatValue2, QuranEntity quranEntity) {
        this.paintAya.setTextSize(floatValue);
        SpannableString spannableString = new SpannableString(this.txt);
        boolean isFlag = false;
        if (this.number != -1) {
            try {
                int length = this.txt.length();
                if (length > this.indexNumber) {
                    spannableString.setSpan(new EndOfAyaSpan(this.vectorDrawable, this.typefaceNumber, "" + this.number), this.indexNumber, length, 0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
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
        if (this.translation != null && this.staticLayoutTranslation != null) {
            isFlag = true;
        }
        this.max_h = Math.round(this.rect.height() * 0.85f);
        this.max_w = Math.round(this.rect.width() * 0.85f);
        if (isFlag) {
            this.paintTranslationAya.setTextSize(quranEntity.getPaintTranslationAya().getTextSize());
            this.staticLayoutTranslation = buildStaticLayout(this.translation, this.paintTranslationAya, (int) (this.viewWidth * 0.9f));
            setFactorSizeTrl(this.paintTranslationAya.getTextSize() / value);
        }
        initPreset(getmPreset());
    }

    public void applyAll(int value, RectF rectF, float floatValue, float floatValue2) {
        this.paintAya.setTextSize(floatValue);
        SpannableString spannableString = new SpannableString(this.txt);
        boolean isFlag = false;
        if (this.number != -1) {
            try {
                int length = this.txt.length();
                if (length > this.indexNumber) {
                    spannableString.setSpan(new EndOfAyaSpan(this.vectorDrawable, this.typefaceNumber, "" + this.number), this.indexNumber, length, 0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
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
        if (this.translation != null && this.staticLayoutTranslation != null) {
            isFlag = true;
        }
        this.max_h = Math.round(this.rect.height() * 0.85f);
        this.max_w = Math.round(this.rect.width() * 0.85f);
        if (isFlag) {
            updateTranslation(calculateOptimalTextSize((int) (getRect().width() * 0.85f), (int) (getRect().height() * 0.5f * 0.83f)));
            setFactorSizeTrl(this.paintTranslationAya.getTextSize() / value);
        }
        initPreset(getmPreset());
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public void postTranslate(float floatValue, float floatValue2) {
        this.rect.offset(floatValue, floatValue2);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        if (isTrsl() && this.staticLayoutTranslation != null) {
            this.x_translation = this.rect.centerX() - (this.staticLayoutTranslation.getWidth() * 0.5f);
            this.f428y = this.rect.centerY() - ((this.staticLayout.getHeight() + this.staticLayoutTranslation.getHeight()) * 0.5f);
        } else {
            this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
        }
    }

    public void setTranslate(float floatValue, float floatValue2) {
        float width = this.rect.width() * 0.5f;
        float height = this.rect.height() * 0.5f;
        this.rect.left = floatValue - width;
        this.rect.right = floatValue + width;
        this.rect.top = floatValue2 - height;
        this.rect.bottom = floatValue2 + height;
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        if (this.translation != null && this.staticLayoutTranslation != null) {
            this.x_translation = this.rect.centerX() - (this.staticLayoutTranslation.getWidth() * 0.5f);
            this.f428y = this.rect.centerY() - ((this.staticLayout.getHeight() + this.staticLayoutTranslation.getHeight()) * 0.5f);
        } else {
            this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
        }
    }

    public float getWidth() {
        this.paintAya.setTextSize(3.0f);
        return this.paintAya.measureText(this.txt);
    }

    public float getTranslationWidth() {
        this.paintTranslationAya.setTextSize(3.0f);
        return this.paintTranslationAya.measureText(this.translation);
    }

    public void createStaticLayout() {
        float floatValue;
        SpannableString spannableString = new SpannableString(this.txt);
        if (this.number != -1) {
            try {
                int length = this.txt.length();
                if (length > this.indexNumber) {
                    spannableString.setSpan(new EndOfAyaSpan(this.vectorDrawable, this.typefaceNumber, "" + this.number), this.indexNumber, length, 0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        if (this.translation != null && getIpad_type() != IpadType.BOTTOM_RECT.ordinal() && getIpad_type() != IpadType.CASSET.ordinal() && getIpad_type() != IpadType.CASSET_IMG.ordinal() && getIpad_type() != IpadType.CASSET_IMG_BLUR.ordinal()) {
            if (getIpad_type() == IpadType.IPAD_NEOMORPHIC.ordinal()) {
                floatValue = 2.0f;
            } else {
                floatValue = (getIpad_type() == IpadType.MASK_BRUSH.ordinal() || getIpad_type() == IpadType.BLUE_TYPE.ordinal() || getIpad_type() == IpadType.HEART.ordinal() || getIpad_type() == IpadType.BATTERY.ordinal() || getIpad_type() == IpadType.BLACK_LAYER.ordinal() || getIpad_type() == IpadType.GRADIENT.ordinal()) ? 0.45f : 1.2f;
            }
            this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
            this.paintTranslationAya.setTextSize(calculateOptimalTextSize(this.translation, (int) (this.viewWidth * 0.85f), (int) (this.rect.height() - (this.staticLayout.getHeight() * floatValue)), this.paintTranslationAya));
            int value = this.viewWidth;
            StaticLayout buildStaticLayout = buildStaticLayout(this.translation, this.paintTranslationAya, value);
            this.staticLayoutTranslation = buildStaticLayout;
            if (buildStaticLayout.getLineCount() == 2) {
                int lineCount = this.staticLayoutTranslation.getLineCount() - 1;
                while (this.translation.substring(this.staticLayoutTranslation.getLineStart(lineCount), this.staticLayoutTranslation.getLineEnd(lineCount)).trim().split("\\s+").length < 3 && value - 10 >= 10) {
                    this.staticLayoutTranslation = buildStaticLayout(this.translation, this.paintTranslationAya, value);
                }
                this.x_translation = this.rect.centerX() - (this.staticLayoutTranslation.getWidth() * 0.5f);
            } else {
                this.x_translation = this.f427x;
            }
            this.f428y = this.rect.centerY() - ((this.staticLayout.getHeight() + this.staticLayoutTranslation.getHeight()) * 0.5f);
        } else {
            this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
        }
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
    }

    private StaticLayout buildStaticLayout(String textValue, TextPaint textPaint, int value) {
        return StaticLayout.Builder.obtain(textValue, 0, textValue.length(), textPaint, value).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    public void setStaticLayout() {
        SpannableString spannableString = new SpannableString(this.txt);
        if (this.number != -1) {
            try {
                int length = this.txt.length();
                if (length > this.indexNumber) {
                    spannableString.setSpan(new EndOfAyaSpan(this.vectorDrawable, this.typefaceNumber, "" + this.number), this.indexNumber, length, 0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        if (this.translation != null && getIpad_type() != IpadType.BOTTOM_RECT.ordinal() && getIpad_type() != IpadType.CASSET.ordinal() && getIpad_type() != IpadType.CASSET_IMG.ordinal() && getIpad_type() != IpadType.CASSET_IMG_BLUR.ordinal()) {
            int value = this.viewWidth;
            StaticLayout buildStaticLayout = buildStaticLayout(this.translation, this.paintTranslationAya, value);
            this.staticLayoutTranslation = buildStaticLayout;
            if (buildStaticLayout.getLineCount() == 2) {
                int lineCount = this.staticLayoutTranslation.getLineCount() - 1;
                while (this.translation.substring(this.staticLayoutTranslation.getLineStart(lineCount), this.staticLayoutTranslation.getLineEnd(lineCount)).trim().split("\\s+").length < 3 && value - 10 >= 10) {
                    this.staticLayoutTranslation = buildStaticLayout(this.translation, this.paintTranslationAya, value);
                }
                this.x_translation = this.rect.centerX() - (this.staticLayoutTranslation.getWidth() * 0.5f);
            } else {
                this.x_translation = this.f427x;
            }
            this.f428y = this.rect.centerY() - ((this.staticLayout.getHeight() + this.staticLayoutTranslation.getHeight()) * 0.5f);
            return;
        }
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
    }

    public void updateIconDraw() {
        SpannableString spannableString = new SpannableString(this.txt);
        if (this.number != -1) {
            try {
                int length = this.txt.length();
                if (length > this.indexNumber) {
                    spannableString.setSpan(new EndOfAyaSpan(this.vectorDrawable, this.typefaceNumber, "" + this.number), this.indexNumber, length, 0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    private StaticLayout getStaticLayoutOutline() {
        SpannableString spannableString = new SpannableString(this.txt);
        if (this.number != -1) {
            try {
                int length = this.txt.length();
                if (length > this.indexNumber) {
                    spannableString.setSpan(new EndOfAyaSpan(this.vectorDrawable, this.typefaceNumber, "" + this.number), this.indexNumber, length, 0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAyaOutline, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    public void updateStaticLayout() {
        SpannableString spannableString = this.spannableString;
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        if (this.translation == null || getIpad_type() == IpadType.BOTTOM_RECT.ordinal() || getIpad_type() == IpadType.CASSET.ordinal() || getIpad_type() == IpadType.CASSET_IMG.ordinal() || getIpad_type() == IpadType.CASSET_IMG_BLUR.ordinal()) {
            return;
        }
        int value = this.viewWidth;
        StaticLayout buildStaticLayout = buildStaticLayout(this.translation, this.paintTranslationAya, value);
        this.staticLayoutTranslation = buildStaticLayout;
        if (buildStaticLayout.getLineCount() == 2) {
            int lineCount = this.staticLayoutTranslation.getLineCount() - 1;
            while (this.translation.substring(this.staticLayoutTranslation.getLineStart(lineCount), this.staticLayoutTranslation.getLineEnd(lineCount)).trim().split("\\s+").length < 3 && value - 10 >= 10) {
                this.staticLayoutTranslation = buildStaticLayout(this.translation, this.paintTranslationAya, value);
            }
            this.x_translation = this.rect.centerX() - (this.staticLayoutTranslation.getWidth() * 0.5f);
            return;
        }
        this.x_translation = this.f427x;
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
        this.paintTranslationAya.setAlpha(this.paintAya.getAlpha());
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
        this.paintTranslationAya.setAlpha(this.paintAya.getAlpha());
        this.paintAyaTrslOutline.setAlpha(this.paintAya.getAlpha());
        this.paintAyaOutline.setAlpha(this.paintAya.getAlpha());
    }

    public void setSlideX(float floatValue) {
        WeakReference<BlurredImageView> weakReference;
        this.offsetX = floatValue;
        this.paintAya.setAlpha(Math.round((1.0f - Math.abs(floatValue)) * 255.0f));
        this.paintTranslationAya.setAlpha(this.paintAya.getAlpha());
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
        this.paintTranslationAya.setAlpha(this.paintAya.getAlpha());
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

    public QuranEntity(Context context, String textValue, String str2, String str3, String str4, RectF rectF, Typeface typeface, Typeface typeface2, int value, int size2, Typeface typeface3, int value3, int value4, String textValue5, boolean isFlag, int value5) {
        this.nameFont = Common.FONT_QURAN;
        TextPaint textPaint = new TextPaint(1);
        this.paintAya = textPaint;
        this.paintAyaOutline = new TextPaint(1);
        this.paintAyaTrslOutline = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(1);
        this.paintTranslationAya = textPaint2;
        this.txt = textValue;
        this.complete_aya = str2;
        if (str2 == null || str2.isEmpty()) {
            this.complete_aya = textValue;
        }
        this.translation = str3;
        this.translation_complete = str4;
        this.nameFont = textValue5;
        this.indexNumber = value;
        this.number = size2;
        this.typefaceNumber = typeface3;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        setVisible(true);
        this.viewWidth = (int) rectF.width();
        textPaint.setTypeface(typeface);
        textPaint.setColor(value3);
        textPaint.setTextSize(0.05f);
        textPaint2.setTextSize(0.05f);
        textPaint2.setColor(value4);
        textPaint2.setTypeface(typeface2);
        setClrAya(value3);
        setClrTrsl(value4);
        this.vectorDrawable = (VectorDrawable) ContextCompat.getDrawable(context, value5);
        this.max_h = (int) (this.rect.height() * 0.85f);
        this.max_w = (int) (this.rect.width() * 0.85f);
    }

    public QuranEntity(Context context, int value, String textValue, String str2, String str3, String str4, RectF rectF, Typeface typeface, Typeface typeface2, int size2, int value3, Typeface typeface3, int value4, int value5, String textValue5, boolean isFlag) {
        this.nameFont = Common.FONT_QURAN;
        TextPaint textPaint = new TextPaint(1);
        this.paintAya = textPaint;
        this.paintAyaOutline = new TextPaint(1);
        this.paintAyaTrslOutline = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(1);
        this.paintTranslationAya = textPaint2;
        this.txt = textValue;
        this.translation = str3;
        this.translation_complete = str4;
        this.complete_aya = str2;
        if (str2 == null || str2.isEmpty()) {
            this.complete_aya = textValue;
        }
        this.nameFont = textValue5;
        this.indexNumber = size2;
        this.number = value3;
        this.typefaceNumber = typeface3;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        setVisible(true);
        this.viewWidth = (int) rectF.width();
        textPaint.setTypeface(typeface);
        textPaint.setColor(value4);
        textPaint.setTextSize(0.05f);
        textPaint2.setTextSize(0.05f);
        textPaint2.setColor(value5);
        textPaint2.setTypeface(typeface2);
        setClrAya(value4);
        setClrTrsl(value5);
        this.vectorDrawable = (VectorDrawable) ContextCompat.getDrawable(context, value);
        this.max_h = (int) (this.rect.height() * 0.85f);
        this.max_w = (int) (this.rect.width() * 0.85f);
    }

    public QuranEntity(String textValue, String str2, String str3, String str4, RectF rectF, Typeface typeface, Typeface typeface2, int value, int size2, Typeface typeface3, int value3, int value4, String textValue5, float floatValue, boolean isFlag, VectorDrawable vectorDrawable) {
        this.nameFont = Common.FONT_QURAN;
        TextPaint textPaint = new TextPaint(1);
        this.paintAya = textPaint;
        this.paintAyaOutline = new TextPaint(1);
        this.paintAyaTrslOutline = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(1);
        this.paintTranslationAya = textPaint2;
        this.txt = textValue;
        this.translation = str3;
        this.translation_complete = str4;
        this.complete_aya = str2;
        this.nameFont = textValue5;
        this.indexNumber = value;
        this.number = size2;
        this.typefaceNumber = typeface3;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        setVisible(true);
        this.viewWidth = (int) rectF.width();
        textPaint.setTypeface(typeface);
        textPaint.setColor(value3);
        textPaint.setTextSize(floatValue);
        textPaint2.setTextSize(0.05f);
        textPaint2.setTypeface(typeface2);
        textPaint2.setColor(value4);
        this.vectorDrawable = vectorDrawable;
        this.max_h = (int) (this.rect.height() * 0.85f);
        this.max_w = (int) (this.rect.width() * 0.85f);
    }

    public QuranEntity(String textValue, String str2, String str3, String str4, RectF rectF, Typeface typeface, Typeface typeface2, int value, int size2, Typeface typeface3, int value3, int value4, String textValue5, float floatValue, float floatValue2, boolean isFlag, VectorDrawable vectorDrawable) {
        this.nameFont = Common.FONT_QURAN;
        TextPaint textPaint = new TextPaint(1);
        this.paintAya = textPaint;
        this.paintAyaOutline = new TextPaint(1);
        this.paintAyaTrslOutline = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(1);
        this.paintTranslationAya = textPaint2;
        this.txt = textValue;
        this.translation = str3;
        this.translation_complete = str4;
        this.complete_aya = str2;
        this.nameFont = textValue5;
        this.indexNumber = value;
        this.number = size2;
        this.typefaceNumber = typeface3;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        setVisible(true);
        this.viewWidth = (int) rectF.width();
        textPaint.setTypeface(typeface);
        textPaint.setColor(value3);
        textPaint.setTextSize(floatValue);
        textPaint2.setTextSize(floatValue2);
        textPaint2.setTypeface(typeface2);
        textPaint2.setColor(value4);
        this.vectorDrawable = vectorDrawable;
        this.max_h = (int) (this.rect.height() * 0.85f);
        this.max_w = (int) (this.rect.width() * 0.85f);
    }

    public int getIndexNumber() {
        return this.indexNumber;
    }

    public void setIndexNumber(int value) {
        this.indexNumber = value;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int value) {
        this.number = value;
    }

    public void update(RectF rectF, int value, int size2) {
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
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

    public void setColorTranslation(int value) {
        setClrTrsl(value);
        TextPaint textPaint = this.paintTranslationAya;
        if (textPaint != null) {
            textPaint.setColor(value);
        }
    }

    public void draw(Canvas canvas) {
        if (this.staticLayout != null) {
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
            if (this.translation == null || this.staticLayoutTranslation == null || getIpad_type() == IpadType.BOTTOM_RECT.ordinal() || getIpad_type() == IpadType.CASSET.ordinal() || getIpad_type() == IpadType.CASSET_IMG.ordinal() || getIpad_type() == IpadType.CASSET_IMG_BLUR.ordinal()) {
                return;
            }
            canvas.save();
            canvas.translate(this.x_translation + (this.offsetX * this.staticLayout.getWidth()), this.f428y + (this.staticLayout.getHeight() * this.padding));
            float floatValue2 = this.scaleX;
            canvas.scale(floatValue2, floatValue2);
            if (this.mPreset == AyaTextPreset.OUTLINE.ordinal() && this.staticLayoutTranslationOutline != null) {
                this.paintAyaTrslOutline.setTextSize(this.paintTranslationAya.getTextSize());
                this.staticLayoutTranslationOutline.draw(canvas);
            }
            this.staticLayoutTranslation.draw(canvas);
            canvas.restore();
        }
    }

    public void setupCanvasDraw(Canvas canvas) {
        if (this.translation != null && this.staticLayoutTranslation != null && getIpad_type() != IpadType.BOTTOM_RECT.ordinal() && getIpad_type() != IpadType.CASSET.ordinal() && getIpad_type() != IpadType.CASSET_IMG.ordinal() && getIpad_type() != IpadType.CASSET_IMG_BLUR.ordinal()) {
            this.f428y = ((canvas.getHeight() - this.staticLayout.getHeight()) - this.staticLayoutTranslation.getHeight()) * 0.5f;
            this.x_translation = (canvas.getWidth() - this.staticLayoutTranslation.getWidth()) * 0.5f;
        } else {
            this.f428y = (canvas.getHeight() - this.staticLayout.getHeight()) * 0.5f;
        }
        this.f427x = (canvas.getWidth() - this.staticLayout.getWidth()) * 0.5f;
        canvas.save();
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
            if (this.translation == null || this.staticLayoutTranslation == null || getIpad_type() == IpadType.BOTTOM_RECT.ordinal() || getIpad_type() == IpadType.CASSET.ordinal() || getIpad_type() == IpadType.CASSET_IMG.ordinal() || getIpad_type() == IpadType.CASSET_IMG_BLUR.ordinal()) {
                return;
            }
            canvas.save();
            canvas.translate((-this.f427x) + this.x_translation, this.staticLayout.getHeight() * this.padding);
            this.paintTranslationAya.setAlpha(value);
            this.staticLayoutTranslation.draw(canvas);
            canvas.restore();
        }
    }

    public void singleDraw(Canvas canvas, int value, float floatValue) {
        if (this.staticLayout != null) {
            canvas.save();
            canvas.translate(this.staticLayout.getWidth() * floatValue, 0.0f);
            this.paintAya.setAlpha(value);
            this.staticLayout.draw(canvas);
            canvas.restore();
            if (this.translation == null || this.staticLayoutTranslation == null || getIpad_type() == IpadType.BOTTOM_RECT.ordinal() || getIpad_type() == IpadType.CASSET.ordinal() || getIpad_type() == IpadType.CASSET_IMG.ordinal() || getIpad_type() == IpadType.CASSET_IMG_BLUR.ordinal()) {
                return;
            }
            canvas.save();
            canvas.translate((-this.f427x) + this.x_translation, this.staticLayout.getHeight() * this.padding);
            canvas.translate(floatValue * this.staticLayout.getWidth(), 0.0f);
            this.paintTranslationAya.setAlpha(value);
            this.staticLayoutTranslation.draw(canvas);
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
            if (this.translation == null || this.staticLayoutTranslation == null || getIpad_type() == IpadType.BOTTOM_RECT.ordinal() || getIpad_type() == IpadType.CASSET.ordinal() || getIpad_type() == IpadType.CASSET_IMG.ordinal() || getIpad_type() == IpadType.CASSET_IMG_BLUR.ordinal()) {
                return;
            }
            canvas.save();
            canvas.translate((-this.f427x) + this.x_translation, this.staticLayout.getHeight() * this.padding);
            if (this.mPreset == AyaTextPreset.OUTLINE.ordinal() && this.staticLayoutTranslationOutline != null) {
                this.paintAyaTrslOutline.setTextSize(this.paintTranslationAya.getTextSize());
                this.staticLayoutTranslationOutline.draw(canvas);
            }
            this.staticLayoutTranslation.draw(canvas);
            canvas.restore();
        }
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public boolean isVisible() {
        return this.isVisible;
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

    public String getTxt() {
        return this.txt;
    }

    public String getComplete_aya() {
        return this.complete_aya;
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
