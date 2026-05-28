// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.net.Uri;
import com.arthenica.ffmpegkit.ReturnCode;
import com.arthenica.ffmpegkit.FFmpegSession;
import java.io.File;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;

class EngineActivity$84 implements FFmpegSessionCompleteCallback
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ File val$file;
    final /* synthetic */ int val$index;
    final /* synthetic */ String val$path_video_copy;
    
    EngineActivity$84(final EngineActivity this$0, final File val$file, final int val$index, final String val$path_video_copy) {
        this.this$0 = this$0;
        this.val$file = val$file;
        this.val$index = val$index;
        this.val$path_video_copy = val$path_video_copy;
    }
    
    public void apply(final FFmpegSession fFmpegSession) {
        if (ReturnCode.isSuccess(fFmpegSession.getReturnCode())) {
            EngineActivity.-$$Nest$maddAudioTemplateHttp(this.this$0, Uri.fromFile(this.val$file), this.val$index, this.val$path_video_copy);
        }
    }
}
