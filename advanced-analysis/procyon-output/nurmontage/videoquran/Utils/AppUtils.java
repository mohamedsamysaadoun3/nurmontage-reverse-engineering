// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.Context;

public class AppUtils
{
    public static int getAppVersionCode(final Context context) {
        try {
            final PackageManager packageManager = context.getPackageManager();
            try {
                final PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                try {
                    return packageInfo.versionCode;
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    Log.e("AppUtils", "Error getting app version code", (Throwable)ex);
                    return -1;
                }
            }
            catch (final PackageManager$NameNotFoundException ex2) {}
        }
        catch (final PackageManager$NameNotFoundException ex3) {}
    }
    
    public static String getAppVersionName(final Context context) {
        try {
            final PackageManager packageManager = context.getPackageManager();
            try {
                final PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                try {
                    return packageInfo.versionName;
                }
                catch (final Exception ex) {
                    return "1.6";
                }
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {}
    }
}
