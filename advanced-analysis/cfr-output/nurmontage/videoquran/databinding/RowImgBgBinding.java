/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;

public final class RowImgBgBinding
implements ViewBinding {
    public final ImageView img;
    private final FrameLayout rootView;
    public final ImageView thumbnailYtb;

    private RowImgBgBinding(FrameLayout frameLayout, ImageView imageView, ImageView imageView2) {
        this.rootView = frameLayout;
        this.img = imageView;
        this.thumbnailYtb = imageView2;
    }

    public static RowImgBgBinding bind(View object) {
        ImageView imageView;
        int n = R$id.img;
        ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)object, (int)n);
        if (imageView2 != null && (imageView = (ImageView)ViewBindings.findChildViewById((View)object, (int)(n = R$id.thumbnail_ytb))) != null) {
            object = (FrameLayout)object;
            RowImgBgBinding rowImgBgBinding = new RowImgBgBinding((FrameLayout)object, imageView2, imageView);
            return rowImgBgBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowImgBgBinding inflate(LayoutInflater layoutInflater) {
        return RowImgBgBinding.inflate(layoutInflater, null, false);
    }

    public static RowImgBgBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.row_img_bg;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowImgBgBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

