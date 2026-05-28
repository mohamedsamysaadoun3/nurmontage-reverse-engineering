// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import android.graphics.Canvas;
import android.text.Layout$Alignment;
import android.text.StaticLayout$Builder;
import android.text.StaticLayout;
import android.text.TextPaint;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;

public class TextEntity extends EntityView
{
    private EntityQuranTimeline entityQuran;
    private boolean isVisible;
    private TextPaint paintAya;
    private StaticLayout staticLayout;
    private String txt;
    private int viewWidth;
    private float x;
    private float y;
    
    public TextEntity(final String txt, float n, final float y, final int viewWidth) {
        final boolean visible = true;
        this.paintAya = new TextPaint((int)(visible ? 1 : 0));
        this.txt = txt;
        this.x = n;
        this.y = y;
        this.setVisible(visible);
        this.viewWidth = viewWidth;
        this.paintAya.setColor(-1);
        final TextPaint paintAya = this.paintAya;
        n = viewWidth * 0.06f;
        paintAya.setTextSize(n);
        this.createStaticLayout();
    }
    
    public TextEntity(final String txt, final float x, final float y, final EntityQuranTimeline entityQuran) {
        final boolean visible = true;
        this.paintAya = new TextPaint((int)(visible ? 1 : 0));
        this.txt = txt;
        this.x = x;
        this.y = y;
        this.setVisible(visible);
        this.entityQuran = entityQuran;
    }
    
    private void createStaticLayout() {
        final String txt = this.txt;
        this.staticLayout = StaticLayout$Builder.obtain((CharSequence)txt, 0, txt.length(), this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }
    
    public void draw(final Canvas canvas) {
        if (this.staticLayout != null) {
            canvas.save();
            canvas.translate(this.x, this.y);
            this.staticLayout.draw(canvas);
            canvas.restore();
        }
    }
    
    @Override
    public void endAnimator() {
    }
    
    @Override
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
    
    @Override
    public boolean isVisible() {
        return this.isVisible;
    }
    
    @Override
    public void postTranslate(final float n, final float n2) {
    }
    
    @Override
    public void scale(final float n, final int n2, final int n3) {
    }
    
    @Override
    public void setEntityQuran(final EntityQuranTimeline entityQuran) {
        this.entityQuran = entityQuran;
    }
    
    public void setTxt(final String txt) {
        this.txt = txt;
        this.staticLayout = StaticLayout$Builder.obtain((CharSequence)txt, 0, txt.length(), this.paintAya, this.viewWidth).setAlignment(Layout$Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }
    
    @Override
    public void setVisible(final boolean isVisible) {
        this.isVisible = isVisible;
    }
    
    public void singleDraw(final Canvas canvas) {
        final StaticLayout staticLayout = this.staticLayout;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
    }
    
    public void update(final int n, final int viewWidth) {
        this.y = n * 0.67f;
        this.viewWidth = viewWidth;
        this.paintAya.setTextSize(viewWidth * 0.06f);
        this.createStaticLayout();
    }
}
