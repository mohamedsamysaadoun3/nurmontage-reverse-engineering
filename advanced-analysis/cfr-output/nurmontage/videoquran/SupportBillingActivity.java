/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.util.Pair
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 *  android.widget.ImageView
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
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingClientStateListener
 *  com.android.billingclient.api.BillingFlowParams
 *  com.android.billingclient.api.BillingFlowParams$ProductDetailsParams
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.ConsumeParams
 *  com.android.billingclient.api.ConsumeResponseListener
 *  com.android.billingclient.api.ProductDetails
 *  com.android.billingclient.api.ProductDetailsResponseListener
 *  com.android.billingclient.api.Purchase
 *  com.android.billingclient.api.PurchasesResponseListener
 *  com.android.billingclient.api.PurchasesUpdatedListener
 *  com.android.billingclient.api.QueryProductDetailsParams
 *  com.android.billingclient.api.QueryProductDetailsParams$Product
 *  com.android.billingclient.api.QueryProductDetailsParams$Product$Builder
 *  com.android.billingclient.api.QueryPurchasesParams
 */
package hazem.nurmontage.videoquran;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
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
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.SupportBillingActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.SupportBillingActivity$$ExternalSyntheticLambda1;
import hazem.nurmontage.videoquran.SupportBillingActivity$$ExternalSyntheticLambda2;
import hazem.nurmontage.videoquran.SupportBillingActivity$$ExternalSyntheticLambda3;
import hazem.nurmontage.videoquran.SupportBillingActivity$$ExternalSyntheticLambda4;
import hazem.nurmontage.videoquran.SupportBillingActivity$$ExternalSyntheticLambda5;
import hazem.nurmontage.videoquran.SupportBillingActivity$$ExternalSyntheticLambda6;
import hazem.nurmontage.videoquran.SupportBillingActivity$2;
import hazem.nurmontage.videoquran.SupportBillingActivity$3;
import hazem.nurmontage.videoquran.SupportBillingActivity$4;
import hazem.nurmontage.videoquran.SupportBillingActivity$5;
import hazem.nurmontage.videoquran.ThanksYouActivity;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.NonScrollableLinearLayoutManager;
import hazem.nurmontage.videoquran.Utils.PriceFormatter;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import hazem.nurmontage.videoquran.adabter.AboutAdabters;
import hazem.nurmontage.videoquran.adabter.AboutAdabters$ModelAbout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SupportBillingActivity
extends Base
implements PurchasesUpdatedListener {
    private static String PRODUCT_ID_10$ = "sku.nurmontage.min";
    private static String PRODUCT_ID_100$ = "sku.nurmontage.mmedium";
    private static String PRODUCT_ID_1000$ = "sku.nurmontage.max";
    private static String PRODUCT_ID_50$ = "sku.nurmontage.medium";
    private static String product_id_current = "sku.nurmontage.medium";
    private BillingClient billingClient;
    private ButtonCustumFont btn_launch;
    private Resources mResources;
    private final OnBackPressedCallback onBackPressedCallback;
    private int price_select;
    private Map productDetailsMap;
    private ButtonCustumFont view_price_10$;
    private ButtonCustumFont view_price_100$;
    private ButtonCustumFont view_price_1000$;
    private ButtonCustumFont view_price_50$;

    static /* bridge */ /* synthetic */ OnBackPressedCallback cfr_renamed_91(SupportBillingActivity supportBillingActivity) {
        return supportBillingActivity.onBackPressedCallback;
    }

    static /* bridge */ /* synthetic */ Map cfr_renamed_57(SupportBillingActivity supportBillingActivity) {
        return supportBillingActivity.productDetailsMap;
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_398(SupportBillingActivity supportBillingActivity, String string2) {
        supportBillingActivity.launchPurchaseFlow(string2);
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_150(SupportBillingActivity supportBillingActivity) {
        supportBillingActivity.queryProducts();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_103(SupportBillingActivity supportBillingActivity) {
        supportBillingActivity.queryPurchases();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_62(SupportBillingActivity supportBillingActivity) {
        supportBillingActivity.startBillingConnection();
    }

    static /* bridge */ /* synthetic */ void cfr_renamed_56(SupportBillingActivity supportBillingActivity, ProductDetails productDetails) {
        supportBillingActivity.updateUI(productDetails);
    }

    static /* bridge */ /* synthetic */ String cfr_renamed_397() {
        return product_id_current;
    }

    public SupportBillingActivity() {
        Object object;
        int n;
        this.price_select = n = R$id.view_50;
        this.productDetailsMap = object = new Object();
        super(this, true);
        this.onBackPressedCallback = object;
    }

    private void handlePurchase(Purchase object) {
        int n;
        int n2 = object.getPurchaseState();
        if (n2 == (n = 1)) {
            this.thnks();
            n2 = object.isAcknowledged() ? 1 : 0;
            if (n2 == 0) {
                Object object2 = ConsumeParams.newBuilder();
                object = object.getPurchaseToken();
                object = object2.setPurchaseToken((String)object).build();
                object2 = new SupportBillingActivity$$ExternalSyntheticLambda0(this);
                BillingClient billingClient = this.billingClient;
                billingClient.consumeAsync((ConsumeParams)object, (ConsumeResponseListener)object2);
            }
        } else {
            int n3 = object.getPurchaseState();
            n2 = 2;
            n = 0;
            Object var5_6 = null;
            if (n3 == n2) {
                object = Toast.makeText((Context)this, (CharSequence)"Purchase is pending", (int)0);
                object.show();
            } else {
                object = Toast.makeText((Context)this, (CharSequence)"Purchase is in unknown state", (int)0);
                object.show();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void init() {
        void var8_11;
        Object object = LocaleHelper.getLanguage(this.getApplicationContext());
        int n = R$id.tv_aya;
        Object object2 = (TextCustumFont)this.findViewById(n);
        Object object3 = this.mResources;
        int n2 = R$string.tittle_billing;
        object3 = object3.getString(n2);
        object2.setText((CharSequence)object3);
        object3 = "ar";
        n2 = ((String)object).equals(object3) ? 1 : 0;
        if (n2 != 0) {
            n2 = 2;
            float f = 16.0f;
            object2.setTextSize(n2, f);
        }
        ArrayList<TextCustumFont> arrayList = new ArrayList<TextCustumFont>();
        boolean n3 = ((String)object).equals(object3);
        if (n3) {
            int n4 = 5;
        } else {
            int n5 = 0x800003;
        }
        String string2 = "<font color='#000000'>";
        CharSequence charSequence = new StringBuilder(string2);
        Object object4 = this.mResources;
        int n6 = R$string.about_question_1;
        object4 = object4.getString(n6);
        charSequence = charSequence.append((String)object4);
        object4 = "</font>";
        charSequence = charSequence.append((String)object4).toString();
        Object object5 = (int)var8_11;
        object3 = new Pair((Object)charSequence, object5);
        n2 = 14;
        object2 = new AboutAdabters$ModelAbout(n2, (Pair)object3);
        arrayList.add((TextCustumFont)((Object)object2));
        object5 = (int)var8_11;
        String string3 = "\n";
        object3 = new Pair((Object)string3, object5);
        object2 = new AboutAdabters$ModelAbout(n2, (Pair)object3);
        arrayList.add((TextCustumFont)((Object)object2));
        object5 = new StringBuilder(string2);
        Object object6 = this.mResources;
        int n7 = R$string.about_question_2;
        object6 = object6.getString(n7);
        object5 = ((StringBuilder)object5).append((String)object6).append((String)object4).toString();
        object6 = (int)var8_11;
        object3 = new Pair(object5, object6);
        object2 = new AboutAdabters$ModelAbout(n2, (Pair)object3);
        arrayList.add((TextCustumFont)((Object)object2));
        object5 = (int)var8_11;
        object3 = new Pair((Object)string3, object5);
        object2 = new AboutAdabters$ModelAbout(n2, (Pair)object3);
        arrayList.add((TextCustumFont)((Object)object2));
        object5 = new StringBuilder(string2);
        object6 = this.mResources;
        n7 = R$string.about_question_3;
        object6 = object6.getString(n7);
        object5 = ((StringBuilder)object5).append((String)object6).append((String)object4).toString();
        object6 = (int)var8_11;
        object3 = new Pair(object5, object6);
        object2 = new AboutAdabters$ModelAbout(n2, (Pair)object3);
        arrayList.add((TextCustumFont)((Object)object2));
        object6 = (int)var8_11;
        object3 = new Pair((Object)"\n\n", object6);
        object2 = new AboutAdabters$ModelAbout(n2, (Pair)object3);
        arrayList.add((TextCustumFont)((Object)object2));
        object5 = new StringBuilder(string2);
        object6 = this.mResources;
        n7 = R$string.about_no_ads;
        object6 = object6.getString(n7);
        object5 = ((StringBuilder)object5).append((String)object6).append((String)object4).toString();
        object6 = (int)var8_11;
        object3 = new Pair(object5, object6);
        object2 = new AboutAdabters$ModelAbout(n2, (Pair)object3);
        arrayList.add((TextCustumFont)((Object)object2));
        object5 = (int)var8_11;
        object3 = new Pair((Object)string3, object5);
        object2 = new AboutAdabters$ModelAbout(n2, (Pair)object3);
        arrayList.add((TextCustumFont)((Object)object2));
        object5 = new StringBuilder(string2);
        string2 = this.mResources;
        int n8 = R$string.about_cost_explanation;
        string2 = string2.getString(n8);
        string2 = ((StringBuilder)object5).append(string2).append((String)object4).toString();
        object = (int)var8_11;
        object3 = new Pair((Object)string2, object);
        object2 = new AboutAdabters$ModelAbout(n2, (Pair)object3);
        arrayList.add((TextCustumFont)((Object)object2));
        int n9 = R$id.rv;
        object = (RecyclerView)this.findViewById(n9);
        object.setHasFixedSize(true);
        object2 = new NonScrollableLinearLayoutManager((Context)this);
        object.setLayoutManager((RecyclerView.LayoutManager)object2);
        string3 = AppUtils.getAppVersionName((Context)this);
        int n10 = ScreenUtils.getScreenWidth((Activity)this);
        n7 = (int)((float)ScreenUtils.getScreenWidth((Activity)this) * 0.4f);
        object4 = object2;
        object5 = this;
        object2 = new AboutAdabters((Context)this, string3, arrayList, n10, n7);
        object.setAdapter((RecyclerView.Adapter)object2);
        int n11 = R$id.view_10;
        object = (ButtonCustumFont)this.findViewById(n11);
        this.view_price_10$ = object;
        int n12 = R$id.view_50;
        object = (ButtonCustumFont)this.findViewById(n12);
        this.view_price_50$ = object;
        int n13 = R$id.view_100;
        object = (ButtonCustumFont)this.findViewById(n13);
        this.view_price_100$ = object;
        int n14 = R$id.view_1000;
        object = (ButtonCustumFont)this.findViewById(n14);
        this.view_price_1000$ = object;
        int n15 = R$id.btn_launch;
        object = (ButtonCustumFont)this.findViewById(n15);
        this.btn_launch = object;
        object = this.view_price_10$;
        object2 = new SupportBillingActivity$$ExternalSyntheticLambda2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.view_price_50$;
        object2 = new SupportBillingActivity$$ExternalSyntheticLambda3(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.view_price_100$;
        object2 = new SupportBillingActivity$$ExternalSyntheticLambda4(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.view_price_1000$;
        object2 = new SupportBillingActivity$$ExternalSyntheticLambda5(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.btn_launch;
        object2 = new SupportBillingActivity$3(this);
        object.setOnClickListener((View.OnClickListener)object2);
    }

    private void initImgBilling() {
        int n = R$id.iv_billing;
        ImageView cfr_ignored_0 = (ImageView)this.findViewById(n);
        ScreenUtils.getScreenWidth((Activity)this);
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

    private void launchPurchaseFlow(String string2) {
        Object object = this.productDetailsMap;
        if ((string2 = (ProductDetails)object.get(string2)) == null) {
            return;
        }
        object = new Object();
        string2 = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails((ProductDetails)string2).build();
        object.add(string2);
        string2 = BillingFlowParams.newBuilder().setProductDetailsParamsList(object).build();
        this.billingClient.launchBillingFlow((Activity)this, (BillingFlowParams)string2);
    }

    private void queryProducts() {
        QueryProductDetailsParams queryProductDetailsParams = new ArrayList();
        QueryProductDetailsParams.Product.Builder builder = QueryProductDetailsParams.Product.newBuilder();
        Object object = PRODUCT_ID_10$;
        builder = builder.setProductId((String)object);
        object = "inapp";
        builder = builder.setProductType((String)object).build();
        queryProductDetailsParams.add(builder);
        builder = QueryProductDetailsParams.Product.newBuilder();
        String string2 = PRODUCT_ID_50$;
        builder = builder.setProductId(string2).setProductType((String)object).build();
        queryProductDetailsParams.add(builder);
        builder = QueryProductDetailsParams.Product.newBuilder();
        string2 = PRODUCT_ID_100$;
        builder = builder.setProductId(string2).setProductType((String)object).build();
        queryProductDetailsParams.add(builder);
        builder = QueryProductDetailsParams.Product.newBuilder();
        string2 = PRODUCT_ID_1000$;
        builder = builder.setProductId(string2).setProductType((String)object).build();
        queryProductDetailsParams.add(builder);
        queryProductDetailsParams = QueryProductDetailsParams.newBuilder().setProductList(queryProductDetailsParams).build();
        builder = this.billingClient;
        object = new SupportBillingActivity$5(this);
        builder.queryProductDetailsAsync(queryProductDetailsParams, (ProductDetailsResponseListener)object);
    }

    private void queryPurchases() {
        QueryPurchasesParams queryPurchasesParams = QueryPurchasesParams.newBuilder().setProductType("inapp").build();
        BillingClient billingClient = this.billingClient;
        SupportBillingActivity$$ExternalSyntheticLambda1 supportBillingActivity$$ExternalSyntheticLambda1 = new SupportBillingActivity$$ExternalSyntheticLambda1(this);
        billingClient.queryPurchasesAsync(queryPurchasesParams, (PurchasesResponseListener)supportBillingActivity$$ExternalSyntheticLambda1);
    }

    private void startBillingConnection() {
        BillingClient billingClient = this.billingClient;
        SupportBillingActivity$4 supportBillingActivity$4 = new SupportBillingActivity$4(this);
        billingClient.startConnection((BillingClientStateListener)supportBillingActivity$4);
    }

    private void thnks() {
        Intent intent = new Intent((Context)this, ThanksYouActivity.class);
        int n = this.price_select;
        Object object = (ButtonCustumFont)this.findViewById(n);
        StringBuilder stringBuilder = new StringBuilder("");
        object = ((Object)object.getText()).toString();
        object = stringBuilder.append((String)object).toString();
        intent.putExtra("price", (String)object);
        this.startActivity(intent);
    }

    private void updatePrice(String object, int n, int n2) {
        if (n == n2) {
            return;
        }
        ButtonCustumFont buttonCustumFont = this.btn_launch;
        if (buttonCustumFont != null) {
            Object object2 = this.mResources;
            int n3 = R$string.btn_launch_billing;
            object2 = object2.getString(n3);
            object = new Object[]{object};
            object = String.format((String)object2, object);
            buttonCustumFont.setText((CharSequence)object);
        }
        object = this.findViewById(n);
        int n4 = R$drawable.item_billing_select;
        object.setBackgroundResource(n4);
        object = this.findViewById(n2);
        n2 = R$drawable.item_billing;
        object.setBackgroundResource(n2);
        this.price_select = n;
    }

    private void updateUI(ProductDetails object) {
        Object object2 = object.getProductId();
        object = PriceFormatter.formatPrice(object.getOneTimePurchaseOfferDetails().getFormattedPrice());
        Object object3 = PRODUCT_ID_10$;
        int n = object2.equals(object3);
        if (n != 0) {
            object2 = this.view_price_10$;
            object2.setText((CharSequence)object);
        } else {
            object3 = PRODUCT_ID_50$;
            n = object2.equals(object3);
            if (n != 0) {
                this.view_price_50$.setText((CharSequence)object);
                object = this.btn_launch;
                object2 = this.mResources;
                n = R$string.btn_launch_billing;
                object2 = object2.getString(n);
                object3 = ((Object)this.view_price_50$.getText()).toString();
                object3 = new Object[]{object3};
                object2 = String.format(object2, object3);
                object.setText((CharSequence)object2);
            } else {
                object3 = PRODUCT_ID_100$;
                n = object2.equals(object3);
                if (n != 0) {
                    object2 = this.view_price_100$;
                    object2.setText((CharSequence)object);
                } else {
                    object3 = PRODUCT_ID_1000$;
                    boolean bl = object2.equals(object3);
                    if (bl) {
                        object2 = this.view_price_1000$;
                        object2.setText((CharSequence)object);
                    }
                }
            }
        }
    }

    protected void attachBaseContext(Context context) {
        context = LocaleHelper.onAttach(context);
        super.attachBaseContext(context);
    }

    /* synthetic */ void cfr_renamed_546(BillingResult billingResult, String string2) {
        int n = billingResult.getResponseCode();
        if (n == 0) {
            billingResult = Toast.makeText((Context)this, (CharSequence)"Purchase consumed successfully", (int)0);
            billingResult.show();
        } else {
            billingResult = Toast.makeText((Context)this, (CharSequence)"Error consuming purchase", (int)0);
            billingResult.show();
        }
    }

    /* synthetic */ void cfr_renamed_130(View object) {
        product_id_current = PRODUCT_ID_10$;
        object = ((Object)this.view_price_10$.getText()).toString();
        int n = R$id.view_10;
        int n2 = this.price_select;
        this.updatePrice((String)object, n, n2);
    }

    /* synthetic */ void cfr_renamed_272(View object) {
        product_id_current = PRODUCT_ID_50$;
        object = ((Object)this.view_price_50$.getText()).toString();
        int n = R$id.view_50;
        int n2 = this.price_select;
        this.updatePrice((String)object, n, n2);
    }

    /* synthetic */ void cfr_renamed_115(View object) {
        product_id_current = PRODUCT_ID_100$;
        object = ((Object)this.view_price_100$.getText()).toString();
        int n = R$id.view_100;
        int n2 = this.price_select;
        this.updatePrice((String)object, n, n2);
    }

    /* synthetic */ void cfr_renamed_547(View object) {
        product_id_current = PRODUCT_ID_1000$;
        object = ((Object)this.view_price_1000$.getText()).toString();
        int n = R$id.view_1000;
        int n2 = this.price_select;
        this.updatePrice((String)object, n, n2);
    }

    /* synthetic */ void cfr_renamed_548(BillingResult object, List list) {
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

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        int n = R$layout.activity_support_billing;
        this.setContentView(n);
        bundle = this.getOnBackPressedDispatcher();
        Object object = this.onBackPressedCallback;
        bundle.addCallback((LifecycleOwner)this, object);
        n = R$id.main;
        bundle = this.findViewById(n);
        object = new SupportBillingActivity$$ExternalSyntheticLambda6();
        ViewCompat.setOnApplyWindowInsetsListener((View)bundle, (OnApplyWindowInsetsListener)object);
        n = -1;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        bundle = this.getWindow();
        object = this.getWindow().getDecorView();
        bundle = WindowCompat.getInsetsController((Window)bundle, (View)object);
        boolean bl = true;
        bundle.setAppearanceLightStatusBars(bl);
        bundle.setAppearanceLightNavigationBars(bl);
        this.wakeLockAquire();
        bundle = this.getResources();
        this.mResources = bundle;
        if (bundle == null) {
            this.finish();
        }
        this.init();
        this.initImgBilling();
        n = R$id.btn_on_back;
        bundle = this.findViewById(n);
        object = new SupportBillingActivity$2(this);
        bundle.setOnClickListener((View.OnClickListener)object);
        bundle = BillingClient.newBuilder((Context)this).setListener((PurchasesUpdatedListener)this).enablePendingPurchases().build();
        this.billingClient = bundle;
        this.startBillingConnection();
    }

    public void onPurchasesUpdated(BillingResult object, List list) {
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

