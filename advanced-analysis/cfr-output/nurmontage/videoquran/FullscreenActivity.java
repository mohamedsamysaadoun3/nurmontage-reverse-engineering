/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.View
 *  android.view.Window
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.FullscreenActivity$1;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.databinding.ActivityFullscreenBinding;
import java.util.Map;

public class FullscreenActivity
extends Base {
    private ActivityFullscreenBinding binding;

    protected void attachBaseContext(Context context) {
        context = LocaleHelper.onAttach(context);
        super.attachBaseContext(context);
    }

    protected void onCreate(Bundle object) {
        SplashScreen.installSplashScreen(this);
        super.onCreate((Bundle)object);
        object = ActivityFullscreenBinding.inflate(this.getLayoutInflater());
        this.binding = object;
        object = ((ActivityFullscreenBinding)object).getRoot();
        this.setContentView((View)object);
        int n = -1;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        object = this.getWindow();
        View view = this.getWindow().getDecorView();
        object = WindowCompat.getInsetsController((Window)object, view);
        boolean bl = true;
        ((WindowInsetsControllerCompat)object).setAppearanceLightStatusBars(bl);
        ((WindowInsetsControllerCompat)object).setAppearanceLightNavigationBars(bl);
        object = this.getSharedPreferences("MTemplate", 0).getAll();
        view = new Handler();
        FullscreenActivity$1 fullscreenActivity$1 = new FullscreenActivity$1(this, (Map)object);
        view.postDelayed((Runnable)fullscreenActivity$1, 1200L);
    }
}
