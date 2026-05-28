/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.constant;

public final class EffectAudioType
extends Enum {
    private static final /* synthetic */ EffectAudioType[] $VALUES;
    public static final /* enum */ EffectAudioType ECHO;
    public static final /* enum */ EffectAudioType ENHANCE;
    public static final /* enum */ EffectAudioType FADE;
    public static final /* enum */ EffectAudioType NOICE;
    public static final /* enum */ EffectAudioType REVERB;
    public static final /* enum */ EffectAudioType SPEED;
    public static final /* enum */ EffectAudioType VOLUME;

    private static /* synthetic */ EffectAudioType[] $values() {
        EffectAudioType effectAudioType = VOLUME;
        EffectAudioType effectAudioType2 = ECHO;
        EffectAudioType effectAudioType3 = REVERB;
        EffectAudioType effectAudioType4 = FADE;
        EffectAudioType effectAudioType5 = SPEED;
        EffectAudioType effectAudioType6 = ENHANCE;
        EffectAudioType effectAudioType7 = NOICE;
        return new EffectAudioType[]{effectAudioType, effectAudioType2, effectAudioType3, effectAudioType4, effectAudioType5, effectAudioType6, effectAudioType7};
    }

    static {
        EffectAudioType effectAudioType;
        VOLUME = effectAudioType = new EffectAudioType("VOLUME", 0);
        ECHO = effectAudioType = new EffectAudioType("ECHO", 1);
        REVERB = effectAudioType = new EffectAudioType("REVERB", 2);
        FADE = effectAudioType = new EffectAudioType("FADE", 3);
        SPEED = effectAudioType = new EffectAudioType("SPEED", 4);
        ENHANCE = effectAudioType = new EffectAudioType("ENHANCE", 5);
        NOICE = effectAudioType = new EffectAudioType("NOICE", 6);
        $VALUES = EffectAudioType.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private EffectAudioType() {
        void cfr_renamed_557;
        void cfr_renamed_558;
    }

    public static EffectAudioType valueOf(String string2) {
        return Enum.valueOf(EffectAudioType.class, string2);
    }

    public static EffectAudioType[] values() {
        return (EffectAudioType[])$VALUES.clone();
    }
}

