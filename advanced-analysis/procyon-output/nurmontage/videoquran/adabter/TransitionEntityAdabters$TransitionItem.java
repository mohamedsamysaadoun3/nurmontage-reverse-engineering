// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.adabter;

public class TransitionEntityAdabters$TransitionItem
{
    private int angle;
    private int id_ressource;
    private String type;
    
    public TransitionEntityAdabters$TransitionItem(final String type, final int id_ressource, final int angle) {
        this.type = type;
        this.id_ressource = id_ressource;
        this.angle = angle;
    }
    
    public int getAngle() {
        return this.angle;
    }
    
    public int getId_ressource() {
        return this.id_ressource;
    }
    
    public String getType() {
        return this.type;
    }
}
