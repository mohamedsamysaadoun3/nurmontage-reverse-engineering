// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.core.view.WindowInsetsControllerCompat;
import hazem.nurmontage.videoquran.views.WaveformView$OnWaveformClickListener;
import android.view.View$OnClickListener;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import android.media.MediaPlayer$OnCompletionListener;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.Utils;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.OnBackPressedCallback;
import android.media.MediaPlayer;
import android.os.Handler;
import hazem.nurmontage.videoquran.views.WaveformView;
import android.widget.ImageButton;

public class AdsTuffahActivity extends Base
{
    private ImageButton btnPlayPause;
    private ImageButton btnPlayPauseAfter;
    private ImageButton currentBtn;
    private int currentResId;
    private WaveformView currentWave;
    private Handler handler;
    private boolean isPlaying;
    private MediaPlayer mediaPlayer;
    private final OnBackPressedCallback onBackPressedCallback;
    private final Runnable updateProgressTask;
    private WaveformView waveformViewAfter;
    private WaveformView waveformViewBefore;
    
    public AdsTuffahActivity() {
        this.handler = new Handler();
        this.isPlaying = false;
        this.currentResId = R$raw.before;
        this.updateProgressTask = new AdsTuffahActivity$1(this);
        this.onBackPressedCallback = new AdsTuffahActivity$2(this, true);
    }
    
    private void inslallTuffah() {
        final Uri parse = Uri.parse("market://details?id=hazem.tuffah.quranaudio");
        final String s = "android.intent.action.VIEW";
        final Intent intent = new Intent(s, parse);
        intent.setPackage("com.android.vending");
        intent.addFlags(1476395008);
        try {
            this.startActivity(intent);
        }
        catch (final ActivityNotFoundException ex) {
            try {
                final Intent intent2 = new Intent(s, Uri.parse("http://play.google.com/store/apps/details?id=hazem.tuffah.quranaudio"));
                try {
                    this.startActivity(intent2);
                }
                catch (final ActivityNotFoundException ex2) {
                    Toast.makeText((Context)this, (CharSequence)"Unable to open app store or browser.", 1).show();
                }
            }
            catch (final ActivityNotFoundException ex3) {}
        }
    }
    
    private void setString() {
        final TextView textView = (TextView)this.findViewById(R$id.tv_before);
        final TextView textView2 = (TextView)this.findViewById(R$id.tv_after);
        final TextView textView3 = (TextView)this.findViewById(R$id.tv_download);
        textView.setText((CharSequence)this.getResources().getString(R$string.before));
        textView2.setText((CharSequence)this.getResources().getString(R$string.after));
        if (!Utils.isAppInstalled((Context)this, "hazem.tuffah.quranaudio")) {
            textView3.setText((CharSequence)this.getResources().getString(R$string.download));
        }
        else {
            textView3.setText((CharSequence)this.getResources().getString(R$string.openTuffah));
        }
        if (LocaleHelper.getLanguage((Context)this).equals("ar")) {
            this.findViewById(R$id.iv_en).setVisibility(8);
            this.findViewById(R$id.iv_ar).setVisibility(0);
        }
    }
    
    private void setupMediaPlayer(final int n) {
        final MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        (this.mediaPlayer = MediaPlayer.create((Context)this, n)).setOnCompletionListener((MediaPlayer$OnCompletionListener)new AdsTuffahActivity$$ExternalSyntheticLambda5(this));
    }
    
    private void switchAudio(final int currentResId, final ImageButton currentBtn, final WaveformView currentWave) {
        this.btnPlayPauseAfter.setImageResource(R$drawable.play_btn);
        this.btnPlayPause.setImageResource(R$drawable.play_btn);
        this.currentWave = currentWave;
        this.currentBtn = currentBtn;
        if (this.currentResId == currentResId) {
            this.togglePlayback();
            return;
        }
        this.currentResId = currentResId;
        this.handler.removeCallbacks(this.updateProgressTask);
        final MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.mediaPlayer.stop();
        }
        this.setupMediaPlayer(currentResId);
        this.isPlaying = false;
        this.currentWave.setProgress(0.0f);
        this.currentBtn.setImageResource(R$drawable.play_btn);
        this.togglePlayback();
    }
    
    private void togglePlayback() {
        final MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            return;
        }
        if (this.isPlaying) {
            mediaPlayer.pause();
            this.currentBtn.setImageResource(R$drawable.play_btn);
            this.handler.removeCallbacks(this.updateProgressTask);
        }
        else {
            mediaPlayer.start();
            this.currentBtn.setImageResource(R$drawable.pause_24px);
            this.handler.post(this.updateProgressTask);
        }
        this.isPlaying ^= true;
    }
    
    protected void attachBaseContext(Context onAttach) {
        onAttach = LocaleHelper.onAttach(onAttach);
        super.attachBaseContext(onAttach);
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_ads_tuufah);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        final int n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new AdsTuffahActivity$$ExternalSyntheticLambda0());
        this.setString();
        this.findViewById(R$id.btn_on_back).setOnClickListener((View$OnClickListener)new AdsTuffahActivity$3(this));
        this.btnPlayPause = (ImageButton)this.findViewById(R$id.btnPlayPause);
        this.waveformViewBefore = (WaveformView)this.findViewById(R$id.waveformView);
        this.waveformViewAfter = (WaveformView)this.findViewById(R$id.waveformView_after);
        this.btnPlayPauseAfter = (ImageButton)this.findViewById(R$id.btnPlayPause_after);
        this.currentWave = this.waveformViewBefore;
        this.currentBtn = this.btnPlayPause;
        this.setupMediaPlayer(this.currentResId);
        this.btnPlayPause.setOnClickListener((View$OnClickListener)new AdsTuffahActivity$$ExternalSyntheticLambda1(this));
        this.btnPlayPauseAfter.setOnClickListener((View$OnClickListener)new AdsTuffahActivity$$ExternalSyntheticLambda2(this));
        this.waveformViewAfter.setOnWaveformClickListener(new AdsTuffahActivity$$ExternalSyntheticLambda3(this));
        this.waveformViewBefore.setOnWaveformClickListener(new AdsTuffahActivity$$ExternalSyntheticLambda4(this));
        this.findViewById(R$id.btn_tuffah).setOnClickListener((View$OnClickListener)new AdsTuffahActivity$4(this));
    }
    
    protected void onDestroy() {
        super.onDestroy();
        this.handler.removeCallbacks(this.updateProgressTask);
        final MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }
    
    protected void onPause() {
        super.onPause();
        if (this.isPlaying) {
            this.togglePlayback();
        }
    }
}
