/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class LayoutBtnUnlockBinding
implements ViewBinding {
    private final LinearLayout rootView;
    public final TextCustumFont tvUnlock;

    private LayoutBtnUnlockBinding(LinearLayout linearLayout, TextCustumFont textCustumFont) {
        this.rootView = linearLayout;
        this.tvUnlock = textCustumFont;
    }

    public static LayoutBtnUnlockBinding bind(View object) {
        int n = R$id.tv_unlock;
        TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById((View)object, (int)n);
        if (textCustumFont != null) {
            object = (LinearLayout)object;
            LayoutBtnUnlockBinding layoutBtnUnlockBinding = new LayoutBtnUnlockBinding((LinearLayout)object, textCustumFont);
            return layoutBtnUnlockBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutBtnUnlockBinding inflate(LayoutInflater layoutInflater) {
        return LayoutBtnUnlockBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutBtnUnlockBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_btn_unlock;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutBtnUnlockBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

