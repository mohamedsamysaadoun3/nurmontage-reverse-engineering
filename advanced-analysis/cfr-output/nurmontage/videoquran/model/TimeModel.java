/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

public class TimeModel
implements Serializable {
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

    public TimeModel(int n, int n2, float f, String string2, float f2, float f3, int n3) {
        this.size = f;
        this.color = string2;
        this.posY = f2;
        this.posXRight = f3;
        this.progress_offset = n3;
        this.width_bitmap_progress = n;
        this.height_bitmap_progress = n2;
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

    public void setColor(String string2) {
        this.color = string2;
    }

    public void setHeightShape(int n) {
        this.heightShape = n;
    }

    public void setHeight_bitmap_progress(int n) {
        this.height_bitmap_progress = n;
    }

    public void setPosXRight(float f) {
        this.posXRight = f;
    }

    public void setPosY(float f) {
        this.posY = f;
    }

    public void setProgress_offset(int n) {
        this.progress_offset = n;
    }

    public void setSize(float f) {
        this.size = f;
    }

    public void setStartShape(float f) {
        this.startShape = f;
    }

    public void setWidthShape(int n) {
        this.widthShape = n;
    }

    public void setWidth_bitmap_progress(int n) {
        this.width_bitmap_progress = n;
    }
}

