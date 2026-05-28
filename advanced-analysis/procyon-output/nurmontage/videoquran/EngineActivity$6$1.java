// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class EngineActivity$6$1 implements Runnable
{
    final /* synthetic */ EngineActivity$6 this$1;
    
    EngineActivity$6$1(final EngineActivity$6 this$1) {
        this.this$1 = this$1;
    }
    
    public void run() {
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$1.this$0).invalidate();
        EngineActivity.-$$Nest$mupdateTime(this.this$1.this$0);
        if (EngineActivity.-$$Nest$fgetmTemplate(this.this$1.this$0).getQuranEntityList().isEmpty()) {
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$1.this$0).invalidate();
        }
        EngineActivity.-$$Nest$mcancelDialogInternet(this.this$1.this$0);
        EngineActivity.-$$Nest$mhideProgressFragment(this.this$1.this$0);
    }
}
