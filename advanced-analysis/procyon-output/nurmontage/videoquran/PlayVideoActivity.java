// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.net.Uri;
import androidx.core.view.WindowInsetsControllerCompat;
import android.view.View$OnClickListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.widget.MediaController$MediaPlayerControl;
import android.content.Context;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.media.MediaPlayer;
import android.widget.VideoView;
import android.widget.RelativeLayout;
import androidx.activity.OnBackPressedCallback;
import android.widget.MediaController;

public class PlayVideoActivity extends Base
{
    private MediaController mediaController;
    private final OnBackPressedCallback onBackPressedCallback;
    private RelativeLayout parentLayout;
    private VideoView videoView;
    
    public PlayVideoActivity() {
        this.onBackPressedCallback = new PlayVideoActivity$1(this, true);
    }
    
    private void adjustVideoViewSize(final MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            return;
        }
        final int videoWidth = mediaPlayer.getVideoWidth();
        final int videoHeight = mediaPlayer.getVideoHeight();
        int width = this.parentLayout.getWidth();
        int height = this.parentLayout.getHeight();
        final float n = videoWidth / (float)videoHeight;
        final float n2 = (float)width;
        final float n3 = (float)height;
        if (n > n2 / n3) {
            height = (int)(n2 / n);
        }
        else {
            width = (int)(n3 * n);
        }
        final RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(width, height);
        layoutParams.addRule(13);
        this.videoView.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    private void pause() {
        final VideoView videoView = this.videoView;
        if (videoView != null && videoView.isPlaying()) {
            this.videoView.pause();
        }
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_play_video);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        WindowCompat.setDecorFitsSystemWindows(this.getWindow(), true);
        final int n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new PlayVideoActivity$$ExternalSyntheticLambda0());
        this.parentLayout = (RelativeLayout)this.findViewById(R$id.parentLayout);
        if (this.getIntent() != null) {
            final Uri data = this.getIntent().getData();
            if (data != null) {
                this.videoView = (VideoView)this.findViewById(R$id.videoView);
                (this.mediaController = new MediaController((Context)this)).setMediaPlayer((MediaController$MediaPlayerControl)this.videoView);
                this.mediaController.setAnchorView((View)this.videoView);
                this.videoView.setMediaController(this.mediaController);
                this.videoView.setVideoURI(data);
                this.videoView.setOnCompletionListener((MediaPlayer$OnCompletionListener)new PlayVideoActivity$2(this));
                this.videoView.setOnPreparedListener((MediaPlayer$OnPreparedListener)new PlayVideoActivity$3(this));
                this.videoView.start();
            }
        }
        this.findViewById(R$id.btn_on_back).setOnClickListener((View$OnClickListener)new PlayVideoActivity$4(this));
    }
    
    protected void onDestroy() {
        final VideoView videoView = this.videoView;
        if (videoView != null) {
            videoView.pause();
            this.videoView = null;
        }
        super.onDestroy();
    }
    
    protected void onPause() {
        this.pause();
        super.onPause();
    }
    
    protected void onResume() {
        super.onResume();
    }
}
