package hazem.nurmontage.videoquran.model;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import hazem.nurmontage.videoquran.constant.IpadType;
import hazem.nurmontage.videoquran.constant.SurahNameStyle;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import java.io.Serializable;
import nl.dionsegijn.konfetti.core.Angle;

/* loaded from: classes2.dex */
public class SurahNameEntity extends EntityView implements Serializable {
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

    /* renamed from: x */
    private float f437x;

    /* renamed from: y */
    private float f438y;

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public void endAnimator() {
    }

    public void setIpad_type(int resourceId) {
        this.ipad_type = resourceId;
    }

    public int getClrBg() {
        return this.clrBg;
    }

    public void setClrBg(int colorValue) {
        this.clrBg = colorValue;
        this.paintBg.setColor(colorValue);
        this.paintBg.setAlpha(Angle.LEFT);
    }

    public boolean isHaveBg() {
        return this.isHaveBg;
    }

    public TextPaint getPaintAya() {
        return this.paintAya;
    }

    public int getStyle() {
        return this.style;
    }

    public String getNameFont() {
        return this.nameFont;
    }

    public void setTypeface(Typeface typeface, String textValue) {
        this.paintAya.setTypeface(typeface);
        this.nameFont = textValue;
        createStaticLayout();
    }

    public int getmPreset() {
        return this.mPreset;
    }

    public void setClrS_name(int resourceId) {
        this.clrS_name = value;
    }

    public int getClrS_name() {
        return this.clrS_name;
    }

    public String getName() {
        return this.name;
    }

    public void setColor(int ayaNumber) {
        setClrS_name(ayaNumber);
        this.paintAya.setColor(ayaNumber);
        this.paintAyaStyle.setColor(surahNumber);
    }

