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

class EngineActivity$51
implements MediaPlayer.OnPreparedListener {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ int val$index;
    final /* synthetic */ String val$path;
    final /* synthetic */ String val$pathPcm;
    final /* synthetic */ String val$path_video;
    final /* synthetic */ List val$pathes;
    final /* synthetic */ Uri val$uri;

    EngineActivity$51(EngineActivity engineActivity, int n, Uri uri, List list, String string2, String string3, String string4) {
        this.this$0 = engineActivity;
        this.val$index = n;
        this.val$uri = uri;
        this.val$pathes = list;
        this.val$path = string2;
        this.val$pathPcm = string3;
        this.val$path_video = string4;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            return;
        }
        int n = this.val$index;
        Object object = EngineActivity.cfr_renamed_2(this.this$0).getEntityMediaList();
        int n2 = object.size();
        if (n >= n2) {
            return;
        }
        List list = EngineActivity.cfr_renamed_2(this.this$0).getEntityMediaList();
        n2 = this.val$index;
        list = list.get(n2);
        Object object2 = list;
        object2 = (EntityMedia)((Object)list);
        object = this.this$0;
        int n3 = mediaPlayer.getDuration();
        Uri uri = this.val$uri;
        MediaPlayer mediaPlayer2 = EngineActivity.cfr_renamed_144(this.this$0);
        List list2 = this.val$pathes;
        int n4 = this.val$index;
        String string2 = this.val$path;
        String string3 = this.val$pathPcm;
        String string4 = this.val$path_video;
        EngineActivity.cfr_renamed_116((EngineActivity)((Object)object), (EntityMedia)object2, n3, uri, mediaPlayer2, list2, n4, string2, string3, string4);
    }
}

