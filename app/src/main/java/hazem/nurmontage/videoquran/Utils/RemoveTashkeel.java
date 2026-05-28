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
        for (int counter = 0; counter < 13; counter++) {
            TASHKEEL_SET.add(Character.valueOf(cArr[counter]));
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
        for (int counter = 0; counter < textValue.length(); counter++) {
            char charAt = textValue.charAt(counter);
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
        int counter = 0;
        for (int counter4 = 0; counter4 < textValue.length(); counter4++) {
            if (isTashkeel(textValue.charAt(counter4))) {
                counter++;
            }
        }
        return counter;
    }

    public static String removeTashkeelAndPoint(String textValue) {
        if (textValue == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(textValue.length());
        for (int counter = 0; counter < textValue.length(); counter++) {
            char charAt = textValue.charAt(counter);
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
        for (int counter = 0; counter < textValue.length(); counter++) {
            char charAt = textValue.charAt(counter);
            if (isTashkeel(charAt)) {
                sb.append(charAt);
            } else {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
