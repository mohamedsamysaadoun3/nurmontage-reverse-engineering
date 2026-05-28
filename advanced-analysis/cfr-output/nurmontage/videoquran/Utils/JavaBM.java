/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaBM {
    private String mPattern;
    private String mText;
    private int[] skipTable;

    public JavaBM() {
        int[] nArray = new int[42];
        this.skipTable = nArray;
        this.mText = "";
    }

    public JavaBM(String string2) {
        int[] nArray = new int[42];
        this.skipTable = nArray;
        this.mText = string2;
    }

    public static List match(String string2, String string3) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n = string3.length();
        int n2 = string2.length();
        Map map = JavaBM.preprocessForBadCharacterShift(string2);
        int n3 = 1;
        if ((n2 -= n3) >= n) {
            return arrayList;
        }
        int n4 = 0;
        while (true) {
            if (n2 < 0) {
                continue;
            }
            int n5 = n4 + n2;
            int n6 = string3.charAt(n5);
            char c = string2.charAt(n2);
            if (n5 >= n) continue;
            if (n6 != c) {
                Comparable<Character> comparable = Character.valueOf((char)n6);
                if ((comparable = (Integer)map.get(comparable)) != null) {
                    n6 = (Integer)comparable + n4;
                    if ((n5 -= n6) <= 0) {
                        n5 = n3;
                    }
                    n5 += n4;
                }
                n4 = ++n5;
                continue;
            }
            if (n2 == 0) {
                Integer n7 = n4;
                arrayList.add(n7);
                ++n4;
            }
            n2 += -1;
        }
    }

    private static Map preprocessForBadCharacterShift(String string2) {
        HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
        for (int i = string2.length() + -1; i >= 0; i += -1) {
            char c = string2.charAt(i);
            Comparable<Character> comparable = Character.valueOf(c);
            boolean bl = hashMap.containsKey(comparable);
            if (bl) continue;
            Character c2 = Character.valueOf(c);
            comparable = i;
            hashMap.put(c2, (Character)comparable);
        }
        return hashMap;
    }

    private void setSkipTable(String string2, int[] nArray) {
        int n;
        Arrays.fill(nArray, -1);
        for (int i = 0; i < (n = string2.length()); ++i) {
            int n2;
            int n3;
            n = string2.charAt(i);
            if (n >= (n3 = 1570) && (n = (int)string2.charAt(i)) <= (n2 = 1610)) {
                n = string2.charAt(i) - n3;
                nArray[n] = i;
                continue;
            }
            n = 41;
            nArray[n] = i;
        }
    }

    public String getmPattern() {
        return this.mPattern;
    }

    public int match(String string2) {
        int n = 0;
        block0: while (true) {
            int n2;
            int n3 = string2.length();
            String string3 = this.mPattern;
            int n4 = string3.length();
            if (n > (n3 -= n4)) break;
            String string4 = this.mPattern;
            n3 = string4.length();
            n4 = 1;
            n3 -= n4;
            int n5 = n2 = 1570;
            while (true) {
                int n6;
                block8: {
                    block7: {
                        if (n3 < 0) break block7;
                        String string5 = this.mPattern;
                        n5 = string5.charAt(n3);
                        n6 = n + n3;
                        if (n5 == (n6 = (int)string2.charAt(n6))) break block8;
                        n5 = n6;
                    }
                    if (n5 < n2 || n5 > (n6 = 1610)) {
                        n5 = 1611;
                    }
                    if (n3 < 0) {
                        return n;
                    }
                    int[] nArray = this.skipTable;
                    n5 -= n2;
                    n2 = nArray[n5];
                    n3 = Math.max(n3 - n2, n4);
                    n += n3;
                    continue block0;
                }
                n3 += -1;
                n5 = n6;
            }
            break;
        }
        return -1;
    }

    public void setmPattern(String string2) {
        this.mPattern = string2;
        int[] nArray = this.skipTable;
        this.setSkipTable(string2, nArray);
    }
}

