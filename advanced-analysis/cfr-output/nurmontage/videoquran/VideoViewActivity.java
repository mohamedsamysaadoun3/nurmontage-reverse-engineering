/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.res.Resources
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.Toast
 */
package hazem.nurmontage.videoquran;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsControllerCompat;
import hazem.nurmontage.videoquran.AboutActivity;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.ProVersionActivity;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.VideoViewActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.VideoViewActivity$1;
import hazem.nurmontage.videoquran.VideoViewActivity$10;
import hazem.nurmontage.videoquran.VideoViewActivity$2;
import hazem.nurmontage.videoquran.VideoViewActivity$3;
import hazem.nurmontage.videoquran.VideoViewActivity$4;
import hazem.nurmontage.videoquran.VideoViewActivity$5;
import hazem.nurmontage.videoquran.VideoViewActivity$6;
import hazem.nurmontage.videoquran.VideoViewActivity$7;
import hazem.nurmontage.videoquran.VideoViewActivity$8;
import hazem.nurmontage.videoquran.VideoViewActivity$9;
import hazem.nurmontage.videoquran.fragment.RatingBottomSheetDialog;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class VideoViewActivity
extends Base {
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

    static /* bridge */ /* synthetic */ Resources -$$Nest$fgetmResources(VideoViewActivity videoViewActivity) {
        return videoViewActivity.mResources;
    }

    static /* bridge */ /* synthetic */ String -$$Nest$fgetmUri(VideoViewActivity videoViewActivity) {
        return videoViewActivity.mUri;
    }

    static /* bridge */ /* synthetic */ RelativeLayout -$$Nest$fgetparentLayout(VideoViewActivity videoViewActivity) {
        return videoViewActivity.parentLayout;
    }

    static /* bridge */ /* synthetic */ String -$$Nest$fgetreader(VideoViewActivity videoViewActivity) {
        return videoViewActivity.reader;
    }

    static /* bridge */ /* synthetic */ String -$$Nest$fgetsurah(VideoViewActivity videoViewActivity) {
        return videoViewActivity.surah;
    }

    static /* bridge */ /* synthetic */ ImageView -$$Nest$fgetvideoView(VideoViewActivity videoViewActivity) {
        return videoViewActivity.videoView;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mcancelDialog(VideoViewActivity videoViewActivity) {
        videoViewActivity.cancelDialog();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mhelp(VideoViewActivity videoViewActivity) {
        videoViewActivity.help();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$minslallTuffah(VideoViewActivity videoViewActivity) {
        videoViewActivity.inslallTuffah();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mopenPlayStoreForRating(VideoViewActivity videoViewActivity) {
        videoViewActivity.openPlayStoreForRating();
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mtoStudio(VideoViewActivity videoViewActivity) {
        videoViewActivity.toStudio();
    }

    public VideoViewActivity() {
        VideoViewActivity$1 videoViewActivity$1 = new VideoViewActivity$1(this, true);
        this.onBackPressedCallback = videoViewActivity$1;
    }

    private void cancelDialog() {
        boolean bl;
        Dialog dialog = this.dialog;
        if (dialog != null && (bl = dialog.isShowing())) {
            dialog = this.dialog;
            dialog.dismiss();
        }
        this.dialog = null;
    }

    private void help() {
        String string = "https://chat.whatsapp.com/F0kqOjZS1VuBAvoiOG4XEZ";
        String string2 = "android.intent.action.VIEW";
        Intent intent = new Intent(string2);
        string = Uri.parse((String)string);
        intent.setData((Uri)string);
        string = "com.whatsapp";
        intent.setPackage(string);
        try {
            this.startActivity(intent);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void inslallTuffah() {
        Object object = Uri.parse((String)"market://details?id=hazem.tuffah.quranaudio");
        String string = "android.intent.action.VIEW";
        Intent intent = new Intent(string, object);
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
            intent = new Intent(string, object);
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
        int n = WindowInsetsCompat$Type.systemBars();
        Insets insets = windowInsetsCompat.getInsets(n);
        int n2 = insets.left;
        int n3 = insets.top;
        int n4 = insets.right;
        n = insets.bottom;
        view.setPadding(n2, n3, n4, n);
        return windowInsetsCompat;
    }

    private void openPlayStoreForRating() {
        CharSequence charSequence = "http://play.google.com/store/apps/details?id=";
        String string = this.getPackageName();
        CharSequence charSequence2 = new StringBuilder("market://details?id=");
        charSequence2 = Uri.parse((String)((StringBuilder)charSequence2).append(string).toString());
        String string2 = "android.intent.action.VIEW";
        Intent intent = new Intent(string2, (Uri)charSequence2);
        charSequence2 = "com.android.vending";
        intent.setPackage((String)charSequence2);
        int n = 0x58000000;
        intent.addFlags(n);
        try {
            this.startActivity(intent);
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            charSequence2 = new StringBuilder((String)charSequence);
            charSequence = ((StringBuilder)charSequence2).append(string);
            charSequence = ((StringBuilder)charSequence).toString();
            charSequence = Uri.parse((String)charSequence);
            intent = new Intent(string2, (Uri)charSequence);
            try {
                this.startActivity(intent);
            }
            catch (ActivityNotFoundException activityNotFoundException2) {
                int n2 = 1;
                charSequence = Toast.makeText((Context)this, (CharSequence)"Unable to open app store or browser.", (int)n2);
                charSequence.show();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void ratingSetup() {
        try {
            int n;
            int n2 = RatingBottomSheetDialog.shouldShowRatingDialog((Context)this);
            if (n2 == 0) return;
            Resources resources = this.mResources;
            if (resources == null) {
                return;
            }
            n2 = this.trackerSession();
            if (n2 < (n = 4)) {
                return;
            }
            this.dialogRate();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void setSystemUiAppearance() {
        WindowCompat.setDecorFitsSystemWindows(this.getWindow(), true);
        Object object = this.getWindow();
        object.clearFlags(1024);
        object.clearFlags(512);
        int n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        object = this.getWindow();
        View view = this.getWindow().getDecorView();
        object = WindowCompat.getInsetsController((Window)object, view);
        ((WindowInsetsControllerCompat)object).setAppearanceLightStatusBars(false);
        ((WindowInsetsControllerCompat)object).setAppearanceLightNavigationBars(false);
    }

    private void toAbout() {
        Intent intent = new Intent((Context)this, AboutActivity.class);
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
    }

    private void toPro() {
        Intent intent = new Intent((Context)this, ProVersionActivity.class);
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
    }

    private void toStudio() {
        Intent intent = new Intent((Context)this, EngineActivity.class);
        String string = this.idTemplate;
        intent.putExtra("template", string);
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
        this.finish();
    }

    protected void attachBaseContext(Context context) {
        context = LocaleHelper.onAttach(context);
        super.attachBaseContext(context);
    }

    public void dialogRate() {
        Object object;
        this.dialog = object = new Dialog((Context)this);
        object.setCancelable(false);
        this.dialog.requestWindowFeature(1);
        this.dialog.getWindow().setLayout(-1, -2);
        object = this.dialog.getWindow();
        Object object2 = new ColorDrawable(0);
        object.setBackgroundDrawable((Drawable)object2);
        object = LayoutInflater.from((Context)this);
        int n = R$layout.layout_dialog_rate;
        object = object.inflate(n, null);
        this.dialog.setContentView((View)object);
        n = R$id.tv_tittle;
        Object object3 = (TextCustumFontBold)object.findViewById(n);
        object2 = this.mResources;
        int n2 = R$string.how_many_stars;
        object2 = object2.getString(n2);
        object3.setText((CharSequence)object2);
        n = R$id.btn_rate;
        object3 = (ButtonCustumFont)object.findViewById(n);
        object2 = this.mResources;
        n2 = R$string.rate_now;
        object2 = object2.getString(n2);
        object3.setText((CharSequence)object2);
        object2 = new VideoViewActivity$9(this);
        object3.setOnClickListener((View.OnClickListener)object2);
        n = R$id.btn_rate_not_now;
        object = (ButtonCustumFont)object.findViewById(n);
        object3 = this.mResources;
        int n3 = R$string.later;
        object3 = object3.getString(n3);
        object.setText((CharSequence)object3);
        object3 = new VideoViewActivity$10(this);
        object.setOnClickListener((View.OnClickListener)object3);
        this.dialog.show();
    }

    protected void onCreate(Bundle object) {
        int n;
        super.onCreate((Bundle)object);
        EdgeToEdge.enable(this);
        int n2 = R$layout.activity_video_view;
        this.setContentView(n2);
        object = this.getOnBackPressedDispatcher();
        Object object2 = this.onBackPressedCallback;
        ((OnBackPressedDispatcher)object).addCallback(this, (OnBackPressedCallback)object2);
        this.setSystemUiAppearance();
        object = this.getResources();
        this.mResources = object;
        n2 = R$id.main;
        object = this.findViewById(n2);
        object2 = new VideoViewActivity$$ExternalSyntheticLambda0();
        ViewCompat.setOnApplyWindowInsetsListener((View)object, (OnApplyWindowInsetsListener)object2);
        LocalPersistence.deleteTemplate((Context)this, "template_tmp");
        object = this.getIntent();
        if (object != null) {
            object = this.getIntent().getData();
            this.idTemplate = object2 = this.getIntent().getStringExtra("template");
            this.reader = object2 = this.getIntent().getStringExtra("reader");
            object2 = this.getIntent();
            Object object3 = "surah";
            this.surah = object2 = object2.getStringExtra((String)object3);
            int n3 = R$id.parentLayout;
            object2 = (RelativeLayout)this.findViewById(n3);
            this.parentLayout = object2;
            if (object != null) {
                this.mUri = object2 = object.toString();
                n3 = R$id.btn_play_pause;
                object2 = (ImageView)this.findViewById(n3);
                this.btnPlayPause = object2;
                n3 = R$id.videoView;
                object2 = (ImageView)this.findViewById(n3);
                this.videoView = object2;
                object3 = new VideoViewActivity$2(this);
                object2.post((Runnable)object3);
                object2 = this.videoView;
                object3 = new VideoViewActivity$3(this, (Uri)object);
                object2.setOnClickListener((View.OnClickListener)object3);
            }
        }
        n2 = R$id.btn_tuffah;
        object = this.findViewById(n2);
        object2 = new VideoViewActivity$4(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n2 = R$id.btn_home;
        object = this.findViewById(n2);
        object2 = new VideoViewActivity$5(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n2 = R$id.tv_share;
        object = (TextCustumFont)this.findViewById(n2);
        object2 = this.mResources;
        if (object2 != null) {
            n = R$string.just_share;
            object2 = object2.getString(n);
            object.setText((CharSequence)object2);
        }
        n2 = R$id.btn_share;
        object = this.findViewById(n2);
        object2 = new VideoViewActivity$6(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n2 = R$id.btn_on_back;
        object = this.findViewById(n2);
        object2 = new VideoViewActivity$7(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n2 = R$id.tv_help;
        object = (TextCustumFont)this.findViewById(n2);
        object2 = this.mResources;
        n = R$string.help;
        object2 = object2.getString(n);
        object.setText((CharSequence)object2);
        n2 = R$id.btn_help;
        object = this.findViewById(n2);
        object2 = new VideoViewActivity$8(this);
        object.setOnClickListener((View.OnClickListener)object2);
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
        SharedPreferences.Editor editor = this.getSharedPreferences("ActPreference", 0).edit();
        editor.putInt("session_count", 0);
        editor.apply();
    }

    public int trackerSession() {
        SharedPreferences sharedPreferences = this.getSharedPreferences("ActPreference", 0);
        String string2 = "session_count";
        int n = sharedPreferences.getInt(string2, 0) + 1;
        sharedPreferences = sharedPreferences.edit();
        sharedPreferences.putInt(string2, n);
        sharedPreferences.apply();
        return n;
    }
}
