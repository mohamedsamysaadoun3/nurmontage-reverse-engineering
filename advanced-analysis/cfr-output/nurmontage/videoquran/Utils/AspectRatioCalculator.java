/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  kotlin.Pair
 */
package hazem.nurmontage.videoquran.Utils;

import android.graphics.Point;
import hazem.nurmontage.videoquran.constant.ResizeType;
import kotlin.Pair;

public class AspectRatioCalculator {
    private static final float ASPECT_RATIO_HEIGHT = 16.0f;
    private static final float ASPECT_RATIO_WIDTH = 9.0f;

    public static int calcuWattermark(int n) {
        return (int)((double)n * 5.0 / 16.0);
    }

    public static Point calculateAspectRatio(int n, int n2) {
        int n3 = AspectRatioCalculator.findGCD(n, n2);
        Point point = new Point(n /= n3, n2 /= n3);
        return point;
    }

    public static int calculateHeight(int n) {
        return Math.round((float)n * 16.0f / 9.0f);
    }

    public static int calculateHeight_Youtube(int n) {
        return Math.round((float)n * 9.0f / 16.0f);
    }

    public static int calculateWidth(int n) {
        return Math.round((float)n * 9.0f / 16.0f);
    }

    private static int findGCD(int n, int n2) {
        while (true) {
            int n3 = n2;
            n2 = n;
            n = n3;
            if (n3 == 0) break;
            n2 %= n3;
        }
        return n2;
    }

    public static Pair getSize(int n, String string2) {
        ResizeType resizeType = ResizeType.SOCIAL_STORY;
        int n2 = resizeType.ordinal();
        int n3 = 1920;
        Integer n4 = n3;
        int n5 = 1280;
        Integer n6 = n5;
        String string3 = "1080p";
        int n7 = 854;
        Integer n8 = n7;
        String string4 = "720p";
        String string5 = "480p";
        int n9 = 1080;
        Integer n10 = n9;
        int n11 = 720;
        Integer n12 = n11;
        int n13 = 480;
        Integer n14 = n13;
        if (n == n2) {
            n2 = string2.equals(string5) ? 1 : 0;
            if (n2 != 0) {
                Pair pair = new Pair((Object)n14, (Object)n8);
                return pair;
            }
            n2 = string2.equals(string4) ? 1 : 0;
            if (n2 != 0) {
                Pair pair = new Pair((Object)n12, (Object)n6);
                return pair;
            }
            n2 = string2.equals(string3) ? 1 : 0;
            if (n2 != 0) {
                Pair pair = new Pair((Object)n10, (Object)n4);
                return pair;
            }
        }
        if (n == (n2 = (resizeType = ResizeType.YOUTUBE_THUMBNAIL).ordinal())) {
            n = string2.equals(string5) ? 1 : 0;
            if (n != 0) {
                Pair pair = new Pair((Object)n8, (Object)n14);
                return pair;
            }
            n = string2.equals(string4) ? 1 : 0;
            if (n != 0) {
                Pair pair = new Pair((Object)n6, (Object)n12);
                return pair;
            }
            n = string2.equals(string3) ? 1 : 0;
            if (n != 0) {
                Pair pair = new Pair((Object)n4, (Object)n10);
                return pair;
            }
        }
        if ((n = (int)(string2.equals(string5) ? 1 : 0)) != 0) {
            Pair pair = new Pair((Object)n14, (Object)n14);
            return pair;
        }
        n = string2.equals(string4) ? 1 : 0;
        if (n != 0) {
            Pair pair = new Pair((Object)n12, (Object)n12);
            return pair;
        }
        Pair pair = new Pair((Object)n10, (Object)n10);
        return pair;
    }
}

