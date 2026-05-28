// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.net.Uri;
import com.arthenica.ffmpegkit.ReturnCode;
import com.arthenica.ffmpegkit.FFmpegSession;
import java.io.File;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;

class EngineActivity$85 implements FFmpegSessionCompleteCallback
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ File val$file;
    final /* synthetic */ int val$index;
    final /* synthetic */ int val$index_entity;
    final /* synthetic */ boolean val$isFromTemplate;
    final /* synthetic */ String val$path_video_copy;
    
    EngineActivity$85(final EngineActivity this$0, final int val$index, final File val$file, final boolean val$isFromTemplate, final String val$path_video_copy, final int val$index_entity) {
        this.this$0 = this$0;
        this.val$index = val$index;
        this.val$file = val$file;
        this.val$isFromTemplate = val$isFromTemplate;
        this.val$path_video_copy = val$path_video_copy;
        this.val$index_entity = val$index_entity;
    }
    
    public void apply(final FFmpegSession fFmpegSession) {
        if (ReturnCode.isSuccess(fFmpegSession.getReturnCode())) {
            EngineActivity.-$$Nest$fgetmTemplate(this.this$0).setExtension(EngineActivity.-$$Nest$fgetextentions(this.this$0)[this.val$index]);
            final Uri fromFile = Uri.fromFile(this.val$file);
            if (!this.val$isFromTemplate) {
                this.this$0.runOnUiThread((Runnable)new EngineActivity$85$1(this));
                EngineActivity.-$$Nest$maddUriAudioToQuranFragment(this.this$0, fromFile, this.val$path_video_copy);
            }
            else {
                EngineActivity.-$$Nest$maddAudioTemplateHttp(this.this$0, fromFile, this.val$index_entity, this.val$path_video_copy);
            }
        }
        else {
            final EngineActivity this$0 = this.this$0;
            EngineActivity.-$$Nest$fputstart_extenstion(this$0, EngineActivity.-$$Nest$fgetstart_extenstion(this$0) + 1);
            final EngineActivity this$2 = this.this$0;
            EngineActivity.-$$Nest$mextractAudioFromVideoRecursive(this$2, this.val$path_video_copy, EngineActivity.-$$Nest$fgetstart_extenstion(this$2), this.val$isFromTemplate, this.val$index);
        }
    }
}
