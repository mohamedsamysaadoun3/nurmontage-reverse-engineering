/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.Utils;

import hazem.nurmontage.videoquran.model.WordModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordProcessor {
    public static int mapIndexAfterGroupReverse(int n, int n2, int n3) {
        int n4 = n / n2 * n2;
        n3 -= n4;
        n3 = Math.min(n2, n3);
        n3 = n3 + -1 - (n %= n2);
        return n4 + n3;
    }

    public List findAndSelectPhrase(String stringArray, String stringArray2) {
        Object object;
        String string2;
        int n;
        int n2;
        int n3;
        int n4;
        ArrayList<Object> arrayList;
        block6: {
            block5: {
                stringArray = stringArray.trim();
                arrayList = "\\s+";
                stringArray = stringArray.split((String)((Object)arrayList));
                stringArray2 = stringArray2.trim().split((String)((Object)arrayList));
                arrayList = new ArrayList<Object>();
                n4 = 0;
                block0: while (true) {
                    n3 = stringArray.length;
                    n2 = stringArray2.length;
                    n3 -= n2;
                    n2 = -1;
                    if (n4 > n3) break block5;
                    for (n3 = 0; n3 < (n = stringArray2.length); ++n3) {
                        n = n4 + n3;
                        string2 = stringArray[n];
                        object = stringArray2[n3];
                        if (n = (int)(string2.equals(object) ? 1 : 0)) continue;
                        ++n4;
                        continue block0;
                    }
                    break block6;
                    break;
                }
                {
                    break;
                }
            }
            n4 = n2;
        }
        for (n3 = 0; n3 < (n = stringArray.length); ++n3) {
            if (n4 != n2 && n3 >= n4 && n3 < (n = stringArray2.length + n4)) {
                n = 1;
            } else {
                n = 0;
                string2 = null;
            }
            String string3 = stringArray[n3];
            object = new WordModel(string3, n != 0);
            arrayList.add(object);
        }
        return arrayList;
    }

    public List reverseInGroupsOfFour(List list) {
        int n;
        ArrayList arrayList = new ArrayList();
        int n2 = 0;
        List list2 = null;
        while (n2 < (n = list.size())) {
            n = n2 + 4;
            int n3 = list.size();
            n3 = Math.min(n, n3);
            list2 = list.subList(n2, n3);
            ArrayList arrayList2 = new ArrayList(list2);
            Collections.reverse(arrayList2);
            arrayList.addAll(arrayList2);
            n2 = n;
        }
        return arrayList;
    }
}

