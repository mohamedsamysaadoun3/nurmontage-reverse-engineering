/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 */
package hazem.nurmontage.videoquran;

import android.os.Bundle;
import android.view.View;
import androidx.core.splashscreen.SplashScreen;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.databinding.ActivityFullscreenBinding;

public class SplashscreenActivity
extends Base {
    private ActivityFullscreenBinding binding;

    protected void onCreate(Bundle object) {
        SplashScreen.installSplashScreen(this);
        super.onCreate((Bundle)object);
        object = ActivityFullscreenBinding.inflate(this.getLayoutInflater());
        this.binding = object;
        object = ((ActivityFullscreenBinding)object).getRoot();
        this.setContentView((View)object);
    }
}
