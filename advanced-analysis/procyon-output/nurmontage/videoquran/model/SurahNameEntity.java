// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import hazem.nurmontage.videoquran.constant.IpadType;
import androidx.core.graphics.ColorUtils;
import android.graphics.Paint$Style;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import android.text.TextDirectionHeuristics;
import android.text.StaticLayout$Builder;
import android.graphics.Paint;
import android.text.SpannableString;
import hazem.nurmontage.videoquran.constant.SurahNameStyle;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextPaint;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import android.text.Layout$Alignment;
import java.io.Serializable;

public class SurahNameEntity extends EntityView implements Serializable
{
    private Layout$Alignment alignment;
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
    
    public SurahNameEntity(final Layout$Alignment alignment, final String name, final String reader, final RectF rect, final Typeface typeface, final int n, final float factor_scale, final String nameFont, final int mPreset, final Typeface typefaceStyle, final int style, final int index_surah, final int ipad_type, final boolean isHaveBg, final int n2) {
        final String s = "";
        this.name = s;
        this.reader = s;
        this.nameFont = "\u062e\u0637 \u0627\u0644\u0625\u0628\u0644.otf";
        final int visible = 1;
        final TextPaint paintAya = new TextPaint(visible);
        this.paintAya = paintAya;
        final TextPaint paintBg = new TextPaint(visible);
        this.paintBg = paintBg;
        final TextPaint paintAyaStyle = new TextPaint(visible);
        this.paintAyaStyle = paintAyaStyle;
        this.paintAyaStyleOutline = new TextPaint(visible);
        this.paintAyaOutline = new TextPaint(visible);
        this.setFactor_scale(factor_scale);
        this.clrBg = n2;
        this.isHaveBg = isHaveBg;
        this.setIpad_type(ipad_type);
        this.style = style;
        this.index_surah = index_surah;
        this.setupSurahFont();
        paintAyaStyle.setTypeface(this.typefaceStyle = typefaceStyle);
        this.name = name;
        this.mPreset = mPreset;
        this.reader = reader;
        this.x = rect.left;
        this.y = rect.top;
        this.rect = rect;
        this.setVisible((boolean)(visible != 0));
        this.viewWidth = (int)rect.width();
        paintAya.setTypeface(typeface);
        paintAya.setColor(n);
        paintAyaStyle.setColor(paintAya.getColor());
        paintBg.setColor(n2);
        paintBg.setAlpha(180);
        this.setClrS_name(n);
        paintAya.setTextSize(0.05f);
        this.nameFont = nameFont;
        this.alignment = alignment;
        if (this.getFactor_scale() != 1.0f) {
            this.scale(this.getFactor_scale(), visible, visible);
        }
        else {
            this.createStaticLayout();
        }
    }
    
    private void createStaticLayout() {
        String str;
        if (this.style == SurahNameStyle.ZAGHRAFAT.ordinal()) {
            str = this.reader;
        }
        else {
            str = this.name;
            if (this.reader.length() > 3) {
                str = str + "\n" + this.reader;
            }
        }
        final SpannableString spannableString = new SpannableString((CharSequence)str);
        final int style = this.style;
        final int ordinal = SurahNameStyle.ZAGHRAFAT.ordinal();
        final float n = 1.0f;
        final float n2 = 0.5f;
        Layout$Alignment alignment;
        if (style == ordinal) {
            final TextPaint paintAyaStyle = this.paintAyaStyle;
            final String name_style = this.name_style;
            final float n3 = (float)this.viewWidth;
            final float n4 = 0.9f;
            paintAyaStyle.setTextSize(this.calculateTextSize(name_style, (Paint)paintAyaStyle, (int)(n3 * n4), (int)(this.rect.height() * n2)));
            final String name_style2 = this.name_style;
            this.staticLayoutStyle = StaticLayout$Builder.obtain((CharSequence)name_style2, 0, name_style2.length(), this.paintAyaStyle, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, n).setTextDirection(TextDirectionHeuristics.LTR).setIncludePad(false).build();
            alignment = Layout$Alignment.ALIGN_CENTER;
            final TextPaint paintAya = this.paintAya;
            paintAya.setTextSize(this.calculateTextSize(this.reader, (Paint)paintAya, (int)(this.viewWidth * n4), (int)(this.rect.height() * 0.4f)));
        }
        else {
            alignment = this.alignment;
            final int length = this.name.length();
            final int length2 = this.reader.length();
            final float n5 = 0.8f;
            if (length > length2) {
                final TextPaint paintAya2 = this.paintAya;
                paintAya2.setTextSize(this.calculateTextSize(this.name, (Paint)paintAya2, (int)(this.viewWidth * n5), (int)(this.rect.height() * n5)));
            }
            else {
                final TextPaint paintAya3 = this.paintAya;
                paintAya3.setTextSize(this.calculateTextSize(this.reader, (Paint)paintAya3, (int)(this.viewWidth * n5), (int)(this.rect.height() * n5)));
            }
        }
        this.staticLayout = StaticLayout$Builder.obtain((CharSequence)spannableString, 0, spannableString.length(), this.paintAya, this.viewWidth).setAlignment(alignment).setLineSpacing(0.0f, n).setTextDirection(TextDirectionHeuristics.LTR).setIncludePad(false).build();
        this.setPreset(this.get(this.getmPreset()));
        if (this.style == SurahNameStyle.ZAGHRAFAT.ordinal() && this.staticLayoutStyle != null) {
            this.y = this.rect.centerY() - (this.staticLayoutStyle.getHeight() + this.staticLayout.getHeight()) * n2;
        }
        else {
            this.y = this.rect.centerY() - this.staticLayout.getHeight() * n2;
        }
    }
    
