/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
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
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import hazem.nurmontage.videoquran.YoutuberActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.YoutuberActivity$1;
import hazem.nurmontage.videoquran.YoutuberActivity$2;
import hazem.nurmontage.videoquran.YoutuberActivity$3;
import hazem.nurmontage.videoquran.YoutuberActivity$4;
import hazem.nurmontage.videoquran.adabter.YoutuberAdabter;
import hazem.nurmontage.videoquran.adabter.YoutuberAdabter$IYoutuber;
import hazem.nurmontage.videoquran.model.YoutuberModel;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class YoutuberActivity
extends Base {
    private YoutuberAdabter$IYoutuber iYoutuber;
    private Resources mResources;
    private final OnBackPressedCallback onBackPressedCallback;

    static /* bridge */ /* synthetic */ OnBackPressedCallback -$$Nest$fgetonBackPressedCallback(YoutuberActivity youtuberActivity) {
        return youtuberActivity.onBackPressedCallback;
    }

    public YoutuberActivity() {
        Object object = new YoutuberActivity$1(this, true);
        this.onBackPressedCallback = object;
        this.iYoutuber = object = new YoutuberActivity$2(this);
    }

    private void init() {
        YoutuberAdabter youtuberAdabter;
        int n = ScreenUtils.getScreenWidth(this);
        int n2 = (int)((float)ScreenUtils.getScreenHeight(this) * 0.35f);
        ArrayList<YoutuberModel> arrayList = new ArrayList<YoutuberModel>();
        int n3 = R$drawable.hilal_ytb;
        Object object = new YoutuberModel("AjFCfILaEI8", n3);
        arrayList.add((YoutuberModel)object);
        n3 = R$drawable.gasadi_ytb;
        object = new YoutuberModel("vMgFSEE2hmg", n3);
        arrayList.add((YoutuberModel)object);
        n3 = R$drawable.hicham_ytb;
        object = new YoutuberModel("dr1LTEvCEHk", n3);
        arrayList.add((YoutuberModel)object);
        n3 = R$drawable.pakestain;
        object = new YoutuberModel("cRNG62W8ZLk", n3);
        arrayList.add((YoutuberModel)object);
        n3 = R$drawable.sajad_ytb;
        object = new YoutuberModel("tkPEq4qz2OQ", n3);
        arrayList.add((YoutuberModel)object);
        n3 = R$drawable.noor_ytb;
        object = new YoutuberModel("5IQzSF0wqJE", n3);
        arrayList.add((YoutuberModel)object);
        n3 = R$drawable.ytb_yesser;
        object = new YoutuberModel("E9cVRHeDzeU", n3);
        arrayList.add((YoutuberModel)object);
        int n4 = R$id.rv;
        Object object2 = object = this.findViewById(n4);
        object2 = (RecyclerView)object;
        YoutuberAdabter$IYoutuber youtuberAdabter$IYoutuber = this.iYoutuber;
        String string = AppUtils.getAppVersionName((Context)this);
        object = youtuberAdabter;
        youtuberAdabter = new YoutuberAdabter(youtuberAdabter$IYoutuber, arrayList, string, n, n2);
        object = new LinearLayoutManager((Context)this);
        ((RecyclerView)object2).setLayoutManager((RecyclerView$LayoutManager)object);
        ((RecyclerView)object2).setItemAnimator(null);
        ((RecyclerView)object2).setHasFixedSize(true);
        ((RecyclerView)object2).setAdapter(youtuberAdabter);
    }

    private boolean isGmailAvailable(Context context) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.setPackage("com.google.android.gm");
        return context.getPackageManager().queryIntentActivities(intent, 0).isEmpty() ^ true;
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
        int n = R$layout.activity_youtuber;
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
        object2 = new YoutuberActivity$$ExternalSyntheticLambda0();
        ViewCompat.setOnApplyWindowInsetsListener((View)object, (OnApplyWindowInsetsListener)object2);
        object = this.getResources();
        this.mResources = object;
        if (object == null) {
            this.finish();
        }
        n = R$id.btn_on_back;
        object = this.findViewById(n);
        object2 = new YoutuberActivity$3(this);
        object.setOnClickListener((View.OnClickListener)object2);
        this.init();
        n = R$id.btn_send_lnk;
        object = this.findViewById(n);
        object2 = new YoutuberActivity$4(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n = R$id.tv_tutorial;
        object = (TextCustumFont)this.findViewById(n);
        object2 = this.mResources;
        int n2 = R$string.my_tutorial;
        object2 = object2.getString(n2);
        object.setText((CharSequence)object2);
    }

    protected void onDestroy() {
        this.iYoutuber = null;
        super.onDestroy();
    }

    public void youtuberLnk(Context context) {
        Object object = this.mResources;
        int n = R$string.i_m_youtuber;
        object = object.getString(n);
        n = 1;
        String[] stringArray = new String[n];
        stringArray[0] = "hazemourari08@gmail.com";
        boolean bl = this.isGmailAvailable(context);
        String string2 = "message/rfc822";
        String string3 = "android.intent.extra.TEXT";
        String string4 = "android.intent.extra.SUBJECT";
        String string5 = "android.intent.extra.BCC";
        String string6 = "android.intent.extra.EMAIL";
        String string7 = "android.intent.action.SEND";
        if (bl) {
            context = new Intent(string7);
            context.putExtra(string6, stringArray);
            context.putExtra(string5, stringArray);
            context.putExtra(string4, (String)object);
            Object object2 = this.mResources;
            int n2 = R$string.link;
            object2 = object2.getString(n2);
            context.putExtra(string3, (String)object2);
            context.setType(string2);
            object2 = "com.google.android.gm";
            context.setPackage((String)object2);
            try {
                this.startActivity((Intent)context);
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        context = new Intent(string7);
        context.putExtra(string6, stringArray);
        context.putExtra(string5, stringArray);
        context.putExtra(string4, (String)object);
        object = this.mResources;
        n = R$string.link;
        object = object.getString(n);
        context.putExtra(string3, (String)object);
        context.setType(string2);
        object = "Send email using";
        context = Intent.createChooser((Intent)context, (CharSequence)object);
        try {
            this.startActivity((Intent)context);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
