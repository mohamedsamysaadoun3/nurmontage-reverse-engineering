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

public final class RowWordAyaBinding implements ViewBinding
{
    private final TextCustumFont rootView;
    public final TextCustumFont wordAya;
    
    private RowWordAyaBinding(final TextCustumFont rootView, final TextCustumFont wordAya) {
        this.rootView = rootView;
        this.wordAya = wordAya;
    }
    
    public static RowWordAyaBinding bind(final View view) {
        if (view != null) {
            final TextCustumFont textCustumFont = (TextCustumFont)view;
            return new RowWordAyaBinding(textCustumFont, textCustumFont);
        }
        throw new NullPointerException("rootView");
    }
    
    public static RowWordAyaBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RowWordAyaBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.row_word_aya, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public TextCustumFont getRoot() {
        return this.rootView;
    }
}
