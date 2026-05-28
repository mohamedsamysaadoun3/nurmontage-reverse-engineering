// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import androidx.core.view.WindowInsetsControllerCompat;
import android.view.Window;
import androidx.core.view.WindowCompat;
import hazem.nurmontage.videoquran.fragment.RatingBottomSheetDialog;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.widget.Toast;
import android.net.Uri;
import android.content.Intent;
import android.widget.RelativeLayout;
import androidx.activity.OnBackPressedCallback;
import android.content.res.Resources;
import android.app.Dialog;
import android.widget.ImageView;

public class VideoViewActivity extends Base
{
    private ImageView btnPlayPause;
    private Dialog dialog;
    private String idTemplate;
    private Resources mResources;
    private String mUri;
    private final OnBackPressedCallback onBackPressedCallback;
    private RelativeLayout parentLayout;
    private String reader;
    private String surah;
    private ImageView videoView;
    
    public VideoViewActivity() {
        this.onBackPressedCallback = new VideoViewActivity$1(this, true);
    }
    
    private void cancelDialog() {
        final Dialog dialog = this.dialog;
        if (dialog != null && dialog.isShowing()) {
            this.dialog.dismiss();
        }
        this.dialog = null;
    }
    
    private void help() {
        final String s = "https://chat.whatsapp.com/F0kqOjZS1VuBAvoiOG4XEZ";
        try {
            final Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(s));
            intent.setPackage("com.whatsapp");
            try {
                this.startActivity(intent);
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        catch (final Exception ex2) {}
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
    
    private void openPlayStoreForRating() {
        final String str = "http://play.google.com/store/apps/details?id=";
        final String packageName = this.getPackageName();
        final Uri parse = Uri.parse("market://details?id=" + packageName);
        final String s = "android.intent.action.VIEW";
        final Intent intent = new Intent(s, parse);
        intent.setPackage("com.android.vending");
        intent.addFlags(1476395008);
        try {
            this.startActivity(intent);
        }
        catch (final ActivityNotFoundException ex) {
            try {
                try {
                    final StringBuilder sb = new StringBuilder(str);
                    try {
                        final StringBuilder append = sb.append(packageName);
                        try {
                            final String string = append.toString();
                            try {
                                final Intent intent2 = new Intent(s, Uri.parse(string));
                                try {
                                    this.startActivity(intent2);
                                }
                                catch (final ActivityNotFoundException ex2) {
                                    Toast.makeText((Context)this, (CharSequence)"Unable to open app store or browser.", 1).show();
                                }
                            }
                            catch (final ActivityNotFoundException ex3) {}
                        }
                        catch (final ActivityNotFoundException ex4) {}
                    }
                    catch (final ActivityNotFoundException ex5) {}
                }
                catch (final ActivityNotFoundException ex6) {}
            }
            catch (final ActivityNotFoundException ex7) {}
        }
    }
    
    private void ratingSetup() {
        try {
            if (RatingBottomSheetDialog.shouldShowRatingDialog((Context)this)) {
                if (this.mResources != null) {
                    if (this.trackerSession() < 4) {
                        return;
                    }
                    this.dialogRate();
                }
            }
        }
        catch (final Exception ex) {}
    }
    
    private void setSystemUiAppearance() {
        WindowCompat.setDecorFitsSystemWindows(this.getWindow(), true);
        final Window window = this.getWindow();
        window.clearFlags(1024);
        window.clearFlags(512);
        final int n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
    }
    
    private void toAbout() {
        this.startActivity(new Intent((Context)this, (Class)AboutActivity.class));
        this.overridePendingTransition(0, 0);
    }
    
    private void toPro() {
        this.startActivity(new Intent((Context)this, (Class)ProVersionActivity.class));
        this.overridePendingTransition(0, 0);
    }
    
    private void toStudio() {
        final Intent intent = new Intent((Context)this, (Class)EngineActivity.class);
        intent.putExtra("template", this.idTemplate);
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
        this.finish();
    }
    
    protected void attachBaseContext(Context onAttach) {
        onAttach = LocaleHelper.onAttach(onAttach);
        super.attachBaseContext(onAttach);
    }
    
    public void dialogRate() {
        (this.dialog = new Dialog((Context)this)).setCancelable(false);
        this.dialog.requestWindowFeature(1);
        this.dialog.getWindow().setLayout(-1, -2);
        this.dialog.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(0));
        final View inflate = LayoutInflater.from((Context)this).inflate(R$layout.layout_dialog_rate, (ViewGroup)null);
        this.dialog.setContentView(inflate);
        ((TextCustumFontBold)inflate.findViewById(R$id.tv_tittle)).setText((CharSequence)this.mResources.getString(R$string.how_many_stars));
        final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)inflate.findViewById(R$id.btn_rate);
        buttonCustumFont.setText((CharSequence)this.mResources.getString(R$string.rate_now));
        buttonCustumFont.setOnClickListener((View$OnClickListener)new VideoViewActivity$9(this));
        final ButtonCustumFont buttonCustumFont2 = (ButtonCustumFont)inflate.findViewById(R$id.btn_rate_not_now);
        buttonCustumFont2.setText((CharSequence)this.mResources.getString(R$string.later));
        buttonCustumFont2.setOnClickListener((View$OnClickListener)new VideoViewActivity$10(this));
        this.dialog.show();
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_video_view);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        this.setSystemUiAppearance();
        this.mResources = this.getResources();
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new VideoViewActivity$$ExternalSyntheticLambda0());
        LocalPersistence.deleteTemplate((Context)this, "template_tmp");
        if (this.getIntent() != null) {
            final Uri data = this.getIntent().getData();
            this.idTemplate = this.getIntent().getStringExtra("template");
            this.reader = this.getIntent().getStringExtra("reader");
            this.surah = this.getIntent().getStringExtra("surah");
            this.parentLayout = (RelativeLayout)this.findViewById(R$id.parentLayout);
            if (data != null) {
                this.mUri = data.toString();
                this.btnPlayPause = (ImageView)this.findViewById(R$id.btn_play_pause);
                (this.videoView = (ImageView)this.findViewById(R$id.videoView)).post((Runnable)new VideoViewActivity$2(this));
                this.videoView.setOnClickListener((View$OnClickListener)new VideoViewActivity$3(this, data));
            }
        }
        this.findViewById(R$id.btn_tuffah).setOnClickListener((View$OnClickListener)new VideoViewActivity$4(this));
        this.findViewById(R$id.btn_home).setOnClickListener((View$OnClickListener)new VideoViewActivity$5(this));
        final TextCustumFont textCustumFont = (TextCustumFont)this.findViewById(R$id.tv_share);
        final Resources mResources = this.mResources;
        if (mResources != null) {
            textCustumFont.setText((CharSequence)mResources.getString(R$string.just_share));
        }
        this.findViewById(R$id.btn_share).setOnClickListener((View$OnClickListener)new VideoViewActivity$6(this));
        this.findViewById(R$id.btn_on_back).setOnClickListener((View$OnClickListener)new VideoViewActivity$7(this));
        ((TextCustumFont)this.findViewById(R$id.tv_help)).setText((CharSequence)this.mResources.getString(R$string.help));
        this.findViewById(R$id.btn_help).setOnClickListener((View$OnClickListener)new VideoViewActivity$8(this));
        this.ratingSetup();
    }
    
    protected void onDestroy() {
        super.onDestroy();
    }
    
    protected void onPause() {
        this.cancelDialog();
        super.onPause();
    }
    
    protected void onResume() {
        super.onResume();
        this.setSystemUiAppearance();
    }
    
    public void resetTrackerSession() {
        final SharedPreferences$Editor edit = this.getSharedPreferences("ActPreference", 0).edit();
        edit.putInt("session_count", 0);
        edit.apply();
    }
    
    public int trackerSession() {
        final SharedPreferences sharedPreferences = this.getSharedPreferences("ActPreference", 0);
        final String s = "session_count";
        final int n = sharedPreferences.getInt(s, 0) + 1;
        final SharedPreferences$Editor edit = sharedPreferences.edit();
        edit.putInt(s, n);
        edit.apply();
        return n;
    }
}
