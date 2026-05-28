/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

public class EntityProgressTemplate
implements Serializable {
    private float left;
    private float top;

    public EntityProgressTemplate(float f, float f2) {
        this.left = f;
        this.top = f2;
    }

    public float getLeft() {
        return this.left;
    }

    public float getTop() {
        return this.top;
    }

    public void setLeft(float f) {
        this.left = f;
    }

    public void setTop(float f) {
        this.top = f;
    }
}

