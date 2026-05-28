// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class EngineActivity$27 implements Runnable
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$27(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        if (EngineActivity.-$$Nest$fgetmTemplate(this.this$0).isVideoSquare()) {
            EngineActivity.-$$Nest$minitTypeVideo(this.this$0);
        }
        else {
            EngineActivity.-$$Nest$miniTypeImg(this.this$0);
        }
    }
}
