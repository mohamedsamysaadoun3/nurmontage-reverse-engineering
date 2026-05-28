// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.net.Uri;

class ProgressViewActivity$6 implements Runnable
{
    final /* synthetic */ ProgressViewActivity this$0;
    
    ProgressViewActivity$6(final ProgressViewActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        if (ProgressViewActivity.-$$Nest$fgetisCancel(this.this$0)) {
            return;
        }
        final ProgressViewActivity this$0 = this.this$0;
        final float -$$Nest$fgetdisplayedProgress = ProgressViewActivity.-$$Nest$fgetdisplayedProgress(this$0);
        final float -$$Nest$fgetdisplayedProgress2 = ProgressViewActivity.-$$Nest$fgetdisplayedProgress(this.this$0);
        final float n = 100.0f;
        ProgressViewActivity.-$$Nest$fputdisplayedProgress(this$0, -$$Nest$fgetdisplayedProgress + (n - -$$Nest$fgetdisplayedProgress2) * 0.45f);
        final int round = Math.round(ProgressViewActivity.-$$Nest$fgetdisplayedProgress(this.this$0));
        int n2 = 0;
        ProgressViewActivity.-$$Nest$fgetprogressIndicator(this.this$0).setProgress(Math.min(Math.max(round, 0), ProgressViewActivity.-$$Nest$fgetprogressIndicator(this.this$0).getMax()));
        final float n3 = fcmpl((float)ProgressViewActivity.-$$Nest$fgetprogressIndicator(this.this$0).getProgress(), n);
        final int n4 = 1;
        int n5;
        if (n3 >= 0) {
            n5 = n4;
        }
        else {
            n5 = 0;
        }
        if (Math.abs(ProgressViewActivity.-$$Nest$fgetdisplayedProgress(this.this$0) - n) < 0.1f) {
            n2 = n4;
        }
        if (n5 == 0 && n2 == 0) {
            ProgressViewActivity.-$$Nest$fgetuiHandler(this.this$0).postDelayed((Runnable)this, (long)16);
            return;
        }
        ProgressViewActivity.-$$Nest$fgetprogressIndicator(this.this$0).setProgress(100);
        ProgressViewActivity.-$$Nest$fputdisplayedProgress(this.this$0, n);
        ProgressViewActivity.-$$Nest$fputtargetProgress(this.this$0, n);
        final ProgressViewActivity this$2 = this.this$0;
        ProgressViewActivity.-$$Nest$minsertToGallery(this$2, Uri.parse(ProgressViewActivity.-$$Nest$fgetmUri(this$2)));
        ProgressViewActivity.-$$Nest$mtoShare(this.this$0);
    }
}
