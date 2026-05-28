// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class EngineActivity$58$2 implements Runnable
{
    final /* synthetic */ EngineActivity$58 this$1;
    
    EngineActivity$58$2(final EngineActivity$58 this$1) {
        this.this$1 = this$1;
    }
    
    public void run() {
        EngineActivity.-$$Nest$mhideProgressFragment(this.this$1.this$0);
        if (EngineActivity.-$$Nest$fgetiEditMediaCallback(this.this$1.this$0) != null) {
            EngineActivity.-$$Nest$fgetiEditMediaCallback(this.this$1.this$0).onDone();
        }
    }
}
