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
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;

public final class RowFontBinding implements ViewBinding
{
    private final RelativeLayout rootView;
    public final TextCustumFont tvFont;
    public final TextCustumFont tvNumber;
    
    private RowFontBinding(final RelativeLayout rootView, final TextCustumFont tvFont, final TextCustumFont tvNumber) {
        this.rootView = rootView;
        this.tvFont = tvFont;
        this.tvNumber = tvNumber;
    }
    
    public static RowFontBinding bind(final View view) {
        int n = R$id.tv_font;
        final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
        if (textCustumFont != null) {
            n = R$id.tv_number;
            final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
            if (textCustumFont2 != null) {
                return new RowFontBinding((RelativeLayout)view, textCustumFont, textCustumFont2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static RowFontBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RowFontBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.row_font, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
