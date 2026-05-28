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
import hazem.nurmontage.videoquran.views.SquareImageViewSimple;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class RowExploreBinding
implements ViewBinding {
    public final SquareImageViewSimple img;
    private final LinearLayout rootView;
    public final TextCustumFont tvName;
    public final TextCustumFont tvSize;

    private RowExploreBinding(LinearLayout linearLayout, SquareImageViewSimple squareImageViewSimple, TextCustumFont textCustumFont, TextCustumFont textCustumFont2) {
        this.rootView = linearLayout;
        this.img = squareImageViewSimple;
        this.tvName = textCustumFont;
        this.tvSize = textCustumFont2;
    }

    public static RowExploreBinding bind(View object) {
        TextCustumFont textCustumFont;
        TextCustumFont textCustumFont2;
        int n = R$id.img;
        SquareImageViewSimple squareImageViewSimple = (SquareImageViewSimple)ViewBindings.findChildViewById((View)object, (int)n);
        if (squareImageViewSimple != null && (textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById((View)object, (int)(n = R$id.tv_name))) != null && (textCustumFont = (TextCustumFont)ViewBindings.findChildViewById((View)object, (int)(n = R$id.tv_size))) != null) {
            object = (LinearLayout)object;
            RowExploreBinding rowExploreBinding = new RowExploreBinding((LinearLayout)object, squareImageViewSimple, textCustumFont2, textCustumFont);
            return rowExploreBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowExploreBinding inflate(LayoutInflater layoutInflater) {
        return RowExploreBinding.inflate(layoutInflater, null, false);
    }

    public static RowExploreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.row_explore;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowExploreBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

