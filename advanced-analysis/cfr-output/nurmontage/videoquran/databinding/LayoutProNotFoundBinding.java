/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;

public final class LayoutProNotFoundBinding
implements ViewBinding {
    public final Button contactUs;
    public final ImageButton dialogNo;
    public final TextCustumFontBold dialogTitle;
    private final LinearLayout rootView;
    public final TextCustumFont tvMsj;

    private LayoutProNotFoundBinding(LinearLayout linearLayout, Button button, ImageButton imageButton, TextCustumFontBold textCustumFontBold, TextCustumFont textCustumFont) {
        this.rootView = linearLayout;
        this.contactUs = button;
        this.dialogNo = imageButton;
        this.dialogTitle = textCustumFontBold;
        this.tvMsj = textCustumFont;
    }

    public static LayoutProNotFoundBinding bind(View object) {
        View view;
        int n = R$id.contact_us;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (Button)view;
        if (view2 != null) {
            n = R$id.dialog_no;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (ImageButton)view;
            if (view3 != null) {
                n = R$id.dialog_title;
                Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                object2 = (TextCustumFontBold)view;
                if (object2 != null) {
                    n = R$id.tv_msj;
                    Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    object3 = (TextCustumFont)view;
                    if (object3 != null) {
                        Object object4 = object;
                        object4 = (LinearLayout)object;
                        LayoutProNotFoundBinding layoutProNotFoundBinding = new LayoutProNotFoundBinding((LinearLayout)object4, (Button)view2, (ImageButton)view3, (TextCustumFontBold)((Object)object2), (TextCustumFont)((Object)object3));
                        return layoutProNotFoundBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutProNotFoundBinding inflate(LayoutInflater layoutInflater) {
        return LayoutProNotFoundBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutProNotFoundBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_pro_not_found;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutProNotFoundBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

