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
        int value2 = 0;
        for (int value3 = 0; value3 < min; value3++) {
            if (textValue.charAt(value3) == ' ') {
                value2++;
            }
        }
        return value2;
    }

    public static int countSpace(String textValue) {
        if (textValue == null) {
            return 0;
        }
        int count = 0;
        for (int value2 = 0; value2 < textValue.length(); value2++) {
            if (textValue.charAt(value2) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static int countIndex(int count, int value2, String textValue) {
        int value3 = 0;
        if (textValue == null || count < 0) {
            if (textValue == null) {
                return 0;
            }
            return textValue.length();
        }
        int value4 = 0;
        for (int value5 = count; value5 < textValue.length() && value4 <= value2; value5++) {
            if (textValue.charAt(value5) == ' ') {
                value4++;
            }
            if (value4 > value2) {
                break;
            }
        }
        while (count < textValue.length() && value3 <= value2) {
            if (textValue.charAt(count) == ' ') {
                value3++;
            }
            count++;
        }
        return count;
    }

    public static int countIndex(int count, String textValue) {
        int value2 = 0;
        int value3 = 0;
        for (int value4 = 0; value4 < textValue.length() && value3 < count; value4++) {
            if (textValue.charAt(value4) == ' ') {
                value3++;
            }
            if (value3 > count) {
                break;
            }
        }
        int value5 = 0;
        while (value2 < textValue.length() && value5 < count) {
            if (textValue.charAt(value2) == ' ') {
                value5++;
            }
            value2++;
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
        int value;
        if (resizeType.ordinal() == ResizeType.SOCIAL_STORY.ordinal()) {
            count = (int) (count * ResizeType.VERTICAL.getValue());
            value = count;
        } else {
            value = resizeType.ordinal() == ResizeType.YOUTUBE_THUMBNAIL.ordinal() ? (int) (count * ResizeType.YOUTUBE_THUMBNAIL.getValue()) : count;
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
        for (int value2 = 0; value2 < iArr.length; value2++) {
            if (iArr[value2] == count) {
                return value2;
            }
        }
        return -1;
    }
}
