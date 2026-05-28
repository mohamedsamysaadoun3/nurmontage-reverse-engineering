/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 *  androidx.appcompat.app.AppCompatDelegate
 *  androidx.core.os.LocaleListCompat
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.os.LocaleListCompat;
import java.util.Locale;

public class LocaleHelper {
    private static final String SELECTED_LANGUAGE = "Locale.Helper.Selected.Language";

    public static String getLanguage(Context context) {
        return LocaleHelper.getPersistedData(context, "en");
    }

    public static String getPersistedData(Context context, String string2) {
        return context.getSharedPreferences("ActPreference", 0).getString(SELECTED_LANGUAGE, string2);
    }

    public static boolean getUserIsChoice(Context context) {
        return context.getSharedPreferences("ActPreference", 0).getBoolean("userIsChoice", false);
    }

    public static Context onAttach(Context context) {
        String string2 = LocaleHelper.getLanguage(context);
        string2 = LocaleHelper.getPersistedData(context, string2);
        return LocaleHelper.setLocale(context, string2);
    }

    public static void persist(Context context, String string2) {
        context = context.getSharedPreferences("ActPreference", 0).edit();
        context.putString(SELECTED_LANGUAGE, string2);
        context.apply();
    }

    public static Context setLocale(Context context, String string2) {
        LocaleHelper.persist(context, string2);
        return LocaleHelper.updateResources(context, string2);
    }

    public static void setLocale(String string2) {
        AppCompatDelegate.setApplicationLocales((LocaleListCompat)LocaleListCompat.forLanguageTags((String)string2));
    }

    public static Context updateResources(Context context, String localeArray) {
        Locale locale = new Locale((String)localeArray);
        localeArray = new Locale[]{locale};
        AppCompatDelegate.setApplicationLocales((LocaleListCompat)LocaleListCompat.create((Locale[])localeArray));
        localeArray = context.getResources().getConfiguration();
        localeArray.setLocale(locale);
        return context.createConfigurationContext((Configuration)localeArray);
    }

    public static Context updateResourcesLegacy(Context context, String resources) {
        Locale locale = new Locale((String)resources);
        int n = 1;
        resources = new Locale[n];
        resources[0] = locale;
        AppCompatDelegate.setApplicationLocales((LocaleListCompat)LocaleListCompat.create((Locale[])resources));
        resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        context = context.createConfigurationContext(configuration);
        locale = resources.getDisplayMetrics();
        int n2 = Build.VERSION.SDK_INT;
        int n3 = 24;
        if (n2 <= n3) {
            resources.updateConfiguration(configuration, (DisplayMetrics)locale);
        }
        return context;
    }

    public static void userIsChoice(Context context) {
        context = context.getSharedPreferences("ActPreference", 0).edit();
        context.putBoolean("userIsChoice", true);
        context.apply();
    }
}

