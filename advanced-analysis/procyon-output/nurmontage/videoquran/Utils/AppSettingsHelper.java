// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.net.Uri;
import android.content.Intent;
import android.content.Context;

public class AppSettingsHelper
{
    public static void openAppSettings(final Context context) {
        final Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), (String)null));
        context.startActivity(intent);
    }
}
