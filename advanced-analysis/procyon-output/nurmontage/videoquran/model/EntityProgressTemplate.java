// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

public class EntityProgressTemplate implements Serializable
{
    private float left;
    private float top;
    
    public EntityProgressTemplate(final float left, final float top) {
        this.left = left;
        this.top = top;
    }
    
    public float getLeft() {
        return this.left;
    }
    
    public float getTop() {
        return this.top;
    }
    
    public void setLeft(final float left) {
        this.left = left;
    }
    
    public void setTop(final float top) {
        this.top = top;
    }
}
