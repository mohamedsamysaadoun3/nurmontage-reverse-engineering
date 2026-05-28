/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;

public final class RowAnimBinding
implements ViewBinding {
    public final ImageView animItem;
    public final ImageView ivDisable;
    private final RelativeLayout rootView;

    private RowAnimBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2) {
        this.rootView = relativeLayout;
        this.animItem = imageView;
        this.ivDisable = imageView2;
    }

    public static RowAnimBinding bind(View object) {
        ImageView imageView;
        int n = R$id.anim_item;
        ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)object, (int)n);
        if (imageView2 != null && (imageView = (ImageView)ViewBindings.findChildViewById((View)object, (int)(n = R$id.iv_disable))) != null) {
            object = (RelativeLayout)object;
            RowAnimBinding rowAnimBinding = new RowAnimBinding((RelativeLayout)object, imageView2, imageView);
            return rowAnimBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowAnimBinding inflate(LayoutInflater layoutInflater) {
        return RowAnimBinding.inflate(layoutInflater, null, false);
    }

    public static RowAnimBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.row_anim;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowAnimBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

