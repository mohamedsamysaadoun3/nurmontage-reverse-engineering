// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.core.view.WindowInsetsControllerCompat;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import android.content.Context;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.views.VideoFrameSelectorView$OnFrameSelectedListener;
import hazem.nurmontage.videoquran.views.VideoFrameSelectorView;
import android.net.Uri;
import androidx.activity.OnBackPressedCallback;
import android.content.res.Resources;
import android.widget.ImageView;

public class ChoiceBgFromVideoActivity extends Base
{
    private ImageView imageView;
    private Resources mResources;
    private final OnBackPressedCallback onBackPressedCallback;
    
    public ChoiceBgFromVideoActivity() {
        this.onBackPressedCallback = new ChoiceBgFromVideoActivity$1(this, true);
    }
    
    private void cancel() {
        this.setResult(0);
        this.finish();
    }
    
    private void init(final Uri videoUri) {
        if (videoUri == null) {
            return;
        }
        this.imageView = (ImageView)this.findViewById(R$id.iv_view);
        final VideoFrameSelectorView videoFrameSelectorView = (VideoFrameSelectorView)this.findViewById(R$id.frameSelectorView);
        videoFrameSelectorView.setVideoUri(videoUri);
        videoFrameSelectorView.setOnFrameSelectedListener(new ChoiceBgFromVideoActivity$3(this));
        this.findViewById(R$id.btn_done).setOnClickListener((View$OnClickListener)new ChoiceBgFromVideoActivity$4(this, videoFrameSelectorView));
    }
    
    protected void attachBaseContext(Context onAttach) {
        onAttach = LocaleHelper.onAttach(onAttach);
        super.attachBaseContext(onAttach);
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_choice_bg_from_video);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        final int n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new ChoiceBgFromVideoActivity$$ExternalSyntheticLambda0());
        final Resources resources = this.getResources();
        this.mResources = resources;
        if (resources != null) {
            ((TextCustumFont)this.findViewById(R$id.tv_tittle_fragment)).setText((CharSequence)this.mResources.getString(R$string.choice_bg));
        }
        this.findViewById(R$id.btn_cancel).setOnClickListener((View$OnClickListener)new ChoiceBgFromVideoActivity$2(this));
        if (this.getIntent() != null) {
            this.init(this.getIntent().getData());
        }
    }
}
