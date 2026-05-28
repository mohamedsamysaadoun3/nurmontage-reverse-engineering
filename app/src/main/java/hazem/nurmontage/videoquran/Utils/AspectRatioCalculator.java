package hazem.nurmontage.videoquran.Utils;

import android.graphics.Point;
import hazem.nurmontage.videoquran.constant.ResizeType;
import kotlin.Pair;

/* loaded from: classes2.dex */
public class AspectRatioCalculator {
    private static final float ASPECT_RATIO_HEIGHT = 16.0f;
    private static final float ASPECT_RATIO_WIDTH = 9.0f;

    public static int calcuWattermark(int index) {
        return (int) ((index * 5.0d) / 16.0d);
    }

    public static Pair<Integer, Integer> getSize(int size, String textValue) {
        if (size == ResizeType.SOCIAL_STORY.ordinal()) {
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
        if (size == ResizeType.YOUTUBE_THUMBNAIL.ordinal()) {
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

    public static int calculateHeight(int width) {
        return Math.round((width * ASPECT_RATIO_HEIGHT) / ASPECT_RATIO_WIDTH);
    }

    public static int calculateHeight_Youtube(int width) {
        return Math.round((width * ASPECT_RATIO_WIDTH) / ASPECT_RATIO_HEIGHT);
    }

    public static int calculateWidth(int width) {
        return Math.round((width * ASPECT_RATIO_WIDTH) / ASPECT_RATIO_HEIGHT);
    }

    private static int findGCD(int index, int index5) {
        while (true) {
            int i3 = index5;
            int i4 = index;
            index = i3;
            if (index == 0) {
                return i4;
            }
            index5 = i4 % index;
        }
    }

    public static Point calculateAspectRatio(int index, int index8) {
        int findGCD = findGCD(index, index8);
        return new Point(index / findGCD, index8 / findGCD);
    }
}
