/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.constant;

public final class TransitionType
extends Enum {
    private static final /* synthetic */ TransitionType[] $VALUES;
    public static final /* enum */ TransitionType DISTANCE;
    public static final /* enum */ TransitionType FADE;
    public static final /* enum */ TransitionType FADE_BLACK;
    public static final /* enum */ TransitionType FADE_IN;
    public static final /* enum */ TransitionType FADE_OUT;
    public static final /* enum */ TransitionType FADE_WHITE;
    public static final /* enum */ TransitionType HBLUR;
    public static final /* enum */ TransitionType HLSLICE;
    public static final /* enum */ TransitionType JUMP;
    public static final /* enum */ TransitionType NONE;
    public static final /* enum */ TransitionType PIXELIZE;
    public static final /* enum */ TransitionType RADIAL;
    public static final /* enum */ TransitionType ROTATE_L;
    public static final /* enum */ TransitionType ROTATE_R;
    public static final /* enum */ TransitionType SLIDE_BC;
    public static final /* enum */ TransitionType SLIDE_BL;
    public static final /* enum */ TransitionType SLIDE_BOTTOM;
    public static final /* enum */ TransitionType SLIDE_BR;
    public static final /* enum */ TransitionType SLIDE_CL;
    public static final /* enum */ TransitionType SLIDE_CR;
    public static final /* enum */ TransitionType SLIDE_TC;
    public static final /* enum */ TransitionType SLIDE_TL;
    public static final /* enum */ TransitionType SLIDE_TOP;
    public static final /* enum */ TransitionType SLIDE_TO_LEFT;
    public static final /* enum */ TransitionType SLIDE_TO_RIGHT;
    public static final /* enum */ TransitionType SLIDE_TR;
    public static final /* enum */ TransitionType SPIN_LEFT;
    public static final /* enum */ TransitionType SPIN_RIGHT;
    public static final /* enum */ TransitionType WIPE_LEFT;
    public static final /* enum */ TransitionType WIPE_RIGHT;
    public static final /* enum */ TransitionType ZOOM_IN;
    public static final /* enum */ TransitionType ZOOM_OUT;
    private final String value;

    private static /* synthetic */ TransitionType[] $values() {
        TransitionType transitionType = NONE;
        TransitionType transitionType2 = FADE;
        TransitionType transitionType3 = FADE_IN;
        TransitionType transitionType4 = FADE_OUT;
        TransitionType transitionType5 = FADE_WHITE;
        TransitionType transitionType6 = FADE_BLACK;
        TransitionType transitionType7 = DISTANCE;
        TransitionType transitionType8 = WIPE_RIGHT;
        TransitionType transitionType9 = WIPE_LEFT;
        TransitionType transitionType10 = RADIAL;
        TransitionType transitionType11 = SLIDE_TOP;
        TransitionType transitionType12 = SLIDE_BOTTOM;
        TransitionType transitionType13 = SLIDE_TO_RIGHT;
        TransitionType transitionType14 = SLIDE_TO_LEFT;
        TransitionType transitionType15 = JUMP;
        TransitionType transitionType16 = SLIDE_TL;
        TransitionType transitionType17 = SLIDE_BR;
        TransitionType transitionType18 = SLIDE_TR;
        TransitionType transitionType19 = SLIDE_BL;
        TransitionType transitionType20 = SLIDE_TC;
        TransitionType transitionType21 = SLIDE_BC;
        TransitionType transitionType22 = SLIDE_CR;
        TransitionType transitionType23 = SLIDE_CL;
        TransitionType transitionType24 = PIXELIZE;
        TransitionType transitionType25 = HBLUR;
        TransitionType transitionType26 = HLSLICE;
        TransitionType transitionType27 = SPIN_LEFT;
        TransitionType transitionType28 = SPIN_RIGHT;
        TransitionType transitionType29 = ZOOM_IN;
        TransitionType transitionType30 = ZOOM_OUT;
        TransitionType transitionType31 = ROTATE_L;
        TransitionType transitionType32 = ROTATE_R;
        return new TransitionType[]{transitionType, transitionType2, transitionType3, transitionType4, transitionType5, transitionType6, transitionType7, transitionType8, transitionType9, transitionType10, transitionType11, transitionType12, transitionType13, transitionType14, transitionType15, transitionType16, transitionType17, transitionType18, transitionType19, transitionType20, transitionType21, transitionType22, transitionType23, transitionType24, transitionType25, transitionType26, transitionType27, transitionType28, transitionType29, transitionType30, transitionType31, transitionType32};
    }

    static {
        TransitionType transitionType;
        NONE = transitionType = new TransitionType("NONE", 0, "none");
        FADE = transitionType = new TransitionType("FADE", 1, "fade");
        FADE_IN = transitionType = new TransitionType("FADE_IN", 2, "fade_in");
        FADE_OUT = transitionType = new TransitionType("FADE_OUT", 3, "fade_out");
        FADE_WHITE = transitionType = new TransitionType("FADE_WHITE", 4, "fade_white");
        FADE_BLACK = transitionType = new TransitionType("FADE_BLACK", 5, "fade_black");
        DISTANCE = transitionType = new TransitionType("DISTANCE", 6, "distance");
        WIPE_RIGHT = transitionType = new TransitionType("WIPE_RIGHT", 7, "wiperight");
        WIPE_LEFT = transitionType = new TransitionType("WIPE_LEFT", 8, "wipeleft");
        RADIAL = transitionType = new TransitionType("RADIAL", 9, "radial");
        SLIDE_TOP = transitionType = new TransitionType("SLIDE_TOP", 10, "slidetop");
        SLIDE_BOTTOM = transitionType = new TransitionType("SLIDE_BOTTOM", 11, "slidebottom");
        SLIDE_TO_RIGHT = transitionType = new TransitionType("SLIDE_TO_RIGHT", 12, "slideright");
        SLIDE_TO_LEFT = transitionType = new TransitionType("SLIDE_TO_LEFT", 13, "slideleft");
        JUMP = transitionType = new TransitionType("JUMP", 14, "jump");
        SLIDE_TL = transitionType = new TransitionType("SLIDE_TL", 15, "slide_tl");
        SLIDE_BR = transitionType = new TransitionType("SLIDE_BR", 16, "slide_br");
        SLIDE_TR = transitionType = new TransitionType("SLIDE_TR", 17, "slide_tr");
        SLIDE_BL = transitionType = new TransitionType("SLIDE_BL", 18, "slide_bl");
        SLIDE_TC = transitionType = new TransitionType("SLIDE_TC", 19, "slide_tc");
        SLIDE_BC = transitionType = new TransitionType("SLIDE_BC", 20, "slide_bc");
        SLIDE_CR = transitionType = new TransitionType("SLIDE_CR", 21, "slide_cr");
        SLIDE_CL = transitionType = new TransitionType("SLIDE_CL", 22, "slide_cl");
        PIXELIZE = transitionType = new TransitionType("PIXELIZE", 23, "pixelize");
        HBLUR = transitionType = new TransitionType("HBLUR", 24, "hblur");
        HLSLICE = transitionType = new TransitionType("HLSLICE", 25, "hlslice");
        SPIN_LEFT = transitionType = new TransitionType("SPIN_LEFT", 26, "spin_left");
        SPIN_RIGHT = transitionType = new TransitionType("SPIN_RIGHT", 27, "spin_right");
        ZOOM_IN = transitionType = new TransitionType("ZOOM_IN", 28, "zoomin");
        ZOOM_OUT = transitionType = new TransitionType("ZOOM_OUT", 29, "zoomout");
        ROTATE_L = transitionType = new TransitionType("ROTATE_L", 30, "rotate_l");
        ROTATE_R = transitionType = new TransitionType("ROTATE_R", 31, "rotate_r");
        $VALUES = TransitionType.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private TransitionType() {
        void var3_2;
        void cfr_renamed_557;
        void cfr_renamed_558;
        this.value = var3_2;
    }

    public static TransitionType valueOf(String string2) {
        return Enum.valueOf(TransitionType.class, string2);
    }

    public static TransitionType[] values() {
        return (TransitionType[])$VALUES.clone();
    }

    public String getValue() {
        return this.value;
    }
}

