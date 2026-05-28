/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.content.SharedPreferences;

public class QuranPreference {
    private static final String KEY_FROM = "from";
    private static final String KEY_NAME_READER = "name_reader_";
    private static final String KEY_SEARCH = "search";
    private static final String KEY_SURAH = "surah";
    private static final String KEY_TO = "to";
    private static final String KEY_TRANSLATION = "translation_select";
    private static final String PREF_NAME = "QuranPrefs_";
    private SharedPreferences sharedPreferences;

    public QuranPreference(Context context) {
        context = context.getSharedPreferences(PREF_NAME, 0);
        this.sharedPreferences = context;
    }

    public static String getLastSearch(Context context) {
        return context.getSharedPreferences(PREF_NAME, 0).getString(KEY_SEARCH, "");
    }

    public static void saveLastSearch(Context context, String string2) {
        context = context.getSharedPreferences(PREF_NAME, 0).edit();
        context.putString(KEY_SEARCH, string2);
        context.apply();
    }

    public static void savePreferencesSearch(Context context, int n, int n2) {
        context = context.getSharedPreferences(PREF_NAME, 0).edit();
        context.putInt(KEY_FROM, n2);
        context.putInt(KEY_TO, n2);
        context.putInt(KEY_SURAH, n);
        context.apply();
    }

    public static void savePreferencesSearch(Context context, int n, int n2, int n3, String string2) {
        context = context.getSharedPreferences(PREF_NAME, 0).edit();
        context.putInt(KEY_FROM, n2);
        context.putInt(KEY_TO, n3);
        context.putInt(KEY_SURAH, n);
        context.putString(KEY_SEARCH, string2);
        context.apply();
    }

    public int getFrom() {
        return this.sharedPreferences.getInt(KEY_FROM, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int getNameReader() {
        String string2;
        SharedPreferences sharedPreferences;
        int n = 0;
        try {
            sharedPreferences = this.sharedPreferences;
            string2 = KEY_NAME_READER;
        }
        catch (Exception exception) {
            return n;
        }
        return sharedPreferences.getInt(string2, 0);
    }

    public int getSurah() {
        return this.sharedPreferences.getInt(KEY_SURAH, 0);
    }

    public int getTo() {
        return this.sharedPreferences.getInt(KEY_TO, 0);
    }

    public int getTranslation() {
        return this.sharedPreferences.getInt(KEY_TRANSLATION, 0);
    }

    public void savePreferences(int n, int n2, int n3, int n4, int n5) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putInt(KEY_FROM, n2);
        editor.putInt(KEY_TO, n3);
        editor.putInt(KEY_SURAH, n);
        editor.putInt(KEY_NAME_READER, n4);
        editor.putInt(KEY_TRANSLATION, n5);
        editor.apply();
    }
}

