/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.viewbinding.ViewBinding
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class RowWordAyaBinding
implements ViewBinding {
    private final TextCustumFont rootView;
    public final TextCustumFont wordAya;

    private RowWordAyaBinding(TextCustumFont textCustumFont, TextCustumFont textCustumFont2) {
        this.rootView = textCustumFont;
        this.wordAya = textCustumFont2;
    }

    public static RowWordAyaBinding bind(View object) {
        if (object != null) {
            object = (TextCustumFont)((Object)object);
            RowWordAyaBinding rowWordAyaBinding = new RowWordAyaBinding((TextCustumFont)((Object)object), (TextCustumFont)((Object)object));
            return rowWordAyaBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowWordAyaBinding inflate(LayoutInflater layoutInflater) {
        return RowWordAyaBinding.inflate(layoutInflater, null, false);
    }

    public static RowWordAyaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.row_word_aya;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowWordAyaBinding.bind((View)layoutInflater);
    }

    public TextCustumFont getRoot() {
        return this.rootView;
    }
}

