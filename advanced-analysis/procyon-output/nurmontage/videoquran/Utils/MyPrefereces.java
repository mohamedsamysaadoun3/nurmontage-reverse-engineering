// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.content.SharedPreferences$Editor;
import android.content.Context;

public class MyPrefereces
{
    private static final String FIRST_RUN_KEY = "firstRun";
    private static final String IS_VU_ABOUT = "is_about";
    private static final String IS_VU_COPYRIGHT = "is_vu_copyright";
    private static final String PREFS_NAME = "MyPrefs";
    private static final String SCROLL_X = "scroll_view_x";
    
    public static int getLastIconIndex(final Context context) {
        return context.getSharedPreferences("MyPrefs", 0).getInt("icon_quran", 0);
    }
    
    public static int getScrollX(final Context context) {
        return context.getSharedPreferences("MyPrefs", 0).getInt("scroll_view_x", 0);
    }
    
    public static boolean isCopyRight(final Context context) {
        return context.getSharedPreferences("MyPrefs", 0).getBoolean("is_vu_copyright", false);
    }
    
    public static boolean isFirstRun(final Context context) {
        return context.getSharedPreferences("MyPrefs", 0).getBoolean("firstRun", true);
    }
    
    public static boolean isIncludeBismilah(final Context context) {
        return context.getSharedPreferences("MyPrefs", 0).getBoolean("IncludeBismilah", false);
    }
    
    public static boolean isShowHint(final Context context) {
        return context.getSharedPreferences("MyPrefs", 0).getBoolean("hint_crop_scale", false);
    }
    
    public static boolean isVueAbout(final Context context) {
        return context.getSharedPreferences("MyPrefs", 0).getBoolean("is_about", false);
    }
    
    public static void putFirstRun(final Context context) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("MyPrefs", 0).edit();
        edit.putBoolean("firstRun", false);
        edit.apply();
    }
    
    public static void putIncludeBismilah(final Context context, final boolean b) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("MyPrefs", 0).edit();
        edit.putBoolean("IncludeBismilah", b);
        edit.apply();
    }
    
    public static void putIndexLastIcon(final Context context, final int n) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("MyPrefs", 0).edit();
        edit.putInt("icon_quran", n);
        edit.apply();
    }
    
    public static void putScrollX(final Context context, final int n) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("MyPrefs", 0).edit();
        edit.putInt("scroll_view_x", n);
        edit.apply();
    }
    
    public static void putShowHint(final Context context) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("MyPrefs", 0).edit();
        edit.putBoolean("hint_crop_scale", true);
        edit.apply();
    }
    
    public static void putVuCopyRight(final Context context) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("MyPrefs", 0).edit();
        edit.putBoolean("is_vu_copyright", true);
        edit.apply();
    }
    
    public static void putVueAbout(final Context context) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("MyPrefs", 0).edit();
        edit.putBoolean("is_about", true);
        edit.apply();
    }
}
