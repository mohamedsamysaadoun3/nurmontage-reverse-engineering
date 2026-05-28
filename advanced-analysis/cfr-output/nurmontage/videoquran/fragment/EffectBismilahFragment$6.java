/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 */
package hazem.nurmontage.videoquran.fragment;

import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.adabter.TransitionBismilahAdabters;
import hazem.nurmontage.videoquran.entity_timeline.EntityBismilahTimeline;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment;
import hazem.nurmontage.videoquran.fragment.EffectBismilahFragment$ITransition;
import java.util.List;

class EffectBismilahFragment$6
implements Runnable {
    final /* synthetic */ EffectBismilahFragment this$0;

    EffectBismilahFragment$6(EffectBismilahFragment effectBismilahFragment) {
        this.this$0 = effectBismilahFragment;
    }

    public void run() {
        Object object;
        int n;
        Object object2 = this.this$0.getInTransition();
        Object object3 = EffectBismilahFragment.cfr_renamed_191(this.this$0);
        if (object3 != null && (n = (int)((object3 = EffectBismilahFragment.cfr_renamed_191(this.this$0)).isIn() ? 1 : 0)) != 0) {
            object3 = this.this$0;
            object = EffectBismilahFragment.cfr_renamed_191((EffectBismilahFragment)((Object)object3)).getType_in();
            n = ((EffectBismilahFragment)((Object)object3)).getIndex((List)object2, (String)object);
        } else {
            n = -1;
        }
        object = this.this$0;
        EffectBismilahFragment$ITransition effectBismilahFragment$ITransition = EffectBismilahFragment.cfr_renamed_173(this.this$0);
        EntityBismilahTimeline entityBismilahTimeline = EffectBismilahFragment.cfr_renamed_174(this.this$0);
        TransitionBismilahAdabters transitionBismilahAdabters = new TransitionBismilahAdabters(effectBismilahFragment$ITransition, (List)object2, n, entityBismilahTimeline);
        EffectBismilahFragment.cfr_renamed_195(object, transitionBismilahAdabters);
        object2 = EffectBismilahFragment.cfr_renamed_93(this.this$0);
        object3 = EffectBismilahFragment.cfr_renamed_192(this.this$0);
        object2.setAdapter((RecyclerView.Adapter)object3);
        object2 = this.this$0;
        n = EffectBismilahFragment.cfr_renamed_192((EffectBismilahFragment)((Object)object2)).getSelect();
        ((EffectBismilahFragment)((Object)object2)).scroll(n);
    }
}

