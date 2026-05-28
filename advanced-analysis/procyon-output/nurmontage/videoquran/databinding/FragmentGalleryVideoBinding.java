// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.databinding;

import hazem.nurmontage.videoquran.R$layout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.viewbinding.ViewBindings;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;

public final class FragmentGalleryVideoBinding implements ViewBinding
{
    private final FrameLayout rootView;
    public final RecyclerView rvGallery;
    
    private FragmentGalleryVideoBinding(final FrameLayout rootView, final RecyclerView rvGallery) {
        this.rootView = rootView;
        this.rvGallery = rvGallery;
    }
    
    public static FragmentGalleryVideoBinding bind(final View view) {
        final int rv_gallery = R$id.rv_gallery;
        final RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById(view, rv_gallery);
        if (recyclerView != null) {
            return new FragmentGalleryVideoBinding((FrameLayout)view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(rv_gallery)));
    }
    
    public static FragmentGalleryVideoBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentGalleryVideoBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_gallery_video, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
