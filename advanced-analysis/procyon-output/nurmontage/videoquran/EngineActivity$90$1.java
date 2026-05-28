// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class EngineActivity$90$1 implements Runnable
{
    final /* synthetic */ EngineActivity$90 this$1;
    
    EngineActivity$90$1(final EngineActivity$90 this$1) {
        this.this$1 = this$1;
    }
    
    public void run() {
        if (!EngineActivity.-$$Nest$fgetisOnScroll(this.this$1.this$0)) {
            EngineActivity.-$$Nest$fgetblurredImageView(this.this$1.this$0).setDrawingSquareVideo(true);
        }
        EngineActivity.-$$Nest$fgetblurredImageView(this.this$1.this$0).invalidate();
    }
}
