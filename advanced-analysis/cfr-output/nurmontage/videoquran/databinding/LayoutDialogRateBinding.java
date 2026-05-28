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
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;

public final class LayoutDialogRateBinding
implements ViewBinding {
    public final ButtonCustumFont btnRate;
    public final ButtonCustumFont btnRateNotNow;
    private final LinearLayout rootView;
    public final TextCustumFont tvSubtittle;
    public final TextCustumFontBold tvTittle;

    private LayoutDialogRateBinding(LinearLayout linearLayout, ButtonCustumFont buttonCustumFont, ButtonCustumFont buttonCustumFont2, TextCustumFont textCustumFont, TextCustumFontBold textCustumFontBold) {
        this.rootView = linearLayout;
        this.btnRate = buttonCustumFont;
        this.btnRateNotNow = buttonCustumFont2;
        this.tvSubtittle = textCustumFont;
        this.tvTittle = textCustumFontBold;
    }

    public static LayoutDialogRateBinding bind(View object) {
        View view;
        int n = R$id.btn_rate;
        Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        object2 = (ButtonCustumFont)view;
        if (object2 != null) {
            n = R$id.btn_rate_not_now;
            Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            object3 = (ButtonCustumFont)view;
            if (object3 != null) {
                n = R$id.tv_subtittle;
                Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                object4 = (TextCustumFont)view;
                if (object4 != null) {
                    n = R$id.tv_tittle;
                    Object object5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    object5 = (TextCustumFontBold)view;
                    if (object5 != null) {
                        Object object6 = object;
                        object6 = (LinearLayout)object;
                        LayoutDialogRateBinding layoutDialogRateBinding = new LayoutDialogRateBinding((LinearLayout)object6, (ButtonCustumFont)((Object)object2), (ButtonCustumFont)((Object)object3), (TextCustumFont)((Object)object4), (TextCustumFontBold)((Object)object5));
                        return layoutDialogRateBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutDialogRateBinding inflate(LayoutInflater layoutInflater) {
        return LayoutDialogRateBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutDialogRateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_dialog_rate;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutDialogRateBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

