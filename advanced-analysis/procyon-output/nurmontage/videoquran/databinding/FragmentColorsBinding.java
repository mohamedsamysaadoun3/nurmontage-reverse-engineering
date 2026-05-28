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
import androidx.recyclerview.widget.RecyclerView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class FragmentColorsBinding implements ViewBinding
{
    public final LayoutEditGradientBinding layoutEditGradient;
    private final LinearLayout rootView;
    public final RecyclerView rvColor;
    
    private FragmentColorsBinding(final LinearLayout rootView, final LayoutEditGradientBinding layoutEditGradient, final RecyclerView rvColor) {
        this.rootView = rootView;
        this.layoutEditGradient = layoutEditGradient;
        this.rvColor = rvColor;
    }
    
    public static FragmentColorsBinding bind(final View view) {
        int layout_edit_gradient = R$id.layout_edit_gradient;
        final View childViewById = ViewBindings.findChildViewById(view, layout_edit_gradient);
        if (childViewById != null) {
            final LayoutEditGradientBinding bind = LayoutEditGradientBinding.bind(childViewById);
            final int rv_color = R$id.rv_color;
            final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, rv_color);
            if (recyclerView != null) {
                return new FragmentColorsBinding((LinearLayout)view, bind, recyclerView);
            }
            layout_edit_gradient = rv_color;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(layout_edit_gradient)));
    }
    
    public static FragmentColorsBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentColorsBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_colors, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
