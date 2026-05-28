// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.databinding;

import hazem.nurmontage.videoquran.R$layout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.view.View;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;

public final class LayoutTittleProActBinding implements ViewBinding
{
    public final ImageView ivConfirm;
    private final View rootView;
    public final TextCustumFont tvSubtittle;
    
    private LayoutTittleProActBinding(final View rootView, final ImageView ivConfirm, final TextCustumFont tvSubtittle) {
        this.rootView = rootView;
        this.ivConfirm = ivConfirm;
        this.tvSubtittle = tvSubtittle;
    }
    
    public static LayoutTittleProActBinding bind(final View view) {
        int n = R$id.iv_confirm;
        final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
        if (imageView != null) {
            n = R$id.tv_subtittle;
            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
            if (textCustumFont != null) {
                return new LayoutTittleProActBinding(view, imageView, textCustumFont);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static LayoutTittleProActBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static LayoutTittleProActBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.layout_tittle_pro_act, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public View getRoot() {
        return this.rootView;
    }
}
