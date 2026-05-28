// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class EffectBismilahFragment$5 implements View$OnClickListener
{
    final /* synthetic */ EffectBismilahFragment this$0;
    
    EffectBismilahFragment$5(final EffectBismilahFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (EffectBismilahFragment.-$$Nest$fgetiTransition(this.this$0) != null) {
            EffectBismilahFragment.-$$Nest$fgetiTransition(this.this$0).applyAll(EffectBismilahFragment.-$$Nest$fgetentityQuranTimeline(this.this$0));
            EffectBismilahFragment.-$$Nest$minvisibleApplyAll(this.this$0);
        }
    }
}
