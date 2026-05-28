// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class EngineActivity$56 implements Runnable
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$56(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).invalidate();
        EngineActivity.-$$Nest$mhideProgressFragment(this.this$0);
        if (EngineActivity.-$$Nest$fgetiEditMediaCallback(this.this$0) != null) {
            EngineActivity.-$$Nest$fgetiEditMediaCallback(this.this$0).onDone();
        }
    }
}
