/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;

public final class FragmentGalleryVideoBinding
implements ViewBinding {
    private final FrameLayout rootView;
    public final RecyclerView rvGallery;

    private FragmentGalleryVideoBinding(FrameLayout frameLayout, RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.rvGallery = recyclerView;
    }

    public static FragmentGalleryVideoBinding bind(View object) {
        int n = R$id.rv_gallery;
        RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)object, (int)n);
        if (recyclerView != null) {
            object = (FrameLayout)object;
            FragmentGalleryVideoBinding fragmentGalleryVideoBinding = new FragmentGalleryVideoBinding((FrameLayout)object, recyclerView);
            return fragmentGalleryVideoBinding;
        }
        object = object.getResources().getResourceName(n);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentGalleryVideoBinding inflate(LayoutInflater layoutInflater) {
        return FragmentGalleryVideoBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentGalleryVideoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.fragment_gallery_video;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentGalleryVideoBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

