// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

class EngineActivity$47 implements Runnable
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$47(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).calculMaxTime();
        final EngineActivity this$0 = this.this$0;
        this$0.updateViewTime(EngineActivity.-$$Nest$fgettrackViewEntity(this$0).getMaxTime(), EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getCurrent_cursur_position());
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).translateToEnd();
        EngineActivity.-$$Nest$mupdateTimeToEndAya(this.this$0);
        EngineActivity.-$$Nest$mupdateBtnToEnd(this.this$0);
        EngineActivity.-$$Nest$mupdateBtnToStart(this.this$0);
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).invalidate();
        EngineActivity.-$$Nest$mhideProgressFragment(this.this$0);
        EngineActivity.-$$Nest$mhideFragment(this.this$0);
    }
}
