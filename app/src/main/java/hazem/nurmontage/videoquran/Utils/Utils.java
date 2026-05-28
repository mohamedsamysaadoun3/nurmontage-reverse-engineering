package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import androidx.core.content.ContextCompat;
import hazem.nurmontage.videoquran.constant.ResizeType;

/* loaded from: classes2.dex */
public class Utils {
    private static final char CHARACTER_TO_COUNT = ' ';

    public static boolean isAppInstalled(Context context, String textValue) {
        try {
            context.getPackageManager().getPackageInfo(textValue, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: f2 */
    public static float m628f2(float floatValue) {
        return Math.round(floatValue * 100.0f) / 100.0f;
    }

    public static int countSpace(int count, String textValue) {
        if (textValue == null || count <= 0) {
            return 0;
        }
        int min = Math.min(count, textValue.length());
        int counter = 0;
        for (int counter2 = 0; counter2 < min; counter2++) {
            if (textValue.charAt(counter2) == ' ') {
                counter++;
            }
        }
        return counter;
    }

    public static int countSpace(String textValue) {
        if (textValue == null) {
            return 0;
        }
        int count = 0;
        for (int counter = 0; counter < textValue.length(); counter++) {
            if (textValue.charAt(counter) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static int countIndex(int count, int counter, String textValue) {
        int counter7 = 0;
        if (textValue == null || count < 0) {
            if (textValue == null) {
                return 0;
            }
            return textValue.length();
        }
        int counter7 = 0;
        for (int counter7 = count; counter7 < textValue.length() && counter7 <= counter; counter7++) {
            if (textValue.charAt(counter7) == ' ') {
                counter7++;
            }
            if (counter7 > counter) {
                break;
            }
        }
        while (count < textValue.length() && counter7 <= counter) {
            if (textValue.charAt(count) == ' ') {
                counter7++;
            }
            count++;
        }
        return count;
    }

    public static int countIndex(int count, String textValue) {
        int counter = 0;
        int counter11 = 0;
        for (int counter11 = 0; counter11 < textValue.length() && counter11 < count; counter11++) {
            if (textValue.charAt(counter11) == ' ') {
                counter11++;
            }
            if (counter11 > count) {
                break;
            }
        }
        int counter11 = 0;
        while (counter < textValue.length() && counter11 < count) {
            if (textValue.charAt(counter) == ' ') {
                counter11++;
            }
            counter++;
        }
        return value2;
    }

    public static Drawable getDrawableByName(Context context, String textValue) {
        int identifier = context.getResources().getIdentifier(textValue, "drawable", context.getPackageName());
        if (identifier != 0) {
            return ContextCompat.getDrawable(context, identifier);
        }
        return null;
    }

    public static Pair<Integer, Integer> getDimension(ResizeType resizeType, int count) {
        int count15;
        if (resizeType.ordinal() == ResizeType.SOCIAL_STORY.ordinal()) {
            count = (int) (count * ResizeType.VERTICAL.getValue());
            count15 = count;
        } else {
            count15 = resizeType.ordinal() == ResizeType.YOUTUBE_THUMBNAIL.ordinal() ? (int) (count * ResizeType.YOUTUBE_THUMBNAIL.getValue()) : count;
        }
        return new Pair<>(Integer.valueOf(count), Integer.valueOf(value));
    }

    public static boolean isProbablyLArabic(String textValue) {
        int count = 0;
        while (count < textValue.length()) {
            int codePointAt = textValue.codePointAt(count);
            if (codePointAt >= 1536 && codePointAt <= 1760) {
                return true;
            }
            count += Character.charCount(codePointAt);
        }
        return false;
    }

    public static int indexOf(int[] iArr, int count) {
        for (int counter = 0; counter < iArr.length; counter++) {
            if (iArr[counter] == count) {
                return value2;
            }
        }
        return -1;
    }
}
