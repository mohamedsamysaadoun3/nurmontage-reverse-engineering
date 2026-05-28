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
import androidx.recyclerview.widget.RecyclerView;
import android.widget.Button;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import android.widget.RelativeLayout;
import nl.dionsegijn.konfetti.xml.KonfettiView;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import hazem.nurmontage.videoquran.views.ButtonCustumFontBilling;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class ActivityProVersionBinding implements ViewBinding
{
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
    
    private ActivityProVersionBinding(final RelativeLayout rootView, final LinearLayout btn, final ButtonCustumFontBilling btnContinue, final ImageButton btnOnBack, final ImageButton btnShowPro, final FrameLayout containerProgress, final TextCustumFont hintReview, final KonfettiView konfettiView, final LayoutPriceBinding layoutPrice, final RelativeLayout main, final TextCustumFontBold mtittle, final Button restore, final RecyclerView rvImg, final TextCustumFont tvHintAr, final TextCustumFont tvHintEn, final TextCustumFont tvThanks) {
        this.rootView = rootView;
        this.btn = btn;
        this.btnContinue = btnContinue;
        this.btnOnBack = btnOnBack;
        this.btnShowPro = btnShowPro;
        this.containerProgress = containerProgress;
        this.hintReview = hintReview;
        this.konfettiView = konfettiView;
        this.layoutPrice = layoutPrice;
        this.main = main;
        this.mtittle = mtittle;
        this.restore = restore;
        this.rvImg = rvImg;
        this.tvHintAr = tvHintAr;
        this.tvHintEn = tvHintEn;
        this.tvThanks = tvThanks;
    }
    
    public static ActivityProVersionBinding bind(final View view) {
        int n = R$id.btn;
        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
        if (linearLayout != null) {
            n = R$id.btn_continue;
            final ButtonCustumFontBilling buttonCustumFontBilling = (ButtonCustumFontBilling)ViewBindings.findChildViewById(view, n);
            if (buttonCustumFontBilling != null) {
                n = R$id.btn_on_back;
                final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
                if (imageButton != null) {
                    n = R$id.btn_show_pro;
                    final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
                    if (imageButton2 != null) {
                        n = R$id.container_progress;
                        final FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById(view, n);
                        if (frameLayout != null) {
                            n = R$id.hint_review;
                            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                            if (textCustumFont != null) {
                                n = R$id.konfettiView;
                                final KonfettiView konfettiView = (KonfettiView)ViewBindings.findChildViewById(view, n);
                                if (konfettiView != null) {
                                    n = R$id.layout_price;
                                    final View childViewById = ViewBindings.findChildViewById(view, n);
                                    if (childViewById != null) {
                                        final LayoutPriceBinding bind = LayoutPriceBinding.bind(childViewById);
                                        final RelativeLayout relativeLayout = (RelativeLayout)view;
                                        n = R$id.mtittle;
                                        final TextCustumFontBold textCustumFontBold = (TextCustumFontBold)ViewBindings.findChildViewById(view, n);
                                        if (textCustumFontBold != null) {
                                            n = R$id.restore;
                                            final Button button = (Button)ViewBindings.findChildViewById(view, n);
                                            if (button != null) {
                                                n = R$id.rv_img;
                                                final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
                                                if (recyclerView != null) {
                                                    n = R$id.tv_hint_ar;
                                                    final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                    if (textCustumFont2 != null) {
                                                        n = R$id.tv_hint_en;
                                                        final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                        if (textCustumFont3 != null) {
                                                            n = R$id.tv_thanks;
                                                            final TextCustumFont textCustumFont4 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                                            if (textCustumFont4 != null) {
                                                                return new ActivityProVersionBinding(relativeLayout, linearLayout, buttonCustumFontBilling, imageButton, imageButton2, frameLayout, textCustumFont, konfettiView, bind, relativeLayout, textCustumFontBold, button, recyclerView, textCustumFont2, textCustumFont3, textCustumFont4);
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
    
    public static ActivityProVersionBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityProVersionBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_pro_version, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
