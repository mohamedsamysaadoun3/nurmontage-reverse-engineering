// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class EngineActivity$107 implements Runnable
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$107(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        while (true) {
            Object o = EngineActivity.-$$Nest$fgetframeLock(this.this$0);
            synchronized (o) {
                if (EngineActivity.-$$Nest$fgetpendingFramePath(this.this$0) == null) {
                    EngineActivity.-$$Nest$fputisProcessingFrame(this.this$0, false);
                    return;
                }
                final String -$$Nest$fgetpendingFramePath = EngineActivity.-$$Nest$fgetpendingFramePath(this.this$0);
                EngineActivity.-$$Nest$fputpendingFramePath(this.this$0, (String)null);
                monitorexit(o);
                o = this.this$0;
                EngineActivity.-$$Nest$mprocessFrame((EngineActivity)o, -$$Nest$fgetpendingFramePath);
            }
        }
    }
}
