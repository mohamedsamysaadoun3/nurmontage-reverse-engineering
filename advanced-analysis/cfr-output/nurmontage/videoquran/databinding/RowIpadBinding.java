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

public final class RowIpadBinding
implements ViewBinding {
    public final View dot1;
    public final View dot2;
    public final ImageView img;
    public final ImageView ivPro;
    private final RelativeLayout rootView;
    public final LinearLayout viewOption;

    private RowIpadBinding(RelativeLayout relativeLayout, View view, View view2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout) {
        this.rootView = relativeLayout;
        this.dot1 = view;
        this.dot2 = view2;
        this.img = imageView;
        this.ivPro = imageView2;
        this.viewOption = linearLayout;
    }

    public static RowIpadBinding bind(View object) {
        View view;
        int n = R$id.dot1;
        View view2 = ViewBindings.findChildViewById((View)object, (int)n);
        if (view2 != null && (view = ViewBindings.findChildViewById((View)object, (int)(n = R$id.dot2))) != null) {
            Object object2;
            n = R$id.img;
            View view3 = object2 = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (ImageView)object2;
            if (view3 != null) {
                n = R$id.iv_pro;
                View view4 = object2 = ViewBindings.findChildViewById((View)object, (int)n);
                view4 = (ImageView)object2;
                if (view4 != null) {
                    n = R$id.view_option;
                    View view5 = object2 = ViewBindings.findChildViewById((View)object, (int)n);
                    view5 = (LinearLayout)object2;
                    if (view5 != null) {
                        RowIpadBinding rowIpadBinding;
                        Object object3 = object;
                        object3 = (RelativeLayout)object;
                        object2 = rowIpadBinding;
                        rowIpadBinding = new RowIpadBinding((RelativeLayout)object3, view2, view, (ImageView)view3, (ImageView)view4, (LinearLayout)view5);
                        return rowIpadBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowIpadBinding inflate(LayoutInflater layoutInflater) {
        return RowIpadBinding.inflate(layoutInflater, null, false);
    }

    public static RowIpadBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.row_ipad;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowIpadBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

