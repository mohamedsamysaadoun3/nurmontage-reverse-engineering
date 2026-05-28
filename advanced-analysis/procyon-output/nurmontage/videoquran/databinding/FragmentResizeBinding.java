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
import android.widget.RelativeLayout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import androidx.viewbinding.ViewBinding;

public final class FragmentResizeBinding implements ViewBinding
{
    public final ButtonCustumFont btnDone;
    private final RelativeLayout rootView;
    public final RecyclerView rv;
    public final View view;
    
    private FragmentResizeBinding(final RelativeLayout rootView, final ButtonCustumFont btnDone, final RecyclerView rv, final View view) {
        this.rootView = rootView;
        this.btnDone = btnDone;
        this.rv = rv;
        this.view = view;
    }
    
    public static FragmentResizeBinding bind(final View view) {
        int n = R$id.btn_done;
        final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
        if (buttonCustumFont != null) {
            n = R$id.rv;
            final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
            if (recyclerView != null) {
                n = R$id.view;
                final View childViewById = ViewBindings.findChildViewById(view, n);
                if (childViewById != null) {
                    return new FragmentResizeBinding((RelativeLayout)view, buttonCustumFont, recyclerView, childViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static FragmentResizeBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentResizeBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_resize, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
