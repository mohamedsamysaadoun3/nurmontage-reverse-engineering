// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View;
import android.os.Build$VERSION;
import androidx.core.view.WindowCompat;
import android.view.Window;
import android.view.WindowInsets$Type;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.appcompat.app.AppCompatActivity;

public class Base extends AppCompatActivity
{
    private void hideSystemBarsApi30(int systemBars) {
        final Window window = this.getWindow();
        window.setStatusBarColor(systemBars);
        final WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        systemBars = WindowInsets$Type.systemBars();
        windowInsetsControllerCompat.hide(systemBars);
        windowInsetsControllerCompat.setSystemBarsBehavior(2);
    }
    
    private void hideSystemBarsBelowApi30(final int statusBarColor) {
        final Window window = this.getWindow();
        window.addFlags(-1 << -1);
        window.clearFlags(67108864);
        window.setStatusBarColor(statusBarColor);
        window.getDecorView().setSystemUiVisibility(5894);
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().hide();
        }
        window.addFlags(1024);
    }
    
    public void hideSystemBars() {
        WindowCompat.setDecorFitsSystemWindows(this.getWindow(), false);
        final int sdk_INT = Build$VERSION.SDK_INT;
        final int n = 30;
        final int n2 = -1;
        if (sdk_INT >= n) {
            this.hideSystemBarsApi30(n2);
        }
        else {
            this.hideSystemBarsBelowApi30(n2);
        }
    }
    
    public void setLightStatusBar(final boolean b) {
        final View decorView = this.getWindow().getDecorView();
        final int systemUiVisibility = decorView.getSystemUiVisibility();
        int systemUiVisibility2;
        if (b) {
            systemUiVisibility2 = (systemUiVisibility | 0x2000);
        }
        else {
            systemUiVisibility2 = (systemUiVisibility & 0xFFFFDFFF);
        }
        decorView.setSystemUiVisibility(systemUiVisibility2);
    }
    
    public void setNavigationBarColor(final int navigationBarColor) {
        final Window window = this.getWindow();
        window.clearFlags(67108864);
        window.addFlags(-1 << -1);
        window.setNavigationBarColor(navigationBarColor);
    }
    
    public void setStatusBarColor() {
        final Window window = this.getWindow();
        window.clearFlags(67108864);
        window.addFlags(-1 << -1);
        window.setStatusBarColor(-14540254);
    }
    
    public void setStatusBarColor(final int statusBarColor) {
        final Window window = this.getWindow();
        window.clearFlags(67108864);
        window.addFlags(-1 << -1);
        window.setStatusBarColor(statusBarColor);
    }
    
    public void wakeLockAquire() {
        try {
            this.getWindow().addFlags(128);
        }
        catch (final Exception ex) {}
    }
}
