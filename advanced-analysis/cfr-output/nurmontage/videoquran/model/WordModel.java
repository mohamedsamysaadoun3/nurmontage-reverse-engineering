/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

public class WordModel {
    private boolean isSelected;
    private String w;

    public WordModel(String string2) {
        this.w = string2;
    }

    public WordModel(String string2, boolean bl) {
        this.w = string2;
        this.isSelected = bl;
    }

    public String getW() {
        return this.w;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setSelected(boolean bl) {
        this.isSelected = bl;
    }

    public void setW(String string2) {
        this.w = string2;
    }
}

