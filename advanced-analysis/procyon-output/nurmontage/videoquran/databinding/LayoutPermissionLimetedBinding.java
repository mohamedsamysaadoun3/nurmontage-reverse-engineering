// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.databinding;

import hazem.nurmontage.videoquran.R$layout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class LayoutPermissionLimetedBinding implements ViewBinding
{
    private final LinearLayout rootView;
    
    private LayoutPermissionLimetedBinding(final LinearLayout rootView) {
        this.rootView = rootView;
    }
    
    public static LayoutPermissionLimetedBinding bind(final View view) {
        if (view != null) {
            return new LayoutPermissionLimetedBinding((LinearLayout)view);
        }
        throw new NullPointerException("rootView");
    }
    
    public static LayoutPermissionLimetedBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static LayoutPermissionLimetedBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.layout_permission_limeted, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
