/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran.fragment;

import android.view.View;
import hazem.nurmontage.videoquran.entity_timeline.EntityQuranTimeline;
import hazem.nurmontage.videoquran.fragment.EffectAyaFragment;

class EffectAyaFragment$4
implements View.OnClickListener {
    final /* synthetic */ EffectAyaFragment this$0;

    EffectAyaFragment$4(EffectAyaFragment effectAyaFragment) {
        this.this$0 = effectAyaFragment;
    }

    public void onClick(View object) {
        object = EffectAyaFragment.cfr_renamed_173(this.this$0);
        if (object != null) {
            object = EffectAyaFragment.cfr_renamed_173(this.this$0);
            EntityQuranTimeline entityQuranTimeline = EffectAyaFragment.cfr_renamed_174(this.this$0);
            object.onHideFragment(entityQuranTimeline);
        }
    }
}

