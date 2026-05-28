package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class EntityProgressTemplate implements Serializable {
    private float left;
    private float top;

    public EntityProgressTemplate(float floatValue, float floatValue2) {
        this.left = floatValue;
        this.top = floatValue2;
    }

    public float getTop() {
        return this.top;
    }

    public float getLeft() {
        return this.left;
    }

    public void setLeft(float floatValue) {
        this.left = floatValue;
    }

    public void setTop(float floatValue) {
        this.top = floatValue;
    }
}
