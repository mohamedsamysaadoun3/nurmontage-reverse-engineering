// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.entity_timeline.EntityTrslTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import android.graphics.RectF;

public abstract class EntityView
{
    private int canvasH;
    private int canvasW;
    private RectF copyRect;
    private EntityQuranTimeline entityQuran;
    private EntityTrslTimeline entityTrslTimeline;
    private float factorSize;
    private float factorSizeTrl;
    private float factor_scale;
    private boolean isAnimTest;
    protected int max_h;
    protected int max_w;
    protected RectF rect;
    protected float x;
    protected float y;
    
    public EntityView() {
        final float factorSizeTrl = 1.0f;
        this.factor_scale = factorSizeTrl;
        this.factorSize = factorSizeTrl;
        this.factorSizeTrl = factorSizeTrl;
    }
    
    public abstract void endAnimator();
    
    public int getCanvasH() {
        return this.canvasH;
    }
    
    public int getCanvasW() {
        return this.canvasW;
    }
    
    public RectF getCopyRect() {
        return this.copyRect;
    }
    
    public EntityQuranTimeline getEntityQuran() {
        return this.entityQuran;
    }
    
    public EntityTrslTimeline getEntityTrslTimeline() {
        return this.entityTrslTimeline;
    }
    
    public float getFactorSize() {
        return this.factorSize;
    }
    
    public float getFactorSizeTrl() {
        return this.factorSizeTrl;
    }
    
    public float getFactor_scale() {
        return this.factor_scale;
    }
    
    public int getMax_h() {
        return this.max_h;
    }
    
    public int getMax_w() {
        return this.max_w;
    }
    
    public RectF getRect() {
        return this.rect;
    }
    
    public boolean isAnimTest() {
        return this.isAnimTest;
    }
    
    public abstract boolean isVisible();
    
    public abstract void postTranslate(final float p0, final float p1);
    
    public abstract void scale(final float p0, final int p1, final int p2);
    
    public void setAnimTest(final boolean isAnimTest) {
        this.isAnimTest = isAnimTest;
    }
    
    public void setCanvasWH(final int canvasW, final int canvasH) {
        this.canvasH = canvasH;
        this.canvasW = canvasW;
    }
    
    public void setCopyRect() {
        if (this.getRect() == null) {
            return;
        }
        this.copyRect = new RectF(this.getRect().left / this.canvasW, this.getRect().top / this.canvasH, this.getRect().right / this.canvasW, this.getRect().bottom / this.canvasH);
    }
    
    public void setEntityQuran(final EntityQuranTimeline entityQuran) {
        this.entityQuran = entityQuran;
    }
    
    public void setEntityTrslTimeline(final EntityTrslTimeline entityTrslTimeline) {
        this.entityTrslTimeline = entityTrslTimeline;
    }
    
    public void setFactorSizeTrl(final float factorSizeTrl) {
        this.factorSizeTrl = factorSizeTrl;
    }
    
    public void setFactor_scale(final float factor_scale) {
        this.factor_scale = factor_scale;
    }
    
    public void setFcSize(final float factorSize) {
        this.factorSize = factorSize;
    }
    
    public abstract void setVisible(final boolean p0);
}
