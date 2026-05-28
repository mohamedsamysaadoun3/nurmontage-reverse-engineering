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

public final class RowReverbeBinding
implements ViewBinding {
    public final ImageView ivBtnPlay;
    private final LinearLayout rootView;
    public final TextCustumFont wordAya;

    private RowReverbeBinding(LinearLayout linearLayout, ImageView imageView, TextCustumFont textCustumFont) {
        this.rootView = linearLayout;
        this.ivBtnPlay = imageView;
        this.wordAya = textCustumFont;
    }

    public static RowReverbeBinding bind(View object) {
        TextCustumFont textCustumFont;
        int n = R$id.iv_btn_play;
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)object, (int)n);
        if (imageView != null && (textCustumFont = (TextCustumFont)ViewBindings.findChildViewById((View)object, (int)(n = R$id.word_aya))) != null) {
            object = (LinearLayout)object;
            RowReverbeBinding rowReverbeBinding = new RowReverbeBinding((LinearLayout)object, imageView, textCustumFont);
            return rowReverbeBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowReverbeBinding inflate(LayoutInflater layoutInflater) {
        return RowReverbeBinding.inflate(layoutInflater, null, false);
    }

    public static RowReverbeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.row_reverbe;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowReverbeBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

