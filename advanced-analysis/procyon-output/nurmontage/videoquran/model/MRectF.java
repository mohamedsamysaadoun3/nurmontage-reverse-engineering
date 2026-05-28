// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

public class MRectF implements Serializable
{
    private float b;
    private float l;
    private float r;
    private float t;
    
    public MRectF(final float l, final float t, final float r, final float b) {
        this.l = l;
        this.t = t;
        this.r = r;
        this.b = b;
    }
    
    public float getB() {
        return this.b;
    }
    
    public float getL() {
        return this.l;
    }
    
    public float getR() {
        return this.r;
    }
    
    public float getT() {
        return this.t;
    }
    
    public void setB(final float b) {
        this.b = b;
    }
    
    public void setL(final float l) {
        this.l = l;
    }
    
    public void setR(final float r) {
        this.r = r;
    }
    
    public void setT(final float t) {
        this.t = t;
    }
}
