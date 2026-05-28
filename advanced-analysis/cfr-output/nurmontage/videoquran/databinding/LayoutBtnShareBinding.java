/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class LayoutBtnShareBinding
implements ViewBinding {
    private final RelativeLayout rootView;
    public final TextCustumFont tvShare;

    private LayoutBtnShareBinding(RelativeLayout relativeLayout, TextCustumFont textCustumFont) {
        this.rootView = relativeLayout;
        this.tvShare = textCustumFont;
    }

    public static LayoutBtnShareBinding bind(View object) {
        int n = R$id.tv_share;
        TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById((View)object, (int)n);
        if (textCustumFont != null) {
            object = (RelativeLayout)object;
            LayoutBtnShareBinding layoutBtnShareBinding = new LayoutBtnShareBinding((RelativeLayout)object, textCustumFont);
            return layoutBtnShareBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutBtnShareBinding inflate(LayoutInflater layoutInflater) {
        return LayoutBtnShareBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutBtnShareBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_btn_share;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutBtnShareBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

