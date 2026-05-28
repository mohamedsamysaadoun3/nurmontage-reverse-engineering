package hazem.nurmontage.videoquran;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.Utils;
import hazem.nurmontage.videoquran.views.WaveformView;

/* loaded from: classes2.dex */
public class AdsTuffahActivity extends Base {
    private ImageButton btnPlayPause;
    private ImageButton btnPlayPauseAfter;
    private ImageButton currentBtn;
    private WaveformView currentWave;
    private MediaPlayer mediaPlayer;
    private WaveformView waveformViewAfter;
    private WaveformView waveformViewBefore;
    private Handler handler = new Handler();
    private boolean isPlaying = false;
    private int currentResId = C2014R.raw.before;
    private final Runnable updateProgressTask = new Runnable() { // from class: hazem.nurmontage.videoquran.AdsTuffahActivity.1
        @Override // java.lang.Runnable
        public void run() {
            if (AdsTuffahActivity.this.mediaPlayer == null || !AdsTuffahActivity.this.mediaPlayer.isPlaying()) {
                return;
            }
            AdsTuffahActivity.this.currentWave.setProgress(AdsTuffahActivity.this.mediaPlayer.getCurrentPosition() / AdsTuffahActivity.this.mediaPlayer.getDuration());
            AdsTuffahActivity.this.handler.postDelayed(this, 50L);
        }
    };
    private final OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(true) { // from class: hazem.nurmontage.videoquran.AdsTuffahActivity.2
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            AdsTuffahActivity.this.finish();
        }
    };

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(LocaleHelper.onAttach(context));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(C2014R.layout.activity_ads_tuufah);
        getOnBackPressedDispatcher().addCallback(this, this.onBackPressedCallback);
        setStatusBarColor(ViewCompat.MEASURED_STATE_MASK);
        setNavigationBarColor(ViewCompat.MEASURED_STATE_MASK);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(C2014R.id.main), new OnApplyWindowInsetsListener() { // from class: hazem.nurmontage.videoquran.AdsTuffahActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return AdsTuffahActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        setString();
        findViewById(C2014R.id.btn_on_back).setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.AdsTuffahActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AdsTuffahActivity.this.finish();
            }
        });
        this.btnPlayPause = (ImageButton) findViewById(C2014R.id.btnPlayPause);
        this.waveformViewBefore = (WaveformView) findViewById(C2014R.id.waveformView);
        this.waveformViewAfter = (WaveformView) findViewById(C2014R.id.waveformView_after);
        this.btnPlayPauseAfter = (ImageButton) findViewById(C2014R.id.btnPlayPause_after);
        this.currentWave = this.waveformViewBefore;
        this.currentBtn = this.btnPlayPause;
        setupMediaPlayer(this.currentResId);
        this.btnPlayPause.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.AdsTuffahActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdsTuffahActivity.this.m916lambda$onCreate$1$hazemnurmontagevideoquranAdsTuffahActivity(view);
            }
        });
        this.btnPlayPauseAfter.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.AdsTuffahActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdsTuffahActivity.this.m917lambda$onCreate$2$hazemnurmontagevideoquranAdsTuffahActivity(view);
            }
        });
        this.waveformViewAfter.setOnWaveformClickListener(new WaveformView.OnWaveformClickListener() { // from class: hazem.nurmontage.videoquran.AdsTuffahActivity$$ExternalSyntheticLambda3
            @Override // hazem.nurmontage.videoquran.views.WaveformView.OnWaveformClickListener
            public final void onProgressChanged(float floatValue) {
                AdsTuffahActivity.this.m918lambda$onCreate$3$hazemnurmontagevideoquranAdsTuffahActivity(floatValue);
            }
        });
        this.waveformViewBefore.setOnWaveformClickListener(new WaveformView.OnWaveformClickListener() { // from class: hazem.nurmontage.videoquran.AdsTuffahActivity$$ExternalSyntheticLambda4
            @Override // hazem.nurmontage.videoquran.views.WaveformView.OnWaveformClickListener
            public final void onProgressChanged(float floatValue) {
                AdsTuffahActivity.this.m919lambda$onCreate$4$hazemnurmontagevideoquranAdsTuffahActivity(floatValue);
            }
        });
        findViewById(C2014R.id.btn_tuffah).setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.AdsTuffahActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Utils.isAppInstalled(AdsTuffahActivity.this, "hazem.tuffah.quranaudio")) {
                    Intent launchIntentForPackage = AdsTuffahActivity.this.getPackageManager().getLaunchIntentForPackage("hazem.tuffah.quranaudio");
                    if (launchIntentForPackage != null) {
                        AdsTuffahActivity.this.startActivity(launchIntentForPackage);
                        return;
                    }
                    return;
                }
                AdsTuffahActivity.this.inslallTuffah();
            }
        });
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* renamed from: lambda$onCreate$1$hazem-nurmontage-videoquran-AdsTuffahActivity, reason: not valid java name */
    /* synthetic */ void m916lambda$onCreate$1$hazemnurmontagevideoquranAdsTuffahActivity(View view) {
        switchAudio(C2014R.raw.before, this.btnPlayPause, this.waveformViewBefore);
    }

    /* renamed from: lambda$onCreate$2$hazem-nurmontage-videoquran-AdsTuffahActivity, reason: not valid java name */
    /* synthetic */ void m917lambda$onCreate$2$hazemnurmontagevideoquranAdsTuffahActivity(View view) {
        switchAudio(C2014R.raw.after, this.btnPlayPauseAfter, this.waveformViewAfter);
    }

    /* renamed from: lambda$onCreate$3$hazem-nurmontage-videoquran-AdsTuffahActivity, reason: not valid java name */
    /* synthetic */ void m918lambda$onCreate$3$hazemnurmontagevideoquranAdsTuffahActivity(float floatValue) {
        if (this.mediaPlayer != null) {
            this.mediaPlayer.seekTo((int) (r0.getDuration() * floatValue));
            if (this.mediaPlayer.isPlaying()) {
                return;
            }
            this.waveformViewAfter.setProgress(floatValue);
        }
    }

    /* renamed from: lambda$onCreate$4$hazem-nurmontage-videoquran-AdsTuffahActivity, reason: not valid java name */
    /* synthetic */ void m919lambda$onCreate$4$hazemnurmontagevideoquranAdsTuffahActivity(float floatValue) {
        if (this.mediaPlayer != null) {
            this.mediaPlayer.seekTo((int) (r0.getDuration() * floatValue));
            if (this.mediaPlayer.isPlaying()) {
                return;
            }
            this.waveformViewBefore.setProgress(floatValue);
        }
    }

    private void setString() {
        TextView textView = (TextView) findViewById(C2014R.id.tv_before);
        TextView textView2 = (TextView) findViewById(C2014R.id.tv_after);
        TextView textView3 = (TextView) findViewById(C2014R.id.tv_download);
        textView.setText(getResources().getString(C2014R.string.before));
        textView2.setText(getResources().getString(C2014R.string.after));
        if (!Utils.isAppInstalled(this, "hazem.tuffah.quranaudio")) {
            textView3.setText(getResources().getString(C2014R.string.download));
        } else {
            textView3.setText(getResources().getString(C2014R.string.openTuffah));
        }
        if (LocaleHelper.getLanguage(this).equals("ar")) {
            findViewById(C2014R.id.iv_en).setVisibility(8);
            findViewById(C2014R.id.iv_ar).setVisibility(0);
        }
    }

    private void setupMediaPlayer(int value) {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer create = MediaPlayer.create(this, value);
        this.mediaPlayer = create;
        create.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: hazem.nurmontage.videoquran.AdsTuffahActivity$$ExternalSyntheticLambda5
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                AdsTuffahActivity.this.m569xb84b05e9(mediaPlayer2);
            }
        });
    }

    /* renamed from: lambda$setupMediaPlayer$5$hazem-nurmontage-videoquran-AdsTuffahActivity */
    /* synthetic */ void m569xb84b05e9(MediaPlayer mediaPlayer) {
        this.isPlaying = false;
        this.btnPlayPauseAfter.setImageResource(C2014R.drawable.play_btn);
        this.btnPlayPause.setImageResource(C2014R.drawable.play_btn);
        this.currentWave.setProgress(0.0f);
        this.handler.removeCallbacks(this.updateProgressTask);
    }

    private void switchAudio(int value, ImageButton imageButton, WaveformView waveformView) {
        this.btnPlayPauseAfter.setImageResource(C2014R.drawable.play_btn);
        this.btnPlayPause.setImageResource(C2014R.drawable.play_btn);
        this.currentWave = waveformView;
        this.currentBtn = imageButton;
        if (this.currentResId == value) {
            togglePlayback();
            return;
        }
        this.currentResId = value;
        this.handler.removeCallbacks(this.updateProgressTask);
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.mediaPlayer.stop();
        }
        setupMediaPlayer(value);
        this.isPlaying = false;
        this.currentWave.setProgress(0.0f);
        this.currentBtn.setImageResource(C2014R.drawable.play_btn);
        togglePlayback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void inslallTuffah() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=hazem.tuffah.quranaudio"));
        intent.setPackage("com.android.vending");
        intent.addFlags(1476395008);
        try {
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(this, "Unable to open app store or browser.", 1).show();
            }
        } catch (ActivityNotFoundException unused2) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=hazem.tuffah.quranaudio")));
        }
    }

    private void togglePlayback() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            return;
        }
        if (this.isPlaying) {
            mediaPlayer.pause();
            this.currentBtn.setImageResource(C2014R.drawable.play_btn);
            this.handler.removeCallbacks(this.updateProgressTask);
        } else {
            mediaPlayer.start();
            this.currentBtn.setImageResource(C2014R.drawable.pause_24px);
            this.handler.post(this.updateProgressTask);
        }
        this.isPlaying = !this.isPlaying;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.isPlaying) {
            togglePlayback();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.handler.removeCallbacks(this.updateProgressTask);
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }
}
