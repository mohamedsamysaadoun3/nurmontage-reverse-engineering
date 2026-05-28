package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class MRectF implements Serializable {

    /* renamed from: b */
    private float f433b;

    /* renamed from: l */
    private float f434l;

    /* renamed from: r */
    private float f435r;

    /* renamed from: t */
    private float f436t;

    public MRectF(float floatValue, float value, float value0, float floatValue4) {
        this.f434l = floatValue;
        this.f436t = value;
        this.f435r = value0;
        this.f433b = floatValue4;
    }

    public float getT() {
        return this.f436t;
    }

    public float getL() {
        return this.f434l;
    }

    public float getB() {
        return this.f433b;
    }

    public float getR() {
        return this.f435r;
    }

    public void setB(float floatValue) {
        this.f433b = floatValue;
    }

    public void setL(float floatValue) {
        this.f434l = floatValue;
    }

    public void setR(float floatValue) {
        this.f435r = floatValue;
    }

    public void setT(float floatValue) {
        this.f436t = floatValue;
    }
}
