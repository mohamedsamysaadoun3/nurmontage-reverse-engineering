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
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;

public final class LayoutTablayoutBinding implements ViewBinding
{
    public final ImageView icon;
    public final TextCustumFont name;
    private final LinearLayout rootView;
    
    private LayoutTablayoutBinding(final LinearLayout rootView, final ImageView icon, final TextCustumFont name) {
        this.rootView = rootView;
        this.icon = icon;
        this.name = name;
    }
    
    public static LayoutTablayoutBinding bind(final View view) {
        int n = R$id.icon;
        final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
        if (imageView != null) {
            n = R$id.name;
            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
            if (textCustumFont != null) {
                return new LayoutTablayoutBinding((LinearLayout)view, imageView, textCustumFont);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static LayoutTablayoutBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static LayoutTablayoutBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.layout_tablayout, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
