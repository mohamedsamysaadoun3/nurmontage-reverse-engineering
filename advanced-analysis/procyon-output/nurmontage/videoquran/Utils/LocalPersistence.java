// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import hazem.nurmontage.videoquran.model.Template;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.content.Context;

public class LocalPersistence
{
    public static void deleteTemplate(final Context context, final String s) {
        final String s2 = "MTemplate";
        try {
            final SharedPreferences sharedPreferences = context.getSharedPreferences(s2, 0);
            try {
                final SharedPreferences$Editor edit = sharedPreferences.edit();
                edit.remove(s);
                edit.apply();
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        catch (final Exception ex2) {}
    }
    
    public static void duplicateTemplate(final Context context, final Object o, final String s) {
        final String s2 = "MTemplate";
        try {
            final SharedPreferences sharedPreferences = context.getSharedPreferences(s2, 0);
            try {
                try {
                    final Gson gson = new Gson();
                    final SharedPreferences$Editor edit = sharedPreferences.edit();
                    edit.putString(s, gson.toJson(o));
                    edit.apply();
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {}
    }
    
    public static Object readObjectFromFile(final Context context, final String s) {
        try {
            try {
                return new GsonBuilder().create().fromJson(context.getSharedPreferences("MTemplate", 0).getString(s, ""), (Class)Template.class);
            }
            catch (final Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        catch (final Exception ex2) {}
    }
    
    public static void writeTemplate(final Context context, final Object o, final String s, final String s2) {
        final String s3 = "MTemplate";
        try {
            final SharedPreferences sharedPreferences = context.getSharedPreferences(s3, 0);
            try {
                try {
                    final Gson gson = new Gson();
                    final SharedPreferences$Editor edit = sharedPreferences.edit();
                    edit.remove(s);
                    final Gson gson2 = gson;
                    try {
                        edit.putString(s2, gson2.toJson(o));
                        edit.apply();
                    }
                    catch (final Exception ex) {
                        ex.printStackTrace();
                    }
                }
                catch (final Exception ex2) {}
            }
            catch (final Exception ex3) {}
        }
        catch (final Exception ex4) {}
    }
}
