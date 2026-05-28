/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.constant;

public final class EntityAction
extends Enum {
    private static final /* synthetic */ EntityAction[] $VALUES;
    public static final /* enum */ EntityAction ADD;
    public static final /* enum */ EntityAction ALINGMENT_STYLE;
    public static final /* enum */ EntityAction ANIMATION;
    public static final /* enum */ EntityAction BG_TEXT;
    public static final /* enum */ EntityAction BOLD_STYLE;
    public static final /* enum */ EntityAction COLOR_OUTLINE_IMG;
    public static final /* enum */ EntityAction COLOR_OUTLINE_TEXT;
    public static final /* enum */ EntityAction COLOR_TACHKIL;
    public static final /* enum */ EntityAction COLOR_TEXT;
    public static final /* enum */ EntityAction DELETE;
    public static final /* enum */ EntityAction DELETE_MULTIPLE;
    public static final /* enum */ EntityAction FONT_TEXT;
    public static final /* enum */ EntityAction GLOW_SHADOW;
    public static final /* enum */ EntityAction ICON_QURAN;
    public static final /* enum */ EntityAction ITALIC_STYLE;
    public static final /* enum */ EntityAction LAYER;
    public static final /* enum */ EntityAction MOTION_AND_TIME_VIEW;
    public static final /* enum */ EntityAction MOTION_VIEW;
    public static final /* enum */ EntityAction MOVE;
    public static final /* enum */ EntityAction OPACITY_IMAGE;
    public static final /* enum */ EntityAction OPACITY_TEXT;
    public static final /* enum */ EntityAction ROTATE;
    public static final /* enum */ EntityAction ROUND_IMAGE;
    public static final /* enum */ EntityAction SHADOW_IMAGE;
    public static final /* enum */ EntityAction SHADOW_TEXT;
    public static final /* enum */ EntityAction SIZE_OUTLINE_IMG;
    public static final /* enum */ EntityAction SIZE_OUTLINE_TEXT;
    public static final /* enum */ EntityAction SPLIT;
    public static final /* enum */ EntityAction STRIKE_LINE_STYLE;
    public static final /* enum */ EntityAction TEXT_SIZE;
    public static final /* enum */ EntityAction TIME_LINE_VIEW;
    public static final /* enum */ EntityAction TO_BACK;
    public static final /* enum */ EntityAction TO_FRONT;
    public static final /* enum */ EntityAction TO_HORIZONTAL_CENTER;
    public static final /* enum */ EntityAction TO_HORIZONTAL_LEFT;
    public static final /* enum */ EntityAction TO_HORIZONTAL_RIGHT;
    public static final /* enum */ EntityAction TO_VERTICAL_BOTTOM;
    public static final /* enum */ EntityAction TO_VERTICAL_CENTER;
    public static final /* enum */ EntityAction TO_VERTICAL_TOP;
    public static final /* enum */ EntityAction TRIM;
    public static final /* enum */ EntityAction UNDERLINE_STYLE;

    private static /* synthetic */ EntityAction[] $values() {
        EntityAction entityAction = SPLIT;
        EntityAction entityAction2 = TRIM;
        EntityAction entityAction3 = MOVE;
        EntityAction entityAction4 = ADD;
        EntityAction entityAction5 = ROTATE;
        EntityAction entityAction6 = TO_BACK;
        EntityAction entityAction7 = TO_FRONT;
        EntityAction entityAction8 = LAYER;
        EntityAction entityAction9 = COLOR_OUTLINE_TEXT;
        EntityAction entityAction10 = SIZE_OUTLINE_TEXT;
        EntityAction entityAction11 = COLOR_TEXT;
        EntityAction entityAction12 = SHADOW_IMAGE;
        EntityAction entityAction13 = ROUND_IMAGE;
        EntityAction entityAction14 = COLOR_OUTLINE_IMG;
        EntityAction entityAction15 = SIZE_OUTLINE_IMG;
        EntityAction entityAction16 = COLOR_TACHKIL;
        EntityAction entityAction17 = BG_TEXT;
        EntityAction entityAction18 = OPACITY_IMAGE;
        EntityAction entityAction19 = OPACITY_TEXT;
        EntityAction entityAction20 = DELETE;
        EntityAction entityAction21 = DELETE_MULTIPLE;
        EntityAction entityAction22 = SHADOW_TEXT;
        EntityAction entityAction23 = TO_HORIZONTAL_RIGHT;
        EntityAction entityAction24 = TO_HORIZONTAL_LEFT;
        EntityAction entityAction25 = TO_HORIZONTAL_CENTER;
        EntityAction entityAction26 = TO_VERTICAL_CENTER;
        EntityAction entityAction27 = TO_VERTICAL_TOP;
        EntityAction entityAction28 = TO_VERTICAL_BOTTOM;
        EntityAction entityAction29 = FONT_TEXT;
        EntityAction entityAction30 = TEXT_SIZE;
        EntityAction entityAction31 = GLOW_SHADOW;
        EntityAction entityAction32 = ICON_QURAN;
        EntityAction entityAction33 = BOLD_STYLE;
        EntityAction entityAction34 = STRIKE_LINE_STYLE;
        EntityAction entityAction35 = ITALIC_STYLE;
        EntityAction entityAction36 = UNDERLINE_STYLE;
        EntityAction entityAction37 = ALINGMENT_STYLE;
        EntityAction entityAction38 = TIME_LINE_VIEW;
        EntityAction entityAction39 = MOTION_VIEW;
        EntityAction entityAction40 = MOTION_AND_TIME_VIEW;
        EntityAction entityAction41 = ANIMATION;
        return new EntityAction[]{entityAction, entityAction2, entityAction3, entityAction4, entityAction5, entityAction6, entityAction7, entityAction8, entityAction9, entityAction10, entityAction11, entityAction12, entityAction13, entityAction14, entityAction15, entityAction16, entityAction17, entityAction18, entityAction19, entityAction20, entityAction21, entityAction22, entityAction23, entityAction24, entityAction25, entityAction26, entityAction27, entityAction28, entityAction29, entityAction30, entityAction31, entityAction32, entityAction33, entityAction34, entityAction35, entityAction36, entityAction37, entityAction38, entityAction39, entityAction40, entityAction41};
    }

    static {
        EntityAction entityAction;
        SPLIT = entityAction = new EntityAction("SPLIT", 0);
        TRIM = entityAction = new EntityAction("TRIM", 1);
        MOVE = entityAction = new EntityAction("MOVE", 2);
        ADD = entityAction = new EntityAction("ADD", 3);
        ROTATE = entityAction = new EntityAction("ROTATE", 4);
        TO_BACK = entityAction = new EntityAction("TO_BACK", 5);
        TO_FRONT = entityAction = new EntityAction("TO_FRONT", 6);
        LAYER = entityAction = new EntityAction("LAYER", 7);
        COLOR_OUTLINE_TEXT = entityAction = new EntityAction("COLOR_OUTLINE_TEXT", 8);
        SIZE_OUTLINE_TEXT = entityAction = new EntityAction("SIZE_OUTLINE_TEXT", 9);
        COLOR_TEXT = entityAction = new EntityAction("COLOR_TEXT", 10);
        SHADOW_IMAGE = entityAction = new EntityAction("SHADOW_IMAGE", 11);
        ROUND_IMAGE = entityAction = new EntityAction("ROUND_IMAGE", 12);
        COLOR_OUTLINE_IMG = entityAction = new EntityAction("COLOR_OUTLINE_IMG", 13);
        SIZE_OUTLINE_IMG = entityAction = new EntityAction("SIZE_OUTLINE_IMG", 14);
        COLOR_TACHKIL = entityAction = new EntityAction("COLOR_TACHKIL", 15);
        BG_TEXT = entityAction = new EntityAction("BG_TEXT", 16);
        OPACITY_IMAGE = entityAction = new EntityAction("OPACITY_IMAGE", 17);
        OPACITY_TEXT = entityAction = new EntityAction("OPACITY_TEXT", 18);
        DELETE = entityAction = new EntityAction("DELETE", 19);
        DELETE_MULTIPLE = entityAction = new EntityAction("DELETE_MULTIPLE", 20);
        SHADOW_TEXT = entityAction = new EntityAction("SHADOW_TEXT", 21);
        TO_HORIZONTAL_RIGHT = entityAction = new EntityAction("TO_HORIZONTAL_RIGHT", 22);
        TO_HORIZONTAL_LEFT = entityAction = new EntityAction("TO_HORIZONTAL_LEFT", 23);
        TO_HORIZONTAL_CENTER = entityAction = new EntityAction("TO_HORIZONTAL_CENTER", 24);
        TO_VERTICAL_CENTER = entityAction = new EntityAction("TO_VERTICAL_CENTER", 25);
        TO_VERTICAL_TOP = entityAction = new EntityAction("TO_VERTICAL_TOP", 26);
        TO_VERTICAL_BOTTOM = entityAction = new EntityAction("TO_VERTICAL_BOTTOM", 27);
        FONT_TEXT = entityAction = new EntityAction("FONT_TEXT", 28);
        TEXT_SIZE = entityAction = new EntityAction("TEXT_SIZE", 29);
        GLOW_SHADOW = entityAction = new EntityAction("GLOW_SHADOW", 30);
        ICON_QURAN = entityAction = new EntityAction("ICON_QURAN", 31);
        BOLD_STYLE = entityAction = new EntityAction("BOLD_STYLE", 32);
        STRIKE_LINE_STYLE = entityAction = new EntityAction("STRIKE_LINE_STYLE", 33);
        ITALIC_STYLE = entityAction = new EntityAction("ITALIC_STYLE", 34);
        UNDERLINE_STYLE = entityAction = new EntityAction("UNDERLINE_STYLE", 35);
        ALINGMENT_STYLE = entityAction = new EntityAction("ALINGMENT_STYLE", 36);
        TIME_LINE_VIEW = entityAction = new EntityAction("TIME_LINE_VIEW", 37);
        MOTION_VIEW = entityAction = new EntityAction("MOTION_VIEW", 38);
        MOTION_AND_TIME_VIEW = entityAction = new EntityAction("MOTION_AND_TIME_VIEW", 39);
        ANIMATION = entityAction = new EntityAction("ANIMATION", 40);
        $VALUES = EntityAction.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private EntityAction() {
        void cfr_renamed_557;
        void cfr_renamed_558;
    }

    public static EntityAction valueOf(String string2) {
        return Enum.valueOf(EntityAction.class, string2);
    }

    public static EntityAction[] values() {
        return (EntityAction[])$VALUES.clone();
    }
}

