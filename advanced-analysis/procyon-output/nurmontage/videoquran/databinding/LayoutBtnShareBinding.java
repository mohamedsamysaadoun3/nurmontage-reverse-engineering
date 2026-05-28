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

public final class LayoutBtnShareBinding implements ViewBinding
{
    private final RelativeLayout rootView;
    public final TextCustumFont tvShare;
    
    private LayoutBtnShareBinding(final RelativeLayout rootView, final TextCustumFont tvShare) {
        this.rootView = rootView;
        this.tvShare = tvShare;
    }
    
    public static LayoutBtnShareBinding bind(final View view) {
        final int tv_share = R$id.tv_share;
        final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, tv_share);
        if (textCustumFont != null) {
            return new LayoutBtnShareBinding((RelativeLayout)view, textCustumFont);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(tv_share)));
    }
    
    public static LayoutBtnShareBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static LayoutBtnShareBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.layout_btn_share, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
