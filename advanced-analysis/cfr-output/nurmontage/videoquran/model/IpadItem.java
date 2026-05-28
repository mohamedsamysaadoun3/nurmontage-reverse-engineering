/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.constant.IpadType;

public class IpadItem {
    private int img;
    private IpadType ipadType;

    public IpadItem(int n, IpadType ipadType) {
        this.ipadType = ipadType;
        this.img = n;
    }

    public int getImg() {
        return this.img;
    }

    public IpadType getIpadType() {
        return this.ipadType;
    }
}

