// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;

class ProgressViewActivity$8 implements FFmpegSessionCompleteCallback
{
    final /* synthetic */ ProgressViewActivity this$0;
    
    ProgressViewActivity$8(final ProgressViewActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void apply(final FFmpegSession fFmpegSession) {
        this.this$0.runOnUiThread((Runnable)new ProgressViewActivity$8$1(this, fFmpegSession));
    }
}
