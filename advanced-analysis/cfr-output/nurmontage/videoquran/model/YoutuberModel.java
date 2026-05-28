/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

public class YoutuberModel {
    private int img;
    private String lnk;

    public YoutuberModel(String string2, int n) {
        this.lnk = string2;
        this.img = n;
    }

    public int getImg() {
        return this.img;
    }

    public String getLnk() {
        return this.lnk;
    }
}

