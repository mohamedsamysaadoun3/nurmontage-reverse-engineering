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
import android.widget.LinearLayout;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import androidx.viewbinding.ViewBinding;

public final class RowAspectBinding implements ViewBinding
{
    public final TextCustumFont aspectName;
    public final TextCustumFont aspectSize;
    public final RelativeLayout container;
    public final ImageView icon;
    public final FrameLayout layout;
    private final LinearLayout rootView;
    
    private RowAspectBinding(final LinearLayout rootView, final TextCustumFont aspectName, final TextCustumFont aspectSize, final RelativeLayout container, final ImageView icon, final FrameLayout layout) {
        this.rootView = rootView;
        this.aspectName = aspectName;
        this.aspectSize = aspectSize;
        this.container = container;
        this.icon = icon;
        this.layout = layout;
    }
    
    public static RowAspectBinding bind(final View view) {
        int n = R$id.aspect_name;
        final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
        if (textCustumFont != null) {
            n = R$id.aspect_size;
            final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
            if (textCustumFont2 != null) {
                n = R$id.container;
                final RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById(view, n);
                if (relativeLayout != null) {
                    n = R$id.icon;
                    final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                    if (imageView != null) {
                        n = R$id.layout;
                        final FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById(view, n);
                        if (frameLayout != null) {
                            return new RowAspectBinding((LinearLayout)view, textCustumFont, textCustumFont2, relativeLayout, imageView, frameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static RowAspectBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RowAspectBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.row_aspect, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
