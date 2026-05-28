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
import android.widget.ProgressBar;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;

public final class ActivityShareWithMeBinding implements ViewBinding
{
    public final FrameLayout main;
    public final ProgressBar progressHorizontal;
    private final FrameLayout rootView;
    
    private ActivityShareWithMeBinding(final FrameLayout rootView, final FrameLayout main, final ProgressBar progressHorizontal) {
        this.rootView = rootView;
        this.main = main;
        this.progressHorizontal = progressHorizontal;
    }
    
    public static ActivityShareWithMeBinding bind(final View view) {
        final FrameLayout frameLayout = (FrameLayout)view;
        final int progress_horizontal = R$id.progress_horizontal;
        final ProgressBar progressBar = (ProgressBar)ViewBindings.findChildViewById(view, progress_horizontal);
        if (progressBar != null) {
            return new ActivityShareWithMeBinding(frameLayout, frameLayout, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(progress_horizontal)));
    }
    
    public static ActivityShareWithMeBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityShareWithMeBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_share_with_me, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
