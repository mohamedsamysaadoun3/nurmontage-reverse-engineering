// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import hazem.nurmontage.videoquran.constant.ResizeType;
import kotlin.Pair;
import android.graphics.Point;

public class AspectRatioCalculator
{
    private static final float ASPECT_RATIO_HEIGHT = 16.0f;
    private static final float ASPECT_RATIO_WIDTH = 9.0f;
    
    public static int calcuWattermark(final int n) {
        return (int)(n * 5.0 / 16.0);
    }
    
    public static Point calculateAspectRatio(int n, int n2) {
        final int gcd = findGCD(n, n2);
        n /= gcd;
        n2 /= gcd;
        return new Point(n, n2);
    }
    
    public static int calculateHeight(final int n) {
        return Math.round(n * 16.0f / 9.0f);
    }
    
    public static int calculateHeight_Youtube(final int n) {
        return Math.round(n * 9.0f / 16.0f);
    }
    
    public static int calculateWidth(final int n) {
        return Math.round(n * 9.0f / 16.0f);
    }
    
    private static int findGCD(int n, int n2) {
        while (true) {
            final int n3 = n2;
            n2 = n;
            n = n3;
            if (n3 == 0) {
                break;
            }
            n2 %= n3;
        }
        return n2;
    }
    
    public static Pair getSize(int n, final String s) {
        final int ordinal = ResizeType.SOCIAL_STORY.ordinal();
        final Integer value = 1920;
        final Integer value2 = 1280;
        final String s2 = "1080p";
        final Integer value3 = 854;
        final String anObject = "720p";
        final String anObject2 = "480p";
        final Integer value4 = 1080;
        final Integer value5 = 720;
        final Integer value6 = 480;
        if (n == ordinal) {
            if (s.equals(anObject2)) {
                return new Pair((Object)value6, (Object)value3);
            }
            if (s.equals(anObject)) {
                return new Pair((Object)value5, (Object)value2);
            }
            if (s.equals(s2)) {
                return new Pair((Object)value4, (Object)value);
            }
        }
        if (n == ResizeType.YOUTUBE_THUMBNAIL.ordinal()) {
            n = (s.equals(anObject2) ? 1 : 0);
            if (n != 0) {
                return new Pair((Object)value3, (Object)value6);
            }
            n = (s.equals(anObject) ? 1 : 0);
            if (n != 0) {
                return new Pair((Object)value2, (Object)value5);
            }
            n = (s.equals(s2) ? 1 : 0);
            if (n != 0) {
                return new Pair((Object)value, (Object)value4);
            }
        }
        n = (s.equals(anObject2) ? 1 : 0);
        if (n != 0) {
            return new Pair((Object)value6, (Object)value6);
        }
        n = (s.equals(anObject) ? 1 : 0);
        if (n != 0) {
            return new Pair((Object)value5, (Object)value5);
        }
        return new Pair((Object)value4, (Object)value4);
    }
}
