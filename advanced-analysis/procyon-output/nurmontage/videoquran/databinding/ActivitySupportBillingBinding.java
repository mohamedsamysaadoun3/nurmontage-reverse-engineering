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
import hazem.nurmontage.videoquran.views.TextCustumFont;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class ActivitySupportBillingBinding implements ViewBinding
{
    public final ImageButton btnBilling;
    public final ButtonCustumFont btnLaunch;
    public final ImageButton btnOnBack;
    public final CardView card;
    public final ImageView ivBilling;
    public final LinearLayout main;
    private final LinearLayout rootView;
    public final RecyclerView rv;
    public final TextCustumFont tvAya;
    public final ButtonCustumFont view10;
    public final ButtonCustumFont view100;
    public final ButtonCustumFont view1000;
    public final ButtonCustumFont view50;
    
    private ActivitySupportBillingBinding(final LinearLayout rootView, final ImageButton btnBilling, final ButtonCustumFont btnLaunch, final ImageButton btnOnBack, final CardView card, final ImageView ivBilling, final LinearLayout main, final RecyclerView rv, final TextCustumFont tvAya, final ButtonCustumFont view10, final ButtonCustumFont view11, final ButtonCustumFont view12, final ButtonCustumFont view13) {
        this.rootView = rootView;
        this.btnBilling = btnBilling;
        this.btnLaunch = btnLaunch;
        this.btnOnBack = btnOnBack;
        this.card = card;
        this.ivBilling = ivBilling;
        this.main = main;
        this.rv = rv;
        this.tvAya = tvAya;
        this.view10 = view10;
        this.view100 = view11;
        this.view1000 = view12;
        this.view50 = view13;
    }
    
    public static ActivitySupportBillingBinding bind(final View view) {
        int n = R$id.btn_billing;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.btn_launch;
            final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
            if (buttonCustumFont != null) {
                n = R$id.btn_on_back;
                final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
                if (imageButton2 != null) {
                    n = R$id.card;
                    final CardView cardView = (CardView)ViewBindings.findChildViewById(view, n);
                    if (cardView != null) {
                        n = R$id.iv_billing;
                        final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                        if (imageView != null) {
                            final LinearLayout linearLayout = (LinearLayout)view;
                            n = R$id.rv;
                            final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
                            if (recyclerView != null) {
                                n = R$id.tv_aya;
                                final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                if (textCustumFont != null) {
                                    n = R$id.view_10;
                                    final ButtonCustumFont buttonCustumFont2 = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
                                    if (buttonCustumFont2 != null) {
                                        n = R$id.view_100;
                                        final ButtonCustumFont buttonCustumFont3 = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
                                        if (buttonCustumFont3 != null) {
                                            n = R$id.view_1000;
                                            final ButtonCustumFont buttonCustumFont4 = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
                                            if (buttonCustumFont4 != null) {
                                                n = R$id.view_50;
                                                final ButtonCustumFont buttonCustumFont5 = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
                                                if (buttonCustumFont5 != null) {
                                                    return new ActivitySupportBillingBinding(linearLayout, imageButton, buttonCustumFont, imageButton2, cardView, imageView, linearLayout, recyclerView, textCustumFont, buttonCustumFont2, buttonCustumFont3, buttonCustumFont4, buttonCustumFont5);
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
    
    public static ActivitySupportBillingBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivitySupportBillingBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_support_billing, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
