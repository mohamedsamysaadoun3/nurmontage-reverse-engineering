/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import hazem.nurmontage.videoquran.model.Template;

public class LocalPersistence {
    public static void deleteTemplate(Context context, String string2) {
        String string3 = "MTemplate";
        context = context.getSharedPreferences(string3, 0);
        context = context.edit();
        try {
            context.remove(string2);
            context.apply();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void duplicateTemplate(Context context, Object object, String string2) {
        String string3 = "MTemplate";
        context = context.getSharedPreferences(string3, 0);
        string3 = new Gson();
        context = context.edit();
        object = string3.toJson(object);
        try {
            context.putString(string2, (String)object);
            context.apply();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static Object readObjectFromFile(Context object, String object2) {
        String string2;
        GsonBuilder gsonBuilder;
        try {
            gsonBuilder = new GsonBuilder();
            gsonBuilder = gsonBuilder.create();
            string2 = "MTemplate";
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
        object = object.getSharedPreferences(string2, 0);
        string2 = "";
        object = object.getString((String)object2, string2);
        object2 = Template.class;
        return gsonBuilder.fromJson((String)object, (Class)object2);
    }

    public static void writeTemplate(Context context, Object object, String string2, String string3) {
        String string4 = "MTemplate";
        context = context.getSharedPreferences(string4, 0);
        string4 = new Gson();
        context = context.edit();
        context.remove(string2);
        object = string4.toJson(object);
        try {
            context.putString(string3, (String)object);
            context.apply();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

