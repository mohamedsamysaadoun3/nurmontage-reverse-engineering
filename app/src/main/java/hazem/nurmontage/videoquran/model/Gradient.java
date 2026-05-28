package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class Gradient implements Serializable {
    private int angle = 81;
    private final int color;
    private final int second;
    private final int three;

    public Gradient(int value, int i2, int value3) {
        this.color = value;
        this.second = i2;
        this.three = value3;
    }

    public void setAngle(int value) {
        this.angle = value;
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
}
