// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.net.NetworkCapabilities;
import android.net.Network;
import android.net.ConnectivityManager;
import android.widget.Toast;
import android.content.Context;

public class NetworkUtils
{
    public static void checkInternetAndShowToast(final Context context) {
        if (!isNetworkAvailable(context)) {
            Toast.makeText(context, (CharSequence)"No internet connection", 0).show();
        }
    }
    
    public static boolean isNetworkAvailable(final Context context) {
        final ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        boolean b = false;
        if (connectivityManager == null) {
            return false;
        }
        final Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        final NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return false;
        }
        if (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
            b = true;
        }
        return b;
    }
}
