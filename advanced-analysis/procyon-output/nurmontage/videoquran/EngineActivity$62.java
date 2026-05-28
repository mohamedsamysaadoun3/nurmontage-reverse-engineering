// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.widget.ImageButton;
import android.graphics.PorterDuff$Mode;

class EngineActivity$62 implements Runnable
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$62(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        EngineActivity.-$$Nest$fgetbtnRedo(this.this$0).setColorFilter(-1, PorterDuff$Mode.SRC_IN);
        final ImageButton -$$Nest$fgetbtnRedo = EngineActivity.-$$Nest$fgetbtnRedo(this.this$0);
        final boolean b = true;
        -$$Nest$fgetbtnRedo.setEnabled(b);
        EngineActivity.-$$Nest$fgetbtnRedo(this.this$0).setClickable(b);
    }
}
