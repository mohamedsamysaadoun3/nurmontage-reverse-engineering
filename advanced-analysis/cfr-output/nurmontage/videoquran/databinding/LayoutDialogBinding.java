/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class LayoutDialogBinding
implements ViewBinding {
    public final TextCustumFont dialogMessage;
    public final ButtonCustumFont dialogNo;
    public final TextCustumFont dialogTitle;
    public final ButtonCustumFont dialogYes;
    public final ImageView img;
    public final ImageView imgPro;
    private final LinearLayout rootView;

    private LayoutDialogBinding(LinearLayout linearLayout, TextCustumFont textCustumFont, ButtonCustumFont buttonCustumFont, TextCustumFont textCustumFont2, ButtonCustumFont buttonCustumFont2, ImageView imageView, ImageView imageView2) {
        this.rootView = linearLayout;
        this.dialogMessage = textCustumFont;
        this.dialogNo = buttonCustumFont;
        this.dialogTitle = textCustumFont2;
        this.dialogYes = buttonCustumFont2;
        this.img = imageView;
        this.imgPro = imageView2;
    }

    public static LayoutDialogBinding bind(View object) {
        View view;
        int n = R$id.dialog_message;
        Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        object2 = (TextCustumFont)view;
        if (object2 != null) {
            n = R$id.dialog_no;
            Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            object3 = (ButtonCustumFont)view;
            if (object3 != null) {
                n = R$id.dialog_title;
                Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                object4 = (TextCustumFont)view;
                if (object4 != null) {
                    n = R$id.dialog_yes;
                    Object object5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    object5 = (ButtonCustumFont)view;
                    if (object5 != null) {
                        n = R$id.img;
                        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        view2 = (ImageView)view;
                        if (view2 != null) {
                            n = R$id.img_pro;
                            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            view3 = (ImageView)view;
                            if (view3 != null) {
                                Object object6 = object;
                                object6 = (LinearLayout)object;
                                LayoutDialogBinding layoutDialogBinding = new LayoutDialogBinding((LinearLayout)object6, (TextCustumFont)((Object)object2), (ButtonCustumFont)((Object)object3), (TextCustumFont)((Object)object4), (ButtonCustumFont)((Object)object5), (ImageView)view2, (ImageView)view3);
                                return layoutDialogBinding;
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

    public static LayoutDialogBinding inflate(LayoutInflater layoutInflater) {
        return LayoutDialogBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_dialog;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutDialogBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

