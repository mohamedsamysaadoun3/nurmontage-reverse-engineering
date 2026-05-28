// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveTashkeel
{
    private static final char SPECIFIC_POINT_CHAR_CODE = '.';
    private static final Set TASHKEEL_SET;
    public static final List arabicV_original;
    
    static {
        final int n = 13;
        final char[] array2;
        final char[] array = array2 = new char[n];
        array2[0] = '\u064b';
        array2[1] = '\u064c';
        array2[2] = '\u064d';
        array2[3] = '\u064e';
        array2[4] = '\u064f';
        array2[5] = '\u0650';
        array2[6] = '\u0651';
        array2[7] = '\u0652';
        array2[8] = '\u0653';
        array2[9] = '\u0654';
        array2[10] = '\u0655';
        array2[11] = '\u0670';
        array2[12] = '\u0640';
        TASHKEEL_SET = new HashSet();
        for (int i = 0; i < n; ++i) {
            RemoveTashkeel.TASHKEEL_SET.add(array[i]);
        }
        final String[] a = new String[43];
        a[0] = "\u0618";
        a[1] = "\u0619";
        a[2] = "\u061a";
        a[3] = "\u0610";
        a[4] = "\u0610\u0611";
        a[5] = "\u0612";
        a[6] = "\u0613";
        a[7] = "\u0614";
        a[8] = "\u0615";
        a[9] = "\u0616";
        a[11] = (a[10] = "\u0617");
        a[12] = "\ufe70\ufe70";
        a[n] = "\ufe72";
        a[14] = "\ufe74";
        a[15] = "\ufe78";
        a[16] = "\ufe7c";
        a[17] = "\ufe7e";
        final String s = "\u064d";
        a[18] = s;
        final String s2 = "\u064b";
        a[19] = s2;
        final String s3 = "\u064f";
        a[20] = s3;
        final String s4 = "\u0650";
        a[21] = s4;
        final String s5 = "\u064e";
        a[22] = s5;
        final String s6 = "\u0651";
        a[23] = s6;
        a[24] = "\u0653";
        a[25] = "\u0654";
        final String s7 = "\u0652";
        a[26] = s7;
        a[27] = s4;
        a[28] = "\u0651\u064e";
        a[29] = s5;
        a[30] = "\u064e\u0652";
        a[31] = s5;
        a[32] = s2;
        a[33] = "\u064c";
        a[34] = s5;
        a[35] = s3;
        a[36] = s;
        a[37] = s5;
        a[38] = s7;
        a[39] = s4;
        a[40] = s3;
        a[41] = s6;
        a[42] = s2;
        arabicV_original = Arrays.asList(a);
    }
    
    public static int countTashkeel(final String s) {
        int i = 0;
        if (s == null) {
            return 0;
        }
        int n = 0;
        while (i < s.length()) {
            if (isTashkeel(s.charAt(i))) {
                ++n;
            }
            ++i;
        }
        return n;
    }
    
    public static boolean isTashkeel(final char c) {
        return RemoveTashkeel.TASHKEEL_SET.contains(c);
    }
    
    public static String removeChar(final String s) {
        if (s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (isTashkeel(char1)) {
                sb.append(char1);
            }
            else {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    
    public static String removeTashkeel(final String s) {
        if (s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (!isTashkeel(char1)) {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
    
    public static String removeTashkeelAndPoint(final String s) {
        if (s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (!isTashkeel(char1) && char1 != '.') {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
}
