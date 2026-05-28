/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import java.io.Serializable;

public class ItemQuranSearch
implements Serializable {
    private final String aya;
    private final int endSpannble;
    private final int startSpannable;
    private final int surahIndex;
    private final String surahName;
    private final int to;

    public ItemQuranSearch(String string2, String string3, int n, int n2, int n3, int n4) {
        this.aya = string2;
        this.surahName = string3;
        this.to = n;
        this.surahIndex = n2;
        this.startSpannable = n3;
        this.endSpannble = n4;
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

