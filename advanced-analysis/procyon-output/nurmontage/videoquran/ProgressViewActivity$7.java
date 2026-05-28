// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class ProgressViewActivity$7 implements Runnable
{
    final /* synthetic */ ProgressViewActivity this$0;
    
    ProgressViewActivity$7(final ProgressViewActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        if (ProgressViewActivity.-$$Nest$fgetisDestroy(this.this$0)) {
            return;
        }
        final ProgressViewActivity this$0 = this.this$0;
        final float -$$Nest$fgetdisplayedProgress = ProgressViewActivity.-$$Nest$fgetdisplayedProgress(this$0);
        final float n = ProgressViewActivity.-$$Nest$fgettargetProgress(this.this$0) - ProgressViewActivity.-$$Nest$fgetdisplayedProgress(this.this$0);
        final float n2 = 0.1f;
        ProgressViewActivity.-$$Nest$fputdisplayedProgress(this$0, -$$Nest$fgetdisplayedProgress + n * n2);
        ProgressViewActivity.-$$Nest$fgetprogressIndicator(this.this$0).setProgress(Math.max(0, Math.min(Math.round(ProgressViewActivity.-$$Nest$fgetdisplayedProgress(this.this$0)), ProgressViewActivity.-$$Nest$fgetprogressIndicator(this.this$0).getMax())));
        if (Math.abs(ProgressViewActivity.-$$Nest$fgetdisplayedProgress(this.this$0) - ProgressViewActivity.-$$Nest$fgettargetProgress(this.this$0)) > n2) {
            ProgressViewActivity.-$$Nest$fgetuiHandler(this.this$0).postDelayed((Runnable)this, (long)16);
        }
        else {
            ProgressViewActivity.-$$Nest$fputisAnimating(this.this$0, false);
        }
    }
}
