/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.net.Uri
 */
package hazem.nurmontage.videoquran;

import android.media.MediaPlayer;
import android.net.Uri;
import hazem.nurmontage.videoquran.EngineActivity;
import java.util.List;

class EngineActivity$44
implements MediaPlayer.OnPreparedListener {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ int val$index;
    final /* synthetic */ List val$recitersModels;
    final /* synthetic */ Uri val$uri;

    EngineActivity$44(EngineActivity engineActivity, Uri uri, List list, int n) {
        this.this$0 = engineActivity;
        this.val$uri = uri;
        this.val$recitersModels = list;
        this.val$index = n;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            EngineActivity.cfr_renamed_13(this.this$0);
            return;
        }
        EngineActivity engineActivity = this.this$0;
        int n = mediaPlayer.getDuration();
        Uri uri = this.val$uri;
        List list = this.val$recitersModels;
        int n2 = this.val$index;
        EngineActivity.cfr_renamed_118(engineActivity, n, uri, mediaPlayer, list, n2);
    }
}

