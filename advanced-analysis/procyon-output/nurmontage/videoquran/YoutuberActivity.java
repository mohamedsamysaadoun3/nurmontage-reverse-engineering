// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.core.view.WindowInsetsControllerCompat;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.view.View$OnClickListener;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwner;
import android.os.Bundle;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import hazem.nurmontage.videoquran.adabter.YoutuberAdabter;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.model.YoutuberModel;
import java.util.ArrayList;
import android.app.Activity;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import androidx.activity.OnBackPressedCallback;
import android.content.res.Resources;
import hazem.nurmontage.videoquran.adabter.YoutuberAdabter$IYoutuber;

public class YoutuberActivity extends Base
{
    private YoutuberAdabter$IYoutuber iYoutuber;
    private Resources mResources;
    private final OnBackPressedCallback onBackPressedCallback;
    
    public YoutuberActivity() {
        this.onBackPressedCallback = new YoutuberActivity$1(this, true);
        this.iYoutuber = new YoutuberActivity$2(this);
    }
    
    private void init() {
        final int screenWidth = ScreenUtils.getScreenWidth((Activity)this);
        final int n = (int)(ScreenUtils.getScreenHeight((Activity)this) * 0.35f);
        final ArrayList list = new ArrayList();
        list.add(new YoutuberModel("AjFCfILaEI8", R$drawable.hilal_ytb));
        list.add(new YoutuberModel("vMgFSEE2hmg", R$drawable.gasadi_ytb));
        list.add(new YoutuberModel("dr1LTEvCEHk", R$drawable.hicham_ytb));
        list.add(new YoutuberModel("cRNG62W8ZLk", R$drawable.pakestain));
        list.add(new YoutuberModel("tkPEq4qz2OQ", R$drawable.sajad_ytb));
        list.add(new YoutuberModel("5IQzSF0wqJE", R$drawable.noor_ytb));
        list.add(new YoutuberModel("E9cVRHeDzeU", R$drawable.ytb_yesser));
        final RecyclerView recyclerView = (RecyclerView)this.findViewById(R$id.rv);
        final YoutuberAdabter adapter = new YoutuberAdabter(this.iYoutuber, list, AppUtils.getAppVersionName((Context)this), screenWidth, n);
        recyclerView.setLayoutManager((RecyclerView$LayoutManager)new LinearLayoutManager((Context)this));
        recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((RecyclerView$Adapter)adapter);
    }
    
    private boolean isGmailAvailable(final Context context) {
        final Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.setPackage("com.google.android.gm");
        return context.getPackageManager().queryIntentActivities(intent, 0).isEmpty() ^ true;
    }
    
    protected void attachBaseContext(Context onAttach) {
        onAttach = LocaleHelper.onAttach(onAttach);
        super.attachBaseContext(onAttach);
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R$layout.activity_youtuber);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        final int n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new YoutuberActivity$$ExternalSyntheticLambda0());
        final Resources resources = this.getResources();
        this.mResources = resources;
        if (resources == null) {
            this.finish();
        }
        this.findViewById(R$id.btn_on_back).setOnClickListener((View$OnClickListener)new YoutuberActivity$3(this));
        this.init();
        this.findViewById(R$id.btn_send_lnk).setOnClickListener((View$OnClickListener)new YoutuberActivity$4(this));
        ((TextCustumFont)this.findViewById(R$id.tv_tutorial)).setText((CharSequence)this.mResources.getString(R$string.my_tutorial));
    }
    
    protected void onDestroy() {
        this.iYoutuber = null;
        super.onDestroy();
    }
    
    public void youtuberLnk(final Context context) {
        final String string = this.mResources.getString(R$string.i_m_youtuber);
        final String[] array = { "hazemourari08@gmail.com" };
        final boolean gmailAvailable = this.isGmailAvailable(context);
        final String s = "message/rfc822";
        final String s2 = "android.intent.extra.TEXT";
        final String s3 = "android.intent.extra.SUBJECT";
        final String s4 = "android.intent.extra.BCC";
        final String s5 = "android.intent.extra.EMAIL";
        final String s6 = "android.intent.action.SEND";
        if (gmailAvailable) {
            final Intent intent = new Intent(s6);
            intent.putExtra(s5, array);
            intent.putExtra(s4, array);
            intent.putExtra(s3, string);
            intent.putExtra(s2, this.mResources.getString(R$string.link));
            intent.setType(s);
            intent.setPackage("com.google.android.gm");
            try {
                this.startActivity(intent);
                return;
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        try {
            final Intent intent2 = new Intent(s6);
            intent2.putExtra(s5, array);
            intent2.putExtra(s4, array);
            intent2.putExtra(s3, string);
            final Resources mResources = this.mResources;
            try {
                intent2.putExtra(s2, mResources.getString(R$string.link));
                final Intent intent3 = intent2;
                try {
                    intent3.setType(s);
                    this.startActivity(Intent.createChooser(intent2, (CharSequence)"Send email using"));
                }
                catch (final Exception ex2) {
                    ex2.printStackTrace();
                }
            }
            catch (final Exception ex3) {}
        }
        catch (final Exception ex4) {}
    }
}
