// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

public class YoutuberModel
{
    private int img;
    private String lnk;
    
    public YoutuberModel(final String lnk, final int img) {
        this.lnk = lnk;
        this.img = img;
    }
    
    public int getImg() {
        return this.img;
    }
    
    public String getLnk() {
        return this.lnk;
    }
}
