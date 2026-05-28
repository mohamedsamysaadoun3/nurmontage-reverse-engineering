// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View;
import android.view.View$OnClickListener;

class EngineActivity$17 implements View$OnClickListener
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$17(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (EngineActivity.-$$Nest$fgetlayout_resolution(this.this$0) == null) {
            return;
        }
        if (EngineActivity.-$$Nest$fgetlayout_resolution(this.this$0).getVisibility() != 0) {
            EngineActivity.-$$Nest$fgetlayout_resolution(this.this$0).setVisibility(0);
        }
        else {
            EngineActivity.-$$Nest$fgetlayout_resolution(this.this$0).setVisibility(8);
        }
    }
}
