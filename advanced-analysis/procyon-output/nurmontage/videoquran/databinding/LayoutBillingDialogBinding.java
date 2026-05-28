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
import android.widget.ProgressBar;
import android.widget.ImageView;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.RelativeLayout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class LayoutBillingDialogBinding implements ViewBinding
{
    public final ImageButton btnOnBack;
    public final ButtonCustumFont dialogMaybeLater;
    public final RelativeLayout dialogNo;
    public final TextCustumFont dialogTitle;
    public final RelativeLayout dialogYes;
    public final ImageView img;
    public final ImageView ivIcon;
    public final ProgressBar progress;
    private final LinearLayout rootView;
    public final TextCustumFont tvSubscribe;
    public final TextCustumFont tvWattermark;
    
    private LayoutBillingDialogBinding(final LinearLayout rootView, final ImageButton btnOnBack, final ButtonCustumFont dialogMaybeLater, final RelativeLayout dialogNo, final TextCustumFont dialogTitle, final RelativeLayout dialogYes, final ImageView img, final ImageView ivIcon, final ProgressBar progress, final TextCustumFont tvSubscribe, final TextCustumFont tvWattermark) {
        this.rootView = rootView;
        this.btnOnBack = btnOnBack;
        this.dialogMaybeLater = dialogMaybeLater;
        this.dialogNo = dialogNo;
        this.dialogTitle = dialogTitle;
        this.dialogYes = dialogYes;
        this.img = img;
        this.ivIcon = ivIcon;
        this.progress = progress;
        this.tvSubscribe = tvSubscribe;
        this.tvWattermark = tvWattermark;
    }
    
    public static LayoutBillingDialogBinding bind(final View view) {
        int n = R$id.btn_on_back;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            n = R$id.dialog_maybe_later;
            final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)ViewBindings.findChildViewById(view, n);
            if (buttonCustumFont != null) {
                n = R$id.dialog_no;
                final RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById(view, n);
                if (relativeLayout != null) {
                    n = R$id.dialog_title;
                    final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                    if (textCustumFont != null) {
                        n = R$id.dialog_yes;
                        final RelativeLayout relativeLayout2 = (RelativeLayout)ViewBindings.findChildViewById(view, n);
                        if (relativeLayout2 != null) {
                            n = R$id.img;
                            final ImageView imageView = (ImageView)ViewBindings.findChildViewById(view, n);
                            if (imageView != null) {
                                n = R$id.iv_icon;
                                final ImageView imageView2 = (ImageView)ViewBindings.findChildViewById(view, n);
                                if (imageView2 != null) {
                                    n = R$id.progress;
                                    final ProgressBar progressBar = (ProgressBar)ViewBindings.findChildViewById(view, n);
                                    if (progressBar != null) {
                                        n = R$id.tv_subscribe;
                                        final TextCustumFont textCustumFont2 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                        if (textCustumFont2 != null) {
                                            n = R$id.tv_wattermark;
                                            final TextCustumFont textCustumFont3 = (TextCustumFont)ViewBindings.findChildViewById(view, n);
                                            if (textCustumFont3 != null) {
                                                return new LayoutBillingDialogBinding((LinearLayout)view, imageButton, buttonCustumFont, relativeLayout, textCustumFont, relativeLayout2, imageView, imageView2, progressBar, textCustumFont2, textCustumFont3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static LayoutBillingDialogBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static LayoutBillingDialogBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.layout_billing_dialog, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
