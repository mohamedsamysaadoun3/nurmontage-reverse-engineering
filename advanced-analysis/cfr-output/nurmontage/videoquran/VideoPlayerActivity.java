/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  android.widget.ImageButton
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayer$Builder;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.ui.PlayerView;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.VideoPlayerActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.VideoPlayerActivity$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.VideoPlayerActivity$1;
import hazem.nurmontage.videoquran.VideoPlayerActivity$2;
import hazem.nurmontage.videoquran.VideoPlayerActivity$3;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class VideoPlayerActivity
extends Base {
    private ImageButton btnPlay;
    private final OnBackPressedCallback onBackPressedCallback;
    private ExoPlayer player;
    private PlayerView playerView;
    private Uri videoUri;

    static /* bridge */ /* synthetic */ ImageButton -$$Nest$fgetbtnPlay(VideoPlayerActivity videoPlayerActivity) {
        return videoPlayerActivity.btnPlay;
    }

    static /* bridge */ /* synthetic */ ExoPlayer -$$Nest$fgetplayer(VideoPlayerActivity videoPlayerActivity) {
        return videoPlayerActivity.player;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mreleasePlayer(VideoPlayerActivity videoPlayerActivity) {
        videoPlayerActivity.releasePlayer();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mretryWithFallbackDecoder(VideoPlayerActivity videoPlayerActivity) {
        videoPlayerActivity.retryWithFallbackDecoder();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mreturnAct(VideoPlayerActivity videoPlayerActivity) {
        videoPlayerActivity.returnAct();
    }

    public VideoPlayerActivity() {
        VideoPlayerActivity$1 videoPlayerActivity$1 = new VideoPlayerActivity$1(this, true);
        this.onBackPressedCallback = videoPlayerActivity$1;
    }

    private void hideSystemUI() {
        WindowCompat.setDecorFitsSystemWindows(this.getWindow(), false);
        Object object = this.getWindow();
        View view = this.getWindow().getDecorView();
        object = WindowCompat.getInsetsController((Window)object, view);
        int n = WindowInsetsCompat$Type.systemBars();
        ((WindowInsetsControllerCompat)object).hide(n);
        ((WindowInsetsControllerCompat)object).setSystemBarsBehavior(2);
        int n2 = -16777216;
        this.setStatusBarColor(n2);
        this.setNavigationBarColor(n2);
    }

    private void initializePlayer() {
        Object object = this.player;
        if (object == null && (object = this.videoUri) != null) {
            object = new DefaultRenderersFactory((Context)this);
            int n = 1;
            object = ((DefaultRenderersFactory)object).setEnableDecoderFallback(n != 0);
            Object object2 = new ExoPlayer$Builder((Context)this);
            object = ((ExoPlayer$Builder)object2).setRenderersFactory((RenderersFactory)object);
            long l = 5000L;
            this.player = object = ((ExoPlayer$Builder)object).setSeekBackIncrementMs(l).setSeekForwardIncrementMs(l).build();
            this.playerView.setPlayer((Player)object);
            object = MediaItem.fromUri(this.videoUri);
            object2 = this.player;
            object2.setMediaItem((MediaItem)object);
            this.player.setRepeatMode(n);
            this.player.prepare();
            this.player.play();
            object = this.player;
            VideoPlayerActivity$2 videoPlayerActivity$2 = new VideoPlayerActivity$2(this);
            object.addListener(videoPlayerActivity$2);
        }
    }

    private void releasePlayer() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            this.playerView.setUseController(false);
            this.playerView.setPlayer(null);
            exoPlayer = this.player;
            exoPlayer.release();
            this.player = null;
        }
    }

    private void retryWithFallbackDecoder() {
        Object object = this.videoUri;
        if (object == null) {
            return;
        }
        object = new DefaultRenderersFactory((Context)this);
        object = ((DefaultRenderersFactory)object).setEnableDecoderFallback(true);
        Object object2 = new ExoPlayer$Builder((Context)this);
        object = ((ExoPlayer$Builder)object2).setRenderersFactory((RenderersFactory)object).build();
        this.playerView.setPlayer((Player)object);
        object2 = MediaItem.fromUri(this.videoUri);
        object.setMediaItem((MediaItem)object2);
        object.prepare();
        object.play();
        this.player.release();
        this.player = object;
    }

    private void returnAct() {
        this.finish();
    }

    private void setupButtons() {
        Object object;
        Object object2 = this.playerView;
        int n = R$id.btnBack;
        object2 = (ImageButton)object2.findViewById(n);
        Object object3 = this.playerView;
        int n2 = R$id.btnRotate;
        object3 = (ImageButton)object3.findViewById(n2);
        n2 = R$id.btn_play_pause;
        this.btnPlay = object = (ImageButton)this.findViewById(n2);
        object = new VideoPlayerActivity$$ExternalSyntheticLambda0(this);
        object2.setOnClickListener((View.OnClickListener)object);
        object2 = new VideoPlayerActivity$$ExternalSyntheticLambda1(this);
        object3.setOnClickListener((View.OnClickListener)object2);
        object2 = this.btnPlay;
        object3 = new VideoPlayerActivity$3(this);
        object2.setOnClickListener((View.OnClickListener)object3);
    }

    /* synthetic */ void lambda$setupButtons$0$hazem-nurmontage-videoquran-VideoPlayerActivity(View view) {
        this.releasePlayer();
        this.returnAct();
    }

    /* synthetic */ void lambda$setupButtons$1$hazem-nurmontage-videoquran-VideoPlayerActivity(View view) {
        int n = this.getRequestedOrientation();
        if (n == 0) {
            n = 1;
            this.setRequestedOrientation(n);
        } else {
            n = 0;
            this.setRequestedOrientation(0);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.hideSystemBars();
    }

    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        this.hideSystemUI();
        int n = R$layout.activity_video_player;
        this.setContentView(n);
        object = this.getOnBackPressedDispatcher();
        OnBackPressedCallback onBackPressedCallback = this.onBackPressedCallback;
        ((OnBackPressedDispatcher)object).addCallback(this, onBackPressedCallback);
        object = this.getIntent().getData();
        this.videoUri = object;
        n = R$id.playerView;
        this.playerView = object = (PlayerView)this.findViewById(n);
        this.setupButtons();
    }

    protected void onPause() {
        super.onPause();
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
    }

    protected void onResume() {
        super.onResume();
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.play();
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
