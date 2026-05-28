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
import android.widget.LinearLayout;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import androidx.viewbinding.ViewBinding;

public final class LayoutDialogBinding implements ViewBinding
{
    public final TextCustumFont dialogMessage;
    public final ButtonCustumFont dialogNo;
    public final TextCustumFont dialogTitle;
    public final ButtonCustumFont dialogYes;
    public final ImageView img;
    public final ImageView imgPro;
    private final LinearLayout rootView;
    
    private LayoutDialogBinding(final LinearLayout rootView, final TextCustumFont dialogMessage, final ButtonCustumFont dialogNo, final TextCustumFont dialogTitle, final ButtonCustumFont dialogYes, final ImageView img, final ImageView imgPro) {
        this.rootView = rootView;
        this.dialogMessage = dialogMessage;
        this.dialogNo = dialogNo;
        this.dialogTitle = dialogTitle;
        this.dialogYes = dialogYes;
        this.img = img;
        this.imgPro = imgPro;
    }
    
    public static LayoutDialogBinding bind(final View view) {
        int n = R$id.dialog_message;
        final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
        if (textCustumFont != null) {
            n = R$id.dialog_no;
            final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
            if (buttonCustumFont != null) {
                n = R$id.dialog_title;
                final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                if (textCustumFont2 != null) {
                    n = R$id.dialog_yes;
                    final ButtonCustumFont buttonCustumFont2 = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
                    if (buttonCustumFont2 != null) {
                        n = R$id.img;
                        final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                        if (imageView != null) {
                            n = R$id.img_pro;
                            final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
                            if (imageView2 != null) {
                                return new LayoutDialogBinding((LinearLayout)view, textCustumFont, buttonCustumFont, textCustumFont2, buttonCustumFont2, imageView, imageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static LayoutDialogBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static LayoutDialogBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.layout_dialog, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
