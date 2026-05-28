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
import androidx.recyclerview.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class ActivityAboutBinding implements ViewBinding
{
    public final ImageButton btnOnBack;
    public final LinearLayout main;
    private final LinearLayout rootView;
    public final RecyclerView rv;
    public final RelativeLayout toolbar;
    
    private ActivityAboutBinding(final LinearLayout rootView, final ImageButton btnOnBack, final LinearLayout main, final RecyclerView rv, final RelativeLayout toolbar) {
        this.rootView = rootView;
        this.btnOnBack = btnOnBack;
        this.main = main;
        this.rv = rv;
        this.toolbar = toolbar;
    }
    
    public static ActivityAboutBinding bind(final View view) {
        int n = R$id.btn_on_back;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            final LinearLayout linearLayout = (LinearLayout)view;
            n = R$id.rv;
            final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
            if (recyclerView != null) {
                n = R$id.toolbar;
                final RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById(view, n);
                if (relativeLayout != null) {
                    return new ActivityAboutBinding(linearLayout, imageButton, linearLayout, recyclerView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static ActivityAboutBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityAboutBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_about, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
