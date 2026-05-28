/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

public class ModelFeatures {
    private boolean isForFree;
    private String name;

    public ModelFeatures(String string2) {
        this.name = string2;
    }

    public ModelFeatures(String string2, boolean bl) {
        this.name = string2;
        this.isForFree = bl;
    }

    public String getName() {
        return this.name;
    }

    public boolean isForFree() {
        return this.isForFree;
    }
}

