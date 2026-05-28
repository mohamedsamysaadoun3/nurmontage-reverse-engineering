// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.fragment.ResizeFragment;
import hazem.nurmontage.videoquran.constant.ResizeType;
import hazem.nurmontage.videoquran.adabter.DimensionAdabters$IDimensionCallback;

class EngineActivity$78 implements DimensionAdabters$IDimensionCallback
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$78(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void done() {
        EngineActivity.-$$Nest$mhideFragment(this.this$0);
    }
    
    public void isCustomSize(final boolean b, final ResizeType resizeType) {
    }
    
    public void onCustumSize(int geTypeResize, final int n, final int n2, final String s, final int n3) {
        this.this$0.updateHitRatio(n2, s);
        geTypeResize = EngineActivity.-$$Nest$fgetmTemplate(this.this$0).geTypeResize();
        if (n2 == geTypeResize) {
            return;
        }
        if (ResizeFragment.instance != null) {
            ResizeFragment.instance.scrollToSelectedPosition();
        }
        EngineActivity.-$$Nest$mshowProgressSimple(this.this$0);
        EngineActivity.-$$Nest$fgetexecutor(this.this$0).execute(new EngineActivity$78$1(this, n2, s));
    }
}
