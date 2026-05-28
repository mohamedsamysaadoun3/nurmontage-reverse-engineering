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
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class LayoutHelpWhatsappBinding implements ViewBinding
{
    public final LinearLayout btnHelp;
    public final ImageView btnToAbout;
    private final LinearLayout rootView;
    public final TextCustumFont tvHelp;
    
    private LayoutHelpWhatsappBinding(final LinearLayout rootView, final LinearLayout btnHelp, final ImageView btnToAbout, final TextCustumFont tvHelp) {
        this.rootView = rootView;
        this.btnHelp = btnHelp;
        this.btnToAbout = btnToAbout;
        this.tvHelp = tvHelp;
    }
    
    public static LayoutHelpWhatsappBinding bind(final View view) {
        final LinearLayout linearLayout = (LinearLayout)view;
        int n = R$id.btn_to_about;
        final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
        if (imageView != null) {
            n = R$id.tv_help;
            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
            if (textCustumFont != null) {
                return new LayoutHelpWhatsappBinding(linearLayout, linearLayout, imageView, textCustumFont);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static LayoutHelpWhatsappBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static LayoutHelpWhatsappBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.layout_help_whatsapp, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
