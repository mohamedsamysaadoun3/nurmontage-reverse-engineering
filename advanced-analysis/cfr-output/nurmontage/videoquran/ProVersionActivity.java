/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.TextView
 *  android.widget.Toast
 *  androidx.activity.ComponentActivity
 *  androidx.activity.EdgeToEdge
 *  androidx.activity.OnBackPressedCallback
 *  androidx.core.content.ContextCompat
 *  androidx.core.graphics.Insets
 *  androidx.core.view.OnApplyWindowInsetsListener
 *  androidx.core.view.ViewCompat
 *  androidx.core.view.WindowCompat
 *  androidx.core.view.WindowInsetsCompat
 *  androidx.core.view.WindowInsetsCompat$Type
 *  androidx.fragment.app.Fragment
 *  androidx.lifecycle.LifecycleOwner
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  com.android.billingclient.api.AcknowledgePurchaseParams
 *  com.android.billingclient.api.AcknowledgePurchaseParams$Builder
 *  com.android.billingclient.api.AcknowledgePurchaseResponseListener
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingClientStateListener
 *  com.android.billingclient.api.BillingFlowParams
 *  com.android.billingclient.api.BillingFlowParams$ProductDetailsParams
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.ProductDetails
 *  com.android.billingclient.api.ProductDetails$PricingPhase
 *  com.android.billingclient.api.ProductDetails$SubscriptionOfferDetails
 *  com.android.billingclient.api.ProductDetailsResponseListener
 *  com.android.billingclient.api.Purchase
 *  com.android.billingclient.api.PurchasesResponseListener
 *  com.android.billingclient.api.PurchasesUpdatedListener
 *  com.android.billingclient.api.QueryProductDetailsParams
 *  com.android.billingclient.api.QueryProductDetailsParams$Product
 *  com.android.billingclient.api.QueryProductDetailsParams$Product$Builder
 *  com.android.billingclient.api.QueryPurchasesParams
 *  com.google.android.material.card.MaterialCardView
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
 *  com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
 *  nl.dionsegijn.konfetti.core.Party
 *  nl.dionsegijn.konfetti.core.PartyFactory
 *  nl.dionsegijn.konfetti.core.Position
 *  nl.dionsegijn.konfetti.core.Position$Relative
 *  nl.dionsegijn.konfetti.core.emitter.Emitter
 *  nl.dionsegijn.konfetti.core.emitter.EmitterConfig
 *  nl.dionsegijn.konfetti.xml.KonfettiView
 *  nl.dionsegijn.konfetti.xml.image.ImageUtil
 */
package hazem.nurmontage.videoquran;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.google.android.material.card.MaterialCardView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.ProVersionActivity$$ExternalSyntheticBackport0;
import hazem.nurmontage.videoquran.ProVersionActivity$$ExternalSyntheticLambda2;
import hazem.nurmontage.videoquran.ProVersionActivity$$ExternalSyntheticLambda3;
import hazem.nurmontage.videoquran.ProVersionActivity$$ExternalSyntheticLambda4;
import hazem.nurmontage.videoquran.ProVersionActivity$$ExternalSyntheticLambda5;
import hazem.nurmontage.videoquran.ProVersionActivity$$ExternalSyntheticLambda6;
import hazem.nurmontage.videoquran.ProVersionActivity$1;
import hazem.nurmontage.videoquran.ProVersionActivity$10;
import hazem.nurmontage.videoquran.ProVersionActivity$11;
import hazem.nurmontage.videoquran.ProVersionActivity$12;
import hazem.nurmontage.videoquran.ProVersionActivity$13;
import hazem.nurmontage.videoquran.ProVersionActivity$14;
import hazem.nurmontage.videoquran.ProVersionActivity$16;
import hazem.nurmontage.videoquran.ProVersionActivity$17;
import hazem.nurmontage.videoquran.ProVersionActivity$18;
import hazem.nurmontage.videoquran.ProVersionActivity$19;
import hazem.nurmontage.videoquran.ProVersionActivity$2;
import hazem.nurmontage.videoquran.ProVersionActivity$20;
import hazem.nurmontage.videoquran.ProVersionActivity$3;
import hazem.nurmontage.videoquran.ProVersionActivity$4;
import hazem.nurmontage.videoquran.ProVersionActivity$5;
import hazem.nurmontage.videoquran.ProVersionActivity$6;
import hazem.nurmontage.videoquran.ProVersionActivity$7;
import hazem.nurmontage.videoquran.ProVersionActivity$8;
import hazem.nurmontage.videoquran.ProVersionActivity$9;
import hazem.nurmontage.videoquran.R$array;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.NetworkUtils;
import hazem.nurmontage.videoquran.adabter.FeaturesAdabter;
import hazem.nurmontage.videoquran.fragment.ProgressViewFragment;
import hazem.nurmontage.videoquran.model.ModelFeatures;
import hazem.nurmontage.videoquran.model.Template;
import hazem.nurmontage.videoquran.views.ButtonCustumFontBilling;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import nl.dionsegijn.konfetti.core.Party;
import nl.dionsegijn.konfetti.core.PartyFactory;
import nl.dionsegijn.konfetti.core.Position;
import nl.dionsegijn.konfetti.core.emitter.Emitter;
import nl.dionsegijn.konfetti.core.emitter.EmitterConfig;
import nl.dionsegijn.konfetti.xml.KonfettiView;
import nl.dionsegijn.konfetti.xml.image.ImageUtil;

