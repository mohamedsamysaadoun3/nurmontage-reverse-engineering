package hazem.nurmontage.videoquran.model;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;

/* loaded from: classes2.dex */
public class TextEntity extends EntityView {
    private EntityQuranTimeline entityQuran;
    private boolean isVisible;
    private TextPaint paintAya = new TextPaint(1);
    private StaticLayout staticLayout;
    private String txt;
    private int viewWidth;

    /* renamed from: x */
    private float f439x;

    /* renamed from: y */
    private float f440y;

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public void endAnimator() {
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public void postTranslate(float scale, float floatValue2) {
    }

    @Override // hazem.nurmontage.videoquran.model.EntityView
    public void scale(float scale, int value, int value2) {
    }

    public void setTxt(String textValue) {
        this.txt = textValue;
        this.staticLayout = StaticLayout.Builder.obtain(textValue, 0, textValue.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    private void createStaticLayout() {
        String textValue = this.txt;
        this.staticLayout = StaticLayout.Builder.obtain(textValue, 0, textValue.length(), this.paintAya, this.viewWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    public TextEntity(String textValue, float scale, float floatValue2, EntityQuranTimeline entityQuranTimeline) {
        this.txt = textValue;
        this.f439x = scale;
        this.f440y = floatValue2;
        setVisible(true);
        this.entityQuran = entityQuranTimeline;
    }

    public TextEntity(String textValue, float scale, float floatValue2, int value) {
        this.txt = textValue;
        this.f439x = scale;
        this.f440y = floatValue2;
        setVisible(true);
        this.viewWidth = value;
        this.paintAya.setColor(-1);
        this.paintAya.setTextSize(value * 0.06f);
        createStaticLayout();
    }

    public void update(int value, int value2) {
        this.f440y = value * 0.67f;
        this.viewWidth = value2;
        this.paintAya.setTextSize(value2 * 0.06f);
        createStaticLayout();
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
            canvas.save();
            canvas.translate(this.f439x, this.f440y);
            this.staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public void singleDraw(Canvas canvas) {
        StaticLayout staticLayout = this.staticLayout;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
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
    public void setVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    public float getX() {
        return this.f439x;
    }

    public float getY() {
        return this.f440y;
    }

    public String getTxt() {
        return this.txt;
    }
}
