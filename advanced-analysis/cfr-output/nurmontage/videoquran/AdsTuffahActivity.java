/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  android.widget.ImageButton
 *  android.widget.TextView
 *  android.widget.Toast
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

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import hazem.nurmontage.videoquran.AdsTuffahActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.AdsTuffahActivity$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.AdsTuffahActivity$$ExternalSyntheticLambda2;
import hazem.nurmontage.videoquran.AdsTuffahActivity$$ExternalSyntheticLambda3;
import hazem.nurmontage.videoquran.AdsTuffahActivity$$ExternalSyntheticLambda4;
import hazem.nurmontage.videoquran.AdsTuffahActivity$$ExternalSyntheticLambda5;
import hazem.nurmontage.videoquran.AdsTuffahActivity$3;
import hazem.nurmontage.videoquran.AdsTuffahActivity$4;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$raw;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.Utils;
import hazem.nurmontage.videoquran.views.WaveformView;
import hazem.nurmontage.videoquran.views.WaveformView$OnWaveformClickListener;

public class AdsTuffahActivity
extends Base {
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

    static /* bridge */ /* synthetic */ WaveformView cfr_renamed_132(AdsTuffahActivity adsTuffahActivity) {
        return adsTuffahActivity.currentWave;
    }

    static /* bridge */ /* synthetic */ Handler cfr_renamed_133(AdsTuffahActivity adsTuffahActivity) {
        return adsTuffahActivity.handler;
    }

    static /* bridge */ /* synthetic */ MediaPlayer cfr_renamed_134(AdsTuffahActivity adsTuffahActivity) {
        return adsTuffahActivity.mediaPlayer;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_135(AdsTuffahActivity adsTuffahActivity) {
        adsTuffahActivity.inslallTuffah();
    }

    public AdsTuffahActivity() {
        int n;
        Object object;
        this.handler = object = new Handler();
        this.isPlaying = false;
        this.currentResId = n = R$raw.before;
        super(this);
        this.updateProgressTask = object;
        super(this, true);
        this.onBackPressedCallback = object;
    }

    private void inslallTuffah() {
        Object object = Uri.parse((String)"market://details?id=hazem.tuffah.quranaudio");
        String string2 = "android.intent.action.VIEW";
        Intent intent = new Intent(string2, object);
        object = "com.android.vending";
        intent.setPackage((String)object);
        int n = 0x58000000;
        intent.addFlags(n);
        try {
            this.startActivity(intent);
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            object = "http://play.google.com/store/apps/details?id=hazem.tuffah.quranaudio";
            object = Uri.parse((String)object);
            intent = new Intent(string2, object);
            try {
                this.startActivity(intent);
            }
            catch (ActivityNotFoundException activityNotFoundException2) {
                n = 1;
                intent = Toast.makeText((Context)this, (CharSequence)"Unable to open app store or browser.", (int)n);
                intent.show();
            }
        }
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

    private void setString() {
        int n = R$id.tv_before;
        Object object = (TextView)this.findViewById(n);
        int n2 = R$id.tv_after;
        Object object2 = (TextView)this.findViewById(n2);
        int n3 = R$id.tv_download;
        TextView textView = (TextView)this.findViewById(n3);
        Object object3 = this.getResources();
        int n4 = R$string.before;
        object3 = object3.getString(n4);
        object.setText((CharSequence)object3);
        object = this.getResources();
        int n5 = R$string.after;
        object = object.getString(n5);
        object2.setText((CharSequence)object);
        object = "hazem.tuffah.quranaudio";
        n = Utils.isAppInstalled((Context)this, (String)object) ? 1 : 0;
        if (n == 0) {
            object = this.getResources();
            n2 = R$string.download;
            object = object.getString(n2);
            textView.setText((CharSequence)object);
        } else {
            object = this.getResources();
            n2 = R$string.openTuffah;
            object = object.getString(n2);
            textView.setText((CharSequence)object);
        }
        object = LocaleHelper.getLanguage((Context)this);
        object2 = "ar";
        n = ((String)object).equals(object2) ? 1 : 0;
        if (n != 0) {
            n = R$id.iv_en;
            this.findViewById(n).setVisibility(8);
            n = R$id.iv_ar;
            object = this.findViewById(n);
            n2 = 0;
            object2 = null;
            object.setVisibility(0);
        }
    }

    private void setupMediaPlayer(int n) {
        MediaPlayer mediaPlayer;
        Object object = this.mediaPlayer;
        if (object != null) {
            object.release();
        }
        this.mediaPlayer = mediaPlayer = MediaPlayer.create((Context)this, (int)n);
        object = new AdsTuffahActivity$$ExternalSyntheticLambda5(this);
        mediaPlayer.setOnCompletionListener((MediaPlayer.OnCompletionListener)object);
    }

    private void switchAudio(int n, ImageButton imageButton, WaveformView object) {
        ImageButton imageButton2 = this.btnPlayPauseAfter;
        int n2 = R$drawable.play_btn;
        imageButton2.setImageResource(n2);
        imageButton2 = this.btnPlayPause;
        n2 = R$drawable.play_btn;
        imageButton2.setImageResource(n2);
        this.currentWave = object;
        this.currentBtn = imageButton;
        int n3 = this.currentResId;
        if (n3 == n) {
            this.togglePlayback();
            return;
        }
        this.currentResId = n;
        imageButton = this.handler;
        object = this.updateProgressTask;
        imageButton.removeCallbacks((Runnable)object);
        imageButton = this.mediaPlayer;
        if (imageButton != null && (n3 = (int)(imageButton.isPlaying() ? 1 : 0)) != 0) {
            imageButton = this.mediaPlayer;
            imageButton.stop();
        }
        this.setupMediaPlayer(n);
        this.isPlaying = false;
        this.currentWave.setProgress(0.0f);
        ImageButton imageButton3 = this.currentBtn;
        n3 = R$drawable.play_btn;
        imageButton3.setImageResource(n3);
        this.togglePlayback();
    }

    private void togglePlayback() {
        boolean bl;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            return;
        }
        int n = this.isPlaying;
        if (n != 0) {
            mediaPlayer.pause();
            mediaPlayer = this.currentBtn;
            n = R$drawable.play_btn;
            mediaPlayer.setImageResource(n);
            mediaPlayer = this.handler;
            Runnable runnable = this.updateProgressTask;
            mediaPlayer.removeCallbacks(runnable);
        } else {
            mediaPlayer.start();
            mediaPlayer = this.currentBtn;
            n = R$drawable.pause_24px;
            mediaPlayer.setImageResource(n);
            mediaPlayer = this.handler;
            Runnable runnable = this.updateProgressTask;
            mediaPlayer.post(runnable);
        }
        this.isPlaying = bl = this.isPlaying ^ true;
    }

    protected void attachBaseContext(Context context) {
        context = LocaleHelper.onAttach(context);
        super.attachBaseContext(context);
    }

    /* synthetic */ void cfr_renamed_136(View view) {
        int n = R$raw.before;
        ImageButton imageButton = this.btnPlayPause;
        WaveformView waveformView = this.waveformViewBefore;
        this.switchAudio(n, imageButton, waveformView);
    }

    /* synthetic */ void cfr_renamed_137(View view) {
        int n = R$raw.after;
        ImageButton imageButton = this.btnPlayPauseAfter;
        WaveformView waveformView = this.waveformViewAfter;
        this.switchAudio(n, imageButton, waveformView);
    }

    /* synthetic */ void cfr_renamed_138(float f) {
        Object object = this.mediaPlayer;
        if (object != null) {
            float f2 = (float)object.getDuration() * f;
            int n = (int)f2;
            MediaPlayer mediaPlayer = this.mediaPlayer;
            mediaPlayer.seekTo(n);
            object = this.mediaPlayer;
            n = object.isPlaying() ? 1 : 0;
            if (n == 0) {
                object = this.waveformViewAfter;
                ((WaveformView)((Object)object)).setProgress(f);
            }
        }
    }

    /* synthetic */ void cfr_renamed_139(float f) {
        Object object = this.mediaPlayer;
        if (object != null) {
            float f2 = (float)object.getDuration() * f;
            int n = (int)f2;
            MediaPlayer mediaPlayer = this.mediaPlayer;
            mediaPlayer.seekTo(n);
            object = this.mediaPlayer;
            n = object.isPlaying() ? 1 : 0;
            if (n == 0) {
                object = this.waveformViewBefore;
                ((WaveformView)((Object)object)).setProgress(f);
            }
        }
    }

    /* synthetic */ void cfr_renamed_131(MediaPlayer mediaPlayer) {
        this.isPlaying = false;
        mediaPlayer = this.btnPlayPauseAfter;
        int n = R$drawable.play_btn;
        mediaPlayer.setImageResource(n);
        mediaPlayer = this.btnPlayPause;
        n = R$drawable.play_btn;
        mediaPlayer.setImageResource(n);
        this.currentWave.setProgress(0.0f);
        mediaPlayer = this.handler;
        Runnable runnable = this.updateProgressTask;
        mediaPlayer.removeCallbacks(runnable);
    }

    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        EdgeToEdge.enable((ComponentActivity)this);
        int n = R$layout.activity_ads_tuufah;
        this.setContentView(n);
        object = this.getOnBackPressedDispatcher();
        Object object2 = this.onBackPressedCallback;
        object.addCallback((LifecycleOwner)this, object2);
        n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        object = this.getWindow();
        object2 = this.getWindow().getDecorView();
        object = WindowCompat.getInsetsController((Window)object, (View)object2);
        object.setAppearanceLightStatusBars(false);
        object.setAppearanceLightNavigationBars(false);
        n = R$id.main;
        object = this.findViewById(n);
        object2 = new AdsTuffahActivity$$ExternalSyntheticLambda0();
        ViewCompat.setOnApplyWindowInsetsListener((View)object, (OnApplyWindowInsetsListener)object2);
        this.setString();
        n = R$id.btn_on_back;
        object = this.findViewById(n);
        object2 = new AdsTuffahActivity$3(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n = R$id.btnPlayPause;
        object = (ImageButton)this.findViewById(n);
        this.btnPlayPause = object;
        n = R$id.waveformView;
        object = (WaveformView)this.findViewById(n);
        this.waveformViewBefore = object;
        n = R$id.waveformView_after;
        object = (WaveformView)this.findViewById(n);
        this.waveformViewAfter = object;
        n = R$id.btnPlayPause_after;
        object = (ImageButton)this.findViewById(n);
        this.btnPlayPauseAfter = object;
        object = this.waveformViewBefore;
        this.currentWave = object;
        object = this.btnPlayPause;
        this.currentBtn = object;
        n = this.currentResId;
        this.setupMediaPlayer(n);
        object = this.btnPlayPause;
        object2 = new AdsTuffahActivity$$ExternalSyntheticLambda1(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.btnPlayPauseAfter;
        object2 = new AdsTuffahActivity$$ExternalSyntheticLambda2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.waveformViewAfter;
        object2 = new AdsTuffahActivity$$ExternalSyntheticLambda3(this);
        ((WaveformView)((Object)object)).setOnWaveformClickListener((WaveformView$OnWaveformClickListener)object2);
        object = this.waveformViewBefore;
        object2 = new AdsTuffahActivity$$ExternalSyntheticLambda4(this);
        ((WaveformView)((Object)object)).setOnWaveformClickListener((WaveformView$OnWaveformClickListener)object2);
        n = R$id.btn_tuffah;
        object = this.findViewById(n);
        object2 = new AdsTuffahActivity$4(this);
        object.setOnClickListener((View.OnClickListener)object2);
    }

    protected void onDestroy() {
        super.onDestroy();
        Handler handler = this.handler;
        Runnable runnable = this.updateProgressTask;
        handler.removeCallbacks(runnable);
        handler = this.mediaPlayer;
        if (handler != null) {
            handler.release();
            handler = null;
            this.mediaPlayer = null;
        }
    }

    protected void onPause() {
        super.onPause();
        boolean bl = this.isPlaying;
        if (bl) {
            this.togglePlayback();
        }
    }
}

