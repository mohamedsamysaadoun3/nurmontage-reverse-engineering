// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

public class TimeModel implements Serializable
{
    private String color;
    private int heightShape;
    private int height_bitmap_progress;
    private float posXRight;
    private float posY;
    private int progress_offset;
    private float size;
    private float startShape;
    private int widthShape;
    private int width_bitmap_progress;
    
    public TimeModel(final int width_bitmap_progress, final int height_bitmap_progress, final float size, final String color, final float posY, final float posXRight, final int progress_offset) {
        this.size = size;
        this.color = color;
        this.posY = posY;
        this.posXRight = posXRight;
        this.progress_offset = progress_offset;
        this.width_bitmap_progress = width_bitmap_progress;
        this.height_bitmap_progress = height_bitmap_progress;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public int getHeightShape() {
        return this.heightShape;
    }
    
    public int getHeight_bitmap_progress() {
        return this.height_bitmap_progress;
    }
    
    public float getPosXRight() {
        return this.posXRight;
    }
    
    public float getPosY() {
        return this.posY;
    }
    
    public int getProgress_offset() {
        return this.progress_offset;
    }
    
    public float getSize() {
        return this.size;
    }
    
    public float getStartShape() {
        return this.startShape;
    }
    
    public int getWidthShape() {
        return this.widthShape;
    }
    
    public int getWidth_bitmap_progress() {
        return this.width_bitmap_progress;
    }
    
    public void setColor(final String color) {
        this.color = color;
    }
    
    public void setHeightShape(final int heightShape) {
        this.heightShape = heightShape;
    }
    
    public void setHeight_bitmap_progress(final int height_bitmap_progress) {
        this.height_bitmap_progress = height_bitmap_progress;
    }
    
    public void setPosXRight(final float posXRight) {
        this.posXRight = posXRight;
    }
    
    public void setPosY(final float posY) {
        this.posY = posY;
    }
    
    public void setProgress_offset(final int progress_offset) {
        this.progress_offset = progress_offset;
    }
    
    public void setSize(final float size) {
        this.size = size;
    }
    
    public void setStartShape(final float startShape) {
        this.startShape = startShape;
    }
    
    public void setWidthShape(final int widthShape) {
        this.widthShape = widthShape;
    }
    
    public void setWidth_bitmap_progress(final int width_bitmap_progress) {
        this.width_bitmap_progress = width_bitmap_progress;
    }
}
