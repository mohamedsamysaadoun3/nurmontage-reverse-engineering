// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View;
import android.view.View$OnClickListener;

class EngineActivity$23 implements View$OnClickListener
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$23(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        EngineActivity.-$$Nest$mshowProgressSimple(this.this$0);
        new Thread(new EngineActivity$23$1(this)).start();
    }
}
