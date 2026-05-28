// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.widget.LinearLayout;
import com.arthenica.ffmpegkit.FFmpegSession;

class ProgressViewActivity$10 implements Runnable
{
    final /* synthetic */ ProgressViewActivity this$0;
    final /* synthetic */ FFmpegSession val$fFmpegSession;
    
    ProgressViewActivity$10(final ProgressViewActivity this$0, final FFmpegSession val$fFmpegSession) {
        this.this$0 = this$0;
        this.val$fFmpegSession = val$fFmpegSession;
    }
    
    public void run() {
        final StringBuilder sb = new StringBuilder();
        if (ProgressViewActivity.-$$Nest$fgetoverlay(this.this$0) != null) {
            sb.append((CharSequence)ProgressViewActivity.-$$Nest$fgetoverlay(this.this$0)).append("\n");
        }
        final String output = this.val$fFmpegSession.getOutput();
        if (output != null) {
            sb.append(output);
        }
        final LinearLayout linearLayout = (LinearLayout)this.this$0.findViewById(R$id.layout_error);
        linearLayout.post((Runnable)new ProgressViewActivity$10$1(this, linearLayout, sb));
    }
}
