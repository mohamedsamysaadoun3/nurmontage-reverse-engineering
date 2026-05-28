// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.content.pm.PackageInfo;
import android.os.Build$VERSION;
import android.os.Build;
import hazem.nurmontage.videoquran.R$string;
import java.text.SimpleDateFormat;
import java.util.Locale;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.Intent;
import android.content.Context;
import java.util.Date;

public class Feadback
{
    protected static String getReadableTime(int i) {
        final int j = i / 3600;
        i -= j * 3600;
        final int k = i / 60;
        i -= k * 60;
        String s;
        if (j > 0) {
            s = j + " hour ";
        }
        else {
            s = "";
        }
        if (k > 0) {
            s = s + k + " min ";
        }
        if (i > 0) {
            s = s + i + " sec";
        }
        return s;
    }
    
    protected static int getSecondsDifference(final Date date) {
        return (int)(new Date(System.currentTimeMillis()).getTime() - date.getTime()) / 1000;
    }
    
    protected static String getTimeDifference(final Date date) {
        return getReadableTime(getSecondsDifference(date));
    }
    
    private static boolean isGmailAvailable(final Context context) {
        final Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.setPackage("com.google.android.gm");
        final PackageManager packageManager = context.getPackageManager();
        boolean b = false;
        if (packageManager.queryIntentActivities(intent, 0).size() > 0) {
            b = true;
        }
        return b;
    }
    
    public static void reportBug(final Context context, String package1, final String str) {
        String str2 = "";
        long firstInstallTime = 0L;
        try {
            final PackageManager packageManager = context.getPackageManager();
            try {
                final PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                try {
                    firstInstallTime = packageInfo.firstInstallTime;
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    ex.printStackTrace();
                    firstInstallTime = 0L;
                }
            }
            catch (final PackageManager$NameNotFoundException ex2) {}
        }
        catch (final PackageManager$NameNotFoundException ex3) {}
        final String format = new SimpleDateFormat("yyyy_MM_dd_HH:mm:ss", Locale.US).format(new Date(firstInstallTime));
        final String timeDifference = getTimeDifference(new Date(firstInstallTime));
        String versionName = null;
        try {
            final PackageManager packageManager2 = context.getPackageManager();
            try {
                final PackageInfo packageInfo2 = packageManager2.getPackageInfo(context.getPackageName(), 0);
                try {
                    versionName = packageInfo2.versionName;
                }
                catch (final PackageManager$NameNotFoundException ex4) {
                    ex4.printStackTrace();
                    versionName = str2;
                }
            }
            catch (final PackageManager$NameNotFoundException ex5) {}
        }
        catch (final PackageManager$NameNotFoundException ex6) {}
        if (BillingPreferences.isSubscribed(context)) {
            str2 = "*";
        }
        package1 = str + "\n\n\n\"cmd = " + package1 + "\n\nFirst Install Time : " + format + "\nTime ago :" + timeDifference + "\nApp Name: " + context.getString(R$string.app_name) + "\nApp Version: " + versionName + str2 + "\nDevice Platform: Android(" + Build.MODEL + ")\nDevice OS: " + Build$VERSION.RELEASE;
        if (BillingPreferences.isSubscribed(context)) {
            package1 += ".";
        }
        final String s = "android.intent.action.SEND";
        final Intent intent = new Intent(s);
        final String[] array = { "nurmontage.contact@gmail.com" };
        final String s2 = "android.intent.extra.EMAIL";
        intent.putExtra(s2, array);
        final String s3 = "android.intent.extra.BCC";
        intent.putExtra(s3, array);
        final String s4 = "android.intent.extra.SUBJECT";
        intent.putExtra(s4, str);
        final String s5 = "android.intent.extra.TEXT";
        intent.putExtra(s5, package1);
        final String s6 = "message/rfc822";
        intent.setType(s6);
        final int n = 268435456;
        intent.setFlags(n);
        if (isGmailAvailable(context)) {
            final Intent intent2 = new Intent(s);
            intent2.putExtra(s2, array);
            intent2.putExtra(s3, array);
            intent2.putExtra(s4, str);
            intent2.putExtra(s5, package1);
            intent2.setType(s6);
            package1 = "com.google.android.gm";
            intent2.setPackage(package1);
            intent2.setFlags(n);
            try {
                context.startActivity(intent2);
                return;
            }
            catch (final Exception ex7) {
                ex7.printStackTrace();
            }
        }
        package1 = "Send email using";
        final Intent intent3 = intent;
        try {
            context.startActivity(Intent.createChooser(intent3, (CharSequence)package1));
        }
        catch (final Exception ex8) {
            ex8.printStackTrace();
        }
    }
}
