package hazem.nurmontage.videoquran.model;

/* loaded from: classes2.dex */
public class YoutuberModel {
    private int img;
    private String lnk;

    public YoutuberModel(String textValue, int flags) {
        this.lnk = textValue;
        this.img = flags;
    }

    public int getImg() {
        return this.img;
    }

    public String getLnk() {
        return this.lnk;
    }
}
