// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View;
import android.app.Activity;
import androidx.core.splashscreen.SplashScreen;
import android.os.Bundle;
import hazem.nurmontage.videoquran.databinding.ActivityFullscreenBinding;

public class SplashscreenActivity extends Base
{
    private ActivityFullscreenBinding binding;
    
    protected void onCreate(final Bundle bundle) {
        SplashScreen.installSplashScreen((Activity)this);
        super.onCreate(bundle);
        final ActivityFullscreenBinding inflate = ActivityFullscreenBinding.inflate(this.getLayoutInflater());
        this.binding = inflate;
        this.setContentView((View)inflate.getRoot());
    }
}
