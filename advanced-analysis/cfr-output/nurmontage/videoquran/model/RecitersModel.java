/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

public class RecitersModel {
    private String identifer;
    private boolean isTarteel;
    private String number_aya;
    private String surah_index;

    public RecitersModel(String string2, int n, int n2) {
        boolean bl;
        CharSequence charSequence;
        this.identifer = string2;
        String string3 = "0";
        String string4 = "";
        String string5 = "00";
        int n3 = 100;
        int n4 = 10;
        if (n < n4) {
            StringBuilder stringBuilder = new StringBuilder(string5);
            charSequence = stringBuilder.append(n).toString();
            this.surah_index = charSequence;
        } else if (n < n3) {
            StringBuilder stringBuilder = new StringBuilder(string3);
            charSequence = stringBuilder.append(n).toString();
            this.surah_index = charSequence;
        } else {
            StringBuilder stringBuilder = new StringBuilder(string4);
            charSequence = stringBuilder.append(n).toString();
            this.surah_index = charSequence;
        }
        if (n2 < n4) {
            super(string5);
            charSequence = ((StringBuilder)charSequence).append(n2).toString();
            this.number_aya = charSequence;
        } else if (n2 < n3) {
            super(string3);
            charSequence = ((StringBuilder)charSequence).append(n2).toString();
            this.number_aya = charSequence;
        } else {
            super(string4);
            charSequence = ((StringBuilder)charSequence).append(n2).toString();
            this.number_aya = charSequence;
        }
        this.isTarteel = bl = string2.contains("_") ^ true;
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

