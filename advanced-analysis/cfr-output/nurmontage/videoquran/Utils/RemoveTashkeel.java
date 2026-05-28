/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.Utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveTashkeel {
    private static final char SPECIFIC_POINT_CHAR_CODE = '.';
    private static final Set TASHKEEL_SET;
    public static final List arabicV_original;

    static {
        Object object;
        Object object2;
        Object[] objectArray;
        int n = 13;
        char[] cArray = objectArray = new char[n];
        char[] cArray2 = objectArray;
        cArray[0] = 1611;
        cArray2[1] = 1612;
        cArray[2] = 1613;
        cArray2[3] = 1614;
        cArray[4] = 1615;
        cArray2[5] = 1616;
        cArray[6] = 1617;
        cArray2[7] = 1618;
        cArray[8] = 1619;
        cArray2[9] = 1620;
        cArray[10] = 1621;
        cArray2[11] = 1648;
        cArray2[12] = 1600;
        Object object3 = new HashSet();
        TASHKEEL_SET = object3;
        object3 = null;
        String string2 = null;
        for (int i = 0; i < n; ++i) {
            char c = objectArray[i];
            object2 = TASHKEEL_SET;
            object = Character.valueOf(c);
            object2.add(object);
        }
        objectArray = new String[43];
        objectArray[0] = (char)"\u0618";
        objectArray[1] = (char)"\u0619";
        objectArray[2] = (char)"\u061a";
        objectArray[3] = (char)"\u0610";
        objectArray[4] = (char)"\u0610\u0611";
        objectArray[5] = (char)"\u0612";
        objectArray[6] = (char)"\u0613";
        objectArray[7] = (char)"\u0614";
        objectArray[8] = (char)"\u0615";
        objectArray[9] = (char)"\u0616";
        string2 = "\u0617";
        objectArray[10] = (char)string2;
        objectArray[11] = (char)string2;
        objectArray[12] = (char)"\ufe70\ufe70";
        objectArray[n] = (char)"\ufe72";
        objectArray[14] = (char)"\ufe74";
        objectArray[15] = (char)"\ufe78";
        objectArray[16] = (char)"\ufe7c";
        objectArray[17] = (char)"\ufe7e";
        object3 = "\u064d";
        objectArray[18] = (char)object3;
        string2 = "\u064b";
        objectArray[19] = (char)string2;
        object = "\u064f";
        objectArray[20] = (char)object;
        object2 = "\u0650";
        objectArray[21] = (char)object2;
        String string3 = "\u064e";
        objectArray[22] = (char)string3;
        String string4 = "\u0651";
        objectArray[23] = (char)string4;
        objectArray[24] = (char)"\u0653";
        objectArray[25] = (char)"\u0654";
        String string5 = "\u0652";
        objectArray[26] = (char)string5;
        objectArray[27] = (char)object2;
        objectArray[28] = (char)"\u0651\u064e";
        objectArray[29] = (char)string3;
        objectArray[30] = (char)"\u064e\u0652";
        objectArray[31] = (char)string3;
        objectArray[32] = (char)string2;
        objectArray[33] = (char)"\u064c";
        objectArray[34] = (char)string3;
        objectArray[35] = (char)object;
        objectArray[36] = (char)object3;
        objectArray[37] = (char)string3;
        objectArray[38] = (char)string5;
        objectArray[39] = (char)object2;
        objectArray[40] = (char)object;
        objectArray[41] = (char)string4;
        objectArray[42] = (char)string2;
        arabicV_original = Arrays.asList(objectArray);
    }

    public static int countTashkeel(String string2) {
        int n;
        if (string2 == null) {
            return 0;
        }
        int n2 = 0;
        for (int i = 0; i < (n = string2.length()); ++i) {
            n = RemoveTashkeel.isTashkeel(string2.charAt(i)) ? 1 : 0;
            if (n == 0) continue;
            ++n2;
        }
        return n2;
    }

    public static boolean isTashkeel(char c) {
        Set set = TASHKEEL_SET;
        Character c2 = Character.valueOf(c);
        return set.contains(c2);
    }

    public static String removeChar(String string2) {
        int n;
        if (string2 == null) {
            return null;
        }
        int n2 = string2.length();
        StringBuilder stringBuilder = new StringBuilder(n2);
        for (n2 = 0; n2 < (n = string2.length()); ++n2) {
            n = string2.charAt(n2);
            boolean bl = RemoveTashkeel.isTashkeel((char)n);
            if (bl) {
                stringBuilder.append((char)n);
                continue;
            }
            n = 32;
            stringBuilder.append((char)n);
        }
        return stringBuilder.toString();
    }

    public static String removeTashkeel(String string2) {
        char c;
        if (string2 == null) {
            return null;
        }
        int n = string2.length();
        StringBuilder stringBuilder = new StringBuilder(n);
        for (n = 0; n < (c = string2.length()); ++n) {
            c = string2.charAt(n);
            boolean bl = RemoveTashkeel.isTashkeel(c);
            if (bl) continue;
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static String removeTashkeelAndPoint(String string2) {
        char c;
        if (string2 == null) {
            return null;
        }
        int n = string2.length();
        StringBuilder stringBuilder = new StringBuilder(n);
        for (n = 0; n < (c = string2.length()); ++n) {
            c = string2.charAt(n);
            char c2 = RemoveTashkeel.isTashkeel(c);
            if (c2 != '\u0000' || c == (c2 = '.')) continue;
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}

