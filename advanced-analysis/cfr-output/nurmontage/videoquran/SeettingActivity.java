/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  android.widget.LinearLayout
 *  android.widget.Toast
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
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingClientStateListener
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.Purchase
 *  com.android.billingclient.api.PurchasesResponseListener
 *  com.android.billingclient.api.PurchasesUpdatedListener
 *  com.android.billingclient.api.QueryPurchasesParams
 */
package hazem.nurmontage.videoquran;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryPurchasesParams;
import hazem.nurmontage.videoquran.AboutActivity;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.ChoiceLangActivity;
import hazem.nurmontage.videoquran.ProVersionActivity;
import hazem.nurmontage.videoquran.ProVersionActivityDone;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.SeettingActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.SeettingActivity$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.SeettingActivity$1;
import hazem.nurmontage.videoquran.SeettingActivity$10;
import hazem.nurmontage.videoquran.SeettingActivity$11;
import hazem.nurmontage.videoquran.SeettingActivity$12;
import hazem.nurmontage.videoquran.SeettingActivity$13;
import hazem.nurmontage.videoquran.SeettingActivity$14;
import hazem.nurmontage.videoquran.SeettingActivity$15;
import hazem.nurmontage.videoquran.SeettingActivity$16;
import hazem.nurmontage.videoquran.SeettingActivity$17;
import hazem.nurmontage.videoquran.SeettingActivity$18;
import hazem.nurmontage.videoquran.SeettingActivity$19;
import hazem.nurmontage.videoquran.SeettingActivity$2;
import hazem.nurmontage.videoquran.SeettingActivity$3;
import hazem.nurmontage.videoquran.SeettingActivity$4;
import hazem.nurmontage.videoquran.SeettingActivity$5;
import hazem.nurmontage.videoquran.SeettingActivity$6;
import hazem.nurmontage.videoquran.SeettingActivity$7;
import hazem.nurmontage.videoquran.SeettingActivity$8;
import hazem.nurmontage.videoquran.SeettingActivity$9;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.MyPrefereces;
import hazem.nurmontage.videoquran.YoutuberActivity;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import java.util.List;

