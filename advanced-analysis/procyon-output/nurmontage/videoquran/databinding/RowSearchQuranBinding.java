// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.databinding;

import hazem.nurmontage.videoquran.R$layout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import hazem.nurmontage.videoquran.views.TextCustumFontAR;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class RowSearchQuranBinding implements ViewBinding
{
    private final LinearLayout rootView;
    public final TextCustumFontAR tvSurah;
    public final TextCustumFontAR tvSurahNameAndNumber;
    
    private RowSearchQuranBinding(final LinearLayout rootView, final TextCustumFontAR tvSurah, final TextCustumFontAR tvSurahNameAndNumber) {
        this.rootView = rootView;
        this.tvSurah = tvSurah;
        this.tvSurahNameAndNumber = tvSurahNameAndNumber;
    }
    
    public static RowSearchQuranBinding bind(final View view) {
        int n = R$id.tv_surah;
        final TextCustumFontAR textCustumFontAR = (TextCustumFontAR)ViewBindings.findChildViewById(view, n);
        if (textCustumFontAR != null) {
            n = R$id.tv_surah_name_and_number;
            final TextCustumFontAR textCustumFontAR2 = (TextCustumFontAR)ViewBindings.findChildViewById(view, n);
            if (textCustumFontAR2 != null) {
                return new RowSearchQuranBinding((LinearLayout)view, textCustumFontAR, textCustumFontAR2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static RowSearchQuranBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RowSearchQuranBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.row_search_quran, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
