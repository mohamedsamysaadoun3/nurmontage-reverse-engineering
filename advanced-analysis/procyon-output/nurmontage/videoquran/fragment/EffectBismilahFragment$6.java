// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import hazem.nurmontage.videoquran.adabter.TransitionBismilahAdabters;

class EffectBismilahFragment$6 implements Runnable
{
    final /* synthetic */ EffectBismilahFragment this$0;
    
    EffectBismilahFragment$6(final EffectBismilahFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        final List inTransition = this.this$0.getInTransition();
        int index;
        if (EffectBismilahFragment.-$$Nest$fgettransition(this.this$0) != null && EffectBismilahFragment.-$$Nest$fgettransition(this.this$0).isIn()) {
            final EffectBismilahFragment this$0 = this.this$0;
            index = this$0.getIndex(inTransition, EffectBismilahFragment.-$$Nest$fgettransition(this$0).getType_in());
        }
        else {
            index = -1;
        }
        EffectBismilahFragment.-$$Nest$fputtransitionEntityAdabters(this.this$0, new TransitionBismilahAdabters(EffectBismilahFragment.-$$Nest$fgetiTransition(this.this$0), inTransition, index, EffectBismilahFragment.-$$Nest$fgetentityQuranTimeline(this.this$0)));
        EffectBismilahFragment.-$$Nest$fgetrecyclerView(this.this$0).setAdapter((RecyclerView$Adapter)EffectBismilahFragment.-$$Nest$fgettransitionEntityAdabters(this.this$0));
        final EffectBismilahFragment this$2 = this.this$0;
        this$2.scroll(EffectBismilahFragment.-$$Nest$fgettransitionEntityAdabters(this$2).getSelect());
    }
}
