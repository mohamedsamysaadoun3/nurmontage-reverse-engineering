/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 */
package hazem.nurmontage.videoquran;

import android.media.MediaPlayer;
import hazem.nurmontage.videoquran.PlayVideoActivity;

class PlayVideoActivity$2
implements MediaPlayer.OnCompletionListener {
    final /* synthetic */ PlayVideoActivity this$0;

    PlayVideoActivity$2(PlayVideoActivity playVideoActivity) {
        this.this$0 = playVideoActivity;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        boolean bl;
        mediaPlayer = PlayVideoActivity.cfr_renamed_369(this.this$0);
        if (mediaPlayer != null && !(bl = (mediaPlayer = PlayVideoActivity.cfr_renamed_369(this.this$0)).isShowing())) {
            mediaPlayer = PlayVideoActivity.cfr_renamed_369(this.this$0);
            mediaPlayer.show();
        }
    }
}

