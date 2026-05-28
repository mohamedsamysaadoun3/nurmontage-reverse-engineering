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
import com.android.billingclient.api.BillingResult;
import android.view.Window;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import hazem.nurmontage.videoquran.Utils.MyPrefereces;
import com.android.billingclient.api.BillingClientStateListener;
import android.widget.LinearLayout;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import android.widget.Toast;
import android.content.ActivityNotFoundException;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.view.View$OnClickListener;
import android.net.Uri;
import java.util.Iterator;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryPurchasesParams;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import androidx.activity.OnBackPressedCallback;
import android.content.res.Resources;
import android.app.Dialog;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PurchasesUpdatedListener;

public class SeettingActivity extends Base implements PurchasesUpdatedListener
{
    private static String PRODUCT_ID_FOREIVER = "sku.nurmontage.foreiver";
    private BillingClient billingClient;
    private Dialog dialog;
    private boolean hasPurchasedForever;
    private Resources mResources;
    private final OnBackPressedCallback onBackPressedCallback;
    
    public SeettingActivity() {
        this.onBackPressedCallback = new SeettingActivity$1(this, true);
        this.hasPurchasedForever = false;
    }
    
    private void cancelDialog() {
        final Dialog dialog = this.dialog;
        if (dialog != null && dialog.isShowing()) {
            this.dialog.dismiss();
        }
        this.dialog = null;
    }
    
    private void changeLang() {
        final Intent intent = new Intent((Context)this, (Class)ChoiceLangActivity.class);
        intent.putExtra("from_setting", true);
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
        this.finish();
    }
    
