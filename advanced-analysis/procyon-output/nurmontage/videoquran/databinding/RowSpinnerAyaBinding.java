// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.databinding;

import hazem.nurmontage.videoquran.R$layout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import androidx.viewbinding.ViewBinding;

public final class RowSpinnerAyaBinding implements ViewBinding
{
    private final TextCustumFont rootView;
    public final TextCustumFont spinnerText;
    
    private RowSpinnerAyaBinding(final TextCustumFont rootView, final TextCustumFont spinnerText) {
        this.rootView = rootView;
        this.spinnerText = spinnerText;
    }
    
    public static RowSpinnerAyaBinding bind(final View view) {
        if (view != null) {
            final TextCustumFont textCustumFont = (TextCustumFont)view;
            return new RowSpinnerAyaBinding(textCustumFont, textCustumFont);
        }
        throw new NullPointerException("rootView");
    }
    
    public static RowSpinnerAyaBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RowSpinnerAyaBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.row_spinner_aya, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public TextCustumFont getRoot() {
        return this.rootView;
    }
}
