// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

public class Gradient implements Serializable
{
    private int angle;
    private final int color;
    private final int second;
    private final int three;
    
    public Gradient(final int color, final int second, final int three) {
        this.angle = 81;
        this.color = color;
        this.second = second;
        this.three = three;
    }
    
    public int getAngle() {
        return this.angle;
    }
    
    public int getColor() {
        return this.color;
    }
    
    public int getSecond() {
        return this.second;
    }
    
    public int getThree() {
        return this.three;
    }
    
    public void setAngle(final int angle) {
        this.angle = angle;
    }
}
