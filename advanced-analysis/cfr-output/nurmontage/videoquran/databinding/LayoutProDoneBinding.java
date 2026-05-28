/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import hazem.nurmontage.videoquran.views.TextCustumFontBold;

public final class LayoutProDoneBinding
implements ViewBinding {
    public final ImageButton dialogNo;
    public final TextCustumFontBold dialogTitle;
    private final LinearLayout rootView;
    public final TextCustumFont tvMsj;

    private LayoutProDoneBinding(LinearLayout linearLayout, ImageButton imageButton, TextCustumFontBold textCustumFontBold, TextCustumFont textCustumFont) {
        this.rootView = linearLayout;
        this.dialogNo = imageButton;
        this.dialogTitle = textCustumFontBold;
        this.tvMsj = textCustumFont;
    }

    public static LayoutProDoneBinding bind(View object) {
        TextCustumFont textCustumFont;
        TextCustumFontBold textCustumFontBold;
        int n = R$id.dialog_no;
        ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById((View)object, (int)n);
        if (imageButton != null && (textCustumFontBold = (TextCustumFontBold)ViewBindings.findChildViewById((View)object, (int)(n = R$id.dialog_title))) != null && (textCustumFont = (TextCustumFont)ViewBindings.findChildViewById((View)object, (int)(n = R$id.tv_msj))) != null) {
            object = (LinearLayout)object;
            LayoutProDoneBinding layoutProDoneBinding = new LayoutProDoneBinding((LinearLayout)object, imageButton, textCustumFontBold, textCustumFont);
            return layoutProDoneBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutProDoneBinding inflate(LayoutInflater layoutInflater) {
        return LayoutProDoneBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutProDoneBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.layout_pro_done;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutProDoneBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

