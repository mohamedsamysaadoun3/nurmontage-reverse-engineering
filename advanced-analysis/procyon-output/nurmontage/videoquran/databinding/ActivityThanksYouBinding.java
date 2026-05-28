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
import android.widget.RelativeLayout;
import nl.dionsegijn.konfetti.xml.KonfettiView;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class ActivityThanksYouBinding implements ViewBinding
{
    public final ImageButton btnOnBack;
    public final KonfettiView konfettiView;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final TextCustumFont tvPriceDonate;
    public final TextCustumFont tvThnksDonate;
    
    private ActivityThanksYouBinding(final RelativeLayout rootView, final ImageButton btnOnBack, final KonfettiView konfettiView, final RelativeLayout main, final TextCustumFont tvPriceDonate, final TextCustumFont tvThnksDonate) {
        this.rootView = rootView;
        this.btnOnBack = btnOnBack;
        this.konfettiView = konfettiView;
        this.main = main;
        this.tvPriceDonate = tvPriceDonate;
        this.tvThnksDonate = tvThnksDonate;
    }
    
    public static ActivityThanksYouBinding bind(final View view) {
        int n = R$id.btn_on_back;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.konfettiView;
            final KonfettiView konfettiView = (KonfettiView)ViewBindings.findChildViewById(view, n);
            if (konfettiView != null) {
                final RelativeLayout relativeLayout = (RelativeLayout)view;
                n = R$id.tv_price_donate;
                final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                if (textCustumFont != null) {
                    n = R$id.tv_thnks_donate;
                    final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                    if (textCustumFont2 != null) {
                        return new ActivityThanksYouBinding(relativeLayout, imageButton, konfettiView, relativeLayout, textCustumFont, textCustumFont2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static ActivityThanksYouBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityThanksYouBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_thanks_you, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
