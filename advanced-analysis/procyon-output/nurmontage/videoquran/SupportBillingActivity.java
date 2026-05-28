// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import java.util.Iterator;
import com.android.billingclient.api.BillingResult;
import hazem.nurmontage.videoquran.Utils.PriceFormatter;
import android.content.Intent;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryPurchasesParams;
import com.android.billingclient.api.QueryProductDetailsParams$Product$Builder;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryProductDetailsParams$Product;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingFlowParams$ProductDetailsParams;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import hazem.nurmontage.videoquran.adabter.AboutAdabters;
import android.app.Activity;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;
import hazem.nurmontage.videoquran.Utils.AppUtils;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import hazem.nurmontage.videoquran.Utils.NonScrollableLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.adabter.AboutAdabters$ModelAbout;
import android.util.Pair;
import java.util.ArrayList;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import android.content.Context;
import android.widget.Toast;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.Purchase;
import java.util.HashMap;
import com.android.billingclient.api.ProductDetails;
import java.util.Map;
import androidx.activity.OnBackPressedCallback;
import android.content.res.Resources;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PurchasesUpdatedListener;

public class SupportBillingActivity extends Base implements PurchasesUpdatedListener
{
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
    
    public SupportBillingActivity() {
        this.price_select = R$id.view_50;
        this.productDetailsMap = new HashMap();
        this.onBackPressedCallback = new SupportBillingActivity$1(this, true);
    }
    
