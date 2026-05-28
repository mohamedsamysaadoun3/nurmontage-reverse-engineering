/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

public class Gradient
implements Serializable {
    private int angle = 81;
    private final int color;
    private final int second;
    private final int three;

    public Gradient(int n, int n2, int n3) {
        this.color = n;
        this.second = n2;
        this.three = n3;
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

    public void setAngle(int n) {
        this.angle = n;
    }
}

