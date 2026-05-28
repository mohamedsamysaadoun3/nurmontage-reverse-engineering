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
import android.text.SpannableString;
import android.text.Layout$Alignment;
import android.text.StaticLayout$Builder;
import android.graphics.Typeface;
import android.graphics.RectF;
import java.lang.ref.WeakReference;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.animation.ObjectAnimator;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import java.io.Serializable;

public class BismilahEntity extends EntityView implements Serializable
{
    private EntityBismilahTimeline bismilahTimeline;
    private int clrAya;
    private int index;
    private int ipad_type;
    private boolean isFadeIn;
    private boolean isFadeOut;
    private boolean isVisible;
    private int mPreset;
    private String nameFont;
    private ObjectAnimator objectAnimator;
    private float offsetX;
    private ObjectAnimator otherAnimation;
    private final TextPaint paintAya;
    private final TextPaint paintAyaOutline;
    private float scaleX;
    private StaticLayout staticLayout;
    private StaticLayout staticLayoutOutline;
    private String txt;
    private WeakReference viewWeakReference;
    private int viewWidth;
    private WeakReference weakBlurredImageView;
    private float x_translation;
    
    public BismilahEntity(final String txt, final RectF rectF, final Typeface typeface, final int n) {
        this.scaleX = 1.0f;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        final boolean visible = true;
        final TextPaint paintAya = new TextPaint((int)(visible ? 1 : 0));
        this.paintAya = paintAya;
        this.paintAyaOutline = new TextPaint((int)(visible ? 1 : 0));
        this.txt = txt;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.setVisible(visible);
        this.viewWidth = (int)rectF.width();
        paintAya.setTypeface(typeface);
        paintAya.setColor(n);
        paintAya.setTextSize(0.05f);
        this.setClrAya(n);
        final float height = this.rect.height();
        final float n2 = 0.85f;
        this.max_h = (int)(height * n2);
        this.max_w = (int)(this.rect.width() * n2);
        this.createStaticLayout();
    }
    
