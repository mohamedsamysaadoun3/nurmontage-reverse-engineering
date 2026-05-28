// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

public class RecitersModel
{
    private String identifer;
    private boolean isTarteel;
    private String number_aya;
    private String surah_index;
    
    public RecitersModel(final String identifer, final int i, final int j) {
        this.identifer = identifer;
        final String s = "0";
        final String s2 = "";
        final String s3 = "00";
        final int n = 100;
        final int n2 = 10;
        if (i < n2) {
            this.surah_index = s3 + i;
        }
        else if (i < n) {
            this.surah_index = s + i;
        }
        else {
            this.surah_index = s2 + i;
        }
        if (j < n2) {
            this.number_aya = s3 + j;
        }
        else if (j < n) {
            this.number_aya = s + j;
        }
        else {
            this.number_aya = s2 + j;
        }
        this.isTarteel = (identifer.contains("_") ^ true);
    }
    
    public String getIdentifer() {
        return this.identifer;
    }
    
    public String getNumber_aya() {
        return this.number_aya;
    }
    
    public String getSurah_index() {
        return this.surah_index;
    }
    
    public boolean isTarteel() {
        return this.isTarteel;
    }
}
