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
import com.google.android.material.tabs.TabLayout;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.RelativeLayout;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class FragmentEditIpadBinding implements ViewBinding
{
    public final ImageButton btnCancel;
    public final ImageButton btnChange;
    public final ImageButton btnClose;
    public final ImageButton btnDone;
    public final FrameLayout container;
    private final RelativeLayout rootView;
    public final RecyclerView rvType;
    public final TabLayout tabLayout;
    
    private FragmentEditIpadBinding(final RelativeLayout rootView, final ImageButton btnCancel, final ImageButton btnChange, final ImageButton btnClose, final ImageButton btnDone, final FrameLayout container, final RecyclerView rvType, final TabLayout tabLayout) {
        this.rootView = rootView;
        this.btnCancel = btnCancel;
        this.btnChange = btnChange;
        this.btnClose = btnClose;
        this.btnDone = btnDone;
        this.container = container;
        this.rvType = rvType;
        this.tabLayout = tabLayout;
    }
    
    public static FragmentEditIpadBinding bind(final View view) {
        int n = R$id.btn_cancel;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.btn_change;
            final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
            if (imageButton2 != null) {
                n = R$id.btn_close;
                final ImageButton imageButton3 = (ImageButton)ViewBindings.findChildViewById(view, n);
                if (imageButton3 != null) {
                    n = R$id.btn_done;
                    final ImageButton imageButton4 = (ImageButton)ViewBindings.findChildViewById(view, n);
                    if (imageButton4 != null) {
                        n = R$id.container;
                        final FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById(view, n);
                        if (frameLayout != null) {
                            n = R$id.rv_type;
                            final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
                            if (recyclerView != null) {
                                n = R$id.tab_layout;
                                final TabLayout tabLayout = (TabLayout)ViewBindings.findChildViewById(view, n);
                                if (tabLayout != null) {
                                    return new FragmentEditIpadBinding((RelativeLayout)view, imageButton, imageButton2, imageButton3, imageButton4, frameLayout, recyclerView, tabLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static FragmentEditIpadBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentEditIpadBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_edit_ipad, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
