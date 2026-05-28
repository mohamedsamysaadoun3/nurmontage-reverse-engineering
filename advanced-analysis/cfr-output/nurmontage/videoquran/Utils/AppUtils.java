/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Log
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

public class AppUtils {
    public static int getAppVersionCode(Context object) {
        PackageManager packageManager;
        try {
            packageManager = object.getPackageManager();
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            Log.e((String)"AppUtils", (String)"Error getting app version code", (Throwable)nameNotFoundException);
            return -1;
        }
        object = object.getPackageName();
        object = packageManager.getPackageInfo((String)object, 0);
        return object.versionCode;
    }

    public static String getAppVersionName(Context object) {
        PackageManager packageManager;
        try {
            packageManager = object.getPackageManager();
        }
        catch (Exception exception) {
            return "1.6";
        }
        object = object.getPackageName();
        object = packageManager.getPackageInfo((String)object, 0);
        return object.versionName;
    }
}

