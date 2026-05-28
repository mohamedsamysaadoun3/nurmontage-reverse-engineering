/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
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
 *  nl.dionsegijn.konfetti.core.Party
 *  nl.dionsegijn.konfetti.core.PartyFactory
 *  nl.dionsegijn.konfetti.core.Position
 *  nl.dionsegijn.konfetti.core.Position$Relative
 *  nl.dionsegijn.konfetti.core.emitter.Emitter
 *  nl.dionsegijn.konfetti.core.emitter.EmitterConfig
 *  nl.dionsegijn.konfetti.core.models.Shape
 *  nl.dionsegijn.konfetti.core.models.Shape$Circle
 *  nl.dionsegijn.konfetti.core.models.Shape$Square
 *  nl.dionsegijn.konfetti.xml.KonfettiView
 *  nl.dionsegijn.konfetti.xml.image.ImageUtil
 */
package hazem.nurmontage.videoquran;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.ProVersionActivityLast$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.ProVersionActivityLast$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.ProVersionActivityLast$$ExternalSyntheticLambda2;
import hazem.nurmontage.videoquran.ProVersionActivityLast$$ExternalSyntheticLambda3;
import hazem.nurmontage.videoquran.ProVersionActivityLast$$ExternalSyntheticLambda4;
import hazem.nurmontage.videoquran.ProVersionActivityLast$1;
import hazem.nurmontage.videoquran.ProVersionActivityLast$10;
import hazem.nurmontage.videoquran.ProVersionActivityLast$11;
import hazem.nurmontage.videoquran.ProVersionActivityLast$12;
import hazem.nurmontage.videoquran.ProVersionActivityLast$13;
import hazem.nurmontage.videoquran.ProVersionActivityLast$14;
import hazem.nurmontage.videoquran.ProVersionActivityLast$15;
import hazem.nurmontage.videoquran.ProVersionActivityLast$16;
import hazem.nurmontage.videoquran.ProVersionActivityLast$17;
import hazem.nurmontage.videoquran.ProVersionActivityLast$18;
import hazem.nurmontage.videoquran.ProVersionActivityLast$19;
import hazem.nurmontage.videoquran.ProVersionActivityLast$2;
import hazem.nurmontage.videoquran.ProVersionActivityLast$20;
import hazem.nurmontage.videoquran.ProVersionActivityLast$3;
import hazem.nurmontage.videoquran.ProVersionActivityLast$4;
import hazem.nurmontage.videoquran.ProVersionActivityLast$5;
import hazem.nurmontage.videoquran.ProVersionActivityLast$6;
import hazem.nurmontage.videoquran.ProVersionActivityLast$7;
import hazem.nurmontage.videoquran.ProVersionActivityLast$8;
import hazem.nurmontage.videoquran.ProVersionActivityLast$9;
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
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import nl.dionsegijn.konfetti.core.Party;
import nl.dionsegijn.konfetti.core.PartyFactory;
import nl.dionsegijn.konfetti.core.Position;
import nl.dionsegijn.konfetti.core.emitter.Emitter;
import nl.dionsegijn.konfetti.core.emitter.EmitterConfig;
import nl.dionsegijn.konfetti.core.models.Shape;
import nl.dionsegijn.konfetti.xml.KonfettiView;
import nl.dionsegijn.konfetti.xml.image.ImageUtil;

