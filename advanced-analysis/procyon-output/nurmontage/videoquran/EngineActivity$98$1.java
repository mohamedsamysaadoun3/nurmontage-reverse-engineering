// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class EngineActivity$98$1 implements Runnable
{
    final /* synthetic */ EngineActivity$98 this$1;
    
    EngineActivity$98$1(final EngineActivity$98 this$1) {
        this.this$1 = this$1;
    }
    
    public void run() {
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$1.this$0).deleteEntityAllSelect();
        this.this$1.this$0.runOnUiThread((Runnable)new EngineActivity$98$1$1(this));
    }
}
