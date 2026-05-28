// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import android.view.View;
import java.util.Map;
import android.content.SharedPreferences;
import android.content.Intent;
import android.view.View$OnClickListener;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.activity.OnBackPressedCallback;

public class ChoiceLangActivity extends Base
{
    private boolean isEnglishSelected;
    private boolean isFromSetting;
    private String lang;
    private final OnBackPressedCallback onBackPressedCallback;
    
    public ChoiceLangActivity() {
        this.lang = "en";
        final boolean isEnglishSelected = true;
        this.isEnglishSelected = isEnglishSelected;
        this.onBackPressedCallback = new ChoiceLangActivity$1(this, isEnglishSelected);
    }
    
    private void initViews() {
        final RelativeLayout relativeLayout = (RelativeLayout)this.findViewById(R$id.layout_english);
        final RelativeLayout relativeLayout2 = (RelativeLayout)this.findViewById(R$id.layout_arabic);
        final ImageView imageView = (ImageView)this.findViewById(R$id.radio_english);
        final ImageView imageView2 = (ImageView)this.findViewById(R$id.radio_arabic);
        final Button button = (Button)this.findViewById(R$id.btn_confirm);
        button.setText((CharSequence)this.getResources().getString(R$string.confirm));
        final TextView textView = (TextView)this.findViewById(R$id.tv_cancel);
        textView.setText((CharSequence)this.getResources().getString(R$string.cancel));
        ((TextView)this.findViewById(R$id.tv_tittle)).setText((CharSequence)this.getResources().getString(R$string.select_language));
        ((TextView)this.findViewById(R$id.tv_subTittle)).setText((CharSequence)this.getResources().getString(R$string.choose_your_preferred_language));
        if ("ar".equals(LocaleHelper.getLanguage((Context)this))) {
            relativeLayout.setBackgroundResource(R$drawable.bg_item_unselected);
            relativeLayout2.setBackgroundResource(R$drawable.bg_item_selected);
            imageView2.setBackgroundResource(R$drawable.radio_selected);
            imageView.setBackgroundResource(R$drawable.radio_unselected);
        }
        relativeLayout.setOnClickListener((View$OnClickListener)new ChoiceLangActivity$$ExternalSyntheticLambda0(this, imageView, imageView2, relativeLayout, relativeLayout2));
        relativeLayout2.setOnClickListener((View$OnClickListener)new ChoiceLangActivity$$ExternalSyntheticLambda1(this, imageView, imageView2, relativeLayout2, relativeLayout));
        button.setOnClickListener((View$OnClickListener)new ChoiceLangActivity$$ExternalSyntheticLambda2(this));
        textView.setOnClickListener((View$OnClickListener)new ChoiceLangActivity$$ExternalSyntheticLambda3(this));
    }
    
    private void toStarWork() {
        final SharedPreferences sharedPreferences = this.getSharedPreferences("Template", 0);
        Intent intent;
        if (this.isFromSetting) {
            intent = new Intent((Context)this, (Class)SeettingActivity.class);
        }
        else {
            final Map all = sharedPreferences.getAll();
            if (all != null && !all.isEmpty()) {
                intent = new Intent((Context)this, (Class)WorkUserActivity.class);
            }
            else {
                intent = new Intent((Context)this, (Class)EngineActivity.class);
            }
        }
        intent.setFlags(268468224);
        this.startActivity(intent);
        this.finish();
    }
    
    protected void attachBaseContext(Context onAttach) {
        onAttach = LocaleHelper.onAttach(onAttach);
        super.attachBaseContext(onAttach);
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_choice_lang);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        final int n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        if (this.getIntent() != null) {
            this.isFromSetting = this.getIntent().getBooleanExtra("from_setting", false);
        }
        this.initViews();
    }
    
    public void start() {
        if (LocaleHelper.getLanguage((Context)this).equals(this.lang)) {
            this.startActivity(new Intent((Context)this, (Class)SeettingActivity.class));
            this.overridePendingTransition(0, 0);
            this.finish();
            return;
        }
        LocaleHelper.persist(this.getApplicationContext(), this.lang);
        LocaleHelper.onAttach((Context)this);
        this.recreate();
        final Intent intent = new Intent((Context)this, (Class)FullscreenActivity.class);
        intent.putExtra("from_setting", true);
        intent.setFlags(268468224);
        this.startActivity(intent);
        this.finish();
    }
}
