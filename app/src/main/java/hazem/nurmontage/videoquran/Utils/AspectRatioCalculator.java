package hazem.nurmontage.videoquran.Utils;

import android.graphics.Point;
import hazem.nurmontage.videoquran.constant.ResizeType;
import kotlin.Pair;

/* loaded from: classes2.dex */
public class AspectRatioCalculator {
    private static final float ASPECT_RATIO_HEIGHT = 16.0f;
    private static final float ASPECT_RATIO_WIDTH = 9.0f;

    public static int calcuWattermark(int value) {
        return (int) ((value * 5.0d) / 16.0d);
    }

    public static Pair<Integer, Integer> getSize(int value, String textValue) {
        if (value == ResizeType.SOCIAL_STORY.ordinal()) {
            if (textValue.equals("480p")) {
                return new Pair<>(480, 854);
            }
            if (textValue.equals("720p")) {
                return new Pair<>(720, 1280);
            }
            if (textValue.equals("1080p")) {
                return new Pair<>(1080, 1920);
            }
        }
        if (value == ResizeType.YOUTUBE_THUMBNAIL.ordinal()) {
            if (textValue.equals("480p")) {
                return new Pair<>(854, 480);
            }
            if (textValue.equals("720p")) {
                return new Pair<>(1280, 720);
            }
            if (textValue.equals("1080p")) {
                return new Pair<>(1920, 1080);
            }
        }
        if (textValue.equals("480p")) {
            return new Pair<>(480, 480);
        }
        if (textValue.equals("720p")) {
            return new Pair<>(720, 720);
        }
        return new Pair<>(1080, 1080);
    }

    public static int calculateHeight(int value) {
        return Math.round((value * ASPECT_RATIO_HEIGHT) / ASPECT_RATIO_WIDTH);
    }

    public static int calculateHeight_Youtube(int value) {
        return Math.round((value * ASPECT_RATIO_WIDTH) / ASPECT_RATIO_HEIGHT);
    }

    public static int calculateWidth(int value) {
        return Math.round((value * ASPECT_RATIO_WIDTH) / ASPECT_RATIO_HEIGHT);
    }

    private static int findGCD(int value, int value2) {
        while (true) {
            int i3 = value2;
            int i4 = value;
            value = i3;
            if (value == 0) {
                return i4;
            }
            value2 = i4 % value;
        }
    }

    public static Point calculateAspectRatio(int value, int value2) {
        int findGCD = findGCD(value, value2);
        return new Point(value / findGCD, value2 / findGCD);
    }
}
