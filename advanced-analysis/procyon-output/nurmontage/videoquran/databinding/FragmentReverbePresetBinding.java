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
import hazem.nurmontage.videoquran.views.TextCustumFont;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class FragmentReverbePresetBinding implements ViewBinding
{
    public final LinearLayout btnApplAll;
    public final ImageButton btnDone;
    public final ImageView ivApplyAll;
    private final LinearLayout rootView;
    public final RecyclerView rv;
    public final TextCustumFont tvApplyAll;
    
    private FragmentReverbePresetBinding(final LinearLayout rootView, final LinearLayout btnApplAll, final ImageButton btnDone, final ImageView ivApplyAll, final RecyclerView rv, final TextCustumFont tvApplyAll) {
        this.rootView = rootView;
        this.btnApplAll = btnApplAll;
        this.btnDone = btnDone;
        this.ivApplyAll = ivApplyAll;
        this.rv = rv;
        this.tvApplyAll = tvApplyAll;
    }
    
    public static FragmentReverbePresetBinding bind(final View view) {
        int n = R$id.btn_appl_all;
        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
        if (linearLayout != null) {
            n = R$id.btn_done;
            final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
            if (imageButton != null) {
                n = R$id.iv_apply_all;
                final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                if (imageView != null) {
                    n = R$id.rv;
                    final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, n);
                    if (recyclerView != null) {
                        n = R$id.tv_apply_all;
                        final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                        if (textCustumFont != null) {
                            return new FragmentReverbePresetBinding((LinearLayout)view, linearLayout, imageButton, imageView, recyclerView, textCustumFont);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static FragmentReverbePresetBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentReverbePresetBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_reverbe_preset, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
