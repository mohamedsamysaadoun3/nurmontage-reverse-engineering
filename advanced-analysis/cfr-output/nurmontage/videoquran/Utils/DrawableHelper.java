/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.Utils;

import hazem.nurmontage.videoquran.R$drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class DrawableHelper {
    private static final Map drawableIconMap;
    private static final Map drawableMap;

    static {
        HashMap<String, Integer> hashMap;
        drawableIconMap = hashMap = new HashMap<String, Integer>();
        Integer n = R$drawable.hafes_icon;
        hashMap.put("hafes", n);
        n = R$drawable.warach_icon;
        hashMap.put("warach", n);
        n = R$drawable.shamerli_icon;
        hashMap.put("shamerli", n);
        n = R$drawable.nour_hoda_icon;
        hashMap.put("nour_hode", n);
        n = R$drawable.amiri_icon;
        hashMap.put("amiri", n);
        n = R$drawable.taha_icon;
        hashMap.put("taha", n);
        drawableMap = hashMap = new HashMap<String, Integer>();
        n = R$drawable.bg_1;
        hashMap.put("bg_1", n);
        n = R$drawable.bg_2;
        hashMap.put("bg_2", n);
        n = R$drawable.bg_3;
        hashMap.put("bg_3", n);
        n = R$drawable.bg_4;
        hashMap.put("bg_4", n);
        n = R$drawable.bg_5;
        hashMap.put("bg_5", n);
        n = R$drawable.bg_6;
        hashMap.put("bg_6", n);
        n = R$drawable.bg_7;
        hashMap.put("bg_7", n);
        n = R$drawable.bg_8;
        hashMap.put("bg_8", n);
        n = R$drawable.bg_9;
        hashMap.put("bg_9", n);
        n = R$drawable.bg_10;
        hashMap.put("bg_10", n);
        n = R$drawable.bg_11;
        hashMap.put("bg_11", n);
        n = R$drawable.bg_12;
        hashMap.put("bg_12", n);
        n = R$drawable.bg_13;
        hashMap.put("bg_13", n);
        n = R$drawable.bg_14;
        hashMap.put("bg_14", n);
        n = R$drawable.bg_15;
        hashMap.put("bg_15", n);
        n = R$drawable.bg_16;
        hashMap.put("bg_16", n);
        n = R$drawable.bg_17;
        hashMap.put("bg_17", n);
        n = R$drawable.bg_18;
        hashMap.put("bg_18", n);
        n = R$drawable.bg_19;
        hashMap.put("bg_19", n);
        n = R$drawable.bg_20;
        hashMap.put("bg_20", n);
        n = R$drawable.bg_21;
        hashMap.put("bg_21", n);
        n = R$drawable.bg_22;
        hashMap.put("bg_22", n);
        n = R$drawable.bg_23;
        hashMap.put("bg_23", n);
        n = R$drawable.bg_24;
        hashMap.put("bg_24", n);
        n = R$drawable.bg_25;
        hashMap.put("bg_25", n);
        n = R$drawable.bg_26;
        hashMap.put("bg_26", n);
        n = R$drawable.bg_27;
        hashMap.put("bg_27", n);
        n = R$drawable.bg_28;
        hashMap.put("bg_28", n);
        n = R$drawable.bg_29;
        hashMap.put("bg_29", n);
        n = R$drawable.bg_30;
        hashMap.put("bg_30", n);
        n = R$drawable.bg_31;
        hashMap.put("bg_31", n);
        n = R$drawable.bg_32;
        hashMap.put("bg_32", n);
        n = R$drawable.bg_33;
        hashMap.put("bg_33", n);
        n = R$drawable.bg_34;
        hashMap.put("bg_34", n);
        n = R$drawable.bg_35;
        hashMap.put("bg_35", n);
        n = R$drawable.bg_36;
        hashMap.put("bg_36", n);
        n = R$drawable.bg_37;
        hashMap.put("bg_37", n);
        n = R$drawable.bg_38;
        hashMap.put("bg_38", n);
    }

    public static int getIDDrawableByName(String object) {
        Map map;
        try {
            map = drawableMap;
        }
        catch (Exception exception) {
            return R$drawable.bg_24;
        }
        object = map.get(object);
        object = (Integer)object;
        return (Integer)object;
    }

    public static int getIDDrawableIconByName(String object) {
        Map map;
        try {
            map = drawableIconMap;
        }
        catch (Exception exception) {
            return R$drawable.hafes_icon;
        }
        object = map.get(object);
        object = (Integer)object;
        return (Integer)object;
    }

    public static int getIdResource(String string2) {
        String string3;
        boolean bl;
        if (string2 != null && !(bl = string2.contains(string3 = "i"))) {
            string3 = "t";
            bl = string2.contains(string3);
            if (bl) {
                return R$drawable.ic_tiktok;
            }
            string3 = "y_16:9";
            boolean bl2 = string2.equals(string3);
            if (bl2) {
                return R$drawable.ic_youtube;
            }
            return R$drawable.ic_youtube_shorts_icon;
        }
        return R$drawable.ic_instagram;
    }

    public static Map.Entry getRandomDrawableEntry() {
        Random random = new Random();
        Set set = drawableMap.entrySet();
        ArrayList arrayList = new ArrayList(set);
        int n = arrayList.size();
        int n2 = random.nextInt(n);
        return (Map.Entry)arrayList.get(n2);
    }
}

