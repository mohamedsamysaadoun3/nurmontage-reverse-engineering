package hazem.nurmontage.videoquran.Utils;

import hazem.nurmontage.videoquran.model.WordModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class WordProcessor {
    public static int mapIndexAfterGroupReverse(int i, int value2, int position3) {
        return ((i / value2) * value2) + ((Math.min(value2, position3 - r0) - 1) - (i % value2));
    }

    public List<WordModel> reverseInGroupsOfFour(List<WordModel> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < list.size()) {
            int value2 = i + 4;
            ArrayList arrayList2 = new ArrayList(list.subList(i, Math.min(value2, list.size())));
            Collections.reverse(arrayList2);
            arrayList.addAll(arrayList2);
            i = value2;
        }
        return arrayList;
    }

    public List<WordModel> findAndSelectPhrase(String str, String textValue2) {
        String[] split = str.trim().split("\\s+");
        String[] split2 = textValue2.trim().split("\\s+");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        loop0: while (true) {
            if (i > split.length - split2.length) {
                i = -1;
                break;
            }
            for (int value2 = 0; value2 < split2.length; value2++) {
                if (!split[i + value2].equals(split2[value2])) {
                    break;
                }
            }
            break loop0;
            i++;
        }
        int position3 = 0;
        while (position3 < split.length) {
            arrayList.add(new WordModel(split[position3], i != -1 && position3 >= i && position3 < split2.length + i));
            position3++;
        }
        return arrayList;
    }
}
