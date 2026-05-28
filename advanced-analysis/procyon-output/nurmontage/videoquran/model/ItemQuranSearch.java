// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

public class ItemQuranSearch implements Serializable
{
    private final String aya;
    private final int endSpannble;
    private final int startSpannable;
    private final int surahIndex;
    private final String surahName;
    private final int to;
    
    public ItemQuranSearch(final String aya, final String surahName, final int to, final int surahIndex, final int startSpannable, final int endSpannble) {
        this.aya = aya;
        this.surahName = surahName;
        this.to = to;
        this.surahIndex = surahIndex;
        this.startSpannable = startSpannable;
        this.endSpannble = endSpannble;
    }
    
    public String getAya() {
        return this.aya;
    }
    
    public int getEndSpannble() {
        return this.endSpannble;
    }
    
    public int getStartSpannable() {
        return this.startSpannable;
    }
    
    public int getSurahIndex() {
        return this.surahIndex;
    }
    
    public String getSurahName() {
        return this.surahName;
    }
    
    public int getTo() {
        return this.to;
    }
}
