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

public final class RowImgBgBinding implements ViewBinding
{
    public final ImageView img;
    private final FrameLayout rootView;
    public final ImageView thumbnailYtb;
    
    private RowImgBgBinding(final FrameLayout rootView, final ImageView img, final ImageView thumbnailYtb) {
        this.rootView = rootView;
        this.img = img;
        this.thumbnailYtb = thumbnailYtb;
    }
    
    public static RowImgBgBinding bind(final View view) {
        int n = R$id.img;
        final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
        if (imageView != null) {
            n = R$id.thumbnail_ytb;
            final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
            if (imageView2 != null) {
                return new RowImgBgBinding((FrameLayout)view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static RowImgBgBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RowImgBgBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.row_img_bg, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
