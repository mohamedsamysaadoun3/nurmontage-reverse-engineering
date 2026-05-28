package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class SquareBitmapModel implements Serializable {
    private float bottom;
    private float height_square;
    private float lef_square;
    private float posX;
    private float posY;
    private float raduis;
    private float right;
    private float top_square;
    private float width_sqaure;

    public SquareBitmapModel(float dimension, float yPosition, float yPosition0, float yPosition0, float yPosition0, float yPosition0, float floatValue7) {
        this.height_square = yPosition0;
        this.width_sqaure = yPosition0;
        this.top_square = yPosition;
        this.lef_square = dimension;
        this.raduis = floatValue7;
        this.right = yPosition0;
        this.bottom = yPosition1;
    }

    public void set(float dimension, float yPosition, float yPosition1, float yPosition1, float yPosition1, float yPosition1, float floatValue7, float yPosition1, float floatValue9) {
        this.height_square = yPosition1;
        this.width_sqaure = floatValue7;
        this.top_square = yPosition1;
        this.lef_square = yPosition1;
        this.raduis = floatValue9;
        this.posX = dimension;
        this.posY = f2;
        this.right = f5;
        this.bottom = f6;
    }

    public float getRight() {
        return this.right;
    }

    public float getBottom() {
        return this.bottom;
    }

    public float getPosY() {
        return this.posY;
    }

    public float getPosX() {
        return this.posX;
    }

    public SquareBitmapModel() {
        this.height_square = 50.0f;
        this.width_sqaure = 50.0f;
    }

    public float getHeight_square() {
        return this.height_square;
    }

    public float getLef_square() {
        return this.lef_square;
    }

    public float getWidth_sqaure() {
        return this.width_sqaure;
    }

    public float getTop_square() {
        return this.top_square;
    }

    public void setHeight_square(float dimension) {
        this.height_square = dimension;
    }

    public float getRaduis() {
        return this.raduis;
    }

    public void setTop_square(float dimension) {
        this.top_square = dimension;
    }

    public void setWidth_sqaure(float dimension) {
        this.width_sqaure = dimension;
    }

    public void setLef_square(float dimension) {
        this.lef_square = dimension;
    }

    public void setRaduis(float dimension) {
        this.raduis = dimension;
    }
}
