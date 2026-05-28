/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class FragmentEditMediaMultipleBinding
implements ViewBinding {
    public final LinearLayout btnCut;
    public final LinearLayout btnDelete;
    public final ImageView ivCut;
    private final RelativeLayout rootView;
    public final TextCustumFont tvCut;
    public final TextCustumFont tvDelete;

    private FragmentEditMediaMultipleBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, TextCustumFont textCustumFont, TextCustumFont textCustumFont2) {
        this.rootView = relativeLayout;
        this.btnCut = linearLayout;
        this.btnDelete = linearLayout2;
        this.ivCut = imageView;
        this.tvCut = textCustumFont;
        this.tvDelete = textCustumFont2;
    }

    public static FragmentEditMediaMultipleBinding bind(View object) {
        View view;
        int n = R$id.btn_cut;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n = R$id.btn_delete;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n = R$id.iv_cut;
                View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n = R$id.tv_cut;
                    Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    object2 = (TextCustumFont)view;
                    if (object2 != null) {
                        n = R$id.tv_delete;
                        Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        object3 = (TextCustumFont)view;
                        if (object3 != null) {
                            Object object4 = object;
                            object4 = (RelativeLayout)object;
                            FragmentEditMediaMultipleBinding fragmentEditMediaMultipleBinding = new FragmentEditMediaMultipleBinding((RelativeLayout)object4, (LinearLayout)view2, (LinearLayout)view3, (ImageView)view4, (TextCustumFont)((Object)object2), (TextCustumFont)((Object)object3));
                            return fragmentEditMediaMultipleBinding;
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

    public static FragmentEditMediaMultipleBinding inflate(LayoutInflater layoutInflater) {
        return FragmentEditMediaMultipleBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentEditMediaMultipleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_edit_media_multiple;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentEditMediaMultipleBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

