// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.constant;

public enum ResizeType
{
    BANNER_PLAY_STORE("BANNER_PLAY_STORE", 19, 0.48828125f), 
    COVER_FACEBOOK("COVER_FACEBOOK", 20, 0.3804878f), 
    COVER_PAGE_FACEBOOK("COVER_PAGE_FACEBOOK", 13, n2), 
    CUSTOM_SIZE("CUSTOM_SIZE", 23, 0.0f), 
    DRIBBLE("DRIBBLE", 17, 0.75f), 
    FACEBOOK_POST("FACEBOOK_POST", 14, 0.525f), 
    FREE("FREE", 1, n), 
    HORIZONTAL("HORIZONTAL", 9, n2), 
    IMAGE("IMAGE", 0, 0.0f), 
    LINKEDIN("LINKEDIN", 16, 0.5233333f), 
    OVAL("OVAL", 2, n), 
    PINTEREST("PINTEREST", 8, 0.6669691f), 
    PLAYSTORE_HORIZANTAL("PLAYSTORE_HORIZANTAL", 18, n3), 
    PLAYSTORE_PORTRAIT("PLAYSTORE_PORTRAIT", 7, n3), 
    SOCIAL_LANDSCAPE("SOCIAL_LANDSCAPE", 15, 0.5240741f), 
    SOCIAL_PORTRAIT("SOCIAL_PORTRAIT", 6, n3), 
    SOCIAL_STORY("SOCIAL_STORY", 5, n2), 
    SQUARE("SQUARE", 3, 1.0f), 
    TWITCH_BANNER("TWITCH_BANNER", 22, 0.25f), 
    TWITTER_HEADER("TWITTER_HEADER", 21, 0.33333334f), 
    TWITTER_POST("TWITTER_POST", 11, n2), 
    VERTICAL("VERTICAL", 4, 0.5622189f), 
    YOUTUBE_BANNER("YOUTUBE_BANNER", 10, n2), 
    YOUTUBE_THUMBNAIL("YOUTUBE_THUMBNAIL", 12, n2);
    
    float value;
    
    static {
        final float n = -1.0f;
        final float n2 = 0.5625f;
        final float n3 = 0.8f;
    }
    
    private ResizeType(final String name, final int ordinal, final float value) {
        this.value = value;
    }
    
    public float getValue() {
        return this.value;
    }
}
