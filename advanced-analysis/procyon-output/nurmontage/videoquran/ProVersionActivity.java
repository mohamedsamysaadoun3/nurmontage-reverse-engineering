// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.core.view.WindowInsetsControllerCompat;
import android.widget.Toast;
import hazem.nurmontage.videoquran.Utils.NetworkUtils;
import hazem.nurmontage.videoquran.Utils.LocalPersistence;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import nl.dionsegijn.konfetti.core.models.Shape$DrawableShape;
import nl.dionsegijn.konfetti.core.Position;
import nl.dionsegijn.konfetti.core.Position$Relative;
import java.util.Arrays;
import nl.dionsegijn.konfetti.core.PartyFactory;
import nl.dionsegijn.konfetti.core.emitter.Emitter;
import java.util.concurrent.TimeUnit;
import nl.dionsegijn.konfetti.xml.KonfettiView;
import nl.dionsegijn.konfetti.xml.image.ImageUtil;
import androidx.core.content.ContextCompat;
import com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import com.android.billingclient.api.ProductDetails$PricingPhase;
import com.android.billingclient.api.BillingClientStateListener;
import hazem.nurmontage.videoquran.fragment.ProgressViewFragment;
import android.view.Window;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
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
import androidx.recyclerview.widget.RecyclerView$Adapter;
import hazem.nurmontage.videoquran.model.ModelFeatures;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View$OnClickListener;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentManager;
import android.net.Uri;
import android.content.Intent;
import java.util.Iterator;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.Purchase;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import java.util.Currency;
import java.text.NumberFormat;
import java.util.Locale;
import com.android.billingclient.api.ProductDetails$SubscriptionOfferDetails;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryPurchasesParams;
import android.os.Looper;
import java.util.HashMap;
import com.android.billingclient.api.ProductDetails;
import java.util.List;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import android.widget.TextView;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import androidx.activity.OnBackPressedCallback;
import hazem.nurmontage.videoquran.model.Template;
import android.content.res.Resources;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.adabter.FeaturesAdabter;
import android.app.Dialog;
import android.widget.Button;
import com.google.android.material.card.MaterialCardView;
import hazem.nurmontage.videoquran.views.ButtonCustumFontBilling;
import com.android.billingclient.api.BillingClient;
import android.os.Handler;
import com.android.billingclient.api.PurchasesUpdatedListener;

public class ProVersionActivity extends Base implements PurchasesUpdatedListener
{
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
    
    public ProVersionActivity() {
        this.color_select = -1;
        this.onBackPressedCallback = new ProVersionActivity$1(this, true);
        this.productDetailsMap = new HashMap();
        this.product_id_current = ProVersionActivity.PRODUCT_ID_YEAR;
        this.autoScrollHandler = new Handler(Looper.getMainLooper());
        this.isUserScrolling = false;
        this.autoScrollRunnable = new ProVersionActivity$15(this);
    }
    
    private void cancelDialog() {
        final Dialog dialog = this.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.dialog = null;
    }
    
