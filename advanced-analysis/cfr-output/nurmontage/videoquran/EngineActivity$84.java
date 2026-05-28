/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  com.arthenica.ffmpegkit.FFmpegSession
 *  com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
 *  com.arthenica.ffmpegkit.ReturnCode
 */
package hazem.nurmontage.videoquran;

import android.net.Uri;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.ReturnCode;
import hazem.nurmontage.videoquran.EngineActivity;
import java.io.File;

class EngineActivity$84
implements FFmpegSessionCompleteCallback {
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ File val$file;
    final /* synthetic */ int val$index;
    final /* synthetic */ String val$path_video_copy;

    EngineActivity$84(EngineActivity engineActivity, File file, int n, String string2) {
        this.this$0 = engineActivity;
        this.val$file = file;
        this.val$index = n;
        this.val$path_video_copy = string2;
    }

    public void apply(FFmpegSession fFmpegSession) {
        boolean bl = ReturnCode.isSuccess((ReturnCode)(fFmpegSession = fFmpegSession.getReturnCode()));
        if (bl) {
            fFmpegSession = Uri.fromFile((File)this.val$file);
            EngineActivity engineActivity = this.this$0;
            int n = this.val$index;
            String string2 = this.val$path_video_copy;
            EngineActivity.cfr_renamed_7(engineActivity, (Uri)fFmpegSession, n, string2);
        }
    }
}

