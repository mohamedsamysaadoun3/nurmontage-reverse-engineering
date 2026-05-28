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

    public void setmPreset(int value) {
        this.mPreset = value;
    }

    public void setIpad_type(int value) {
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

    public void applyAyaPreset(Paint paint, AyaTextPreset ayaTextPreset, int value, Typeface typeface, float floatValue) {
        paint.reset();
        paint.setTypeface(typeface);
        paint.setTextSize(floatValue);
        paint.setAntiAlias(true);
        paint.setSubpixelText(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(value);
        int size2 = C22041.$SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset[ayaTextPreset.ordinal()];
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
        paint.setStrokeWidth(floatValue * 0.06f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        if (this.ipad_type == IpadType.HEART.ordinal() || this.ipad_type == IpadType.BATTERY.ordinal() || this.ipad_type == IpadType.BLUE_TYPE.ordinal()) {
            paint.setColor(hazem.nurmontage.videoquran.Utils.ColorUtils.lightenColor(value, 0.85f));
        } else {
            paint.setColor(hazem.nurmontage.videoquran.Utils.ColorUtils.darkenColor(value, 0.85f));
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

    public void setIndex(int value) {
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

    public float calculateTextSize() {
        int height = (int) ((this.rect.height() / getFactor_scale()) * 0.85f);
        return calculateTextSize(this.txt, this.paintAya, (int) ((this.rect.width() / getFactor_scale()) * 0.85f), height);
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

    public void setupScale(float floatValue, int value, int size2) {
        this.paintAya.setTextSize(floatValue * value);
        SpannableString spannableString = new SpannableString(this.txt);
        this.viewWidth = (int) Math.max(this.rect.width(), Math.round(this.paintAya.measureText(spannableString.toString())));
        StaticLayout build = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = build;
        float width = build.getWidth();
        float floatValue2 = width * 0.5f;
        float height = this.rect.height() * (width / this.rect.width()) * 0.5f;
        float centerY = this.rect.centerY();
        float centerX = this.rect.centerX();
        this.rect.set(centerX - floatValue2, centerY - height, centerX + floatValue2, centerY + height);
        this.max_h = Math.round(this.rect.height() * 0.85f);
        this.max_w = Math.round(this.rect.width() * 0.85f);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
        this.f428y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
    }

    public void setupScaleSave(float floatValue, int value) {
        this.paintAya.setTextSize(floatValue * value);
        SpannableString spannableString = new SpannableString(this.txt);
        this.viewWidth = (int) this.rect.width();
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.max_h = Math.round(this.rect.height() * 0.85f);
        this.max_w = Math.round(this.rect.width() * 0.85f);
        this.f427x = this.rect.centerX() - (this.staticLayout.getWidth() * 0.5f);
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
        this.viewWidth = (int) this.rect.width();
        this.paintAya.setTextSize(calculateTextSize());
        createStaticLayout();
        setFcSize(this.paintAya.getTextSize() / value);
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
        TextPaint textPaint = this.paintAya;
        textPaint.setTextSize(calculateTextSize(this.txt, textPaint, (int) (this.viewWidth * 0.8f), (int) (this.rect.height() * 0.8f)));
        SpannableString spannableString = new SpannableString(this.txt);
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
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

    public void setSlideX(float floatValue) {
        WeakReference<BlurredImageView> weakReference;
        this.offsetX = floatValue;
        this.paintAya.setAlpha(Math.round((1.0f - Math.abs(floatValue)) * 255.0f));
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

    public BismilahEntity(String textValue, RectF rectF, Typeface typeface, int value) {
        TextPaint textPaint = new TextPaint(1);
        this.paintAya = textPaint;
        this.paintAyaOutline = new TextPaint(1);
        this.txt = textValue;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        setVisible(true);
        this.viewWidth = (int) rectF.width();
        textPaint.setTypeface(typeface);
        textPaint.setColor(value);
        textPaint.setTextSize(0.05f);
        setClrAya(value);
        this.max_h = (int) (this.rect.height() * 0.85f);
        this.max_w = (int) (this.rect.width() * 0.85f);
        createStaticLayout();
    }

    public BismilahEntity(String textValue, RectF rectF, Typeface typeface, int value, int size2) {
        TextPaint textPaint = new TextPaint(1);
        this.paintAya = textPaint;
        this.paintAyaOutline = new TextPaint(1);
        this.txt = textValue;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        setVisible(true);
        this.viewWidth = (int) rectF.width();
        textPaint.setTypeface(typeface);
        textPaint.setColor(value);
        textPaint.setTextSize(0.05f);
        setClrAya(value);
        this.max_h = (int) (this.rect.height() * 0.85f);
        this.max_w = (int) (this.rect.width() * 0.85f);
        this.mPreset = size2;
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
