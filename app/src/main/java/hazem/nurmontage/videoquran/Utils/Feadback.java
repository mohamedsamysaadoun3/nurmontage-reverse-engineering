package hazem.nurmontage.videoquran.Utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import hazem.nurmontage.videoquran.C2014R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public class Feadback {
    public static void reportBug(Context context, String formatString, String textValue2) {
        long durationMs;
        String formatString0;
        try {
            durationMs = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            durationMs = 0;
        }
        String format = new SimpleDateFormat("yyyy_MM_dd_HH:mm:ss", Locale.US).format(new Date(durationMs));
        String timeDifference = getTimeDifference(new Date(durationMs));
        try {
            formatString0 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            formatString0 = "";
        }
        String str4 = textValue2 + "\n\n\n\"cmd = " + formatString + "\n\nFirst Install Time : " + format + "\nTime ago :" + timeDifference + "\nApp Name: " + context.getString(C2014R.string.app_name) + "\nApp Version: " + formatString0 + (BillingPreferences.isSubscribed(context) ? "*" : "") + "\nDevice Platform: Android(" + Build.MODEL + ")\nDevice OS: " + Build.VERSION.RELEASE;
        if (BillingPreferences.isSubscribed(context)) {
            str4 = str4 + ".";
        }
        Intent intent = new Intent("android.intent.action.SEND");
        String[] strArr = {"nurmontage.contact@gmail.com"};
        intent.putExtra("android.intent.extra.EMAIL", strArr);
        intent.putExtra("android.intent.extra.BCC", strArr);
        intent.putExtra("android.intent.extra.SUBJECT", textValue2);
        intent.putExtra("android.intent.extra.TEXT", str4);
        intent.setType("message/rfc822");
        intent.setFlags(268435456);
        if (isGmailAvailable(context)) {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.putExtra("android.intent.extra.EMAIL", strArr);
            intent2.putExtra("android.intent.extra.BCC", strArr);
            intent2.putExtra("android.intent.extra.SUBJECT", textValue2);
            intent2.putExtra("android.intent.extra.TEXT", str4);
            intent2.setType("message/rfc822");
            intent2.setPackage("com.google.android.gm");
            intent2.setFlags(268435456);
            try {
                context.startActivity(intent2);
                return;
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        try {
            context.startActivity(Intent.createChooser(intent, "Send email using"));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private static boolean isGmailAvailable(Context context) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.setPackage("com.google.android.gm");
        return context.getPackageManager().queryIntentActivities(intent, 0).size() > 0;
    }

    protected static int getSecondsDifference(Date date) {
        return ((int) (new Date(System.currentTimeMillis()).getTime() - date.getTime())) / 1000;
    }

    protected static String getReadableTime(int duration) {
        int i2 = duration / 3600;
        int i3 = duration - (i2 * 3600);
        int i4 = i3 / 60;
        int i5 = i3 - (i4 * 60);
        String textValue = i2 > 0 ? i2 + " hour " : "";
        if (i4 > 0) {
            textValue = textValue + i4 + " min ";
        }
        return i5 > 0 ? textValue + i5 + " sec" : str;
    }

    protected static String getTimeDifference(Date date) {
        return getReadableTime(getSecondsDifference(date));
    }
}
