// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.util.Collections;
import java.util.Collection;
import hazem.nurmontage.videoquran.model.WordModel;
import java.util.ArrayList;
import java.util.List;

public class WordProcessor
{
    public static int mapIndexAfterGroupReverse(int n, final int a, int min) {
        final int n2 = n / a * a;
        min -= n2;
        min = Math.min(a, min);
        n %= a;
        min = min - 1 - n;
        return n2 + min;
    }
    
    public List findAndSelectPhrase(String trim, final String s) {
        trim = trim.trim();
        final String s2 = "\\s+";
        final String[] split = trim.split(s2);
        final String[] split2 = s.trim().split(s2);
        final ArrayList list = new ArrayList();
        int n = 0;
        int n3 = 0;
    Label_0034:
        while (true) {
            final int n2 = split.length - split2.length;
            n3 = -1;
            if (n <= n2) {
                for (int i = 0; i < split2.length; ++i) {
                    if (!split[n + i].equals(split2[i])) {
                        ++n;
                        continue Label_0034;
                    }
                }
                break;
            }
            n = n3;
            break;
        }
        for (int j = 0; j < split.length; ++j) {
            list.add(new WordModel(split[j], n != n3 && j >= n && j < split2.length + n));
        }
        return list;
    }
    
    public List reverseInGroupsOfFour(final List list) {
        final ArrayList list2 = new ArrayList();
        int a;
        for (int i = 0; i < list.size(); i = a) {
            a = i + 4;
            final ArrayList list3 = new ArrayList<Object>(list.subList(i, Math.min(a, list.size())));
            Collections.reverse(list3);
            list2.addAll(list3);
        }
        return list2;
    }
}
