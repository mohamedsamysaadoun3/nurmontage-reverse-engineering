/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.activity.ComponentActivity
 *  androidx.activity.EdgeToEdge
 *  androidx.activity.OnBackPressedCallback
 *  androidx.core.view.WindowCompat
 *  androidx.lifecycle.LifecycleOwner
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwner;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.ChoiceLangActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.ChoiceLangActivity$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.ChoiceLangActivity$$ExternalSyntheticLambda2;
import hazem.nurmontage.videoquran.ChoiceLangActivity$$ExternalSyntheticLambda3;
import hazem.nurmontage.videoquran.ChoiceLangActivity$1;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.FullscreenActivity;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.SeettingActivity;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.WorkUserActivity;

public class ChoiceLangActivity
extends Base {
    private boolean isEnglishSelected;
    private boolean isFromSetting;
    private String lang = "en";
    private final OnBackPressedCallback onBackPressedCallback;

    static /* bridge */ /* synthetic */ void cfr_renamed_400(ChoiceLangActivity choiceLangActivity) {
        choiceLangActivity.toStarWork();
    }

    public ChoiceLangActivity() {
        boolean bl;
        this.isEnglishSelected = bl = true;
        ChoiceLangActivity$1 choiceLangActivity$1 = new ChoiceLangActivity$1(this, bl);
        this.onBackPressedCallback = choiceLangActivity$1;
    }

    private void initViews() {
        Object object;
        int n = R$id.layout_english;
        Object object2 = (RelativeLayout)this.findViewById(n);
        int n2 = R$id.layout_arabic;
        Object object3 = this.findViewById(n2);
        View view = object3;
        view = (RelativeLayout)object3;
        n2 = R$id.radio_english;
        object3 = this.findViewById(n2);
        View view2 = object3;
        view2 = (ImageView)object3;
        n2 = R$id.radio_arabic;
        object3 = this.findViewById(n2);
        View view3 = object3;
        view3 = (ImageView)object3;
        n2 = R$id.btn_confirm;
        object3 = this.findViewById(n2);
        View view4 = object3;
        view4 = (Button)object3;
        object3 = this.getResources();
        int n3 = R$string.confirm;
        object3 = object3.getString(n3);
        view4.setText((CharSequence)object3);
        n2 = R$id.tv_cancel;
        object3 = this.findViewById(n2);
        Object object4 = object3;
        object4 = (TextView)object3;
        object3 = this.getResources();
        n3 = R$string.cancel;
        object3 = object3.getString(n3);
        object4.setText((CharSequence)object3);
        n2 = R$id.tv_tittle;
        object3 = (TextView)this.findViewById(n2);
        Object object5 = this.getResources();
        int n4 = R$string.select_language;
        object5 = object5.getString(n4);
        object3.setText((CharSequence)object5);
        n2 = R$id.tv_subTittle;
        object3 = (TextView)this.findViewById(n2);
        object5 = this.getResources();
        n4 = R$string.choose_your_preferred_language;
        object5 = object5.getString(n4);
        object3.setText((CharSequence)object5);
        object3 = "ar";
        object5 = LocaleHelper.getLanguage((Context)this);
        n2 = ((String)object3).equals(object5) ? 1 : 0;
        if (n2 != 0) {
            n2 = R$drawable.bg_item_unselected;
            object2.setBackgroundResource(n2);
            n2 = R$drawable.bg_item_selected;
            view.setBackgroundResource(n2);
            n2 = R$drawable.radio_selected;
            view3.setBackgroundResource(n2);
            n2 = R$drawable.radio_unselected;
            view2.setBackgroundResource(n2);
        }
        object3 = object;
        object5 = this;
        object = new ChoiceLangActivity$$ExternalSyntheticLambda0(this, (ImageView)view2, (ImageView)view3, (RelativeLayout)object2, (RelativeLayout)view);
        object2.setOnClickListener((View.OnClickListener)object);
        object3 = object;
        object = new ChoiceLangActivity$$ExternalSyntheticLambda1(this, (ImageView)view2, (ImageView)view3, (RelativeLayout)view, (RelativeLayout)object2);
        view.setOnClickListener((View.OnClickListener)object);
        object2 = new ChoiceLangActivity$$ExternalSyntheticLambda2(this);
        view4.setOnClickListener((View.OnClickListener)object2);
        object2 = new ChoiceLangActivity$$ExternalSyntheticLambda3(this);
        object4.setOnClickListener((View.OnClickListener)object2);
    }

    private void toStarWork() {
        boolean bl;
        Class clazz = null;
        Object object = this.getSharedPreferences("Template", 0);
        boolean bl2 = this.isFromSetting;
        if (bl2) {
            clazz = SeettingActivity.class;
            object = new Intent((Context)this, clazz);
        } else if ((object = object.getAll()) != null && !(bl = object.isEmpty())) {
            clazz = WorkUserActivity.class;
            object = new Intent((Context)this, clazz);
        } else {
            clazz = EngineActivity.class;
            object = new Intent((Context)this, clazz);
        }
        object.setFlags(0x10008000);
        this.startActivity((Intent)object);
        this.finish();
    }

    protected void attachBaseContext(Context context) {
        context = LocaleHelper.onAttach(context);
        super.attachBaseContext(context);
    }

    /* synthetic */ void cfr_renamed_114(ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, View view) {
        this.isEnglishSelected = true;
        int n = R$drawable.radio_selected;
        imageView.setBackgroundResource(n);
        int n2 = R$drawable.radio_unselected;
        imageView2.setBackgroundResource(n2);
        n2 = R$drawable.bg_item_selected;
        relativeLayout.setBackgroundResource(n2);
        n2 = R$drawable.bg_item_unselected;
        relativeLayout2.setBackgroundResource(n2);
    }

    /* synthetic */ void cfr_renamed_509(ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, View view) {
        this.isEnglishSelected = false;
        int n = R$drawable.radio_unselected;
        imageView.setBackgroundResource(n);
        int n2 = R$drawable.radio_selected;
        imageView2.setBackgroundResource(n2);
        n2 = R$drawable.bg_item_selected;
        relativeLayout.setBackgroundResource(n2);
        n2 = R$drawable.bg_item_unselected;
        relativeLayout2.setBackgroundResource(n2);
    }

    /* synthetic */ void cfr_renamed_146(View object) {
        boolean bl = this.isEnglishSelected;
        object = bl ? "en" : "ar";
        this.lang = object;
        this.start();
    }

    /* synthetic */ void cfr_renamed_511(View view) {
        this.toStarWork();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        int n = R$layout.activity_choice_lang;
        this.setContentView(n);
        bundle = this.getOnBackPressedDispatcher();
        OnBackPressedCallback onBackPressedCallback = this.onBackPressedCallback;
        bundle.addCallback((LifecycleOwner)this, onBackPressedCallback);
        n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        bundle = this.getWindow();
        onBackPressedCallback = this.getWindow().getDecorView();
        bundle = WindowCompat.getInsetsController((Window)bundle, (View)onBackPressedCallback);
        onBackPressedCallback = null;
        bundle.setAppearanceLightStatusBars(false);
        bundle.setAppearanceLightNavigationBars(false);
        bundle = this.getIntent();
        if (bundle != null) {
            bundle = this.getIntent();
            String string2 = "from_setting";
            n = bundle.getBooleanExtra(string2, false) ? 1 : 0;
            this.isFromSetting = n;
        }
        this.initViews();
    }

    public void start() {
        String string2;
        String string3 = LocaleHelper.getLanguage((Context)this);
        boolean bl = string3.equals(string2 = this.lang);
        if (bl) {
            string3 = new Intent((Context)this, SeettingActivity.class);
            this.startActivity((Intent)string3);
            this.overridePendingTransition(0, 0);
            this.finish();
            return;
        }
        string3 = this.getApplicationContext();
        string2 = this.lang;
        LocaleHelper.persist((Context)string3, string2);
        LocaleHelper.onAttach((Context)this);
        this.recreate();
        string3 = new Intent((Context)this, FullscreenActivity.class);
        string3.putExtra("from_setting", true);
        string3.setFlags(0x10008000);
        this.startActivity((Intent)string3);
        this.finish();
    }
}

