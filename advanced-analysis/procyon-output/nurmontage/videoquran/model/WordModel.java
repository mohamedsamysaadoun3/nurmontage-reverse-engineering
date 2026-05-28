// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

public class WordModel
{
    private boolean isSelected;
    private String w;
    
    public WordModel(final String w) {
        this.w = w;
    }
    
    public WordModel(final String w, final boolean isSelected) {
        this.w = w;
        this.isSelected = isSelected;
    }
    
    public String getW() {
        return this.w;
    }
    
    public boolean isSelected() {
        return this.isSelected;
    }
    
    public void setSelected(final boolean isSelected) {
        this.isSelected = isSelected;
    }
    
    public void setW(final String w) {
        this.w = w;
    }
}
