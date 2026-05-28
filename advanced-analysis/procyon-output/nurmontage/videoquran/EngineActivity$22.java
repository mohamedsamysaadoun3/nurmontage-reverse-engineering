// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View;
import android.view.View$OnClickListener;

class EngineActivity$22 implements View$OnClickListener
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$22(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getCurrent_cursur_position() == 0) {
            return;
        }
        EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).setProgress(0.0f);
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        EngineActivity.-$$Nest$fputstartCursur(this.this$0, 0);
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).translateToStart();
        final EngineActivity this$0 = this.this$0;
        this$0.updateViewTime(EngineActivity.-$$Nest$fgettrackViewEntity(this$0).getMaxTime(), EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getCurrent_cursur_position());
        EngineActivity.-$$Nest$mupdateBtnToStart(this.this$0);
        EngineActivity.-$$Nest$mupdateBtnToEnd(this.this$0);
    }
}
