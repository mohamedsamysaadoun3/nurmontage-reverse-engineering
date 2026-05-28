// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Context;
import android.widget.Toast;

class EngineActivity$65$5 implements Runnable
{
    final /* synthetic */ EngineActivity$65 this$1;
    
    EngineActivity$65$5(final EngineActivity$65 this$1) {
        this.this$1 = this$1;
    }
    
    public void run() {
        Toast.makeText((Context)this.this$1.this$0, (CharSequence)EngineActivity.-$$Nest$fgetmResources(this.this$1.this$0).getString(R$string.error_limit), 0).show();
    }
}
