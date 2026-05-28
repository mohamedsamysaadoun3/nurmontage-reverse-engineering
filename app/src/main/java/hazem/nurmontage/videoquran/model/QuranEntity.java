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

    public void setmPreset(int resourceId) {
        this.mPreset = resourceId;
    }

    public void setIpad_type(int resourceId) {
        this.ipad_type = value;
    }

    public int getIpad_type() {
        return this.ipad_type;
    }

    public void applyAyaPreset(Paint paint, AyaTextPreset ayaTextPreset, int ayaNumber, Typeface typeface, float textSize) {
        paint.reset();
        paint.setTypeface(typeface);
        paint.setTextSize(textSize);
        paint.setAntiAlias(true);
        paint.setSubpixelText(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(ayaNumber);
        if (paint == this.paintAyaTrslOutline) {
            textSize *= 1.35f;
        }
        int size2 = C22051.$SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset[ayaTextPreset.ordinal()];
        if (size2 != 2) {
            if (size2 != 3) {
                if (size2 != 4) {
                    return;
                }
                paint.setShadowLayer(textSize * 0.45f, 0.0f, 0.0f, ColorUtils.setAlphaComponent(ayaNumber, 255));
                return;
            } else {
                float lineSpacing = 0.18f * textSize;
                float alphaValue = textSize * 0.08f;
                paint.setShadowLayer(lineSpacing, alphaValue, alphaValue, ColorUtils.setAlphaComponent((this.ipad_type == IpadType.HEART.ordinal() || this.ipad_type == IpadType.BATTERY.ordinal() || this.ipad_type == IpadType.BLUE_TYPE.ordinal()) ? -1 : ViewCompat.MEASURED_STATE_MASK, 120));
                return;
            }
        }
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(textSize * 0.12f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        if (this.ipad_type == IpadType.HEART.ordinal() || this.ipad_type == IpadType.BATTERY.ordinal() || this.ipad_type == IpadType.BLUE_TYPE.ordinal()) {
            paint.setColor(hazem.nurmontage.videoquran.Utils.ColorUtils.lightenColor(ayaNumber, 0.85f));
        } else {
            paint.setColor(hazem.nurmontage.videoquran.Utils.ColorUtils.darkenColor(ayaNumber, 0.85f));
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

    public AyaTextPreset get(int ayaNumber) {
        if (ayaNumber == AyaTextPreset.SHADOW.ordinal()) {
            return AyaTextPreset.SHADOW;
        }
        if (ayaNumber == AyaTextPreset.OUTLINE.ordinal()) {
            return AyaTextPreset.OUTLINE;
        }
        if (ayaNumber == AyaTextPreset.GLOW.ordinal()) {
            return AyaTextPreset.GLOW;
        }
        return AyaTextPreset.NONE;
    }

    public void initPreset(int ayaNumber) {
        this.mPreset = ayaNumber;
        AyaTextPreset ayaTextPreset = get(ayaNumber);
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

    public void initPresetAya(int ayaNumber) {
        this.mPreset = ayaNumber;
        AyaTextPreset ayaTextPreset = get(ayaNumber);
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

    public void initPresetTrsl(int ayaNumber) {
        this.mPreset = ayaNumber;
        AyaTextPreset ayaTextPreset = get(ayaNumber);
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

    public void setStartWord_index(int resourceId) {
        this.startWord_index = resourceId;
    }

    public void setEndWord_index(int resourceId) {
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

    public void setIndex(int resourceId) {
        this.index = resourceId;
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

    public void setClrAya(int ayaNumber) {
        this.clrAya = resourceId;
    }

    public void setClrTrsl(int resourceId) {
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

    public float calculateTextSize(String textValue, Paint paint, int counter, int size2) {
        float textSize = 0.0f;
        if (textValue != null && !textValue.isEmpty() && counter > 0 && size2 > 0) {
            paint.setTextSize(1.0f);
            Rect rect = new Rect();
            paint.getTextBounds(textValue, 0, textValue.length(), rect);
            rect.width();
            rect.height();
            float lineSpacing = 1000.0f;
            for (int counter50 = 0; counter50 < 100; counter50++) {
                float widthRatio = (textSize + lineSpacing) / 2.0f;
                paint.setTextSize(widthRatio);
                paint.getTextBounds(textValue, 0, textValue.length(), rect);
                float width = rect.width();
                float height = rect.height();
                if (width > counter || height > size2) {
                    lineSpacing = widthRatio;
                } else {
                    textSize = widthRatio;
                }
            }
        }
        return textSize;
    }

    public float calculateOptimalTextSize(String textValue, int count, int size2, TextPaint textPaint) {
        float textSize = 5.0f;
        float lineSpacing = 1000.0f;
        float widthRatio = 5.0f;
        while (textSize <= lineSpacing) {
            float widthRatio53 = (textSize + lineSpacing) / 2.0f;
            textPaint.setTextSize(widthRatio53);
            StaticLayout build = StaticLayout.Builder.obtain(textValue, 0, textValue.length(), textPaint, count).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
            float height = build.getHeight();
            float maxLineWidth = getMaxLineWidth(build);
            if (height > size2 || maxLineWidth > count) {
                lineSpacing = f4 - 0.03f;
            } else {
                f3 = f4;
                textSize = 0.03f + f4;
            }
        }
        return f3;
    }

    private float getMaxLineWidth(StaticLayout staticLayout) {
        float textSize = 0.0f;
        for (int width = 0; value < staticLayout.getLineCount(); count++) {
            textSize = Math.max(textSize, staticLayout.getLineWidth(count));
        }
        return textSize;
    }

    public float calculateOptimalTextSize(int count, int size2) {
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

    public void setTextSize(float textSize) {
        this.paintAya.setTextSize(textSize);
    }

    public void setTextSizeInBoucle(float textSize) {
        this.paintAya.setTextSize(textSize);
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

    public void updateTranslation(float textSize) {
        if (isTrsl()) {
            this.paintTranslationAya.setTextSize(textSize);
            int count = (int) (this.viewWidth * 0.9f);
            this.staticLayoutTranslation = buildStaticLayout(this.translation, this.paintTranslationAya, count);
            float lineSpacing = count * 0.17f;
            float width = this.staticLayout.getWidth() * 0.4f;
            int lineCount = this.staticLayoutTranslation.getLineCount() - 1;
            while (true) {
                if (this.translation.substring(this.staticLayoutTranslation.getLineStart(lineCount), this.staticLayoutTranslation.getLineEnd(lineCount)).trim().split("\\s+").length >= 2) {
                    break;
                }
                count = (int) (count - lineSpacing);
                if (count < width) {
                    this.paintTranslationAya.setTextSize(textSize);
                    this.staticLayoutTranslation = buildStaticLayout(this.translation, this.paintTranslationAya, this.viewWidth);
                    break;
                }
                this.staticLayoutTranslation = buildStaticLayout(this.translation, this.paintTranslationAya, count);
            }
            this.x_translation = this.rect.centerX() - (this.staticLayoutTranslation.getWidth() * 0.5f);
            this.f428y = this.rect.centerY() - ((this.staticLayout.getHeight() + this.staticLayoutTranslation.getHeight()) * 0.5f);
        }
    }

    public void updateTranslationSave(float textSize) {
        if (this.translation == null || getIpad_type() == IpadType.CASSET.ordinal() || getIpad_type() == IpadType.CASSET_IMG.ordinal() || getIpad_type() == IpadType.BOTTOM_RECT.ordinal() || getIpad_type() == IpadType.CASSET_IMG_BLUR.ordinal()) {
            return;
        }
        this.paintTranslationAya.setTextSize(textSize);
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

    public void setupScale(float textSize, int index, int size2) {
        this.paintAya.setTextSize(textSize * index);
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
        float lineSpacing = width * 0.5f;
        float height = this.rect.height() * (width / this.rect.width()) * 0.5f;
        float centerY = this.rect.centerY();
        float centerX = this.rect.centerX();
        this.rect.set(centerX - lineSpacing, centerY - height, centerX + lineSpacing, centerY + height);
        if (this.translation != null && this.staticLayoutTranslation != null) {
            isFlag = true;
        }
        if (isFlag && this.txt.length() < 20) {
            this.max_h = Math.round(this.rect.height() * 0.55f);
            this.max_w = Math.round(this.rect.width() * 0.55f);
        } else if (isFlag && index > size2) {
            this.max_h = Math.round(this.rect.height() * 0.64f);
            this.max_w = Math.round(this.rect.width() * 0.64f);
        } else if (isFlag && index == size2) {
            this.max_h = Math.round(this.rect.height() * 0.8f);
            this.max_w = Math.round(this.rect.width() * 0.8f);
        } else {
            this.max_h = Math.round(this.rect.height() * 0.85f);
            this.max_w = Math.round(this.rect.width() * 0.85f);
        }
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
    }

    public void setupScaleSave(float textSize, int count) {
        float lineSpacing = count;
        this.paintAya.setTextSize(textSize * lineSpacing);
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
            updateTranslationSave(getFactorSizeTrl() * lineSpacing);
            if (this.staticLayoutTranslation != null) {
                this.x_translation = this.rect.centerX() - (this.staticLayoutTranslation.getWidth() * 0.5f);
                this.f428y = this.rect.centerY() - ((this.staticLayout.getHeight() + this.staticLayoutTranslation.getHeight()) * 0.5f);
                return;
            }
        }
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public void scale(float textSize, int ayaNumber, int size2) {
        setFactor_scale(textSize);
        float width = this.rect.width() * textSize;
        float height = this.rect.height() * textSize;
        float lineSpacing = width * 0.5f;
        this.rect.left = this.rect.centerX() - lineSpacing;
        this.rect.right = this.rect.centerX() + lineSpacing;
        float scaleFactor = height * 0.5f;
        this.rect.top = this.rect.centerY() - scaleFactor;
        this.rect.bottom = this.rect.centerY() + scaleFactor;
        boolean isFlag = (this.translation == null || this.staticLayoutTranslation == null) ? false : true;
        this.viewWidth = (int) this.rect.width();
        this.paintAya.setTextSize(calculateTextSize());
        createStaticLayout();
        float widthRatio = ayaNumber;
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

    public void applyAll(int index, RectF rectF, float textSize, float lineSpacing, QuranEntity quranEntity) {
        this.paintAya.setTextSize(textSize);
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
        setFcSize(lineSpacing);
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
            setFactorSizeTrl(this.paintTranslationAya.getTextSize() / index);
        }
        initPreset(getmPreset());
    }

    public void applyAll(int index, RectF rectF, float textSize, float lineSpacing) {
        this.paintAya.setTextSize(textSize);
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
        setFcSize(lineSpacing);
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
    public void postTranslate(float textSize, float lineSpacing) {
        this.rect.offset(textSize, lineSpacing);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        if (isTrsl() && this.staticLayoutTranslation != null) {
            this.x_translation = this.rect.centerX() - (this.staticLayoutTranslation.getWidth() * 0.5f);
            this.f428y = this.rect.centerY() - ((this.staticLayout.getHeight() + this.staticLayoutTranslation.getHeight()) * 0.5f);
        } else {
            this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
        }
    }

    public void setTranslate(float textSize, float lineSpacing) {
        float width = this.rect.width() * 0.5f;
        float height = this.rect.height() * 0.5f;
        this.rect.left = textSize - width;
        this.rect.right = textSize + width;
        this.rect.top = lineSpacing - height;
        this.rect.bottom = lineSpacing + height;
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
        float textSize;
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
                textSize = 2.0f;
            } else {
                textSize = (getIpad_type() == IpadType.MASK_BRUSH.ordinal() || getIpad_type() == IpadType.BLUE_TYPE.ordinal() || getIpad_type() == IpadType.HEART.ordinal() || getIpad_type() == IpadType.BATTERY.ordinal() || getIpad_type() == IpadType.BLACK_LAYER.ordinal() || getIpad_type() == IpadType.GRADIENT.ordinal()) ? 0.45f : 1.2f;
            }
            this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
            this.paintTranslationAya.setTextSize(calculateOptimalTextSize(this.translation, (int) (this.viewWidth * 0.85f), (int) (this.rect.height() - (this.staticLayout.getHeight() * textSize)), this.paintTranslationAya));
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

    private StaticLayout buildStaticLayout(String textValue, TextPaint textPaint, int width) {
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

    public void setOpacityFade(int index) {
        this.paintAya.setAlpha(index);
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

    public void setSlideX(float textSize) {
        WeakReference<BlurredImageView> weakReference;
        this.offsetX = textSize;
        this.paintAya.setAlpha(Math.round((1.0f - Math.abs(textSize)) * 255.0f));
        this.paintTranslationAya.setAlpha(this.paintAya.getAlpha());
        this.paintAyaTrslOutline.setAlpha(this.paintAya.getAlpha());
        this.paintAyaOutline.setAlpha(this.paintAya.getAlpha());
        if (!isAnimTest() || (weakReference = this.weakBlurredImageView) == null) {
            return;
        }
        weakReference.get().invalidate();
    }

    public void setSlideXOut(float textSize) {
        WeakReference<BlurredImageView> weakReference;
        this.offsetX = textSize;
        this.paintAya.setAlpha(Math.round((1.0f - Math.abs(textSize)) * 255.0f));
        this.paintTranslationAya.setAlpha(this.paintAya.getAlpha());
        this.paintAyaTrslOutline.setAlpha(this.paintAya.getAlpha());
        this.paintAyaOutline.setAlpha(this.paintAya.getAlpha());
        if (!isAnimTest() || (weakReference = this.weakBlurredImageView) == null) {
            return;
        }
        weakReference.get().invalidate();
    }

    public void setFactorSize(float textSize) {
        WeakReference<BlurredImageView> weakReference;
        this.scaleX = textSize;
        if (!isAnimTest() || (weakReference = this.weakBlurredImageView) == null) {
            return;
        }
        weakReference.get().invalidate();
    }

    public void slidToLeft(int index, boolean isFlag) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "SlideX", 1.0f, 0.0f);
        this.otherAnimation = ofFloat;
        ofFloat.setDuration(count);
        if (isFlag) {
            this.otherAnimation.setRepeatMode(1);
            this.otherAnimation.setRepeatCount(-1);
        }
        this.otherAnimation.start();
    }

    public void slidToRightOut(int count, boolean isFlag) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "SlideXOut", 0.0f, 1.0f);
        this.otherAnimation = ofFloat;
        ofFloat.setDuration(count);
        if (isFlag) {
            this.otherAnimation.setRepeatMode(1);
            this.otherAnimation.setRepeatCount(-1);
        }
        this.otherAnimation.start();
    }

    public void slidToLeftOut(int count, boolean isFlag) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "SlideXOut", 0.0f, -1.0f);
        this.otherAnimation = ofFloat;
        ofFloat.setDuration(count);
        if (isFlag) {
            this.otherAnimation.setRepeatMode(1);
            this.otherAnimation.setRepeatCount(-1);
        }
        this.otherAnimation.start();
    }

    public void slidToRight(int count, boolean isFlag) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "SlideX", -1.0f, 0.0f);
        this.otherAnimation = ofFloat;
        ofFloat.setDuration(count);
        if (isFlag) {
            this.otherAnimation.setRepeatMode(1);
            this.otherAnimation.setRepeatCount(-1);
        }
        this.otherAnimation.start();
    }

    public void zoomIn_In(int count, boolean isFlag) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "FactorSize", 0.0f, 1.0f);
        this.otherAnimation = ofFloat;
        ofFloat.setDuration(count);
        if (isFlag) {
            this.otherAnimation.setRepeatMode(1);
            this.otherAnimation.setRepeatCount(-1);
        }
        this.otherAnimation.start();
    }

    public void runIn(int count, boolean isFlag, String textValue) {
        if (textValue.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
            slidToLeft(count, isFlag);
        }
        if (textValue.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
            slidToRight(count, isFlag);
        }
        if (textValue.equals(TransitionType.ZOOM_IN.getValue())) {
            zoomIn_In(resourceId, isFlag);
        }
        if (textValue.equals(TransitionType.FADE_IN.getValue())) {
            fadeIn(resourceId, isFlag);
        }
    }

    private void fadeIn(int resourceId, boolean isFlag) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "OpacityFade", 0, 255);
        this.objectAnimator = ofInt;
        ofInt.setDuration(count);
        if (isFlag) {
            this.objectAnimator.setRepeatMode(1);
            this.objectAnimator.setRepeatCount(-1);
        }
        this.objectAnimator.start();
    }

    private void fadeOut(int count, boolean isFlag) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "OpacityFade", 255, 0);
        this.objectAnimator = ofInt;
        ofInt.setDuration(count);
        if (isFlag) {
            this.objectAnimator.setRepeatMode(1);
            this.objectAnimator.setRepeatCount(-1);
        }
        this.objectAnimator.start();
    }

    public void runOut(int count, boolean isFlag, String textValue) {
        if (textValue.equals(TransitionType.SLIDE_TO_LEFT.getValue())) {
            slidToLeftOut(count, isFlag);
        }
        if (textValue.equals(TransitionType.SLIDE_TO_RIGHT.getValue())) {
            slidToRightOut(ayaNumber, isFlag);
        }
        if (textValue.equals(TransitionType.FADE_OUT.getValue())) {
            fadeOut(ayaNumber, isFlag);
        }
    }

    public QuranEntity(Context context, String textValue, String name, String name139, String name139, RectF rectF, Typeface typeface, Typeface typeface2, int ayaNumber, int size2, Typeface typeface3, int ayaNumber139, int ayaNumber139, String textValue5, boolean isFlag, int ayaNumber139) {
        this.nameFont = Common.FONT_QURAN;
        TextPaint textPaint = new TextPaint(1);
        this.paintAya = textPaint;
        this.paintAyaOutline = new TextPaint(1);
        this.paintAyaTrslOutline = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(1);
        this.paintTranslationAya = textPaint2;
        this.txt = textValue;
        this.complete_aya = name;
        if (name == null || name.isEmpty()) {
            this.complete_aya = textValue;
        }
        this.translation = name139;
        this.translation_complete = name139;
        this.nameFont = textValue5;
        this.indexNumber = ayaNumber;
        this.number = size2;
        this.typefaceNumber = typeface3;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        setVisible(true);
        this.viewWidth = (int) rectF.width();
        textPaint.setTypeface(typeface);
        textPaint.setColor(ayaNumber139);
        textPaint.setTextSize(0.05f);
        textPaint2.setTextSize(0.05f);
        textPaint2.setColor(ayaNumber139);
        textPaint2.setTypeface(typeface2);
        setClrAya(ayaNumber139);
        setClrTrsl(ayaNumber140);
        this.vectorDrawable = (VectorDrawable) ContextCompat.getDrawable(context, ayaNumber140);
        this.max_h = (int) (this.rect.height() * 0.85f);
        this.max_w = (int) (this.rect.width() * 0.85f);
    }

    public QuranEntity(Context context, int ayaNumber, String textValue, String name, String name140, String name140, RectF rectF, Typeface typeface, Typeface typeface2, int size2, int ayaNumber140, Typeface typeface3, int ayaNumber140, int ayaNumber140, String textValue5, boolean isFlag) {
        this.nameFont = Common.FONT_QURAN;
        TextPaint textPaint = new TextPaint(1);
        this.paintAya = textPaint;
        this.paintAyaOutline = new TextPaint(1);
        this.paintAyaTrslOutline = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(1);
        this.paintTranslationAya = textPaint2;
        this.txt = textValue;
        this.translation = name140;
        this.translation_complete = name140;
        this.complete_aya = name;
        if (name == null || name.isEmpty()) {
            this.complete_aya = textValue;
        }
        this.nameFont = textValue5;
        this.indexNumber = size2;
        this.number = ayaNumber140;
        this.typefaceNumber = typeface3;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        setVisible(true);
        this.viewWidth = (int) rectF.width();
        textPaint.setTypeface(typeface);
        textPaint.setColor(ayaNumber140);
        textPaint.setTextSize(0.05f);
        textPaint2.setTextSize(0.05f);
        textPaint2.setColor(value5);
        textPaint2.setTypeface(typeface2);
        setClrAya(ayaNumber141);
        setClrTrsl(value5);
        this.vectorDrawable = (VectorDrawable) ContextCompat.getDrawable(context, ayaNumber);
        this.max_h = (int) (this.rect.height() * 0.85f);
        this.max_w = (int) (this.rect.width() * 0.85f);
    }

    public QuranEntity(String textValue, String name, String name141, String name141, RectF rectF, Typeface typeface, Typeface typeface2, int ayaNumber, int size2, Typeface typeface3, int ayaNumber141, int ayaNumber141, String textValue5, float textSize, boolean isFlag, VectorDrawable vectorDrawable) {
        this.nameFont = Common.FONT_QURAN;
        TextPaint textPaint = new TextPaint(1);
        this.paintAya = textPaint;
        this.paintAyaOutline = new TextPaint(1);
        this.paintAyaTrslOutline = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(1);
        this.paintTranslationAya = textPaint2;
        this.txt = textValue;
        this.translation = name141;
        this.translation_complete = name141;
        this.complete_aya = name;
        this.nameFont = textValue5;
        this.indexNumber = ayaNumber;
        this.number = size2;
        this.typefaceNumber = typeface3;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        setVisible(true);
        this.viewWidth = (int) rectF.width();
        textPaint.setTypeface(typeface);
        textPaint.setColor(ayaNumber142);
        textPaint.setTextSize(textSize);
        textPaint2.setTextSize(0.05f);
        textPaint2.setTypeface(typeface2);
        textPaint2.setColor(ayaNumber142);
        this.vectorDrawable = vectorDrawable;
        this.max_h = (int) (this.rect.height() * 0.85f);
        this.max_w = (int) (this.rect.width() * 0.85f);
    }

    public QuranEntity(String textValue, String name, String name142, String name142, RectF rectF, Typeface typeface, Typeface typeface2, int ayaNumber, int size2, Typeface typeface3, int ayaNumber142, int ayaNumber142, String textValue5, float textSize, float lineSpacing, boolean isFlag, VectorDrawable vectorDrawable) {
        this.nameFont = Common.FONT_QURAN;
        TextPaint textPaint = new TextPaint(1);
        this.paintAya = textPaint;
        this.paintAyaOutline = new TextPaint(1);
        this.paintAyaTrslOutline = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(1);
        this.paintTranslationAya = textPaint2;
        this.txt = textValue;
        this.translation = name142;
        this.translation_complete = name142;
        this.complete_aya = name;
        this.nameFont = textValue5;
        this.indexNumber = ayaNumber;
        this.number = size2;
        this.typefaceNumber = typeface3;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        setVisible(true);
        this.viewWidth = (int) rectF.width();
        textPaint.setTypeface(typeface);
        textPaint.setColor(value3);
        textPaint.setTextSize(textSize);
        textPaint2.setTextSize(lineSpacing);
        textPaint2.setTypeface(typeface2);
        textPaint2.setColor(value4);
        this.vectorDrawable = vectorDrawable;
        this.max_h = (int) (this.rect.height() * 0.85f);
        this.max_w = (int) (this.rect.width() * 0.85f);
    }

    public int getIndexNumber() {
        return this.indexNumber;
    }

    public void setIndexNumber(int width147) {
        this.indexNumber = value;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int resourceId) {
        this.number = size;
    }

    public void update(RectF rectF, int size, int size2) {
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

    public void setColor(int ayaNumber) {
        setClrAya(ayaNumber);
        this.paintAya.setColor(ayaNumber);
    }

    public void setColorTranslation(int ayaNumber) {
        setClrTrsl(ayaNumber);
        TextPaint textPaint = this.paintTranslationAya;
        if (textPaint != null) {
            textPaint.setColor(ayaNumber);
        }
    }

    public void draw(Canvas canvas) {
        if (this.staticLayout != null) {
            canvas.save();
            canvas.translate(this.f427x + (this.offsetX * this.staticLayout.getWidth()), this.f428y);
            float textSize = this.scaleX;
            canvas.scale(textSize, textSize);
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
            float lineSpacing = this.scaleX;
            canvas.scale(lineSpacing, lineSpacing);
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

    public void singleDraw(Canvas canvas, int ayaNumber) {
        if (this.staticLayout != null) {
            this.paintAya.setAlpha(ayaNumber);
            this.staticLayout.draw(canvas);
            if (this.translation == null || this.staticLayoutTranslation == null || getIpad_type() == IpadType.BOTTOM_RECT.ordinal() || getIpad_type() == IpadType.CASSET.ordinal() || getIpad_type() == IpadType.CASSET_IMG.ordinal() || getIpad_type() == IpadType.CASSET_IMG_BLUR.ordinal()) {
                return;
            }
            canvas.save();
            canvas.translate((-this.f427x) + this.x_translation, this.staticLayout.getHeight() * this.padding);
            this.paintTranslationAya.setAlpha(ayaNumber);
            this.staticLayoutTranslation.draw(canvas);
            canvas.restore();
        }
    }

    public void singleDraw(Canvas canvas, int ayaNumber, float textSize) {
        if (this.staticLayout != null) {
            canvas.save();
            canvas.translate(this.staticLayout.getWidth() * textSize, 0.0f);
            this.paintAya.setAlpha(ayaNumber);
            this.staticLayout.draw(canvas);
            canvas.restore();
            if (this.translation == null || this.staticLayoutTranslation == null || getIpad_type() == IpadType.BOTTOM_RECT.ordinal() || getIpad_type() == IpadType.CASSET.ordinal() || getIpad_type() == IpadType.CASSET_IMG.ordinal() || getIpad_type() == IpadType.CASSET_IMG_BLUR.ordinal()) {
                return;
            }
            canvas.save();
            canvas.translate((-this.f427x) + this.x_translation, this.staticLayout.getHeight() * this.padding);
            canvas.translate(textSize * this.staticLayout.getWidth(), 0.0f);
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
