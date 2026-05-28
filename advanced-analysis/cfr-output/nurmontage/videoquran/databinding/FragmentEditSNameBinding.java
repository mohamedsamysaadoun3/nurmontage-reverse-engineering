/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class FragmentEditSNameBinding
implements ViewBinding {
    public final LinearLayout btnColor;
    public final LinearLayout btnEdit;
    public final LinearLayout btnFont;
    private final LinearLayout rootView;
    public final TextCustumFont tvColor;
    public final TextCustumFont tvEdit;
    public final TextCustumFont tvFont;

    private FragmentEditSNameBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextCustumFont textCustumFont, TextCustumFont textCustumFont2, TextCustumFont textCustumFont3) {
        this.rootView = linearLayout;
        this.btnColor = linearLayout2;
        this.btnEdit = linearLayout3;
        this.btnFont = linearLayout4;
        this.tvColor = textCustumFont;
        this.tvEdit = textCustumFont2;
        this.tvFont = textCustumFont3;
    }

    public static FragmentEditSNameBinding bind(View object) {
        View view;
        int n = R$id.btn_color;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n = R$id.btn_edit;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n = R$id.btn_font;
                View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view4 = (LinearLayout)view;
                if (view4 != null) {
                    n = R$id.tv_color;
                    Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    object2 = (TextCustumFont)view;
                    if (object2 != null) {
                        n = R$id.tv_edit;
                        Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        object3 = (TextCustumFont)view;
                        if (object3 != null) {
                            n = R$id.tv_font;
                            Object object4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                            object4 = (TextCustumFont)view;
                            if (object4 != null) {
                                Object object5 = object;
                                object5 = (LinearLayout)object;
                                FragmentEditSNameBinding fragmentEditSNameBinding = new FragmentEditSNameBinding((LinearLayout)object5, (LinearLayout)view2, (LinearLayout)view3, (LinearLayout)view4, (TextCustumFont)((Object)object2), (TextCustumFont)((Object)object3), (TextCustumFont)((Object)object4));
                                return fragmentEditSNameBinding;
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

    public static FragmentEditSNameBinding inflate(LayoutInflater layoutInflater) {
        return FragmentEditSNameBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentEditSNameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_edit_s__name;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentEditSNameBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

