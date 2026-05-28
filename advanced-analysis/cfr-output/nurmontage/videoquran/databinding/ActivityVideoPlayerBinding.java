/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.media3.ui.PlayerView
 *  androidx.viewbinding.ViewBinding
 */
package hazem.nurmontage.videoquran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerView;
import androidx.viewbinding.ViewBinding;
import hazem.nurmontage.videoquran.R$layout;

public final class ActivityVideoPlayerBinding
implements ViewBinding {
    public final PlayerView playerView;
    private final PlayerView rootView;

    private ActivityVideoPlayerBinding(PlayerView playerView, PlayerView playerView2) {
        this.rootView = playerView;
        this.playerView = playerView2;
    }

    public static ActivityVideoPlayerBinding bind(View object) {
        if (object != null) {
            object = (PlayerView)object;
            ActivityVideoPlayerBinding activityVideoPlayerBinding = new ActivityVideoPlayerBinding((PlayerView)object, (PlayerView)object);
            return activityVideoPlayerBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ActivityVideoPlayerBinding inflate(LayoutInflater layoutInflater) {
        return ActivityVideoPlayerBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityVideoPlayerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        int n = R$layout.activity_video_player;
        layoutInflater = layoutInflater.inflate(n, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityVideoPlayerBinding.bind((View)layoutInflater);
    }

    public PlayerView getRoot() {
        return this.rootView;
    }
}

