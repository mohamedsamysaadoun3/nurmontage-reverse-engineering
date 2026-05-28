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
import androidx.viewbinding.ViewBinding;

public final class LayoutBtnUnlockBinding implements ViewBinding
{
    private final LinearLayout rootView;
    public final TextCustumFont tvUnlock;
    
    private LayoutBtnUnlockBinding(final LinearLayout rootView, final TextCustumFont tvUnlock) {
        this.rootView = rootView;
        this.tvUnlock = tvUnlock;
    }
    
    public static LayoutBtnUnlockBinding bind(final View view) {
        final int tv_unlock = R$id.tv_unlock;
        final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, tv_unlock);
        if (textCustumFont != null) {
            return new LayoutBtnUnlockBinding((LinearLayout)view, textCustumFont);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(tv_unlock)));
    }
    
    public static LayoutBtnUnlockBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static LayoutBtnUnlockBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.layout_btn_unlock, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
