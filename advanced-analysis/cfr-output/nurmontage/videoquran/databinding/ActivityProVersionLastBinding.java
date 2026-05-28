/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  nl.dionsegijn.konfetti.xml.KonfettiView
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.databinding.LayoutContactUsBinding;
import hazem.nurmontage.videoquran.databinding.LayoutPriceBinding;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import nl.dionsegijn.konfetti.xml.KonfettiView;

public final class ActivityProVersionLastBinding
implements ViewBinding {
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

    private ActivityProVersionLastBinding(RelativeLayout relativeLayout, TextCustumFont textCustumFont, ButtonCustumFont buttonCustumFont, ImageButton imageButton, ButtonCustumFont buttonCustumFont2, LayoutContactUsBinding layoutContactUsBinding, FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, KonfettiView konfettiView, LayoutPriceBinding layoutPriceBinding, RelativeLayout relativeLayout2, RecyclerView recyclerView, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, TextCustumFont textCustumFont2, TextCustumFont textCustumFont3, TextCustumFont textCustumFont4, TextCustumFont textCustumFont5, TextCustumFont textCustumFont6, TextCustumFont textCustumFont7, TextCustumFont textCustumFont8, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView5) {
        this.rootView = relativeLayout;
        this.appName = textCustumFont;
        this.btnDone = buttonCustumFont;
        this.btnOnBack = imageButton;
        this.btnTry = buttonCustumFont2;
        this.contactLayout = layoutContactUsBinding;
        this.container = frameLayout;
        this.containerProgress = frameLayout2;
        this.imgAr = imageView;
        this.imgResize = imageView2;
        this.imgType = imageView3;
        this.imgWattermark = imageView4;
        this.konfettiView = konfettiView;
        this.layoutPrice = layoutPriceBinding;
        this.main = relativeLayout2;
        this.rv = recyclerView;
        this.toolbar = relativeLayout3;
        this.toolbarTittleFeature = relativeLayout4;
        this.tvFree = textCustumFont2;
        this.tvFreeAr = textCustumFont3;
        this.tvNoInternet = textCustumFont4;
        this.tvPro = textCustumFont5;
        this.tvProAr = textCustumFont6;
        this.tvThanks = textCustumFont7;
        this.tvTittleBilling = textCustumFont8;
        this.viewNoInternet = linearLayout;
        this.viewSuccess = linearLayout2;
        this.ytbLayout = imageView5;
    }

    public static ActivityProVersionLastBinding bind(View view) {
        View view2;
        Object object = view;
        int n = R$id.app_name;
        Object object2 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
        object2 = (TextCustumFont)view2;
        if (object2 != null) {
            n = R$id.btn_done;
            Object object3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
            object3 = (ButtonCustumFont)view2;
            if (object3 != null) {
                n = R$id.btn_on_back;
                View view3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                view3 = (ImageButton)view2;
                if (view3 != null) {
                    n = R$id.btn_try;
                    Object object4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                    object4 = (ButtonCustumFont)view2;
                    if (object4 != null && (view2 = ViewBindings.findChildViewById((View)view, (int)(n = R$id.contact_layout))) != null) {
                        LayoutContactUsBinding layoutContactUsBinding = LayoutContactUsBinding.bind(view2);
                        n = R$id.container;
                        View view4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                        view4 = (FrameLayout)view2;
                        if (view4 != null) {
                            n = R$id.container_progress;
                            View view5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                            view5 = (FrameLayout)view2;
                            if (view5 != null) {
                                n = R$id.img_ar;
                                View view6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                view6 = (ImageView)view2;
                                if (view6 != null) {
                                    n = R$id.img_resize;
                                    View view7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                    view7 = (ImageView)view2;
                                    if (view7 != null) {
                                        n = R$id.img_type;
                                        View view8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                        view8 = (ImageView)view2;
                                        if (view8 != null) {
                                            n = R$id.img_wattermark;
                                            View view9 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                            view9 = (ImageView)view2;
                                            if (view9 != null) {
                                                n = R$id.konfettiView;
                                                View view10 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                view10 = (KonfettiView)view2;
                                                if (view10 != null && (view2 = ViewBindings.findChildViewById((View)view, (int)(n = R$id.layout_price))) != null) {
                                                    LayoutPriceBinding layoutPriceBinding = LayoutPriceBinding.bind(view2);
                                                    View view11 = view;
                                                    view11 = (RelativeLayout)view;
                                                    n = R$id.rv;
                                                    View view12 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                    view12 = (RecyclerView)view2;
                                                    if (view12 != null) {
                                                        n = R$id.toolbar;
                                                        View view13 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                        view13 = (RelativeLayout)view2;
                                                        if (view13 != null) {
                                                            n = R$id.toolbar_tittle_feature;
                                                            View view14 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                            view14 = (RelativeLayout)view2;
                                                            if (view14 != null) {
                                                                n = R$id.tv_free;
                                                                Object object5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                object5 = (TextCustumFont)view2;
                                                                if (object5 != null) {
                                                                    n = R$id.tv_free_ar;
                                                                    Object object6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                    object6 = (TextCustumFont)view2;
                                                                    if (object6 != null) {
                                                                        n = R$id.tv_no_internet;
                                                                        Object object7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                        object7 = (TextCustumFont)view2;
                                                                        if (object7 != null) {
                                                                            n = R$id.tv_pro;
                                                                            Object object8 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                            object8 = (TextCustumFont)view2;
                                                                            if (object8 != null) {
                                                                                n = R$id.tv_pro_ar;
                                                                                Object object9 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                object9 = (TextCustumFont)view2;
                                                                                if (object9 != null) {
                                                                                    n = R$id.tv_thanks;
                                                                                    Object object10 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                    object10 = (TextCustumFont)view2;
                                                                                    if (object10 != null) {
                                                                                        n = R$id.tv_tittle_billing;
                                                                                        Object object11 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                        object11 = (TextCustumFont)view2;
                                                                                        if (object11 != null) {
                                                                                            n = R$id.view_no_internet;
                                                                                            View view15 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                            view15 = (LinearLayout)view2;
                                                                                            if (view15 != null) {
                                                                                                n = R$id.view_success;
                                                                                                View view16 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                view16 = (LinearLayout)view2;
                                                                                                if (view16 != null) {
                                                                                                    n = R$id.ytb_layout;
                                                                                                    View view17 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                                                                    view17 = (ImageView)view2;
                                                                                                    if (view17 != null) {
                                                                                                        object = new ActivityProVersionLastBinding((RelativeLayout)view11, (TextCustumFont)((Object)object2), (ButtonCustumFont)((Object)object3), (ImageButton)view3, (ButtonCustumFont)((Object)object4), layoutContactUsBinding, (FrameLayout)view4, (FrameLayout)view5, (ImageView)view6, (ImageView)view7, (ImageView)view8, (ImageView)view9, (KonfettiView)view10, layoutPriceBinding, (RelativeLayout)view11, (RecyclerView)view12, (RelativeLayout)view13, (RelativeLayout)view14, (TextCustumFont)((Object)object5), (TextCustumFont)((Object)object6), (TextCustumFont)((Object)object7), (TextCustumFont)((Object)object8), (TextCustumFont)((Object)object9), (TextCustumFont)((Object)object10), (TextCustumFont)((Object)object11), (LinearLayout)view15, (LinearLayout)view16, (ImageView)view17);
                                                                                                        return object;
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
        object = view.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityProVersionLastBinding inflate(LayoutInflater layoutInflater) {
        return ActivityProVersionLastBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityProVersionLastBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_pro_version_last;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityProVersionLastBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

