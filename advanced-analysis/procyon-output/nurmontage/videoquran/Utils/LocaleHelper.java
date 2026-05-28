// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.util.DisplayMetrics;
import android.content.res.Resources;
import android.os.Build$VERSION;
import android.content.res.Configuration;
import java.util.Locale;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.os.LocaleListCompat;
import android.content.SharedPreferences$Editor;
import android.content.Context;

public class LocaleHelper
{
    private static final String SELECTED_LANGUAGE = "Locale.Helper.Selected.Language";
    
    public static String getLanguage(final Context context) {
        return getPersistedData(context, "en");
    }
    
    public static String getPersistedData(final Context context, final String s) {
        return context.getSharedPreferences("ActPreference", 0).getString("Locale.Helper.Selected.Language", s);
    }
    
    public static boolean getUserIsChoice(final Context context) {
        return context.getSharedPreferences("ActPreference", 0).getBoolean("userIsChoice", false);
    }
    
    public static Context onAttach(final Context context) {
        return setLocale(context, getPersistedData(context, getLanguage(context)));
    }
    
    public static void persist(final Context context, final String s) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("ActPreference", 0).edit();
        edit.putString("Locale.Helper.Selected.Language", s);
        edit.apply();
    }
    
    public static Context setLocale(final Context context, final String s) {
        persist(context, s);
        return updateResources(context, s);
    }
    
    public static void setLocale(final String s) {
        AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags(s));
    }
    
    public static Context updateResources(final Context context, final String language) {
        final Locale locale = new Locale(language);
        AppCompatDelegate.setApplicationLocales(LocaleListCompat.create(new Locale[] { locale }));
        final Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration);
    }
    
    public static Context updateResourcesLegacy(Context configurationContext, final String language) {
        final Locale locale = new Locale(language);
        AppCompatDelegate.setApplicationLocales(LocaleListCompat.create(new Locale[] { locale }));
        final Resources resources = configurationContext.getResources();
        final Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        configurationContext = configurationContext.createConfigurationContext(configuration);
        final DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Build$VERSION.SDK_INT <= 24) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
        return configurationContext;
    }
    
    public static void userIsChoice(final Context context) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("ActPreference", 0).edit();
        edit.putBoolean("userIsChoice", true);
        edit.apply();
    }
}
