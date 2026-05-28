/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class LayoutHelpWhatsappBinding
implements ViewBinding {
    public final LinearLayout btnHelp;
    public final ImageView btnToAbout;
    private final LinearLayout rootView;
    public final TextCustumFont tvHelp;

    private LayoutHelpWhatsappBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, TextCustumFont textCustumFont) {
        this.rootView = linearLayout;
        this.btnHelp = linearLayout2;
        this.btnToAbout = imageView;
        this.tvHelp = textCustumFont;
    }

    public static LayoutHelpWhatsappBinding bind(View object) {
        TextCustumFont textCustumFont;
        Object object2 = object;
        object2 = (LinearLayout)object;
        int n = R$id.btn_to_about;
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)object, (int)n);
        if (imageView != null && (textCustumFont = (TextCustumFont)ViewBindings.findChildViewById((View)object, (int)(n = R$id.tv_help))) != null) {
            object = new LayoutHelpWhatsappBinding((LinearLayout)object2, (LinearLayout)object2, imageView, textCustumFont);
            return object;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static LayoutHelpWhatsappBinding inflate(LayoutInflater layoutInflater) {
        return LayoutHelpWhatsappBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutHelpWhatsappBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_help_whatsapp;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutHelpWhatsappBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

