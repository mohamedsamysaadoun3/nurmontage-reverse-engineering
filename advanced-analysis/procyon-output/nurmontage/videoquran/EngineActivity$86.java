// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.net.Uri;
import com.arthenica.ffmpegkit.FFmpegSession;
import java.io.File;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;

class EngineActivity$86 implements FFmpegSessionCompleteCallback
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ File val$file;
    final /* synthetic */ boolean val$isFromTemplate;
    final /* synthetic */ String val$path_video_copy;
    
    EngineActivity$86(final EngineActivity this$0, final File val$file, final boolean val$isFromTemplate, final String val$path_video_copy) {
        this.this$0 = this$0;
        this.val$file = val$file;
        this.val$isFromTemplate = val$isFromTemplate;
        this.val$path_video_copy = val$path_video_copy;
    }
    
    public void apply(final FFmpegSession fFmpegSession) {
        if (fFmpegSession == null) {
            this.this$0.runOnUiThread((Runnable)new EngineActivity$86$1(this));
            return;
        }
        if (fFmpegSession.getReturnCode().isValueSuccess()) {
            final Uri fromFile = Uri.fromFile(this.val$file);
            EngineActivity.-$$Nest$fgetmTemplate(this.this$0).setExtension(".mp3");
            if (!this.val$isFromTemplate) {
                EngineActivity.-$$Nest$maddUriAudioToQuranFragment(this.this$0, fromFile, this.val$path_video_copy);
            }
            else {
                EngineActivity.-$$Nest$maddAudioTemplateHttp(this.this$0, fromFile, 0, this.val$path_video_copy);
            }
        }
        else {
            this.this$0.runOnUiThread((Runnable)new EngineActivity$86$2(this));
        }
    }
}
