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

public final class RowSpinnerAyaBinding
implements ViewBinding {
    private final TextCustumFont rootView;
    public final TextCustumFont spinnerText;

    private RowSpinnerAyaBinding(TextCustumFont textCustumFont, TextCustumFont textCustumFont2) {
        this.rootView = textCustumFont;
        this.spinnerText = textCustumFont2;
    }

    public static RowSpinnerAyaBinding bind(View object) {
        if (object != null) {
            object = (TextCustumFont)((Object)object);
            RowSpinnerAyaBinding rowSpinnerAyaBinding = new RowSpinnerAyaBinding((TextCustumFont)((Object)object), (TextCustumFont)((Object)object));
            return rowSpinnerAyaBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowSpinnerAyaBinding inflate(LayoutInflater layoutInflater) {
        return RowSpinnerAyaBinding.inflate(layoutInflater, null, false);
    }

    public static RowSpinnerAyaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.row_spinner_aya;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowSpinnerAyaBinding.bind((View)layoutInflater);
    }

    public TextCustumFont getRoot() {
        return this.rootView;
    }
}

