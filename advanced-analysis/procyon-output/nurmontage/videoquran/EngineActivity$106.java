// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.Utils.SmoothVideoAnimator$FrameUpdateListener;

class EngineActivity$106 implements SmoothVideoAnimator$FrameUpdateListener
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$106(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onAnimationEnd() {
    }
    
    public void onFrameUpdate(final String s) {
        synchronized (EngineActivity.-$$Nest$fgetframeLock(this.this$0)) {
            EngineActivity.-$$Nest$fputpendingFramePath(this.this$0, s);
            if (!EngineActivity.-$$Nest$fgetisProcessingFrame(this.this$0)) {
                EngineActivity.-$$Nest$fputisProcessingFrame(this.this$0, true);
                EngineActivity.-$$Nest$fgetexecutor(this.this$0).execute(EngineActivity.-$$Nest$fgetframeProcessorRunnable(this.this$0));
            }
        }
    }
}
