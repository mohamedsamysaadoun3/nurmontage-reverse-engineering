// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Random;
import hazem.nurmontage.videoquran.R$drawable;
import java.util.HashMap;
import java.util.Map;

public class DrawableHelper
{
    private static final Map drawableIconMap;
    private static final Map drawableMap;
    
    static {
        final HashMap drawableIconMap2 = new HashMap();
        (drawableIconMap = drawableIconMap2).put("hafes", R$drawable.hafes_icon);
        drawableIconMap2.put("warach", R$drawable.warach_icon);
        drawableIconMap2.put("shamerli", R$drawable.shamerli_icon);
        drawableIconMap2.put("nour_hode", R$drawable.nour_hoda_icon);
        drawableIconMap2.put("amiri", R$drawable.amiri_icon);
        drawableIconMap2.put("taha", R$drawable.taha_icon);
        final HashMap drawableMap2 = new HashMap();
        (drawableMap = drawableMap2).put("bg_1", R$drawable.bg_1);
        drawableMap2.put("bg_2", R$drawable.bg_2);
        drawableMap2.put("bg_3", R$drawable.bg_3);
        drawableMap2.put("bg_4", R$drawable.bg_4);
        drawableMap2.put("bg_5", R$drawable.bg_5);
        drawableMap2.put("bg_6", R$drawable.bg_6);
        drawableMap2.put("bg_7", R$drawable.bg_7);
        drawableMap2.put("bg_8", R$drawable.bg_8);
        drawableMap2.put("bg_9", R$drawable.bg_9);
        drawableMap2.put("bg_10", R$drawable.bg_10);
        drawableMap2.put("bg_11", R$drawable.bg_11);
        drawableMap2.put("bg_12", R$drawable.bg_12);
        drawableMap2.put("bg_13", R$drawable.bg_13);
        drawableMap2.put("bg_14", R$drawable.bg_14);
        drawableMap2.put("bg_15", R$drawable.bg_15);
        drawableMap2.put("bg_16", R$drawable.bg_16);
        drawableMap2.put("bg_17", R$drawable.bg_17);
        drawableMap2.put("bg_18", R$drawable.bg_18);
        drawableMap2.put("bg_19", R$drawable.bg_19);
        drawableMap2.put("bg_20", R$drawable.bg_20);
        drawableMap2.put("bg_21", R$drawable.bg_21);
        drawableMap2.put("bg_22", R$drawable.bg_22);
        drawableMap2.put("bg_23", R$drawable.bg_23);
        drawableMap2.put("bg_24", R$drawable.bg_24);
        drawableMap2.put("bg_25", R$drawable.bg_25);
        drawableMap2.put("bg_26", R$drawable.bg_26);
        drawableMap2.put("bg_27", R$drawable.bg_27);
        drawableMap2.put("bg_28", R$drawable.bg_28);
        drawableMap2.put("bg_29", R$drawable.bg_29);
        drawableMap2.put("bg_30", R$drawable.bg_30);
        drawableMap2.put("bg_31", R$drawable.bg_31);
        drawableMap2.put("bg_32", R$drawable.bg_32);
        drawableMap2.put("bg_33", R$drawable.bg_33);
        drawableMap2.put("bg_34", R$drawable.bg_34);
        drawableMap2.put("bg_35", R$drawable.bg_35);
        drawableMap2.put("bg_36", R$drawable.bg_36);
        drawableMap2.put("bg_37", R$drawable.bg_37);
        drawableMap2.put("bg_38", R$drawable.bg_38);
    }
    
    public static int getIDDrawableByName(final String s) {
        try {
            final Integer value = DrawableHelper.drawableMap.get(s);
            try {
                final Integer n = value;
                try {
                    return n;
                }
                catch (final Exception ex) {
                    return R$drawable.bg_24;
                }
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {}
    }
    
    public static int getIDDrawableIconByName(final String s) {
        try {
            final Integer value = DrawableHelper.drawableIconMap.get(s);
            try {
                final Integer n = value;
                try {
                    return n;
                }
                catch (final Exception ex) {
                    return R$drawable.hafes_icon;
                }
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {}
    }
    
    public static int getIdResource(final String s) {
        if (s == null || s.contains("i")) {
            return R$drawable.ic_instagram;
        }
        if (s.contains("t")) {
            return R$drawable.ic_tiktok;
        }
        if (s.equals("y_16:9")) {
            return R$drawable.ic_youtube;
        }
        return R$drawable.ic_youtube_shorts_icon;
    }
    
    public static Map.Entry getRandomDrawableEntry() {
        final Random random = new Random();
        final ArrayList list = new ArrayList(DrawableHelper.drawableMap.entrySet());
        return (Map.Entry)list.get(random.nextInt(list.size()));
    }
}
