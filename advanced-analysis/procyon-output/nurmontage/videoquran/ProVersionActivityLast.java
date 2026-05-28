// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.core.view.WindowInsetsControllerCompat;
import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import android.widget.Toast;
import hazem.nurmontage.videoquran.Utils.NetworkUtils;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import nl.dionsegijn.konfetti.core.models.Shape$DrawableShape;
import android.graphics.drawable.Drawable;
import nl.dionsegijn.konfetti.core.Position;
import nl.dionsegijn.konfetti.core.Position$Relative;
import java.util.Arrays;
import nl.dionsegijn.konfetti.core.models.Shape$Circle;
import nl.dionsegijn.konfetti.core.models.Shape$Square;
import nl.dionsegijn.konfetti.core.models.Shape;
import nl.dionsegijn.konfetti.core.PartyFactory;
import nl.dionsegijn.konfetti.core.emitter.Emitter;
import java.util.concurrent.TimeUnit;
import nl.dionsegijn.konfetti.xml.KonfettiView;
import nl.dionsegijn.konfetti.xml.image.ImageUtil;
import androidx.core.content.ContextCompat;
import com.android.billingclient.api.ProductDetails$PricingPhase;
import com.android.billingclient.api.BillingClientStateListener;
import hazem.nurmontage.videoquran.fragment.ProgressViewFragment;
import com.android.billingclient.api.QueryProductDetailsParams$Product$Builder;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryProductDetailsParams$Product;
import android.app.Activity;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingFlowParams$ProductDetailsParams;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.util.Log;
import com.android.billingclient.api.BillingResult;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import hazem.nurmontage.videoquran.model.ModelFeatures;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import android.view.View$OnClickListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentManager;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import java.util.Iterator;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.ProductDetails$SubscriptionOfferDetails;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryPurchasesParams;
import java.util.HashMap;
import com.android.billingclient.api.ProductDetails;
import java.util.List;
import java.util.Map;
import androidx.activity.OnBackPressedCallback;
import hazem.nurmontage.videoquran.model.Template;
import android.content.res.Resources;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.adabter.FeaturesAdabter;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.RelativeLayout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PurchasesUpdatedListener;

public class ProVersionActivityLast extends Base implements PurchasesUpdatedListener
{
    private static String PRODUCT_ID_FOREIVER = "sku.nurmontage.foreiver";
    private static String PRODUCT_ID_MONTH = "sku.nurmontage.month";
    private static String PRODUCT_ID_YEAR = "sku.nurmontage.year";
    private BillingClient billingClient;
    private ButtonCustumFont btnContinue;
    private RelativeLayout btn_foreiver;
    private RelativeLayout btn_month;
    private TextCustumFont btn_restore;
    private RelativeLayout btn_year;
    private int color_select;
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
    
    public ProVersionActivityLast() {
        this.color_select = -206036;
        this.onBackPressedCallback = new ProVersionActivityLast$1(this, true);
        this.productDetailsMap = new HashMap();
        this.product_id_current = ProVersionActivityLast.PRODUCT_ID_YEAR;
    }
    
