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
import hazem.nurmontage.videoquran.ProVersionActivityDone$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.ProVersionActivityDone$$ExternalSyntheticLambda2;
import hazem.nurmontage.videoquran.ProVersionActivityDone$$ExternalSyntheticLambda3;
import hazem.nurmontage.videoquran.ProVersionActivityDone$$ExternalSyntheticLambda4;
import hazem.nurmontage.videoquran.ProVersionActivityDone$$ExternalSyntheticLambda5;
import hazem.nurmontage.videoquran.ProVersionActivityDone$1;
import hazem.nurmontage.videoquran.ProVersionActivityDone$11;
import hazem.nurmontage.videoquran.ProVersionActivityDone$12;
import hazem.nurmontage.videoquran.ProVersionActivityDone$13;
import hazem.nurmontage.videoquran.ProVersionActivityDone$14;
import hazem.nurmontage.videoquran.ProVersionActivityDone$15;
import hazem.nurmontage.videoquran.ProVersionActivityDone$2;
import hazem.nurmontage.videoquran.ProVersionActivityDone$3;
import hazem.nurmontage.videoquran.ProVersionActivityDone$4;
import hazem.nurmontage.videoquran.ProVersionActivityDone$5;
import hazem.nurmontage.videoquran.ProVersionActivityDone$6;
import hazem.nurmontage.videoquran.ProVersionActivityDone$7;
import hazem.nurmontage.videoquran.ProVersionActivityDone$8;
import hazem.nurmontage.videoquran.ProVersionActivityDone$9;
import hazem.nurmontage.videoquran.R$array;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
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

