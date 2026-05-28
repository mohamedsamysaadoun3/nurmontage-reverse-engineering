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

public final class RowBillingBinding
implements ViewBinding {
    public final ImageView img;
    private final LinearLayout rootView;
    public final TextCustumFont tv;

    private RowBillingBinding(LinearLayout linearLayout, ImageView imageView, TextCustumFont textCustumFont) {
        this.rootView = linearLayout;
        this.img = imageView;
        this.tv = textCustumFont;
    }

    public static RowBillingBinding bind(View object) {
        TextCustumFont textCustumFont;
        int n = R$id.img;
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)object, (int)n);
        if (imageView != null && (textCustumFont = (TextCustumFont)ViewBindings.findChildViewById((View)object, (int)(n = R$id.tv))) != null) {
            object = (LinearLayout)object;
            RowBillingBinding rowBillingBinding = new RowBillingBinding((LinearLayout)object, imageView, textCustumFont);
            return rowBillingBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowBillingBinding inflate(LayoutInflater layoutInflater) {
        return RowBillingBinding.inflate(layoutInflater, null, false);
    }

    public static RowBillingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.row_billing;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowBillingBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

