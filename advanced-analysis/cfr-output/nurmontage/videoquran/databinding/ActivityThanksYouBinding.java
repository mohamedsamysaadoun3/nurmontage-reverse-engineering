/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.RelativeLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  nl.dionsegijn.konfetti.xml.KonfettiView
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import nl.dionsegijn.konfetti.xml.KonfettiView;

public final class ActivityThanksYouBinding
implements ViewBinding {
    public final ImageButton btnOnBack;
    public final KonfettiView konfettiView;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final TextCustumFont tvPriceDonate;
    public final TextCustumFont tvThnksDonate;

    private ActivityThanksYouBinding(RelativeLayout relativeLayout, ImageButton imageButton, KonfettiView konfettiView, RelativeLayout relativeLayout2, TextCustumFont textCustumFont, TextCustumFont textCustumFont2) {
        this.rootView = relativeLayout;
        this.btnOnBack = imageButton;
        this.konfettiView = konfettiView;
        this.main = relativeLayout2;
        this.tvPriceDonate = textCustumFont;
        this.tvThnksDonate = textCustumFont2;
    }

    public static ActivityThanksYouBinding bind(View object) {
        View view;
        int n = R$id.btn_on_back;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ImageButton)view;
        if (view2 != null) {
            n = R$id.konfettiView;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (KonfettiView)view;
            if (view3 != null) {
                Object object2 = object;
                object2 = (RelativeLayout)object;
                n = R$id.tv_price_donate;
                Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                object3 = (TextCustumFont)view;
                if (object3 != null) {
                    n = R$id.tv_thnks_donate;
                    Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    object4 = (TextCustumFont)view;
                    if (object4 != null) {
                        object = new ActivityThanksYouBinding((RelativeLayout)object2, (ImageButton)view2, (KonfettiView)view3, (RelativeLayout)object2, (TextCustumFont)((Object)object3), (TextCustumFont)((Object)object4));
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityThanksYouBinding inflate(LayoutInflater layoutInflater) {
        return ActivityThanksYouBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityThanksYouBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_thanks_you;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityThanksYouBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

