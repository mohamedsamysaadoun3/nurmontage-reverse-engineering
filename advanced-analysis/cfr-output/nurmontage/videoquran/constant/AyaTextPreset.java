/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.constant;

public final class AyaTextPreset
extends Enum {
    private static final /* synthetic */ AyaTextPreset[] $VALUES;
    public static final /* enum */ AyaTextPreset GLOW;
    public static final /* enum */ AyaTextPreset NONE;
    public static final /* enum */ AyaTextPreset OUTLINE;
    public static final /* enum */ AyaTextPreset SHADOW;

    private static /* synthetic */ AyaTextPreset[] $values() {
        AyaTextPreset ayaTextPreset = NONE;
        AyaTextPreset ayaTextPreset2 = OUTLINE;
        AyaTextPreset ayaTextPreset3 = SHADOW;
        AyaTextPreset ayaTextPreset4 = GLOW;
        return new AyaTextPreset[]{ayaTextPreset, ayaTextPreset2, ayaTextPreset3, ayaTextPreset4};
    }

    static {
        AyaTextPreset ayaTextPreset;
        NONE = ayaTextPreset = new AyaTextPreset("NONE", 0);
        OUTLINE = ayaTextPreset = new AyaTextPreset("OUTLINE", 1);
        SHADOW = ayaTextPreset = new AyaTextPreset("SHADOW", 2);
        GLOW = ayaTextPreset = new AyaTextPreset("GLOW", 3);
        $VALUES = AyaTextPreset.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AyaTextPreset() {
        void cfr_renamed_557;
        void cfr_renamed_558;
    }

    public static AyaTextPreset valueOf(String string2) {
        return Enum.valueOf(AyaTextPreset.class, string2);
    }

    public static AyaTextPreset[] values() {
        return (AyaTextPreset[])$VALUES.clone();
    }
}

