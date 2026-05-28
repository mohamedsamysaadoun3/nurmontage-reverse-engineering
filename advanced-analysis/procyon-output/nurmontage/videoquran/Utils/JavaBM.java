// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class JavaBM
{
    private String mPattern;
    private String mText;
    private int[] skipTable;
    
    public JavaBM() {
        this.skipTable = new int[42];
        this.mText = "";
    }
    
    public JavaBM(final String mText) {
        this.skipTable = new int[42];
        this.mText = mText;
    }
    
    public static List match(final String s, final String s2) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        final int length = s2.length();
        final int length2 = s.length();
        final Map preprocessForBadCharacterShift = preprocessForBadCharacterShift(s);
        final int n = 1;
        int index = length2 - n;
        if (index >= length) {
            return list;
        }
        int i = 0;
        while (true) {
            if (index >= 0) {
                final int index2 = i + index;
                final char char1 = s2.charAt(index2);
                final char char2 = s.charAt(index);
                if (index2 >= length) {
                    continue;
                }
                if (char1 != char2) {
                    final Integer n2 = preprocessForBadCharacterShift.get(char1);
                    int n3;
                    if (n2 == null) {
                        n3 = index2 + 1;
                    }
                    else {
                        int n4 = index2 - (n2 + i);
                        if (n4 <= 0) {
                            n4 = n;
                        }
                        n3 = n4 + i;
                    }
                    i = n3;
                }
                else {
                    if (index == 0) {
                        list.add(i);
                        ++i;
                    }
                    --index;
                }
            }
        }
    }
    
    private static Map preprocessForBadCharacterShift(final String s) {
        final HashMap hashMap = new HashMap();
        for (int i = s.length() - 1; i >= 0; --i) {
            final char char1 = s.charAt(i);
            if (!hashMap.containsKey(char1)) {
                hashMap.put(char1, i);
            }
        }
        return hashMap;
    }
    
    private void setSkipTable(final String s, final int[] a) {
        Arrays.fill(a, -1);
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            final char c = '\u0622';
            if (char1 >= c && s.charAt(i) <= '\u064a') {
                a[s.charAt(i) - c] = i;
            }
            else {
                a[41] = i;
            }
        }
    }
    
    public String getmPattern() {
        return this.mPattern;
    }
    
    public int match(final String s) {
        int i = 0;
    Label_0002:
        while (i <= s.length() - this.mPattern.length()) {
            final int length = this.mPattern.length();
            final int b = 1;
            int j = length - b;
            int n2;
            final int n = n2 = 1570;
            while (true) {
                while (j >= 0) {
                    final char char1 = this.mPattern.charAt(j);
                    final char char2 = s.charAt(i + j);
                    if (char1 != char2) {
                        n2 = char2;
                        if (n2 < n || n2 > 1610) {
                            n2 = 1611;
                        }
                        if (j < 0) {
                            return i;
                        }
                        i += Math.max(j - this.skipTable[n2 - n], b);
                        continue Label_0002;
                    }
                    else {
                        --j;
                        n2 = char2;
                    }
                }
                continue;
            }
        }
        return -1;
    }
    
    public void setmPattern(final String mPattern) {
        this.setSkipTable(this.mPattern = mPattern, this.skipTable);
    }
}
