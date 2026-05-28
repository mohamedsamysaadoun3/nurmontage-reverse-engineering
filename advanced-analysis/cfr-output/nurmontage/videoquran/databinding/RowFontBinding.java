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

public final class RowFontBinding
implements ViewBinding {
    private final RelativeLayout rootView;
    public final TextCustumFont tvFont;
    public final TextCustumFont tvNumber;

    private RowFontBinding(RelativeLayout relativeLayout, TextCustumFont textCustumFont, TextCustumFont textCustumFont2) {
        this.rootView = relativeLayout;
        this.tvFont = textCustumFont;
        this.tvNumber = textCustumFont2;
    }

    public static RowFontBinding bind(View object) {
        TextCustumFont textCustumFont;
        int n = R$id.tv_font;
        TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById((View)object, (int)n);
        if (textCustumFont2 != null && (textCustumFont = (TextCustumFont)ViewBindings.findChildViewById((View)object, (int)(n = R$id.tv_number))) != null) {
            object = (RelativeLayout)object;
            RowFontBinding rowFontBinding = new RowFontBinding((RelativeLayout)object, textCustumFont2, textCustumFont);
            return rowFontBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowFontBinding inflate(LayoutInflater layoutInflater) {
        return RowFontBinding.inflate(layoutInflater, null, false);
    }

    public static RowFontBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.row_font;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowFontBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

