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
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import hazem.nurmontage.videoquran.views.BlurredImageView;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import java.io.Serializable;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class BismilahEntity extends EntityView implements Serializable {
    private EntityBismilahTimeline bismilahTimeline;
    private int clrAya;
    private int index;
    private int ipad_type;
    private boolean isFadeIn;
    private boolean isFadeOut;
    private boolean isVisible;
    private int mPreset;
    private ObjectAnimator objectAnimator;
    private float offsetX;
    private ObjectAnimator otherAnimation;
    private final TextPaint paintAya;
    private final TextPaint paintAyaOutline;
    private StaticLayout staticLayout;
    private StaticLayout staticLayoutOutline;
    private String txt;
    private WeakReference<TrackEntityView> viewWeakReference;
    private int viewWidth;
    private WeakReference<BlurredImageView> weakBlurredImageView;
    private float x_translation;
    private float scaleX = 1.0f;
    private String nameFont = Common.FONT_QURAN;

    public int getmPreset() {
        return this.mPreset;
    }

    public void setmPreset(int resourceId) {
        this.mPreset = resourceId;
    }

    public void setIpad_type(int resourceId) {
        this.ipad_type = value;
    }

    public EntityBismilahTimeline getBismilahTimeline() {
        return this.bismilahTimeline;
    }

    public void setBismilahTimeline(EntityBismilahTimeline entityBismilahTimeline) {
        this.bismilahTimeline = entityBismilahTimeline;
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
        int size2 = C22041.$SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset[ayaTextPreset.ordinal()];
        if (size2 != 2) {
            if (size2 != 3) {
                if (size2 != 4) {
                    return;
                }
                paint.setShadowLayer(textSize * 0.45f, 0.0f, 0.0f, ColorUtils.setAlphaComponent(ayaNumber, 255));
                return;
            } else {
                float positionRatio = 0.18f * textSize;
                float alphaValue = textSize * 0.08f;
                paint.setShadowLayer(positionRatio, alphaValue, alphaValue, ColorUtils.setAlphaComponent((this.ipad_type == IpadType.HEART.ordinal() || this.ipad_type == IpadType.BATTERY.ordinal() || this.ipad_type == IpadType.BLUE_TYPE.ordinal()) ? -1 : ViewCompat.MEASURED_STATE_MASK, 120));
                return;
            }
        }
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(textSize * 0.06f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        if (this.ipad_type == IpadType.HEART.ordinal() || this.ipad_type == IpadType.BATTERY.ordinal() || this.ipad_type == IpadType.BLUE_TYPE.ordinal()) {
            paint.setColor(hazem.nurmontage.videoquran.Utils.ColorUtils.lightenColor(ayaNumber, 0.85f));
        } else {
            paint.setColor(hazem.nurmontage.videoquran.Utils.ColorUtils.darkenColor(ayaNumber, 0.85f));
        }
    }

    /* renamed from: hazem.nurmontage.videoquran.model.BismilahEntity$1 */
    static /* synthetic */ class C22041 {
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
        } else {
            TextPaint textPaint = this.paintAya;
            applyAyaPreset(textPaint, ayaTextPreset, this.clrAya, textPaint.getTypeface(), this.paintAya.getTextSize());
        }
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

    public int getViewWidth() {
        return this.viewWidth;
    }

    public void setViewWeakReference(WeakReference<TrackEntityView> weakReference, WeakReference<BlurredImageView> weakReference2) {
        this.viewWeakReference = weakReference;
        this.weakBlurredImageView = weakReference2;
    }

    public int getDuration_fade() {
        return (int) ((Math.abs(getBismilahTimeline().getRect().right / getBismilahTimeline().getSecond_in_screen()) - Math.abs(getBismilahTimeline().getRect().left / getBismilahTimeline().getSecond_in_screen())) * 0.2f * 1000.0f);
    }

    public String getNameFont() {
        return this.nameFont;
    }

    public void setIndex(int resourceId) {
        this.index = value;
    }

    public int getIndex() {
        return this.index;
    }

    public void setTxt(String textValue) {
        this.txt = textValue;
        SpannableString spannableString = new SpannableString(textValue);
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    public void setClrAya(int ayaNumber) {
        this.clrAya = ayaNumber;
    }

    public int getClrAya() {
        return this.clrAya;
    }

    public TextPaint getPaintAya() {
        return this.paintAya;
    }

    public float calculateTextSize(String textValue, Paint paint, int counter, int size2) {
        float textSize = 0.0f;
        if (textValue != null && !textValue.isEmpty() && counter > 0 && size2 > 0) {
            paint.setTextSize(1.0f);
            Rect rect = new Rect();
            paint.getTextBounds(textValue, 0, textValue.length(), rect);
            rect.width();
            rect.height();
            float positionRatio = 1000.0f;
            for (int counter30 = 0; counter30 < 100; counter30++) {
                float widthRatio = (textSize + positionRatio) / 2.0f;
                paint.setTextSize(widthRatio);
                paint.getTextBounds(textValue, 0, textValue.length(), rect);
                float width = rect.width();
                float height = rect.height();
                if (width > counter || height > size2) {
                    positionRatio = widthRatio;
                } else {
                    textSize = widthRatio;
                }
            }
        }
        return textSize;
    }

    public float calculateTextSize() {
        int height = (int) ((this.rect.height() / getFactor_scale()) * 0.85f);
        return calculateTextSize(this.txt, this.paintAya, (int) ((this.rect.width() / getFactor_scale()) * 0.85f), height);
    }

    public void setTextSize(float textSize) {
        this.paintAya.setTextSize(textSize);
    }

    public void setTextSizeInBoucle(float textSize) {
        this.paintAya.setTextSize(textSize);
        SpannableString spannableString = new SpannableString(this.txt);
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
    }

    public void setupScale(float textSize, int index, int size2) {
        this.paintAya.setTextSize(textSize * index);
        SpannableString spannableString = new SpannableString(this.txt);
        this.viewWidth = (int) Math.max(this.rect.width(), Math.round(this.paintAya.measureText(spannableString.toString())));
        StaticLayout build = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = build;
        float width = build.getWidth();
        float positionRatio = width * 0.5f;
        float height = this.rect.height() * (width / this.rect.width()) * 0.5f;
        float centerY = this.rect.centerY();
        float centerX = this.rect.centerX();
        this.rect.set(centerX - positionRatio, centerY - height, centerX + positionRatio, centerY + height);
        this.max_h = Math.round(this.rect.height() * 0.85f);
        this.max_w = Math.round(this.rect.width() * 0.85f);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
    }

    public void setupScaleSave(float textSize, int count) {
        this.paintAya.setTextSize(textSize * count);
        SpannableString spannableString = new SpannableString(this.txt);
        this.viewWidth = (int) this.rect.width();
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.max_h = Math.round(this.rect.height() * 0.85f);
        this.max_w = Math.round(this.rect.width() * 0.85f);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public void scale(float textSize, int ayaNumber, int size2) {
        setFactor_scale(textSize);
        float width = this.rect.width() * textSize;
        float height = this.rect.height() * textSize;
        float positionRatio = width * 0.5f;
        this.rect.left = this.rect.centerX() - positionRatio;
        this.rect.right = this.rect.centerX() + positionRatio;
        float scaleFactor = height * 0.5f;
        this.rect.top = this.rect.centerY() - scaleFactor;
        this.rect.bottom = this.rect.centerY() + scaleFactor;
        this.viewWidth = (int) this.rect.width();
        this.paintAya.setTextSize(calculateTextSize());
        createStaticLayout();
        setFcSize(this.paintAya.getTextSize() / value);
        initPreset(getmPreset());
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public void postTranslate(float textSize, float positionRatio) {
        this.rect.offset(textSize, positionRatio);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
    }

    public void setTranslate(float textSize, float positionRatio) {
        float width = this.rect.width() * 0.5f;
        float height = this.rect.height() * 0.5f;
        this.rect.left = textSize - width;
        this.rect.right = textSize + width;
        this.rect.top = positionRatio - height;
        this.rect.bottom = positionRatio + height;
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
    }

    public float getWidth() {
        this.paintAya.setTextSize(3.0f);
        return this.paintAya.measureText(this.txt);
    }

    public void createStaticLayout() {
        TextPaint textPaint = this.paintAya;
        textPaint.setTextSize(calculateTextSize(this.txt, textPaint, (int) (this.viewWidth * 0.8f), (int) (this.rect.height() * 0.8f)));
        SpannableString spannableString = new SpannableString(this.txt);
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
    }

    private StaticLayout buildStaticLayout(String textValue, TextPaint textPaint, int count) {
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
        this.paintAyaOutline.setAlpha(this.paintAya.getAlpha());
    }

    public void setSlideX(float textSize) {
        WeakReference<BlurredImageView> weakReference;
        this.offsetX = textSize;
        this.paintAya.setAlpha(Math.round((1.0f - Math.abs(textSize)) * 255.0f));
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
        ofFloat.setDuration(index);
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
            zoomIn_In(count, isFlag);
        }
        if (textValue.equals(TransitionType.FADE_IN.getValue())) {
            fadeIn(resourceId, isFlag);
        }
    }

    private void fadeIn(int resourceId, boolean isFlag) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "OpacityFade", 0, 255);
        this.objectAnimator = ofInt;
        ofInt.setDuration(resourceId);
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
            slidToRightOut(count, isFlag);
        }
        if (textValue.equals(TransitionType.FADE_OUT.getValue())) {
            fadeOut(ayaNumber, isFlag);
        }
    }

    public BismilahEntity(String textValue, RectF rectF, Typeface typeface, int ayaNumber) {
        TextPaint textPaint = new TextPaint(1);
        this.paintAya = textPaint;
        this.paintAyaOutline = new TextPaint(1);
        this.txt = textValue;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        setVisible(true);
        this.viewWidth = (int) rectF.width();
        textPaint.setTypeface(typeface);
        textPaint.setColor(ayaNumber);
        textPaint.setTextSize(0.05f);
        setClrAya(ayaNumber);
        this.max_h = (int) (this.rect.height() * 0.85f);
        this.max_w = (int) (this.rect.width() * 0.85f);
        createStaticLayout();
    }

    public BismilahEntity(String textValue, RectF rectF, Typeface typeface, int ayaNumber, int size2) {
        TextPaint textPaint = new TextPaint(1);
        this.paintAya = textPaint;
        this.paintAyaOutline = new TextPaint(1);
        this.txt = textValue;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        setVisible(true);
        this.viewWidth = (int) rectF.width();
        textPaint.setTypeface(typeface);
        textPaint.setColor(ayaNumber);
        textPaint.setTextSize(0.05f);
        setClrAya(ayaNumber);
        this.max_h = (int) (this.rect.height() * 0.85f);
        this.max_w = (int) (this.rect.width() * 0.85f);
        this.mPreset = size2;
    }

    public void update(RectF rectF, int ayaNumber, int size2) {
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
        }
    }

    public void setupCanvasDraw(Canvas canvas) {
        this.f428y = (canvas.getHeight() - this.staticLayout.getHeight()) * 0.5f;
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
        }
    }

    public void singleDraw(Canvas canvas, int ayaNumber, float textSize) {
        if (this.staticLayout != null) {
            canvas.save();
            canvas.translate(textSize * this.staticLayout.getWidth(), 0.0f);
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
