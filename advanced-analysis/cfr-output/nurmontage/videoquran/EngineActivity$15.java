/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.arthenica.ffmpegkit.FFmpegKit
 *  com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
 */
package hazem.nurmontage.videoquran;

import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$15$1;
import hazem.nurmontage.videoquran.Utils.AudioUtils$Callback;
import hazem.nurmontage.videoquran.Utils.FileUtils;
import hazem.nurmontage.videoquran.views.TrackEntityView;
import java.io.File;

class EngineActivity$15
implements AudioUtils$Callback {
    final /* synthetic */ EngineActivity this$0;

    EngineActivity$15(EngineActivity engineActivity) {
        this.this$0 = engineActivity;
    }

    public void onError(Exception exception) {
    }

    public void onSuccess(String object) {
        EngineActivity$15$1 engineActivity$15$1;
        String string2;
        EngineActivity.cfr_renamed_2(this.this$0).setUri_media_video((String)object);
        Object object2 = FileUtils.getFileVideo(EngineActivity.cfr_renamed_2(this.this$0).getFolder_template());
        File file = new File((File)object2, "frame_%04d.jpg");
        File file2 = new File((File)object2, "frame_0001.jpg");
        int n = EngineActivity.cfr_renamed_64(this.this$0).getHeight();
        object2 = this.this$0;
        Object object3 = EngineActivity.cfr_renamed_18((EngineActivity)((Object)object2));
        float f = (float)((TrackEntityView)((Object)object3)).getMaxTime() / 1000.0f;
        int n2 = Math.round(f);
        int n3 = 4;
        n2 = Math.min(n3, n2);
        EngineActivity.cfr_renamed_361((EngineActivity)((Object)object2), n2);
        object2 = this.this$0;
        int n4 = EngineActivity.cfr_renamed_297((EngineActivity)((Object)object2));
        if (n4 == 0) {
            object2 = this.this$0;
            EngineActivity.cfr_renamed_361((EngineActivity)((Object)object2), n3);
        }
        object2 = EngineActivity.cfr_renamed_296(this.this$0);
        String[] stringArray = new String[17];
        stringArray[0] = "-i";
        stringArray[1] = object;
        stringArray[2] = "-ss";
        stringArray[3] = string2 = "0";
        stringArray[n3] = "-t";
        object3 = new StringBuilder("");
        n3 = EngineActivity.cfr_renamed_297(this.this$0);
        stringArray[5] = object3 = ((StringBuilder)object3).append(n3).toString();
        stringArray[6] = "-r";
        stringArray[7] = "25";
        stringArray[8] = "-vf";
        object3 = new StringBuilder("scale=");
        stringArray[9] = object3 = ((StringBuilder)object3).append(n).append(":").append(n).append(":force_original_aspect_ratio=increase").toString();
        stringArray[10] = "-q:v";
        stringArray[11] = string2;
        stringArray[12] = "-threads";
        stringArray[13] = "4";
        stringArray[14] = "-an";
        stringArray[15] = "-y";
        Object object4 = file.getAbsolutePath();
        stringArray[16] = object4;
        object3 = engineActivity$15$1;
        object4 = this;
        string2 = object;
        engineActivity$15$1 = new EngineActivity$15$1(this, file2, n, (String)object, file);
        object = FFmpegKit.executeWithArgumentsAsync((String[])stringArray, (FFmpegSessionCompleteCallback)engineActivity$15$1).getSessionId();
        object2.add(object);
    }
}

