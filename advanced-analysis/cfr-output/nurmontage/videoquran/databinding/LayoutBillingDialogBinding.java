/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class LayoutBillingDialogBinding
implements ViewBinding {
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

    private LayoutBillingDialogBinding(LinearLayout linearLayout, ImageButton imageButton, ButtonCustumFont buttonCustumFont, RelativeLayout relativeLayout, TextCustumFont textCustumFont, RelativeLayout relativeLayout2, ImageView imageView, ImageView imageView2, ProgressBar progressBar, TextCustumFont textCustumFont2, TextCustumFont textCustumFont3) {
        this.rootView = linearLayout;
        this.btnOnBack = imageButton;
        this.dialogMaybeLater = buttonCustumFont;
        this.dialogNo = relativeLayout;
        this.dialogTitle = textCustumFont;
        this.dialogYes = relativeLayout2;
        this.img = imageView;
        this.ivIcon = imageView2;
        this.progress = progressBar;
        this.tvSubscribe = textCustumFont2;
        this.tvWattermark = textCustumFont3;
    }

    public static LayoutBillingDialogBinding bind(View object) {
        View view;
        int n = R$id.btn_on_back;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ImageButton)view;
        if (view2 != null) {
            n = R$id.dialog_maybe_later;
            Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
            object2 = (ButtonCustumFont)view;
            if (object2 != null) {
                n = R$id.dialog_no;
                View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view3 = (RelativeLayout)view;
                if (view3 != null) {
                    n = R$id.dialog_title;
                    Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    object3 = (TextCustumFont)view;
                    if (object3 != null) {
                        n = R$id.dialog_yes;
                        View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        view4 = (RelativeLayout)view;
                        if (view4 != null) {
                            n = R$id.img;
                            View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            view5 = (ImageView)view;
                            if (view5 != null) {
                                n = R$id.iv_icon;
                                View view6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                view6 = (ImageView)view;
                                if (view6 != null) {
                                    n = R$id.progress;
                                    View view7 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                    view7 = (ProgressBar)view;
                                    if (view7 != null) {
                                        n = R$id.tv_subscribe;
                                        Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                        object4 = (TextCustumFont)view;
                                        if (object4 != null) {
                                            n = R$id.tv_wattermark;
                                            Object object5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                                            object5 = (TextCustumFont)view;
                                            if (object5 != null) {
                                                Object object6 = object;
                                                object6 = (LinearLayout)object;
                                                LayoutBillingDialogBinding layoutBillingDialogBinding = new LayoutBillingDialogBinding((LinearLayout)object6, (ImageButton)view2, (ButtonCustumFont)((Object)object2), (RelativeLayout)view3, (TextCustumFont)((Object)object3), (RelativeLayout)view4, (ImageView)view5, (ImageView)view6, (ProgressBar)view7, (TextCustumFont)((Object)object4), (TextCustumFont)((Object)object5));
                                                return layoutBillingDialogBinding;
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
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutBillingDialogBinding inflate(LayoutInflater layoutInflater) {
        return LayoutBillingDialogBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutBillingDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_billing_dialog;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutBillingDialogBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

