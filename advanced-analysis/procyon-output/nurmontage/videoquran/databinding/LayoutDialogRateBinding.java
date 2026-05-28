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
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.LinearLayout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import androidx.viewbinding.ViewBinding;

public final class LayoutDialogRateBinding implements ViewBinding
{
    public final ButtonCustumFont btnRate;
    public final ButtonCustumFont btnRateNotNow;
    private final LinearLayout rootView;
    public final TextCustumFont tvSubtittle;
    public final TextCustumFontBold tvTittle;
    
    private LayoutDialogRateBinding(final LinearLayout rootView, final ButtonCustumFont btnRate, final ButtonCustumFont btnRateNotNow, final TextCustumFont tvSubtittle, final TextCustumFontBold tvTittle) {
        this.rootView = rootView;
        this.btnRate = btnRate;
        this.btnRateNotNow = btnRateNotNow;
        this.tvSubtittle = tvSubtittle;
        this.tvTittle = tvTittle;
    }
    
    public static LayoutDialogRateBinding bind(final View view) {
        int n = R$id.btn_rate;
        final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
        if (buttonCustumFont != null) {
            n = R$id.btn_rate_not_now;
            final ButtonCustumFont buttonCustumFont2 = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
            if (buttonCustumFont2 != null) {
                n = R$id.tv_subtittle;
                final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                if (textCustumFont != null) {
                    n = R$id.tv_tittle;
                    final TextCustumFontBold textCustumFontBold = (TextCustumFontBold)ViewBindings.findChildViewById(view, n);
                    if (textCustumFontBold != null) {
                        return new LayoutDialogRateBinding((LinearLayout)view, buttonCustumFont, buttonCustumFont2, textCustumFont, textCustumFontBold);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static LayoutDialogRateBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static LayoutDialogRateBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.layout_dialog_rate, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
