package hazem.nurmontage.videoquran.Utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class RemoveTashkeel {
    private static final char SPECIFIC_POINT_CHAR_CODE = '.';
    private static final Set<Character> TASHKEEL_SET = new HashSet();
    public static final List<String> arabicV_original;

    static {
        char[] cArr = {1611, 1612, 1613, 1614, 1615, 1616, 1617, 1618, 1619, 1620, 1621, 1648, 1600};
        for (int value = 0; value < 13; value++) {
            TASHKEEL_SET.add(Character.valueOf(cArr[value]));
        }
        arabicV_original = Arrays.asList("ؘ", "ؙ", "ؚ", "ؐ", "ؐؑ", "ؒ", "ؓ", "ؔ", "ؕ", "ؖ", "ؗ", "ؗ", "ﹰﹰ", "ﹲ", "ﹴ", "ﹸ", "ﹼ", "ﹾ", "ٍ", "ً", "ُ", "ِ", "َ", "ّ", "ٓ", "ٔ", "ْ", "ِ", "َّ", "َ", "َْ", "َ", "ً", "ٌ", "َ", "ُ", "ٍ", "َ", "ْ", "ِ", "ُ", "ّ", "ً");
    }

    public static boolean isTashkeel(char c) {
        return TASHKEEL_SET.contains(Character.valueOf(c));
    }

    public static String removeTashkeel(String textValue) {
        if (textValue == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(textValue.length());
        for (int value = 0; value < textValue.length(); value++) {
            char charAt = textValue.charAt(value);
            if (!isTashkeel(charAt)) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static int countTashkeel(String textValue) {
        if (textValue == null) {
            return 0;
        }
        int value = 0;
        for (int value2 = 0; value2 < textValue.length(); value2++) {
            if (isTashkeel(textValue.charAt(value2))) {
                value++;
            }
        }
        return value;
    }

    public static String removeTashkeelAndPoint(String textValue) {
        if (textValue == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(textValue.length());
        for (int value = 0; value < textValue.length(); value++) {
            char charAt = textValue.charAt(value);
            if (!isTashkeel(charAt) && charAt != '.') {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static String removeChar(String textValue) {
        if (textValue == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(textValue.length());
        for (int value = 0; value < textValue.length(); value++) {
            char charAt = textValue.charAt(value);
            if (isTashkeel(charAt)) {
                sb.append(charAt);
            } else {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
