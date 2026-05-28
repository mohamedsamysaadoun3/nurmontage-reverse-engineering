/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.net.Uri
 *  android.os.Bundle
 *  android.util.Pair
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.Window;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import hazem.nurmontage.videoquran.AboutActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.AboutActivity$1;
import hazem.nurmontage.videoquran.AboutActivity$2;
import hazem.nurmontage.videoquran.AboutActivity$3;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import hazem.nurmontage.videoquran.adabter.AboutAdabters;
import hazem.nurmontage.videoquran.adabter.AboutAdabters$ModelAbout;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AboutActivity
extends Base {
    private Resources mResources;
    private final OnBackPressedCallback onBackPressedCallback;

    static /* bridge */ /* synthetic */ OnBackPressedCallback -$$Nest$fgetonBackPressedCallback(AboutActivity aboutActivity) {
        return aboutActivity.onBackPressedCallback;
    }

    static /* bridge */ /* synthetic */ void -$$Nest$mhelp(AboutActivity aboutActivity) {
        aboutActivity.help();
    }

    public AboutActivity() {
        AboutActivity$1 aboutActivity$1 = new AboutActivity$1(this, true);
        this.onBackPressedCallback = aboutActivity$1;
    }

    private void help() {
        String string = "https://chat.whatsapp.com/DDdUegENpg83easzYDba2K?mode=wwt";
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

    private void init() {
        int n = R$id.btn_on_back;
        Object object = this.findViewById(n);
        Object object2 = new AboutActivity$2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n = R$id.btn_help;
        object = this.findViewById(n);
        object2 = new AboutActivity$3(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n = R$id.tv_help;
        object = (TextCustumFont)this.findViewById(n);
        object2 = this.mResources;
        int n2 = R$string.help;
        object2 = object2.getString(n2);
        object.setText((CharSequence)object2);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object = LocaleHelper.getLanguage((Context)this);
        object2 = "ar";
        n = ((String)object).equals(object2) ? 1 : 0;
        n = n != 0 ? 5 : 0x800003;
        Object object3 = "<font color=#F8B195>";
        Object object4 = new StringBuilder((String)object3);
        Object object5 = this.mResources;
        int n3 = R$string.about_free_site;
        object5 = object5.getString(n3);
        object4 = ((StringBuilder)object4).append((String)object5);
        object5 = "</font>";
        object4 = ((StringBuilder)object4).append((String)object5).toString();
        Object object6 = n;
        Object object7 = new Pair(object4, object6);
        int n4 = R$drawable.about_site_video;
        n3 = 19;
        object2 = new AboutAdabters$ModelAbout(n3, (Pair)object7, n4);
        arrayList.add(object2);
        object4 = this.mResources;
        int n5 = R$string.about_free_site_desc;
        object4 = object4.getString(n5);
        Object object8 = n;
        object7 = new Pair(object4, object8);
        n4 = 14;
        object2 = new AboutAdabters$ModelAbout(n4, (Pair)object7);
        arrayList.add(object2);
        object8 = n;
        String string2 = "\n";
        object7 = new Pair((Object)string2, object8);
        object2 = new AboutAdabters$ModelAbout(n4, (Pair)object7);
        arrayList.add(object2);
        object8 = new StringBuilder((String)object3);
        Object object9 = this.mResources;
        int n6 = R$string.about_free_app;
        object9 = object9.getString(n6);
        object8 = ((StringBuilder)object8).append((String)object9).append((String)object5).toString();
        object9 = n;
        object7 = new Pair(object8, object9);
        n5 = R$drawable.about_best_app;
        object2 = new AboutAdabters$ModelAbout(n3, (Pair)object7, n5);
        arrayList.add(object2);
        object8 = n;
        object7 = new Pair((Object)string2, object8);
        object2 = new AboutAdabters$ModelAbout(n4, (Pair)object7);
        arrayList.add(object2);
        object8 = new StringBuilder((String)object3);
        object9 = this.mResources;
        n6 = R$string.about_dont_subscribe;
        object9 = object9.getString(n6);
        object8 = ((StringBuilder)object8).append((String)object9).append((String)object5).toString();
        object9 = n;
        object7 = new Pair(object8, object9);
        n5 = R$drawable.about_money;
        object2 = new AboutAdabters$ModelAbout(n3, (Pair)object7, n5);
        arrayList.add(object2);
        object9 = "<font color='#ffffff'>";
        object8 = new StringBuilder((String)object9);
        Object object10 = this.mResources;
        int n7 = R$string.about_dont_subscribe_why;
        object10 = object10.getString(n7);
        object8 = ((StringBuilder)object8).append((String)object10).append((String)object5).toString();
        object10 = n;
        object7 = new Pair(object8, object10);
        object2 = new AboutAdabters$ModelAbout(n4, (Pair)object7);
        arrayList.add(object2);
        object8 = n;
        object7 = new Pair((Object)string2, object8);
        object2 = new AboutAdabters$ModelAbout(n4, (Pair)object7);
        arrayList.add(object2);
        object8 = new StringBuilder((String)object3);
        object10 = this.mResources;
        n7 = R$string.this_begeing_idea;
        object10 = object10.getString(n7);
        object8 = ((StringBuilder)object8).append((String)object10).append((String)object5).toString();
        object10 = n;
        object7 = new Pair(object8, object10);
        n5 = R$drawable.about_hazem;
        object2 = new AboutAdabters$ModelAbout(n3, (Pair)object7, n5);
        arrayList.add(object2);
        object8 = new StringBuilder((String)object9);
        object10 = this.mResources;
        n7 = R$string.this_begeing_idea_decp;
        object10 = object10.getString(n7);
        object8 = ((StringBuilder)object8).append((String)object10).append((String)object5).toString();
        object10 = n;
        object7 = new Pair(object8, object10);
        object2 = new AboutAdabters$ModelAbout(n4, (Pair)object7);
        arrayList.add(object2);
        object8 = n;
        object7 = new Pair((Object)string2, object8);
        object2 = new AboutAdabters$ModelAbout(n4, (Pair)object7);
        arrayList.add(object2);
        object8 = new StringBuilder((String)object3);
        object10 = this.mResources;
        n7 = R$string.about_help_tittle;
        object10 = object10.getString(n7);
        object8 = ((StringBuilder)object8).append((String)object10).append((String)object5).toString();
        object10 = n;
        object7 = new Pair(object8, object10);
        n5 = R$drawable.about_help;
        object2 = new AboutAdabters$ModelAbout(n3, (Pair)object7, n5);
        arrayList.add(object2);
        object8 = new StringBuilder((String)object9);
        object10 = this.mResources;
        n7 = R$string.about_help_body;
        object10 = object10.getString(n7);
        object8 = ((StringBuilder)object8).append((String)object10).append((String)object5).toString();
        object10 = n;
        object7 = new Pair(object8, object10);
        object2 = new AboutAdabters$ModelAbout(n4, (Pair)object7);
        arrayList.add(object2);
        object8 = n;
        object7 = new Pair((Object)string2, object8);
        object2 = new AboutAdabters$ModelAbout(n4, (Pair)object7);
        arrayList.add(object2);
        object8 = new StringBuilder((String)object3);
        object10 = this.mResources;
        n7 = R$string.nurmontage_means;
        object10 = object10.getString(n7);
        object8 = ((StringBuilder)object8).append((String)object10).append((String)object5).toString();
        object10 = n;
        object7 = new Pair(object8, object10);
        n5 = R$drawable.nurmontage_means;
        object2 = new AboutAdabters$ModelAbout(n3, (Pair)object7, n5);
        arrayList.add(object2);
        object8 = new StringBuilder((String)object9);
        object10 = this.mResources;
        n7 = R$string.nurmontage_means_descrp;
        object10 = object10.getString(n7);
        object8 = ((StringBuilder)object8).append((String)object10).append((String)object5).toString();
        object10 = n;
        object7 = new Pair(object8, object10);
        object2 = new AboutAdabters$ModelAbout(n4, (Pair)object7);
        arrayList.add(object2);
        object8 = n;
        object7 = new Pair((Object)string2, object8);
        object2 = new AboutAdabters$ModelAbout(n4, (Pair)object7);
        arrayList.add(object2);
        object8 = new StringBuilder((String)object3);
        object3 = this.mResources;
        n6 = R$string.help_me_help_you;
        object3 = object3.getString(n6);
        object3 = ((StringBuilder)object8).append((String)object3).append((String)object5).toString();
        object8 = n;
        object7 = new Pair(object3, object8);
        int n8 = R$drawable.about_help_me_help_you;
        object2 = new AboutAdabters$ModelAbout(n3, (Pair)object7, n8);
        arrayList.add(object2);
        object3 = new StringBuilder((String)object9);
        object6 = this.mResources;
        n5 = R$string.help_me_help_you_descrp;
        object6 = object6.getString(n5);
        object3 = ((StringBuilder)object3).append((String)object6).append((String)object5).toString();
        object5 = n;
        object7 = new Pair(object3, object5);
        object2 = new AboutAdabters$ModelAbout(n4, (Pair)object7);
        arrayList.add(object2);
        object3 = n;
        object7 = new Pair((Object)string2, object3);
        object2 = new AboutAdabters$ModelAbout(n4, (Pair)object7);
        arrayList.add(object2);
        object = n;
        object7 = new Pair((Object)"", object);
        n = R$drawable.signature_hazem;
        object2 = new AboutAdabters$ModelAbout(0, (Pair)object7, n);
        arrayList.add(object2);
        n = R$id.rv;
        object = (RecyclerView)this.findViewById(n);
        ((RecyclerView)object).setHasFixedSize(true);
        object2 = new LinearLayoutManager((Context)this);
        ((RecyclerView)object).setLayoutManager((RecyclerView$LayoutManager)object2);
        object3 = AppUtils.getAppVersionName((Context)this);
        int n9 = ScreenUtils.getScreenWidth(this);
        n3 = (int)((float)ScreenUtils.getScreenHeight(this) * 0.3f);
        object7 = object2;
        object4 = this;
        object2 = new AboutAdabters((Context)this, (String)object3, arrayList, n9, n3);
        ((RecyclerView)object).setAdapter((RecyclerView$Adapter)object2);
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

    protected void attachBaseContext(Context context) {
        context = LocaleHelper.onAttach(context);
        super.attachBaseContext(context);
    }

    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        EdgeToEdge.enable(this);
        int n = R$layout.activity_about;
        this.setContentView(n);
        object = this.getOnBackPressedDispatcher();
        Object object2 = this.onBackPressedCallback;
        ((OnBackPressedDispatcher)object).addCallback(this, (OnBackPressedCallback)object2);
        n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        object = this.getWindow();
        object2 = this.getWindow().getDecorView();
        object = WindowCompat.getInsetsController((Window)object, (View)object2);
        ((WindowInsetsControllerCompat)object).setAppearanceLightStatusBars(false);
        ((WindowInsetsControllerCompat)object).setAppearanceLightNavigationBars(false);
        n = R$id.main;
        object = this.findViewById(n);
        object2 = new AboutActivity$$ExternalSyntheticLambda0();
        ViewCompat.setOnApplyWindowInsetsListener((View)object, (OnApplyWindowInsetsListener)object2);
        object = this.getResources();
        this.mResources = object;
        if (object == null) {
            this.finish();
        }
        this.init();
    }
}
