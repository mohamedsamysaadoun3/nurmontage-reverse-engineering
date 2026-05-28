// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.fragment.ProgressViewFragment;

class EngineActivity$42 implements Runnable
{
    final /* synthetic */ EngineActivity this$0;
    final /* synthetic */ int val$p;
    final /* synthetic */ int val$size;
    
    EngineActivity$42(final EngineActivity this$0, final int val$p, final int val$size) {
        this.this$0 = this$0;
        this.val$p = val$p;
        this.val$size = val$size;
    }
    
    public void run() {
        if (ProgressViewFragment.instance != null) {
            ProgressViewFragment.instance.update(this.val$p, this.val$size);
        }
    }
}
