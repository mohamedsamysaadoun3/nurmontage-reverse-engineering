// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.content.SharedPreferences$Editor;
import android.content.Context;
import android.content.SharedPreferences;

public class QuranPreference
{
    private static final String KEY_FROM = "from";
    private static final String KEY_NAME_READER = "name_reader_";
    private static final String KEY_SEARCH = "search";
    private static final String KEY_SURAH = "surah";
    private static final String KEY_TO = "to";
    private static final String KEY_TRANSLATION = "translation_select";
    private static final String PREF_NAME = "QuranPrefs_";
    private SharedPreferences sharedPreferences;
    
    public QuranPreference(final Context context) {
        this.sharedPreferences = context.getSharedPreferences("QuranPrefs_", 0);
    }
    
    public static String getLastSearch(final Context context) {
        return context.getSharedPreferences("QuranPrefs_", 0).getString("search", "");
    }
    
    public static void saveLastSearch(final Context context, final String s) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("QuranPrefs_", 0).edit();
        edit.putString("search", s);
        edit.apply();
    }
    
    public static void savePreferencesSearch(final Context context, final int n, final int n2) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("QuranPrefs_", 0).edit();
        edit.putInt("from", n2);
        edit.putInt("to", n2);
        edit.putInt("surah", n);
        edit.apply();
    }
    
    public static void savePreferencesSearch(final Context context, final int n, final int n2, final int n3, final String s) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("QuranPrefs_", 0).edit();
        edit.putInt("from", n2);
        edit.putInt("to", n3);
        edit.putInt("surah", n);
        edit.putString("search", s);
        edit.apply();
    }
    
    public int getFrom() {
        return this.sharedPreferences.getInt("from", 0);
    }
    
    public int getNameReader() {
        int int1 = 0;
        try {
            int1 = this.sharedPreferences.getInt("name_reader_", 0);
            return int1;
        }
        catch (final Exception ex) {
            return int1;
        }
    }
    
    public int getSurah() {
        return this.sharedPreferences.getInt("surah", 0);
    }
    
    public int getTo() {
        return this.sharedPreferences.getInt("to", 0);
    }
    
    public int getTranslation() {
        return this.sharedPreferences.getInt("translation_select", 0);
    }
    
    public void savePreferences(final int n, final int n2, final int n3, final int n4, final int n5) {
        final SharedPreferences$Editor edit = this.sharedPreferences.edit();
        edit.putInt("from", n2);
        edit.putInt("to", n3);
        edit.putInt("surah", n);
        edit.putInt("name_reader_", n4);
        edit.putInt("translation_select", n5);
        edit.apply();
    }
}
