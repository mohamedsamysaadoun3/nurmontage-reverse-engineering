// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import android.view.View$OnClickListener;

class EffectAyaFragment$4 implements View$OnClickListener
{
    final /* synthetic */ EffectAyaFragment this$0;
    
    EffectAyaFragment$4(final EffectAyaFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        if (EffectAyaFragment.-$$Nest$fgetiTransition(this.this$0) != null) {
            EffectAyaFragment.-$$Nest$fgetiTransition(this.this$0).onHideFragment(EffectAyaFragment.-$$Nest$fgetentityQuranTimeline(this.this$0));
        }
    }
}
