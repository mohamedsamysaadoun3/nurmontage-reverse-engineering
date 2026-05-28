// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.fragment.EditMultipleEntityFragment$IEditMultipleCallback;

class EngineActivity$100 implements EditMultipleEntityFragment$IEditMultipleCallback
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$100(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onDelete() {
        EngineActivity.-$$Nest$mpausePlayer(this.this$0);
        this.this$0.dialogDeleteSelected();
    }
}
