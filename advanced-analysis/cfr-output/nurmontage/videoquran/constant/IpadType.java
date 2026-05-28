/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.constant;

public final class IpadType
extends Enum {
    private static final /* synthetic */ IpadType[] $VALUES;
    public static final /* enum */ IpadType BATTERY;
    public static final /* enum */ IpadType BLACK_LAYER;
    public static final /* enum */ IpadType BLUE_TYPE;
    public static final /* enum */ IpadType BORDER;
    public static final /* enum */ IpadType BOTTOM_RECT;
    public static final /* enum */ IpadType CASSET;
    public static final /* enum */ IpadType CASSET_IMG;
    public static final /* enum */ IpadType CASSET_IMG_BLUR;
    public static final /* enum */ IpadType GRADIENT;
    public static final /* enum */ IpadType HEART;
    public static final /* enum */ IpadType IPAD;
    public static final /* enum */ IpadType IPAD_CLASSIC;
    public static final /* enum */ IpadType IPAD_NEOMORPHIC;
    public static final /* enum */ IpadType IPAD_UNBLUR;
    public static final /* enum */ IpadType MASK_BRUSH;
    public static final /* enum */ IpadType RECT;
    public static final /* enum */ IpadType ROUND_RECT;

    private static /* synthetic */ IpadType[] $values() {
        IpadType ipadType = IPAD;
        IpadType ipadType2 = IPAD_UNBLUR;
        IpadType ipadType3 = IPAD_CLASSIC;
        IpadType ipadType4 = ROUND_RECT;
        IpadType ipadType5 = RECT;
        IpadType ipadType6 = BOTTOM_RECT;
        IpadType ipadType7 = BORDER;
        IpadType ipadType8 = BLACK_LAYER;
        IpadType ipadType9 = GRADIENT;
        IpadType ipadType10 = BLUE_TYPE;
        IpadType ipadType11 = MASK_BRUSH;
        IpadType ipadType12 = IPAD_NEOMORPHIC;
        IpadType ipadType13 = HEART;
        IpadType ipadType14 = BATTERY;
        IpadType ipadType15 = CASSET;
        IpadType ipadType16 = CASSET_IMG;
        IpadType ipadType17 = CASSET_IMG_BLUR;
        return new IpadType[]{ipadType, ipadType2, ipadType3, ipadType4, ipadType5, ipadType6, ipadType7, ipadType8, ipadType9, ipadType10, ipadType11, ipadType12, ipadType13, ipadType14, ipadType15, ipadType16, ipadType17};
    }

    static {
        IpadType ipadType;
        IPAD = ipadType = new IpadType("IPAD", 0);
        IPAD_UNBLUR = ipadType = new IpadType("IPAD_UNBLUR", 1);
        IPAD_CLASSIC = ipadType = new IpadType("IPAD_CLASSIC", 2);
        ROUND_RECT = ipadType = new IpadType("ROUND_RECT", 3);
        RECT = ipadType = new IpadType("RECT", 4);
        BOTTOM_RECT = ipadType = new IpadType("BOTTOM_RECT", 5);
        BORDER = ipadType = new IpadType("BORDER", 6);
        BLACK_LAYER = ipadType = new IpadType("BLACK_LAYER", 7);
        GRADIENT = ipadType = new IpadType("GRADIENT", 8);
        BLUE_TYPE = ipadType = new IpadType("BLUE_TYPE", 9);
        MASK_BRUSH = ipadType = new IpadType("MASK_BRUSH", 10);
        IPAD_NEOMORPHIC = ipadType = new IpadType("IPAD_NEOMORPHIC", 11);
        HEART = ipadType = new IpadType("HEART", 12);
        BATTERY = ipadType = new IpadType("BATTERY", 13);
        CASSET = ipadType = new IpadType("CASSET", 14);
        CASSET_IMG = ipadType = new IpadType("CASSET_IMG", 15);
        CASSET_IMG_BLUR = ipadType = new IpadType("CASSET_IMG_BLUR", 16);
        $VALUES = IpadType.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private IpadType() {
        void cfr_renamed_557;
        void cfr_renamed_558;
    }

    public static IpadType valueOf(String string2) {
        return Enum.valueOf(IpadType.class, string2);
    }

    public static IpadType[] values() {
        return (IpadType[])$VALUES.clone();
    }
}

