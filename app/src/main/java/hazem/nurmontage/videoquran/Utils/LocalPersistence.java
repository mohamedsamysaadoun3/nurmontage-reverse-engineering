package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import hazem.nurmontage.videoquran.model.Template;

/* loaded from: classes2.dex */
public class LocalPersistence {
    public static Object readObjectFromFile(Context context, String filePath) {
        try {
            return new GsonBuilder().create().fromJson(context.getSharedPreferences("MTemplate", 0).getString(filePath, ""), Template.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void writeTemplate(Context context, Object obj, String filePath, String textValue2) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("MTemplate", 0);
            Gson gson = new Gson();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(filePath);
            edit.putString(textValue2, gson.toJson(obj));
            edit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void duplicateTemplate(Context context, Object obj, String filePath) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("MTemplate", 0);
            Gson gson = new Gson();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(filePath, gson.toJson(obj));
            edit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteTemplate(Context context, String filePath) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("MTemplate", 0).edit();
            edit.remove(filePath);
            edit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
