// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class EngineActivity$48$1 implements Runnable
{
    final /* synthetic */ EngineActivity$48 this$1;
    
    EngineActivity$48$1(final EngineActivity$48 this$1) {
        this.this$1 = this$1;
    }
    
    public void run() {
        EngineActivity.-$$Nest$mupdateTime(this.this$1.this$0);
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$1.this$0).invalidate();
        EngineActivity.-$$Nest$mhideProgressFragment(this.this$1.this$0);
    }
}
