// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

public class SquareBitmapModel implements Serializable
{
    private float bottom;
    private float height_square;
    private float lef_square;
    private float posX;
    private float posY;
    private float raduis;
    private float right;
    private float top_square;
    private float width_sqaure;
    
    public SquareBitmapModel() {
        final float n = 50.0f;
        this.height_square = n;
        this.width_sqaure = n;
    }
    
    public SquareBitmapModel(final float lef_square, final float top_square, final float right, final float bottom, final float width_sqaure, final float height_square, final float raduis) {
        this.height_square = height_square;
        this.width_sqaure = width_sqaure;
        this.top_square = top_square;
        this.lef_square = lef_square;
        this.raduis = raduis;
        this.right = right;
        this.bottom = bottom;
    }
    
    public float getBottom() {
        return this.bottom;
    }
    
    public float getHeight_square() {
        return this.height_square;
    }
    
    public float getLef_square() {
        return this.lef_square;
    }
    
    public float getPosX() {
        return this.posX;
    }
    
    public float getPosY() {
        return this.posY;
    }
    
    public float getRaduis() {
        return this.raduis;
    }
    
    public float getRight() {
        return this.right;
    }
    
    public float getTop_square() {
        return this.top_square;
    }
    
    public float getWidth_sqaure() {
        return this.width_sqaure;
    }
    
    public void set(final float posX, final float posY, final float lef_square, final float top_square, final float right, final float bottom, final float width_sqaure, final float height_square, final float raduis) {
        this.height_square = height_square;
        this.width_sqaure = width_sqaure;
        this.top_square = top_square;
        this.lef_square = lef_square;
        this.raduis = raduis;
        this.posX = posX;
        this.posY = posY;
        this.right = right;
        this.bottom = bottom;
    }
    
    public void setHeight_square(final float height_square) {
        this.height_square = height_square;
    }
    
    public void setLef_square(final float lef_square) {
        this.lef_square = lef_square;
    }
    
    public void setRaduis(final float raduis) {
        this.raduis = raduis;
    }
    
    public void setTop_square(final float top_square) {
        this.top_square = top_square;
    }
    
    public void setWidth_sqaure(final float width_sqaure) {
        this.width_sqaure = width_sqaure;
    }
}
