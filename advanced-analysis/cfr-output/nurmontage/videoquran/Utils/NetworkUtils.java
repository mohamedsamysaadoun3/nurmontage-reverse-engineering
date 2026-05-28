/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.Network
 *  android.widget.Toast
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.widget.Toast;

public class NetworkUtils {
    public static void checkInternetAndShowToast(Context context) {
        boolean bl = NetworkUtils.isNetworkAvailable(context);
        if (!bl) {
            String string2 = "No internet connection";
            context = Toast.makeText((Context)context, (CharSequence)string2, (int)0);
            context.show();
        }
    }

    public static boolean isNetworkAvailable(Context context) {
        boolean bl;
        context = (ConnectivityManager)context.getSystemService("connectivity");
        boolean bl2 = false;
        if (context == null) {
            return false;
        }
        Network network = context.getActiveNetwork();
        if (network == null) {
            return false;
        }
        if ((context = context.getNetworkCapabilities(network)) == null) {
            return false;
        }
        int n = context.hasCapability(12);
        if (n != 0 && (bl = context.hasCapability(n = 16))) {
            bl2 = true;
        }
        return bl2;
    }
}