    public void applyAyaPreset(Paint paint, AyaTextPreset ayaTextPreset, int surahNumber, Typeface typeface, float nameSize) {
        paint.reset();
        paint.setTypeface(typeface);
        paint.setTextSize(nameSize);
        paint.setAntiAlias(true);
        paint.setSubpixelText(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(surahNumber);
        if (this.style == SurahNameStyle.ZAGHRAFAT.ordinal()) {
            if (this.paintAyaStyleOutline == paint) {
                nameSize *= 0.5f;
            }
            if (this.paintAyaOutline == paint) {
                nameSize *= 1.3f;
            }
        }
        int value2 = C22061.$SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset[ayaTextPreset.ordinal()];
        if (value2 != 2) {
            if (value2 != 3) {
                if (value2 != 4) {
                    return;
                }
                paint.setShadowLayer(nameSize * 0.45f, 0.0f, 0.0f, ColorUtils.setAlphaComponent(surahNumber, 255));
                return;
            } else {
                float positionRatio = 0.18f * nameSize;
                float alphaValue = nameSize * 0.08f;
                paint.setShadowLayer(positionRatio, alphaValue, alphaValue, ColorUtils.setAlphaComponent((this.ipad_type == IpadType.HEART.ordinal() || this.ipad_type == IpadType.BATTERY.ordinal() || this.ipad_type == IpadType.BLUE_TYPE.ordinal() || isHaveBg()) ? -1 : ViewCompat.MEASURED_STATE_MASK, Angle.LEFT));
                return;
            }
        }
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(nameSize * 0.12f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        if (this.ipad_type == IpadType.HEART.ordinal() || this.ipad_type == IpadType.BATTERY.ordinal() || this.ipad_type == IpadType.BLUE_TYPE.ordinal() || isHaveBg()) {
            paint.setColor(hazem.nurmontage.videoquran.Utils.ColorUtils.lightenColor(surahNumber, 0.85f));
        } else {
            paint.setColor(hazem.nurmontage.videoquran.Utils.ColorUtils.darkenColor(value, 0.85f));
        }
    }

    /* renamed from: hazem.nurmontage.videoquran.model.SurahNameEntity$1 */
    static /* synthetic */ class C22061 {
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
            applyAyaPreset(this.paintAyaStyleOutline, AyaTextPreset.OUTLINE, this.clrS_name, this.paintAyaStyle.getTypeface(), this.paintAyaStyle.getTextSize());
            this.staticLayoutStyleOutline = getStaticLayoutStyleOutline();
            applyAyaPreset(this.paintAyaStyle, AyaTextPreset.NONE, this.clrS_name, this.paintAyaStyle.getTypeface(), this.paintAyaStyle.getTextSize());
            applyAyaPreset(this.paintAyaOutline, AyaTextPreset.OUTLINE, this.clrS_name, this.paintAya.getTypeface(), this.paintAya.getTextSize());
            this.staticLayoutOutline = getStaticLayoutOutline();
            applyAyaPreset(this.paintAya, AyaTextPreset.NONE, this.clrS_name, this.paintAya.getTypeface(), this.paintAya.getTextSize());
            return;
        }
        TextPaint textPaint = this.paintAya;
        applyAyaPreset(textPaint, ayaTextPreset, this.clrS_name, textPaint.getTypeface(), this.paintAya.getTextSize());
        updatePaintStyle();
    }

    private void updatePaintStyle() {
        if (this.staticLayoutStyle != null) {
            float textSize = this.paintAyaStyle.getTextSize();
            this.paintAyaStyle.reset();
            this.paintAyaStyle.set(this.paintAya);
            this.paintAyaStyle.setTypeface(this.typefaceStyle);
            this.paintAyaStyle.setTextSize(textSize);
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

    public void initPreset(int resourceId) {
        setPreset(get(resourceId));
    }

    public String getReader() {
        return this.reader;
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public void scale(float nameSize, int width27, int width27) {
        setFactor_scale(nameSize);
        float width = this.rect.width() * nameSize;
        float height = this.rect.height() * nameSize;
        float positionRatio = width * 0.5f;
        this.rect.left = this.rect.centerX() - positionRatio;
        this.rect.right = this.rect.centerX() + positionRatio;
        float scaleFactor = height * 0.5f;
        this.rect.top = this.rect.centerY() - scaleFactor;
        this.rect.bottom = this.rect.centerY() + scaleFactor;
        this.viewWidth = (int) this.rect.width();
        createStaticLayout();
        this.f437x = this.rect.left;
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public void postTranslate(float nameSize, float positionRatio) {
        this.rect.offset(nameSize, positionRatio);
        this.f437x = this.rect.left;
        if (this.style == SurahNameStyle.ZAGHRAFAT.ordinal() && this.staticLayoutStyle != null) {
            this.f438y = this.rect.centerY() - ((this.staticLayoutStyle.getHeight() + this.staticLayout.getHeight()) * 0.5f);
        } else {
            this.f438y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
        }
    }

    public float calculateTextSize(String textValue, Paint paint, int counter, int counter29) {
        float nameSize = 0.0f;
        if (textValue != null && !textValue.isEmpty() && counter > 0 && counter29 > 0) {
            paint.setTextSize(1.0f);
            Rect rect = new Rect();
            paint.getTextBounds(textValue, 0, textValue.length(), rect);
            rect.width();
            rect.height();
            float positionRatio = 1000.0f;
            for (int counter30 = 0; counter30 < 100; counter30++) {
                float widthRatio = (nameSize + positionRatio) / 2.0f;
                paint.setTextSize(widthRatio);
                paint.getTextBounds(textValue, 0, textValue.length(), rect);
                float width = rect.width();
                float height = rect.height();
                if (width > counter || height > counter29) {
                    positionRatio = widthRatio;
                } else {
                    nameSize = widthRatio;
                }
            }
        }
        return nameSize;
    }

    private void createStaticLayout() {
        String textValue;
        Layout.Alignment alignment;
        if (this.style == SurahNameStyle.ZAGHRAFAT.ordinal()) {
            textValue = this.reader;
        } else {
            textValue = this.name;
            if (this.reader.length() > 3) {
                textValue = textValue + "\surahNumber" + this.reader;
            }
        }
        SpannableString spannableString = new SpannableString(textValue);
        if (this.style == SurahNameStyle.ZAGHRAFAT.ordinal()) {
            TextPaint textPaint = this.paintAyaStyle;
            textPaint.setTextSize(calculateTextSize(this.name_style, textPaint, (int) (this.viewWidth * 0.9f), (int) (this.rect.height() * 0.5f)));
            String name2 = this.name_style;
            this.staticLayoutStyle = StaticLayout.Builder.obtain(name2, 0, name2.length(), this.paintAyaStyle, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setTextDirection(TextDirectionHeuristics.LTR).setIncludePad(false).build();
            alignment = Layout.Alignment.ALIGN_CENTER;
            TextPaint textPaint2 = this.paintAya;
            textPaint2.setTextSize(calculateTextSize(this.reader, textPaint2, (int) (this.viewWidth * 0.9f), (int) (this.rect.height() * 0.4f)));
        } else {
            alignment = this.alignment;
            if (this.name.length() > this.reader.length()) {
                TextPaint textPaint3 = this.paintAya;
                textPaint3.setTextSize(calculateTextSize(this.name, textPaint3, (int) (this.viewWidth * 0.8f), (int) (this.rect.height() * 0.8f)));
            } else {
                TextPaint textPaint4 = this.paintAya;
                textPaint4.setTextSize(calculateTextSize(this.reader, textPaint4, (int) (this.viewWidth * 0.8f), (int) (this.rect.height() * 0.8f)));
            }
        }
        this.staticLayout = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setTextDirection(TextDirectionHeuristics.LTR).setIncludePad(false).build();
        setPreset(get(getmPreset()));
        if (this.style == SurahNameStyle.ZAGHRAFAT.ordinal() && this.staticLayoutStyle != null) {
            this.f438y = this.rect.centerY() - ((this.staticLayoutStyle.getHeight() + this.staticLayout.getHeight()) * 0.5f);
        } else {
            this.f438y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
        }
    }

    private StaticLayout getStaticLayoutOutline() {
        if (this.style == SurahNameStyle.ZAGHRAFAT.ordinal()) {
            String textValue = this.reader;
            return StaticLayout.Builder.obtain(textValue, 0, textValue.length(), this.paintAyaOutline, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setTextDirection(TextDirectionHeuristics.LTR).setIncludePad(false).build();
        }
        String name2 = this.name;
        if (this.reader.length() > 3) {
            name2 = name2 + "\surahNumber" + this.reader;
        }
        return StaticLayout.Builder.obtain(name2, 0, name2.length(), this.paintAyaOutline, this.viewWidth).setAlignment(this.alignment).setLineSpacing(0.0f, 1.0f).setTextDirection(TextDirectionHeuristics.LTR).setIncludePad(false).build();
    }

    private StaticLayout getStaticLayoutStyleOutline() {
        String textValue = this.name_style;
        return StaticLayout.Builder.obtain(textValue, 0, textValue.length(), this.paintAyaStyleOutline, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setTextDirection(TextDirectionHeuristics.LTR).setIncludePad(false).build();
    }

    public void setupSurahFont() {
        int surahNumber = this.index_surah;
        if (surahNumber < 10) {
            this.name_style = "00" + this.index_surah + "sura";
        } else if (surahNumber < 100) {
            this.name_style = "0" + this.index_surah + "sura";
        } else {
            this.name_style = this.index_surah + "sura";
        }
    }

    public int getIndex_surah() {
        return this.index_surah;
    }

    public void setIndex_surah(int surahNumber) {
        this.index_surah = surahNumber;
        setupSurahFont();
    }

    public SurahNameEntity(Layout.Alignment alignment, String textValue, String name2, RectF rectF, Typeface typeface, int surahNumber, float nameSize, String name3, int surahNumber40, Typeface typeface2, int surahNumber40, int i4, int i5, boolean isFlag, int surahNumber40) {
        this.name = "";
        this.reader = "";
        this.nameFont = "خط الإبل.otf";
        TextPaint textPaint = new TextPaint(1);
        this.paintAya = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.paintBg = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.paintAyaStyle = textPaint3;
        this.paintAyaStyleOutline = new TextPaint(1);
        this.paintAyaOutline = new TextPaint(1);
        setFactor_scale(nameSize);
        this.clrBg = surahNumber40;
        this.isHaveBg = isFlag;
        setIpad_type(i5);
        this.style = surahNumber40;
        this.index_surah = i4;
        setupSurahFont();
        this.typefaceStyle = typeface2;
        textPaint3.setTypeface(typeface2);
        this.name = textValue;
        this.mPreset = surahNumber40;
        this.reader = name2;
        this.f437x = rectF.left;
        this.f438y = rectF.top;
        this.rect = rectF;
        setVisible(true);
        this.viewWidth = (int) rectF.width();
        textPaint.setTypeface(typeface);
        textPaint.setColor(surahNumber);
        textPaint3.setColor(textPaint.getColor());
        textPaint2.setColor(surahNumber40);
        textPaint2.setAlpha(Angle.LEFT);
        setClrS_name(surahNumber);
        textPaint.setTextSize(0.05f);
        this.nameFont = name3;
        this.alignment = alignment;
        if (getFactor_scale() != 1.0f) {
            scale(getFactor_scale(), 1, 1);
        } else {
            createStaticLayout();
        }
    }

    public void setNameAndReader(Layout.Alignment alignment, String textValue, String name2) {
        this.name = textValue;
        this.reader = name2;
        this.alignment = alignment;
        this.paintAya.setTextSize(0.05f);
        createStaticLayout();
    }

    public void setStyle(Context context, int surahNumber, String textValue, boolean isFlag) {
        if (this.typefaceStyle == null) {
            this.typefaceStyle = Typeface.createFromAsset(context.getResources().getAssets(), "fonts/surah_name.otf");
        }
        this.isHaveBg = isFlag;
        this.paintAyaStyle.setTypeface(this.typefaceStyle);
        this.style = value;
        this.reader = textValue;
        this.paintAya.setTextSize(0.05f);
        createStaticLayout();
    }

    public void setRect(RectF rectF) {
        this.rect = rectF;
        this.f438y = rectF.top;
        this.f437x = rectF.left;
    }

    public void setAlignment(Layout.Alignment alignment) {
        this.alignment = alignment;
    }

    public void update(RectF rectF) {
        this.rect = rectF;
        this.f438y = rectF.top;
        this.f437x = rectF.left;
        this.viewWidth = (int) rectF.width();
        this.paintAya.setTextSize(0.05f);
        createStaticLayout();
    }

    public void move() {
        this.f437x = this.rect.left;
        if (this.style == SurahNameStyle.ZAGHRAFAT.ordinal() && this.staticLayoutStyle != null) {
            this.f438y = this.rect.centerY() - ((this.staticLayoutStyle.getHeight() + this.staticLayout.getHeight()) * 0.5f);
        } else {
            this.f438y = this.rect.centerY() - (this.staticLayout.getHeight() * 0.5f);
        }
    }

    public StaticLayout getStaticLayout() {
        return this.staticLayout;
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public void setEntityQuran(EntityQuranTimeline entityQuranTimeline) {
        this.entityQuran = entityQuranTimeline;
    }

    public void draw(Canvas canvas) {
        if (this.staticLayout != null) {
            if (isHaveBg()) {
                if (this.style == SurahNameStyle.ZAGHRAFAT.ordinal()) {
                    float height = (this.staticLayout.getHeight() + (this.staticLayoutStyle.getHeight() * 0.93f)) * 0.5f;
                    canvas.drawRect(0.0f, this.rect.centerY() - height, canvas.getWidth(), this.rect.centerY() + height, this.paintBg);
                } else {
                    canvas.drawRect(0.0f, this.rect.top, canvas.getWidth(), this.rect.bottom, this.paintBg);
                }
            }
            canvas.save();
            canvas.translate(this.f437x, this.f438y);
            if (this.style == SurahNameStyle.ZAGHRAFAT.ordinal() && this.staticLayoutStyle != null) {
                if (this.mPreset == AyaTextPreset.OUTLINE.ordinal() && this.staticLayoutStyleOutline != null) {
                    this.paintAyaStyleOutline.setTextSize(this.paintAyaStyle.getTextSize());
                    this.staticLayoutStyleOutline.draw(canvas);
                }
                this.staticLayoutStyle.draw(canvas);
                canvas.translate(0.0f, this.staticLayoutStyle.getHeight() * 0.93f);
            }
            if (this.mPreset == AyaTextPreset.OUTLINE.ordinal() && this.staticLayoutOutline != null) {
                this.paintAyaOutline.setTextSize(this.paintAya.getTextSize());
                this.staticLayoutOutline.draw(canvas);
            }
            this.staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public void singleDraw(Canvas canvas) {
        if (this.staticLayout != null) {
            createStaticLayout();
            this.staticLayout.draw(canvas);
        }
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public EntityQuranTimeline getEntityQuran() {
        return this.entityQuran;
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
        return this.f437x;
    }

    public float getY() {
        return this.f438y;
    }
}