public class SeettingActivity
extends Base
implements PurchasesUpdatedListener {
    private static String PRODUCT_ID_FOREIVER = "sku.nurmontage.foreiver";
    private BillingClient billingClient;
    private Dialog dialog;
    private boolean hasPurchasedForever;
    private Resources mResources;
    private final OnBackPressedCallback onBackPressedCallback;

    static /* bridge */ /* synthetic */ Dialog cfr_renamed_19(SeettingActivity seettingActivity) {
        return seettingActivity.dialog;
    }

    static /* bridge */ /* synthetic */ Resources cfr_renamed_90(SeettingActivity seettingActivity) {
        return seettingActivity.mResources;
    }

    static /* bridge */ /* synthetic */ OnBackPressedCallback cfr_renamed_91(SeettingActivity seettingActivity) {
        return seettingActivity.onBackPressedCallback;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_543(SeettingActivity seettingActivity, Dialog dialog) {
        seettingActivity.dialog = dialog;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_36(SeettingActivity seettingActivity) {
        seettingActivity.cancelDialog();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_522(SeettingActivity seettingActivity) {
        seettingActivity.changeLang();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_9(SeettingActivity seettingActivity) {
        seettingActivity.checkInAppPurchases();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_61(SeettingActivity seettingActivity) {
        seettingActivity.checkUserSubscriptionStatus();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_8(SeettingActivity seettingActivity, List list) {
        seettingActivity.handleSubscriptionPurchases(list);
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_12(SeettingActivity seettingActivity) {
        seettingActivity.help();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_552(SeettingActivity seettingActivity) {
        seettingActivity.openInstagramPage();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_411(SeettingActivity seettingActivity) {
        seettingActivity.openMoreApps();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_553(SeettingActivity seettingActivity) {
        seettingActivity.openPlayStoreForRating();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_281(SeettingActivity seettingActivity) {
        seettingActivity.openTikTokPage();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_541(SeettingActivity seettingActivity) {
        seettingActivity.openYouTubePage();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_406(SeettingActivity seettingActivity) {
        seettingActivity.restoreSubscribe();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_554(SeettingActivity seettingActivity) {
        seettingActivity.setPro();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_140(SeettingActivity seettingActivity) {
        seettingActivity.shareApp();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_62(SeettingActivity seettingActivity) {
        seettingActivity.startBillingConnection();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_360(SeettingActivity seettingActivity) {
        seettingActivity.toAbout();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_123(SeettingActivity seettingActivity) {
        seettingActivity.toPro();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_544(SeettingActivity seettingActivity) {
        seettingActivity.toYoutuber();
    }

    public SeettingActivity() {
        SeettingActivity$1 seettingActivity$1 = new SeettingActivity$1(this, true);
        this.onBackPressedCallback = seettingActivity$1;
        this.hasPurchasedForever = false;
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

    private void changeLang() {
        Intent intent = new Intent((Context)this, ChoiceLangActivity.class);
        intent.putExtra("from_setting", true);
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
        this.finish();
    }

    private void checkInAppPurchases() {
        QueryPurchasesParams queryPurchasesParams = QueryPurchasesParams.newBuilder().setProductType("inapp").build();
        BillingClient billingClient = this.billingClient;
        SeettingActivity$$ExternalSyntheticLambda1 seettingActivity$$ExternalSyntheticLambda1 = new SeettingActivity$$ExternalSyntheticLambda1(this);
        billingClient.queryPurchasesAsync(queryPurchasesParams, (PurchasesResponseListener)seettingActivity$$ExternalSyntheticLambda1);
    }

    private void checkUserSubscriptionStatus() {
        QueryPurchasesParams queryPurchasesParams = QueryPurchasesParams.newBuilder().setProductType("subs").build();
        BillingClient billingClient = this.billingClient;
        SeettingActivity$18 seettingActivity$18 = new SeettingActivity$18(this);
        billingClient.queryPurchasesAsync(queryPurchasesParams, (PurchasesResponseListener)seettingActivity$18);
    }

    private void dialogStateSubscribe(boolean bl) {
        SeettingActivity$19 seettingActivity$19 = new SeettingActivity$19(this, bl);
        this.runOnUiThread(seettingActivity$19);
    }

    private void handleSubscriptionPurchases(List object) {
        block1: {
            Purchase purchase;
            int n;
            object = object.iterator();
            while (n = object.hasNext()) {
                int n2;
                purchase = (Purchase)object.next();
                n = purchase.getPurchaseState();
                if (n != (n2 = 1)) continue;
                object = this.getApplicationContext();
                BillingPreferences.saveSubscriptionStatus((Context)object, n2 != 0);
                this.dialogStateSubscribe(n2 != 0);
                break block1;
            }
            object = this.getApplicationContext();
            n = 0;
            purchase = null;
            BillingPreferences.saveSubscriptionStatus((Context)object, false);
            this.checkInAppPurchases();
        }
    }

    private void help() {
        String string2 = "https://chat.whatsapp.com/F0kqOjZS1VuBAvoiOG4XEZ";
        String string3 = "android.intent.action.VIEW";
        Intent intent = new Intent(string3);
        string2 = Uri.parse((String)string2);
        intent.setData((Uri)string2);
        string2 = "com.whatsapp";
        intent.setPackage(string2);
        try {
            this.startActivity(intent);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void init() {
        int n;
        Object object;
        Object object2;
        String string2;
        Object object3;
        CharSequence charSequence;
        block19: {
            String string3;
            block18: {
                charSequence = "";
                object3 = "\u0625\u0635\u062f\u0627\u0631 : ";
                string2 = "Version : ";
                int n2 = R$id.btn_on_back;
                object2 = this.findViewById(n2);
                object = new SeettingActivity$3(this);
                object2.setOnClickListener((View.OnClickListener)object);
                n2 = R$id.tv_version;
                object2 = (TextCustumFont)this.findViewById(n2);
                object = this.getPackageManager();
                string3 = this.getPackageName();
                object = object.getPackageInfo(string3, 0);
                object = ((PackageInfo)object).versionName;
                if (object == null) break block18;
                string3 = "-nurmontage4kb";
                object = ((String)object).replace(string3, charSequence);
                string3 = "-nurmontage16kb";
                object = ((String)object).replace(string3, charSequence);
            }
            charSequence = LocaleHelper.getLanguage((Context)this);
            string3 = "ar";
            n = ((String)charSequence).equals(string3) ? 1 : 0;
            if (n == 0) break block19;
            charSequence = new StringBuilder((String)object3);
            charSequence = ((StringBuilder)charSequence).append((String)object);
            charSequence = ((StringBuilder)charSequence).toString();
            object2.setText(charSequence);
        }
        charSequence = new StringBuilder(string2);
        charSequence = ((StringBuilder)charSequence).append((String)object);
        charSequence = ((StringBuilder)charSequence).toString();
        try {
            object2.setText(charSequence);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            nameNotFoundException.printStackTrace();
        }
        n = R$id.btn_rate_app;
        charSequence = this.findViewById(n);
        object3 = new SeettingActivity$4(this);
        charSequence.setOnClickListener((View.OnClickListener)object3);
        n = R$id.btn_more_app;
        charSequence = this.findViewById(n);
        object3 = new SeettingActivity$5(this);
        charSequence.setOnClickListener((View.OnClickListener)object3);
        n = R$id.btn_share;
        charSequence = this.findViewById(n);
        object3 = new SeettingActivity$6(this);
        charSequence.setOnClickListener((View.OnClickListener)object3);
        n = R$id.btn_lang;
        charSequence = this.findViewById(n);
        object3 = new SeettingActivity$7(this);
        charSequence.setOnClickListener((View.OnClickListener)object3);
        n = R$id.btn_copyRight;
        charSequence = this.findViewById(n);
        object3 = new SeettingActivity$8(this);
        charSequence.setOnClickListener((View.OnClickListener)object3);
        n = R$id.btn_to_pro;
        charSequence = this.findViewById(n);
        object3 = new SeettingActivity$9(this);
        charSequence.setOnClickListener((View.OnClickListener)object3);
        n = R$id.btn_about;
        charSequence = this.findViewById(n);
        object3 = new SeettingActivity$10(this);
        charSequence.setOnClickListener((View.OnClickListener)object3);
        n = R$id.btn_im_bloger;
        charSequence = this.findViewById(n);
        object3 = new SeettingActivity$11(this);
        charSequence.setOnClickListener((View.OnClickListener)object3);
        n = R$id.btn_instagram;
        charSequence = this.findViewById(n);
        object3 = new SeettingActivity$12(this);
        charSequence.setOnClickListener((View.OnClickListener)object3);
        n = R$id.btn_youtbe;
        charSequence = this.findViewById(n);
        object3 = new SeettingActivity$13(this);
        charSequence.setOnClickListener((View.OnClickListener)object3);
        n = R$id.btn_ticktock;
        charSequence = this.findViewById(n);
        object3 = new SeettingActivity$14(this);
        charSequence.setOnClickListener((View.OnClickListener)object3);
        n = R$id.btn_whatsap;
        charSequence = this.findViewById(n);
        object3 = new SeettingActivity$15(this);
        charSequence.setOnClickListener((View.OnClickListener)object3);
    }

    private boolean isGmailAvailable(Context context) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.setPackage("com.google.android.gm");
        return context.getPackageManager().queryIntentActivities(intent, 0).isEmpty() ^ true;
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void openInstagramPage() {
        Uri uri = Uri.parse((String)"https://www.instagram.com/nurmontage.app/");
        String string2 = "android.intent.action.VIEW";
        Intent intent = new Intent(string2, uri);
        String string3 = "com.instagram.android";
        intent.setPackage(string3);
        try {
            this.startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            try {
                intent = new Intent(string2, uri);
            }
            catch (ActivityNotFoundException activityNotFoundException2) {
                return;
            }
            this.startActivity(intent);
            return;
        }
    }

    private void openMoreApps() {
        Object object = Uri.parse((String)"market://dev?id=8943620497392395895");
        String string2 = "android.intent.action.VIEW";
        Intent intent = new Intent(string2, object);
        object = "com.android.vending";
        intent.setPackage((String)object);
        try {
            this.startActivity(intent);
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            object = Uri.parse((String)"https://play.google.com/store/apps/dev?id=8943620497392395895");
            intent = new Intent(string2, object);
            this.startActivity(intent);
        }
    }

    private void openPlayStoreForRating() {
        CharSequence charSequence = "http://play.google.com/store/apps/details?id=";
        String string2 = this.getPackageName();
        CharSequence charSequence2 = new StringBuilder("market://details?id=");
        charSequence2 = Uri.parse((String)((StringBuilder)charSequence2).append(string2).toString());
        String string3 = "android.intent.action.VIEW";
        Intent intent = new Intent(string3, (Uri)charSequence2);
        charSequence2 = "com.android.vending";
        intent.setPackage((String)charSequence2);
        int n = 0x58000000;
        intent.addFlags(n);
        try {
            this.startActivity(intent);
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            charSequence2 = new StringBuilder((String)charSequence);
            charSequence = ((StringBuilder)charSequence2).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
            charSequence = Uri.parse((String)charSequence);
            intent = new Intent(string3, (Uri)charSequence);
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

    private void openTikTokPage() {
        String string2 = "https://www.tiktok.com/@nurmontagesupport";
        Object object = Uri.parse((String)string2);
        String string3 = "android.intent.action.VIEW";
        Intent intent = new Intent(string3, object);
        object = "com.zhiliaoapp.musically";
        intent.setPackage((String)object);
        try {
            this.startActivity(intent);
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            string2 = Uri.parse((String)string2);
            intent = new Intent(string3, (Uri)string2);
            this.startActivity(intent);
        }
    }

    private void openYouTubePage() {
        String string2 = "https://www.youtube.com/@NurMontageApp/";
        Object object = Uri.parse((String)string2);
        String string3 = "android.intent.action.VIEW";
        Intent intent = new Intent(string3, object);
        object = "com.google.android.youtube";
        intent.setPackage((String)object);
        try {
            this.startActivity(intent);
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            string2 = Uri.parse((String)string2);
            intent = new Intent(string3, (Uri)string2);
            this.startActivity(intent);
        }
    }

    private void restoreSubscribe() {
        this.startBillingConnection();
    }

    private void setPro() {
        int n = R$id.tv_your_pro;
        TextCustumFontBold textCustumFontBold = (TextCustumFontBold)this.findViewById(n);
        Object object = this.mResources;
        int n2 = R$string.you_are_premium;
        object = object.getString(n2);
        textCustumFontBold.setText((CharSequence)object);
        n = R$id.btn_to_pro;
        textCustumFontBold = (LinearLayout)this.findViewById(n);
        int n3 = R$drawable.bg_your_pro;
        textCustumFontBold.setBackgroundResource(n3);
        n = R$id.btn_restore;
        this.findViewById(n).setVisibility(8);
    }

    private void shareApp() {
        String string2;
        String string3 = LocaleHelper.getLanguage((Context)this);
        boolean bl = string3.equals(string2 = "ar");
        string3 = bl ? "\u0623\u0646\u0634\u0626 \u0631\u064a\u0644\u0632 \u0642\u0631\u0622\u0646\u064a\u0629 \u062c\u0645\u064a\u0644\u0629 \u0628\u0633\u0647\u0648\u0644\u0629 \ud83c\udfa7\u2728\n\u062c\u0631\u0651\u0628 NurMontage:\nhttps://play.google.com/store/apps/details?id=hazem.nurmontage.videoquran" : "Create beautiful Quran Reels easily \ud83c\udfa7\u2728\nTry NurMontage:\nhttps://play.google.com/store/apps/details?id=hazem.nurmontage.videoquran";
        string2 = new Intent("android.intent.action.SEND");
        string2.setType("text/plain");
        string2.putExtra("android.intent.extra.SUBJECT", "Check out this app!");
        string2.putExtra("android.intent.extra.TEXT", string3);
        string3 = Intent.createChooser((Intent)string2, (CharSequence)"Share via");
        this.startActivity((Intent)string3);
    }

    private void startBillingConnection() {
        BillingClient billingClient;
        this.billingClient = billingClient = BillingClient.newBuilder((Context)this).setListener((PurchasesUpdatedListener)this).enablePendingPurchases().build();
        SeettingActivity$17 seettingActivity$17 = new SeettingActivity$17(this);
        billingClient.startConnection((BillingClientStateListener)seettingActivity$17);
    }

    private void toAbout() {
        MyPrefereces.putVueAbout((Context)this);
        Intent intent = new Intent((Context)this, AboutActivity.class);
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
    }

    private void toPro() {
        Intent intent;
        boolean bl = BillingPreferences.isSubscribed((Context)this);
        if (bl) {
            Class<ProVersionActivityDone> clazz = ProVersionActivityDone.class;
            intent = new Intent((Context)this, clazz);
        } else {
            Class<ProVersionActivity> clazz = ProVersionActivity.class;
            intent = new Intent((Context)this, clazz);
        }
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
    }

    private void toYoutuber() {
        Intent intent = new Intent((Context)this, YoutuberActivity.class);
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
    }

    protected void attachBaseContext(Context context) {
        context = LocaleHelper.onAttach(context);
        super.attachBaseContext(context);
    }

    public void contact() {
        String[] stringArray;
        Object object = this.mResources;
        int n = R$string.support_team;
        object = object.getString(n);
        n = BillingPreferences.isSubscribed((Context)this) ? 1 : 0;
        if (n != 0) {
            stringArray = new StringBuilder();
            object = stringArray.append((String)object);
            stringArray = " : ";
            object = ((StringBuilder)object).append((String)stringArray).toString();
        }
        n = 1;
        stringArray = new String[n];
        Intent intent = null;
        stringArray[0] = "nurmontage.contact@gmail.com";
        boolean bl = this.isGmailAvailable((Context)this);
        String string2 = "message/rfc822";
        String string3 = "android.intent.extra.SUBJECT";
        String string4 = "android.intent.extra.BCC";
        String string5 = "android.intent.extra.EMAIL";
        String string6 = "android.intent.action.SEND";
        if (bl) {
            intent = new Intent(string6);
            intent.putExtra(string5, stringArray);
            intent.putExtra(string4, stringArray);
            intent.putExtra(string3, (String)object);
            intent.setType(string2);
            String string7 = "com.google.android.gm";
            intent.setPackage(string7);
            try {
                this.startActivity(intent);
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        intent = new Intent(string6);
        intent.putExtra(string5, stringArray);
        intent.putExtra(string4, stringArray);
        intent.putExtra(string3, (String)object);
        intent.setType(string2);
        object = "Send email using";
        object = Intent.createChooser((Intent)intent, (CharSequence)object);
        try {
            this.startActivity((Intent)object);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void dialogCopyRight() {
        block32: {
            var1_1 = new Dialog((Context)this);
            this.dialog = var1_1;
            var2_3 = 1;
            var1_1.setCancelable((boolean)var2_3);
            var1_1 = this.dialog;
            var1_1.requestWindowFeature(var2_3);
            var1_1 = this.dialog;
            var1_1 = var1_1.getWindow();
            var2_3 = -1;
            var3_4 = -2;
            var1_1.setLayout(var2_3, var3_4);
            var1_1 = this.dialog;
            var1_1 = var1_1.getWindow();
            var3_4 = 0;
            var5_6 /* !! */  = null;
            var4_5 /* !! */  = new ColorDrawable(0);
            var1_1.setBackgroundDrawable((Drawable)var4_5 /* !! */ );
            var1_1 = LayoutInflater.from((Context)this);
            var2_3 = R$layout.layout_dialog_copyright;
            var3_4 = 0;
            var5_6 /* !! */  = null;
            var1_1 = var1_1.inflate(var2_3, null);
            var4_5 /* !! */  = this.dialog;
            var4_5 /* !! */ .setContentView((View)var1_1);
            var2_3 = R$id.dialog_title;
            var4_5 /* !! */  = var1_1.findViewById(var2_3);
            var4_5 /* !! */  = (TextCustumFontBold)var4_5 /* !! */ ;
            var3_4 = R$id.tv_msj;
            var5_6 /* !! */  = var1_1.findViewById(var3_4);
            var5_6 /* !! */  = (TextCustumFont)var5_6 /* !! */ ;
            var6_7 = R$id.dialog_no;
            var1_1 = var1_1.findViewById(var6_7);
            var7_8 = new SeettingActivity$16(this);
            var1_1.setOnClickListener((View.OnClickListener)var7_8);
            var1_1 = LocaleHelper.getLanguage((Context)this);
            var7_8 = "ar";
            var8_9 = var1_1.equals(var7_8);
            if (!var8_9) break block32;
            var1_1 = "\u062a\u0646\u0628\u064a\u0647 \u062d\u0642\u0648\u0642 \u0627\u0644\u0627\u0633\u062a\u062e\u062f\u0627\u0645 \u26a0\ufe0f";
            var4_5 /* !! */ .setText((CharSequence)var1_1);
            var1_1 = "\u0628\u0639\u0636 \u062a\u0633\u062c\u064a\u0644\u0627\u062a \u062a\u0644\u0627\u0648\u0627\u062a \u0627\u0644\u0642\u0631\u0651\u0627\u0621 \u0645\u062d\u0645\u064a\u0629 \u0628\u062d\u0642\u0648\u0642 \u0627\u0644\u0646\u0634\u0631\u060c \u0648\u0647\u064a \u0645\u062e\u0635\u0651\u0635\u0629 \u0644\u0644\u0627\u0633\u062a\u062e\u062f\u0627\u0645 \u0627\u0644\u0634\u062e\u0635\u064a \u0641\u0642\u0637.\n\n\u0642\u062f \u062a\u0633\u0645\u062d \u0628\u0639\u0636 \u0627\u0644\u0645\u0646\u0635\u0627\u062a \u0628\u0627\u0633\u062a\u062e\u062f\u0627\u0645 \u0647\u0630\u0647 \u0627\u0644\u0623\u0635\u0648\u0627\u062a \u062f\u0648\u0646 \u0645\u0634\u0627\u0643\u0644\u060c \u0644\u0643\u0646 \u0630\u0644\u0643 \u0644\u0627 \u064a\u064f\u0639\u062f\u0651 \u062a\u0635\u0631\u064a\u062d\u064b\u0627 \u0628\u0627\u0644\u0646\u0634\u0631 \u0623\u0648 \u0627\u0644\u0627\u0633\u062a\u062e\u062f\u0627\u0645 \u0627\u0644\u062a\u062c\u0627\u0631\u064a.\n\n\u0644\u0644\u0646\u0634\u0631 \u0627\u0644\u0622\u0645\u0646\u060c \u064a\u064f\u0631\u062c\u0649 \u0627\u062e\u062a\u064a\u0627\u0631 \u0642\u0627\u0631\u0626 \u0645\u0630\u0643\u0648\u0631 \u0639\u0644\u0649 \u0623\u0646\u0647 \u0645\u0633\u0645\u0648\u062d \u0628\u0627\u0644\u0646\u0634\u0631 \u0623\u0648 \u0627\u0633\u062a\u062e\u062f\u0627\u0645 \u0635\u0648\u062a\u0643 \u0627\u0644\u062e\u0627\u0635.\n\n\u0627\u0644\u0645\u0633\u062a\u062e\u062f\u0645 \u0645\u0633\u0624\u0648\u0644 \u0628\u0627\u0644\u0643\u0627\u0645\u0644 \u0639\u0646 \u0627\u0644\u0627\u0644\u062a\u0632\u0627\u0645 \u0628\u0633\u064a\u0627\u0633\u0627\u062a \u062d\u0642\u0648\u0642 \u0627\u0644\u0646\u0634\u0631 \u0627\u0644\u062e\u0627\u0635\u0629 \u0628\u0643\u0644 \u0645\u0646\u0635\u0629.";
            var5_6 /* !! */ .setText((CharSequence)var1_1);
            ** GOTO lbl77
        }
        var1_1 = "\u26a0\ufe0f Copyright Notice";
        var4_5 /* !! */ .setText((CharSequence)var1_1);
        var1_1 = "Some reciters\u2019 audio recordings are protected by copyright and are intended for personal use only.\n\nCertain platforms may allow these sounds without issues, but this does not constitute permission to publish or use them commercially.\n\nFor safe publishing, please select a reciter marked as allowed for publishing or use your own audio.\n\nThe user is solely responsible for complying with the copyright policies of each platform.";
        var5_6 /* !! */ .setText((CharSequence)var1_1);
lbl77:
        // 2 sources

        var1_1 = this.dialog;
        try {
            var1_1.show();
        }
        catch (Exception var1_2) {
            var1_2.printStackTrace();
        }
    }

    /* synthetic */ void cfr_renamed_555(BillingResult object, List list) {
        int n = object.getResponseCode();
        int n2 = 1;
        if (n == 0) {
            int n3;
            this.hasPurchasedForever = false;
            object = list.iterator();
            while ((n3 = object.hasNext()) != 0) {
                String string2;
                list = (Purchase)object.next();
                List list2 = list.getProducts();
                boolean bl = list2.contains(string2 = PRODUCT_ID_FOREIVER);
                if (!bl || (n3 = list.getPurchaseState()) != n2) continue;
                this.hasPurchasedForever = n2;
                break;
            }
        }
        if ((n = (int)(this.hasPurchasedForever ? 1 : 0)) == 0) {
            this.dialogStateSubscribe(false);
        } else {
            object = this.getApplicationContext();
            BillingPreferences.saveSubscriptionStatus((Context)object, n2 != 0);
            this.dialogStateSubscribe(n2 != 0);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        int n = R$layout.activity_seetting;
        this.setContentView(n);
        bundle = this.getOnBackPressedDispatcher();
        Object object = this.onBackPressedCallback;
        bundle.addCallback((LifecycleOwner)this, object);
        WindowCompat.setDecorFitsSystemWindows((Window)this.getWindow(), (boolean)true);
        n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        bundle = this.getWindow();
        object = this.getWindow().getDecorView();
        bundle = WindowCompat.getInsetsController((Window)bundle, (View)object);
        bundle.setAppearanceLightStatusBars(false);
        bundle.setAppearanceLightNavigationBars(false);
        n = R$id.main;
        bundle = this.findViewById(n);
        object = new SeettingActivity$$ExternalSyntheticLambda0();
        ViewCompat.setOnApplyWindowInsetsListener((View)bundle, (OnApplyWindowInsetsListener)object);
        bundle = this.getResources();
        this.mResources = bundle;
        if (bundle == null) {
            this.finish();
        }
        this.init();
    }

    protected void onPause() {
        this.cancelDialog();
        super.onPause();
    }

    public void onPurchasesUpdated(BillingResult billingResult, List list) {
    }

    protected void onResume() {
        super.onResume();
        int n = BillingPreferences.isSubscribed((Context)this);
        if (n != 0) {
            this.setPro();
        } else {
            n = R$id.btn_restore;
            View view = this.findViewById(n);
            SeettingActivity$2 seettingActivity$2 = new SeettingActivity$2(this);
            view.setOnClickListener((View.OnClickListener)seettingActivity$2);
        }
    }
}