public class ProVersionActivityLast
extends Base
implements PurchasesUpdatedListener {
    private static String PRODUCT_ID_FOREIVER = "sku.nurmontage.foreiver";
    private static String PRODUCT_ID_MONTH = "sku.nurmontage.month";
    private static String PRODUCT_ID_YEAR = "sku.nurmontage.year";
    private BillingClient billingClient;
    private ButtonCustumFont btnContinue;
    private RelativeLayout btn_foreiver;
    private RelativeLayout btn_month;
    private TextCustumFont btn_restore;
    private RelativeLayout btn_year;
    private int color_select = -206036;
    private FeaturesAdabter featuresAdabter;
    boolean hasPurchasedForever;
    private boolean isClick;
    private boolean isrESTORE;
    private ImageView ivForeiver;
    private ImageView ivMonth;
    private ImageView ivYear;
    private Resources mResources;
    private Template mTemplate;
    private final OnBackPressedCallback onBackPressedCallback;
    private Map productDetailsMap;
    private String product_id_current;
    private TextCustumFont tv_foreiver;
    private TextCustumFont tv_month;
    private TextCustumFont tv_price_foreiver;
    private TextCustumFont tv_price_month;
    private TextCustumFont tv_price_year;
    private TextCustumFont tv_year;

    static /* bridge */ /* synthetic */ BillingClient cfr_renamed_59(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.billingClient;
    }

    static /* bridge */ /* synthetic */ ButtonCustumFont cfr_renamed_127(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.btnContinue;
    }

    static /* bridge */ /* synthetic */ RelativeLayout cfr_renamed_83(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.btn_foreiver;
    }

    static /* bridge */ /* synthetic */ RelativeLayout cfr_renamed_375(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.btn_month;
    }

    static /* bridge */ /* synthetic */ RelativeLayout cfr_renamed_84(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.btn_year;
    }

    static /* bridge */ /* synthetic */ int cfr_renamed_378(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.color_select;
    }

    static /* bridge */ /* synthetic */ FeaturesAdabter cfr_renamed_128(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.featuresAdabter;
    }

    static /* bridge */ /* synthetic */ boolean cfr_renamed_86(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.isClick;
    }

    static /* bridge */ /* synthetic */ ImageView cfr_renamed_88(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.ivForeiver;
    }

    static /* bridge */ /* synthetic */ ImageView cfr_renamed_376(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.ivMonth;
    }

    static /* bridge */ /* synthetic */ ImageView cfr_renamed_89(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.ivYear;
    }

    static /* bridge */ /* synthetic */ Resources cfr_renamed_90(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.mResources;
    }

    static /* bridge */ /* synthetic */ Template cfr_renamed_2(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.mTemplate;
    }

    static /* bridge */ /* synthetic */ OnBackPressedCallback cfr_renamed_91(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.onBackPressedCallback;
    }

    static /* bridge */ /* synthetic */ Map cfr_renamed_57(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.productDetailsMap;
    }

    static /* bridge */ /* synthetic */ String cfr_renamed_92(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.product_id_current;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_379(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.tv_foreiver;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_380(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.tv_month;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_95(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.tv_price_foreiver;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_381(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.tv_price_month;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_96(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.tv_price_year;
    }

    static /* bridge */ /* synthetic */ TextCustumFont cfr_renamed_377(ProVersionActivityLast proVersionActivityLast) {
        return proVersionActivityLast.tv_year;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_126(ProVersionActivityLast proVersionActivityLast, ButtonCustumFont buttonCustumFont) {
        proVersionActivityLast.btnContinue = buttonCustumFont;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_97(ProVersionActivityLast proVersionActivityLast, boolean bl) {
        proVersionActivityLast.isClick = bl;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_99(ProVersionActivityLast proVersionActivityLast, String string2) {
        proVersionActivityLast.product_id_current = string2;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_9(ProVersionActivityLast proVersionActivityLast) {
        proVersionActivityLast.checkInAppPurchases();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_61(ProVersionActivityLast proVersionActivityLast) {
        proVersionActivityLast.checkUserSubscriptionStatus();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_8(ProVersionActivityLast proVersionActivityLast, List list) {
        proVersionActivityLast.handleSubscriptionPurchases(list);
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_13(ProVersionActivityLast proVersionActivityLast) {
        proVersionActivityLast.hideProgressFragment();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_101(ProVersionActivityLast proVersionActivityLast, ProductDetails productDetails) {
        proVersionActivityLast.launchPurchaseFlowINAPP(productDetails);
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_102(ProVersionActivityLast proVersionActivityLast, ProductDetails productDetails) {
        proVersionActivityLast.launchPurchaseFlowSUB(productDetails);
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_150(ProVersionActivityLast proVersionActivityLast) {
        proVersionActivityLast.queryProducts();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_103(ProVersionActivityLast proVersionActivityLast) {
        proVersionActivityLast.queryPurchases();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_104(ProVersionActivityLast proVersionActivityLast) {
        proVersionActivityLast.querySubscribe();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_60(ProVersionActivityLast proVersionActivityLast) {
        proVersionActivityLast.showProgress();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_62(ProVersionActivityLast proVersionActivityLast) {
        proVersionActivityLast.startBillingConnection();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_67(ProVersionActivityLast proVersionActivityLast) {
        proVersionActivityLast.toTrackAct();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_56(ProVersionActivityLast proVersionActivityLast, ProductDetails productDetails) {
        proVersionActivityLast.updateUI(productDetails);
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

    public ProVersionActivityLast() {
        Object object = new ProVersionActivityLast$1(this, true);
        this.onBackPressedCallback = object;
        this.productDetailsMap = object;
        object = PRODUCT_ID_YEAR;
        this.product_id_current = object;
    }

    private void checkInAppPurchases() {
        QueryPurchasesParams queryPurchasesParams = QueryPurchasesParams.newBuilder().setProductType("inapp").build();
        BillingClient billingClient = this.billingClient;
        ProVersionActivityLast$$ExternalSyntheticLambda4 proVersionActivityLast$$ExternalSyntheticLambda4 = new ProVersionActivityLast$$ExternalSyntheticLambda4(this);
        billingClient.queryPurchasesAsync(queryPurchasesParams, (PurchasesResponseListener)proVersionActivityLast$$ExternalSyntheticLambda4);
    }

    private void checkUserSubscriptionStatus() {
        QueryPurchasesParams queryPurchasesParams = QueryPurchasesParams.newBuilder().setProductType("subs").build();
        BillingClient billingClient = this.billingClient;
        ProVersionActivityLast$16 proVersionActivityLast$16 = new ProVersionActivityLast$16(this);
        billingClient.queryPurchasesAsync(queryPurchasesParams, (PurchasesResponseListener)proVersionActivityLast$16);
    }

    private String findOfferToken(ProductDetails object) {
        boolean bl;
        if ((object = object.getSubscriptionOfferDetails()) != null && !(bl = object.isEmpty())) {
            return ((ProductDetails.SubscriptionOfferDetails)object.get(0)).getOfferToken();
        }
        return null;
    }

    private void handleInAppPurchases(List object) {
        block1: {
            int n;
            object = object.iterator();
            while (n = object.hasNext()) {
                int n2;
                Purchase purchase = (Purchase)object.next();
                n = purchase.getPurchaseState();
                if (n != (n2 = 1)) continue;
                object = new ProVersionActivityLast$18(this);
                this.runOnUiThread((Runnable)object);
                object = this.getApplicationContext();
                BillingPreferences.saveSubscriptionStatus((Context)object, n2 != 0);
                this.thnks();
                break block1;
            }
            this.handleNoPurchases();
        }
    }

    private void handleNoPurchases() {
        ProVersionActivityLast$19 proVersionActivityLast$19 = new ProVersionActivityLast$19(this);
        this.runOnUiThread(proVersionActivityLast$19);
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
                ProVersionActivityLast$$ExternalSyntheticLambda0 proVersionActivityLast$$ExternalSyntheticLambda0 = new ProVersionActivityLast$$ExternalSyntheticLambda0();
                builder.acknowledgePurchase((AcknowledgePurchaseParams)object, (AcknowledgePurchaseResponseListener)proVersionActivityLast$$ExternalSyntheticLambda0);
                object = this.getApplicationContext();
                BillingPreferences.saveSubscriptionStatus((Context)object, n != 0);
                this.playVibration();
                this.thnks();
            }
        } else {
            int n3 = object.getPurchaseState();
            if (n3 == (n2 = 2)) {
                object = new ProVersionActivityLast$13(this);
                this.runOnUiThread((Runnable)object);
            } else {
                object = new ProVersionActivityLast$14(this);
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

    private void initBtnHelp() {
        int n = R$id.btn_contact;
        View view = this.findViewById(n);
        ProVersionActivityLast$8 proVersionActivityLast$8 = new ProVersionActivityLast$8(this);
        view.setOnClickListener((View.OnClickListener)proVersionActivityLast$8);
    }

    private void initImgFeatures() {
        int n;
        int n2;
        Object object;
        int n3 = R$id.ytb_layout;
        Object object2 = this.findViewById(n3);
        Object object3 = new ProVersionActivityLast$9(this);
        object2.setOnClickListener((View.OnClickListener)object3);
        object2 = LocaleHelper.getLanguage((Context)this);
        n3 = object2.equals("ar") ? 1 : 0;
        int n4 = 0;
        object3 = null;
        if (n3 != 0) {
            n3 = R$id.tv_pro_ar;
            object2 = (TextCustumFont)this.findViewById(n3);
            object2.setVisibility(0);
            object = this.mResources;
            n2 = R$string.pro;
            object = object.getString(n2);
            object2.setText((CharSequence)object);
            n3 = R$id.tv_free_ar;
            object2 = (TextCustumFont)this.findViewById(n3);
            object2.setVisibility(0);
            object = this.mResources;
            n2 = R$string.free;
            object = object.getString(n2);
            object2.setText((CharSequence)object);
            n3 = R$id.tv_pro;
            object2 = this.findViewById(n3);
            n = 8;
            object2.setVisibility(n);
        } else {
            n3 = R$id.tv_pro;
            object2 = (TextCustumFont)this.findViewById(n3);
            object2.setVisibility(0);
            object = this.mResources;
            n2 = R$string.pro;
            object = object.getString(n2);
            object2.setText((CharSequence)object);
            n3 = R$id.tv_free;
            object2 = (TextCustumFont)this.findViewById(n3);
            object2.setVisibility(0);
            object = this.mResources;
            n2 = R$string.free;
            object = object.getString(n2);
            object2.setText((CharSequence)object);
        }
        n3 = R$id.tv_tittle_billing;
        object2 = (TextCustumFont)this.findViewById(n3);
        object = this.mResources;
        n2 = R$string.unlock_premium;
        object = object.getString(n2);
        object2.setText((CharSequence)object);
        n3 = R$id.rv;
        object2 = (RecyclerView)this.findViewById(n3);
        n = 1;
        object2.setHasFixedSize(n != 0);
        object2.setItemViewCacheSize(20);
        object2.setDrawingCacheEnabled(n != 0);
        n2 = 0;
        object2.setItemAnimator(null);
        Object object4 = new LinearLayoutManager((Context)this);
        object2.setLayoutManager((RecyclerView.LayoutManager)object4);
        object4 = new ArrayList();
        String[] stringArray = this.mResources;
        int n5 = R$array.feature_list;
        stringArray = stringArray.getStringArray(n5);
        while (n4 < (n5 = stringArray.length)) {
            ModelFeatures modelFeatures;
            String string2;
            if (n4 != 0 && n4 != n) {
                string2 = stringArray[n4];
                modelFeatures = new ModelFeatures(string2);
                object4.add(modelFeatures);
            } else {
                string2 = stringArray[n4];
                modelFeatures = new ModelFeatures(string2, n != 0);
                object4.add(modelFeatures);
            }
            ++n4;
        }
        object3 = new FeaturesAdabter((List)object4);
        this.featuresAdabter = object3;
        object2.setAdapter((RecyclerView.Adapter)object3);
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
        ProVersionActivityLast$20 proVersionActivityLast$20 = new ProVersionActivityLast$20(this);
        this.runOnUiThread(proVersionActivityLast$20);
    }

    private void queryProducts() {
        QueryProductDetailsParams queryProductDetailsParams = new ArrayList();
        QueryProductDetailsParams.Product.Builder builder = QueryProductDetailsParams.Product.newBuilder();
        Object object = PRODUCT_ID_FOREIVER;
        builder = builder.setProductId((String)object).setProductType("inapp").build();
        queryProductDetailsParams.add(builder);
        queryProductDetailsParams = QueryProductDetailsParams.newBuilder().setProductList(queryProductDetailsParams).build();
        builder = this.billingClient;
        object = new ProVersionActivityLast$11(this);
        builder.queryProductDetailsAsync(queryProductDetailsParams, (ProductDetailsResponseListener)object);
    }

    private void queryPurchases() {
        QueryPurchasesParams queryPurchasesParams = QueryPurchasesParams.newBuilder().setProductType("inapp").build();
        BillingClient billingClient = this.billingClient;
        ProVersionActivityLast$$ExternalSyntheticLambda1 proVersionActivityLast$$ExternalSyntheticLambda1 = new ProVersionActivityLast$$ExternalSyntheticLambda1(this);
        billingClient.queryPurchasesAsync(queryPurchasesParams, (PurchasesResponseListener)proVersionActivityLast$$ExternalSyntheticLambda1);
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
        object = new ProVersionActivityLast$12(this);
        builder.queryProductDetailsAsync(queryProductDetailsParams, (ProductDetailsResponseListener)object);
    }

    private void queryUserPurchases() {
        QueryPurchasesParams queryPurchasesParams = QueryPurchasesParams.newBuilder().setProductType("inapp").build();
        BillingClient billingClient = this.billingClient;
        ProVersionActivityLast$$ExternalSyntheticLambda3 proVersionActivityLast$$ExternalSyntheticLambda3 = new ProVersionActivityLast$$ExternalSyntheticLambda3(this);
        billingClient.queryPurchasesAsync(queryPurchasesParams, (PurchasesResponseListener)proVersionActivityLast$$ExternalSyntheticLambda3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     */
    private void showProgress() {
        ProgressViewFragment progressViewFragment;
        int n;
        View view;
        int n2;
        try {
            n2 = R$id.container_progress;
        }
        catch (Exception exception) {
            return;
        }
        {
            view = this.findViewById(n2);
            n = 0;
        }
        {
            view.setVisibility(0);
            n2 = this.isFinishing() ? 1 : 0;
            if (n2 != 0) return;
        }
        {
            view = this.getSupportFragmentManager();
        }
        {
            n2 = view.isDestroyed() ? 1 : 0;
            if (n2 != 0) return;
        }
        {
            view = this.getSupportFragmentManager();
        }
        {
            view = view.beginTransaction();
        }
        {
            n = R$id.container_progress;
        }
        {
            progressViewFragment = ProgressViewFragment.getInstance();
        }
        {
            view.replace(n, (Fragment)progressViewFragment);
            view.commit();
            return;
        }
    }

    private void startBillingConnection() {
        BillingClient billingClient = this.billingClient;
        ProVersionActivityLast$10 proVersionActivityLast$10 = new ProVersionActivityLast$10(this);
        billingClient.startConnection((BillingClientStateListener)proVersionActivityLast$10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void thnks() {
        ProVersionActivityLast$15 proVersionActivityLast$15;
        try {
            proVersionActivityLast$15 = new ProVersionActivityLast$15(this);
        }
        catch (Exception exception) {
            return;
        }
        this.runOnUiThread(proVersionActivityLast$15);
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
        Object object2 = object.getProductType();
        boolean bl = ((String)object2).equals("inapp");
        String string2 = null;
        String string3 = "N/A";
        if (bl) {
            object2 = object.getOneTimePurchaseOfferDetails();
            if (object2 != null) {
                object = object.getOneTimePurchaseOfferDetails();
                string2 = object.getFormattedPrice();
            }
            object = this.tv_price_foreiver;
            if (string2 != null) {
                string3 = string2;
            }
            object.setText((CharSequence)string3);
        } else {
            String string4;
            object2 = object.getProductType();
            bl = ((String)object2).equals(string4 = "subs");
            if (bl) {
                object2 = object.getSubscriptionOfferDetails();
                if (object2 != null && !(bl = (object2 = object.getSubscriptionOfferDetails()).isEmpty())) {
                    boolean bl2;
                    object2 = object.getSubscriptionOfferDetails();
                    string4 = null;
                    Object object3 = (object2 = (ProductDetails.SubscriptionOfferDetails)object2.get(0)).getPricingPhases();
                    if (object3 != null && !(bl2 = (object3 = object2.getPricingPhases().getPricingPhaseList()).isEmpty())) {
                        object2 = (ProductDetails.PricingPhase)object2.getPricingPhases().getPricingPhaseList().get(0);
                        string2 = object2.getFormattedPrice();
                    }
                }
                if (bl = ((String)(object2 = PRODUCT_ID_YEAR)).equals(object = object.getProductId())) {
                    object = this.tv_price_year;
                    if (string2 != null) {
                        string3 = string2;
                    }
                    object.setText((CharSequence)string3);
                } else {
                    object2 = PRODUCT_ID_MONTH;
                    boolean bl3 = ((String)object2).equals(object);
                    if (bl3) {
                        object = this.tv_price_month;
                        if (string2 != null) {
                            string3 = string2;
                        }
                        object.setText((CharSequence)string3);
                    }
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
        stringArray[0] = "hazemourari08@gmail.com";
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
        int n2 = R$drawable.favorite_24px;
        object = ContextCompat.getDrawable((Context)object, (int)n2);
        n2 = 1;
        object = ImageUtil.loadDrawable((Drawable)object, n2 != 0, n2 != 0);
        int n3 = R$id.konfettiView;
        KonfettiView konfettiView = (KonfettiView)this.findViewById(n3);
        konfettiView.setVisibility(0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Integer[] integerArray = new Emitter(2800L, timeUnit);
        integerArray = integerArray.max(300);
        PartyFactory partyFactory = new PartyFactory((EmitterConfig)integerArray);
        integerArray = partyFactory.spread(360);
        int n4 = 3;
        Object object2 = new Shape[n4];
        timeUnit = Shape.Square.INSTANCE;
        object2[0] = timeUnit;
        timeUnit = Shape.Circle.INSTANCE;
        object2[n2] = timeUnit;
        int n5 = 2;
        object2[n5] = object;
        object = Arrays.asList(object2);
        object = integerArray.shapes((List)object);
        integerArray = new Integer[4];
        integerArray[0] = object2 = Integer.valueOf(16572810);
        integerArray[n2] = n = Integer.valueOf(16740973);
        Object object3 = 16003181;
        integerArray[n5] = object3;
        object3 = 11832815;
        integerArray[n4] = object3;
        object3 = Arrays.asList(integerArray);
        object = object.colors((List)object3).setSpeedBetween(0.0f, 30.0f);
        object3 = new Position.Relative(0.5, 0.3);
        object = object.position((Position)object3).build();
        konfettiView.start((Party)object);
    }

    /* synthetic */ void cfr_renamed_80(BillingResult object, List list) {
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
            object = new ProVersionActivityLast$17(this);
            this.runOnUiThread((Runnable)object);
            object = this.getApplicationContext();
            BillingPreferences.saveSubscriptionStatus((Context)object, n2 != 0);
            this.thnks();
        }
    }

    /* synthetic */ void cfr_renamed_395(BillingResult object, List list) {
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

    /* synthetic */ void cfr_renamed_396(BillingResult object, List object2) {
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
        n2 = -15658732;
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
        ProVersionActivityLast$$ExternalSyntheticLambda2 proVersionActivityLast$$ExternalSyntheticLambda2 = new ProVersionActivityLast$$ExternalSyntheticLambda2();
        ViewCompat.setOnApplyWindowInsetsListener((View)object, (OnApplyWindowInsetsListener)proVersionActivityLast$$ExternalSyntheticLambda2);
        object = this.getResources();
        this.mResources = object;
        if (object == null) {
            this.finish();
        }
        if ((n2 = (int)(NetworkUtils.isNetworkAvailable((Context)this) ? 1 : 0)) == 0) {
            object = this.mResources;
            n = R$string.no_internet;
            object = object.getString(n);
            object = Toast.makeText((Context)this, (CharSequence)object, (int)0);
            object.show();
        }
        this.wakeLockAquire();
        object = this.getIntent();
        if (object != null) {
            object = this.getIntent();
            object2 = "template";
            if ((object = object.getStringExtra((String)object2)) != null) {
                object = (Template)LocalPersistence.readObjectFromFile((Context)this, (String)object);
                this.mTemplate = object;
            }
        }
        n2 = R$id.btn_on_back;
        object = this.findViewById(n2);
        object2 = new ProVersionActivityLast$2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.getApplicationContext();
        n2 = BillingPreferences.isSubscribed((Context)object) ? 1 : 0;
        this.initImgFeatures();
        this.initBtnHelp();
        if (n2 != 0) {
            this.thnks();
            return;
        }
        object = BillingClient.newBuilder((Context)this).setListener((PurchasesUpdatedListener)this).enablePendingPurchases().build();
        this.billingClient = object;
        this.startBillingConnection();
        object = this.btn_restore;
        object2 = this.mResources;
        n = R$string.restort_subscribe;
        object2 = object2.getString(n);
        object.setText((CharSequence)object2);
        object = this.btn_restore;
        object2 = new ProVersionActivityLast$3(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n2 = R$id.tv_foreiver;
        object = (TextCustumFont)this.findViewById(n2);
        this.tv_foreiver = object;
        n2 = R$id.tv_price_year;
        object = (TextCustumFont)this.findViewById(n2);
        this.tv_price_year = object;
        n2 = R$id.tv_price_foreiver;
        object = (TextCustumFont)this.findViewById(n2);
        this.tv_price_foreiver = object;
        n2 = R$id.btn_foreiver;
        object = (RelativeLayout)this.findViewById(n2);
        this.btn_foreiver = object;
        n2 = R$id.btn_year;
        object = (RelativeLayout)this.findViewById(n2);
        this.btn_year = object;
        n2 = R$id.btn_radio_foreiver;
        object = (ImageView)this.findViewById(n2);
        this.ivForeiver = object;
        n2 = R$id.btn_radio_year;
        object = (ImageView)this.findViewById(n2);
        this.ivYear = object;
        object = this.btn_foreiver;
        object2 = new ProVersionActivityLast$4(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.btn_year;
        object2 = new ProVersionActivityLast$5(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.btn_month;
        object2 = new ProVersionActivityLast$6(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n2 = R$id.btn_continue;
        object = (ButtonCustumFont)this.findViewById(n2);
        this.btnContinue = object;
        object2 = this.mResources;
        n = R$string.subscribe_now;
        object2 = object2.getString(n);
        object.setText((CharSequence)object2);
        object = this.btnContinue;
        object2 = new ProVersionActivityLast$7(this);
        object.setOnClickListener((View.OnClickListener)object2);
    }

    protected void onDestroy() {
        boolean bl;
        super.onDestroy();
        BillingClient billingClient = this.billingClient;
        if (billingClient != null && (bl = billingClient.isReady())) {
            billingClient = this.billingClient;
            billingClient.endConnection();
        }
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

