package hazem.nurmontage.videoquran.common;

import android.graphics.RectF;

/* loaded from: classes2.dex */
public class StackEntity {
    private float end;
    protected int index_end_thumbnail;
    protected int index_start_thumbnail;
    private float left;
    private float max;
    private float offset;
    private float offset_left;
    private float offset_right;
    private RectF rectF;
    private float right;
    private float start;

    public StackEntity(RectF rectF, float f, float xPosition, float xPosition0, float xPosition0, float xPosition0, float xPosition0, float xPosition0, float floatValue8) {
        this.rectF = rectF;
        this.offset = f;
        this.end = xPosition;
        this.start = xPosition0;
        this.left = xPosition0;
        this.right = xPosition0;
        this.max = xPosition0;
        this.offset_right = f7;
        this.offset_left = floatValue8;
    }

    public float getOffset_left() {
        return this.offset_left;
    }

    public float getOffset_right() {
        return this.offset_right;
    }

    public int getIndex_start_thumbnail() {
        return this.index_start_thumbnail;
    }

    public int getIndex_end_thumbnail() {
        return this.index_end_thumbnail;
    }

    public float getOffset() {
        return this.offset;
    }

    public RectF getRectF() {
        return this.rectF;
    }

    public float getEnd() {
        return this.end;
    }

    public float getLeft() {
        return this.left;
    }

    public float getMax() {
        return this.max;
    }

    public float getRight() {
        return this.right;
    }

    public float getStart() {
        return this.start;
    }
}