public class ProVersionActivity
extends Base
implements PurchasesUpdatedListener {
    private static String PRODUCT_ID_FOREIVER = "sku.nurmontage.foreiver";
    private static String PRODUCT_ID_MONTH = "sku.nurmontage.month";
    private static String PRODUCT_ID_YEAR = "sku.nurmontage.year";
    private static final String VIDEO_ID = "DY76bAh7i3M";
    private final Handler autoScrollHandler;
    private final Runnable autoScrollRunnable;
    private BillingClient billingClient;
    private ButtonCustumFontBilling btnContinue;
    private MaterialCardView btn_foreiver;
    private Button btn_restore;
    private MaterialCardView btn_year;
    private final int color_select;
    private Dialog dialog;
    private FeaturesAdabter featuresAdabter;
    boolean hasPurchasedForever;
    private boolean isBtnRestore;
    private boolean isClick;
    private boolean isUserScrolling;
    private ImageView ivForeiver;
    private ImageView ivYear;
    private Resources mResources;
    private Template mTemplate;
    private final OnBackPressedCallback onBackPressedCallback;
    private Map productDetailsMap;
    private String product_id_current;
    private RecyclerView recyclerView;
    private TextCustumFont tvByMonth;
    private TextCustumFont tvNoCommitmentAr;
    private TextCustumFont tvNoCommitmentEn;
    private TextView tv_best;
    private TextCustumFontBold tv_price_foreiver;
    private TextCustumFontBold tv_price_year;
    private YouTubePlayer youTubePlayer;
    private YouTubePlayerView youTubePlayerView;

    static /* bridge */ /* synthetic */ Handler cfr_renamed_82(ProVersionActivity proVersionActivity) {
        return proVersionActivity.autoScrollHandler;
    }

    static /* bridge */ /* synthetic */ BillingClient cfr_renamed_59(ProVersionActivity proVersionActivity) {
        return proVersionActivity.billingClient;
    }

    static /* bridge */ /* synthetic */ MaterialCardView cfr_renamed_83(ProVersionActivity proVersionActivity) {
        return proVersionActivity.btn_foreiver;
    }

    static /* bridge */ /* synthetic */ MaterialCardView cfr_renamed_84(ProVersionActivity proVersionActivity) {
        return proVersionActivity.btn_year;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_85(ProVersionActivity proVersionActivity) {
        return proVersionActivity.isBtnRestore;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_86(ProVersionActivity proVersionActivity) {
        return proVersionActivity.isClick;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_87(ProVersionActivity proVersionActivity) {
        return proVersionActivity.isUserScrolling;
    }

    static /* bridge */ /* synthetic */ ImageView cfr_renamed_88(ProVersionActivity proVersionActivity) {
        return proVersionActivity.ivForeiver;
    }

    static /* bridge */ /* synthetic */ ImageView cfr_renamed_89(ProVersionActivity proVersionActivity) {
        return proVersionActivity.ivYear;
    }

    static /* bridge */ /* synthetic */ Resources cfr_renamed_90(ProVersionActivity proVersionActivity) {
        return proVersionActivity.mResources;
    }

    static /* bridge */ /* synthetic */ Template cfr_renamed_2(ProVersionActivity proVersionActivity) {
        return proVersionActivity.mTemplate;
    }

    static /* bridge */ /* synthetic */ OnBackPressedCallback cfr_renamed_91(ProVersionActivity proVersionActivity) {
        return proVersionActivity.onBackPressedCallback;
    }

    static /* bridge */ /* synthetic */ Map cfr_renamed_57(ProVersionActivity proVersionActivity) {
        return proVersionActivity.productDetailsMap;
    }

    static /* bridge */ /* synthetic */ String cfr_renamed_92(ProVersionActivity proVersionActivity) {
        return proVersionActivity.product_id_current;
    }

    static /* bridge */ /* synthetic */ RecyclerView cfr_renamed_93(ProVersionActivity proVersionActivity) {
        return proVersionActivity.recyclerView;
    }

    static /* bridge */ /* synthetic */ TextView cfr_renamed_94(ProVersionActivity proVersionActivity) {
        return proVersionActivity.tv_best;
    }

    static /* bridge */ /* synthetic */ TextCustumFontBold cfr_renamed_95(ProVersionActivity proVersionActivity) {
        return proVersionActivity.tv_price_foreiver;
    }

    static /* bridge */ /* synthetic */ TextCustumFontBold cfr_renamed_96(ProVersionActivity proVersionActivity) {
        return proVersionActivity.tv_price_year;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_58(ProVersionActivity proVersionActivity, boolean bl) {
        proVersionActivity.isBtnRestore = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_97(ProVersionActivity proVersionActivity, boolean bl) {
        proVersionActivity.isClick = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_98(ProVersionActivity proVersionActivity, boolean bl) {
        proVersionActivity.isUserScrolling = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_99(ProVersionActivity proVersionActivity, String string2) {
        proVersionActivity.product_id_current = string2;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_36(ProVersionActivity proVersionActivity) {
        proVersionActivity.cancelDialog();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_9(ProVersionActivity proVersionActivity) {
        proVersionActivity.checkInAppPurchases();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_61(ProVersionActivity proVersionActivity) {
        proVersionActivity.checkUserSubscriptionStatus();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_8(ProVersionActivity proVersionActivity, List list) {
        proVersionActivity.handleSubscriptionPurchases(list);
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_13(ProVersionActivity proVersionActivity) {
        proVersionActivity.hideProgressFragment();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_100(ProVersionActivity proVersionActivity, boolean bl) {
        proVersionActivity.initBtnHelp(bl);
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_101(ProVersionActivity proVersionActivity, ProductDetails productDetails) {
        proVersionActivity.launchPurchaseFlowINAPP(productDetails);
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_102(ProVersionActivity proVersionActivity, ProductDetails productDetails) {
        proVersionActivity.launchPurchaseFlowSUB(productDetails);
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_103(ProVersionActivity proVersionActivity) {
        proVersionActivity.queryPurchases();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_104(ProVersionActivity proVersionActivity) {
        proVersionActivity.querySubscribe();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_60(ProVersionActivity proVersionActivity) {
        proVersionActivity.showProgress();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_105(ProVersionActivity proVersionActivity) {
        proVersionActivity.startAutoScroll();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_62(ProVersionActivity proVersionActivity) {
        proVersionActivity.startBillingConnection();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_67(ProVersionActivity proVersionActivity) {
        proVersionActivity.toTrackAct();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_56(ProVersionActivity proVersionActivity, ProductDetails productDetails) {
        proVersionActivity.updateUI(productDetails);
    }

    static /* bridge */ /* synthetic */ String cfr_renamed_106() {
        return PRODUCT_ID_FOREIVER;
    }

    static /* bridge */ /* synthetic */ String cfr_renamed_107() {
        return PRODUCT_ID_MONTH;
    }

    static /* bridge */ /* synthetic */ String cfr_renamed_108() {
        return PRODUCT_ID_YEAR;
    }

    public ProVersionActivity() {
        this.color_select = -1;
        Object object = new ProVersionActivity$1(this, true);
        this.onBackPressedCallback = object;
        this.productDetailsMap = object;
        object = PRODUCT_ID_YEAR;
        this.product_id_current = object;
        Looper looper = Looper.getMainLooper();
        super(looper);
        this.autoScrollHandler = object;
        this.isUserScrolling = false;
        super(this);
        this.autoScrollRunnable = object;
    }

    private void cancelDialog() {
        Dialog dialog = this.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.dialog = null;
    }

    private void checkInAppPurchases() {
        QueryPurchasesParams queryPurchasesParams = QueryPurchasesParams.newBuilder().setProductType("inapp").build();
        BillingClient billingClient = this.billingClient;
        ProVersionActivity$$ExternalSyntheticLambda5 proVersionActivity$$ExternalSyntheticLambda5 = new ProVersionActivity$$ExternalSyntheticLambda5(this);
        billingClient.queryPurchasesAsync(queryPurchasesParams, (PurchasesResponseListener)proVersionActivity$$ExternalSyntheticLambda5);
    }

    private void checkUserSubscriptionStatus() {
        QueryPurchasesParams queryPurchasesParams = QueryPurchasesParams.newBuilder().setProductType("subs").build();
        BillingClient billingClient = this.billingClient;
        ProVersionActivity$17 proVersionActivity$17 = new ProVersionActivity$17(this);
        billingClient.queryPurchasesAsync(queryPurchasesParams, (PurchasesResponseListener)proVersionActivity$17);
    }

    private String findOfferToken(ProductDetails object) {
        boolean bl;
        if ((object = object.getSubscriptionOfferDetails()) != null && !(bl = object.isEmpty())) {
            return ((ProductDetails.SubscriptionOfferDetails)object.get(0)).getOfferToken();
        }
        return null;
    }

    private String formatPriceWithSymbol(long l, String object) {
        double d = (double)l / 1000000.0;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        object = Currency.getInstance((String)object);
        numberFormat.setCurrency((Currency)object);
        int n = 2;
        numberFormat.setMaximumFractionDigits(n);
        numberFormat.setMinimumFractionDigits(n);
        return numberFormat.format(d);
    }

    private void handleNoPurchases() {
        ProVersionActivity$19 proVersionActivity$19 = new ProVersionActivity$19(this);
        this.runOnUiThread(proVersionActivity$19);
        BillingPreferences.saveSubscriptionStatus(this.getApplicationContext(), false);
    }

    private void handlePurchase(Purchase object) {
        int n;
        int n2 = object.getPurchaseState();
        if (n2 == (n = 1)) {
            n2 = object.isAcknowledged() ? 1 : 0;
            if (!n2) {
                AcknowledgePurchaseParams.Builder builder = AcknowledgePurchaseParams.newBuilder();
                object = object.getPurchaseToken();
                object = builder.setPurchaseToken((String)object).build();
                builder = this.billingClient;
                ProVersionActivity$$ExternalSyntheticLambda6 proVersionActivity$$ExternalSyntheticLambda6 = new ProVersionActivity$$ExternalSyntheticLambda6();
                builder.acknowledgePurchase((AcknowledgePurchaseParams)object, (AcknowledgePurchaseResponseListener)proVersionActivity$$ExternalSyntheticLambda6);
                object = this.getApplicationContext();
                BillingPreferences.saveSubscriptionStatus((Context)object, n != 0);
                this.playVibration();
                this.thnks();
            }
        } else {
            int n3 = object.getPurchaseState();
            if (n3 == (n2 = 2)) {
                object = new ProVersionActivity$12(this);
                this.runOnUiThread((Runnable)object);
            } else {
                object = new ProVersionActivity$13(this);
                this.runOnUiThread((Runnable)object);
            }
        }
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
                this.hideProgressFragment();
                object = this.getApplicationContext();
                BillingPreferences.saveSubscriptionStatus((Context)object, n2 != 0);
                this.thnks();
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

    /*
     * Unable to fully structure code
     */
    private void hideProgressFragment() {
        block10: {
            var1_1 = 0;
            var2_2 = null;
            try {
                this.isClick = false;
                var1_1 = this.isFinishing();
                if (var1_1 != 0) break block10;
            }
            catch (Exception v0) {
                ** continue;
            }
            var2_2 = this.getSupportFragmentManager();
            var1_1 = (int)var2_2.isDestroyed();
            if (var1_1 != 0) break block10;
            var2_2 = this.getSupportFragmentManager();
            var3_3 = var2_2.beginTransaction();
            var4_4 = R$id.container_progress;
            var2_2 = var2_2.findFragmentById(var4_4);
            if (var2_2 == null) ** GOTO lbl26
            var3_3.remove((Fragment)var2_2);
lbl26:
            // 2 sources

            var3_3.commit();
        }
lbl29:
        // 2 sources

        while (true) {
            var1_1 = R$id.container_progress;
            this.findViewById(var1_1).setVisibility(8);
            return;
        }
    }

    private void initBtnHelp(boolean bl) {
        int n = R$id.layout_help;
        this.findViewById(n).setVisibility(0);
        Object object = Typeface.createFromAsset((AssetManager)this.getResources().getAssets(), (String)"fonts/ReadexPro_Medium.ttf");
        int n2 = R$id.btn_help;
        Button button = (Button)this.findViewById(n2);
        button.setTypeface(object);
        object = new ProVersionActivity$8(this);
        button.setOnClickListener((View.OnClickListener)object);
    }

    private void initImgFeatures() {
        int n = R$id.rv;
        RecyclerView recyclerView = (RecyclerView)this.findViewById(n);
        Object object = new LinearLayoutManager((Context)this);
        recyclerView.setLayoutManager((RecyclerView.LayoutManager)object);
        object = null;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(false);
        recyclerView.setItemAnimator(null);
        ArrayList<ModelFeatures> arrayList = new ArrayList<ModelFeatures>();
        String[] stringArray = this.mResources;
        int n2 = R$array.feature_list;
        stringArray = stringArray.getStringArray(n2);
        for (int i = 0; i < (n2 = stringArray.length); ++i) {
            String string2 = stringArray[i];
            ModelFeatures modelFeatures = new ModelFeatures(string2);
            arrayList.add(modelFeatures);
        }
        object = new FeaturesAdabter(arrayList);
        this.featuresAdabter = object;
        recyclerView.setAdapter((RecyclerView.Adapter)object);
    }

    private boolean isGmailAvailable(Context context) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.setPackage("com.google.android.gm");
        return context.getPackageManager().queryIntentActivities(intent, 0).isEmpty() ^ true;
    }

    static /* synthetic */ void lambda$handlePurchase$3(BillingResult object) {
        int n = object.getResponseCode();
        String string2 = "Billing";
        if (n == 0) {
            object = new StringBuilder();
            String string3 = PRODUCT_ID_FOREIVER;
            object = ((StringBuilder)object).append(string3);
            string3 = " acknowledged.";
            object = ((StringBuilder)object).append(string3).toString();
            Log.e((String)string2, (String)object);
        } else {
            StringBuilder stringBuilder = new StringBuilder("Failed to acknowledge ");
            String string4 = PRODUCT_ID_FOREIVER;
            stringBuilder = stringBuilder.append(string4);
            string4 = ": ";
            stringBuilder = stringBuilder.append(string4);
            object = object.getDebugMessage();
            object = stringBuilder.append((String)object).toString();
            Log.e((String)string2, (String)object);
        }
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

    private void launchPurchaseFlowINAPP(ProductDetails productDetails) {
        ArrayList<ProductDetails> arrayList = new ArrayList<ProductDetails>();
        productDetails = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).build();
        arrayList.add(productDetails);
        productDetails = BillingFlowParams.newBuilder().setProductDetailsParamsList(arrayList).build();
        this.billingClient.launchBillingFlow((Activity)this, (BillingFlowParams)productDetails);
    }

    private void launchPurchaseFlowSUB(ProductDetails productDetails) {
        String string2 = this.findOfferToken(productDetails);
        if (string2 == null) {
            return;
        }
        ArrayList<ProductDetails> arrayList = new ArrayList<ProductDetails>();
        productDetails = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).setOfferToken(string2).build();
        arrayList.add(productDetails);
        productDetails = BillingFlowParams.newBuilder().setProductDetailsParamsList(arrayList).build();
        this.billingClient.launchBillingFlow((Activity)this, (BillingFlowParams)productDetails);
    }

    private void playVibration() {
        ProVersionActivity$20 proVersionActivity$20 = new ProVersionActivity$20(this);
        this.runOnUiThread(proVersionActivity$20);
    }

    private void queryProducts() {
        QueryProductDetailsParams queryProductDetailsParams = new ArrayList();
        QueryProductDetailsParams.Product.Builder builder = QueryProductDetailsParams.Product.newBuilder();
        Object object = PRODUCT_ID_FOREIVER;
        builder = builder.setProductId((String)object).setProductType("inapp").build();
        queryProductDetailsParams.add(builder);
        queryProductDetailsParams = QueryProductDetailsParams.newBuilder().setProductList(queryProductDetailsParams).build();
        builder = this.billingClient;
        object = new ProVersionActivity$10(this);
        builder.queryProductDetailsAsync(queryProductDetailsParams, (ProductDetailsResponseListener)object);
    }

    private void queryPurchases() {
        QueryPurchasesParams queryPurchasesParams = QueryPurchasesParams.newBuilder().setProductType("inapp").build();
        BillingClient billingClient = this.billingClient;
        ProVersionActivity$$ExternalSyntheticLambda4 proVersionActivity$$ExternalSyntheticLambda4 = new ProVersionActivity$$ExternalSyntheticLambda4(this);
        billingClient.queryPurchasesAsync(queryPurchasesParams, (PurchasesResponseListener)proVersionActivity$$ExternalSyntheticLambda4);
    }

    private void querySubscribe() {
        QueryProductDetailsParams queryProductDetailsParams = new ArrayList();
        QueryProductDetailsParams.Product.Builder builder = QueryProductDetailsParams.Product.newBuilder();
        Object object = PRODUCT_ID_YEAR;
        builder = builder.setProductId((String)object);
        object = "subs";
        builder = builder.setProductType((String)object).build();
        queryProductDetailsParams.add(builder);
        builder = QueryProductDetailsParams.Product.newBuilder();
        String string2 = PRODUCT_ID_MONTH;
        builder = builder.setProductId(string2).setProductType((String)object).build();
        queryProductDetailsParams.add(builder);
        queryProductDetailsParams = QueryProductDetailsParams.newBuilder().setProductList(queryProductDetailsParams).build();
        builder = this.billingClient;
        object = new ProVersionActivity$11(this);
        builder.queryProductDetailsAsync(queryProductDetailsParams, (ProductDetailsResponseListener)object);
    }

    private void queryUserPurchases() {
        QueryPurchasesParams queryPurchasesParams = QueryPurchasesParams.newBuilder().setProductType("inapp").build();
        BillingClient billingClient = this.billingClient;
        ProVersionActivity$$ExternalSyntheticLambda2 proVersionActivity$$ExternalSyntheticLambda2 = new ProVersionActivity$$ExternalSyntheticLambda2(this);
        billingClient.queryPurchasesAsync(queryPurchasesParams, (PurchasesResponseListener)proVersionActivity$$ExternalSyntheticLambda2);
    }

    private void setupImg() {
        RecyclerView recyclerView;
        int n = R$id.rv_img;
        this.recyclerView = recyclerView = (RecyclerView)this.findViewById(n);
        ProVersionActivity$16 proVersionActivity$16 = new ProVersionActivity$16(this);
        recyclerView.post((Runnable)proVersionActivity$16);
    }

    private void showFeatures() {
        Dialog dialog = new Dialog((Context)this);
        this.dialog = dialog;
        int n = 1;
        dialog.setCancelable(n != 0);
        dialog = this.dialog;
        dialog.requestWindowFeature(n);
        dialog = this.dialog;
        dialog = dialog.getWindow();
        n = -1;
        int n2 = -2;
        dialog.setLayout(n, n2);
        dialog = this.dialog;
        dialog = dialog.getWindow();
        n2 = 0;
        Object object = new ColorDrawable(0);
        dialog.setBackgroundDrawable((Drawable)object);
        dialog = LayoutInflater.from((Context)this);
        n = R$layout.layout_dialog_premuim;
        n2 = 0;
        dialog = dialog.inflate(n, null);
        object = this.dialog;
        object.setContentView((View)dialog);
        n = R$id.dialog_title;
        object = dialog.findViewById(n);
        n2 = 8;
        object.setVisibility(n2);
        n = R$id.dialog_no;
        dialog = dialog.findViewById(n);
        object = new ProVersionActivity$7(this);
        dialog.setOnClickListener((View.OnClickListener)object);
        dialog = this.dialog;
        try {
            dialog.show();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void showProgress() {
        int n = R$id.container_progress;
        View view = this.findViewById(n);
        int n2 = 0;
        view.setVisibility(0);
        n = this.isFinishing() ? 1 : 0;
        if (n == 0 && (n = (int)((view = this.getSupportFragmentManager()).isDestroyed() ? 1 : 0)) == 0) {
            view = this.getSupportFragmentManager().beginTransaction();
            n2 = R$id.container_progress;
            ProgressViewFragment progressViewFragment = ProgressViewFragment.getInstance();
            view.replace(n2, (Fragment)progressViewFragment);
            view.commit();
        }
    }

    private void startAutoScroll() {
        Handler handler = this.autoScrollHandler;
        Runnable runnable = this.autoScrollRunnable;
        handler.removeCallbacks(runnable);
        handler = this.autoScrollHandler;
        runnable = this.autoScrollRunnable;
        long l = 250L;
        try {
            handler.postDelayed(runnable, l);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void startBillingConnection() {
        BillingClient billingClient = this.billingClient;
        ProVersionActivity$9 proVersionActivity$9 = new ProVersionActivity$9(this);
        billingClient.startConnection((BillingClientStateListener)proVersionActivity$9);
    }

    private void stopAutoScroll() {
        Runnable runnable;
        Handler handler = this.autoScrollHandler;
        if (handler != null && (runnable = this.autoScrollRunnable) != null) {
            handler.removeCallbacks(runnable);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void thnks() {
        ProVersionActivity$14 proVersionActivity$14;
        try {
            proVersionActivity$14 = new ProVersionActivity$14(this);
        }
        catch (Exception exception) {
            return;
        }
        this.runOnUiThread(proVersionActivity$14);
    }

    private void toTrackAct() {
        Intent intent = new Intent((Context)this, EngineActivity.class);
        Object object = this.mTemplate;
        if (object != null) {
            String string2 = "template";
            object = ((Template)object).getIdTemplate();
            intent.putExtra(string2, (String)object);
        }
        intent.addFlags(65536);
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
    }

    private void updateUI(ProductDetails object) {
        String string2;
        Object object2 = object.getProductType();
        boolean bl = ((String)object2).equals(string2 = "inapp");
        if (bl) {
            if ((object = object.getOneTimePurchaseOfferDetails()) != null) {
                long l = object.getPriceAmountMicros();
                object = object.getPriceCurrencyCode();
                object = this.formatPriceWithSymbol(l, (String)object);
                object2 = this.tv_price_foreiver;
                object2.setText((CharSequence)object);
            } else {
                object = this.tv_price_foreiver;
                object2 = "N/A";
                object.setText((CharSequence)object2);
            }
        } else {
            object2 = object.getProductType();
            bl = ((String)object2).equals(string2 = "subs");
            if (bl) {
                object2 = object.getSubscriptionOfferDetails();
                boolean bl2 = false;
                string2 = null;
                object2 = (ProductDetails.PricingPhase)((ProductDetails.SubscriptionOfferDetails)object2.get(0)).getPricingPhases().getPricingPhaseList().get(0);
                long l = object2.getPriceAmountMicros();
                object2 = object2.getPriceCurrencyCode();
                Object object3 = PRODUCT_ID_YEAR;
                boolean bl3 = object3.equals(object = object.getProductId());
                if (bl3) {
                    object = this.formatPriceWithSymbol(l, (String)object2);
                    object3 = this.tv_price_year;
                    object3.setText((CharSequence)object);
                    double d = l;
                    double d2 = 12.0;
                    l = Math.round(d /= d2);
                    object = this.formatPriceWithSymbol(l, (String)object2);
                    object2 = new StringBuilder();
                    string2 = LocaleHelper.getLanguage(this.getApplicationContext());
                    String string3 = "ar";
                    bl2 = string2.equals(string3);
                    if (bl2) {
                        object = ((StringBuilder)object2).append("\u0641\u0642\u0637 ").append((String)object);
                        string2 = " /\u0634\u0647\u0631";
                        object.append(string2);
                    } else {
                        object = ((StringBuilder)object2).append("Only ").append((String)object);
                        string2 = " /month";
                        object.append(string2);
                    }
                    object = this.tvByMonth;
                    object.setText((CharSequence)object2);
                } else {
                    object3 = PRODUCT_ID_MONTH;
                    boolean bl4 = object3.equals(object);
                    if (bl4) {
                        object = this.formatPriceWithSymbol(l, (String)object2);
                        object2 = this.tv_price_foreiver;
                        object2.setText((CharSequence)object);
                    }
                }
            }
        }
    }

    private void updateUILast(ProductDetails object) {
        Object object2 = object.getProductType();
        boolean bl = ((String)object2).equals("inapp");
        String string2 = "N/A";
        String string3 = null;
        if (bl) {
            object2 = object.getOneTimePurchaseOfferDetails();
            if (object2 != null) {
                object = object.getOneTimePurchaseOfferDetails();
                string3 = object.getFormattedPrice();
            }
            object = this.tv_price_foreiver;
            if (string3 != null) {
                string2 = string3;
            }
            object.setText((CharSequence)string2);
        } else {
            String string4;
            object2 = object.getProductType();
            bl = ((String)object2).equals(string4 = "subs");
            if (bl) {
                boolean bl2;
                object2 = object.getSubscriptionOfferDetails();
                if (object2 != null && !(bl = (object2 = object.getSubscriptionOfferDetails()).isEmpty())) {
                    boolean bl3;
                    object2 = object.getSubscriptionOfferDetails();
                    string4 = null;
                    Object object3 = (object2 = (ProductDetails.SubscriptionOfferDetails)object2.get(0)).getPricingPhases();
                    if (object3 != null && !(bl3 = (object3 = object2.getPricingPhases().getPricingPhaseList()).isEmpty())) {
                        object2 = (ProductDetails.PricingPhase)object2.getPricingPhases().getPricingPhaseList().get(0);
                        string3 = object2.getFormattedPrice();
                    }
                }
                if (bl2 = ((String)(object2 = PRODUCT_ID_YEAR)).equals(object = object.getProductId())) {
                    object = this.tv_price_year;
                    if (string3 != null) {
                        string2 = string3;
                    }
                    object.setText((CharSequence)string2);
                }
            }
        }
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

    public void explode() {
        Integer n;
        Object object = this.getApplicationContext();
        int n2 = R$drawable.ic_heart;
        object = ContextCompat.getDrawable((Context)object, (int)n2);
        n2 = 1;
        object = ImageUtil.loadDrawable((Drawable)object, n2 != 0, n2 != 0);
        int n3 = R$id.konfettiView;
        KonfettiView konfettiView = (KonfettiView)this.findViewById(n3);
        konfettiView.setVisibility(0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Integer[] integerArray = new Emitter(3500L, timeUnit);
        integerArray = integerArray.max(300);
        Object object2 = new PartyFactory((EmitterConfig)integerArray);
        integerArray = object2.spread(360);
        object = ProVersionActivity$$ExternalSyntheticBackport0.m(object);
        object = integerArray.shapes((List)object);
        integerArray = new Integer[4];
        object2 = -1216136524;
        integerArray[0] = object2;
        integerArray[n2] = n = Integer.valueOf(-1124760279);
        Object object3 = -2019220;
        integerArray[2] = object3;
        integerArray[3] = n;
        object3 = Arrays.asList(integerArray);
        object = object.colors((List)object3).setSpeedBetween(0.0f, 30.0f);
        object3 = new Position.Relative(0.5, 0.3);
        object = object.position((Position)object3).build();
        konfettiView.start((Party)object);
    }

    /* synthetic */ void cfr_renamed_109(BillingResult object, List list) {
        int n = object.getResponseCode();
        int n2 = 1;
        if (n == 0) {
            int n3;
            n = 0;
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
            this.handleNoPurchases();
        } else {
            object = new ProVersionActivity$18(this);
            this.runOnUiThread((Runnable)object);
            object = this.getApplicationContext();
            BillingPreferences.saveSubscriptionStatus((Context)object, n2 != 0);
            this.thnks();
        }
    }

    /* synthetic */ void cfr_renamed_110(BillingResult object, List list) {
        int n = object.getResponseCode();
        if (n == 0) {
            boolean bl;
            object = list.iterator();
            while (bl = object.hasNext()) {
                list = (Purchase)object.next();
                this.handlePurchase((Purchase)list);
            }
        }
    }

    /* synthetic */ void cfr_renamed_111(BillingResult object, List object2) {
        int n;
        int n2 = object.getResponseCode();
        if (n2 == 0) {
            object = null;
            this.hasPurchasedForever = false;
            if (object2 != null) {
                object = object2.iterator();
                while ((n = object.hasNext()) != 0) {
                    String string2;
                    object2 = (Purchase)object.next();
                    List list = object2.getProducts();
                    n2 = list.contains(string2 = PRODUCT_ID_FOREIVER) ? 1 : 0;
                    if (n2 == 0 || (n = object2.getPurchaseState()) != (n2 = 1)) continue;
                    this.hasPurchasedForever = n2;
                    break;
                }
            }
        } else {
            String string3 = "Error querying INAPP purchases: ";
            object2 = new StringBuilder(string3);
            object = object.getDebugMessage();
            object = ((StringBuilder)object2).append((String)object).toString();
            object2 = "Billing";
            Log.w((String)object2, (String)object);
        }
        object = new StringBuilder("");
        n = this.hasPurchasedForever;
        object = ((StringBuilder)object).append(n != 0).toString();
        Log.e((String)"hasPurchasedForever", (String)object);
        this.checkInAppPurchases();
    }

    protected void onCreate(Bundle object) {
        int n;
        super.onCreate(object);
        EdgeToEdge.enable((ComponentActivity)this);
        int n2 = R$layout.activity_pro_version;
        this.setContentView(n2);
        n2 = -16777216;
        this.setStatusBarColor(n2);
        this.setNavigationBarColor(n2);
        object = this.getOnBackPressedDispatcher();
        Object object2 = this.onBackPressedCallback;
        object.addCallback((LifecycleOwner)this, object2);
        object = this.getWindow();
        object2 = this.getWindow().getDecorView();
        object = WindowCompat.getInsetsController((Window)object, (View)object2);
        object2 = null;
        object.setAppearanceLightStatusBars(false);
        object.setAppearanceLightNavigationBars(false);
        n2 = R$id.main;
        object = this.findViewById(n2);
        Object object3 = new ProVersionActivity$$ExternalSyntheticLambda3();
        ViewCompat.setOnApplyWindowInsetsListener((View)object, (OnApplyWindowInsetsListener)object3);
        object = this.getResources();
        this.mResources = object;
        if (object == null) {
            this.finish();
        }
        this.wakeLockAquire();
        n2 = R$id.mtittle;
        object = (TextView)this.findViewById(n2);
        object3 = this.mResources;
        int n3 = R$string.enjoy_all_premium_features;
        object3 = object3.getString(n3);
        object.setText((CharSequence)object3);
        n2 = R$id.hint_review;
        object = (TextView)this.findViewById(n2);
        object3 = this.mResources;
        n3 = R$string._4_8_434_reviews_28k_users;
        object3 = object3.getString(n3);
        object.setText((CharSequence)object3);
        object = this.getIntent();
        if (object != null) {
            object = this.getIntent();
            object3 = "template";
            if ((object = object.getStringExtra((String)object3)) != null) {
                object = (Template)LocalPersistence.readObjectFromFile((Context)this, (String)object);
                this.mTemplate = object;
            }
        }
        n2 = R$id.btn_on_back;
        object = this.findViewById(n2);
        object3 = new ProVersionActivity$2(this);
        object.setOnClickListener((View.OnClickListener)object3);
        object = this.getApplicationContext();
        n2 = BillingPreferences.isSubscribed((Context)object) ? 1 : 0;
        this.setupImg();
        if (n2 != 0) {
            this.thnks();
            return;
        }
        n2 = NetworkUtils.isNetworkAvailable((Context)this) ? 1 : 0;
        if (n2 == 0) {
            object = this.mResources;
            n = R$string.no_internet;
            object = object.getString(n);
            object = Toast.makeText((Context)this, (CharSequence)object, (int)0);
            object.show();
        }
        object = BillingClient.newBuilder((Context)this).setListener((PurchasesUpdatedListener)this).enablePendingPurchases().build();
        this.billingClient = object;
        this.startBillingConnection();
        n2 = R$id.restore;
        object = (Button)this.findViewById(n2);
        this.btn_restore = object;
        object3 = this.mResources;
        n3 = R$string.restort_subscribe;
        object3 = object3.getString(n3);
        object.setText((CharSequence)object3);
        object = this.btn_restore;
        object3 = new ProVersionActivity$3(this);
        object.setOnClickListener((View.OnClickListener)object3);
        n2 = R$id.tv_best_value;
        object = (TextView)this.findViewById(n2);
        this.tv_best = object;
        object3 = this.mResources;
        n3 = R$string.best_value;
        object3 = object3.getString(n3);
        object.setText((CharSequence)object3);
        n2 = R$id.tv_price_year;
        object = (TextCustumFontBold)this.findViewById(n2);
        this.tv_price_year = object;
        n2 = R$id.tv_price_month;
        object = (TextCustumFontBold)this.findViewById(n2);
        this.tv_price_foreiver = object;
        n2 = R$id.tv_year_bymonth;
        object = (TextCustumFont)this.findViewById(n2);
        this.tvByMonth = object;
        n2 = R$id.btn_month;
        object = (MaterialCardView)this.findViewById(n2);
        this.btn_foreiver = object;
        n2 = R$id.btn_year;
        object = (MaterialCardView)this.findViewById(n2);
        this.btn_year = object;
        n2 = R$id.btn_radio_month;
        object = (ImageView)this.findViewById(n2);
        this.ivForeiver = object;
        n2 = R$id.btn_radio_year;
        object = (ImageView)this.findViewById(n2);
        this.ivYear = object;
        object = this.btn_foreiver;
        object3 = new ProVersionActivity$4(this);
        object.setOnClickListener((View.OnClickListener)object3);
        object = this.btn_year;
        object3 = new ProVersionActivity$5(this);
        object.setOnClickListener((View.OnClickListener)object3);
        n2 = R$id.btn_continue;
        object = (ButtonCustumFontBilling)this.findViewById(n2);
        this.btnContinue = object;
        object3 = this.mResources;
        n3 = R$string.subscribe_now;
        object3 = object3.getString(n3);
        object.setText((CharSequence)object3);
        object = this.btnContinue;
        object3 = new ProVersionActivity$6(this);
        object.setOnClickListener((View.OnClickListener)object3);
        n2 = R$id.tv_hint_ar;
        object = (TextCustumFont)this.findViewById(n2);
        this.tvNoCommitmentAr = object;
        n2 = R$id.tv_hint_en;
        object = (TextCustumFont)this.findViewById(n2);
        this.tvNoCommitmentEn = object;
        object = LocaleHelper.getLanguage((Context)this);
        object3 = "ar";
        n2 = object.equals(object3) ? 1 : 0;
        if (n2 != 0) {
            this.tvNoCommitmentAr.setVisibility(0);
            object = this.tvNoCommitmentAr;
            object2 = this.mResources;
            n = R$string.no_commitment;
            object2 = object2.getString(n);
            object.setText((CharSequence)object2);
        } else {
            this.tvNoCommitmentEn.setVisibility(0);
            object = this.tvNoCommitmentEn;
            object2 = this.mResources;
            n = R$string.no_commitment;
            object2 = object2.getString(n);
            object.setText((CharSequence)object2);
        }
    }

    protected void onDestroy() {
        boolean bl;
        super.onDestroy();
        this.stopAutoScroll();
        BillingClient billingClient = this.billingClient;
        if (billingClient != null && (bl = billingClient.isReady())) {
            billingClient = this.billingClient;
            billingClient.endConnection();
        }
    }

    protected void onPause() {
        super.onPause();
        this.cancelDialog();
    }

    public void onPurchasesUpdated(BillingResult object, List list) {
        this.hideProgressFragment();
        int n = object.getResponseCode();
        if (n == 0 && list != null) {
            boolean bl;
            object = list.iterator();
            while (bl = object.hasNext()) {
                list = (Purchase)object.next();
                this.handlePurchase((Purchase)list);
            }
        } else {
            object.getResponseCode();
        }
    }
}

