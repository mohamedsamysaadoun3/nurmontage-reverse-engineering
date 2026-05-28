/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.MediaController
 *  android.widget.MediaController$MediaPlayerControl
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.VideoView
 *  androidx.activity.ComponentActivity
 *  androidx.activity.EdgeToEdge
 *  androidx.activity.OnBackPressedCallback
 *  androidx.core.graphics.Insets
 *  androidx.core.view.OnApplyWindowInsetsListener
 *  androidx.core.view.ViewCompat
 *  androidx.core.view.WindowCompat
 *  androidx.core.view.WindowInsetsCompat
 *  androidx.core.view.WindowInsetsCompat$Type
 *  androidx.lifecycle.LifecycleOwner
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.PlayVideoActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.PlayVideoActivity$1;
import hazem.nurmontage.videoquran.PlayVideoActivity$2;
import hazem.nurmontage.videoquran.PlayVideoActivity$3;
import hazem.nurmontage.videoquran.PlayVideoActivity$4;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;

public class PlayVideoActivity
extends Base {
    private MediaController mediaController;
    private final OnBackPressedCallback onBackPressedCallback;
    private RelativeLayout parentLayout;
    private VideoView videoView;

    static /* bridge */ /* synthetic */ MediaController cfr_renamed_369(PlayVideoActivity playVideoActivity) {
        return playVideoActivity.mediaController;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_370(PlayVideoActivity playVideoActivity, MediaPlayer mediaPlayer) {
        playVideoActivity.adjustVideoViewSize(mediaPlayer);
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_371(PlayVideoActivity playVideoActivity) {
        playVideoActivity.pause();
    }

    public PlayVideoActivity() {
        PlayVideoActivity$1 playVideoActivity$1 = new PlayVideoActivity$1(this, true);
        this.onBackPressedCallback = playVideoActivity$1;
    }

    private void adjustVideoViewSize(MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            return;
        }
        int n = mediaPlayer.getVideoWidth();
        int n2 = mediaPlayer.getVideoHeight();
        RelativeLayout relativeLayout = this.parentLayout;
        int n3 = relativeLayout.getWidth();
        RelativeLayout relativeLayout2 = this.parentLayout;
        int n4 = relativeLayout2.getHeight();
        float f = n;
        float f2 = n2;
        float f3 = n4;
        float f4 = (f2 = (float)n3) / f3;
        float f5 = (f /= f2) - f4;
        float f6 = f5 == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
        if (f6 > 0) {
            n4 = (int)(f2 /= f);
        } else {
            n3 = (int)(f3 *= f);
        }
        mediaPlayer = new RelativeLayout.LayoutParams(n3, n4);
        mediaPlayer.addRule(13);
        this.videoView.setLayoutParams((ViewGroup.LayoutParams)mediaPlayer);
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int n = WindowInsetsCompat.Type.systemBars();
        Insets insets = windowInsetsCompat.getInsets(n);
        int n2 = insets.left;
        int n3 = insets.top;
        int n4 = insets.right;
        n = insets.bottom;
        view.setPadding(n2, n3, n4, n);
        return windowInsetsCompat;
    }

    private void pause() {
        boolean bl;
        VideoView videoView = this.videoView;
        if (videoView != null && (bl = videoView.isPlaying())) {
            videoView = this.videoView;
            videoView.pause();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        int n = R$layout.activity_play_video;
        this.setContentView(n);
        bundle = this.getOnBackPressedDispatcher();
        Object object = this.onBackPressedCallback;
        bundle.addCallback((LifecycleOwner)this, object);
        WindowCompat.setDecorFitsSystemWindows((Window)this.getWindow(), (boolean)true);
        n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        bundle = this.getWindow();
        object = this.getWindow().getDecorView();
        bundle = WindowCompat.getInsetsController((Window)bundle, (View)object);
        int n2 = 0;
        bundle.setAppearanceLightStatusBars(false);
        bundle.setAppearanceLightNavigationBars(false);
        n = R$id.main;
        bundle = this.findViewById(n);
        object = new PlayVideoActivity$$ExternalSyntheticLambda0();
        ViewCompat.setOnApplyWindowInsetsListener((View)bundle, (OnApplyWindowInsetsListener)object);
        n = R$id.parentLayout;
        bundle = (RelativeLayout)this.findViewById(n);
        this.parentLayout = bundle;
        bundle = this.getIntent();
        if (bundle != null && (bundle = this.getIntent().getData()) != null) {
            n2 = R$id.videoView;
            object = (VideoView)this.findViewById(n2);
            this.videoView = object;
            object = new MediaController((Context)this);
            this.mediaController = object;
            VideoView videoView = this.videoView;
            object.setMediaPlayer((MediaController.MediaPlayerControl)videoView);
            object = this.mediaController;
            videoView = this.videoView;
            object.setAnchorView((View)videoView);
            object = this.videoView;
            videoView = this.mediaController;
            object.setMediaController((MediaController)videoView);
            this.videoView.setVideoURI((Uri)bundle);
            bundle = this.videoView;
            object = new PlayVideoActivity$2(this);
            bundle.setOnCompletionListener((MediaPlayer.OnCompletionListener)object);
            bundle = this.videoView;
            object = new PlayVideoActivity$3(this);
            bundle.setOnPreparedListener((MediaPlayer.OnPreparedListener)object);
            bundle = this.videoView;
            bundle.start();
        }
        n = R$id.btn_on_back;
        bundle = this.findViewById(n);
        object = new PlayVideoActivity$4(this);
        bundle.setOnClickListener((View.OnClickListener)object);
    }

    protected void onDestroy() {
        VideoView videoView = this.videoView;
        if (videoView != null) {
            videoView.pause();
            videoView = null;
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

