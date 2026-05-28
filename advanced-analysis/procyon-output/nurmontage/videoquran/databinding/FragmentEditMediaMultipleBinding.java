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
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class FragmentEditMediaMultipleBinding implements ViewBinding
{
    public final LinearLayout btnCut;
    public final LinearLayout btnDelete;
    public final ImageView ivCut;
    private final RelativeLayout rootView;
    public final TextCustumFont tvCut;
    public final TextCustumFont tvDelete;
    
    private FragmentEditMediaMultipleBinding(final RelativeLayout rootView, final LinearLayout btnCut, final LinearLayout btnDelete, final ImageView ivCut, final TextCustumFont tvCut, final TextCustumFont tvDelete) {
        this.rootView = rootView;
        this.btnCut = btnCut;
        this.btnDelete = btnDelete;
        this.ivCut = ivCut;
        this.tvCut = tvCut;
        this.tvDelete = tvDelete;
    }
    
    public static FragmentEditMediaMultipleBinding bind(final View view) {
        int n = R$id.btn_cut;
        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
        if (linearLayout != null) {
            n = R$id.btn_delete;
            final LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById(view, n);
            if (linearLayout2 != null) {
                n = R$id.iv_cut;
                final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                if (imageView != null) {
                    n = R$id.tv_cut;
                    final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                    if (textCustumFont != null) {
                        n = R$id.tv_delete;
                        final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                        if (textCustumFont2 != null) {
                            return new FragmentEditMediaMultipleBinding((RelativeLayout)view, linearLayout, linearLayout2, imageView, textCustumFont, textCustumFont2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static FragmentEditMediaMultipleBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentEditMediaMultipleBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_edit_media_multiple, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
