// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.databinding;

import hazem.nurmontage.videoquran.R$layout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.RelativeLayout;
import nl.dionsegijn.konfetti.xml.KonfettiView;
import android.widget.ImageView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import androidx.viewbinding.ViewBinding;

public final class ActivityProVersionLastBinding implements ViewBinding
{
    public final TextCustumFont appName;
    public final ButtonCustumFont btnDone;
    public final ImageButton btnOnBack;
    public final ButtonCustumFont btnTry;
    public final LayoutContactUsBinding contactLayout;
    public final FrameLayout container;
    public final FrameLayout containerProgress;
    public final ImageView imgAr;
    public final ImageView imgResize;
    public final ImageView imgType;
    public final ImageView imgWattermark;
    public final KonfettiView konfettiView;
    public final LayoutPriceBinding layoutPrice;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final RecyclerView rv;
    public final RelativeLayout toolbar;
    public final RelativeLayout toolbarTittleFeature;
    public final TextCustumFont tvFree;
    public final TextCustumFont tvFreeAr;
    public final TextCustumFont tvNoInternet;
    public final TextCustumFont tvPro;
    public final TextCustumFont tvProAr;
    public final TextCustumFont tvThanks;
    public final TextCustumFont tvTittleBilling;
    public final LinearLayout viewNoInternet;
    public final LinearLayout viewSuccess;
    public final ImageView ytbLayout;
    
    private ActivityProVersionLastBinding(final RelativeLayout rootView, final TextCustumFont appName, final ButtonCustumFont btnDone, final ImageButton btnOnBack, final ButtonCustumFont btnTry, final LayoutContactUsBinding contactLayout, final FrameLayout container, final FrameLayout containerProgress, final ImageView imgAr, final ImageView imgResize, final ImageView imgType, final ImageView imgWattermark, final KonfettiView konfettiView, final LayoutPriceBinding layoutPrice, final RelativeLayout main, final RecyclerView rv, final RelativeLayout toolbar, final RelativeLayout toolbarTittleFeature, final TextCustumFont tvFree, final TextCustumFont tvFreeAr, final TextCustumFont tvNoInternet, final TextCustumFont tvPro, final TextCustumFont tvProAr, final TextCustumFont tvThanks, final TextCustumFont tvTittleBilling, final LinearLayout viewNoInternet, final LinearLayout viewSuccess, final ImageView ytbLayout) {
        this.rootView = rootView;
        this.appName = appName;
        this.btnDone = btnDone;
        this.btnOnBack = btnOnBack;
        this.btnTry = btnTry;
        this.contactLayout = contactLayout;
        this.container = container;
        this.containerProgress = containerProgress;
        this.imgAr = imgAr;
        this.imgResize = imgResize;
        this.imgType = imgType;
        this.imgWattermark = imgWattermark;
        this.konfettiView = konfettiView;
        this.layoutPrice = layoutPrice;
        this.main = main;
        this.rv = rv;
        this.toolbar = toolbar;
        this.toolbarTittleFeature = toolbarTittleFeature;
        this.tvFree = tvFree;
        this.tvFreeAr = tvFreeAr;
        this.tvNoInternet = tvNoInternet;
        this.tvPro = tvPro;
        this.tvProAr = tvProAr;
        this.tvThanks = tvThanks;
        this.tvTittleBilling = tvTittleBilling;
        this.viewNoInternet = viewNoInternet;
        this.viewSuccess = viewSuccess;
        this.ytbLayout = ytbLayout;
    }
    