    public BismilahEntity(final String txt, final RectF rectF, final Typeface typeface, final int n, final int mPreset) {
        this.scaleX = 1.0f;
        this.nameFont = "\u0639\u062b\u0645\u0627\u0646\u064a.otf";
        final boolean visible = true;
        final TextPaint paintAya = new TextPaint((int)(visible ? 1 : 0));
        this.paintAya = paintAya;
        this.paintAyaOutline = new TextPaint((int)(visible ? 1 : 0));
        this.txt = txt;
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.setVisible(visible);
        this.viewWidth = (int)rectF.width();
        paintAya.setTypeface(typeface);
        paintAya.setColor(n);
        paintAya.setTextSize(0.05f);
        this.setClrAya(n);
        final float height = this.rect.height();
        final float n2 = 0.85f;
        this.max_h = (int)(height * n2);
        this.max_w = (int)(this.rect.width() * n2);
        this.mPreset = mPreset;
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
    
    private StaticLayout getStaticLayoutOutline() {
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        return StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAyaOutline, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
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
        final int n2 = BismilahEntity$1.$SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset[ayaTextPreset.ordinal()];
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
                Label_0239: {
                    if (ipad_type != color) {
                        final int ipad_type2 = this.ipad_type;
                        color = IpadType.BATTERY.ordinal();
                        if (ipad_type2 != color) {
                            final int ipad_type3 = this.ipad_type;
                            color = IpadType.BLUE_TYPE.ordinal();
                            if (ipad_type3 != color) {
                                n3 = -16777216;
                                break Label_0239;
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
            n *= 0.06f;
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
    
    public float calculateTextSize() {
        final float n = this.rect.height() / this.getFactor_scale();
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
        final TextPaint paintAya = this.paintAya;
        final String txt = this.txt;
        final float n = (float)this.viewWidth;
        final float n2 = 0.8f;
        paintAya.setTextSize(this.calculateTextSize(txt, (Paint)paintAya, (int)(n * n2), (int)(this.rect.height() * n2)));
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        this.staticLayout = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        final float centerY = this.rect.centerY();
        final float n3 = (float)this.staticLayout.getHeight();
        final float n4 = 0.5f;
        this.y = centerY - n3 * n4;
        this.x = this.rect.centerX() - this.staticLayout.getWidth() * n4;
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
    
    public EntityBismilahTimeline getBismilahTimeline() {
        return this.bismilahTimeline;
    }
    
    public int getClrAya() {
        return this.clrAya;
    }
    
    public int getDuration_fade() {
        return (int)((Math.abs(this.getBismilahTimeline().getRect().right / this.getBismilahTimeline().getSecond_in_screen()) - Math.abs(this.getBismilahTimeline().getRect().left / this.getBismilahTimeline().getSecond_in_screen())) * 0.2f * 1000.0f);
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
    public void scale(float textSize, final int n, final int n2) {
        this.setFactor_scale(textSize);
        final float n3 = this.rect.width() * textSize;
        final float n4 = this.rect.height() * textSize;
        textSize = 0.5f;
        final float n5 = n3 * textSize;
        this.rect.left = this.rect.centerX() - n5;
        this.rect.right = this.rect.centerX() + n5;
        final float n6 = n4 * textSize;
        this.rect.top = this.rect.centerY() - n6;
        this.rect.bottom = this.rect.centerY() + n6;
        this.viewWidth = (int)this.rect.width();
        this.paintAya.setTextSize(this.calculateTextSize());
        this.createStaticLayout();
        textSize = this.paintAya.getTextSize();
        textSize /= n;
        this.setFcSize(textSize);
        this.initPreset(this.getmPreset());
    }
    
    @Override
    public void setAnimTest(final boolean animTest) {
        super.setAnimTest(animTest);
    }
    
    public void setBismilahTimeline(final EntityBismilahTimeline bismilahTimeline) {
        this.bismilahTimeline = bismilahTimeline;
    }
    
    public void setClrAya(final int clrAya) {
        this.clrAya = clrAya;
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
    
    public void setIndex(final int index) {
        this.index = index;
    }
    
    public void setIpad_type(final int ipad_type) {
        this.ipad_type = ipad_type;
    }
    
    public void setOpacityFade(int animTest) {
        this.paintAya.setAlpha(animTest);
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
        final SpannableString spannableString = new SpannableString((CharSequence)txt);
        this.staticLayout = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
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
        this.x = (canvas.getWidth() - this.staticLayout.getWidth()) * n2;
        canvas.save();
        canvas.translate(this.x, this.y);
    }
    
    public void setupScale(float y, int length, final int n) {
        final TextPaint paintAya = this.paintAya;
        y *= length;
        paintAya.setTextSize(y);
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        length = (int)Math.max(this.rect.width(), (float)Math.round(this.paintAya.measureText(spannableString.toString())));
        this.viewWidth = length;
        length = spannableString.length();
        final StaticLayout build = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, length, this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = build;
        y = (float)build.getWidth();
        final float n2 = 0.5f;
        final float n3 = y * n2;
        final float height = this.rect.height();
        y /= this.rect.width();
        final float n4 = height * y * n2;
        y = this.rect.centerY();
        final float centerX = this.rect.centerX();
        final RectF rect = this.rect;
        final float n5 = centerX - n3;
        final float n6 = y - n4;
        final float n7 = centerX + n3;
        y += n4;
        rect.set(n5, n6, n7, y);
        y = this.rect.height();
        final float n8 = 0.85f;
        this.max_h = Math.round(y * n8);
        this.max_w = Math.round(this.rect.width() * n8);
        y = this.rect.centerX();
        y -= this.staticLayout.getWidth() * n2;
        this.x = y;
        y = this.rect.centerY();
        y -= this.staticLayout.getHeight() * n2;
        this.y = y;
    }
    
    public void setupScaleSave(float y, int length) {
        final TextPaint paintAya = this.paintAya;
        y *= length;
        paintAya.setTextSize(y);
        final SpannableString spannableString = new SpannableString((CharSequence)this.txt);
        length = (int)this.rect.width();
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
    
    public void update(final RectF rectF, final int max_w, final int max_h) {
        this.rect = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.max_h = max_h;
        this.max_w = max_w;
        this.viewWidth = (int)this.rect.width();
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
