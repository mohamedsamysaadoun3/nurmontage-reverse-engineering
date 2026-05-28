// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.lifecycle.LifecycleOwner;
import android.os.Bundle;
import android.content.res.Configuration;
import android.view.View;
import android.view.View$OnClickListener;
import androidx.media3.common.Player$Listener;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.ExoPlayer$Builder;
import android.content.Context;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowCompat;
import android.net.Uri;
import androidx.media3.ui.PlayerView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.activity.OnBackPressedCallback;
import android.widget.ImageButton;

public class VideoPlayerActivity extends Base
{
    private ImageButton btnPlay;
    private final OnBackPressedCallback onBackPressedCallback;
    private ExoPlayer player;
    private PlayerView playerView;
    private Uri videoUri;
    
    public VideoPlayerActivity() {
        this.onBackPressedCallback = new VideoPlayerActivity$1(this, true);
    }
    
    private void hideSystemUI() {
        WindowCompat.setDecorFitsSystemWindows(this.getWindow(), false);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        insetsController.hide(WindowInsetsCompat$Type.systemBars());
        insetsController.setSystemBarsBehavior(2);
        final int n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
    }
    
    private void initializePlayer() {
        if (this.player == null && this.videoUri != null) {
            final DefaultRenderersFactory defaultRenderersFactory = new DefaultRenderersFactory((Context)this);
            final int n = 1;
            final ExoPlayer$Builder setRenderersFactory = new ExoPlayer$Builder((Context)this).setRenderersFactory((RenderersFactory)defaultRenderersFactory.setEnableDecoderFallback((boolean)(n != 0)));
            final long n2 = 5000L;
            final ExoPlayer build = setRenderersFactory.setSeekBackIncrementMs(n2).setSeekForwardIncrementMs(n2).build();
            this.player = build;
            this.playerView.setPlayer((Player)build);
            this.player.setMediaItem(MediaItem.fromUri(this.videoUri));
            this.player.setRepeatMode(n);
            this.player.prepare();
            this.player.play();
            this.player.addListener((Player$Listener)new VideoPlayerActivity$2(this));
        }
    }
    
    private void releasePlayer() {
        if (this.player != null) {
            this.playerView.setUseController(false);
            this.playerView.setPlayer((Player)null);
            this.player.release();
            this.player = null;
        }
    }
    
    private void retryWithFallbackDecoder() {
        if (this.videoUri == null) {
            return;
        }
        final ExoPlayer build = new ExoPlayer$Builder((Context)this).setRenderersFactory((RenderersFactory)new DefaultRenderersFactory((Context)this).setEnableDecoderFallback(true)).build();
        this.playerView.setPlayer((Player)build);
        build.setMediaItem(MediaItem.fromUri(this.videoUri));
        build.prepare();
        build.play();
        this.player.release();
        this.player = build;
    }
    
    private void returnAct() {
        this.finish();
    }
    
    private void setupButtons() {
        final ImageButton imageButton = (ImageButton)this.playerView.findViewById(R$id.btnBack);
        final ImageButton imageButton2 = (ImageButton)this.playerView.findViewById(R$id.btnRotate);
        this.btnPlay = (ImageButton)this.findViewById(R$id.btn_play_pause);
        imageButton.setOnClickListener((View$OnClickListener)new VideoPlayerActivity$$ExternalSyntheticLambda0(this));
        imageButton2.setOnClickListener((View$OnClickListener)new VideoPlayerActivity$$ExternalSyntheticLambda1(this));
        this.btnPlay.setOnClickListener((View$OnClickListener)new VideoPlayerActivity$3(this));
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.hideSystemBars();
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.hideSystemUI();
        this.setContentView(R$layout.activity_video_player);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        this.videoUri = this.getIntent().getData();
        this.playerView = (PlayerView)this.findViewById(R$id.playerView);
        this.setupButtons();
    }
    
    protected void onPause() {
        super.onPause();
        final ExoPlayer player = this.player;
        if (player != null) {
            player.pause();
        }
    }
    
    protected void onResume() {
        super.onResume();
        final ExoPlayer player = this.player;
        if (player != null) {
            player.play();
        }
    }
    
    protected void onStart() {
        super.onStart();
        this.initializePlayer();
    }
    
    protected void onStop() {
        super.onStop();
        this.releasePlayer();
    }
}
