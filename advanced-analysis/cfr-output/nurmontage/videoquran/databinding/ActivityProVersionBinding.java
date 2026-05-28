/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.ImageButton
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
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.databinding.LayoutPriceBinding;
import hazem.nurmontage.videoquran.views.ButtonCustumFontBilling;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import nl.dionsegijn.konfetti.xml.KonfettiView;

public final class ActivityProVersionBinding
implements ViewBinding {
    public final LinearLayout btn;
    public final ButtonCustumFontBilling btnContinue;
    public final ImageButton btnOnBack;
    public final ImageButton btnShowPro;
    public final FrameLayout containerProgress;
    public final TextCustumFont hintReview;
    public final KonfettiView konfettiView;
    public final LayoutPriceBinding layoutPrice;
    public final RelativeLayout main;
    public final TextCustumFontBold mtittle;
    public final Button restore;
    private final RelativeLayout rootView;
    public final RecyclerView rvImg;
    public final TextCustumFont tvHintAr;
    public final TextCustumFont tvHintEn;
    public final TextCustumFont tvThanks;

    private ActivityProVersionBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, ButtonCustumFontBilling buttonCustumFontBilling, ImageButton imageButton, ImageButton imageButton2, FrameLayout frameLayout, TextCustumFont textCustumFont, KonfettiView konfettiView, LayoutPriceBinding layoutPriceBinding, RelativeLayout relativeLayout2, TextCustumFontBold textCustumFontBold, Button button, RecyclerView recyclerView, TextCustumFont textCustumFont2, TextCustumFont textCustumFont3, TextCustumFont textCustumFont4) {
        this.rootView = relativeLayout;
        this.btn = linearLayout;
        this.btnContinue = buttonCustumFontBilling;
        this.btnOnBack = imageButton;
        this.btnShowPro = imageButton2;
        this.containerProgress = frameLayout;
        this.hintReview = textCustumFont;
        this.konfettiView = konfettiView;
        this.layoutPrice = layoutPriceBinding;
        this.main = relativeLayout2;
        this.mtittle = textCustumFontBold;
        this.restore = button;
        this.rvImg = recyclerView;
        this.tvHintAr = textCustumFont2;
        this.tvHintEn = textCustumFont3;
        this.tvThanks = textCustumFont4;
    }

    public static ActivityProVersionBinding bind(View view) {
        View view2;
        Object object = view;
        int n = R$id.btn;
        View view3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
        view3 = (LinearLayout)view2;
        if (view3 != null) {
            n = R$id.btn_continue;
            Object object2 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
            object2 = (ButtonCustumFontBilling)view2;
            if (object2 != null) {
                n = R$id.btn_on_back;
                View view4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                view4 = (ImageButton)view2;
                if (view4 != null) {
                    n = R$id.btn_show_pro;
                    View view5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                    view5 = (ImageButton)view2;
                    if (view5 != null) {
                        n = R$id.container_progress;
                        View view6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                        view6 = (FrameLayout)view2;
                        if (view6 != null) {
                            n = R$id.hint_review;
                            Object object3 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                            object3 = (TextCustumFont)view2;
                            if (object3 != null) {
                                n = R$id.konfettiView;
                                View view7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                view7 = (KonfettiView)view2;
                                if (view7 != null && (view2 = ViewBindings.findChildViewById((View)view, (int)(n = R$id.layout_price))) != null) {
                                    LayoutPriceBinding layoutPriceBinding = LayoutPriceBinding.bind(view2);
                                    View view8 = view;
                                    view8 = (RelativeLayout)view;
                                    n = R$id.mtittle;
                                    Object object4 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                    object4 = (TextCustumFontBold)view2;
                                    if (object4 != null) {
                                        n = R$id.restore;
                                        View view9 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                        view9 = (Button)view2;
                                        if (view9 != null) {
                                            n = R$id.rv_img;
                                            View view10 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                            view10 = (RecyclerView)view2;
                                            if (view10 != null) {
                                                n = R$id.tv_hint_ar;
                                                Object object5 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                object5 = (TextCustumFont)view2;
                                                if (object5 != null) {
                                                    n = R$id.tv_hint_en;
                                                    Object object6 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                    object6 = (TextCustumFont)view2;
                                                    if (object6 != null) {
                                                        n = R$id.tv_thanks;
                                                        Object object7 = view2 = ViewBindings.findChildViewById((View)view, (int)n);
                                                        object7 = (TextCustumFont)view2;
                                                        if (object7 != null) {
                                                            object = new ActivityProVersionBinding((RelativeLayout)view8, (LinearLayout)view3, (ButtonCustumFontBilling)((Object)object2), (ImageButton)view4, (ImageButton)view5, (FrameLayout)view6, (TextCustumFont)((Object)object3), (KonfettiView)view7, layoutPriceBinding, (RelativeLayout)view8, (TextCustumFontBold)((Object)object4), (Button)view9, (RecyclerView)view10, (TextCustumFont)((Object)object5), (TextCustumFont)((Object)object6), (TextCustumFont)((Object)object7));
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
        object = view.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityProVersionBinding inflate(LayoutInflater layoutInflater) {
        return ActivityProVersionBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityProVersionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_pro_version;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityProVersionBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

