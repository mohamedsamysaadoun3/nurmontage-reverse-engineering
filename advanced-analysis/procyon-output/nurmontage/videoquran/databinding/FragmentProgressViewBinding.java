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
import hazem.nurmontage.videoquran.views.TextCustumFont;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;

public final class FragmentProgressViewBinding implements ViewBinding
{
    public final ProgressBar progressHorizontal;
    private final FrameLayout rootView;
    public final TextCustumFont tvProgress;
    public final FrameLayout view1;
    public final FrameLayout view2;
    public final FrameLayout viewProgress;
    
    private FragmentProgressViewBinding(final FrameLayout rootView, final ProgressBar progressHorizontal, final TextCustumFont tvProgress, final FrameLayout view1, final FrameLayout view2, final FrameLayout viewProgress) {
        this.rootView = rootView;
        this.progressHorizontal = progressHorizontal;
        this.tvProgress = tvProgress;
        this.view1 = view1;
        this.view2 = view2;
        this.viewProgress = viewProgress;
    }
    
    public static FragmentProgressViewBinding bind(final View view) {
        int n = R$id.progress_horizontal;
        final ProgressBar progressBar = (ProgressBar)ViewBindings.findChildViewById(view, n);
        if (progressBar != null) {
            n = R$id.tv_progress;
            final TextCustumFont textCustumFont = (TextCustumFont)ViewBindings.findChildViewById(view, n);
            if (textCustumFont != null) {
                n = R$id.view_1;
                final FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById(view, n);
                if (frameLayout != null) {
                    n = R$id.view_2;
                    final FrameLayout frameLayout2 = (FrameLayout)ViewBindings.findChildViewById(view, n);
                    if (frameLayout2 != null) {
                        final FrameLayout frameLayout3 = (FrameLayout)view;
                        return new FragmentProgressViewBinding(frameLayout3, progressBar, textCustumFont, frameLayout, frameLayout2, frameLayout3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static FragmentProgressViewBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static FragmentProgressViewBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.fragment_progress_view, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
