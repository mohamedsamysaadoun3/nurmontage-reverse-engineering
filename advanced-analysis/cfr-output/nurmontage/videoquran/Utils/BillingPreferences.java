/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;

public class BillingPreferences {
    private static final String KEY_IS_SUBSCRIBED = "isSubscribed";
    private static final String PREF_NAME = "BillingPrefs";

    public static boolean isSubscribed(Context context) {
        return context.getSharedPreferences(PREF_NAME, 0).getBoolean(KEY_IS_SUBSCRIBED, false);
    }

    public static void saveSubscribeAllItemValueTofalse(Context context) {
        context = context.getSharedPreferences(PREF_NAME, 0).edit();
        context.putBoolean(KEY_IS_SUBSCRIBED, false);
        context.apply();
    }

    public static void saveSubscriptionStatus(Context context, boolean bl) {
        context = context.getSharedPreferences(PREF_NAME, 0).edit();
        context.putBoolean(KEY_IS_SUBSCRIBED, bl);
        context.apply();
    }
}

