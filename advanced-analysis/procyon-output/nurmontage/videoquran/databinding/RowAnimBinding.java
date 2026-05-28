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
import android.widget.RelativeLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;

public final class RowAnimBinding implements ViewBinding
{
    public final ImageView animItem;
    public final ImageView ivDisable;
    private final RelativeLayout rootView;
    
    private RowAnimBinding(final RelativeLayout rootView, final ImageView animItem, final ImageView ivDisable) {
        this.rootView = rootView;
        this.animItem = animItem;
        this.ivDisable = ivDisable;
    }
    
    public static RowAnimBinding bind(final View view) {
        int n = R$id.anim_item;
        final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
        if (imageView != null) {
            n = R$id.iv_disable;
            final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
            if (imageView2 != null) {
                return new RowAnimBinding((RelativeLayout)view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static RowAnimBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RowAnimBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.row_anim, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
