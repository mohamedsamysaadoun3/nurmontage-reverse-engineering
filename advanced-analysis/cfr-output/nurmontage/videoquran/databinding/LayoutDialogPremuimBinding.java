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
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class LayoutDialogPremuimBinding
implements ViewBinding {
    public final ImageView btnRadioYear;
    public final TextCustumFont dialogMessage;
    public final ImageButton dialogNo;
    public final TextCustumFont dialogTitle;
    public final RelativeLayout dialogYes;
    public final ImageView img;
    private final LinearLayout rootView;
    public final TextCustumFont tvFeature;
    public final TextCustumFont tvSubscribe;

    private LayoutDialogPremuimBinding(LinearLayout linearLayout, ImageView imageView, TextCustumFont textCustumFont, ImageButton imageButton, TextCustumFont textCustumFont2, RelativeLayout relativeLayout, ImageView imageView2, TextCustumFont textCustumFont3, TextCustumFont textCustumFont4) {
        this.rootView = linearLayout;
        this.btnRadioYear = imageView;
        this.dialogMessage = textCustumFont;
        this.dialogNo = imageButton;
        this.dialogTitle = textCustumFont2;
        this.dialogYes = relativeLayout;
        this.img = imageView2;
        this.tvFeature = textCustumFont3;
        this.tvSubscribe = textCustumFont4;
    }

    public static LayoutDialogPremuimBinding bind(View object) {
        View view;
        Object object2;
        int n = R$id.btn_radio_year;
        View view2 = object2 = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ImageView)object2;
        n = R$id.dialog_message;
        Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
        object3 = (TextCustumFont)view;
        if (object3 != null) {
            n = R$id.dialog_no;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (ImageButton)view;
            if (view3 != null) {
                n = R$id.dialog_title;
                Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                object4 = (TextCustumFont)view;
                if (object4 != null) {
                    n = R$id.dialog_yes;
                    View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view4 = (RelativeLayout)view;
                    if (view4 != null) {
                        n = R$id.img;
                        View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        view5 = (ImageView)view;
                        if (view5 != null) {
                            n = R$id.tv_feature;
                            Object object5 = object2 = ViewBindings.findChildViewById((View)object, (int)n);
                            object5 = (TextCustumFont)((Object)object2);
                            n = R$id.tv_subscribe;
                            Object object6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            object6 = (TextCustumFont)view;
                            if (object6 != null) {
                                Object object7 = object;
                                object7 = (LinearLayout)object;
                                view = object2;
                                object2 = new LayoutDialogPremuimBinding((LinearLayout)object7, (ImageView)view2, (TextCustumFont)((Object)object3), (ImageButton)view3, (TextCustumFont)((Object)object4), (RelativeLayout)view4, (ImageView)view5, (TextCustumFont)((Object)object5), (TextCustumFont)((Object)object6));
                                return object2;
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static LayoutDialogPremuimBinding inflate(LayoutInflater layoutInflater) {
        return LayoutDialogPremuimBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutDialogPremuimBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_dialog_premuim;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutDialogPremuimBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

