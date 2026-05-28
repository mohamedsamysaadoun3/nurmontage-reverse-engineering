/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 *  android.view.WindowInsets
 *  android.view.WindowInsets$Type
 */
package hazem.nurmontage.videoquran.Utils;

import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowInsets;

public class ScreenUtils {
    public static int byScreenHeight(Activity activity, float f) {
        int n;
        int n2 = Build.VERSION.SDK_INT;
        int n3 = 30;
        if (n2 >= n3) {
            activity = activity.getWindowManager().getCurrentWindowMetrics();
            WindowInsets windowInsets = activity.getWindowInsets();
            n3 = WindowInsets.Type.systemBars();
            windowInsets = windowInsets.getInsetsIgnoringVisibility(n3);
            activity = activity.getBounds();
            n = activity.height();
            n3 = windowInsets.top;
            n -= n3;
            n2 = windowInsets.bottom;
            n -= n2;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity = activity.getWindowManager().getDefaultDisplay();
            activity.getMetrics(displayMetrics);
            n = displayMetrics.heightPixels;
        }
        return Math.round((float)n * f);
    }

    public static int getScreenHeight(Activity activity) {
        int n = Build.VERSION.SDK_INT;
        int n2 = 30;
        if (n >= n2) {
            activity = activity.getWindowManager().getCurrentWindowMetrics();
            WindowInsets windowInsets = activity.getWindowInsets();
            n2 = WindowInsets.Type.systemBars();
            windowInsets = windowInsets.getInsetsIgnoringVisibility(n2);
            int n3 = activity.getBounds().height();
            n2 = windowInsets.top;
            n = windowInsets.bottom;
            return (n3 -= n2) - n;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int getScreenWidth(Activity activity) {
        int n = Build.VERSION.SDK_INT;
        int n2 = 30;
        if (n >= n2) {
            activity = activity.getWindowManager().getCurrentWindowMetrics();
            WindowInsets windowInsets = activity.getWindowInsets();
            n2 = WindowInsets.Type.systemBars();
            windowInsets = windowInsets.getInsetsIgnoringVisibility(n2);
            int n3 = activity.getBounds().width();
            n2 = windowInsets.left;
            n = windowInsets.right;
            return (n3 -= n2) - n;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }
}