    private void checkInAppPurchases() {
        this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), (PurchasesResponseListener)new ProVersionActivity$$ExternalSyntheticLambda5(this));
    }
    
    private void checkUserSubscriptionStatus() {
        this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("subs").build(), (PurchasesResponseListener)new ProVersionActivity$17(this));
    }
    
    private String findOfferToken(final ProductDetails productDetails) {
        final List subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
        if (subscriptionOfferDetails != null && !subscriptionOfferDetails.isEmpty()) {
            return ((ProductDetails$SubscriptionOfferDetails)subscriptionOfferDetails.get(0)).getOfferToken();
        }
        return null;
    }
    
    private String formatPriceWithSymbol(final long n, final String currencyCode) {
        final double number = n / 1000000.0;
        final NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
        currencyInstance.setCurrency(Currency.getInstance(currencyCode));
        final int n2 = 2;
        currencyInstance.setMaximumFractionDigits(n2);
        currencyInstance.setMinimumFractionDigits(n2);
        return currencyInstance.format(number);
    }
    
    private void handleNoPurchases() {
        this.runOnUiThread((Runnable)new ProVersionActivity$19(this));
        BillingPreferences.saveSubscriptionStatus(this.getApplicationContext(), false);
    }
    
    private void handlePurchase(final Purchase purchase) {
        final int purchaseState = purchase.getPurchaseState();
        final boolean b = true;
        if (purchaseState == (b ? 1 : 0)) {
            if (!purchase.isAcknowledged()) {
                this.billingClient.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), (AcknowledgePurchaseResponseListener)new ProVersionActivity$$ExternalSyntheticLambda6());
                BillingPreferences.saveSubscriptionStatus(this.getApplicationContext(), b);
                this.playVibration();
                this.thnks();
            }
        }
        else if (purchase.getPurchaseState() == 2) {
            this.runOnUiThread((Runnable)new ProVersionActivity$12(this));
        }
        else {
            this.runOnUiThread((Runnable)new ProVersionActivity$13(this));
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
    
    private void initBtnHelp(final boolean b) {
        this.findViewById(R$id.layout_help).setVisibility(0);
        final Typeface fromAsset = Typeface.createFromAsset(this.getResources().getAssets(), "fonts/ReadexPro_Medium.ttf");
        final Button button = (Button)this.findViewById(R$id.btn_help);
        button.setTypeface(fromAsset);
        button.setOnClickListener((View$OnClickListener)new ProVersionActivity$8(this));
    }
    
    private void initImgFeatures() {
        final RecyclerView recyclerView = (RecyclerView)this.findViewById(R$id.rv);
        recyclerView.setLayoutManager((RecyclerView$LayoutManager)new LinearLayoutManager((Context)this));
        int i = 0;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(false);
        recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
        final ArrayList list = new ArrayList();
        for (String[] stringArray = this.mResources.getStringArray(R$array.feature_list); i < stringArray.length; ++i) {
            list.add(new ModelFeatures(stringArray[i]));
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
        this.runOnUiThread((Runnable)new ProVersionActivity$20(this));
    }
    
    private void queryProducts() {
        final ArrayList productList = new ArrayList();
        productList.add(QueryProductDetailsParams$Product.newBuilder().setProductId(ProVersionActivity.PRODUCT_ID_FOREIVER).setProductType("inapp").build());
        this.billingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList((List)productList).build(), (ProductDetailsResponseListener)new ProVersionActivity$10(this));
    }
    
    private void queryPurchases() {
        this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), (PurchasesResponseListener)new ProVersionActivity$$ExternalSyntheticLambda4(this));
    }
    
    private void querySubscribe() {
        final ArrayList productList = new ArrayList();
        final QueryProductDetailsParams$Product$Builder setProductId = QueryProductDetailsParams$Product.newBuilder().setProductId(ProVersionActivity.PRODUCT_ID_YEAR);
        final String s = "subs";
        productList.add(setProductId.setProductType(s).build());
        productList.add(QueryProductDetailsParams$Product.newBuilder().setProductId(ProVersionActivity.PRODUCT_ID_MONTH).setProductType(s).build());
        this.billingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList((List)productList).build(), (ProductDetailsResponseListener)new ProVersionActivity$11(this));
    }
    
    private void queryUserPurchases() {
        this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), (PurchasesResponseListener)new ProVersionActivity$$ExternalSyntheticLambda2(this));
    }
    
    private void setupImg() {
        (this.recyclerView = (RecyclerView)this.findViewById(R$id.rv_img)).post((Runnable)new ProVersionActivity$16(this));
    }
    
    private void showFeatures() {
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
                                    final View inflate = from.inflate(R$layout.layout_dialog_premuim, (ViewGroup)null);
                                    try {
                                        this.dialog.setContentView(inflate);
                                        inflate.findViewById(R$id.dialog_title).setVisibility(8);
                                        final View viewById = inflate.findViewById(R$id.dialog_no);
                                        try {
                                            final ProVersionActivity$7 onClickListener = new ProVersionActivity$7(this);
                                            final View view = viewById;
                                            try {
                                                view.setOnClickListener((View$OnClickListener)onClickListener);
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
    
    private void showProgress() {
        this.findViewById(R$id.container_progress).setVisibility(0);
        if (!this.isFinishing() && !this.getSupportFragmentManager().isDestroyed()) {
            final FragmentTransaction beginTransaction = this.getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(R$id.container_progress, (Fragment)ProgressViewFragment.getInstance());
            beginTransaction.commit();
        }
    }
    
    private void startAutoScroll() {
        try {
            final Handler autoScrollHandler = this.autoScrollHandler;
            try {
                autoScrollHandler.removeCallbacks(this.autoScrollRunnable);
                final Handler autoScrollHandler2 = this.autoScrollHandler;
                try {
                    autoScrollHandler2.postDelayed(this.autoScrollRunnable, 250L);
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {}
    }
    
    private void startBillingConnection() {
        this.billingClient.startConnection((BillingClientStateListener)new ProVersionActivity$9(this));
    }
    
    private void stopAutoScroll() {
        final Handler autoScrollHandler = this.autoScrollHandler;
        if (autoScrollHandler != null) {
            final Runnable autoScrollRunnable = this.autoScrollRunnable;
            if (autoScrollRunnable != null) {
                autoScrollHandler.removeCallbacks(autoScrollRunnable);
            }
        }
    }
    
    private void thnks() {
        try {
            final ProVersionActivity$14 proVersionActivity$14 = new ProVersionActivity$14(this);
            try {
                this.runOnUiThread((Runnable)proVersionActivity$14);
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
        if (productDetails.getProductType().equals("inapp")) {
            final ProductDetails$OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
            if (oneTimePurchaseOfferDetails != null) {
                this.tv_price_foreiver.setText((CharSequence)this.formatPriceWithSymbol(oneTimePurchaseOfferDetails.getPriceAmountMicros(), oneTimePurchaseOfferDetails.getPriceCurrencyCode()));
            }
            else {
                this.tv_price_foreiver.setText((CharSequence)"N/A");
            }
        }
        else if (productDetails.getProductType().equals("subs")) {
            final ProductDetails$PricingPhase productDetails$PricingPhase = productDetails.getSubscriptionOfferDetails().get(0).getPricingPhases().getPricingPhaseList().get(0);
            final long priceAmountMicros = productDetails$PricingPhase.getPriceAmountMicros();
            final String priceCurrencyCode = productDetails$PricingPhase.getPriceCurrencyCode();
            final String productId = productDetails.getProductId();
            if (ProVersionActivity.PRODUCT_ID_YEAR.equals(productId)) {
                this.tv_price_year.setText((CharSequence)this.formatPriceWithSymbol(priceAmountMicros, priceCurrencyCode));
                final String formatPriceWithSymbol = this.formatPriceWithSymbol(Math.round(priceAmountMicros / 12.0), priceCurrencyCode);
                final StringBuilder text = new StringBuilder();
                if (LocaleHelper.getLanguage(this.getApplicationContext()).equals("ar")) {
                    text.append("\u0641\u0642\u0637 ").append(formatPriceWithSymbol).append(" /\u0634\u0647\u0631");
                }
                else {
                    text.append("Only ").append(formatPriceWithSymbol).append(" /month");
                }
                this.tvByMonth.setText((CharSequence)text);
            }
            else if (ProVersionActivity.PRODUCT_ID_MONTH.equals(productId)) {
                this.tv_price_foreiver.setText((CharSequence)this.formatPriceWithSymbol(priceAmountMicros, priceCurrencyCode));
            }
        }
    }
    
    private void updateUILast(final ProductDetails productDetails) {
        final boolean equals = productDetails.getProductType().equals("inapp");
        String s = "N/A";
        String s2 = null;
        if (equals) {
            if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                s2 = productDetails.getOneTimePurchaseOfferDetails().getFormattedPrice();
            }
            final TextCustumFontBold tv_price_foreiver = this.tv_price_foreiver;
            if (s2 != null) {
                s = s2;
            }
            tv_price_foreiver.setText((CharSequence)s);
        }
        else if (productDetails.getProductType().equals("subs")) {
            if (productDetails.getSubscriptionOfferDetails() != null && !productDetails.getSubscriptionOfferDetails().isEmpty()) {
                final ProductDetails$SubscriptionOfferDetails productDetails$SubscriptionOfferDetails = productDetails.getSubscriptionOfferDetails().get(0);
                if (productDetails$SubscriptionOfferDetails.getPricingPhases() != null && !productDetails$SubscriptionOfferDetails.getPricingPhases().getPricingPhaseList().isEmpty()) {
                    s2 = ((ProductDetails$PricingPhase)productDetails$SubscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0)).getFormattedPrice();
                }
            }
            if (ProVersionActivity.PRODUCT_ID_YEAR.equals(productDetails.getProductId())) {
                final TextCustumFontBold tv_price_year = this.tv_price_year;
                if (s2 != null) {
                    s = s2;
                }
                tv_price_year.setText((CharSequence)s);
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
    
    public void explode() {
        final Drawable drawable = ContextCompat.getDrawable(this.getApplicationContext(), R$drawable.ic_heart);
        final int n = 1;
        final Shape$DrawableShape loadDrawable = ImageUtil.loadDrawable(drawable, (boolean)(n != 0), (boolean)(n != 0));
        final KonfettiView konfettiView = (KonfettiView)this.findViewById(R$id.konfettiView);
        konfettiView.setVisibility(0);
        final PartyFactory shapes = new PartyFactory(new Emitter(3500L, TimeUnit.MILLISECONDS).max(300)).spread(360).shapes(ProVersionActivity$$ExternalSyntheticBackport0.m(loadDrawable));
        final Integer[] a = new Integer[4];
        a[0] = -1216136524;
        final Integer value = -1124760279;
        a[n] = value;
        a[2] = -2019220;
        a[3] = value;
        konfettiView.start(shapes.colors((List)Arrays.asList(a)).setSpeedBetween(0.0f, 30.0f).position((Position)new Position$Relative(0.5, 0.3)).build());
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_pro_version);
        final int n = -16777216;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new ProVersionActivity$$ExternalSyntheticLambda3());
        final Resources resources = this.getResources();
        this.mResources = resources;
        if (resources == null) {
            this.finish();
        }
        this.wakeLockAquire();
        ((TextView)this.findViewById(R$id.mtittle)).setText((CharSequence)this.mResources.getString(R$string.enjoy_all_premium_features));
        ((TextView)this.findViewById(R$id.hint_review)).setText((CharSequence)this.mResources.getString(R$string._4_8_434_reviews_28k_users));
        if (this.getIntent() != null) {
            final String stringExtra = this.getIntent().getStringExtra("template");
            if (stringExtra != null) {
                this.mTemplate = (Template)LocalPersistence.readObjectFromFile((Context)this, stringExtra);
            }
        }
        this.findViewById(R$id.btn_on_back).setOnClickListener((View$OnClickListener)new ProVersionActivity$2(this));
        final boolean subscribed = BillingPreferences.isSubscribed(this.getApplicationContext());
        this.setupImg();
        if (subscribed) {
            this.thnks();
            return;
        }
        if (!NetworkUtils.isNetworkAvailable((Context)this)) {
            Toast.makeText((Context)this, (CharSequence)this.mResources.getString(R$string.no_internet), 0).show();
        }
        this.billingClient = BillingClient.newBuilder((Context)this).setListener((PurchasesUpdatedListener)this).enablePendingPurchases().build();
        this.startBillingConnection();
        (this.btn_restore = (Button)this.findViewById(R$id.restore)).setText((CharSequence)this.mResources.getString(R$string.restort_subscribe));
        this.btn_restore.setOnClickListener((View$OnClickListener)new ProVersionActivity$3(this));
        (this.tv_best = (TextView)this.findViewById(R$id.tv_best_value)).setText((CharSequence)this.mResources.getString(R$string.best_value));
        this.tv_price_year = (TextCustumFontBold)this.findViewById(R$id.tv_price_year);
        this.tv_price_foreiver = (TextCustumFontBold)this.findViewById(R$id.tv_price_month);
        this.tvByMonth = (TextCustumFont)this.findViewById(R$id.tv_year_bymonth);
        this.btn_foreiver = (MaterialCardView)this.findViewById(R$id.btn_month);
        this.btn_year = (MaterialCardView)this.findViewById(R$id.btn_year);
        this.ivForeiver = (ImageView)this.findViewById(R$id.btn_radio_month);
        this.ivYear = (ImageView)this.findViewById(R$id.btn_radio_year);
        this.btn_foreiver.setOnClickListener((View$OnClickListener)new ProVersionActivity$4(this));
        this.btn_year.setOnClickListener((View$OnClickListener)new ProVersionActivity$5(this));
        (this.btnContinue = (ButtonCustumFontBilling)this.findViewById(R$id.btn_continue)).setText((CharSequence)this.mResources.getString(R$string.subscribe_now));
        this.btnContinue.setOnClickListener((View$OnClickListener)new ProVersionActivity$6(this));
        this.tvNoCommitmentAr = (TextCustumFont)this.findViewById(R$id.tv_hint_ar);
        this.tvNoCommitmentEn = (TextCustumFont)this.findViewById(R$id.tv_hint_en);
        if (LocaleHelper.getLanguage((Context)this).equals("ar")) {
            this.tvNoCommitmentAr.setVisibility(0);
            this.tvNoCommitmentAr.setText((CharSequence)this.mResources.getString(R$string.no_commitment));
        }
        else {
            this.tvNoCommitmentEn.setVisibility(0);
            this.tvNoCommitmentEn.setText((CharSequence)this.mResources.getString(R$string.no_commitment));
        }
    }
    
    protected void onDestroy() {
        super.onDestroy();
        this.stopAutoScroll();
        final BillingClient billingClient = this.billingClient;
        if (billingClient != null && billingClient.isReady()) {
            this.billingClient.endConnection();
        }
    }
    
    protected void onPause() {
        super.onPause();
        this.cancelDialog();
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
