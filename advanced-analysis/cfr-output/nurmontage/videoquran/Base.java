/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.Window
 *  android.view.WindowInsets$Type
 */
package hazem.nurmontage.videoquran;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;

public class Base
extends AppCompatActivity {
    private void hideSystemBarsApi30(int n) {
        Window window = this.getWindow();
        window.setStatusBarColor(n);
        View view = window.getDecorView();
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, view);
        n = WindowInsets.Type.systemBars();
        windowInsetsControllerCompat.hide(n);
        windowInsetsControllerCompat.setSystemBarsBehavior(2);
    }

    private void hideSystemBarsBelowApi30(int n) {
        Window window = this.getWindow();
        window.addFlags(-1 << -1);
        window.clearFlags(0x4000000);
        window.setStatusBarColor(n);
        Object object = window.getDecorView();
        int n2 = 5894;
        object.setSystemUiVisibility(n2);
        object = this.getSupportActionBar();
        if (object != null) {
            object = this.getSupportActionBar();
            ((ActionBar)object).hide();
        }
        window.addFlags(1024);
    }

    public void hideSystemBars() {
        Window window = this.getWindow();
        WindowCompat.setDecorFitsSystemWindows(window, false);
        int n = Build.VERSION.SDK_INT;
        int n2 = 30;
        int n3 = -1;
        if (n >= n2) {
            this.hideSystemBarsApi30(n3);
        } else {
            this.hideSystemBarsBelowApi30(n3);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void setLightStatusBar(boolean bl) {
        void var1_4;
        View view = this.getWindow().getDecorView();
        int n = view.getSystemUiVisibility();
        if (bl) {
            int n2 = n | 0x2000;
        } else {
            int n3 = n & 0xFFFFDFFF;
        }
        view.setSystemUiVisibility((int)var1_4);
    }

    public void setNavigationBarColor(int n) {
        Window window = this.getWindow();
        window.clearFlags(0x4000000);
        window.addFlags(-1 << -1);
        window.setNavigationBarColor(n);
    }

    public void setStatusBarColor() {
        Window window = this.getWindow();
        window.clearFlags(0x4000000);
        window.addFlags(-1 << -1);
        window.setStatusBarColor(-14540254);
    }

    public void setStatusBarColor(int n) {
        Window window = this.getWindow();
        window.clearFlags(0x4000000);
        window.addFlags(-1 << -1);
        window.setStatusBarColor(n);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void wakeLockAquire() {
        int n;
        Window window;
        try {
            window = this.getWindow();
            n = 128;
        }
        catch (Exception exception) {
            return;
        }
        window.addFlags(n);
    }
}
