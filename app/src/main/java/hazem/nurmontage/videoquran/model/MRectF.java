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

    public MRectF(float f, float f2, float f3, float f4) {
        this.f434l = f;
        this.f436t = f2;
        this.f435r = f3;
        this.f433b = f4;
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

    public void setB(float f) {
        this.f433b = f;
    }

    public void setL(float f) {
        this.f434l = f;
    }

    public void setR(float f) {
        this.f435r = f;
    }

    public void setT(float f) {
        this.f436t = f;
    }
}
