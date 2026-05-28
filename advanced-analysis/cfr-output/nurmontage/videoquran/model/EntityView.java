/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
package hazem.nurmontage.videoquran.model;

import android.graphics.RectF;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.entity_timeline.EntityTrslTimeline;

public abstract class EntityView {
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
        float f;
        this.factor_scale = f = 1.0f;
        this.factorSize = f;
        this.factorSizeTrl = f;
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

    public abstract void postTranslate(float var1, float var2);

    public abstract void scale(float var1, int var2, int var3);

    public void setAnimTest(boolean bl) {
        this.isAnimTest = bl;
    }

    public void setCanvasWH(int n, int n2) {
        this.canvasH = n2;
        this.canvasW = n;
    }

    public void setCopyRect() {
        RectF rectF = this.getRect();
        if (rectF == null) {
            return;
        }
        float f = this.getRect().left;
        float f2 = this.canvasW;
        f /= f2;
        f2 = this.getRect().top;
        float f3 = this.canvasH;
        f2 /= f3;
        f3 = this.getRect().right;
        float f4 = this.canvasW;
        f3 /= f4;
        f4 = this.getRect().bottom;
        float f5 = this.canvasH;
        this.copyRect = rectF = new RectF(f, f2, f3, f4 /= f5);
    }

    public void setEntityQuran(EntityQuranTimeline entityQuranTimeline) {
        this.entityQuran = entityQuranTimeline;
    }

    public void setEntityTrslTimeline(EntityTrslTimeline entityTrslTimeline) {
        this.entityTrslTimeline = entityTrslTimeline;
    }

    public void setFactorSizeTrl(float f) {
        this.factorSizeTrl = f;
    }

    public void setFactor_scale(float f) {
        this.factor_scale = f;
    }

    public void setFcSize(float f) {
        this.factorSize = f;
    }

    public abstract void setVisible(boolean var1);
}

