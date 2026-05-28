// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.widget.ImageButton;
import android.graphics.PorterDuff$Mode;

class EngineActivity$61 implements Runnable
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$61(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        EngineActivity.-$$Nest$fgetbtnUndo(this.this$0).setColorFilter(-1, PorterDuff$Mode.SRC_IN);
        final ImageButton -$$Nest$fgetbtnUndo = EngineActivity.-$$Nest$fgetbtnUndo(this.this$0);
        final boolean b = true;
        -$$Nest$fgetbtnUndo.setEnabled(b);
        EngineActivity.-$$Nest$fgetbtnUndo(this.this$0).setClickable(b);
    }
}
