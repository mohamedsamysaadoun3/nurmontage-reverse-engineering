// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.model.QuranEntity;
import hazem.nurmontage.videoquran.entity_timeline.Entity;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.fragment.EditTextFragment$IEdiTextCallback;

class EngineActivity$103 implements EditTextFragment$IEdiTextCallback
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$103(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onDone(final EntityQuranTimeline entityQuranTimeline) {
        EngineActivity.-$$Nest$msetupHideFragment(this.this$0);
        if (entityQuranTimeline != null) {
            EngineActivity.-$$Nest$mshowEditEntity(this.this$0, (Entity)entityQuranTimeline);
        }
    }
    
    public void onUpdate(final QuranEntity quranEntity) {
        EngineActivity.-$$Nest$fgetblurredImageView(this.this$0).postInvalidate();
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).postInvalidate();
    }
}
