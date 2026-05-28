// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import com.arthenica.ffmpegkit.Statistics;
import com.arthenica.ffmpegkit.StatisticsCallback;

class ProgressViewActivity$9 implements StatisticsCallback
{
    final /* synthetic */ ProgressViewActivity this$0;
    
    ProgressViewActivity$9(final ProgressViewActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void apply(final Statistics statistics) {
        ProgressViewActivity.-$$Nest$fputstatistics(this.this$0, statistics);
        final ProgressViewActivity this$0 = this.this$0;
        this$0.runOnUiThread(ProgressViewActivity.-$$Nest$fgetrunnableProgress(this$0));
    }
}
