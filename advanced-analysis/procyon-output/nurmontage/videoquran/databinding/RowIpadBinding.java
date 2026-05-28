// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.databinding;

import hazem.nurmontage.videoquran.R$layout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import android.view.View;
import androidx.viewbinding.ViewBinding;

public final class RowIpadBinding implements ViewBinding
{
    public final View dot1;
    public final View dot2;
    public final ImageView img;
    public final ImageView ivPro;
    private final RelativeLayout rootView;
    public final LinearLayout viewOption;
    
    private RowIpadBinding(final RelativeLayout rootView, final View dot1, final View dot2, final ImageView img, final ImageView ivPro, final LinearLayout viewOption) {
        this.rootView = rootView;
        this.dot1 = dot1;
        this.dot2 = dot2;
        this.img = img;
        this.ivPro = ivPro;
        this.viewOption = viewOption;
    }
    
    public static RowIpadBinding bind(final View view) {
        int n = R$id.dot1;
        final View childViewById = ViewBindings.findChildViewById(view, n);
        if (childViewById != null) {
            n = R$id.dot2;
            final View childViewById2 = ViewBindings.findChildViewById(view, n);
            if (childViewById2 != null) {
                n = R$id.img;
                final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                if (imageView != null) {
                    n = R$id.iv_pro;
                    final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
                    if (imageView2 != null) {
                        n = R$id.view_option;
                        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
                        if (linearLayout != null) {
                            return new RowIpadBinding((RelativeLayout)view, childViewById, childViewById2, imageView, imageView2, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static RowIpadBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RowIpadBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.row_ipad, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
