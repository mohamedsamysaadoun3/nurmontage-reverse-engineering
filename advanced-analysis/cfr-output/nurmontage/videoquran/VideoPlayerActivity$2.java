/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.media3.common.PlaybackException
 *  androidx.media3.common.Player$Listener
 */
package hazem.nurmontage.videoquran;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import hazem.nurmontage.videoquran.VideoPlayerActivity;

class VideoPlayerActivity$2
implements Player.Listener {
    final /* synthetic */ VideoPlayerActivity this$0;

    VideoPlayerActivity$2(VideoPlayerActivity videoPlayerActivity) {
        this.this$0 = videoPlayerActivity;
    }

    public void onPlayerError(PlaybackException playbackException) {
        VideoPlayerActivity.cfr_renamed_512(this.this$0);
    }
}

