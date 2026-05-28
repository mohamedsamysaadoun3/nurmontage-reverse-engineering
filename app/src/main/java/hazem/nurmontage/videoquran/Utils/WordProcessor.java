package hazem.nurmontage.videoquran.Utils;

import hazem.nurmontage.videoquran.model.WordModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class WordProcessor {
    public static int mapIndexAfterGroupReverse(int i, int position, int position3) {
        return ((i / position) * position) + ((Math.min(position, position3 - r0) - 1) - (i % position));
    }

    public List<WordModel> reverseInGroupsOfFour(List<WordModel> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < list.size()) {
            int index = i + 4;
            ArrayList arrayList2 = new ArrayList(list.subList(i, Math.min(index, list.size())));
            Collections.reverse(arrayList2);
            arrayList.addAll(arrayList2);
            i = index;
        }
        return arrayList;
    }

    public List<WordModel> findAndSelectPhrase(String value, String textValue2) {
        String[] split = value.trim().split("\\s+");
        String[] split2 = textValue2.trim().split("\\s+");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        loop0: while (true) {
            if (i > split.length - split2.length) {
                i = -1;
                break;
            }
            for (int counter = 0; counter < split2.length; counter++) {
                if (!split[i + counter].equals(split2[counter])) {
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
