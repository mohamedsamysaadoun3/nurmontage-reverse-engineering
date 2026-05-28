// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class EngineActivity$52$1 implements Runnable
{
    final /* synthetic */ EngineActivity$52 this$1;
    
    EngineActivity$52$1(final EngineActivity$52 this$1) {
        this.this$1 = this$1;
    }
    
    public void run() {
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$1.this$0).invalidate();
        EngineActivity.-$$Nest$mhideProgressFragment(this.this$1.this$0);
        EngineActivity.-$$Nest$mhideFragment(this.this$1.this$0);
    }
}