    private void handlePurchase(final Purchase purchase) {
        if (purchase.getPurchaseState() == 1) {
            this.thnks();
            if (!purchase.isAcknowledged()) {
                this.billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), (ConsumeResponseListener)new SupportBillingActivity$$ExternalSyntheticLambda0(this));
            }
        }
        else if (purchase.getPurchaseState() == 2) {
            Toast.makeText((Context)this, (CharSequence)"Purchase is pending", 0).show();
        }
        else {
            Toast.makeText((Context)this, (CharSequence)"Purchase is in unknown state", 0).show();
        }
    }
    
    private void init() {
        final String language = LocaleHelper.getLanguage(this.getApplicationContext());
        final TextCustumFont textCustumFont = (TextCustumFont)this.findViewById(R$id.tv_aya);
        textCustumFont.setText((CharSequence)this.mResources.getString(R$string.tittle_billing));
        final String s = "ar";
        if (language.equals(s)) {
            textCustumFont.setTextSize(2, 16.0f);
        }
        final ArrayList list = new ArrayList();
        int i;
        if (language.equals(s)) {
            i = 5;
        }
        else {
            i = 8388611;
        }
        final String str = "<font color='#000000'>";
        final StringBuilder append = new StringBuilder(str).append(this.mResources.getString(R$string.about_question_1));
        final String str2 = "</font>";
        final Pair pair = new Pair((Object)append.append(str2).toString(), (Object)i);
        final int n = 14;
        list.add(new AboutAdabters$ModelAbout(n, pair));
        final Integer value = i;
        final String s2 = "\n";
        list.add(new AboutAdabters$ModelAbout(n, new Pair((Object)s2, (Object)value)));
        list.add(new AboutAdabters$ModelAbout(n, new Pair((Object)(str + this.mResources.getString(R$string.about_question_2) + str2), (Object)i)));
        list.add(new AboutAdabters$ModelAbout(n, new Pair((Object)s2, (Object)i)));
        list.add(new AboutAdabters$ModelAbout(n, new Pair((Object)(str + this.mResources.getString(R$string.about_question_3) + str2), (Object)i)));
        list.add(new AboutAdabters$ModelAbout(n, new Pair((Object)"\n\n", (Object)i)));
        list.add(new AboutAdabters$ModelAbout(n, new Pair((Object)(str + this.mResources.getString(R$string.about_no_ads) + str2), (Object)i)));
        list.add(new AboutAdabters$ModelAbout(n, new Pair((Object)s2, (Object)i)));
        list.add(new AboutAdabters$ModelAbout(n, new Pair((Object)(str + this.mResources.getString(R$string.about_cost_explanation) + str2), (Object)i)));
        final RecyclerView recyclerView = (RecyclerView)this.findViewById(R$id.rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager((RecyclerView$LayoutManager)new NonScrollableLinearLayoutManager((Context)this));
        recyclerView.setAdapter((RecyclerView$Adapter)new AboutAdabters((Context)this, AppUtils.getAppVersionName((Context)this), list, ScreenUtils.getScreenWidth((Activity)this), (int)(ScreenUtils.getScreenWidth((Activity)this) * 0.4f)));
        this.view_price_10$ = (ButtonCustumFont)this.findViewById(R$id.view_10);
        this.view_price_50$ = (ButtonCustumFont)this.findViewById(R$id.view_50);
        this.view_price_100$ = (ButtonCustumFont)this.findViewById(R$id.view_100);
        this.view_price_1000$ = (ButtonCustumFont)this.findViewById(R$id.view_1000);
        this.btn_launch = (ButtonCustumFont)this.findViewById(R$id.btn_launch);
        this.view_price_10$.setOnClickListener((View$OnClickListener)new SupportBillingActivity$$ExternalSyntheticLambda2(this));
        this.view_price_50$.setOnClickListener((View$OnClickListener)new SupportBillingActivity$$ExternalSyntheticLambda3(this));
        this.view_price_100$.setOnClickListener((View$OnClickListener)new SupportBillingActivity$$ExternalSyntheticLambda4(this));
        this.view_price_1000$.setOnClickListener((View$OnClickListener)new SupportBillingActivity$$ExternalSyntheticLambda5(this));
        this.btn_launch.setOnClickListener((View$OnClickListener)new SupportBillingActivity$3(this));
    }
    
    private void initImgBilling() {
        final ImageView imageView = (ImageView)this.findViewById(R$id.iv_billing);
        ScreenUtils.getScreenWidth((Activity)this);
    }
    
    private void launchPurchaseFlow(final String s) {
        final ProductDetails productDetails = this.productDetailsMap.get(s);
        if (productDetails == null) {
            return;
        }
        final ArrayList productDetailsParamsList = new ArrayList();
        productDetailsParamsList.add(BillingFlowParams$ProductDetailsParams.newBuilder().setProductDetails(productDetails).build());
        this.billingClient.launchBillingFlow((Activity)this, BillingFlowParams.newBuilder().setProductDetailsParamsList((List)productDetailsParamsList).build());
    }
    
    private void queryProducts() {
        final ArrayList productList = new ArrayList();
        final QueryProductDetailsParams$Product$Builder setProductId = QueryProductDetailsParams$Product.newBuilder().setProductId(SupportBillingActivity.PRODUCT_ID_10$);
        final String s = "inapp";
        productList.add(setProductId.setProductType(s).build());
        productList.add(QueryProductDetailsParams$Product.newBuilder().setProductId(SupportBillingActivity.PRODUCT_ID_50$).setProductType(s).build());
        productList.add(QueryProductDetailsParams$Product.newBuilder().setProductId(SupportBillingActivity.PRODUCT_ID_100$).setProductType(s).build());
        productList.add(QueryProductDetailsParams$Product.newBuilder().setProductId(SupportBillingActivity.PRODUCT_ID_1000$).setProductType(s).build());
        this.billingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList((List)productList).build(), (ProductDetailsResponseListener)new SupportBillingActivity$5(this));
    }
    
    private void queryPurchases() {
        this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), (PurchasesResponseListener)new SupportBillingActivity$$ExternalSyntheticLambda1(this));
    }
    
    private void startBillingConnection() {
        this.billingClient.startConnection((BillingClientStateListener)new SupportBillingActivity$4(this));
    }
    
    private void thnks() {
        final Intent intent = new Intent((Context)this, (Class)ThanksYouActivity.class);
        intent.putExtra("price", "" + ((ButtonCustumFont)this.findViewById(this.price_select)).getText().toString());
        this.startActivity(intent);
    }
    
    private void updatePrice(String format, final int price_select, int item_billing) {
        if (price_select == item_billing) {
            return;
        }
        final ButtonCustumFont btn_launch = this.btn_launch;
        if (btn_launch != null) {
            format = String.format(this.mResources.getString(R$string.btn_launch_billing), format);
            btn_launch.setText((CharSequence)format);
        }
        this.findViewById(price_select).setBackgroundResource(R$drawable.item_billing_select);
        final View viewById = this.findViewById(item_billing);
        item_billing = R$drawable.item_billing;
        viewById.setBackgroundResource(item_billing);
        this.price_select = price_select;
    }
    
    private void updateUI(final ProductDetails productDetails) {
        final String productId = productDetails.getProductId();
        final String formatPrice = PriceFormatter.formatPrice(productDetails.getOneTimePurchaseOfferDetails().getFormattedPrice());
        if (productId.equals(SupportBillingActivity.PRODUCT_ID_10$)) {
            this.view_price_10$.setText((CharSequence)formatPrice);
        }
        else if (productId.equals(SupportBillingActivity.PRODUCT_ID_50$)) {
            this.view_price_50$.setText((CharSequence)formatPrice);
            this.btn_launch.setText((CharSequence)String.format(this.mResources.getString(R$string.btn_launch_billing), this.view_price_50$.getText().toString()));
        }
        else if (productId.equals(SupportBillingActivity.PRODUCT_ID_100$)) {
            this.view_price_100$.setText((CharSequence)formatPrice);
        }
        else if (productId.equals(SupportBillingActivity.PRODUCT_ID_1000$)) {
            this.view_price_1000$.setText((CharSequence)formatPrice);
        }
    }
    
    protected void attachBaseContext(Context onAttach) {
        onAttach = LocaleHelper.onAttach(onAttach);
        super.attachBaseContext(onAttach);
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_support_billing);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new SupportBillingActivity$$ExternalSyntheticLambda6());
        final int n = -1;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        final boolean b = true;
        insetsController.setAppearanceLightStatusBars(b);
        insetsController.setAppearanceLightNavigationBars(b);
        this.wakeLockAquire();
        final Resources resources = this.getResources();
        this.mResources = resources;
        if (resources == null) {
            this.finish();
        }
        this.init();
        this.initImgBilling();
        this.findViewById(R$id.btn_on_back).setOnClickListener((View$OnClickListener)new SupportBillingActivity$2(this));
        this.billingClient = BillingClient.newBuilder((Context)this).setListener((PurchasesUpdatedListener)this).enablePendingPurchases().build();
        this.startBillingConnection();
    }
    
    public void onPurchasesUpdated(final BillingResult billingResult, final List list) {
        if (billingResult.getResponseCode() == 0 && list != null) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                this.handlePurchase((Purchase)iterator.next());
            }
        }
        else {
            billingResult.getResponseCode();
        }
    }
}
