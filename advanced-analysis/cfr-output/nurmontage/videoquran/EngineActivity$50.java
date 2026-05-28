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

class EngineActivity$50
implements MediaPlayer.OnPreparedListener {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ int val$index;
    final /* synthetic */ String val$pathPCM;
    final /* synthetic */ List val$pathes;
    final /* synthetic */ Uri val$uri;

    EngineActivity$50(EngineActivity engineActivity, Uri uri, List list, int n, String string2) {
        this.this$0 = engineActivity;
        this.val$uri = uri;
        this.val$pathes = list;
        this.val$index = n;
        this.val$pathPCM = string2;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            return;
        }
        EngineActivity engineActivity = this.this$0;
        int n = mediaPlayer.getDuration();
        Uri uri = this.val$uri;
        List list = this.val$pathes;
        int n2 = this.val$index;
        String string2 = this.val$pathPCM;
        EngineActivity.cfr_renamed_394(engineActivity, n, uri, list, n2, string2);
    }
}

