/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  android.widget.ImageView
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
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
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
import hazem.nurmontage.videoquran.ChoiceBgFromVideoActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.ChoiceBgFromVideoActivity$1;
import hazem.nurmontage.videoquran.ChoiceBgFromVideoActivity$2;
import hazem.nurmontage.videoquran.ChoiceBgFromVideoActivity$3;
import hazem.nurmontage.videoquran.ChoiceBgFromVideoActivity$4;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.VideoFrameSelectorView;
import hazem.nurmontage.videoquran.views.VideoFrameSelectorView$OnFrameSelectedListener;

public class ChoiceBgFromVideoActivity
extends Base {
    private ImageView imageView;
    private Resources mResources;
    private final OnBackPressedCallback onBackPressedCallback;

    static /* bridge */ /* synthetic */ ImageView cfr_renamed_113(ChoiceBgFromVideoActivity choiceBgFromVideoActivity) {
        return choiceBgFromVideoActivity.imageView;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_302(ChoiceBgFromVideoActivity choiceBgFromVideoActivity) {
        choiceBgFromVideoActivity.cancel();
    }

    public ChoiceBgFromVideoActivity() {
        ChoiceBgFromVideoActivity$1 choiceBgFromVideoActivity$1 = new ChoiceBgFromVideoActivity$1(this, true);
        this.onBackPressedCallback = choiceBgFromVideoActivity$1;
    }

    private void cancel() {
        this.setResult(0);
        this.finish();
    }

    private void init(Uri object) {
        if (object == null) {
            return;
        }
        int n = R$id.iv_view;
        Object object2 = (ImageView)this.findViewById(n);
        this.imageView = object2;
        n = R$id.frameSelectorView;
        object2 = (VideoFrameSelectorView)this.findViewById(n);
        ((VideoFrameSelectorView)((Object)object2)).setVideoUri((Uri)object);
        object = new ChoiceBgFromVideoActivity$3(this);
        ((VideoFrameSelectorView)((Object)object2)).setOnFrameSelectedListener((VideoFrameSelectorView$OnFrameSelectedListener)object);
        int n2 = R$id.btn_done;
        object = this.findViewById(n2);
        ChoiceBgFromVideoActivity$4 choiceBgFromVideoActivity$4 = new ChoiceBgFromVideoActivity$4(this, (VideoFrameSelectorView)((Object)object2));
        object.setOnClickListener((View.OnClickListener)choiceBgFromVideoActivity$4);
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

    protected void attachBaseContext(Context context) {
        context = LocaleHelper.onAttach(context);
        super.attachBaseContext(context);
    }

    protected void onCreate(Bundle object) {
        super.onCreate(object);
        EdgeToEdge.enable((ComponentActivity)this);
        int n = R$layout.activity_choice_bg_from_video;
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
        object2 = new ChoiceBgFromVideoActivity$$ExternalSyntheticLambda0();
        ViewCompat.setOnApplyWindowInsetsListener((View)object, (OnApplyWindowInsetsListener)object2);
        object = this.getResources();
        this.mResources = object;
        if (object != null) {
            n = R$id.tv_tittle_fragment;
            object = (TextCustumFont)this.findViewById(n);
            object2 = this.mResources;
            int n2 = R$string.choice_bg;
            object2 = object2.getString(n2);
            object.setText((CharSequence)object2);
        }
        n = R$id.btn_cancel;
        object = this.findViewById(n);
        object2 = new ChoiceBgFromVideoActivity$2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.getIntent();
        if (object != null) {
            object = this.getIntent().getData();
            this.init((Uri)object);
        }
    }
}