    public static ActivityProVersionLastBinding bind(final View view) {
        int n = R$id.app_name;
        final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
        if (textCustumFont != null) {
            n = R$id.btn_done;
            final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
            if (buttonCustumFont != null) {
                n = R$id.btn_on_back;
                final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
                if (imageButton != null) {
                    n = R$id.btn_try;
                    final ButtonCustumFont buttonCustumFont2 = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
                    if (buttonCustumFont2 != null) {
                        n = R$id.contact_layout;
                        final View childViewById = ViewBindings.findChildViewById(view, n);
                        if (childViewById != null) {
                            final LayoutContactUsBinding bind = LayoutContactUsBinding.bind(childViewById);
                            n = R$id.container;
                            final FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById(view, n);
                            if (frameLayout != null) {
                                n = R$id.container_progress;
                                final FrameLayout frameLayout2 = (FrameLayout)ViewBindings.findChildViewById(view, n);
                                if (frameLayout2 != null) {
                                    n = R$id.img_ar;
                                    final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                                    if (imageView != null) {
                                        n = R$id.img_resize;
                                        final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
                                        if (imageView2 != null) {
                                            n = R$id.img_type;
                                            final ImageView imageView3 = (ImageView)ViewBindings.findChildViewById(view, n);
                                            if (imageView3 != null) {
                                                n = R$id.img_wattermark;
                                                final ImageView imageView4 = (ImageView)ViewBindings.findChildViewById(view, n);
                                                if (imageView4 != null) {
                                                    n = R$id.konfettiView;
                                                    final KonfettiView konfettiView = (KonfettiView)ViewBindings.findChildViewById(view, n);
                                                    if (konfettiView != null) {
                                                        n = R$id.layout_price;
                                                        final View childViewById2 = ViewBindings.findChildViewById(view, n);
                                                        if (childViewById2 != null) {
                                                            final LayoutPriceBinding bind2 = LayoutPriceBinding.bind(childViewById2);
                                                            final RelativeLayout relativeLayout = (RelativeLayout)view;
                                                            n = R$id.rv;
                                                            final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
                                                            if (recyclerView != null) {
                                                                n = R$id.toolbar;
                                                                final RelativeLayout relativeLayout2 = (RelativeLayout)ViewBindings.findChildViewById(view, n);
                                                                if (relativeLayout2 != null) {
                                                                    n = R$id.toolbar_tittle_feature;
                                                                    final RelativeLayout relativeLayout3 = (RelativeLayout)ViewBindings.findChildViewById(view, n);
                                                                    if (relativeLayout3 != null) {
                                                                        n = R$id.tv_free;
                                                                        final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                        if (textCustumFont2 != null) {
                                                                            n = R$id.tv_free_ar;
                                                                            final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                            if (textCustumFont3 != null) {
                                                                                n = R$id.tv_no_internet;
                                                                                final TextCustumFont textCustumFont4 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                if (textCustumFont4 != null) {
                                                                                    n = R$id.tv_pro;
                                                                                    final TextCustumFont textCustumFont5 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                    if (textCustumFont5 != null) {
                                                                                        n = R$id.tv_pro_ar;
                                                                                        final TextCustumFont textCustumFont6 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                        if (textCustumFont6 != null) {
                                                                                            n = R$id.tv_thanks;
                                                                                            final TextCustumFont textCustumFont7 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                            if (textCustumFont7 != null) {
                                                                                                n = R$id.tv_tittle_billing;
                                                                                                final TextCustumFont textCustumFont8 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                                                                if (textCustumFont8 != null) {
                                                                                                    n = R$id.view_no_internet;
                                                                                                    final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                                                                                    if (linearLayout != null) {
                                                                                                        n = R$id.view_success;
                                                                                                        final LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                                                                                                        if (linearLayout2 != null) {
                                                                                                            n = R$id.ytb_layout;
                                                                                                            final ImageView imageView5 = (ImageView)ViewBindings.findChildViewById(view, n);
                                                                                                            if (imageView5 != null) {
                                                                                                                return new ActivityProVersionLastBinding(relativeLayout, textCustumFont, buttonCustumFont, imageButton, buttonCustumFont2, bind, frameLayout, frameLayout2, imageView, imageView2, imageView3, imageView4, konfettiView, bind2, relativeLayout, recyclerView, relativeLayout2, relativeLayout3, textCustumFont2, textCustumFont3, textCustumFont4, textCustumFont5, textCustumFont6, textCustumFont7, textCustumFont8, linearLayout, linearLayout2, imageView5);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static ActivityProVersionLastBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityProVersionLastBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_pro_version_last, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
