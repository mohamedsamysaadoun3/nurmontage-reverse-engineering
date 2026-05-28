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
import hazem.nurmontage.videoquran.model.EntityMedia;
import java.util.List;

class EngineActivity$40
implements MediaPlayer.OnPreparedListener {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ EntityMedia val$entityMedia;
    final /* synthetic */ int val$index;
    final /* synthetic */ String val$path;
    final /* synthetic */ String val$path_video;
    final /* synthetic */ Uri val$uri;

    EngineActivity$40(EngineActivity engineActivity, EntityMedia entityMedia, Uri uri, int n, String string2, String string3) {
        this.this$0 = engineActivity;
        this.val$entityMedia = entityMedia;
        this.val$uri = uri;
        this.val$index = n;
        this.val$path = string2;
        this.val$path_video = string3;
    }

    public void onPrepared(MediaPlayer object) {
        if (object == null) {
            return;
        }
        EngineActivity engineActivity = this.this$0;
        EntityMedia entityMedia = this.val$entityMedia;
        int n = object.getDuration();
        Uri uri = this.val$uri;
        EntityMedia entityMedia2 = this.val$entityMedia;
        List list = entityMedia2.getPaths_https();
        int n2 = this.val$index;
        String string2 = this.val$path;
        String string3 = this.val$path_video;
        entityMedia2 = object;
        try {
            EngineActivity.cfr_renamed_116(engineActivity, entityMedia, n, uri, object, list, n2, string2, string3);
        }
        catch (Exception exception) {
            object = this.this$0;
            EngineActivity.cfr_renamed_13((EngineActivity)((Object)object));
        }
    }
}