public class ProVersionActivityDone
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
    private int color_select = -1;
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
    private TextCustumFontBold tv_price_foreiver;
    private TextCustumFontBold tv_price_year;
    private YouTubePlayer youTubePlayer;
    private YouTubePlayerView youTubePlayerView;

    static /* bridge */ /* synthetic */ Handler cfr_renamed_82(ProVersionActivityDone proVersionActivityDone) {
        return proVersionActivityDone.autoScrollHandler;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_85(ProVersionActivityDone proVersionActivityDone) {
        return proVersionActivityDone.isBtnRestore;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_87(ProVersionActivityDone proVersionActivityDone) {
        return proVersionActivityDone.isUserScrolling;
    }

    static /* bridge */ /* synthetic */ Resources cfr_renamed_90(ProVersionActivityDone proVersionActivityDone) {
        return proVersionActivityDone.mResources;
    }

    static /* bridge */ /* synthetic */ Template cfr_renamed_2(ProVersionActivityDone proVersionActivityDone) {
        return proVersionActivityDone.mTemplate;
    }

    static /* bridge */ /* synthetic */ OnBackPressedCallback cfr_renamed_91(ProVersionActivityDone proVersionActivityDone) {
        return proVersionActivityDone.onBackPressedCallback;
    }

    static /* bridge */ /* synthetic */ Map cfr_renamed_57(ProVersionActivityDone proVersionActivityDone) {
        return proVersionActivityDone.productDetailsMap;
    }

    static /* bridge */ /* synthetic */ RecyclerView cfr_renamed_93(ProVersionActivityDone proVersionActivityDone) {
        return proVersionActivityDone.recyclerView;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_98(ProVersionActivityDone proVersionActivityDone, boolean bl) {
        proVersionActivityDone.isUserScrolling = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_36(ProVersionActivityDone proVersionActivityDone) {
        proVersionActivityDone.cancelDialog();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_9(ProVersionActivityDone proVersionActivityDone) {
        proVersionActivityDone.checkInAppPurchases();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_61(ProVersionActivityDone proVersionActivityDone) {
        proVersionActivityDone.checkUserSubscriptionStatus();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_8(ProVersionActivityDone proVersionActivityDone, List list) {
        proVersionActivityDone.handleSubscriptionPurchases(list);
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_13(ProVersionActivityDone proVersionActivityDone) {
        proVersionActivityDone.hideProgressFragment();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_103(ProVersionActivityDone proVersionActivityDone) {
        proVersionActivityDone.queryPurchases();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_104(ProVersionActivityDone proVersionActivityDone) {
        proVersionActivityDone.querySubscribe();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_105(ProVersionActivityDone proVersionActivityDone) {
        proVersionActivityDone.startAutoScroll();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_62(ProVersionActivityDone proVersionActivityDone) {
        proVersionActivityDone.startBillingConnection();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_67(ProVersionActivityDone proVersionActivityDone) {
        proVersionActivityDone.toTrackAct();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_56(ProVersionActivityDone proVersionActivityDone, ProductDetails productDetails) {
        proVersionActivityDone.updateUI(productDetails);
    }

    public ProVersionActivityDone() {
        Object object = new ProVersionActivityDone$1(this, true);
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
        ProVersionActivityDone$$ExternalSyntheticLambda3 proVersionActivityDone$$ExternalSyntheticLambda3 = new ProVersionActivityDone$$ExternalSyntheticLambda3(this);
        billingClient.queryPurchasesAsync(queryPurchasesParams, (PurchasesResponseListener)proVersionActivityDone$$ExternalSyntheticLambda3);
    }

    private void checkUserSubscriptionStatus() {
        QueryPurchasesParams queryPurchasesParams = QueryPurchasesParams.newBuilder().setProductType("subs").build();
        BillingClient billingClient = this.billingClient;
        ProVersionActivityDone$12 proVersionActivityDone$12 = new ProVersionActivityDone$12(this);
        billingClient.queryPurchasesAsync(queryPurchasesParams, (PurchasesResponseListener)proVersionActivityDone$12);
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
        ProVersionActivityDone$14 proVersionActivityDone$14 = new ProVersionActivityDone$14(this);
        this.runOnUiThread(proVersionActivityDone$14);
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
                ProVersionActivityDone$$ExternalSyntheticLambda2 proVersionActivityDone$$ExternalSyntheticLambda2 = new ProVersionActivityDone$$ExternalSyntheticLambda2();
                builder.acknowledgePurchase((AcknowledgePurchaseParams)object, (AcknowledgePurchaseResponseListener)proVersionActivityDone$$ExternalSyntheticLambda2);
                object = this.getApplicationContext();
                BillingPreferences.saveSubscriptionStatus((Context)object, n != 0);
                this.playVibration();
                this.thnks();
            }
        } else {
            int n3 = object.getPurchaseState();
            if (n3 == (n2 = 2)) {
                object = new ProVersionActivityDone$8(this);
                this.runOnUiThread((Runnable)object);
            } else {
                object = new ProVersionActivityDone$9(this);
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
        object = new ProVersionActivityDone$4(this);
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
        ProVersionActivityDone$15 proVersionActivityDone$15 = new ProVersionActivityDone$15(this);
        this.runOnUiThread(proVersionActivityDone$15);
    }

    private void queryProducts() {
        QueryProductDetailsParams queryProductDetailsParams = new ArrayList();
        QueryProductDetailsParams.Product.Builder builder = QueryProductDetailsParams.Product.newBuilder();
        Object object = PRODUCT_ID_FOREIVER;
        builder = builder.setProductId((String)object).setProductType("inapp").build();
        queryProductDetailsParams.add(builder);
        queryProductDetailsParams = QueryProductDetailsParams.newBuilder().setProductList(queryProductDetailsParams).build();
        builder = this.billingClient;
        object = new ProVersionActivityDone$6(this);
        builder.queryProductDetailsAsync(queryProductDetailsParams, (ProductDetailsResponseListener)object);
    }

    private void queryPurchases() {
        QueryPurchasesParams queryPurchasesParams = QueryPurchasesParams.newBuilder().setProductType("inapp").build();
        BillingClient billingClient = this.billingClient;
        ProVersionActivityDone$$ExternalSyntheticLambda4 proVersionActivityDone$$ExternalSyntheticLambda4 = new ProVersionActivityDone$$ExternalSyntheticLambda4(this);
        billingClient.queryPurchasesAsync(queryPurchasesParams, (PurchasesResponseListener)proVersionActivityDone$$ExternalSyntheticLambda4);
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
        object = new ProVersionActivityDone$7(this);
        builder.queryProductDetailsAsync(queryProductDetailsParams, (ProductDetailsResponseListener)object);
    }

    private void queryUserPurchases() {
        QueryPurchasesParams queryPurchasesParams = QueryPurchasesParams.newBuilder().setProductType("inapp").build();
        BillingClient billingClient = this.billingClient;
        ProVersionActivityDone$$ExternalSyntheticLambda1 proVersionActivityDone$$ExternalSyntheticLambda1 = new ProVersionActivityDone$$ExternalSyntheticLambda1(this);
        billingClient.queryPurchasesAsync(queryPurchasesParams, (PurchasesResponseListener)proVersionActivityDone$$ExternalSyntheticLambda1);
    }

    private void setupImg() {
        RecyclerView recyclerView;
        int n = R$id.rv_img;
        this.recyclerView = recyclerView = (RecyclerView)this.findViewById(n);
        ProVersionActivityDone$11 proVersionActivityDone$11 = new ProVersionActivityDone$11(this);
        recyclerView.post((Runnable)proVersionActivityDone$11);
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
        object = new ProVersionActivityDone$3(this);
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
        ProVersionActivityDone$5 proVersionActivityDone$5 = new ProVersionActivityDone$5(this);
        billingClient.startConnection((BillingClientStateListener)proVersionActivityDone$5);
    }

    private void stopAutoScroll() {
        Runnable runnable;
        Handler handler = this.autoScrollHandler;
        if (handler != null && (runnable = this.autoScrollRunnable) != null) {
            handler.removeCallbacks(runnable);
        }
    }

    private void thnks() {
        int n = R$id.tv_thanks;
        TextCustumFont textCustumFont = (TextCustumFont)this.findViewById(n);
        Object object = this.mResources;
        int n2 = R$string.thanks_hint;
        object = object.getString(n2);
        textCustumFont.setText((CharSequence)object);
        this.initBtnHelp(true);
        this.explode();
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
        object = ProVersionActivity$$ExternalSyntheticBackport0.m$1(object);
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

    /* synthetic */ void cfr_renamed_372(BillingResult object, List list) {
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
            object = new ProVersionActivityDone$13(this);
            this.runOnUiThread((Runnable)object);
            object = this.getApplicationContext();
            BillingPreferences.saveSubscriptionStatus((Context)object, n2 != 0);
            this.thnks();
        }
    }

    /* synthetic */ void cfr_renamed_373(BillingResult object, List list) {
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

    /* synthetic */ void cfr_renamed_374(BillingResult object, List object2) {
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
        super.onCreate(object);
        EdgeToEdge.enable((ComponentActivity)this);
        int n = R$layout.activity_pro_version_done;
        this.setContentView(n);
        n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        object = this.getOnBackPressedDispatcher();
        Object object2 = this.onBackPressedCallback;
        object.addCallback((LifecycleOwner)this, object2);
        object = this.getWindow();
        object2 = this.getWindow().getDecorView();
        object = WindowCompat.getInsetsController((Window)object, (View)object2);
        object.setAppearanceLightStatusBars(false);
        object.setAppearanceLightNavigationBars(false);
        n = R$id.main;
        object = this.findViewById(n);
        object2 = new ProVersionActivityDone$$ExternalSyntheticLambda5();
        ViewCompat.setOnApplyWindowInsetsListener((View)object, (OnApplyWindowInsetsListener)object2);
        object = this.getResources();
        this.mResources = object;
        if (object == null) {
            this.finish();
        }
        this.wakeLockAquire();
        n = R$id.mtittle;
        object = (TextView)this.findViewById(n);
        object2 = this.mResources;
        int n2 = R$string.enjoy_all_premium_features_last;
        object2 = object2.getString(n2);
        object.setText((CharSequence)object2);
        n = R$id.hint_review;
        object = (TextView)this.findViewById(n);
        object2 = this.mResources;
        n2 = R$string._4_8_434_reviews_28k_users;
        object2 = object2.getString(n2);
        object.setText((CharSequence)object2);
        object = this.getIntent();
        if (object != null) {
            object = this.getIntent();
            object2 = "template";
            if ((object = object.getStringExtra((String)object2)) != null) {
                object = (Template)LocalPersistence.readObjectFromFile((Context)this, (String)object);
                this.mTemplate = object;
            }
        }
        n = R$id.btn_on_back;
        object = this.findViewById(n);
        object2 = new ProVersionActivityDone$2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        this.setupImg();
        this.thnks();
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

