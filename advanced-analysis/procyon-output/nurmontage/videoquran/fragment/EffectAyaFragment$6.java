// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import hazem.nurmontage.videoquran.adabter.TransitionEntityAdabters;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;

class EffectAyaFragment$6 implements Runnable
{
    final /* synthetic */ EffectAyaFragment this$0;
    
    EffectAyaFragment$6(final EffectAyaFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void run() {
        final List inTransition = this.this$0.getInTransition();
        int index;
        if (EffectAyaFragment.-$$Nest$fgettransition(this.this$0) != null && EffectAyaFragment.-$$Nest$fgettransition(this.this$0).isIn()) {
            final EffectAyaFragment this$0 = this.this$0;
            index = this$0.getIndex(inTransition, EffectAyaFragment.-$$Nest$fgettransition(this$0).getType_in());
        }
        else {
            index = -1;
        }
        EffectAyaFragment.-$$Nest$fputtransitionEntityAdabters(this.this$0, new TransitionEntityAdabters(BillingPreferences.isSubscribed(this.this$0.getContext()), EffectAyaFragment.-$$Nest$fgetiTransition(this.this$0), inTransition, index, EffectAyaFragment.-$$Nest$fgetentityQuranTimeline(this.this$0)));
        EffectAyaFragment.-$$Nest$fgetrecyclerView(this.this$0).setAdapter((RecyclerView$Adapter)EffectAyaFragment.-$$Nest$fgettransitionEntityAdabters(this.this$0));
        final EffectAyaFragment this$2 = this.this$0;
        this$2.scroll(EffectAyaFragment.-$$Nest$fgettransitionEntityAdabters(this$2).getSelect());
    }
}
