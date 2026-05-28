// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

public class ModelFeatures
{
    private boolean isForFree;
    private String name;
    
    public ModelFeatures(final String name) {
        this.name = name;
    }
    
    public ModelFeatures(final String name, final boolean isForFree) {
        this.name = name;
        this.isForFree = isForFree;
    }
    
    public String getName() {
        return this.name;
    }
    
    public boolean isForFree() {
        return this.isForFree;
    }
}
