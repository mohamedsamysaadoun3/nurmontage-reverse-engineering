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

class EffectAyaFragment$5
implements View.OnClickListener {
    final /* synthetic */ EffectAyaFragment this$0;

    EffectAyaFragment$5(EffectAyaFragment effectAyaFragment) {
        this.this$0 = effectAyaFragment;
    }

    public void onClick(View object) {
        object = EffectAyaFragment.cfr_renamed_173(this.this$0);
        if (object != null) {
            object = EffectAyaFragment.cfr_renamed_173(this.this$0);
            EffectAyaFragment effectAyaFragment = this.this$0;
            int n = EffectAyaFragment.cfr_renamed_190(effectAyaFragment);
            EntityQuranTimeline entityQuranTimeline = EffectAyaFragment.cfr_renamed_174(this.this$0);
            object.applyAll(n, entityQuranTimeline);
            object = this.this$0;
            EffectAyaFragment.cfr_renamed_175((EffectAyaFragment)((Object)object));
        }
    }
}

