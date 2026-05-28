/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;

public class MyPrefereces {
    private static final String FIRST_RUN_KEY = "firstRun";
    private static final String IS_VU_ABOUT = "is_about";
    private static final String IS_VU_COPYRIGHT = "is_vu_copyright";
    private static final String PREFS_NAME = "MyPrefs";
    private static final String SCROLL_X = "scroll_view_x";

    public static int getLastIconIndex(Context context) {
        return context.getSharedPreferences(PREFS_NAME, 0).getInt("icon_quran", 0);
    }

    public static int getScrollX(Context context) {
        return context.getSharedPreferences(PREFS_NAME, 0).getInt(SCROLL_X, 0);
    }

    public static boolean isCopyRight(Context context) {
        return context.getSharedPreferences(PREFS_NAME, 0).getBoolean(IS_VU_COPYRIGHT, false);
    }

    public static boolean isFirstRun(Context context) {
        return context.getSharedPreferences(PREFS_NAME, 0).getBoolean(FIRST_RUN_KEY, true);
    }

    public static boolean isIncludeBismilah(Context context) {
        return context.getSharedPreferences(PREFS_NAME, 0).getBoolean("IncludeBismilah", false);
    }

    public static boolean isShowHint(Context context) {
        return context.getSharedPreferences(PREFS_NAME, 0).getBoolean("hint_crop_scale", false);
    }

    public static boolean isVueAbout(Context context) {
        return context.getSharedPreferences(PREFS_NAME, 0).getBoolean(IS_VU_ABOUT, false);
    }

    public static void putFirstRun(Context context) {
        context = context.getSharedPreferences(PREFS_NAME, 0).edit();
        context.putBoolean(FIRST_RUN_KEY, false);
        context.apply();
    }

    public static void putIncludeBismilah(Context context, boolean bl) {
        context = context.getSharedPreferences(PREFS_NAME, 0).edit();
        context.putBoolean("IncludeBismilah", bl);
        context.apply();
    }

    public static void putIndexLastIcon(Context context, int n) {
        context = context.getSharedPreferences(PREFS_NAME, 0).edit();
        context.putInt("icon_quran", n);
        context.apply();
    }

    public static void putScrollX(Context context, int n) {
        context = context.getSharedPreferences(PREFS_NAME, 0).edit();
        context.putInt(SCROLL_X, n);
        context.apply();
    }

    public static void putShowHint(Context context) {
        context = context.getSharedPreferences(PREFS_NAME, 0).edit();
        context.putBoolean("hint_crop_scale", true);
        context.apply();
    }

    public static void putVuCopyRight(Context context) {
        context = context.getSharedPreferences(PREFS_NAME, 0).edit();
        context.putBoolean(IS_VU_COPYRIGHT, true);
        context.apply();
    }

    public static void putVueAbout(Context context) {
        context = context.getSharedPreferences(PREFS_NAME, 0).edit();
        context.putBoolean(IS_VU_ABOUT, true);
        context.apply();
    }
}

