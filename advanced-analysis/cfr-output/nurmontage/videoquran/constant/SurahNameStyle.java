/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.constant;

public final class SurahNameStyle
extends Enum {
    private static final /* synthetic */ SurahNameStyle[] $VALUES;
    public static final /* enum */ SurahNameStyle NONE;
    public static final /* enum */ SurahNameStyle ZAGHRAFAT;

    private static /* synthetic */ SurahNameStyle[] $values() {
        SurahNameStyle surahNameStyle = NONE;
        SurahNameStyle surahNameStyle2 = ZAGHRAFAT;
        return new SurahNameStyle[]{surahNameStyle, surahNameStyle2};
    }

    static {
        SurahNameStyle surahNameStyle;
        NONE = surahNameStyle = new SurahNameStyle("NONE", 0);
        ZAGHRAFAT = surahNameStyle = new SurahNameStyle("ZAGHRAFAT", 1);
        $VALUES = SurahNameStyle.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SurahNameStyle() {
        void cfr_renamed_557;
        void cfr_renamed_558;
    }

    public static SurahNameStyle valueOf(String string2) {
        return Enum.valueOf(SurahNameStyle.class, string2);
    }

    public static SurahNameStyle[] values() {
        return (SurahNameStyle[])$VALUES.clone();
    }
}

