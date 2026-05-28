// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.net.Uri;
import com.arthenica.ffmpegkit.FFmpegSession;
import java.io.File;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;

class EngineActivity$66$1$1 implements FFmpegSessionCompleteCallback
{
    final /* synthetic */ EngineActivity$66$1 this$2;
    final /* synthetic */ File val$file;
    
    EngineActivity$66$1$1(final EngineActivity$66$1 this$2, final File val$file) {
        this.this$2 = this$2;
        this.val$file = val$file;
    }
    
    public void apply(final FFmpegSession fFmpegSession) {
        EngineActivity.-$$Nest$maddAudioTemplate(this.this$2.this$1.this$0, Uri.fromFile(this.val$file), this.this$2.this$1.val$pathes, this.this$2.this$1.val$index, this.this$2.val$outputFile.getAbsolutePath(), this.this$2.val$outputFilePcm.getAbsolutePath(), this.this$2.this$1.val$path_video);
    }
}
