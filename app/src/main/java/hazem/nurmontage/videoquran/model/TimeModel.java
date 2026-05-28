package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class TimeModel implements Serializable {
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

    public TimeModel(int dimension, int i2, float floatValue, String textValue, float progressValue, float floatValue3, int duration3) {
        this.size = floatValue;
        this.color = textValue;
        this.posY = progressValue;
        this.posXRight = floatValue3;
        this.progress_offset = duration3;
        this.width_bitmap_progress = dimension;
        this.height_bitmap_progress = i2;
    }

    public void setHeight_bitmap_progress(int dimension) {
        this.height_bitmap_progress = dimension;
    }

    public int getHeight_bitmap_progress() {
        return this.height_bitmap_progress;
    }

    public int getHeightShape() {
        return this.heightShape;
    }

    public float getStartShape() {
        return this.startShape;
    }

    public void setHeightShape(int dimension) {
        this.heightShape = dimension;
    }

    public void setWidthShape(int dimension) {
        this.widthShape = dimension;
    }

    public int getWidthShape() {
        return this.widthShape;
    }

    public void setStartShape(float floatValue) {
        this.startShape = floatValue;
    }

    public int getProgress_offset() {
        return this.progress_offset;
    }

    public void setProgress_offset(int dimension) {
        this.progress_offset = dimension;
    }

    public void setWidth_bitmap_progress(int dimension) {
        this.width_bitmap_progress = dimension;
    }

    public int getWidth_bitmap_progress() {
        return this.width_bitmap_progress;
    }

    public float getPosXRight() {
        return this.posXRight;
    }

    public float getPosY() {
        return this.posY;
    }

    public float getSize() {
        return this.size;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String textValue) {
        this.color = textValue;
    }

    public void setPosXRight(float floatValue) {
        this.posXRight = floatValue;
    }

    public void setPosY(float floatValue) {
        this.posY = floatValue;
    }

    public void setSize(float floatValue) {
        this.size = floatValue;
    }
}
