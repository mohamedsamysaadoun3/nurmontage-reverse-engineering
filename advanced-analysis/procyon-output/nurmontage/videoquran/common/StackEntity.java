// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.common;

import android.graphics.RectF;

public class StackEntity
{
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
    
    public StackEntity(final RectF rectF, final float offset, final float end, final float start, final float left, final float right, final float max, final float offset_right, final float offset_left) {
        this.rectF = rectF;
        this.offset = offset;
        this.end = end;
        this.start = start;
        this.left = left;
        this.right = right;
        this.max = max;
        this.offset_right = offset_right;
        this.offset_left = offset_left;
    }
    
    public float getEnd() {
        return this.end;
    }
    
    public int getIndex_end_thumbnail() {
        return this.index_end_thumbnail;
    }
    
    public int getIndex_start_thumbnail() {
        return this.index_start_thumbnail;
    }
    
    public float getLeft() {
        return this.left;
    }
    
    public float getMax() {
        return this.max;
    }
    
    public float getOffset() {
        return this.offset;
    }
    
    public float getOffset_left() {
        return this.offset_left;
    }
    
    public float getOffset_right() {
        return this.offset_right;
    }
    
    public RectF getRectF() {
        return this.rectF;
    }
    
    public float getRight() {
        return this.right;
    }
    
    public float getStart() {
        return this.start;
    }
}
