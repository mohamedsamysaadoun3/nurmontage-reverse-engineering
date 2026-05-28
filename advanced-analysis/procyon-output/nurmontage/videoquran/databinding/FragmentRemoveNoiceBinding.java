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
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class FragmentRemoveNoiceBinding implements ViewBinding
{
    public final LinearLayout btnApplAll;
    public final ImageButton btnDone;
    public final ImageButton btnPlay;
    public final SwitchCompat btnRemoveNoice;
    public final ImageView ivApplyAll;
    private final LinearLayout rootView;
    public final TextCustumFont tvApplyAll;
    public final TextCustumFont tvRemoveNoice;
    
    private FragmentRemoveNoiceBinding(final LinearLayout rootView, final LinearLayout btnApplAll, final ImageButton btnDone, final ImageButton btnPlay, final SwitchCompat btnRemoveNoice, final ImageView ivApplyAll, final TextCustumFont tvApplyAll, final TextCustumFont tvRemoveNoice) {
        this.rootView = rootView;
        this.btnApplAll = btnApplAll;
        this.btnDone = btnDone;
        this.btnPlay = btnPlay;
        this.btnRemoveNoice = btnRemoveNoice;
        this.ivApplyAll = ivApplyAll;
        this.tvApplyAll = tvApplyAll;
        this.tvRemoveNoice = tvRemoveNoice;
    }
    
    public static FragmentRemoveNoiceBinding bind(final View view) {
        int n = R$id.btn_appl_all;
        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
        if (linearLayout != null) {
            n = R$id.btn_done;
            final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
            if (imageButton != null) {
                n = R$id.btn_play;
                final ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById(view, n);
                if (imageButton2 != null) {
                    n = R$id.btn_remove_noice;
                    final SwitchCompat switchCompat = (SwitchCompat)ViewBindings.findChildViewById(view, n);
                    if (switchCompat != null) {
                        n = R$id.iv_apply_all;
                        final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                        if (imageView != null) {
                            n = R$id.tv_apply_all;
                            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                            if (textCustumFont != null) {
                                n = R$id.tv_remove_noice;
                                final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                if (textCustumFont2 != null) {
                                    return new FragmentRemoveNoiceBinding((LinearLayout)view, linearLayout, imageButton, imageButton2, switchCompat, imageView, textCustumFont, textCustumFont2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static FragmentRemoveNoiceBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentRemoveNoiceBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_remove_noice, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
