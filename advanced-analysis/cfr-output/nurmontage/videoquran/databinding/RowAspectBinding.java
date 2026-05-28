/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.views.TextCustumFont;

public final class RowAspectBinding
implements ViewBinding {
    public final TextCustumFont aspectName;
    public final TextCustumFont aspectSize;
    public final RelativeLayout container;
    public final ImageView icon;
    public final FrameLayout layout;
    private final LinearLayout rootView;

    private RowAspectBinding(LinearLayout linearLayout, TextCustumFont textCustumFont, TextCustumFont textCustumFont2, RelativeLayout relativeLayout, ImageView imageView, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.aspectName = textCustumFont;
        this.aspectSize = textCustumFont2;
        this.container = relativeLayout;
        this.icon = imageView;
        this.layout = frameLayout;
    }

    public static RowAspectBinding bind(View object) {
        View view;
        int n = R$id.aspect_name;
        Object object2 = view = ViewBindings.findChildViewById((View)object, (int)n);
        object2 = (TextCustumFont)view;
        if (object2 != null) {
            n = R$id.aspect_size;
            Object object3 = view = ViewBindings.findChildViewById((View)object, (int)n);
            object3 = (TextCustumFont)view;
            if (object3 != null) {
                n = R$id.container;
                View view2 = view = ViewBindings.findChildViewById((View)object, (int)n);
                view2 = (RelativeLayout)view;
                if (view2 != null) {
                    n = R$id.icon;
                    View view3 = view = ViewBindings.findChildViewById((View)object, (int)n);
                    view3 = (ImageView)view;
                    if (view3 != null) {
                        n = R$id.layout;
                        View view4 = view = ViewBindings.findChildViewById((View)object, (int)n);
                        view4 = (FrameLayout)view;
                        if (view4 != null) {
                            Object object4 = object;
                            object4 = (LinearLayout)object;
                            RowAspectBinding rowAspectBinding = new RowAspectBinding((LinearLayout)object4, (TextCustumFont)((Object)object2), (TextCustumFont)((Object)object3), (RelativeLayout)view2, (ImageView)view3, (FrameLayout)view4);
                            return rowAspectBinding;
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

    public static RowAspectBinding inflate(LayoutInflater layoutInflater) {
        return RowAspectBinding.inflate(layoutInflater, null, false);
    }

    public static RowAspectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.row_aspect;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowAspectBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

