/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 *  android.os.Build$VERSION
 */
package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Feadback {
    protected static String getReadableTime(int n) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        int n2 = n / 3600;
        int n3 = n2 * 3600;
        n -= n3;
        n3 = n / 60;
        int n4 = n3 * 60;
        n -= n4;
        if (n2 > 0) {
            charSequence3 = new StringBuilder();
            charSequence2 = charSequence3.append(n2);
            charSequence3 = " hour ";
            charSequence2 = ((StringBuilder)charSequence2).append((String)charSequence3).toString();
        } else {
            charSequence2 = "";
        }
        if (n3 > 0) {
            charSequence3 = new StringBuilder();
            charSequence2 = charSequence3.append((String)charSequence2).append(n3);
            charSequence = " min ";
            charSequence2 = ((StringBuilder)charSequence2).append((String)charSequence).toString();
        }
        if (n > 0) {
            charSequence = new StringBuilder();
            StringBuilder stringBuilder = charSequence.append((String)charSequence2).append(n).append(" sec");
            charSequence2 = stringBuilder.toString();
        }
        return charSequence2;
    }

    protected static int getSecondsDifference(Date date) {
        long l = System.currentTimeMillis();
        Date date2 = new Date(l);
        long l2 = date2.getTime();
        long l3 = date.getTime();
        return (int)(l2 - l3) / 1000;
    }

    protected static String getTimeDifference(Date date) {
        return Feadback.getReadableTime(Feadback.getSecondsDifference(date));
    }

    private static boolean isGmailAvailable(Context object) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.setPackage("com.google.android.gm");
        object = object.getPackageManager();
        boolean bl = false;
        object = object.queryIntentActivities(intent, 0);
        int n = object.size();
        if (n > 0) {
            bl = true;
        }
        return bl;
    }

    public static void reportBug(Context context, String charSequence, String string2) {
        long l;
        CharSequence charSequence2 = "";
        String string3 = null;
        Object object = context.getPackageManager();
        String[] stringArray = context.getPackageName();
        object = object.getPackageInfo((String)stringArray, 0);
        try {
            l = object.firstInstallTime;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            nameNotFoundException.printStackTrace();
            l = 0L;
        }
        Object object2 = Locale.US;
        Object object3 = new SimpleDateFormat("yyyy_MM_dd_HH:mm:ss", (Locale)object2);
        Object object4 = new Date(l);
        object3 = ((DateFormat)object3).format((Date)object4);
        object4 = new Date(l);
        object = Feadback.getTimeDifference((Date)object4);
        stringArray = context.getPackageManager();
        object4 = context.getPackageName();
        stringArray = stringArray.getPackageInfo((String)object4, 0);
        try {
            stringArray = stringArray.versionName;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            nameNotFoundException.printStackTrace();
            stringArray = charSequence2;
        }
        boolean bl = BillingPreferences.isSubscribed(context);
        if (bl) {
            charSequence2 = "*";
        }
        object4 = new StringBuilder();
        object4 = ((StringBuilder)object4).append(string2);
        object2 = "\n\n\n\"cmd = ";
        charSequence = ((StringBuilder)object4).append((String)object2).append((String)charSequence);
        object4 = "\n\nFirst Install Time : ";
        charSequence = ((StringBuilder)charSequence).append((String)object4).append((String)object3);
        object3 = "\nTime ago :";
        charSequence = ((StringBuilder)charSequence).append((String)object3).append((String)object).append("\nApp Name: ");
        int n = R$string.app_name;
        object = context.getString(n);
        charSequence = ((StringBuilder)charSequence).append((String)object);
        object = "\nApp Version: ";
        charSequence = ((StringBuilder)charSequence).append((String)object).append((String)stringArray).append((String)charSequence2).append("\nDevice Platform: Android(");
        charSequence2 = Build.MODEL;
        charSequence = ((StringBuilder)charSequence).append((String)charSequence2).append(")\nDevice OS: ");
        charSequence2 = Build.VERSION.RELEASE;
        charSequence = ((StringBuilder)charSequence).append((String)charSequence2).toString();
        boolean bl2 = BillingPreferences.isSubscribed(context);
        if (bl2) {
            charSequence2 = new StringBuilder();
            charSequence = ((StringBuilder)charSequence2).append((String)charSequence);
            charSequence2 = ".";
            charSequence = ((StringBuilder)charSequence).append((String)charSequence2).toString();
        }
        object = "android.intent.action.SEND";
        charSequence2 = new Intent((String)object);
        int n2 = 1;
        stringArray = new String[n2];
        stringArray[0] = "nurmontage.contact@gmail.com";
        string3 = "android.intent.extra.EMAIL";
        charSequence2.putExtra(string3, stringArray);
        object3 = "android.intent.extra.BCC";
        charSequence2.putExtra((String)object3, stringArray);
        object4 = "android.intent.extra.SUBJECT";
        charSequence2.putExtra((String)object4, string2);
        object2 = "android.intent.extra.TEXT";
        charSequence2.putExtra((String)object2, (String)charSequence);
        String string4 = "message/rfc822";
        charSequence2.setType(string4);
        int n3 = 0x10000000;
        charSequence2.setFlags(n3);
        boolean bl3 = Feadback.isGmailAvailable(context);
        if (bl3) {
            Intent intent = new Intent((String)object);
            intent.putExtra(string3, stringArray);
            intent.putExtra((String)object3, stringArray);
            intent.putExtra((String)object4, string2);
            intent.putExtra((String)object2, (String)charSequence);
            intent.setType(string4);
            charSequence = "com.google.android.gm";
            intent.setPackage((String)charSequence);
            intent.setFlags(n3);
            try {
                context.startActivity(intent);
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        charSequence = "Send email using";
        charSequence = Intent.createChooser((Intent)charSequence2, (CharSequence)charSequence);
        try {
            context.startActivity((Intent)charSequence);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

