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

public final class RowColorBinding
implements ViewBinding {
    public final ImageView image;
    public final ImageView layer;
    private final FrameLayout rootView;

    private RowColorBinding(FrameLayout frameLayout, ImageView imageView, ImageView imageView2) {
        this.rootView = frameLayout;
        this.image = imageView;
        this.layer = imageView2;
    }

    public static RowColorBinding bind(View object) {
        ImageView imageView;
        int n = R$id.image;
        ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)object, (int)n);
        if (imageView2 != null && (imageView = (ImageView)ViewBindings.findChildViewById((View)object, (int)(n = R$id.layer))) != null) {
            object = (FrameLayout)object;
            RowColorBinding rowColorBinding = new RowColorBinding((FrameLayout)object, imageView2, imageView);
            return rowColorBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowColorBinding inflate(LayoutInflater layoutInflater) {
        return RowColorBinding.inflate(layoutInflater, null, false);
    }

    public static RowColorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.row_color;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowColorBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

