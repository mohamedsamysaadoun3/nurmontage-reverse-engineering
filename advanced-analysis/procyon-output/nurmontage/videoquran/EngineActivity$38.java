// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.app.Activity;
import hazem.nurmontage.videoquran.Utils.ScreenUtils;

class EngineActivity$38 implements Runnable
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$38(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        final int screenWidth = ScreenUtils.getScreenWidth((Activity)this.this$0);
        final float second_in_screen = screenWidth * 0.12f;
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).setSecond_in_screen(second_in_screen);
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).setSecond_in_screen(second_in_screen, 0, screenWidth);
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).setMaxTime(0);
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).init(screenWidth, EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getHeight());
        EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).setPosCursur(EngineActivity.-$$Nest$fgetmTemplate(this.this$0).getCurrentCursur());
        final EngineActivity this$0 = this.this$0;
        EngineActivity.-$$Nest$fputstartCursur(this$0, EngineActivity.-$$Nest$fgettrackViewEntity(this$0).getCurrent_cursur_position());
        final EngineActivity this$2 = this.this$0;
        this$2.updateViewTime(EngineActivity.-$$Nest$fgettrackViewEntity(this$2).getMaxTime(), EngineActivity.-$$Nest$fgettrackViewEntity(this.this$0).getCurrent_cursur_position());
    }
}
