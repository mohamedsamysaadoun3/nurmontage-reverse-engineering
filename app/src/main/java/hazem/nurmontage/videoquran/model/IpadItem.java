package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.constant.IpadType;

/* loaded from: classes2.dex */
public class IpadItem {
    private int img;
    private IpadType ipadType;

    public IpadItem(int value, IpadType ipadType) {
        this.ipadType = ipadType;
        this.img = value;
    }

    public IpadType getIpadType() {
        return this.ipadType;
    }

    public int getImg() {
        return this.img;
    }
}
