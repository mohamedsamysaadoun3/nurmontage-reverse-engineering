/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.util.Pair
 *  androidx.core.content.ContextCompat
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import androidx.core.content.ContextCompat;
import hazem.nurmontage.videoquran.constant.ResizeType;

public class Utils {
    private static final char CHARACTER_TO_COUNT = ' ';

    public static int countIndex(int n, int n2, String string2) {
        int n3 = 0;
        if (string2 != null && n >= 0) {
            int n4;
            int n5 = n;
            int n6 = 0;
            while (true) {
                int n7 = string2.length();
                n4 = 32;
                if (n5 >= n7 || n6 > n2) break;
                n7 = string2.charAt(n5);
                if (n7 == n4) {
                    ++n6;
                }
                if (n6 > n2) break;
                ++n5;
            }
            while (n < (n5 = string2.length()) && n3 <= n2) {
                n5 = string2.charAt(n);
                if (n5 == n4) {
                    ++n3;
                }
                ++n;
            }
            return n;
        }
        if (string2 != null) {
            n3 = string2.length();
        }
        return n3;
    }

    public static int countIndex(int n, String string2) {
        int n2;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        while (true) {
            int n6 = string2.length();
            n2 = 32;
            if (n4 >= n6 || n5 >= n) break;
            n6 = string2.charAt(n4);
            if (n6 == n2) {
                ++n5;
            }
            if (n5 > n) break;
            ++n4;
        }
        n4 = 0;
        while (n3 < (n5 = string2.length()) && n4 < n) {
            n5 = string2.charAt(n3);
            if (n5 == n2) {
                ++n4;
            }
            ++n3;
        }
        return n3;
    }

    public static int countSpace(int n, String string2) {
        if (string2 != null && n > 0) {
            int n2 = string2.length();
            n = Math.min(n, n2);
            n2 = 0;
            for (int i = 0; i < n; ++i) {
                char c;
                char c2 = string2.charAt(i);
                if (c2 != (c = ' ')) continue;
                ++n2;
            }
            return n2;
        }
        return 0;
    }

    public static int countSpace(String string2) {
        int n;
        if (string2 == null) {
            return 0;
        }
        int n2 = 0;
        for (int i = 0; i < (n = string2.length()); ++i) {
            int n3;
            n = string2.charAt(i);
            if (n != (n3 = 32)) continue;
            ++n2;
        }
        return n2;
    }

    public static float f2(float f) {
        float f2 = 100.0f;
        return (float)Math.round(f * f2) / f2;
    }

    public static Pair getDimension(ResizeType object, int n) {
        int n2;
        ResizeType resizeType;
        ResizeType resizeType2;
        int n3;
        int n4 = object.ordinal();
        if (n4 == (n3 = (resizeType2 = ResizeType.SOCIAL_STORY).ordinal())) {
            float f = n;
            resizeType = ResizeType.VERTICAL;
            float f2 = resizeType.getValue();
            n2 = (int)(f *= f2);
            int n5 = n;
            n = n2;
            n2 = n5;
        } else {
            n2 = object.ordinal();
            if (n2 == (n4 = (resizeType = ResizeType.YOUTUBE_THUMBNAIL).ordinal())) {
                float f = n;
                resizeType = ResizeType.YOUTUBE_THUMBNAIL;
                float f3 = resizeType.getValue();
                n2 = (int)(f *= f3);
            } else {
                n2 = n;
            }
        }
        Integer n6 = n;
        object = n2;
        resizeType = new Pair((Object)n6, object);
        return resizeType;
    }

    public static Drawable getDrawableByName(Context context, String string2) {
        String string3;
        String string4;
        Resources resources = context.getResources();
        int n = resources.getIdentifier(string2, string4 = "drawable", string3 = context.getPackageName());
        if (n != 0) {
            return ContextCompat.getDrawable((Context)context, (int)n);
        }
        return null;
    }

    public static int indexOf(int[] nArray, int n) {
        int n2;
        for (int i = 0; i < (n2 = nArray.length); ++i) {
            n2 = nArray[i];
            if (n2 != n) continue;
            return i;
        }
        return -1;
    }

    public static boolean isAppInstalled(Context context, String string2) {
        try {
            context = context.getPackageManager();
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return false;
        }
        context.getPackageInfo(string2, 0);
        return true;
    }

    public static boolean isProbablyLArabic(String string2) {
        int n;
        for (int i = 0; i < (n = string2.length()); i += n) {
            int n2;
            n = string2.codePointAt(i);
            if (n >= (n2 = 1536) && n <= (n2 = 1760)) {
                return true;
            }
            n = Character.charCount(n);
        }
        return false;
    }
}

