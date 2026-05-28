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
import android.widget.VideoView;
import android.widget.RelativeLayout;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;

public final class ActivityPlayVideoBinding implements ViewBinding
{
    public final ImageButton btnOnBack;
    public final RelativeLayout main;
    public final RelativeLayout parentLayout;
    private final RelativeLayout rootView;
    public final VideoView videoView;
    
    private ActivityPlayVideoBinding(final RelativeLayout rootView, final ImageButton btnOnBack, final RelativeLayout main, final RelativeLayout parentLayout, final VideoView videoView) {
        this.rootView = rootView;
        this.btnOnBack = btnOnBack;
        this.main = main;
        this.parentLayout = parentLayout;
        this.videoView = videoView;
    }
    
    public static ActivityPlayVideoBinding bind(final View view) {
        int n = R$id.btn_on_back;
        final ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById(view, n);
        if (imageButton != null) {
            final RelativeLayout relativeLayout = (RelativeLayout)view;
            n = R$id.parentLayout;
            final RelativeLayout relativeLayout2 = (RelativeLayout)ViewBindings.findChildViewById(view, n);
            if (relativeLayout2 != null) {
                n = R$id.videoView;
                final VideoView videoView = (VideoView)ViewBindings.findChildViewById(view, n);
                if (videoView != null) {
                    return new ActivityPlayVideoBinding(relativeLayout, imageButton, relativeLayout, relativeLayout2, videoView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static ActivityPlayVideoBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityPlayVideoBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_play_video, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
