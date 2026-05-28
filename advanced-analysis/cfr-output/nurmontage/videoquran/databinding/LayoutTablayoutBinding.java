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

public final class LayoutTablayoutBinding
implements ViewBinding {
    public final ImageView icon;
    public final TextCustumFont name;
    private final LinearLayout rootView;

    private LayoutTablayoutBinding(LinearLayout linearLayout, ImageView imageView, TextCustumFont textCustumFont) {
        this.rootView = linearLayout;
        this.icon = imageView;
        this.name = textCustumFont;
    }

    public static LayoutTablayoutBinding bind(View object) {
        TextCustumFont textCustumFont;
        int n = R$id.icon;
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)object, (int)n);
        if (imageView != null && (textCustumFont = (TextCustumFont)ViewBindings.findChildViewById((View)object, (int)(n = R$id.name))) != null) {
            object = (LinearLayout)object;
            LayoutTablayoutBinding layoutTablayoutBinding = new LayoutTablayoutBinding((LinearLayout)object, imageView, textCustumFont);
            return layoutTablayoutBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutTablayoutBinding inflate(LayoutInflater layoutInflater) {
        return LayoutTablayoutBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutTablayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_tablayout;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutTablayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

