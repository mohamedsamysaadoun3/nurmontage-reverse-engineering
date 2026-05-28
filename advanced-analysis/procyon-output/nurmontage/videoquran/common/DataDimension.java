// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.common;

import hazem.nurmontage.videoquran.constant.ResizeType;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.model.ItemDimension;
import java.util.ArrayList;
import java.util.List;
import android.content.res.Resources;

public class DataDimension
{
    public static List getALl(final Resources resources) {
        final ArrayList<ItemDimension> list = new ArrayList<ItemDimension>();
        list.add(new ItemDimension(resources.getString(R$string.tiktok), R$drawable.ic_tiktok, ResizeType.SOCIAL_STORY, 720, 1280, "t"));
        list.add(new ItemDimension(resources.getString(R$string.youtube_thumbnail), R$drawable.ic_youtube, ResizeType.YOUTUBE_THUMBNAIL, 1280, 720, "y_16:9"));
        final String string = resources.getString(R$string.youtube_short);
        final int ic_youtube_shorts_icon = R$drawable.ic_youtube_shorts_icon;
        final ResizeType social_STORY = ResizeType.SOCIAL_STORY;
        final int n = 1280;
        final int n2 = 720;
        list.add(new ItemDimension(string, ic_youtube_shorts_icon, social_STORY, n2, n, "y_9:16"));
        list.add(new ItemDimension(resources.getString(R$string.instagram_post), R$drawable.ic_instagram, ResizeType.SQUARE, 1080, 1080, "i_1:1"));
        list.add(new ItemDimension(resources.getString(R$string.instagram_story), R$drawable.ic_instagram, ResizeType.SOCIAL_STORY, n2, n, "i_9:16"));
        return list;
    }
}