    private StaticLayout getStaticLayoutOutline() {
        final int style = this.style;
        final int ordinal = SurahNameStyle.ZAGHRAFAT.ordinal();
        final float n = 1.0f;
        if (style == ordinal) {
            final String reader = this.reader;
            return StaticLayout$Builder.obtain((CharSequence)reader, 0, reader.length(), this.paintAyaOutline, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, n).setTextDirection(TextDirectionHeuristics.LTR).setIncludePad(false).build();
        }
        String str = this.name;
        if (this.reader.length() > 3) {
            str = str + "\n" + this.reader;
        }
        return StaticLayout$Builder.obtain((CharSequence)str, 0, str.length(), this.paintAyaOutline, this.viewWidth).setAlignment(this.alignment).setLineSpacing(0.0f, n).setTextDirection(TextDirectionHeuristics.LTR).setIncludePad(false).build();
    }
    
    private StaticLayout getStaticLayoutStyleOutline() {
        final String name_style = this.name_style;
        return StaticLayout$Builder.obtain((CharSequence)name_style, 0, name_style.length(), this.paintAyaStyleOutline, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setTextDirection(TextDirectionHeuristics.LTR).setIncludePad(false).build();
    }
    
    private void updatePaintStyle() {
        if (this.staticLayoutStyle != null) {
            final float textSize = this.paintAyaStyle.getTextSize();
            this.paintAyaStyle.reset();
            this.paintAyaStyle.set(this.paintAya);
            this.paintAyaStyle.setTypeface(this.typefaceStyle);
            this.paintAyaStyle.setTextSize(textSize);
        }
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
        if (this.style == SurahNameStyle.ZAGHRAFAT.ordinal()) {
            if (this.paintAyaStyleOutline == paint) {
                n *= 0.5f;
            }
            if (this.paintAyaOutline == paint) {
                n *= 1.3f;
            }
        }
        final int n2 = SurahNameEntity$1.$SwitchMap$hazem$nurmontage$videoquran$constant$AyaTextPreset[ayaTextPreset.ordinal()];
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
                Label_0351: {
                    if (ipad_type != color) {
                        final int ipad_type2 = this.ipad_type;
                        color = IpadType.BATTERY.ordinal();
                        if (ipad_type2 != color) {
                            final int ipad_type3 = this.ipad_type;
                            color = IpadType.BLUE_TYPE.ordinal();
                            if (ipad_type3 != color) {
                                if (!this.isHaveBg()) {
                                    n3 = -16777216;
                                    break Label_0351;
                                }
                            }
                        }
                    }
                    n3 = -1;
                }
                color = 1043878380;
                final float n4 = 0.18f * n;
                n *= 0.08f;
                paint.setShadowLayer(n4, n, n, ColorUtils.setAlphaComponent(n3, 180));
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
            if (ipad_type4 != ordinal && this.ipad_type != IpadType.BATTERY.ordinal() && this.ipad_type != IpadType.BLUE_TYPE.ordinal() && !this.isHaveBg()) {
                paint.setColor(hazem.nurmontage.videoquran.Utils.ColorUtils.darkenColor(color, n));
            }
            else {
                paint.setColor(hazem.nurmontage.videoquran.Utils.ColorUtils.lightenColor(color, n));
            }
        }
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
    
    public void draw(final Canvas canvas) {
        if (this.staticLayout != null) {
            final boolean haveBg = this.isHaveBg();
            final float n = 0.93f;
            if (haveBg) {
                if (this.style == SurahNameStyle.ZAGHRAFAT.ordinal()) {
                    final float n2 = (this.staticLayout.getHeight() + this.staticLayoutStyle.getHeight() * n) * 0.5f;
                    canvas.drawRect(0.0f, this.rect.centerY() - n2, (float)canvas.getWidth(), this.rect.centerY() + n2, (Paint)this.paintBg);
                }
                else {
                    canvas.drawRect(0.0f, this.rect.top, (float)canvas.getWidth(), this.rect.bottom, (Paint)this.paintBg);
                }
            }
            canvas.save();
            canvas.translate(this.x, this.y);
            if (this.style == SurahNameStyle.ZAGHRAFAT.ordinal() && this.staticLayoutStyle != null) {
                if (this.mPreset == AyaTextPreset.OUTLINE.ordinal() && this.staticLayoutStyleOutline != null) {
                    this.paintAyaStyleOutline.setTextSize(this.paintAyaStyle.getTextSize());
                    this.staticLayoutStyleOutline.draw(canvas);
                }
                this.staticLayoutStyle.draw(canvas);
                canvas.translate(0.0f, this.staticLayoutStyle.getHeight() * n);
            }
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
    
    public int getClrBg() {
        return this.clrBg;
    }
    
    public int getClrS_name() {
        return this.clrS_name;
    }
    
    @Override
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
    
    public void initPreset(final int n) {
        this.setPreset(this.get(n));
    }
    
    public boolean isHaveBg() {
        return this.isHaveBg;
    }
    
    @Override
    public boolean isVisible() {
        return this.isVisible;
    }
    
    public void move() {
        this.x = this.rect.left;
        final int style = this.style;
        final int ordinal = SurahNameStyle.ZAGHRAFAT.ordinal();
        final float n = 0.5f;
        if (style == ordinal && this.staticLayoutStyle != null) {
            this.y = this.rect.centerY() - (this.staticLayoutStyle.getHeight() + this.staticLayout.getHeight()) * n;
        }
        else {
            this.y = this.rect.centerY() - this.staticLayout.getHeight() * n;
        }
    }
    
    @Override
    public void postTranslate(float y, float n) {
        this.rect.offset(y, n);
        y = this.rect.left;
        this.x = y;
        final int style = this.style;
        final int ordinal = SurahNameStyle.ZAGHRAFAT.ordinal();
        final float n2 = 0.5f;
        if (style == ordinal && this.staticLayoutStyle != null) {
            y = this.rect.centerY();
            n = (this.staticLayoutStyle.getHeight() + this.staticLayout.getHeight()) * n2;
            y -= n;
            this.y = y;
        }
        else {
            y = this.rect.centerY();
            n = this.staticLayout.getHeight() * n2;
            y -= n;
            this.y = y;
        }
    }
    
    @Override
    public void scale(float left, final int n, final int n2) {
        this.setFactor_scale(left);
        final float n3 = this.rect.width() * left;
        final float n4 = this.rect.height() * left;
        left = 0.5f;
        final float n5 = n3 * left;
        this.rect.left = this.rect.centerX() - n5;
        this.rect.right = this.rect.centerX() + n5;
        final float n6 = n4 * left;
        this.rect.top = this.rect.centerY() - n6;
        this.rect.bottom = this.rect.centerY() + n6;
        this.viewWidth = (int)this.rect.width();
        this.createStaticLayout();
        left = this.rect.left;
        this.x = left;
    }
    
    public void setAlignment(final Layout$Alignment alignment) {
        this.alignment = alignment;
    }
    
    public void setClrBg(final int n) {
        this.clrBg = n;
        this.paintBg.setColor(n);
        this.paintBg.setAlpha(180);
    }
    
    public void setClrS_name(final int clrS_name) {
        this.clrS_name = clrS_name;
    }
    
    public void setColor(final int color) {
        this.setClrS_name(color);
        this.paintAya.setColor(color);
        this.paintAyaStyle.setColor(color);
    }
    
    @Override
    public void setEntityQuran(final EntityQuranTimeline entityQuran) {
        this.entityQuran = entityQuran;
    }
    
    public void setIndex_surah(final int index_surah) {
        this.index_surah = index_surah;
        this.setupSurahFont();
    }
    
    public void setIpad_type(final int ipad_type) {
        this.ipad_type = ipad_type;
    }
    
    public void setNameAndReader(final Layout$Alignment alignment, final String name, final String reader) {
        this.name = name;
        this.reader = reader;
        this.alignment = alignment;
        this.paintAya.setTextSize(0.05f);
        this.createStaticLayout();
    }
    
    public void setPreset(final AyaTextPreset ayaTextPreset) {
        this.mPreset = ayaTextPreset.ordinal();
        if (ayaTextPreset == AyaTextPreset.OUTLINE) {
            this.applyAyaPreset((Paint)this.paintAyaStyleOutline, AyaTextPreset.OUTLINE, this.clrS_name, this.paintAyaStyle.getTypeface(), this.paintAyaStyle.getTextSize());
            this.staticLayoutStyleOutline = this.getStaticLayoutStyleOutline();
            this.applyAyaPreset((Paint)this.paintAyaStyle, AyaTextPreset.NONE, this.clrS_name, this.paintAyaStyle.getTypeface(), this.paintAyaStyle.getTextSize());
            this.applyAyaPreset((Paint)this.paintAyaOutline, AyaTextPreset.OUTLINE, this.clrS_name, this.paintAya.getTypeface(), this.paintAya.getTextSize());
            this.staticLayoutOutline = this.getStaticLayoutOutline();
            this.applyAyaPreset((Paint)this.paintAya, AyaTextPreset.NONE, this.clrS_name, this.paintAya.getTypeface(), this.paintAya.getTextSize());
        }
        else {
            final TextPaint paintAya = this.paintAya;
            this.applyAyaPreset((Paint)paintAya, ayaTextPreset, this.clrS_name, paintAya.getTypeface(), this.paintAya.getTextSize());
            this.updatePaintStyle();
        }
    }
    
    public void setRect(final RectF rect) {
        this.rect = rect;
        this.y = rect.top;
        this.x = rect.left;
    }
    
    public void setStyle(final Context context, final int style, final String reader, final boolean isHaveBg) {
        if (this.typefaceStyle == null) {
            this.typefaceStyle = Typeface.createFromAsset(context.getResources().getAssets(), "fonts/surah_name.otf");
        }
        this.isHaveBg = isHaveBg;
        this.paintAyaStyle.setTypeface(this.typefaceStyle);
        this.style = style;
        this.reader = reader;
        this.paintAya.setTextSize(0.05f);
        this.createStaticLayout();
    }
    
    public void setTypeface(final Typeface typeface, final String nameFont) {
        this.paintAya.setTypeface(typeface);
        this.nameFont = nameFont;
        this.createStaticLayout();
    }
    
    @Override
    public void setVisible(final boolean isVisible) {
        this.isVisible = isVisible;
    }
    
    public void setupSurahFont() {
        final int index_surah = this.index_surah;
        final int n = 10;
        final String str = "sura";
        if (index_surah < n) {
            this.name_style = "00" + this.index_surah + str;
        }
        else if (index_surah < 100) {
            this.name_style = "0" + this.index_surah + str;
        }
        else {
            this.name_style = this.index_surah + str;
        }
    }
    
    public void singleDraw(final Canvas canvas) {
        if (this.staticLayout != null) {
            this.createStaticLayout();
            this.staticLayout.draw(canvas);
        }
    }
    
    public void update(final RectF rect) {
        this.rect = rect;
        this.y = rect.top;
        this.x = rect.left;
        this.viewWidth = (int)rect.width();
        this.paintAya.setTextSize(0.05f);
        this.createStaticLayout();
    }
}