    private void checkInAppPurchases() {
        this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), (PurchasesResponseListener)new ProVersionActivityLast$$ExternalSyntheticLambda4(this));
    }
    
    private void checkUserSubscriptionStatus() {
        this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("subs").build(), (PurchasesResponseListener)new ProVersionActivityLast$16(this));
    }
    
    private String findOfferToken(final ProductDetails productDetails) {
        final List subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
        if (subscriptionOfferDetails != null && !subscriptionOfferDetails.isEmpty()) {
            return ((ProductDetails$SubscriptionOfferDetails)subscriptionOfferDetails.get(0)).getOfferToken();
        }
        return null;
    }
    
    private void handleInAppPurchases(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final int purchaseState = ((Purchase)iterator.next()).getPurchaseState();
            final boolean b = true;
            if (purchaseState == (b ? 1 : 0)) {
                this.runOnUiThread((Runnable)new ProVersionActivityLast$18(this));
                BillingPreferences.saveSubscriptionStatus(this.getApplicationContext(), b);
                this.thnks();
                return;
            }
        }
        this.handleNoPurchases();
    }
    
    private void handleNoPurchases() {
        this.runOnUiThread((Runnable)new ProVersionActivityLast$19(this));
        BillingPreferences.saveSubscriptionStatus(this.getApplicationContext(), false);
    }
    
    private void handlePurchase(final Purchase purchase) {
        final int purchaseState = purchase.getPurchaseState();
        final boolean b = true;
        if (purchaseState == (b ? 1 : 0)) {
            if (!purchase.isAcknowledged()) {
                this.billingClient.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), (AcknowledgePurchaseResponseListener)new ProVersionActivityLast$$ExternalSyntheticLambda0());
                BillingPreferences.saveSubscriptionStatus(this.getApplicationContext(), b);
                this.playVibration();
                this.thnks();
            }
        }
        else if (purchase.getPurchaseState() == 2) {
            this.runOnUiThread((Runnable)new ProVersionActivityLast$13(this));
        }
        else {
            this.runOnUiThread((Runnable)new ProVersionActivityLast$14(this));
        }
    }
    
    private void handleSubscriptionPurchases(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final int purchaseState = ((Purchase)iterator.next()).getPurchaseState();
            final boolean b = true;
            if (purchaseState == (b ? 1 : 0)) {
                this.hideProgressFragment();
                BillingPreferences.saveSubscriptionStatus(this.getApplicationContext(), b);
                this.thnks();
                return;
            }
        }
        BillingPreferences.saveSubscriptionStatus(this.getApplicationContext(), false);
        this.checkInAppPurchases();
    }
    
    private void hideProgressFragment() {
        try {
            this.isClick = false;
            Label_0069: {
                if (this.isFinishing()) {
                    break Label_0069;
                }
                final FragmentManager supportFragmentManager = this.getSupportFragmentManager();
                try {
                    if (supportFragmentManager.isDestroyed()) {
                        break Label_0069;
                    }
                    final FragmentManager supportFragmentManager2 = this.getSupportFragmentManager();
                    try {
                        final FragmentTransaction beginTransaction = supportFragmentManager2.beginTransaction();
                        try {
                            final Fragment fragmentById = supportFragmentManager2.findFragmentById(R$id.container_progress);
                            if (fragmentById != null) {
                                beginTransaction.remove(fragmentById);
                            }
                            beginTransaction.commit();
                            this.findViewById(R$id.container_progress).setVisibility(8);
                        }
                        catch (final Exception ex) {}
                    }
                    catch (final Exception ex2) {}
                }
                catch (final Exception ex3) {}
            }
        }
        catch (final Exception ex4) {}
    }
    
    private void initBtnHelp() {
        this.findViewById(R$id.btn_contact).setOnClickListener((View$OnClickListener)new ProVersionActivityLast$8(this));
    }
    
    private void initImgFeatures() {
        this.findViewById(R$id.ytb_layout).setOnClickListener((View$OnClickListener)new ProVersionActivityLast$9(this));
        final boolean equals = LocaleHelper.getLanguage((Context)this).equals("ar");
        int i = 0;
        if (equals) {
            final TextCustumFont textCustumFont = (TextCustumFont)this.findViewById(R$id.tv_pro_ar);
            textCustumFont.setVisibility(0);
            textCustumFont.setText((CharSequence)this.mResources.getString(R$string.pro));
            final TextCustumFont textCustumFont2 = (TextCustumFont)this.findViewById(R$id.tv_free_ar);
            textCustumFont2.setVisibility(0);
            textCustumFont2.setText((CharSequence)this.mResources.getString(R$string.free));
            this.findViewById(R$id.tv_pro).setVisibility(8);
        }
        else {
            final TextCustumFont textCustumFont3 = (TextCustumFont)this.findViewById(R$id.tv_pro);
            textCustumFont3.setVisibility(0);
            textCustumFont3.setText((CharSequence)this.mResources.getString(R$string.pro));
            final TextCustumFont textCustumFont4 = (TextCustumFont)this.findViewById(R$id.tv_free);
            textCustumFont4.setVisibility(0);
            textCustumFont4.setText((CharSequence)this.mResources.getString(R$string.free));
        }
        ((TextCustumFont)this.findViewById(R$id.tv_tittle_billing)).setText((CharSequence)this.mResources.getString(R$string.unlock_premium));
        final RecyclerView recyclerView = (RecyclerView)this.findViewById(R$id.rv);
        final boolean b = true;
        recyclerView.setHasFixedSize(b);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(b);
        recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
        recyclerView.setLayoutManager((RecyclerView$LayoutManager)new LinearLayoutManager((Context)this));
        final ArrayList list = new ArrayList();
        for (String[] stringArray = this.mResources.getStringArray(R$array.feature_list); i < stringArray.length; ++i) {
            if (i != 0 && i != (b ? 1 : 0)) {
                list.add(new ModelFeatures(stringArray[i]));
            }
            else {
                list.add(new ModelFeatures(stringArray[i], b));
            }
        }
        recyclerView.setAdapter((RecyclerView$Adapter)(this.featuresAdabter = new FeaturesAdabter(list)));
    }
    
    private boolean isGmailAvailable(final Context context) {
        final Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.setPackage("com.google.android.gm");
        return context.getPackageManager().queryIntentActivities(intent, 0).isEmpty() ^ true;
    }
    
    private void launchPurchaseFlowINAPP(final ProductDetails productDetails) {
        final ArrayList productDetailsParamsList = new ArrayList();
        productDetailsParamsList.add(BillingFlowParams$ProductDetailsParams.newBuilder().setProductDetails(productDetails).build());
        this.billingClient.launchBillingFlow((Activity)this, BillingFlowParams.newBuilder().setProductDetailsParamsList((List)productDetailsParamsList).build());
    }
    
    private void launchPurchaseFlowSUB(final ProductDetails productDetails) {
        final String offerToken = this.findOfferToken(productDetails);
        if (offerToken == null) {
            return;
        }
        final ArrayList productDetailsParamsList = new ArrayList();
        productDetailsParamsList.add(BillingFlowParams$ProductDetailsParams.newBuilder().setProductDetails(productDetails).setOfferToken(offerToken).build());
        this.billingClient.launchBillingFlow((Activity)this, BillingFlowParams.newBuilder().setProductDetailsParamsList((List)productDetailsParamsList).build());
    }
    
    private void playVibration() {
        this.runOnUiThread((Runnable)new ProVersionActivityLast$20(this));
    }
    
    private void queryProducts() {
        final ArrayList productList = new ArrayList();
        productList.add(QueryProductDetailsParams$Product.newBuilder().setProductId(ProVersionActivityLast.PRODUCT_ID_FOREIVER).setProductType("inapp").build());
        this.billingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList((List)productList).build(), (ProductDetailsResponseListener)new ProVersionActivityLast$11(this));
    }
    
    private void queryPurchases() {
        this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), (PurchasesResponseListener)new ProVersionActivityLast$$ExternalSyntheticLambda1(this));
    }
    
    private void querySubscribe() {
        final ArrayList productList = new ArrayList();
        final QueryProductDetailsParams$Product$Builder setProductId = QueryProductDetailsParams$Product.newBuilder().setProductId(ProVersionActivityLast.PRODUCT_ID_YEAR);
        final String s = "subs";
        productList.add(setProductId.setProductType(s).build());
        productList.add(QueryProductDetailsParams$Product.newBuilder().setProductId(ProVersionActivityLast.PRODUCT_ID_MONTH).setProductType(s).build());
        this.billingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList((List)productList).build(), (ProductDetailsResponseListener)new ProVersionActivityLast$12(this));
    }
    
    private void queryUserPurchases() {
        this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), (PurchasesResponseListener)new ProVersionActivityLast$$ExternalSyntheticLambda3(this));
    }
    
    private void showProgress() {
        try {
            this.findViewById(R$id.container_progress).setVisibility(0);
            if (this.isFinishing()) {
                return;
            }
            final FragmentManager supportFragmentManager = this.getSupportFragmentManager();
            try {
                if (supportFragmentManager.isDestroyed()) {
                    return;
                }
                final FragmentManager supportFragmentManager2 = this.getSupportFragmentManager();
                try {
                    final FragmentTransaction beginTransaction = supportFragmentManager2.beginTransaction();
                    try {
                        final int container_progress = R$id.container_progress;
                        try {
                            beginTransaction.replace(container_progress, (Fragment)ProgressViewFragment.getInstance());
                            beginTransaction.commit();
                        }
                        catch (final Exception ex) {}
                    }
                    catch (final Exception ex2) {}
                }
                catch (final Exception ex3) {}
            }
            catch (final Exception ex4) {}
        }
        catch (final Exception ex5) {}
    }
    
    private void startBillingConnection() {
        this.billingClient.startConnection((BillingClientStateListener)new ProVersionActivityLast$10(this));
    }
    
    private void thnks() {
        try {
            final ProVersionActivityLast$15 proVersionActivityLast$15 = new ProVersionActivityLast$15(this);
            try {
                this.runOnUiThread((Runnable)proVersionActivityLast$15);
            }
            catch (final Exception ex) {}
        }
        catch (final Exception ex2) {}
    }
    
    private void toTrackAct() {
        final Intent intent = new Intent((Context)this, (Class)EngineActivity.class);
        final Template mTemplate = this.mTemplate;
        if (mTemplate != null) {
            intent.putExtra("template", mTemplate.getIdTemplate());
        }
        intent.addFlags(65536);
        this.startActivity(intent);
        this.overridePendingTransition(0, 0);
    }
    
    private void updateUI(final ProductDetails productDetails) {
        final boolean equals = productDetails.getProductType().equals("inapp");
        String s = null;
        String text = "N/A";
        if (equals) {
            if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                s = productDetails.getOneTimePurchaseOfferDetails().getFormattedPrice();
            }
            final TextCustumFont tv_price_foreiver = this.tv_price_foreiver;
            if (s != null) {
                text = s;
            }
            tv_price_foreiver.setText((CharSequence)text);
        }
        else if (productDetails.getProductType().equals("subs")) {
            if (productDetails.getSubscriptionOfferDetails() != null && !productDetails.getSubscriptionOfferDetails().isEmpty()) {
                final ProductDetails$SubscriptionOfferDetails productDetails$SubscriptionOfferDetails = productDetails.getSubscriptionOfferDetails().get(0);
                if (productDetails$SubscriptionOfferDetails.getPricingPhases() != null && !productDetails$SubscriptionOfferDetails.getPricingPhases().getPricingPhaseList().isEmpty()) {
                    s = ((ProductDetails$PricingPhase)productDetails$SubscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0)).getFormattedPrice();
                }
            }
            final String productId = productDetails.getProductId();
            if (ProVersionActivityLast.PRODUCT_ID_YEAR.equals(productId)) {
                final TextCustumFont tv_price_year = this.tv_price_year;
                if (s != null) {
                    text = s;
                }
                tv_price_year.setText((CharSequence)text);
            }
            else if (ProVersionActivityLast.PRODUCT_ID_MONTH.equals(productId)) {
                final TextCustumFont tv_price_month = this.tv_price_month;
                if (s != null) {
                    text = s;
                }
                tv_price_month.setText((CharSequence)text);
            }
        }
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
        final String[] array = { "hazemourari08@gmail.com" };
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
    
    public void explode() {
        final Drawable drawable = ContextCompat.getDrawable(this.getApplicationContext(), R$drawable.favorite_24px);
        final int n = 1;
        final Shape$DrawableShape loadDrawable = ImageUtil.loadDrawable(drawable, (boolean)(n != 0), (boolean)(n != 0));
        final KonfettiView konfettiView = (KonfettiView)this.findViewById(R$id.konfettiView);
        konfettiView.setVisibility(0);
        final PartyFactory spread = new PartyFactory(new Emitter(2800L, TimeUnit.MILLISECONDS).max(300)).spread(360);
        final int n2 = 3;
        final Shape[] a = new Shape[n2];
        a[0] = (Shape)Shape$Square.INSTANCE;
        a[n] = (Shape)Shape$Circle.INSTANCE;
        final int n3 = 2;
        a[n3] = (Shape)loadDrawable;
        final PartyFactory shapes = spread.shapes((List)Arrays.asList(a));
        final Integer[] a2 = new Integer[4];
        a2[0] = 16572810;
        a2[n] = 16740973;
        a2[n3] = 16003181;
        a2[n2] = 11832815;
        konfettiView.start(shapes.colors((List)Arrays.asList(a2)).setSpeedBetween(0.0f, 30.0f).position((Position)new Position$Relative(0.5, 0.3)).build());
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_pro_version);
        final int n = -15658732;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new ProVersionActivityLast$$ExternalSyntheticLambda2());
        final Resources resources = this.getResources();
        this.mResources = resources;
        if (resources == null) {
            this.finish();
        }
        if (!NetworkUtils.isNetworkAvailable((Context)this)) {
            Toast.makeText((Context)this, (CharSequence)this.mResources.getString(R$string.no_internet), 0).show();
        }
        this.wakeLockAquire();
        if (this.getIntent() != null) {
            final String stringExtra = this.getIntent().getStringExtra("template");
            if (stringExtra != null) {
                this.mTemplate = (Template)LocalPersistence.readObjectFromFile((Context)this, stringExtra);
            }
        }
        this.findViewById(R$id.btn_on_back).setOnClickListener((View$OnClickListener)new ProVersionActivityLast$2(this));
        final boolean subscribed = BillingPreferences.isSubscribed(this.getApplicationContext());
        this.initImgFeatures();
        this.initBtnHelp();
        if (subscribed) {
            this.thnks();
            return;
        }
        this.billingClient = BillingClient.newBuilder((Context)this).setListener((PurchasesUpdatedListener)this).enablePendingPurchases().build();
        this.startBillingConnection();
        this.btn_restore.setText((CharSequence)this.mResources.getString(R$string.restort_subscribe));
        this.btn_restore.setOnClickListener((View$OnClickListener)new ProVersionActivityLast$3(this));
        this.tv_foreiver = (TextCustumFont)this.findViewById(R$id.tv_foreiver);
        this.tv_price_year = (TextCustumFont)this.findViewById(R$id.tv_price_year);
        this.tv_price_foreiver = (TextCustumFont)this.findViewById(R$id.tv_price_foreiver);
        this.btn_foreiver = (RelativeLayout)this.findViewById(R$id.btn_foreiver);
        this.btn_year = (RelativeLayout)this.findViewById(R$id.btn_year);
        this.ivForeiver = (ImageView)this.findViewById(R$id.btn_radio_foreiver);
        this.ivYear = (ImageView)this.findViewById(R$id.btn_radio_year);
        this.btn_foreiver.setOnClickListener((View$OnClickListener)new ProVersionActivityLast$4(this));
        this.btn_year.setOnClickListener((View$OnClickListener)new ProVersionActivityLast$5(this));
        this.btn_month.setOnClickListener((View$OnClickListener)new ProVersionActivityLast$6(this));
        (this.btnContinue = (ButtonCustumFont)this.findViewById(R$id.btn_continue)).setText((CharSequence)this.mResources.getString(R$string.subscribe_now));
        this.btnContinue.setOnClickListener((View$OnClickListener)new ProVersionActivityLast$7(this));
    }
    
    protected void onDestroy() {
        super.onDestroy();
        final BillingClient billingClient = this.billingClient;
        if (billingClient != null && billingClient.isReady()) {
            this.billingClient.endConnection();
        }
    }
    
    public void onPurchasesUpdated(final BillingResult billingResult, final List list) {
        this.hideProgressFragment();
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
