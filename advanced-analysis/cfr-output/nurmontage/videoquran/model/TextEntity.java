/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout
 *  android.text.StaticLayout$Builder
 *  android.text.TextPaint
 */
package hazem.nurmontage.videoquran.model;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.model.EntityView;

public class TextEntity
extends EntityView {
    private EntityQuranTimeline entityQuran;
    private boolean isVisible;
    private TextPaint paintAya;
    private StaticLayout staticLayout;
    private String txt;
    private int viewWidth;
    private float x;
    private float y;

    public TextEntity(String string2, float f, float f2, int n) {
        TextPaint textPaint;
        boolean bl = true;
        this.paintAya = textPaint = new TextPaint(bl ? 1 : 0);
        this.txt = string2;
        this.x = f;
        this.y = f2;
        this.setVisible(bl);
        this.viewWidth = n;
        this.paintAya.setColor(-1);
        string2 = this.paintAya;
        f = (float)n * 0.06f;
        string2.setTextSize(f);
        this.createStaticLayout();
    }

    public TextEntity(String string2, float f, float f2, EntityQuranTimeline entityQuranTimeline) {
        TextPaint textPaint;
        boolean bl = true;
        this.paintAya = textPaint = new TextPaint(bl ? 1 : 0);
        this.txt = string2;
        this.x = f;
        this.y = f2;
        this.setVisible(bl);
        this.entityQuran = entityQuranTimeline;
    }

    private void createStaticLayout() {
        String string2 = this.txt;
        int n = string2.length();
        TextPaint textPaint = this.paintAya;
        int n2 = this.viewWidth;
        string2 = StaticLayout.Builder.obtain((CharSequence)string2, (int)0, (int)n, (TextPaint)textPaint, (int)n2);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        string2 = string2.setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = string2;
    }

    public void draw(Canvas canvas) {
        StaticLayout staticLayout = this.staticLayout;
        if (staticLayout != null) {
            canvas.save();
            float f = this.x;
            float f2 = this.y;
            canvas.translate(f, f2);
            staticLayout = this.staticLayout;
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public void endAnimator() {
    }

    public EntityQuranTimeline getEntityQuran() {
        return this.entityQuran;
    }

    public StaticLayout getStaticLayout() {
        return this.staticLayout;
    }

    public String getTxt() {
        return this.txt;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void postTranslate(float f, float f2) {
    }

    public void scale(float f, int n, int n2) {
    }

    public void setEntityQuran(EntityQuranTimeline entityQuranTimeline) {
        this.entityQuran = entityQuranTimeline;
    }

    public void setTxt(String string2) {
        this.txt = string2;
        int n = string2.length();
        TextPaint textPaint = this.paintAya;
        int n2 = this.viewWidth;
        string2 = StaticLayout.Builder.obtain((CharSequence)string2, (int)0, (int)n, (TextPaint)textPaint, (int)n2);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        string2 = string2.setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        this.staticLayout = string2;
    }

    public void setVisible(boolean bl) {
        this.isVisible = bl;
    }

    public void singleDraw(Canvas canvas) {
        StaticLayout staticLayout = this.staticLayout;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
    }

    public void update(int n, int n2) {
        float f;
        this.y = f = (float)n * 0.67f;
        this.viewWidth = n2;
        TextPaint textPaint = this.paintAya;
        float f2 = (float)n2 * 0.06f;
        textPaint.setTextSize(f2);
        this.createStaticLayout();
    }
}

