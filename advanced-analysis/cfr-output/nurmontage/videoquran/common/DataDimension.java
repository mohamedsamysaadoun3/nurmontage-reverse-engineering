/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 */
package hazem.nurmontage.videoquran.common;

import android.content.res.Resources;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.constant.ResizeType;
import hazem.nurmontage.videoquran.model.ItemDimension;
import java.util.ArrayList;
import java.util.List;

public class DataDimension {
    public static List getALl(Resources resources) {
        ItemDimension itemDimension;
        ArrayList<ItemDimension> arrayList = new ArrayList<ItemDimension>();
        int n = R$string.tiktok;
        Object object = resources.getString(n);
        int n2 = R$drawable.ic_tiktok;
        ResizeType resizeType = ResizeType.SOCIAL_STORY;
        ItemDimension itemDimension2 = itemDimension;
        itemDimension = new ItemDimension((String)object, n2, resizeType, 720, 1280, "t");
        arrayList.add(itemDimension);
        int n3 = R$string.youtube_thumbnail;
        String string2 = resources.getString(n3);
        int n4 = R$drawable.ic_youtube;
        ResizeType resizeType2 = ResizeType.YOUTUBE_THUMBNAIL;
        itemDimension2 = new ItemDimension(string2, n4, resizeType2, 1280, 720, "y_16:9");
        arrayList.add(itemDimension2);
        n3 = R$string.youtube_short;
        String string3 = resources.getString(n3);
        int n5 = R$drawable.ic_youtube_shorts_icon;
        ResizeType resizeType3 = ResizeType.SOCIAL_STORY;
        int n6 = 1280;
        int n7 = 720;
        object = itemDimension2;
        itemDimension2 = new ItemDimension(string3, n5, resizeType3, n7, n6, "y_9:16");
        arrayList.add(itemDimension2);
        n3 = R$string.instagram_post;
        string2 = resources.getString(n3);
        n4 = R$drawable.ic_instagram;
        resizeType2 = ResizeType.SQUARE;
        itemDimension2 = new ItemDimension(string2, n4, resizeType2, 1080, 1080, "i_1:1");
        arrayList.add(itemDimension2);
        n3 = R$string.instagram_story;
        string3 = resources.getString(n3);
        n5 = R$drawable.ic_instagram;
        resizeType3 = ResizeType.SOCIAL_STORY;
        object = itemDimension2;
        itemDimension2 = new ItemDimension(string3, n5, resizeType3, n7, n6, "i_9:16");
        arrayList.add(itemDimension2);
        return arrayList;
    }
}

