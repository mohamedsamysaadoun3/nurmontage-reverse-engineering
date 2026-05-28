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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;

public final class LayoutWorkSetupBinding implements ViewBinding
{
    public final RelativeLayout btnDelete;
    public final RelativeLayout btnDuplicate;
    public final RelativeLayout btnShare;
    private final LinearLayout rootView;
    public final TextCustumFont tvDelete;
    public final TextCustumFont tvDuplicate;
    public final TextCustumFont tvShare;
    
    private LayoutWorkSetupBinding(final LinearLayout rootView, final RelativeLayout btnDelete, final RelativeLayout btnDuplicate, final RelativeLayout btnShare, final TextCustumFont tvDelete, final TextCustumFont tvDuplicate, final TextCustumFont tvShare) {
        this.rootView = rootView;
        this.btnDelete = btnDelete;
        this.btnDuplicate = btnDuplicate;
        this.btnShare = btnShare;
        this.tvDelete = tvDelete;
        this.tvDuplicate = tvDuplicate;
        this.tvShare = tvShare;
    }
    
    public static LayoutWorkSetupBinding bind(final View view) {
        int n = R$id.btn_delete;
        final RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById(view, n);
        if (relativeLayout != null) {
            n = R$id.btn_duplicate;
            final RelativeLayout relativeLayout2 = (RelativeLayout)ViewBindings.findChildViewById(view, n);
            if (relativeLayout2 != null) {
                n = R$id.btn_share;
                final RelativeLayout relativeLayout3 = (RelativeLayout)ViewBindings.findChildViewById(view, n);
                if (relativeLayout3 != null) {
                    n = R$id.tv_delete;
                    final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                    if (textCustumFont != null) {
                        n = R$id.tv_duplicate;
                        final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                        if (textCustumFont2 != null) {
                            n = R$id.tv_share;
                            final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                            if (textCustumFont3 != null) {
                                return new LayoutWorkSetupBinding((LinearLayout)view, relativeLayout, relativeLayout2, relativeLayout3, textCustumFont, textCustumFont2, textCustumFont3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static LayoutWorkSetupBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static LayoutWorkSetupBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.layout_work_setup, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
