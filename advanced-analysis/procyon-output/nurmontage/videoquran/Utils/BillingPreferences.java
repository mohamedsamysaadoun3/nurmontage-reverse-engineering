// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.content.SharedPreferences$Editor;
import android.content.Context;

public class BillingPreferences
{
    private static final String KEY_IS_SUBSCRIBED = "isSubscribed";
    private static final String PREF_NAME = "BillingPrefs";
    
    public static boolean isSubscribed(final Context context) {
        return context.getSharedPreferences("BillingPrefs", 0).getBoolean("isSubscribed", false);
    }
    
    public static void saveSubscribeAllItemValueTofalse(final Context context) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("BillingPrefs", 0).edit();
        edit.putBoolean("isSubscribed", false);
        edit.apply();
    }
    
    public static void saveSubscriptionStatus(final Context context, final boolean b) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("BillingPrefs", 0).edit();
        edit.putBoolean("isSubscribed", b);
        edit.apply();
    }
}
