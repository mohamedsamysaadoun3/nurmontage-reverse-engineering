// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class EngineActivity$60$2 implements Runnable
{
    final /* synthetic */ EngineActivity$60 this$1;
    final /* synthetic */ boolean val$b;
    
    EngineActivity$60$2(final EngineActivity$60 this$1, final boolean val$b) {
        this.this$1 = this$1;
        this.val$b = val$b;
    }
    
    public void run() {
        if (this.val$b) {
            EngineActivity.-$$Nest$mshowProgress(this.this$1.this$0);
        }
        else {
            EngineActivity.-$$Nest$mhideProgressFragment(this.this$1.this$0);
        }
    }
}
