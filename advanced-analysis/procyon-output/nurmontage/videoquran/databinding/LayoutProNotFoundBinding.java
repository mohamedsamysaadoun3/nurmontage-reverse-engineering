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
import hazem.nurmontage.videoquran.views.TextCustumFontBold;
import android.widget.ImageButton;
import android.widget.Button;
import androidx.viewbinding.ViewBinding;

public final class LayoutProNotFoundBinding implements ViewBinding
{
    public final Button contactUs;
    public final ImageButton dialogNo;
    public final TextCustumFontBold dialogTitle;
    private final LinearLayout rootView;
    public final TextCustumFont tvMsj;
    
    private LayoutProNotFoundBinding(final LinearLayout rootView, final Button contactUs, final ImageButton dialogNo, final TextCustumFontBold dialogTitle, final TextCustumFont tvMsj) {
        this.rootView = rootView;
        this.contactUs = contactUs;
        this.dialogNo = dialogNo;
        this.dialogTitle = dialogTitle;
        this.tvMsj = tvMsj;
    }
    
    public static LayoutProNotFoundBinding bind(final View view) {
        int n = R$id.contact_us;
        final Button button = (Button)ViewBindings.findChildViewById(view, n);
        if (button != null) {
            n = R$id.dialog_no;
            final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
            if (imageButton != null) {
                n = R$id.dialog_title;
                final TextCustumFontBold textCustumFontBold = (TextCustumFontBold)ViewBindings.findChildViewById(view, n);
                if (textCustumFontBold != null) {
                    n = R$id.tv_msj;
                    final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                    if (textCustumFont != null) {
                        return new LayoutProNotFoundBinding((LinearLayout)view, button, imageButton, textCustumFontBold, textCustumFont);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static LayoutProNotFoundBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static LayoutProNotFoundBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.layout_pro_not_found, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
