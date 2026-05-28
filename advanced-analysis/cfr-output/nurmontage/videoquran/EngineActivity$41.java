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
import hazem.nurmontage.videoquran.EngineActivity$41$1;
import hazem.nurmontage.videoquran.EngineActivity$41$2;

class EngineActivity$41
implements MediaPlayer.OnPreparedListener {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ Uri val$uri_audio;
    final /* synthetic */ String val$video_original;

    EngineActivity$41(EngineActivity engineActivity, Uri uri, String string2) {
        this.this$0 = engineActivity;
        this.val$uri_audio = uri;
        this.val$video_original = string2;
    }

    public void onPrepared(MediaPlayer object) {
        if (object == null) {
            return;
        }
        Object object2 = this.this$0;
        int n = object.getDuration();
        Uri uri = this.val$uri_audio;
        String string2 = this.val$video_original;
        EngineActivity.cfr_renamed_551(object2, n, uri, string2);
        object = this.this$0;
        object2 = new EngineActivity$41$1(this);
        try {
            object.runOnUiThread((Runnable)object2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            object = this.this$0;
            object2 = new EngineActivity$41$2(this);
            object.runOnUiThread((Runnable)object2);
        }
    }
}

