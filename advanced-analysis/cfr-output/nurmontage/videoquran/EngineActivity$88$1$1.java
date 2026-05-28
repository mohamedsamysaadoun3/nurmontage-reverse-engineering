/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.arthenica.ffmpegkit.FFmpegKit
 *  com.arthenica.ffmpegkit.FFmpegSession
 *  com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
 */
package hazem.nurmontage.videoquran;

import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import hazem.nurmontage.videoquran.EngineActivity;
import hazem.nurmontage.videoquran.EngineActivity$88$1;
import hazem.nurmontage.videoquran.EngineActivity$88$1$1$1;
import hazem.nurmontage.videoquran.EngineActivity$88$1$1$2;
import java.io.File;

class EngineActivity$88$1$1
implements FFmpegSessionCompleteCallback {
    final /* synthetic */ EngineActivity$88$1 this$2;
    final /* synthetic */ File val$file;
    final /* synthetic */ File val$file_frame;
    final /* synthetic */ int val$max;

    EngineActivity$88$1$1(EngineActivity$88$1 engineActivity$88$1, File file, int n, File file2) {
        this.this$2 = engineActivity$88$1;
        this.val$file = file;
        this.val$max = n;
        this.val$file_frame = file2;
    }

    public void apply(FFmpegSession object) {
        object = this.this$2.this$1.this$0;
        Object object2 = this.val$file.getAbsolutePath();
        EngineActivity.cfr_renamed_399((EngineActivity)((Object)object), (String)object2);
        object = this.this$2.this$1.this$0;
        object2 = new EngineActivity$88$1$1$1(this);
        object.runOnUiThread((Runnable)object2);
        object = EngineActivity.cfr_renamed_296(this.this$2.this$1.this$0);
        object2 = new String[17];
        object2[0] = "-i";
        Object object3 = this.this$2.val$path;
        object2[1] = object3;
        object2[2] = "-ss";
        String string2 = "";
        object3 = new StringBuilder(string2);
        int n = EngineActivity.cfr_renamed_297(this.this$2.this$1.this$0);
        object3 = ((StringBuilder)object3).append(n).toString();
        object2[3] = object3;
        object2[4] = "-r";
        object2[5] = "25";
        object2[6] = "-vf";
        object3 = new StringBuilder("scale=");
        n = this.val$max;
        object3 = ((StringBuilder)object3).append(n).append(":");
        n = this.val$max;
        object3 = ((StringBuilder)object3).append(n).append(":force_original_aspect_ratio=increase").toString();
        object2[7] = object3;
        object2[8] = "-start_number";
        object3 = new StringBuilder(string2);
        int n2 = EngineActivity.cfr_renamed_297(this.this$2.this$1.this$0) * 25;
        object3 = ((StringBuilder)object3).append(n2).toString();
        object2[9] = object3;
        object2[10] = "-q:v";
        object2[11] = "0";
        object2[12] = "-threads";
        object2[13] = "4";
        object2[14] = "-an";
        object2[15] = "-y";
        object3 = this.val$file_frame.getAbsolutePath();
        object2[16] = object3;
        object3 = new EngineActivity$88$1$1$2(this);
        object2 = FFmpegKit.executeWithArgumentsAsync((String[])object2, (FFmpegSessionCompleteCallback)object3).getSessionId();
        object.add(object2);
    }
}

