// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.constant.IpadType;

public class IpadItem
{
    private int img;
    private IpadType ipadType;
    
    public IpadItem(final int img, final IpadType ipadType) {
        this.ipadType = ipadType;
        this.img = img;
    }
    
    public int getImg() {
        return this.img;
    }
    
    public IpadType getIpadType() {
        return this.ipadType;
    }
}
