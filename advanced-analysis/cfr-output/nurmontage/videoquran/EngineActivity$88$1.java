/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnPreparedListener
 *  com.arthenica.ffmpegkit.FFmpegKit
 *  com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
 */
package hazem.nurmontage.videoquran;

import android.media.MediaPlayer;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$88;
import hazem.nurmontage.videoquran.EngineActivity$88$1$1;
import hazem.nurmontage.videoquran.Utils.FileUtils;
import hazem.nurmontage.videoquran.model.Template;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import java.io.File;
import java.io.Serializable;

class EngineActivity$88$1
implements MediaPlayer.OnPreparedListener {
    final /* synthetic */ EngineActivity$88 this$1;
    final /* synthetic */ String val$path;

    EngineActivity$88$1(EngineActivity$88 engineActivity$88, String string2) {
        this.this$1 = engineActivity$88;
        this.val$path = string2;
    }

    public void onPrepared(MediaPlayer object) {
        Object object2;
        if (object == null) {
            return;
        }
        Object object3 = EngineActivity.cfr_renamed_64(this.this$1.this$0);
        int n = object3.getHeight();
        Serializable serializable = EngineActivity.cfr_renamed_2(this.this$1.this$0);
        int n2 = 1;
        ((Template)serializable).setVideoSquare(n2 != 0);
        EngineActivity.cfr_renamed_64(this.this$1.this$0).setVideo(n2 != 0);
        EngineActivity.cfr_renamed_2(this.this$1.this$0).setName_drawable(null);
        serializable = EngineActivity.cfr_renamed_2(this.this$1.this$0);
        Object object4 = this.this$1.val$uri.toString();
        ((Template)serializable).setUri_original_upload_video((String)object4);
        serializable = EngineActivity.cfr_renamed_2(this.this$1.this$0);
        object4 = this.val$path;
        ((Template)serializable).setUri_media_video((String)object4);
        serializable = EngineActivity.cfr_renamed_2(this.this$1.this$0);
        int n3 = object.getDuration() / 1000;
        ((Template)serializable).setDuration_video_media(n3);
        object = FileUtils.getFileVideo(EngineActivity.cfr_renamed_2(this.this$1.this$0).getFolder_template());
        serializable = new File((File)object, "frame_%04d.jpg");
        object4 = new File((File)object, "frame_0001.jpg");
        object = EngineActivity.cfr_renamed_2(this.this$1.this$0);
        Object object5 = ((File)object4).getAbsolutePath();
        ((Template)object).setFrame_bg((String)object5);
        object = this.this$1.this$0;
        object5 = EngineActivity.cfr_renamed_18(this.this$1.this$0);
        float f = (float)((TrackEntityView)((Object)object5)).getMaxTime() / 1000.0f;
        int n4 = Math.round(f);
        int n5 = 3;
        n4 = Math.min(n4, n5);
        EngineActivity.cfr_renamed_361((EngineActivity)((Object)object), n4);
        object = this.this$1.this$0;
        n3 = EngineActivity.cfr_renamed_297((EngineActivity)((Object)object));
        if (n3 == 0) {
            object = this.this$1.this$0;
            EngineActivity.cfr_renamed_361((EngineActivity)((Object)object), n5);
        }
        object = EngineActivity.cfr_renamed_296(this.this$1.this$0);
        object5 = new String[17];
        object5[0] = "-i";
        String string2 = this.val$path;
        object5[n2] = string2;
        object5[2] = "-ss";
        object5[n5] = object2 = "0";
        object5[4] = "-t";
        CharSequence charSequence = new StringBuilder("");
        int n6 = EngineActivity.cfr_renamed_297(this.this$1.this$0);
        charSequence = ((StringBuilder)charSequence).append(n6).toString();
        object5[5] = charSequence;
        object5[6] = "-r";
        object5[7] = "25";
        object5[8] = "-vf";
        charSequence = new StringBuilder("scale=");
        charSequence = ((StringBuilder)charSequence).append(n).append(":").append(n).append(":force_original_aspect_ratio=increase").toString();
        object5[9] = charSequence;
        object5[10] = "-q:v";
        object5[11] = object2;
        object5[12] = "-threads";
        object5[13] = "4";
        object5[14] = "-an";
        object5[15] = "-y";
        charSequence = ((File)serializable).getAbsolutePath();
        object5[16] = charSequence;
        object2 = new EngineActivity$88$1$1(this, (File)object4, n, (File)serializable);
        object3 = FFmpegKit.executeWithArgumentsAsync((String[])object5, (FFmpegSessionCompleteCallback)object2).getSessionId();
        object.add(object3);
    }
}

