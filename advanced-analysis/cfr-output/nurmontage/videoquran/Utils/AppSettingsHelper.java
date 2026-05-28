/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class AppSettingsHelper {
    public static void openAppSettings(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        String string2 = context.getPackageName();
        string2 = Uri.fromParts((String)"package", (String)string2, null);
        intent.setData((Uri)string2);
        context.startActivity(intent);
    }
}

