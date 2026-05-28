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
import android.widget.LinearLayout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import androidx.viewbinding.ViewBinding;

public final class RatingBottomSheetBinding implements ViewBinding
{
    public final ButtonCustumFont laterButton;
    public final ButtonCustumFont neverButton;
    public final ButtonCustumFont rateButton;
    private final LinearLayout rootView;
    public final TextCustumFont tvSubtittle;
    public final TextCustumFont tvTittle;
    
    private RatingBottomSheetBinding(final LinearLayout rootView, final ButtonCustumFont laterButton, final ButtonCustumFont neverButton, final ButtonCustumFont rateButton, final TextCustumFont tvSubtittle, final TextCustumFont tvTittle) {
        this.rootView = rootView;
        this.laterButton = laterButton;
        this.neverButton = neverButton;
        this.rateButton = rateButton;
        this.tvSubtittle = tvSubtittle;
        this.tvTittle = tvTittle;
    }
    
    public static RatingBottomSheetBinding bind(final View view) {
        int n = R$id.laterButton;
        final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
        if (buttonCustumFont != null) {
            n = R$id.neverButton;
            final ButtonCustumFont buttonCustumFont2 = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
            if (buttonCustumFont2 != null) {
                n = R$id.rateButton;
                final ButtonCustumFont buttonCustumFont3 = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
                if (buttonCustumFont3 != null) {
                    n = R$id.tv_subtittle;
                    final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                    if (textCustumFont != null) {
                        n = R$id.tv_tittle;
                        final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                        if (textCustumFont2 != null) {
                            return new RatingBottomSheetBinding((LinearLayout)view, buttonCustumFont, buttonCustumFont2, buttonCustumFont3, textCustumFont, textCustumFont2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static RatingBottomSheetBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RatingBottomSheetBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.rating_bottom_sheet, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
