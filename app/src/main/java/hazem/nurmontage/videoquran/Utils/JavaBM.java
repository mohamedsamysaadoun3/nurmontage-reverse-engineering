package hazem.nurmontage.videoquran.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class JavaBM {
    private String mPattern;
    private String mText;
    private int[] skipTable;

    public JavaBM(String textValue) {
        this.skipTable = new int[42];
        this.mText = textValue;
    }

    public JavaBM() {
        this.skipTable = new int[42];
        this.mText = "";
    }

    public void setmPattern(String textValue) {
        this.mPattern = textValue;
        setSkipTable(textValue, this.skipTable);
    }

    public String getmPattern() {
        return this.mPattern;
    }

    public int match(String textValue) {
        int value = 0;
        while (value <= textValue.length() - this.mPattern.length()) {
            int length = this.mPattern.length() - 1;
            char c = 1570;
            while (true) {
                if (length < 0) {
                    break;
                }
                char charAt = this.mPattern.charAt(length);
                char charAt2 = textValue.charAt(value + length);
                if (charAt != charAt2) {
                    c = charAt2;
                    break;
                }
                length--;
                c = charAt2;
            }
            if (c < 1570 || c > 1610) {
                c = 1611;
            }
            if (length < 0) {
                return value;
            }
            value += Math.max(length - this.skipTable[c - 1570], 1);
        }
        return -1;
    }

    private void setSkipTable(String textValue, int[] iArr) {
        Arrays.fill(iArr, -1);
        for (int value = 0; value < textValue.length(); value++) {
            if (textValue.charAt(value) < 1570 || textValue.charAt(value) > 1610) {
                iArr[41] = value;
            } else {
                iArr[textValue.charAt(value) - 1570] = value;
            }
        }
    }

    public static List<Integer> match(String textValue, String textValue2) {
        int value;
        ArrayList arrayList = new ArrayList();
        int length = textValue2.length();
        int length2 = textValue.length();
        Map<Character, Integer> preprocessForBadCharacterShift = preprocessForBadCharacterShift(textValue);
        int i2 = length2 - 1;
        if (i2 >= length) {
            return arrayList;
        }
        int i3 = 0;
        while (true) {
            if (i2 >= 0) {
                int i4 = i3 + i2;
                char charAt = textValue2.charAt(i4);
                char charAt2 = textValue.charAt(i2);
                if (i4 < length) {
                    if (charAt != charAt2) {
                        Integer num = preprocessForBadCharacterShift.get(Character.valueOf(charAt));
                        if (num == null) {
                            value = i4 + 1;
                        } else {
                            int intValue = i4 - (num.intValue() + i3);
                            if (intValue <= 0) {
                                intValue = 1;
                            }
                            value = intValue + i3;
                        }
                        i3 = value;
                    } else {
                        if (i2 == 0) {
                            arrayList.add(Integer.valueOf(i3));
                            i3++;
                        }
                        i2--;
                    }
                }
            }
        }
    }

    private static Map<Character, Integer> preprocessForBadCharacterShift(String textValue) {
        HashMap hashMap = new HashMap();
        for (int length = textValue.length() - 1; length >= 0; length--) {
            char charAt = textValue.charAt(length);
            if (!hashMap.containsKey(Character.valueOf(charAt))) {
                hashMap.put(Character.valueOf(charAt), Integer.valueOf(length));
            }
        }
        return hashMap;
    }
}
