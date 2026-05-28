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
import androidx.viewbinding.ViewBinding;

public final class FragmentEditSNameBinding implements ViewBinding
{
    public final LinearLayout btnColor;
    public final LinearLayout btnEdit;
    public final LinearLayout btnFont;
    private final LinearLayout rootView;
    public final TextCustumFont tvColor;
    public final TextCustumFont tvEdit;
    public final TextCustumFont tvFont;
    
    private FragmentEditSNameBinding(final LinearLayout rootView, final LinearLayout btnColor, final LinearLayout btnEdit, final LinearLayout btnFont, final TextCustumFont tvColor, final TextCustumFont tvEdit, final TextCustumFont tvFont) {
        this.rootView = rootView;
        this.btnColor = btnColor;
        this.btnEdit = btnEdit;
        this.btnFont = btnFont;
        this.tvColor = tvColor;
        this.tvEdit = tvEdit;
        this.tvFont = tvFont;
    }
    
    public static FragmentEditSNameBinding bind(final View view) {
        int n = R$id.btn_color;
        final LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById(view, n);
        if (linearLayout != null) {
            n = R$id.btn_edit;
            final LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById(view, n);
            if (linearLayout2 != null) {
                n = R$id.btn_font;
                final LinearLayout linearLayout3 = (LinearLayout)ViewBindings.findChildViewById(view, n);
                if (linearLayout3 != null) {
                    n = R$id.tv_color;
                    final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                    if (textCustumFont != null) {
                        n = R$id.tv_edit;
                        final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                        if (textCustumFont2 != null) {
                            n = R$id.tv_font;
                            final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                            if (textCustumFont3 != null) {
                                return new FragmentEditSNameBinding((LinearLayout)view, linearLayout, linearLayout2, linearLayout3, textCustumFont, textCustumFont2, textCustumFont3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static FragmentEditSNameBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentEditSNameBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_edit_s__name, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
