// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.content.pm.PackageManager$NameNotFoundException;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.util.Pair;
import hazem.nurmontage.videoquran.constant.ResizeType;

public class Utils
{
    private static final char CHARACTER_TO_COUNT = ' ';
    
    public static int countIndex(int index, final int n, final String s) {
        int length = 0;
        if (s != null && index >= 0) {
            int index2 = index;
            int n2 = 0;
            char c;
            while (true) {
                final int length2 = s.length();
                c = ' ';
                if (index2 >= length2 || n2 > n) {
                    break;
                }
                if (s.charAt(index2) == c) {
                    ++n2;
                }
                if (n2 > n) {
                    break;
                }
                ++index2;
            }
            while (index < s.length() && length <= n) {
                if (s.charAt(index) == c) {
                    ++length;
                }
                ++index;
            }
            return index;
        }
        if (s != null) {
            length = s.length();
        }
        return length;
    }
    
    public static int countIndex(final int n, final String s) {
        int index = 0;
        int index2 = 0;
        int n2 = 0;
        char c;
        while (true) {
            final int length = s.length();
            c = ' ';
            if (index2 >= length || n2 >= n) {
                break;
            }
            if (s.charAt(index2) == c) {
                ++n2;
            }
            if (n2 > n) {
                break;
            }
            ++index2;
        }
        for (int n3 = 0; index < s.length() && n3 < n; ++index) {
            if (s.charAt(index) == c) {
                ++n3;
            }
        }
        return index;
    }
    
    public static int countSpace(int min, final String s) {
        int i = 0;
        if (s != null && min > 0) {
            min = Math.min(min, s.length());
            int n = 0;
            while (i < min) {
                if (s.charAt(i) == ' ') {
                    ++n;
                }
                ++i;
            }
            return n;
        }
        return 0;
    }
    
    public static int countSpace(final String s) {
        int i = 0;
        if (s == null) {
            return 0;
        }
        int n = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                ++n;
            }
            ++i;
        }
        return n;
    }
    
    public static float f2(final float n) {
        final float n2 = 100.0f;
        return Math.round(n * n2) / n2;
    }
    
    public static Pair getDimension(final ResizeType resizeType, int i) {
        int j;
        if (resizeType.ordinal() == ResizeType.SOCIAL_STORY.ordinal()) {
            final int n = (int)(i * ResizeType.VERTICAL.getValue());
            final int n2 = i;
            i = n;
            j = n2;
        }
        else if (resizeType.ordinal() == ResizeType.YOUTUBE_THUMBNAIL.ordinal()) {
            j = (int)(i * ResizeType.YOUTUBE_THUMBNAIL.getValue());
        }
        else {
            j = i;
        }
        return new Pair((Object)i, (Object)j);
    }
    
    public static Drawable getDrawableByName(final Context context, final String s) {
        final int identifier = context.getResources().getIdentifier(s, "drawable", context.getPackageName());
        if (identifier != 0) {
            return ContextCompat.getDrawable(context, identifier);
        }
        return null;
    }
    
    public static int indexOf(final int[] array, final int n) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }
    
    public static boolean isAppInstalled(final Context context, final String s) {
        try {
            context.getPackageManager().getPackageInfo(s, 0);
            return true;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    public static boolean isProbablyLArabic(final String s) {
        int codePoint;
        for (int i = 0; i < s.length(); i += Character.charCount(codePoint)) {
            codePoint = s.codePointAt(i);
            if (codePoint >= 1536 && codePoint <= 1760) {
                return true;
            }
        }
        return false;
    }
}
