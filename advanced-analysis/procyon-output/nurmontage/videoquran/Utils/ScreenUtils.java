// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.Utils;

import android.graphics.Insets;
import android.view.WindowMetrics;
import android.util.DisplayMetrics;
import android.view.WindowInsets$Type;
import android.os.Build$VERSION;
import android.app.Activity;

public class ScreenUtils
{
    public static int byScreenHeight(final Activity activity, final float n) {
        int heightPixels;
        if (Build$VERSION.SDK_INT >= 30) {
            final WindowMetrics currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
            final Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets$Type.systemBars());
            heightPixels = currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top - insetsIgnoringVisibility.bottom;
        }
        else {
            final DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            heightPixels = displayMetrics.heightPixels;
        }
        return Math.round(heightPixels * n);
    }
    
    public static int getScreenHeight(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 30) {
            final WindowMetrics currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
            final Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets$Type.systemBars());
            return currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top - insetsIgnoringVisibility.bottom;
        }
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }
    
    public static int getScreenWidth(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 30) {
            final WindowMetrics currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
            final Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets$Type.systemBars());
            return currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left - insetsIgnoringVisibility.right;
        }
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }
}
