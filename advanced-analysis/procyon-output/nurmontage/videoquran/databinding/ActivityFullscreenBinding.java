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
import android.widget.FrameLayout;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import androidx.viewbinding.ViewBinding;

public final class ActivityFullscreenBinding implements ViewBinding
{
    public final TextCustumFontBold nur;
    private final FrameLayout rootView;
    
    private ActivityFullscreenBinding(final FrameLayout rootView, final TextCustumFontBold nur) {
        this.rootView = rootView;
        this.nur = nur;
    }
    
    public static ActivityFullscreenBinding bind(final View view) {
        final int nur = R$id.nur;
        final TextCustumFontBold textCustumFontBold = (TextCustumFontBold)ViewBindings.findChildViewById(view, nur);
        if (textCustumFontBold != null) {
            return new ActivityFullscreenBinding((FrameLayout)view, textCustumFontBold);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(nur)));
    }
    
    public static ActivityFullscreenBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityFullscreenBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_fullscreen, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
