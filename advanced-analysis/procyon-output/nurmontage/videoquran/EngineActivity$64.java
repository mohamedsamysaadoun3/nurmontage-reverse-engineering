// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.graphics.PorterDuff$Mode;

class EngineActivity$64 implements Runnable
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$64(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        EngineActivity.-$$Nest$fgetbtnUndo(this.this$0).setColorFilter(-8355712, PorterDuff$Mode.SRC_IN);
        EngineActivity.-$$Nest$fgetbtnUndo(this.this$0).setEnabled(false);
        EngineActivity.-$$Nest$fgetbtnUndo(this.this$0).setClickable(false);
    }
}
