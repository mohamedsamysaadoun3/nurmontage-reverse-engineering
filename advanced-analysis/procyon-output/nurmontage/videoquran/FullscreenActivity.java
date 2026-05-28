// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.core.view.WindowInsetsControllerCompat;
import android.os.Handler;
import androidx.core.view.WindowCompat;
import android.view.View;
import android.app.Activity;
import androidx.core.splashscreen.SplashScreen;
import android.os.Bundle;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import android.content.Context;
import hazem.nurmontage.videoquran.databinding.ActivityFullscreenBinding;

public class FullscreenActivity extends Base
{
    private ActivityFullscreenBinding binding;
    
    protected void attachBaseContext(Context onAttach) {
        onAttach = LocaleHelper.onAttach(onAttach);
        super.attachBaseContext(onAttach);
    }
    
    protected void onCreate(final Bundle bundle) {
        SplashScreen.installSplashScreen((Activity)this);
        super.onCreate(bundle);
        final ActivityFullscreenBinding inflate = ActivityFullscreenBinding.inflate(this.getLayoutInflater());
        this.binding = inflate;
        this.setContentView((View)inflate.getRoot());
        final int n = -1;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        final boolean b = true;
        insetsController.setAppearanceLightStatusBars(b);
        insetsController.setAppearanceLightNavigationBars(b);
        new Handler().postDelayed((Runnable)new FullscreenActivity$1(this, this.getSharedPreferences("MTemplate", 0).getAll()), 1200L);
    }
}
