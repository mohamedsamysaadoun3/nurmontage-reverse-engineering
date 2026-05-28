package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
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
        this.sharedPreferences = context.getSharedPreferences(PREF_NAME, 0);
    }

    public static void savePreferencesSearch(Context context, int i, int surahNumber, int surahNumber1, String textValue) {
        SharedPreferences.Editor edit = context.getSharedPreferences(PREF_NAME, 0).edit();
        edit.putInt("from", surahNumber);
        edit.putInt("to", surahNumber1);
        edit.putInt("surah", i);
        edit.putString(KEY_SEARCH, textValue);
        edit.apply();
    }

    public static void saveLastSearch(Context context, String textValue) {
        SharedPreferences.Editor edit = context.getSharedPreferences(PREF_NAME, 0).edit();
        edit.putString(KEY_SEARCH, textValue);
        edit.apply();
    }

    public static String getLastSearch(Context context) {
        return context.getSharedPreferences(PREF_NAME, 0).getString(KEY_SEARCH, "");
    }

    public void savePreferences(int i, int surahNumber, int surahNumber4, int i4, int surahNumber4) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putInt("from", surahNumber);
        edit.putInt("to", surahNumber4);
        edit.putInt("surah", i);
        edit.putInt(KEY_NAME_READER, i4);
        edit.putInt(KEY_TRANSLATION, value5);
        edit.apply();
    }

    public static void savePreferencesSearch(Context context, int i, int resourceId) {
        SharedPreferences.Editor edit = context.getSharedPreferences(PREF_NAME, 0).edit();
        edit.putInt("from", resourceId);
        edit.putInt("to", resourceId);
        edit.putInt("surah", i);
        edit.apply();
    }

    public int getSurah() {
        return this.sharedPreferences.getInt("surah", 0);
    }

    public int getTranslation() {
        return this.sharedPreferences.getInt(KEY_TRANSLATION, 0);
    }

    public int getFrom() {
        return this.sharedPreferences.getInt("from", 0);
    }

    public int getTo() {
        return this.sharedPreferences.getInt("to", 0);
    }

    public int getNameReader() {
        try {
            return this.sharedPreferences.getInt(KEY_NAME_READER, 0);
        } catch (Exception unused) {
            return 0;
        }
    }
}
