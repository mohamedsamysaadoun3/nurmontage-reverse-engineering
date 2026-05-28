// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class EngineActivity$13 implements Runnable
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$13(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).invalidate();
        EngineActivity.-$$Nest$mupdateTime(this.this$0);
        if (EngineActivity.-$$Nest$fgetmTemplate(this.this$0).getQuranEntityList().isEmpty()) {
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).invalidate();
        }
        EngineActivity.-$$Nest$mhideProgressFragment(this.this$0);
    }
}
