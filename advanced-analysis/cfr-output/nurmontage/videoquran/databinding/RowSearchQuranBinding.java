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
import hazem.nurmontage.videoquran.views.TextCustumFontAR;

public final class RowSearchQuranBinding
implements ViewBinding {
    private final LinearLayout rootView;
    public final TextCustumFontAR tvSurah;
    public final TextCustumFontAR tvSurahNameAndNumber;

    private RowSearchQuranBinding(LinearLayout linearLayout, TextCustumFontAR textCustumFontAR, TextCustumFontAR textCustumFontAR2) {
        this.rootView = linearLayout;
        this.tvSurah = textCustumFontAR;
        this.tvSurahNameAndNumber = textCustumFontAR2;
    }

    public static RowSearchQuranBinding bind(View object) {
        TextCustumFontAR textCustumFontAR;
        int n = R$id.tv_surah;
        TextCustumFontAR textCustumFontAR2 = (TextCustumFontAR)ViewBindings.findChildViewById((View)object, (int)n);
        if (textCustumFontAR2 != null && (textCustumFontAR = (TextCustumFontAR)ViewBindings.findChildViewById((View)object, (int)(n = R$id.tv_surah_name_and_number))) != null) {
            object = (LinearLayout)object;
            RowSearchQuranBinding rowSearchQuranBinding = new RowSearchQuranBinding((LinearLayout)object, textCustumFontAR2, textCustumFontAR);
            return rowSearchQuranBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowSearchQuranBinding inflate(LayoutInflater layoutInflater) {
        return RowSearchQuranBinding.inflate(layoutInflater, null, false);
    }

    public static RowSearchQuranBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.row_search_quran;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowSearchQuranBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

