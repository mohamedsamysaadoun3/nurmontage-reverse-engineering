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

public final class RowFeatureBinding
implements ViewBinding {
    public final ImageView btnRadioYear;
    public final ImageView ivCheck;
    public final ImageView ivCheckFree;
    public final View line;
    private final LinearLayout rootView;
    public final TextCustumFont tvFeature;
    public final RelativeLayout view;

    private RowFeatureBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, View view, TextCustumFont textCustumFont, RelativeLayout relativeLayout) {
        this.rootView = linearLayout;
        this.btnRadioYear = imageView;
        this.ivCheck = imageView2;
        this.ivCheckFree = imageView3;
        this.line = view;
        this.tvFeature = textCustumFont;
        this.view = relativeLayout;
    }

    public static RowFeatureBinding bind(View object) {
        View view;
        int n = R$id.btn_radio_year;
        View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        view2 = (ImageView)view;
        if (view2 != null) {
            n = R$id.iv_check;
            View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            view3 = (ImageView)view;
            if (view3 != null) {
                View view4;
                n = R$id.iv_check_free;
                View view5 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view5 = (ImageView)view;
                if (view5 != null && (view4 = ViewBindings.findChildViewById((View)object, (int)(n = R$id.line))) != null) {
                    n = R$id.tv_feature;
                    Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    object2 = (TextCustumFont)view;
                    if (object2 != null) {
                        n = R$id.view;
                        View view6 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        view6 = (RelativeLayout)view;
                        if (view6 != null) {
                            Object object3 = object;
                            object3 = (LinearLayout)object;
                            RowFeatureBinding rowFeatureBinding = new RowFeatureBinding((LinearLayout)object3, (ImageView)view2, (ImageView)view3, (ImageView)view5, view4, (TextCustumFont)((Object)object2), (RelativeLayout)view6);
                            return rowFeatureBinding;
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

    public static RowFeatureBinding inflate(LayoutInflater layoutInflater) {
        return RowFeatureBinding.inflate(layoutInflater, null, false);
    }

    public static RowFeatureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.row_feature;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowFeatureBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

