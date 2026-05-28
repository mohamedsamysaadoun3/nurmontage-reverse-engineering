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
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;

public final class RowColorBinding implements ViewBinding
{
    public final ImageView image;
    public final ImageView layer;
    private final FrameLayout rootView;
    
    private RowColorBinding(final FrameLayout rootView, final ImageView image, final ImageView layer) {
        this.rootView = rootView;
        this.image = image;
        this.layer = layer;
    }
    
    public static RowColorBinding bind(final View view) {
        int n = R$id.image;
        final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
        if (imageView != null) {
            n = R$id.layer;
            final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
            if (imageView2 != null) {
                return new RowColorBinding((FrameLayout)view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static RowColorBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RowColorBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.row_color, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
