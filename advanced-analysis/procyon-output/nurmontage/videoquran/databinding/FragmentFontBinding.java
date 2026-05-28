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

public final class FragmentFontBinding implements ViewBinding
{
    public final ImageButton btnCancel;
    public final ImageButton btnDone;
    private final LinearLayout rootView;
    public final RecyclerView rv;
    
    private FragmentFontBinding(final LinearLayout rootView, final ImageButton btnCancel, final ImageButton btnDone, final RecyclerView rv) {
        this.rootView = rootView;
        this.btnCancel = btnCancel;
        this.btnDone = btnDone;
        this.rv = rv;
    }
    
    public static FragmentFontBinding bind(final View view) {
        int n = R$id.btn_cancel;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.btn_done;
            final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
            if (imageButton2 != null) {
                n = R$id.rv;
                final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
                if (recyclerView != null) {
                    return new FragmentFontBinding((LinearLayout)view, imageButton, imageButton2, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static FragmentFontBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentFontBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_font, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
