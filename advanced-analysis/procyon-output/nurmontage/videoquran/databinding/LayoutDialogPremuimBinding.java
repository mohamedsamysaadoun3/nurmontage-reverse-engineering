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
import android.widget.RelativeLayout;
import android.widget.ImageButton;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;

public final class LayoutDialogPremuimBinding implements ViewBinding
{
    public final ImageView btnRadioYear;
    public final TextCustumFont dialogMessage;
    public final ImageButton dialogNo;
    public final TextCustumFont dialogTitle;
    public final RelativeLayout dialogYes;
    public final ImageView img;
    private final LinearLayout rootView;
    public final TextCustumFont tvFeature;
    public final TextCustumFont tvSubscribe;
    
    private LayoutDialogPremuimBinding(final LinearLayout rootView, final ImageView btnRadioYear, final TextCustumFont dialogMessage, final ImageButton dialogNo, final TextCustumFont dialogTitle, final RelativeLayout dialogYes, final ImageView img, final TextCustumFont tvFeature, final TextCustumFont tvSubscribe) {
        this.rootView = rootView;
        this.btnRadioYear = btnRadioYear;
        this.dialogMessage = dialogMessage;
        this.dialogNo = dialogNo;
        this.dialogTitle = dialogTitle;
        this.dialogYes = dialogYes;
        this.img = img;
        this.tvFeature = tvFeature;
        this.tvSubscribe = tvSubscribe;
    }
    
    public static LayoutDialogPremuimBinding bind(final View view) {
        final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, R$id.btn_radio_year);
        int n = R$id.dialog_message;
        final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
        if (textCustumFont != null) {
            n = R$id.dialog_no;
            final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
            if (imageButton != null) {
                n = R$id.dialog_title;
                final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                if (textCustumFont2 != null) {
                    n = R$id.dialog_yes;
                    final RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById(view, n);
                    if (relativeLayout != null) {
                        n = R$id.img;
                        final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
                        if (imageView2 != null) {
                            final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, R$id.tv_feature);
                            n = R$id.tv_subscribe;
                            final TextCustumFont textCustumFont4 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                            if (textCustumFont4 != null) {
                                return new LayoutDialogPremuimBinding((LinearLayout)view, imageView, textCustumFont, imageButton, textCustumFont2, relativeLayout, imageView2, textCustumFont3, textCustumFont4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static LayoutDialogPremuimBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static LayoutDialogPremuimBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.layout_dialog_premuim, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
