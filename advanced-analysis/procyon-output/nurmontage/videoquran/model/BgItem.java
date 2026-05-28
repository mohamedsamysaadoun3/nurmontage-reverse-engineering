// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

public class BgItem
{
    private int id;
    private String name_drawable;
    private float x;
    private float y;
    
    public BgItem(final int id, final float x, final float y, final String name_drawable) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.name_drawable = name_drawable;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getName_drawable() {
        return this.name_drawable;
    }
    
    public float getX() {
        return this.x;
    }
    
    public float getY() {
        return this.y;
    }
    
    public void setName_drawable(final String name_drawable) {
        this.name_drawable = name_drawable;
    }
}
