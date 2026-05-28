// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Context;
import android.widget.Toast;

class EngineActivity$86$2 implements Runnable
{
    final /* synthetic */ EngineActivity$86 this$1;
    
    EngineActivity$86$2(final EngineActivity$86 this$1) {
        this.this$1 = this$1;
    }
    
    public void run() {
        EngineActivity.-$$Nest$mhideProgressFragment(this.this$1.this$0);
        EngineActivity.-$$Nest$mhideFragment(this.this$1.this$0);
        Toast.makeText((Context)this.this$1.this$0, (CharSequence)EngineActivity.-$$Nest$fgetmResources(this.this$1.this$0).getString(R$string.video_not_have_sound), 0).show();
    }
}
