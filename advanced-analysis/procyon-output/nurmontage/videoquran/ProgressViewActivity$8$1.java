// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import com.arthenica.ffmpegkit.ReturnCode;
import com.arthenica.ffmpegkit.FFmpegSession;

class ProgressViewActivity$8$1 implements Runnable
{
    final /* synthetic */ ProgressViewActivity$8 this$1;
    final /* synthetic */ FFmpegSession val$session;
    
    ProgressViewActivity$8$1(final ProgressViewActivity$8 this$1, final FFmpegSession val$session) {
        this.this$1 = this$1;
        this.val$session = val$session;
    }
    
    public void run() {
        ProgressViewActivity.-$$Nest$mcancelDialog(this.this$1.this$0);
        if (ProgressViewActivity.-$$Nest$fgetrenderManager(this.this$1.this$0) != null) {
            ProgressViewActivity.-$$Nest$fgetrenderManager(this.this$1.this$0).nextTask();
        }
        if (ReturnCode.isSuccess(this.val$session.getReturnCode())) {
            ProgressViewActivity.-$$Nest$mcompleteProgress(this.this$1.this$0);
        }
        else {
            ProgressViewActivity.-$$Nest$mshowError(this.this$1.this$0, this.val$session);
        }
    }
}
