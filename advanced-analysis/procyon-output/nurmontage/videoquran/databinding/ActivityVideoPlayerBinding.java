// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.databinding;

import hazem.nurmontage.videoquran.R$layout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import androidx.media3.ui.PlayerView;
import androidx.viewbinding.ViewBinding;

public final class ActivityVideoPlayerBinding implements ViewBinding
{
    public final PlayerView playerView;
    private final PlayerView rootView;
    
    private ActivityVideoPlayerBinding(final PlayerView rootView, final PlayerView playerView) {
        this.rootView = rootView;
        this.playerView = playerView;
    }
    
    public static ActivityVideoPlayerBinding bind(final View view) {
        if (view != null) {
            final PlayerView playerView = (PlayerView)view;
            return new ActivityVideoPlayerBinding(playerView, playerView);
        }
        throw new NullPointerException("rootView");
    }
    
    public static ActivityVideoPlayerBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static ActivityVideoPlayerBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R$layout.activity_video_player, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public PlayerView getRoot() {
        return this.rootView;
    }
}
