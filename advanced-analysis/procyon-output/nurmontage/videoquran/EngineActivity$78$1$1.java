// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class EngineActivity$78$1$1 implements Runnable
{
    final /* synthetic */ EngineActivity$78$1 this$2;
    
    EngineActivity$78$1$1(final EngineActivity$78$1 this$2) {
        this.this$2 = this$2;
    }
    
    public void run() {
        if (EngineActivity.-$$Nest$fgettrackViewEntity(this.this$2.this$1.this$0).getCurrent_cursur_position() > EngineActivity.-$$Nest$fgettrackViewEntity(this.this$2.this$1.this$0).getMaxTime()) {
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$2.this$1.this$0).invalidate();
        }
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$2.this$1.this$0).invalidate();
        EngineActivity.-$$Nest$mupdateTime(this.this$2.this$1.this$0);
    }
}
