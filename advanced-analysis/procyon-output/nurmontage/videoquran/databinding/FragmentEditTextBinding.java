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
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class FragmentEditTextBinding implements ViewBinding
{
    public final ImageButton btnClose;
    private final LinearLayout rootView;
    public final RecyclerView rv;
    
    private FragmentEditTextBinding(final LinearLayout rootView, final ImageButton btnClose, final RecyclerView rv) {
        this.rootView = rootView;
        this.btnClose = btnClose;
        this.rv = rv;
    }
    
    public static FragmentEditTextBinding bind(final View view) {
        int n = R$id.btn_close;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.rv;
            final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
            if (recyclerView != null) {
                return new FragmentEditTextBinding((LinearLayout)view, imageButton, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static FragmentEditTextBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentEditTextBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_edit_text, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
