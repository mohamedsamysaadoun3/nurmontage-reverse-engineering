// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import androidx.activity.OnBackPressedCallback;

class EngineActivity$1 extends OnBackPressedCallback
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$1(final EngineActivity this$0, final boolean b) {
        this.this$0 = this$0;
        super(b);
    }
    
    public void handleOnBackPressed() {
        if (EngineActivity.-$$Nest$fgetmCurrentFragment(this.this$0) != null) {
            EngineActivity.-$$Nest$mhideFragment(this.this$0);
            return;
        }
        this.this$0.dialog();
    }
}
