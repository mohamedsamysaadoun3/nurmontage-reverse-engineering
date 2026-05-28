/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.constant;

public final class ResizeType
extends Enum {
    private static final /* synthetic */ ResizeType[] $VALUES;
    public static final /* enum */ ResizeType BANNER_PLAY_STORE;
    public static final /* enum */ ResizeType COVER_FACEBOOK;
    public static final /* enum */ ResizeType COVER_PAGE_FACEBOOK;
    public static final /* enum */ ResizeType CUSTOM_SIZE;
    public static final /* enum */ ResizeType DRIBBLE;
    public static final /* enum */ ResizeType FACEBOOK_POST;
    public static final /* enum */ ResizeType FREE;
    public static final /* enum */ ResizeType HORIZONTAL;
    public static final /* enum */ ResizeType IMAGE;
    public static final /* enum */ ResizeType LINKEDIN;
    public static final /* enum */ ResizeType OVAL;
    public static final /* enum */ ResizeType PINTEREST;
    public static final /* enum */ ResizeType PLAYSTORE_HORIZANTAL;
    public static final /* enum */ ResizeType PLAYSTORE_PORTRAIT;
    public static final /* enum */ ResizeType SOCIAL_LANDSCAPE;
    public static final /* enum */ ResizeType SOCIAL_PORTRAIT;
    public static final /* enum */ ResizeType SOCIAL_STORY;
    public static final /* enum */ ResizeType SQUARE;
    public static final /* enum */ ResizeType TWITCH_BANNER;
    public static final /* enum */ ResizeType TWITTER_HEADER;
    public static final /* enum */ ResizeType TWITTER_POST;
    public static final /* enum */ ResizeType VERTICAL;
    public static final /* enum */ ResizeType YOUTUBE_BANNER;
    public static final /* enum */ ResizeType YOUTUBE_THUMBNAIL;
    float value;

    private static /* synthetic */ ResizeType[] $values() {
        ResizeType resizeType = IMAGE;
        ResizeType resizeType2 = FREE;
        ResizeType resizeType3 = OVAL;
        ResizeType resizeType4 = SQUARE;
        ResizeType resizeType5 = VERTICAL;
        ResizeType resizeType6 = SOCIAL_STORY;
        ResizeType resizeType7 = SOCIAL_PORTRAIT;
        ResizeType resizeType8 = PLAYSTORE_PORTRAIT;
        ResizeType resizeType9 = PINTEREST;
        ResizeType resizeType10 = HORIZONTAL;
        ResizeType resizeType11 = YOUTUBE_BANNER;
        ResizeType resizeType12 = TWITTER_POST;
        ResizeType resizeType13 = YOUTUBE_THUMBNAIL;
        ResizeType resizeType14 = COVER_PAGE_FACEBOOK;
        ResizeType resizeType15 = FACEBOOK_POST;
        ResizeType resizeType16 = SOCIAL_LANDSCAPE;
        ResizeType resizeType17 = LINKEDIN;
        ResizeType resizeType18 = DRIBBLE;
        ResizeType resizeType19 = PLAYSTORE_HORIZANTAL;
        ResizeType resizeType20 = BANNER_PLAY_STORE;
        ResizeType resizeType21 = COVER_FACEBOOK;
        ResizeType resizeType22 = TWITTER_HEADER;
        ResizeType resizeType23 = TWITCH_BANNER;
        ResizeType resizeType24 = CUSTOM_SIZE;
        return new ResizeType[]{resizeType, resizeType2, resizeType3, resizeType4, resizeType5, resizeType6, resizeType7, resizeType8, resizeType9, resizeType10, resizeType11, resizeType12, resizeType13, resizeType14, resizeType15, resizeType16, resizeType17, resizeType18, resizeType19, resizeType20, resizeType21, resizeType22, resizeType23, resizeType24};
    }

    static {
        ResizeType resizeType;
        IMAGE = resizeType = new ResizeType("IMAGE", 0, 0.0f);
        float f = -1.0f;
        FREE = resizeType = new ResizeType("FREE", 1, f);
        OVAL = resizeType = new ResizeType("OVAL", 2, f);
        SQUARE = resizeType = new ResizeType("SQUARE", 3, 1.0f);
        VERTICAL = resizeType = new ResizeType("VERTICAL", 4, 0.5622189f);
        f = 0.5625f;
        SOCIAL_STORY = resizeType = new ResizeType("SOCIAL_STORY", 5, f);
        float f2 = 0.8f;
        SOCIAL_PORTRAIT = resizeType = new ResizeType("SOCIAL_PORTRAIT", 6, f2);
        PLAYSTORE_PORTRAIT = resizeType = new ResizeType("PLAYSTORE_PORTRAIT", 7, f2);
        PINTEREST = resizeType = new ResizeType("PINTEREST", 8, 0.6669691f);
        HORIZONTAL = resizeType = new ResizeType("HORIZONTAL", 9, f);
        YOUTUBE_BANNER = resizeType = new ResizeType("YOUTUBE_BANNER", 10, f);
        TWITTER_POST = resizeType = new ResizeType("TWITTER_POST", 11, f);
        YOUTUBE_THUMBNAIL = resizeType = new ResizeType("YOUTUBE_THUMBNAIL", 12, f);
        COVER_PAGE_FACEBOOK = resizeType = new ResizeType("COVER_PAGE_FACEBOOK", 13, f);
        FACEBOOK_POST = resizeType = new ResizeType("FACEBOOK_POST", 14, 0.525f);
        SOCIAL_LANDSCAPE = resizeType = new ResizeType("SOCIAL_LANDSCAPE", 15, 0.5240741f);
        LINKEDIN = resizeType = new ResizeType("LINKEDIN", 16, 0.5233333f);
        DRIBBLE = resizeType = new ResizeType("DRIBBLE", 17, 0.75f);
        PLAYSTORE_HORIZANTAL = resizeType = new ResizeType("PLAYSTORE_HORIZANTAL", 18, f2);
        BANNER_PLAY_STORE = resizeType = new ResizeType("BANNER_PLAY_STORE", 19, 0.48828125f);
        COVER_FACEBOOK = resizeType = new ResizeType("COVER_FACEBOOK", 20, 0.3804878f);
        TWITTER_HEADER = resizeType = new ResizeType("TWITTER_HEADER", 21, 0.33333334f);
        TWITCH_BANNER = resizeType = new ResizeType("TWITCH_BANNER", 22, 0.25f);
        CUSTOM_SIZE = resizeType = new ResizeType("CUSTOM_SIZE", 23, 0.0f);
        $VALUES = ResizeType.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ResizeType() {
        void var3_2;
        void cfr_renamed_557;
        void cfr_renamed_558;
        this.value = var3_2;
    }

    public static ResizeType valueOf(String string2) {
        return Enum.valueOf(ResizeType.class, string2);
    }

    public static ResizeType[] values() {
        return (ResizeType[])$VALUES.clone();
    }

    public float getValue() {
        return this.value;
    }
}

