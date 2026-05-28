// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import hazem.nurmontage.videoquran.adabter.AboutAdabters;
import android.app.Activity;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.adabter.AboutAdabters$ModelAbout;
import android.util.Pair;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import java.util.ArrayList;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.view.View$OnClickListener;
import android.net.Uri;
import android.content.Intent;
import androidx.activity.OnBackPressedCallback;
import android.content.res.Resources;

public class AboutActivity extends Base
{
    private Resources mResources;
    private final OnBackPressedCallback onBackPressedCallback;
    
    public AboutActivity() {
        this.onBackPressedCallback = new AboutActivity$1(this, true);
    }
    
    private void help() {
        final String s = "https://chat.whatsapp.com/DDdUegENpg83easzYDba2K?mode=wwt";
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
    
    private void init() {
        this.findViewById(R$id.btn_on_back).setOnClickListener((View$OnClickListener)new AboutActivity$2(this));
        this.findViewById(R$id.btn_help).setOnClickListener((View$OnClickListener)new AboutActivity$3(this));
        ((TextCustumFont)this.findViewById(R$id.tv_help)).setText((CharSequence)this.mResources.getString(R$string.help));
        final ArrayList list = new ArrayList();
        int i;
        if (LocaleHelper.getLanguage((Context)this).equals("ar")) {
            i = 5;
        }
        else {
            i = 8388611;
        }
        final String str = "<font color=#F8B195>";
        final StringBuilder append = new StringBuilder(str).append(this.mResources.getString(R$string.about_free_site));
        final String s = "</font>";
        final Pair pair = new Pair((Object)append.append(s).toString(), (Object)i);
        final int about_site_video = R$drawable.about_site_video;
        final int n = 19;
        list.add(new AboutAdabters$ModelAbout(n, pair, about_site_video));
        final Pair pair2 = new Pair((Object)this.mResources.getString(R$string.about_free_site_desc), (Object)i);
        final int n2 = 14;
        list.add(new AboutAdabters$ModelAbout(n2, pair2));
        final Integer value = i;
        final String s2 = "\n";
        list.add(new AboutAdabters$ModelAbout(n2, new Pair((Object)s2, (Object)value)));
        list.add(new AboutAdabters$ModelAbout(n, new Pair((Object)(str + this.mResources.getString(R$string.about_free_app) + s), (Object)i), R$drawable.about_best_app));
        list.add(new AboutAdabters$ModelAbout(n2, new Pair((Object)s2, (Object)i)));
        list.add(new AboutAdabters$ModelAbout(n, new Pair((Object)(str + this.mResources.getString(R$string.about_dont_subscribe) + s), (Object)i), R$drawable.about_money));
        final String str2 = "<font color='#ffffff'>";
        list.add(new AboutAdabters$ModelAbout(n2, new Pair((Object)(str2 + this.mResources.getString(R$string.about_dont_subscribe_why) + s), (Object)i)));
        list.add(new AboutAdabters$ModelAbout(n2, new Pair((Object)s2, (Object)i)));
        list.add(new AboutAdabters$ModelAbout(n, new Pair((Object)(str + this.mResources.getString(R$string.this_begeing_idea) + s), (Object)i), R$drawable.about_hazem));
        list.add(new AboutAdabters$ModelAbout(n2, new Pair((Object)(str2 + this.mResources.getString(R$string.this_begeing_idea_decp) + s), (Object)i)));
        list.add(new AboutAdabters$ModelAbout(n2, new Pair((Object)s2, (Object)i)));
        list.add(new AboutAdabters$ModelAbout(n, new Pair((Object)(str + this.mResources.getString(R$string.about_help_tittle) + s), (Object)i), R$drawable.about_help));
        list.add(new AboutAdabters$ModelAbout(n2, new Pair((Object)(str2 + this.mResources.getString(R$string.about_help_body) + s), (Object)i)));
        list.add(new AboutAdabters$ModelAbout(n2, new Pair((Object)s2, (Object)i)));
        list.add(new AboutAdabters$ModelAbout(n, new Pair((Object)(str + this.mResources.getString(R$string.nurmontage_means) + s), (Object)i), R$drawable.nurmontage_means));
        list.add(new AboutAdabters$ModelAbout(n2, new Pair((Object)(str2 + this.mResources.getString(R$string.nurmontage_means_descrp) + s), (Object)i)));
        list.add(new AboutAdabters$ModelAbout(n2, new Pair((Object)s2, (Object)i)));
        list.add(new AboutAdabters$ModelAbout(n, new Pair((Object)(str + this.mResources.getString(R$string.help_me_help_you) + s), (Object)i), R$drawable.about_help_me_help_you));
        list.add(new AboutAdabters$ModelAbout(n2, new Pair((Object)(str2 + this.mResources.getString(R$string.help_me_help_you_descrp) + s), (Object)i)));
        list.add(new AboutAdabters$ModelAbout(n2, new Pair((Object)s2, (Object)i)));
        list.add(new AboutAdabters$ModelAbout(0, new Pair((Object)"", (Object)i), R$drawable.signature_hazem));
        final RecyclerView recyclerView = (RecyclerView)this.findViewById(R$id.rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager((RecyclerView$LayoutManager)new LinearLayoutManager((Context)this));
        recyclerView.setAdapter((RecyclerView$Adapter)new AboutAdabters((Context)this, AppUtils.getAppVersionName((Context)this), list, ScreenUtils.getScreenWidth((Activity)this), (int)(ScreenUtils.getScreenHeight((Activity)this) * 0.3f)));
    }
    
    protected void attachBaseContext(Context onAttach) {
        onAttach = LocaleHelper.onAttach(onAttach);
        super.attachBaseContext(onAttach);
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_about);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        final int n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new AboutActivity$$ExternalSyntheticLambda0());
        final Resources resources = this.getResources();
        this.mResources = resources;
        if (resources == null) {
            this.finish();
        }
        this.init();
    }
}
