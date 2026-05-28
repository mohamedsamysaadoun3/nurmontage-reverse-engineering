// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.constant.ResizeType;

public class ItemDimension
{
    private final int h;
    private String id;
    private int image;
    private String name;
    private ResizeType resizeType;
    private final int w;
    
    public ItemDimension(final String name, final int image, final ResizeType resizeType, final int w, final int h, final String id) {
        this.name = name;
        this.image = image;
        this.resizeType = resizeType;
        this.w = w;
        this.h = h;
        this.id = id;
    }
    
    public int getH() {
        return this.h;
    }
    
    public String getId() {
        return this.id;
    }
    
    public int getImage() {
        return this.image;
    }
    
    public String getName() {
        return this.name;
    }
    
    public ResizeType getResizeType() {
        return this.resizeType;
    }
    
    public int getW() {
        return this.w;
    }
}
