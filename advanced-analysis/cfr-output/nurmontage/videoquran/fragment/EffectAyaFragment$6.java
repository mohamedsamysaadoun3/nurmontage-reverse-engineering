/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 */
package hazem.nurmontage.videoquran.fragment;

import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.Utils.BillingPreferences;
import hazem.nurmontage.videoquran.adabter.TransitionEntityAdabters;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment;
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment$ITransition;
import hazem.nurmontage.videoquran.model.Transition;
import java.util.List;

class EffectAyaFragment$6
implements Runnable {
    final /* synthetic */ EffectAyaFragment this$0;

    EffectAyaFragment$6(EffectAyaFragment effectAyaFragment) {
        this.this$0 = effectAyaFragment;
    }

    public void run() {
        TransitionEntityAdabters transitionEntityAdabters;
        Object object;
        int n;
        List list = this.this$0.getInTransition();
        Object object2 = EffectAyaFragment.cfr_renamed_191(this.this$0);
        if (object2 != null && (n = (int)(((Transition)(object2 = EffectAyaFragment.cfr_renamed_191(this.this$0))).isIn() ? 1 : 0)) != 0) {
            object2 = this.this$0;
            object = EffectAyaFragment.cfr_renamed_191((EffectAyaFragment)((Object)object2)).getType_in();
            n = ((EffectAyaFragment)((Object)object2)).getIndex(list, (String)object);
        } else {
            n = -1;
        }
        object2 = this.this$0;
        boolean bl = BillingPreferences.isSubscribed(this.this$0.getContext());
        EffectAyaFragment$ITransition effectAyaFragment$ITransition = EffectAyaFragment.cfr_renamed_173(this.this$0);
        EntityQuranTimeline entityQuranTimeline = EffectAyaFragment.cfr_renamed_174(this.this$0);
        object = transitionEntityAdabters;
        transitionEntityAdabters = new TransitionEntityAdabters(bl, effectAyaFragment$ITransition, list, n, entityQuranTimeline);
        EffectAyaFragment.cfr_renamed_195((EffectAyaFragment)((Object)object2), transitionEntityAdabters);
        object2 = EffectAyaFragment.cfr_renamed_93(this.this$0);
        object = EffectAyaFragment.cfr_renamed_192(this.this$0);
        object2.setAdapter((RecyclerView.Adapter)object);
        object2 = this.this$0;
        int n2 = EffectAyaFragment.cfr_renamed_192((EffectAyaFragment)((Object)object2)).getSelect();
        ((EffectAyaFragment)((Object)object2)).scroll(n2);
    }
}