    private void checkInAppPurchases() {
        this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), (PurchasesResponseListener)new SeettingActivity$$ExternalSyntheticLambda1(this));
    }
    
    private void checkUserSubscriptionStatus() {
        this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("subs").build(), (PurchasesResponseListener)new SeettingActivity$18(this));
    }
    
    private void dialogStateSubscribe(final boolean b) {
        this.runOnUiThread((Runnable)new SeettingActivity$19(this, b));
    }
    
    private void handleSubscriptionPurchases(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final int purchaseState = ((Purchase)iterator.next()).getPurchaseState();
            final boolean b = true;
            if (purchaseState == (b ? 1 : 0)) {
                BillingPreferences.saveSubscriptionStatus(this.getApplicationContext(), b);
                this.dialogStateSubscribe(b);
                return;
            }
        }
        BillingPreferences.saveSubscriptionStatus(this.getApplicationContext(), false);
        this.checkInAppPurchases();
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
    
    private void init() {
        final String s = "";
        final String str = "\u0625\u0635\u062f\u0627\u0631 : ";
        final String str2 = "Version : ";
        this.findViewById(R$id.btn_on_back).setOnClickListener((View$OnClickListener)new SeettingActivity$3(this));
        final TextCustumFont textCustumFont = (TextCustumFont)this.findViewById(R$id.tv_version);
        Label_0208: {
            try {
                final PackageManager packageManager = this.getPackageManager();
                try {
                    final PackageInfo packageInfo = packageManager.getPackageInfo(this.getPackageName(), 0);
                    try {
                        String s2 = packageInfo.versionName;
                        if (s2 != null) {
                            s2 = s2.replace("-nurmontage4kb", s).replace("-nurmontage16kb", s);
                        }
                        try {
                            Label_0173: {
                                if (!LocaleHelper.getLanguage((Context)this).equals("ar")) {
                                    break Label_0173;
                                }
                                final StringBuilder sb = new StringBuilder(str);
                                try {
                                    final StringBuilder append = sb.append(s2);
                                    try {
                                        textCustumFont.setText((CharSequence)append.toString());
                                        break Label_0208;
                                        final StringBuilder sb2 = new StringBuilder(str2);
                                        try {
                                            final StringBuilder append2 = sb2.append(s2);
                                            try {
                                                textCustumFont.setText((CharSequence)append2.toString());
                                            }
                                            catch (final PackageManager$NameNotFoundException ex) {
                                                ex.printStackTrace();
                                            }
                                        }
                                        catch (final PackageManager$NameNotFoundException ex2) {}
                                    }
                                    catch (final PackageManager$NameNotFoundException ex3) {}
                                }
                                catch (final PackageManager$NameNotFoundException ex4) {}
                            }
                        }
                        catch (final PackageManager$NameNotFoundException ex5) {}
                    }
                    catch (final PackageManager$NameNotFoundException ex6) {}
                }
                catch (final PackageManager$NameNotFoundException ex7) {}
            }
            catch (final PackageManager$NameNotFoundException ex8) {}
        }
        this.findViewById(R$id.btn_rate_app).setOnClickListener((View$OnClickListener)new SeettingActivity$4(this));
        this.findViewById(R$id.btn_more_app).setOnClickListener((View$OnClickListener)new SeettingActivity$5(this));
        this.findViewById(R$id.btn_share).setOnClickListener((View$OnClickListener)new SeettingActivity$6(this));
        this.findViewById(R$id.btn_lang).setOnClickListener((View$OnClickListener)new SeettingActivity$7(this));
        this.findViewById(R$id.btn_copyRight).setOnClickListener((View$OnClickListener)new SeettingActivity$8(this));
        this.findViewById(R$id.btn_to_pro).setOnClickListener((View$OnClickListener)new SeettingActivity$9(this));
        this.findViewById(R$id.btn_about).setOnClickListener((View$OnClickListener)new SeettingActivity$10(this));
        this.findViewById(R$id.btn_im_bloger).setOnClickListener((View$OnClickListener)new SeettingActivity$11(this));
        this.findViewById(R$id.btn_instagram).setOnClickListener((View$OnClickListener)new SeettingActivity$12(this));
        this.findViewById(R$id.btn_youtbe).setOnClickListener((View$OnClickListener)new SeettingActivity$13(this));
        this.findViewById(R$id.btn_ticktock).setOnClickListener((View$OnClickListener)new SeettingActivity$14(this));
        this.findViewById(R$id.btn_whatsap).setOnClickListener((View$OnClickListener)new SeettingActivity$15(this));
    }
    
    private boolean isGmailAvailable(final Context context) {
        final Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.setPackage("com.google.android.gm");
        return context.getPackageManager().queryIntentActivities(intent, 0).isEmpty() ^ true;
    }
    
    private void openInstagramPage() {
        final Uri parse = Uri.parse("https://www.instagram.com/nurmontage.app/");
        final String s = "android.intent.action.VIEW";
        final Intent intent = new Intent(s, parse);
        intent.setPackage("com.instagram.android");
        try {
            this.startActivity(intent);
            return;
        }
        catch (final ActivityNotFoundException ex) {
            final Intent intent2 = new(android.content.Intent.class)();
            final Intent intent4;
            final Intent intent3 = intent4 = intent2;
            final String s2 = s;
            final Uri uri = parse;
            new Intent(s2, uri);
            final SeettingActivity seettingActivity = this;
            final Intent intent5 = intent3;
            seettingActivity.startActivity(intent5);
        }
        try {
            final Intent intent2 = new(android.content.Intent.class)();
            final Intent intent4;
            final Intent intent3 = intent4 = intent2;
            final String s2 = s;
            final Uri uri = parse;
            new Intent(s2, uri);
            final SeettingActivity seettingActivity = this;
            try {
                final Intent intent5 = intent3;
                seettingActivity.startActivity(intent5);
            }
            catch (final ActivityNotFoundException ex2) {}
        }
        catch (final ActivityNotFoundException ex3) {}
    }
    
    private void openMoreApps() {
        final Uri parse = Uri.parse("market://dev?id=8943620497392395895");
        final String s = "android.intent.action.VIEW";
        final Intent intent = new Intent(s, parse);
        intent.setPackage("com.android.vending");
        try {
            this.startActivity(intent);
        }
        catch (final ActivityNotFoundException ex) {
            this.startActivity(new Intent(s, Uri.parse("https://play.google.com/store/apps/dev?id=8943620497392395895")));
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
    
    private void openTikTokPage() {
        final String s = "https://www.tiktok.com/@nurmontagesupport";
        final Uri parse = Uri.parse(s);
        final String s2 = "android.intent.action.VIEW";
        final Intent intent = new Intent(s2, parse);
        intent.setPackage("com.zhiliaoapp.musically");
        try {
            this.startActivity(intent);
        }
        catch (final ActivityNotFoundException ex) {
            this.startActivity(new Intent(s2, Uri.parse(s)));
        }
    }
    
    private void openYouTubePage() {
        final String s = "https://www.youtube.com/@NurMontageApp/";
        final Uri parse = Uri.parse(s);
        final String s2 = "android.intent.action.VIEW";
        final Intent intent = new Intent(s2, parse);
        intent.setPackage("com.google.android.youtube");
        try {
            this.startActivity(intent);
        }
        catch (final ActivityNotFoundException ex) {
            this.startActivity(new Intent(s2, Uri.parse(s)));
        }
    }
    
    private void restoreSubscribe() {
        this.startBillingConnection();
    }
    
    private void setPro() {
        ((TextCustumFontBold)this.findViewById(R$id.tv_your_pro)).setText((CharSequence)this.mResources.getString(R$string.you_are_premium));
        ((LinearLayout)this.findViewById(R$id.btn_to_pro)).setBackgroundResource(R$drawable.bg_your_pro);
        this.findViewById(R$id.btn_restore).setVisibility(8);
    }
    
    private void shareApp() {
        String s;
        if (LocaleHelper.getLanguage((Context)this).equals("ar")) {
            s = "\u0623\u0646\u0634\u0626 \u0631\u064a\u0644\u0632 \u0642\u0631\u0622\u0646\u064a\u0629 \u062c\u0645\u064a\u0644\u0629 \u0628\u0633\u0647\u0648\u0644\u0629 \ud83c\udfa7\u2728\n\u062c\u0631\u0651\u0628 NurMontage:\nhttps://play.google.com/store/apps/details?id=hazem.nurmontage.videoquran";
        }
        else {
            s = "Create beautiful Quran Reels easily \ud83c\udfa7\u2728\nTry NurMontage:\nhttps://play.google.com/store/apps/details?id=hazem.nurmontage.videoquran";
        }
        final Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", "Check out this app!");
        intent.putExtra("android.intent.extra.TEXT", s);
        this.startActivity(Intent.createChooser(intent, (CharSequence)"Share via"));
    }
    
    private void startBillingConnection() {
        (this.billingClient = BillingClient.newBuilder((Context)this).setListener((PurchasesUpdatedListener)this).enablePendingPurchases().build()).startConnection((BillingClientStateListener)new SeettingActivity$17(this));
    }
    
    private void toAbout() {
        MyPrefereces.putVueAbout((Context)this);
        this.startActivity(new Intent((Context)this, (Class)AboutActivity.class));
        this.overridePendingTransition(0, 0);
    }
    
    private void toPro() {
        Intent intent;
        if (BillingPreferences.isSubscribed((Context)this)) {
            intent = new Intent((Context)this, (Class)ProVersionActivityDone.class);
        }
        else {
            intent = new Intent((Context)this, (Class)ProVersionActivity.class);
        }
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
    }
    
    private void toYoutuber() {
        this.startActivity(new Intent((Context)this, (Class)YoutuberActivity.class));
        this.overridePendingTransition(0, 0);
    }
    
    protected void attachBaseContext(Context onAttach) {
        onAttach = LocaleHelper.onAttach(onAttach);
        super.attachBaseContext(onAttach);
    }
    
    public void contact() {
        String str = this.mResources.getString(R$string.support_team);
        if (BillingPreferences.isSubscribed((Context)this)) {
            str += " : ";
        }
        final String[] array = { "nurmontage.contact@gmail.com" };
        final boolean gmailAvailable = this.isGmailAvailable((Context)this);
        final String s = "message/rfc822";
        final String s2 = "android.intent.extra.SUBJECT";
        final String s3 = "android.intent.extra.BCC";
        final String s4 = "android.intent.extra.EMAIL";
        final String s5 = "android.intent.action.SEND";
        if (gmailAvailable) {
            final Intent intent = new Intent(s5);
            intent.putExtra(s4, array);
            intent.putExtra(s3, array);
            intent.putExtra(s2, str);
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
            final Intent intent2 = new Intent(s5);
            intent2.putExtra(s4, array);
            intent2.putExtra(s3, array);
            intent2.putExtra(s2, str);
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
    
    public void dialogCopyRight() {
        try {
            final Dialog dialog = new Dialog((Context)this);
            try {
                this.dialog = dialog;
                final int cancelable = 1;
                dialog.setCancelable((boolean)(cancelable != 0));
                this.dialog.requestWindowFeature(cancelable);
                final Dialog dialog2 = this.dialog;
                try {
                    dialog2.getWindow().setLayout(-1, -2);
                    final Dialog dialog3 = this.dialog;
                    try {
                        final Window window = dialog3.getWindow();
                        try {
                            final ColorDrawable backgroundDrawable = new ColorDrawable(0);
                            final Window window2 = window;
                            try {
                                window2.setBackgroundDrawable((Drawable)backgroundDrawable);
                                final LayoutInflater from = LayoutInflater.from((Context)this);
                                try {
                                    final View inflate = from.inflate(R$layout.layout_dialog_copyright, (ViewGroup)null);
                                    try {
                                        this.dialog.setContentView(inflate);
                                        final View viewById = inflate.findViewById(R$id.dialog_title);
                                        try {
                                            final TextCustumFontBold textCustumFontBold = (TextCustumFontBold)viewById;
                                            try {
                                                final View viewById2 = inflate.findViewById(R$id.tv_msj);
                                                try {
                                                    final TextCustumFont textCustumFont = (TextCustumFont)viewById2;
                                                    try {
                                                        final View viewById3 = inflate.findViewById(R$id.dialog_no);
                                                        try {
                                                            final SeettingActivity$16 onClickListener = new SeettingActivity$16(this);
                                                            final View view = viewById3;
                                                            try {
                                                                view.setOnClickListener((View$OnClickListener)onClickListener);
                                                                if (LocaleHelper.getLanguage((Context)this).equals("ar")) {
                                                                    textCustumFontBold.setText((CharSequence)"\u062a\u0646\u0628\u064a\u0647 \u062d\u0642\u0648\u0642 \u0627\u0644\u0627\u0633\u062a\u062e\u062f\u0627\u0645 \u26a0\ufe0f");
                                                                    textCustumFont.setText((CharSequence)"\u0628\u0639\u0636 \u062a\u0633\u062c\u064a\u0644\u0627\u062a \u062a\u0644\u0627\u0648\u0627\u062a \u0627\u0644\u0642\u0631\u0651\u0627\u0621 \u0645\u062d\u0645\u064a\u0629 \u0628\u062d\u0642\u0648\u0642 \u0627\u0644\u0646\u0634\u0631\u060c \u0648\u0647\u064a \u0645\u062e\u0635\u0651\u0635\u0629 \u0644\u0644\u0627\u0633\u062a\u062e\u062f\u0627\u0645 \u0627\u0644\u0634\u062e\u0635\u064a \u0641\u0642\u0637.\n\n\u0642\u062f \u062a\u0633\u0645\u062d \u0628\u0639\u0636 \u0627\u0644\u0645\u0646\u0635\u0627\u062a \u0628\u0627\u0633\u062a\u062e\u062f\u0627\u0645 \u0647\u0630\u0647 \u0627\u0644\u0623\u0635\u0648\u0627\u062a \u062f\u0648\u0646 \u0645\u0634\u0627\u0643\u0644\u060c \u0644\u0643\u0646 \u0630\u0644\u0643 \u0644\u0627 \u064a\u064f\u0639\u062f\u0651 \u062a\u0635\u0631\u064a\u062d\u064b\u0627 \u0628\u0627\u0644\u0646\u0634\u0631 \u0623\u0648 \u0627\u0644\u0627\u0633\u062a\u062e\u062f\u0627\u0645 \u0627\u0644\u062a\u062c\u0627\u0631\u064a.\n\n\u0644\u0644\u0646\u0634\u0631 \u0627\u0644\u0622\u0645\u0646\u060c \u064a\u064f\u0631\u062c\u0649 \u0627\u062e\u062a\u064a\u0627\u0631 \u0642\u0627\u0631\u0626 \u0645\u0630\u0643\u0648\u0631 \u0639\u0644\u0649 \u0623\u0646\u0647 \u0645\u0633\u0645\u0648\u062d \u0628\u0627\u0644\u0646\u0634\u0631 \u0623\u0648 \u0627\u0633\u062a\u062e\u062f\u0627\u0645 \u0635\u0648\u062a\u0643 \u0627\u0644\u062e\u0627\u0635.\n\n\u0627\u0644\u0645\u0633\u062a\u062e\u062f\u0645 \u0645\u0633\u0624\u0648\u0644 \u0628\u0627\u0644\u0643\u0627\u0645\u0644 \u0639\u0646 \u0627\u0644\u0627\u0644\u062a\u0632\u0627\u0645 \u0628\u0633\u064a\u0627\u0633\u0627\u062a \u062d\u0642\u0648\u0642 \u0627\u0644\u0646\u0634\u0631 \u0627\u0644\u062e\u0627\u0635\u0629 \u0628\u0643\u0644 \u0645\u0646\u0635\u0629.");
                                                                }
                                                                else {
                                                                    textCustumFontBold.setText((CharSequence)"\u26a0\ufe0f Copyright Notice");
                                                                    textCustumFont.setText((CharSequence)"Some reciters\u2019 audio recordings are protected by copyright and are intended for personal use only.\n\nCertain platforms may allow these sounds without issues, but this does not constitute permission to publish or use them commercially.\n\nFor safe publishing, please select a reciter marked as allowed for publishing or use your own audio.\n\nThe user is solely responsible for complying with the copyright policies of each platform.");
                                                                }
                                                                final Dialog dialog4 = this.dialog;
                                                                try {
                                                                    dialog4.show();
                                                                }
                                                                catch (final Exception ex) {
                                                                    ex.printStackTrace();
                                                                }
                                                            }
                                                            catch (final Exception ex2) {}
                                                        }
                                                        catch (final Exception ex3) {}
                                                    }
                                                    catch (final Exception ex4) {}
                                                }
                                                catch (final Exception ex5) {}
                                            }
                                            catch (final Exception ex6) {}
                                        }
                                        catch (final Exception ex7) {}
                                    }
                                    catch (final Exception ex8) {}
                                }
                                catch (final Exception ex9) {}
                            }
                            catch (final Exception ex10) {}
                        }
                        catch (final Exception ex11) {}
                    }
                    catch (final Exception ex12) {}
                }
                catch (final Exception ex13) {}
            }
            catch (final Exception ex14) {}
        }
        catch (final Exception ex15) {}
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_seetting);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        WindowCompat.setDecorFitsSystemWindows(this.getWindow(), true);
        final int n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new SeettingActivity$$ExternalSyntheticLambda0());
        final Resources resources = this.getResources();
        this.mResources = resources;
        if (resources == null) {
            this.finish();
        }
        this.init();
    }
    
    protected void onPause() {
        this.cancelDialog();
        super.onPause();
    }
    
    public void onPurchasesUpdated(final BillingResult billingResult, final List list) {
    }
    
    protected void onResume() {
        super.onResume();
        if (BillingPreferences.isSubscribed((Context)this)) {
            this.setPro();
        }
        else {
            this.findViewById(R$id.btn_restore).setOnClickListener((View$OnClickListener)new SeettingActivity$2(this));
        }
    }
}
