package hazem.nurmontage.videoquran.model;

/* loaded from: classes2.dex */
public class RecitersModel {
    private String identifer;
    private boolean isTarteel;
    private String number_aya;
    private String surah_index;

    public boolean isTarteel() {
        return this.isTarteel;
    }

    public RecitersModel(String textValue, int i, int flags2) {
        this.identifer = textValue;
        if (i < 10) {
            this.surah_index = "00" + i;
        } else if (i < 100) {
            this.surah_index = "0" + i;
        } else {
            this.surah_index = "" + i;
        }
        if (flags2 < 10) {
            this.number_aya = "00" + flags2;
        } else if (flags2 < 100) {
            this.number_aya = "0" + flags2;
        } else {
            this.number_aya = "" + flags2;
        }
        this.isTarteel = !textValue.contains("_");
    }

    public String getSurah_index() {
        return this.surah_index;
    }

    public String getNumber_aya() {
        return this.number_aya;
    }

    public String getIdentifer() {
        return this.identifer;
    }
}
